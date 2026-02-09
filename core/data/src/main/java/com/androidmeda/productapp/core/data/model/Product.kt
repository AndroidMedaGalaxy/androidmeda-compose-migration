package com.androidmeda.productapp.core.data.model

data class Product(
    val id: String,
    val name: String,
    val price: Double,
    val description: String,
    val imageRes: String, // Will map to drawable resource name
    val category: ProductCategory,
    val rating: Float = 4.0f,
    val inStock: Boolean = true
)

enum class ProductCategory(val displayName: String) {
    ELECTRONICS("Electronics"),
    AUDIO("Audio"),
    WEARABLES("Wearables"),
    ACCESSORIES("Accessories"),
    COMPUTING("Computing")
}