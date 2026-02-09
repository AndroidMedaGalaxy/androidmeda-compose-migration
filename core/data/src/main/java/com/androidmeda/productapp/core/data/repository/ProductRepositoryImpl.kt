package com.androidmeda.productapp.core.data.repository

import com.androidmeda.productapp.core.data.FakeProductData
import com.androidmeda.productapp.core.data.model.Product
import kotlinx.coroutines.delay
import kotlin.random.Random

class ProductRepositoryImpl(
    private val shouldSimulateError: Boolean = false,
    private val delayMillis: Long = 1500
) : ProductRepository {

    override suspend fun getProducts(): Result<List<Product>> {
        delay(delayMillis)
        
        return if (shouldSimulateError && Random.nextFloat() < 0.3f) {
            Result.failure(Exception("Failed to load products. Please check your connection."))
        } else {
            Result.success(FakeProductData.products)
        }
    }

    override suspend fun getProductById(id: String): Result<Product> {
        delay(1000)
        
        return try {
            val product = FakeProductData.products.first { it.id == id }
            Result.success(product)
        } catch (e: NoSuchElementException) {
            Result.failure(Exception("Product not found"))
        }
    }

    override suspend fun searchProducts(query: String): Result<List<Product>> {
        delay(500)
        
        val filtered = FakeProductData.products.filter { product ->
            product.name.contains(query, ignoreCase = true) ||
            product.description.contains(query, ignoreCase = true) ||
            product.category.displayName.contains(query, ignoreCase = true)
        }
        
        return Result.success(filtered)
    }
}