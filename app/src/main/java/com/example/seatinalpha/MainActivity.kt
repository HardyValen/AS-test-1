package com.example.seatinalpha

import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

  @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
//    val navView: BottomNavigationView = findViewById(R.id.nav_view)
//
//    val navController = findNavController(R.id.nav_host_fragment)
//    // Passing each menu ID as a set of Ids because each
//    // menu should be considered as top level destinations.
//    val appBarConfiguration = AppBarConfiguration(setOf(
//      R.id.navigation_home, R.id.navigation_my_webinar, R.id.navigation_feed, R.id.navigation_account, R.id.navigation_history))
//    setupActionBarWithNavController(navController, appBarConfiguration)
//    navView.setupWithNavController(navController)
//
////    setSupportActionBar(findViewById(R.id.custom_toolbar))
//    setActionBar(findViewById(R.id.custom_toolbar))
  }
}