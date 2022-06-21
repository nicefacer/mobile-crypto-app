package com.iyke.crypto_trackersealed

import com.iyke.crypto_tracker.R


open  class BottomNavItem(var title:String, var icon:Int, var screen_route:String){
    object Home : BottomNavItem("Home", R.drawable.ic_baseline_home_24,"home")
    object Wallet: BottomNavItem("My Network",R.drawable.ic_baseline_account_balance_wallet_24,"wallet")
    object Trade: BottomNavItem("Post",R.drawable.ic_baseline_show_chart_24,"trade")
    object Profile: BottomNavItem("Jobs",R.drawable.ic_baseline_person_24,"Profile")
}