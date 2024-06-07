package com.example.assignmentapplication

import android.annotation.SuppressLint
import android.content.ClipData.Item
import android.graphics.Paint.Align
import android.graphics.drawable.Icon
import android.os.Bundle
import android.provider.CalendarContract.Colors
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.assignmentapplication.R.drawable
import com.example.assignmentapplication.R.drawable.filter
import com.example.assignmentapplication.ui.theme.AssignmentApplicationTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Home()

        }
    }
}


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Preview(showBackground = true)
@Composable
fun Home() {


Scaffold(

//    topBar = {
//        CenterAlignedTopAppBar(
//            title = {
//                Text(text = "Top App Bar")
//            },
//            navigationIcon = {
//                IconButton(onClick = {}) {
//                    Icon(Icons.Filled.Home, "homeIcon")
//                }
//            },
//
//            )
//    },

    content = {

        val home = LocalContext.current



        Box(

            modifier = Modifier
                .fillMaxSize()
        )

        LazyColumn {

            item {

                Column {

                    Card(
                        colors = CardDefaults.cardColors(Color(color = 0xffe56a08)),
                        shape = RoundedCornerShape(5.dp),
                        modifier = Modifier
                            .height(200.dp)
                            .fillMaxWidth()


                        //  elevation = CardDefaults.cardElevation(10.dp)

                    ) {


                        Text(

                            text = "Location",
                            fontSize = 20.sp,
                            color = Color.White,
                            fontFamily = FontFamily.SansSerif,
                            fontStyle = FontStyle.Normal,
                            fontWeight = FontWeight.Normal,
                            modifier = Modifier
                                .padding(10.dp)


                        )

                        Row {

                            Icon(
                                imageVector = Icons.Default.LocationOn,
                                contentDescription = "LocationOnIcon",
                                modifier = Modifier
                                    .size(40.dp)
                                    .padding(10.dp),
                                tint = Color.White


                            )

                            Text(

                                text = "New York, USA",
                                fontSize = 25.sp,
                                color = Color.White,
                                fontFamily = FontFamily.SansSerif,
                                fontStyle = FontStyle.Normal,
                                fontWeight = FontWeight.Normal,

                                )


                            Icon(
                                imageVector = Icons.Default.KeyboardArrowDown,
                                contentDescription = "KeyboardArrowDownIcon",
                                modifier = Modifier
                                    .size(35.dp),
                                tint = Color.White

                            )

                            Spacer(
                                modifier = Modifier
                                    .padding(30.dp)

                            )


                            Icon(
                                imageVector = Icons.Default.Notifications,
                                contentDescription = "NotificationsIcon",
                                modifier = Modifier
                                    .width(100.dp)
                                    .size(35.dp),
                                tint = Color.White

                            )

                        }

                        Spacer(
                            modifier = Modifier
                                .padding(0.dp)

                        )


                        var search by remember {
                            mutableStateOf(TextFieldValue(""))
                        }

                        Row {
                            OutlinedTextField(
                                value = search,

                                leadingIcon = {
                                    Icon(
                                        imageVector = Icons.Default.Search,
                                        contentDescription = "searchIcon",
                                        modifier = Modifier
                                            .padding(10.dp)
                                            .size(50.dp)


                                    )
                                },


                                colors = OutlinedTextFieldDefaults.colors(
                                    focusedContainerColor = Color.White,
                                    unfocusedContainerColor = Color.White,

                                    ),

                                onValueChange = { search = it },
                                label = { Text(text = "Search") },
                                modifier = Modifier
                                    .padding(10.dp)
                                    .height(60.dp)
                                    .width(250.dp),


                                shape = RoundedCornerShape(10.dp),


                                )

                            Spacer(
                                modifier = Modifier
                                    .padding(30.dp)

                            )

                            Icon(
                                painter = painterResource(id = R.drawable.filter),
                                contentDescription = "filters",


                                modifier = Modifier
                                    .border(1.dp, Color.LightGray, RoundedCornerShape(10.dp))
                                    .size(50.dp)

                                    //.background(Color.White)
                                    .align(Alignment.CenterVertically)
                                    .clickable { }

                                    .padding(10.dp),


                                //tint = Color.White


                            )

                        }

                    }

                    Spacer(
                        modifier = Modifier
                            .padding(2.dp)
                    )

                    Column {

                        Row {

                            Text(

                                text = "#SpecialForYou",
                                fontSize = 25.sp,
                                color = Color.Black,
                                fontFamily = FontFamily.SansSerif,
                                fontStyle = FontStyle.Normal,
                                fontWeight = FontWeight.SemiBold,
                                modifier = Modifier
                                    .padding(20.dp)

                            )

                            Spacer(
                                modifier = Modifier
                                    .padding(25.dp)


                            )

                            Text(

                                text = "See All",
                                fontSize = 25.sp,
                                fontFamily = FontFamily.SansSerif,
                                fontStyle = FontStyle.Normal,
                                fontWeight = FontWeight.Normal,
                                color = Color(color = 0xffe56a08),
                                modifier = Modifier
                                    .padding(20.dp)
                                    .clickable {}


                            )

                        }

                    }

                    LazyRow {

                        item {

                            Row {


                                Card(
                                    shape = RoundedCornerShape(10.dp),
                                    modifier = Modifier
                                        .padding(20.dp)
                                        .height(250.dp)
                                        .padding(10.dp)
                                        .fillMaxWidth(),


                                    elevation = CardDefaults.cardElevation(10.dp)

                                ) {

                                    Box(modifier = Modifier)

                                    {

                                        Image(
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .fillMaxSize(),
                                            painter = painterResource(id = R.drawable.fash),
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            )

                                        Column {


                                            Button(

                                                onClick = {
                                                    //   about.startActivity(Intent(about, AboutActivity::class.java))

                                                },
                                                colors = ButtonDefaults.buttonColors(Color.White),
                                                shape = RoundedCornerShape(30.dp),
                                                modifier = Modifier
                                                    .padding(8.dp)


                                            ) {

                                                Text(
                                                    text = "Limited time!",
                                                    color = Color.Black,
                                                    fontSize = 15.sp,
                                                    fontFamily = FontFamily.SansSerif,
                                                    fontStyle = FontStyle.Normal,
                                                    fontWeight = FontWeight.SemiBold,
                                                )
                                            }

                                            Text(
                                                text = "Get Special Offer",
                                                fontSize = 25.sp,
                                                fontFamily = FontFamily.SansSerif,
                                                fontStyle = FontStyle.Normal,
                                                fontWeight = FontWeight.Bold,
                                                color = Color.White,
                                                modifier = Modifier
                                                    .padding(5.dp)
//
                                            )



                                            Row {

                                                Text(
                                                    text = "Up to",
                                                    fontSize = 30.sp,
                                                    fontFamily = FontFamily.SansSerif,
                                                    fontStyle = FontStyle.Normal,
                                                    fontWeight = FontWeight.Normal,
                                                    color = Color.White,
                                                    // modifier = Modifier
                                                    // .padding(5.dp),
                                                )

                                                Text(
                                                    text = "40",
                                                    fontSize = 30.sp,
                                                    fontFamily = FontFamily.SansSerif,
                                                    fontStyle = FontStyle.Normal,
                                                    fontWeight = FontWeight.Bold,
                                                    color = Color.White,
                                                    modifier = Modifier
                                                        .padding(7.dp),
                                                )

                                                Text(
                                                    text = "%",
                                                    fontSize = 23.sp,
                                                    fontFamily = FontFamily.SansSerif,
                                                    fontStyle = FontStyle.Normal,
                                                    fontWeight = FontWeight.Bold,
                                                    color = Color.White,
                                                    modifier = Modifier,
                                                )


                                            }

                                            Spacer(
                                                modifier = Modifier
                                                    .padding(10.dp)
                                            )

                                            Row {

                                                Text(
                                                    text = "All Services Available|T&C Applied",
                                                    fontSize = 15.sp,
                                                    fontFamily = FontFamily.SansSerif,
                                                    fontStyle = FontStyle.Normal,
                                                    fontWeight = FontWeight.Normal,
                                                    color = Color.White,
                                                    modifier = Modifier
                                                        .padding(5.dp)
//
                                                )

                                                Button(

                                                    onClick = {
                                                        //about.startActivity(Intent(about, AboutActivity::class.java))

                                                    },
                                                    colors = ButtonDefaults.buttonColors(Color(color = 0xffe56a08)),
                                                    shape = RoundedCornerShape(25.dp),
                                                    modifier = Modifier
                                                        .padding(7.dp)


                                                ) {


                                                    Text(
                                                        text = "Claim",
                                                        color = Color.White,
                                                        fontSize = 15.sp,
                                                        fontFamily = FontFamily.SansSerif,
                                                        fontStyle = FontStyle.Normal,
                                                        fontWeight = FontWeight.SemiBold,


                                                        )
                                                }

                                            }

                                        }

                                    }
                                }

                                Card(
                                    shape = RoundedCornerShape(10.dp),
                                    modifier = Modifier
                                        .padding(20.dp)
                                        .height(250.dp)
                                        .padding(10.dp)
                                        .fillMaxWidth(),


                                    elevation = CardDefaults.cardElevation(10.dp)

                                ) {

                                    Box(modifier = Modifier)

                                    {

                                        Image(
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .fillMaxSize(),
                                            painter = painterResource(id = R.drawable.fashi),
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            )

                                        Column {


                                            Button(

                                                onClick = {
                                                    //   about.startActivity(Intent(about, AboutActivity::class.java))

                                                },
                                                colors = ButtonDefaults.buttonColors(Color.White),
                                                shape = RoundedCornerShape(30.dp),
                                                modifier = Modifier
                                                    .padding(8.dp)


                                            ) {

                                                Text(
                                                    text = "Limited time!",
                                                    color = Color.Black,
                                                    fontSize = 15.sp,
                                                    fontFamily = FontFamily.SansSerif,
                                                    fontStyle = FontStyle.Normal,
                                                    fontWeight = FontWeight.SemiBold,
                                                )
                                            }

                                            Text(
                                                text = "Get Special Offer",
                                                fontSize = 25.sp,
                                                fontFamily = FontFamily.SansSerif,
                                                fontStyle = FontStyle.Normal,
                                                fontWeight = FontWeight.Bold,
                                                color = Color.White,
                                                modifier = Modifier
                                                    .padding(5.dp)
//
                                            )



                                            Row {

                                                Text(
                                                    text = "Up to",
                                                    fontSize = 30.sp,
                                                    fontFamily = FontFamily.SansSerif,
                                                    fontStyle = FontStyle.Normal,
                                                    fontWeight = FontWeight.Normal,
                                                    color = Color.White,
                                                    // modifier = Modifier
                                                    // .padding(5.dp),
                                                )

                                                Text(
                                                    text = "40",
                                                    fontSize = 30.sp,
                                                    fontFamily = FontFamily.SansSerif,
                                                    fontStyle = FontStyle.Normal,
                                                    fontWeight = FontWeight.Bold,
                                                    color = Color.White,
                                                    modifier = Modifier
                                                        .padding(7.dp),
                                                )

                                                Text(
                                                    text = "%",
                                                    fontSize = 23.sp,
                                                    fontFamily = FontFamily.SansSerif,
                                                    fontStyle = FontStyle.Normal,
                                                    fontWeight = FontWeight.Bold,
                                                    color = Color.White,
                                                    modifier = Modifier,
                                                )


                                            }

                                            Spacer(
                                                modifier = Modifier
                                                    .padding(10.dp)
                                            )

                                            Row {

                                                Text(
                                                    text = "All Services Available|T&C Applied",
                                                    fontSize = 15.sp,
                                                    fontFamily = FontFamily.SansSerif,
                                                    fontStyle = FontStyle.Normal,
                                                    fontWeight = FontWeight.Normal,
                                                    color = Color.White,
                                                    modifier = Modifier
                                                        .padding(5.dp)
//
                                                )

                                                Button(

                                                    onClick = {
                                                        //about.startActivity(Intent(about, AboutActivity::class.java))

                                                    },
                                                    colors = ButtonDefaults.buttonColors(Color(color = 0xffe56a08)),
                                                    shape = RoundedCornerShape(25.dp),
                                                    modifier = Modifier
                                                        .padding(7.dp)


                                                ) {


                                                    Text(
                                                        text = "Claim",
                                                        color = Color.White,
                                                        fontSize = 15.sp,
                                                        fontFamily = FontFamily.SansSerif,
                                                        fontStyle = FontStyle.Normal,
                                                        fontWeight = FontWeight.SemiBold,


                                                        )
                                                }

                                            }

                                        }

                                    }
                                }

                                Card(
                                    shape = RoundedCornerShape(10.dp),
                                    modifier = Modifier
                                        .padding(20.dp)
                                        .height(250.dp)
                                        .padding(10.dp)
                                        .fillMaxWidth(),


                                    elevation = CardDefaults.cardElevation(10.dp)

                                ) {

                                    Box(modifier = Modifier)

                                    {

                                        Image(
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .fillMaxSize(),
                                            painter = painterResource(id = R.drawable.fashio),
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            )

                                        Column {


                                            Button(

                                                onClick = {
                                                    //   about.startActivity(Intent(about, AboutActivity::class.java))

                                                },
                                                colors = ButtonDefaults.buttonColors(Color.White),
                                                shape = RoundedCornerShape(30.dp),
                                                modifier = Modifier
                                                    .padding(8.dp)


                                            ) {

                                                Text(
                                                    text = "Limited time!",
                                                    color = Color.Black,
                                                    fontSize = 15.sp,
                                                    fontFamily = FontFamily.SansSerif,
                                                    fontStyle = FontStyle.Normal,
                                                    fontWeight = FontWeight.SemiBold,
                                                )
                                            }

                                            Text(
                                                text = "Get Special Offer",
                                                fontSize = 25.sp,
                                                fontFamily = FontFamily.SansSerif,
                                                fontStyle = FontStyle.Normal,
                                                fontWeight = FontWeight.Bold,
                                                color = Color.White,
                                                modifier = Modifier
                                                    .padding(5.dp)
//
                                            )



                                            Row {

                                                Text(
                                                    text = "Up to",
                                                    fontSize = 30.sp,
                                                    fontFamily = FontFamily.SansSerif,
                                                    fontStyle = FontStyle.Normal,
                                                    fontWeight = FontWeight.Normal,
                                                    color = Color.White,
                                                    // modifier = Modifier
                                                    // .padding(5.dp),
                                                )

                                                Text(
                                                    text = "40",
                                                    fontSize = 30.sp,
                                                    fontFamily = FontFamily.SansSerif,
                                                    fontStyle = FontStyle.Normal,
                                                    fontWeight = FontWeight.Bold,
                                                    color = Color.White,
                                                    modifier = Modifier
                                                        .padding(7.dp),
                                                )

                                                Text(
                                                    text = "%",
                                                    fontSize = 23.sp,
                                                    fontFamily = FontFamily.SansSerif,
                                                    fontStyle = FontStyle.Normal,
                                                    fontWeight = FontWeight.Bold,
                                                    color = Color.White,
                                                    modifier = Modifier,
                                                )


                                            }

                                            Spacer(
                                                modifier = Modifier
                                                    .padding(10.dp)
                                            )

                                            Row {

                                                Text(
                                                    text = "All Services Available|T&C Applied",
                                                    fontSize = 15.sp,
                                                    fontFamily = FontFamily.SansSerif,
                                                    fontStyle = FontStyle.Normal,
                                                    fontWeight = FontWeight.Normal,
                                                    color = Color.White,
                                                    modifier = Modifier
                                                        .padding(5.dp)
//
                                                )

                                                Button(

                                                    onClick = {
                                                        //about.startActivity(Intent(about, AboutActivity::class.java))

                                                    },
                                                    colors = ButtonDefaults.buttonColors(Color(color = 0xffe56a08)),
                                                    shape = RoundedCornerShape(25.dp),
                                                    modifier = Modifier
                                                        .padding(7.dp)


                                                ) {


                                                    Text(
                                                        text = "Claim",
                                                        color = Color.White,
                                                        fontSize = 15.sp,
                                                        fontFamily = FontFamily.SansSerif,
                                                        fontStyle = FontStyle.Normal,
                                                        fontWeight = FontWeight.SemiBold,


                                                        )
                                                }

                                            }

                                        }

                                    }
                                }



                            }


                        }


                    }

                    Row(
                        modifier = Modifier
                            .height(75.dp)
                    ) {

                        Text(

                            text = "Category",
                            fontSize = 25.sp,
                            color = Color.Black,
                            fontFamily = FontFamily.SansSerif,
                            fontStyle = FontStyle.Normal,
                            fontWeight = FontWeight.SemiBold,
                            modifier = Modifier
                                .padding(20.dp)

                        )

                        Spacer(
                            modifier = Modifier
                                .padding(55.dp)


                        )

                        Text(

                            text = "See All",
                            fontSize = 25.sp,
                            fontFamily = FontFamily.SansSerif,
                            fontStyle = FontStyle.Normal,
                            fontWeight = FontWeight.Normal,
                            color = Color(color = 0xffe56a08),
                            modifier = Modifier
                                .padding(20.dp)
                                .clickable {}


                        )

                    }


                }

                LazyRow(
                    horizontalArrangement = Arrangement.SpaceEvenly,

                    modifier = Modifier
                        .height(100.dp)
                ) {

                    item {

                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .height(100.dp)
                        ) {

                            Box(

                                modifier = Modifier
                                    .clip(CircleShape)
                                    .background(Color.White)
                                    .size(55.dp)


                            ) {

                                Icon(
                                    painter = painterResource(id = R.drawable.cloth),
                                    contentDescription = "Clothes Icon",
                                    tint = Color(color = 0xffe56a08),


                                    modifier = Modifier

                                        .clip(CircleShape)
                                        .border(1.dp, Color(0xffe56a08), CircleShape)
                                        .padding(4.dp)
                                        .clickable { }

                                )


                            }

                            Text(

                                text = "Clothes",
                                fontSize = 20.sp,
                                fontFamily = FontFamily.SansSerif,
                                fontStyle = FontStyle.Normal,
                                fontWeight = FontWeight.SemiBold,
                                color = Color.Black,
                                modifier = Modifier
                                    .padding(8.dp)
                                    .clickable {}


                            )

                        }
                        Spacer(
                            modifier = Modifier
                                .padding(20.dp)
                        )

                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .height(100.dp)
                        ) {

                            Box(

                                modifier = Modifier
                                    .clip(CircleShape)
                                    .background(Color.White)
                                    .size(55.dp)


                            ) {

                                Icon(
                                    painter = painterResource(id = R.drawable.electr),
                                    contentDescription = "Electronics Icon",
                                    tint = Color(color = 0xffe56a08),


                                    modifier = Modifier

                                        .clip(CircleShape)
                                        .border(1.dp, Color(0xffe56a08), CircleShape)
                                        .padding(4.dp)
                                        .clickable { }

                                )


                            }
                            Text(

                                text = "Electronics",
                                fontSize = 20.sp,
                                fontFamily = FontFamily.SansSerif,
                                fontStyle = FontStyle.Normal,
                                fontWeight = FontWeight.SemiBold,
                                color = Color.Black,
                                modifier = Modifier
                                    .padding(8.dp)
                                    .clickable {}

                            )

                        }
                        Spacer(
                            modifier = Modifier
                                .padding(15.dp)
                        )

                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .height(100.dp)
                        ) {

                            Box(

                                modifier = Modifier
                                    .clip(CircleShape)
                                    .background(Color.White)
                                    .size(55.dp)


                            ) {

                                Icon(
                                    painter = painterResource(id = R.drawable.shoe),
                                    contentDescription = "Shoes Icon",
                                    tint = Color(color = 0xffe56a08),


                                    modifier = Modifier

                                        .clip(CircleShape)
                                        .border(1.dp, Color(0xffe56a08), CircleShape)
                                        .padding(4.dp)
                                        .clickable { }

                                )


                            }
                            Text(

                                text = "Shoes",
                                fontSize = 20.sp,
                                fontFamily = FontFamily.SansSerif,
                                fontStyle = FontStyle.Normal,
                                fontWeight = FontWeight.SemiBold,
                                color = Color.Black,
                                modifier = Modifier
                                    .padding(8.dp)
                                    .clickable {}


                            )


                        }

                        Spacer(
                            modifier = Modifier
                                .padding(15.dp)
                        )

                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .height(100.dp)
                        ) {

                            Box(

                                modifier = Modifier
                                    .clip(CircleShape)
                                    .background(Color.White)
                                    .size(55.dp)


                            ) {

                                Icon(
                                    painter = painterResource(id = R.drawable.watch),
                                    contentDescription = "Watch Icon",
                                    tint = Color(color = 0xffe56a08),


                                    modifier = Modifier

                                        .clip(CircleShape)
                                        .border(1.dp, Color(0xffe56a08), CircleShape)
                                        .padding(4.dp)
                                        .clickable { }

                                )


                            }
                            Text(

                                text = "Watch",
                                fontSize = 20.sp,
                                fontFamily = FontFamily.SansSerif,
                                fontStyle = FontStyle.Normal,
                                fontWeight = FontWeight.SemiBold,
                                color = Color.Black,
                                modifier = Modifier
                                    .padding(8.dp)
                                    .clickable {}


                            )

                        }

                    }

                }

                Row(
                    modifier = Modifier
                        .height(68.dp)
                ) {

                    Text(

                        text = "Flash Sale",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontFamily = FontFamily.SansSerif,
                        fontStyle = FontStyle.Normal,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier
                            .padding(20.dp)

                    )

                    Spacer(
                        modifier = Modifier
                            .padding(8.dp)


                    )

                    Text(

                        text = "Closing in: 02 : 12 : 56",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.SansSerif,
                        fontStyle = FontStyle.Normal,
                        fontWeight = FontWeight.Normal,
                        color = Color(color = 0xffe56a08),
                        modifier = Modifier
                            .padding(20.dp)
                        //.clickable {}


                    )

                }

                LazyRow(
                    horizontalArrangement = Arrangement.SpaceEvenly,

                    modifier = Modifier
                        .height(100.dp)
                ) {

                    item {

                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .height(100.dp)
                        ) {

                            Button(

                                onClick = {
                                    //about.startActivity(Intent(about, AboutActivity::class.java))

                                },
                                colors = ButtonDefaults.buttonColors(Color.White),
                                shape = RoundedCornerShape(15.dp),
                                modifier = Modifier
                                    .padding(7.dp)
                                    .border(1.dp, Color.DarkGray, CircleShape)


                            ) {


                                Text(
                                    text = "All",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = FontFamily.SansSerif,
                                    fontStyle = FontStyle.Normal,
                                    fontWeight = FontWeight.SemiBold,

                                    )
                            }

                        }

                        Spacer(
                            modifier = Modifier
                                .padding(10.dp)
                        )

                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .height(100.dp)
                        ) {

                            Button(

                                onClick = {
                                    //about.startActivity(Intent(about, AboutActivity::class.java))

                                },
                                colors = ButtonDefaults.buttonColors(Color.White),
                                shape = RoundedCornerShape(15.dp),
                                modifier = Modifier
                                    .padding(7.dp)
                                    .border(1.dp, Color.DarkGray, CircleShape)


                            ) {


                                Text(
                                    text = "Newest",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = FontFamily.SansSerif,
                                    fontStyle = FontStyle.Normal,
                                    fontWeight = FontWeight.SemiBold,

                                    )
                            }

                        }
                        Spacer(
                            modifier = Modifier
                                .padding(10.dp)
                        )

                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .height(100.dp)
                        ) {

                            Button(

                                onClick = {
                                    //about.startActivity(Intent(about, AboutActivity::class.java))

                                },
                                colors = ButtonDefaults.buttonColors(Color.White),
                                shape = RoundedCornerShape(15.dp),
                                modifier = Modifier
                                    .padding(7.dp)
                                    .border(1.dp, Color.DarkGray, CircleShape)


                            ) {


                                Text(
                                    text = "Popular",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = FontFamily.SansSerif,
                                    fontStyle = FontStyle.Normal,
                                    fontWeight = FontWeight.SemiBold,

                                    )
                            }

                        }

                        Spacer(
                            modifier = Modifier
                                .padding(10.dp)
                        )

                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .height(100.dp)
                        ) {

                            Button(

                                onClick = {
                                    //about.startActivity(Intent(about, AboutActivity::class.java))

                                },
                                colors = ButtonDefaults.buttonColors(Color.White),
                                shape = RoundedCornerShape(15.dp),
                                modifier = Modifier
                                    .padding(7.dp)
                                    .border(1.dp, Color.DarkGray, CircleShape)


                            ) {


                                Text(
                                    text = "Clothes",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = FontFamily.SansSerif,
                                    fontStyle = FontStyle.Normal,
                                    fontWeight = FontWeight.SemiBold,

                                    )
                            }

                        }

                    }

                }


                LazyRow {

                    item {

                        Row {


                            Card(
                                shape = RoundedCornerShape(10.dp),
                                modifier = Modifier
                                    .padding(10.dp)
                                    .height(300.dp)
                                    .padding(10.dp)
                                    .width(250.dp),


                                elevation = CardDefaults.cardElevation(10.dp)

                            ) {

                                Box(modifier = Modifier)

                                {

                                    Image(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .fillMaxSize(),
                                        painter = painterResource(id = R.drawable.coat),
                                        contentDescription = null,
                                        contentScale = ContentScale.Crop,

                                        )

                                    Column {


                                        Icon(
                                            imageVector = Icons.Default.Favorite,
                                            contentDescription = "FavoriteIcon",
                                            modifier = Modifier
                                                .size(50.dp)
                                                .align(Alignment.End)
                                                .padding(10.dp),
                                            tint = Color.White


                                        )

                                        Text(
                                            text = "Get Special Offer",
                                            fontSize = 25.sp,
                                            fontFamily = FontFamily.SansSerif,
                                            fontStyle = FontStyle.Normal,
                                            fontWeight = FontWeight.Bold,
                                            color = Color.White,
                                            modifier = Modifier
                                                .padding(5.dp)
//
                                        )



                                        Row {

                                            Text(
                                                text = "Up to",
                                                fontSize = 30.sp,
                                                fontFamily = FontFamily.SansSerif,
                                                fontStyle = FontStyle.Normal,
                                                fontWeight = FontWeight.Normal,
                                                color = Color.White,
                                                // modifier = Modifier
                                                // .padding(5.dp),
                                            )

                                            Text(
                                                text = "40",
                                                fontSize = 30.sp,
                                                fontFamily = FontFamily.SansSerif,
                                                fontStyle = FontStyle.Normal,
                                                fontWeight = FontWeight.Bold,
                                                color = Color.White,
                                                modifier = Modifier
                                                    .padding(7.dp),
                                            )

                                            Text(
                                                text = "%",
                                                fontSize = 23.sp,
                                                fontFamily = FontFamily.SansSerif,
                                                fontStyle = FontStyle.Normal,
                                                fontWeight = FontWeight.Bold,
                                                color = Color.White,
                                                modifier = Modifier,
                                            )


                                        }

                                        Spacer(
                                            modifier = Modifier
                                                .padding(10.dp)
                                        )

                                        Row {

                                            Text(
                                                text = "All Services Available|T&C Applied",
                                                fontSize = 15.sp,
                                                fontFamily = FontFamily.SansSerif,
                                                fontStyle = FontStyle.Normal,
                                                fontWeight = FontWeight.Normal,
                                                color = Color.White,
                                                modifier = Modifier
                                                    .padding(5.dp)
//
                                            )

                                            Button(

                                                onClick = {
                                                    //about.startActivity(Intent(about, AboutActivity::class.java))

                                                },
                                                colors = ButtonDefaults.buttonColors(Color(color = 0xffe56a08)),
                                                shape = RoundedCornerShape(25.dp),
                                                modifier = Modifier
                                                    .padding(7.dp)


                                            ) {


                                                Text(
                                                    text = "Claim",
                                                    color = Color.White,
                                                    fontSize = 15.sp,
                                                    fontFamily = FontFamily.SansSerif,
                                                    fontStyle = FontStyle.Normal,
                                                    fontWeight = FontWeight.SemiBold,


                                                    )
                                            }

                                        }

                                    }

                                }
                            }

                            Card(
                                shape = RoundedCornerShape(10.dp),
                                modifier = Modifier
                                    .padding(10.dp)
                                    .height(300.dp)
                                    .padding(10.dp)
                                    .width(250.dp),


                                elevation = CardDefaults.cardElevation(10.dp)

                            ) {

                                Box(modifier = Modifier)

                                {

                                    Image(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .fillMaxSize(),
                                        painter = painterResource(id = R.drawable.shar),
                                        contentDescription = null,
                                        contentScale = ContentScale.Crop,

                                        )

                                    Row {


                                        Icon(
                                            imageVector = Icons.Default.Favorite,
                                            contentDescription = "FavoriteIcon",
                                            modifier = Modifier
                                                .size(50.dp)
                                               // .align(Alignment.End)
                                                .padding(10.dp),
                                            tint = Color.White


                                        )


                                    }

                                    Spacer(
                                        modifier = Modifier
                                            .padding(20.dp)
                                    )

                                    Row {

                                        Text(
                                            text = "African Print Dress",
                                            fontSize = 15.sp,
                                            fontFamily = FontFamily.SansSerif,
                                            fontStyle = FontStyle.Normal,
                                            fontWeight = FontWeight.Normal,
                                            color = Color.White,
                                            modifier = Modifier
                                                .padding(5.dp)
//
                                        )

                                        Button(

                                            onClick = {
                                                //about.startActivity(Intent(about, AboutActivity::class.java))

                                            },
                                            colors = ButtonDefaults.buttonColors(Color(color = 0xffe56a08)),
                                            shape = RoundedCornerShape(25.dp),
                                            modifier = Modifier
                                                .padding(7.dp)


                                        ) {


                                            Text(
                                                text = "Claim",
                                                color = Color.White,
                                                fontSize = 15.sp,
                                                fontFamily = FontFamily.SansSerif,
                                                fontStyle = FontStyle.Normal,
                                                fontWeight = FontWeight.SemiBold,


                                                )
                                        }

                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    },
    bottomBar = {
        BotomBarHome()
    }
)

}


@Composable
fun BotomBarHome() {
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

