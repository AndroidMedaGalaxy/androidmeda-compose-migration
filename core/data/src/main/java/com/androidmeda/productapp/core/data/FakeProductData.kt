package com.androidmeda.productapp.core.data

import com.androidmeda.productapp.core.data.model.Product
import com.androidmeda.productapp.core.data.model.ProductCategory

object FakeProductData {
    val products = listOf(
        Product(
            id = "1",
            name = "Wireless Headphones",
            price = 99.99,
            description = "Premium noise-canceling wireless headphones with 30-hour battery life. Crystal clear sound and comfortable design for all-day wear.",
            imageRes = "product_headphones",
            category = ProductCategory.AUDIO,
            rating = 4.5f
        ),
        Product(
            id = "2",
            name = "Bluetooth Speaker",
            price = 79.99,
            description = "Portable waterproof Bluetooth speaker with 360° sound. Perfect for outdoor adventures with 12-hour battery life.",
            imageRes = "product_speaker",
            category = ProductCategory.AUDIO,
            rating = 4.3f
        ),
        Product(
            id = "3",
            name = "Smart Watch",
            price = 299.99,
            description = "Feature-rich smartwatch with health tracking, GPS, and smartphone notifications. Stay connected on the go.",
            imageRes = "product_smartwatch",
            category = ProductCategory.WEARABLES,
            rating = 4.7f
        ),
        Product(
            id = "4",
            name = "Fitness Tracker",
            price = 149.99,
            description = "Advanced fitness tracker with heart rate monitoring, sleep tracking, and water resistance. Achieve your fitness goals.",
            imageRes = "product_fitness_tracker",
            category = ProductCategory.WEARABLES,
            rating = 4.4f
        ),
        Product(
            id = "5",
            name = "Laptop Stand",
            price = 49.99,
            description = "Ergonomic aluminum laptop stand with adjustable height. Improve your posture and workspace comfort.",
            imageRes = "product_laptop_stand",
            category = ProductCategory.ACCESSORIES,
            rating = 4.6f
        ),
        Product(
            id = "6",
            name = "USB-C Hub",
            price = 59.99,
            description = "Multi-port USB-C hub with HDMI, USB 3.0, and SD card reader. Expand your laptop connectivity.",
            imageRes = "product_usb_hub",
            category = ProductCategory.ACCESSORIES,
            rating = 4.2f
        ),
        Product(
            id = "7",
            name = "Wireless Mouse",
            price = 39.99,
            description = "Precision wireless mouse with ergonomic design and programmable buttons. Long battery life and smooth tracking.",
            imageRes = "product_mouse",
            category = ProductCategory.ACCESSORIES,
            rating = 4.5f
        ),
        Product(
            id = "8",
            name = "Mechanical Keyboard",
            price = 129.99,
            description = "RGB backlit mechanical keyboard with premium switches. Durable construction for gaming and productivity.",
            imageRes = "product_keyboard",
            category = ProductCategory.ACCESSORIES,
            rating = 4.8f
        ),
        Product(
            id = "9",
            name = "Webcam 4K",
            price = 89.99,
            description = "Professional 4K webcam with auto-focus and built-in microphone. Perfect for video calls and streaming.",
            imageRes = "product_webcam",
            category = ProductCategory.ELECTRONICS,
            rating = 4.3f
        ),
        Product(
            id = "10",
            name = "Phone Case",
            price = 24.99,
            description = "Protective phone case with shock absorption and raised edges. Slim design with precise cutouts.",
            imageRes = "product_phone_case",
            category = ProductCategory.ACCESSORIES,
            rating = 4.1f
        ),
        Product(
            id = "11",
            name = "Screen Protector",
            price = 19.99,
            description = "Tempered glass screen protector with oleophobic coating. Easy installation and bubble-free application.",
            imageRes = "product_screen_protector",
            category = ProductCategory.ACCESSORIES,
            rating = 4.4f
        ),
        Product(
            id = "12",
            name = "Charging Cable 3-Pack",
            price = 29.99,
            description = "Durable braided charging cables in multiple lengths. Fast charging compatible with most devices.",
            imageRes = "product_cables",
            category = ProductCategory.ACCESSORIES,
            rating = 4.6f
        ),
        Product(
            id = "13",
            name = "Power Bank 20000mAh",
            price = 49.99,
            description = "High-capacity power bank with fast charging support. Charge multiple devices simultaneously on the go.",
            imageRes = "product_power_bank",
            category = ProductCategory.ELECTRONICS,
            rating = 4.5f
        ),
        Product(
            id = "14",
            name = "Tablet 10-inch",
            price = 349.99,
            description = "Powerful 10-inch tablet with HD display and long battery life. Perfect for entertainment and productivity.",
            imageRes = "product_tablet",
            category = ProductCategory.ELECTRONICS,
            rating = 4.7f
        ),
        Product(
            id = "15",
            name = "Monitor 27-inch",
            price = 299.99,
            description = "Ultra-slim 27-inch Full HD monitor with IPS panel. Vivid colors and wide viewing angles for work and play.",
            imageRes = "product_monitor",
            category = ProductCategory.COMPUTING,
            rating = 4.6f
        )
    )
}