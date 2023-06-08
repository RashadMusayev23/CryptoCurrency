package com.mazeppa.cryptocurrency.presentation

/**
 * Rashad Musayev on 6/2/2023 - 21:42
 */
sealed class Screen(val route: String) {
    object CoinListScreen : Screen("coin_list_screen")
    object CoinDetailScreen : Screen("coin_detail_screen")
}
