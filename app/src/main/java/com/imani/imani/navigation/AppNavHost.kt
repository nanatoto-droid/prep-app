package com.imani.imani.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.core.splashscreen.SplashScreen
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.imani.imani.ui.theme.screens.Dashboard.Dashboard_Screen
import com.imani.imani.ui.theme.screens.home.Home_Screen
import com.imani.imani.ui.theme.screens.login.Login_Screen
import com.imani.imani.ui.theme.screens.register.Register_Screen
import com.imani.imani.ui.theme.screens.splash.SplashScreen

@Composable
fun AppNavHost(modifier: Modifier = Modifier,
               navController: NavHostController= rememberNavController(),
               startDestination:String= ROUTE_HOME) {
    NavHost(navController = navController,
        modifier = Modifier,
        startDestination = startDestination){
        composable(ROUTE_HOME){
            Home_Screen(navController)
        }
        composable(ROUTE_LOGIN){
            Login_Screen(navController)
        }
        composable(ROUTE_REGISTER){
            Register_Screen(navController)
        }
        composable(ROUTE_SPLASH){
            SplashScreen(navController)
        }
        composable(ROUTE_DASHBOARD){
            Dashboard_Screen()
        }

    }

}