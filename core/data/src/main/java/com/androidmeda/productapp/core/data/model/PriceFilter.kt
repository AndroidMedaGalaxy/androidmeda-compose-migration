package com.androidmeda.productapp.core.data.model

data class PriceFilter(
    val minPrice: Double = 0.0,
    val maxPrice: Double = 500.0
)

data class ProductFilter(
    val categories: Set<ProductCategory> = emptySet(),
    val priceRange: PriceFilter = PriceFilter()
)