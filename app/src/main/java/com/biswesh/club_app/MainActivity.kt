package com.biswesh.club_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ArrowBack
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.biswesh.club_app.ui.theme.ClubAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ClubAppTheme {
                val gradient = Brush.verticalGradient(
                    colors = listOf(Color(0xFF000000), Color(0xFF353333))
                )
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(gradient),
                    verticalArrangement = Arrangement.spacedBy(10.dp),
                ) {
                    Box(modifier = Modifier
                        .fillMaxWidth()
                        .size(width = 300.dp, height = 600.dp)
                    ) {
                        //Club Image
                        Image(
                            painter = painterResource(id = R.drawable.switch_club),
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxWidth()
                                .size(350.dp)
                                .padding(20.dp, 65.dp, 20.dp)
                                .background(Color.Gray, shape = RoundedCornerShape(8.dp)),
                            contentScale = ContentScale.FillBounds
                        )
                        //Back Arrow Button
                        SmallFloatingActionButton(
                            onClick = { /*TODO*/ },
                            containerColor = MaterialTheme.colorScheme.secondary,
                            contentColor = MaterialTheme.colorScheme.secondaryContainer,
                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .padding(15.dp)
                                .offset(
                                    x = (0).dp,
                                    y = (0).dp
                                ),
                            shape = CircleShape
                        ) {
                            Icon(Icons.AutoMirrored.Rounded.ArrowBack, "Back Arrow action button.")
                        }
                        // Menu Button
                        SmallFloatingActionButton(
                            onClick = {/*TODO*/ },
                            containerColor = MaterialTheme.colorScheme.secondary,
                            contentColor = MaterialTheme.colorScheme.secondaryContainer,
                            modifier = Modifier
                                .align(Alignment.TopEnd)
                                .padding(15.dp)
                                .offset(x = (0).dp, y = (0).dp),
                            shape = CircleShape
                        ) {
                            Icon(Icons.Rounded.Menu, "Menu action button.")
                        }
                        Column(
                            modifier = Modifier
                                .align(Alignment.BottomEnd)
                                .padding(15.dp,0.dp)
                        ) {
                            //Club Desc.
                            Text(
                                text = "SWITCH Club",
                                style = TextStyle(
                                    fontSize = 24.sp,
                                    shadow = Shadow(
                                        color = Color.DarkGray,
                                        offset = Offset(5.0f, 10.0f),
                                        blurRadius = 3f
                                    )
                                ),
                                color = Color.White,
                                modifier = Modifier.padding(5.dp)
                            )
                            Spacer(modifier = Modifier.height(5.dp))
                            Text(
                                text = "The official coding club of SiliconTech, Silicon Wing of Technical and Coding Hub (SWITCH), develops a love for coding and advanced coding skills among students, and keeps them informed of the latest trends.",
                                fontSize = 15.sp,
                                color = Color.White,
                                modifier = Modifier.padding(5.dp)
                            )
                            Spacer(modifier = Modifier.height(50.dp))
                        }

                    }
                    HorizontalDivider(modifier = Modifier.padding(horizontal = 25.dp),thickness = 2.dp)
                    Column(
                        modifier = Modifier.padding(25.dp,15.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .border(1.dp, Color.DarkGray, RoundedCornerShape(10.dp))
                                .padding(10.dp)
                                .background(Color(0xFF353537)),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "Dr. Soumya Priyadarsini Panda\nFaculty Coordinator",
                                fontSize = 15.sp,
                                color = Color.White,
                                modifier = Modifier.padding(3.dp)
                            )
                        }
                        Spacer(modifier = Modifier.height(15.dp))
                        Row {
                            Box(
                                modifier = Modifier
                                    .border(1.dp, Color.DarkGray, RoundedCornerShape(10.dp))
                                    .padding(10.dp)
                                    .background(Color(0xFF353537)),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = "Swaraj Baral\nSecretary",
                                    fontSize = 15.sp,
                                    color = Color.White,
                                    modifier = Modifier.padding(3.dp)
                                )
                            }
                            Spacer(modifier = Modifier.width(15.dp))
                            Box(
                                modifier = Modifier
                                    .border(1.dp, Color.DarkGray, RoundedCornerShape(10.dp))
                                    .padding(10.dp)
                                    .background(Color(0xFF353537)),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = "Anubhab Patnaik\nJoint Secretary",
                                    fontSize = 15.sp,
                                    color = Color.White,
                                    modifier = Modifier.padding(3.dp)
                                )
                            }
                    }
                    }
                }
            }
        }
    }
}