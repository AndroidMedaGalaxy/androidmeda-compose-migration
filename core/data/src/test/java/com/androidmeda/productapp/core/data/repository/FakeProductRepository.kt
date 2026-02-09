package com.androidmeda.productapp.core.data.repository

import com.androidmeda.productapp.core.data.FakeProductData
import com.androidmeda.productapp.core.data.model.Product

/**
 * Fake implementation of ProductRepository for testing.
 * No mocks - just a simple, controllable fake for unit tests.
 */
class FakeProductRepository(
    private val shouldReturnError: Boolean = false,
    private val customProducts: List<Product>? = null
) : ProductRepository {

    private val products = customProducts ?: FakeProductData.products

    override suspend fun getProducts(): Result<List<Product>> {
        return if (shouldReturnError) {
            Result.failure(Exception("Failed to load products"))
        } else {
            Result.success(products)
        }
    }

    override suspend fun getProductById(id: String): Result<Product> {
        return if (shouldReturnError) {
            Result.failure(Exception("Failed to load product"))
        } else {
            val product = products.firstOrNull { it.id == id }
            if (product != null) {
                Result.success(product)
            } else {
                Result.failure(Exception("Product not found"))
            }
        }
    }

    override suspend fun searchProducts(query: String): Result<List<Product>> {
        return if (shouldReturnError) {
            Result.failure(Exception("Search failed"))
        } else {
            val filtered = products.filter { product ->
                product.name.contains(query, ignoreCase = true) ||
                product.description.contains(query, ignoreCase = true) ||
                product.category.displayName.contains(query, ignoreCase = true)
            }
            Result.success(filtered)
        }
    }
}