package com.myapp.bottomnavigationbar

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.myapp.bottomnavigationbar.Screen.HomeScreeen
import com.myapp.bottomnavigationbar.Screen.MessageScreen
import com.myapp.bottomnavigationbar.Screen.SettingsScreen

@Composable
fun BottomNavgraph(navController : NavHostController) {
   NavHost(navController = navController, startDestination = BottomNavScreen.Home.route ){
      composable(route = BottomNavScreen.Home.route){
          HomeScreeen()
      }
       composable(route = BottomNavScreen.Email.route){
         MessageScreen()
       }
       composable(route = BottomNavScreen.Settings.route){
           SettingsScreen()
       }
   }
}
