package com.androidmeda.productapp.core.data.repository

import com.androidmeda.productapp.core.data.model.Product

interface ProductRepository {
    suspend fun getProducts(): Result<List<Product>>
    suspend fun getProductById(id: String): Result<Product>
    suspend fun searchProducts(query: String): Result<List<Product>>
}