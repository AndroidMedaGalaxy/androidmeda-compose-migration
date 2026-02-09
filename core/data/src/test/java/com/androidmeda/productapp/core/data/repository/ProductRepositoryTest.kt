package com.androidmeda.productapp.core.data.repository

import com.androidmeda.productapp.core.data.model.Product
import com.androidmeda.productapp.core.data.model.ProductCategory
import com.google.common.truth.Truth.assertThat
import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Test

class ProductRepositoryTest {

    private lateinit var repository: ProductRepository

    @Before
    fun setup() {
        repository = FakeProductRepository()
    }

    @Test
    fun `getProducts returns success with products`() = runTest {
        val result = repository.getProducts()
        
        assertThat(result.isSuccess).isTrue()
        assertThat(result.getOrNull()).isNotEmpty()
    }

    @Test
    fun `getProducts returns error when configured`() = runTest {
        repository = FakeProductRepository(shouldReturnError = true)
        
        val result = repository.getProducts()
        
        assertThat(result.isFailure).isTrue()
    }

    @Test
    fun `getProductById returns correct product`() = runTest {
        val result = repository.getProductById("1")
        
        assertThat(result.isSuccess).isTrue()
        assertThat(result.getOrNull()?.id).isEqualTo("1")
        assertThat(result.getOrNull()?.name).isEqualTo("Wireless Headphones")
    }

    @Test
    fun `getProductById returns error for invalid id`() = runTest {
        val result = repository.getProductById("invalid_id")
        
        assertThat(result.isFailure).isTrue()
    }

    @Test
    fun `searchProducts filters by name correctly`() = runTest {
        val result = repository.searchProducts("Wireless")
        
        assertThat(result.isSuccess).isTrue()
        val products = result.getOrNull()!!
        assertThat(products).isNotEmpty()
        assertThat(products.all { it.name.contains("Wireless", ignoreCase = true) }).isTrue()
    }

    @Test
    fun `searchProducts filters by category correctly`() = runTest {
        val result = repository.searchProducts("Audio")
        
        assertThat(result.isSuccess).isTrue()
        val products = result.getOrNull()!!
        assertThat(products).isNotEmpty()
        assertThat(products.all { it.category == ProductCategory.AUDIO }).isTrue()
    }

    @Test
    fun `searchProducts returns empty list for no matches`() = runTest {
        val result = repository.searchProducts("NonExistentProduct")
        
        assertThat(result.isSuccess).isTrue()
        assertThat(result.getOrNull()).isEmpty()
    }

    @Test
    fun `searchProducts returns error when configured`() = runTest {
        repository = FakeProductRepository(shouldReturnError = true)
        
        val result = repository.searchProducts("test")
        
        assertThat(result.isFailure).isTrue()
    }
}