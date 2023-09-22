package br.com.fiap.fiapstartupone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.TopStart
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

var nome = "Victoria"

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FIAPStartupONETheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
            Header (
            )
            Reporte(
            )
                }
            }
        }
    }
}

@Composable
fun Header(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 360.dp)
            .requiredHeight(height = 99.dp)
    ) {
        Box(
            modifier = Modifier
                .align(alignment = TopStart)
                .requiredWidth(width = 360.dp)
                .requiredHeight(height = 89.dp)
                .background(color = Color(0xfff5f5f5))
                .border(border = BorderStroke(1.dp, Color.Black.copy(alpha = 0.5f))))
        TextButton(
            onClick = { },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent ),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 267.dp,
                    y = 44.dp
                )
                .requiredSize(size = 36.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredSize(size = 36.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.envelope),
                    contentDescription = "Vector",
                    modifier = Modifier
                        .fillMaxSize()
                )
            }
        }
        TextButton(
            onClick = { },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 310.dp,
                    y = 44.dp
                )
                .requiredWidth(width = 39.dp)
                .requiredHeight(height = 40.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredWidth(width = 39.dp)
                    .requiredHeight(height = 40.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.bell),
                    contentDescription = "Vector",
                    modifier = Modifier
                        .fillMaxSize()
                )
            }
        }
        Text(
            text = "Olá, Cidadão!",
            color = Color.Black,
            style = TextStyle(
                fontSize = 32.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 16.dp,
                    y = 44.dp
                )
                .requiredWidth(width = 252.dp)
                .requiredHeight(height = 55.dp))
    }
}


@Composable
fun Reporte(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 345.dp)
            .requiredHeight(height = 109.dp)
    ) {
        Box(
            modifier = Modifier
                .requiredWidth(width = 392.dp)
                .requiredHeight(height = 109.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredSize(size = 83.dp)
                    .clip(shape = RoundedCornerShape(23.dp))
                    .background(color = Color(0xff22bf53)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 206.dp,
                        y = 0.dp
                    )
                    .requiredSize(size = 83.dp)
                    .clip(shape = RoundedCornerShape(23.dp))
                    .background(color = Color(0xff22bf53)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 103.dp,
                        y = 0.dp
                    )
                    .requiredSize(size = 83.dp)
                    .clip(shape = RoundedCornerShape(23.dp))
                    .background(color = Color(0xff22bf53)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 309.dp,
                        y = 0.dp
                    )
                    .requiredSize(size = 83.dp)
                    .clip(shape = RoundedCornerShape(23.dp))
                    .background(color = Color(0xff22bf53)))
            Image(
                painter = painterResource(id = R.drawable.car_burst),
                contentDescription = "car-crash",
                colorFilter = ColorFilter.tint(Color(0xffe2dfd1)),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 18.dp,
                        y = 18.dp
                    )
                    .requiredSize(size = 46.dp))
            Image(
                painter = painterResource(id = R.drawable.tree),
                contentDescription = "Frame 3",
                colorFilter = ColorFilter.tint(Color(0xffe2dfd1)),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 127.dp,
                        y = 18.dp
                    )
                    .requiredWidth(width = 34.dp)
                    .requiredHeight(height = 46.dp))
            Image(
                painter = painterResource(id = R.drawable.road),
                contentDescription = "Frame 2",
                colorFilter = ColorFilter.tint(Color(0xffe2dfd1)),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 223.dp,
                        y = 26.dp
                    )
                    .requiredWidth(width = 50.dp)
                    .requiredHeight(height = 32.dp))
            Text(
                text = "Trânsito",
                color = Color.Black,
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 13.sp),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 2.dp,
                        y = 89.dp
                    )
                    .requiredWidth(width = 78.dp)
                    .requiredHeight(height = 20.dp))
            Text(
                text = "Meio\nAmbiente",
                color = Color.Black,
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 13.sp),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 105.dp,
                        y = 89.dp
                    )
                    .requiredWidth(width = 78.dp)
                    .requiredHeight(height = 20.dp))
            Text(
                text = "Calçadas",
                color = Color.Black,
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 13.sp),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 208.dp,
                        y = 89.dp
                    )
                    .requiredWidth(width = 78.dp)
                    .requiredHeight(height = 20.dp))
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HeaderPreview() {
    Header()
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ReportePreview() {
    Reporte()
}



