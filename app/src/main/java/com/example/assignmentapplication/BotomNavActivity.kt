package com.example.assignmentapplication

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.assignmentapplication.ui.theme.AssignmentApplicationTheme

class BotomNavActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Bottom()
        }
    }
}



@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun Bottom(){

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(text = "Top App Bar")
                },
                navigationIcon = {
                    IconButton(onClick = {}) {
                        Icon(Icons.Filled.Home, "homeIcon")
                    }
                },

            )
        },
        content = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Cyan),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Content of the page",
                    fontSize = 30.sp,
                    color = Color.White
                )
            }

        },
        bottomBar = {
            BottomBar()
        }


    )

}

@Composable
fun BottomBar() {
    val selectedIndex = remember { mutableStateOf(0) }
    BottomNavigation(
        elevation = 10.dp,
        backgroundColor = Color.White

    ) {

        BottomNavigationItem(icon = {
            Icon(
                imageVector = Icons.Default.Home,
                "",
                tint = Color.Gray,
                modifier = Modifier
                    .size(30.dp)

                )
        },
            label = {
                Text(text = "Home",
                        color = Color.DarkGray
                ) },
            selected = (selectedIndex.value == 0), onClick = {
                selectedIndex.value = 0
            })
        BottomNavigationItem(icon = {
            Icon(
                imageVector = Icons.Default.Favorite,
                "",
                tint = Color.Gray,
                modifier = Modifier
                    .size(30.dp)
            )
        },
            label = {
                Text(
                    text = "Wishlist",
                    color = Color.DarkGray

                ) }, selected = (selectedIndex.value == 1), onClick = {
                selectedIndex.value = 1
            })
        BottomNavigationItem(icon = {
            Icon(
                imageVector = Icons.Default.ShoppingCart,
                "",
                tint = Color.Gray,
                modifier = Modifier
                    .size(30.dp)
                )
        },
            label = {
                Text(
                    text = "Cart",
                    color = Color.DarkGray
                ) },
            selected = (selectedIndex.value == 2), onClick = {
                selectedIndex.value = 2
            })

        BottomNavigationItem(icon = {
            Icon(
                imageVector = Icons.Default.Call,
                "",
                tint = Color.Gray,
                modifier = Modifier
                    .size(30.dp)
            )

        },
            label = {
                Text(
                    text = "Call",
                    color = Color.DarkGray

                ) }, selected = (selectedIndex.value == 2), onClick = {
                selectedIndex.value = 2
            })

        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Person,
                "",
                tint = Color.Gray,
                modifier = Modifier
                    .size(30.dp)
                )
        },
            label = {
                Text(
                    text = "Profile",
                    color = Color.DarkGray
                ) }, selected = (selectedIndex.value == 2), onClick = {
                selectedIndex.value = 2
            })


    }
}
