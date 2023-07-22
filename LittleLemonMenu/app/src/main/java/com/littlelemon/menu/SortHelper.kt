package com.littlelemon.menu

class SortHelper {
    fun sortProducts(type: SortType, productsList: List<ProductItem>): List<ProductItem> {
        return when (type) {
            SortType.Alphabetically -> productsList.sortAlphabetically()
            SortType.PriceAsc -> productsList.sortPriceAscending()
            SortType.PriceDesc -> productsList.sortPriceDescending()
        }
    }

    private fun List<ProductItem>.sortAlphabetically(): List<ProductItem> {
        return sortedBy { it.title }
    }

    private fun List<ProductItem>.sortPriceAscending(): List<ProductItem> {
        return this.sortedBy { it.price }
    }

    private fun List<ProductItem>.sortPriceDescending(): List<ProductItem> {
        return this.sortedByDescending { it.price }
    }

}