package com.test.composedevelopment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            preViewItem()
        }
    }
}
@Composable
fun setColumList()
{
    Column {
        listItem(
            R.drawable.ic_baseline_supervised_user_circle_24,
            "Soumyajit Sen",
            "Android Developer", modifier = Modifier.padding(8.dp)
        )
        listItem(
            R.drawable.ic_baseline_supervised_blue_user_circle_24,
            "Jagadish Paul",
            "IOS Developer", modifier = Modifier.padding(8.dp)
        )
        listItem(
            R.drawable.ic_baseline_supervised_red_user_circle_24,
            "Sukrit Chakraborty",
            "React Native Developer", modifier = Modifier.padding(8.dp)
        )


    }
}
@Composable
fun SaySoumya(name: String) {

    /*
    textField()
      buttonSet()
      imageSet()
textSet(name)
       setColumn()
        setRow()

      */
    setColumList()
    //circularImage()
}

@Preview(
    showBackground = true,
    name = "Hello Message",
    showSystemUi = true
)
@Composable
fun previewFunction() {
    SaySoumya(name = "Soumyajit")
}

@Composable
fun textField() {
    val state = remember { mutableStateOf("") }
    TextField(value = state.value, onValueChange = {
        state.value = it
    }, label = { Text(text = "Enter Name") }, placeholder = {
        Text(
            text = "Enter Your Name"
        )
    })
}

@Composable
fun buttonSet() {
    Button(
        onClick = {}, colors = ButtonDefaults.buttonColors(
            contentColor = Color.White, backgroundColor = Color.Black
        )
    ) {
        Text(text = "Hello")
        Image(
            painter = painterResource(id = R.drawable.ic_baseline_arrow_circle_left_24),
            contentDescription = "DummyImage "
        )
    }
}

@Composable
fun imageSet() {
    Image(
        painter = painterResource(id = R.drawable.ic_baseline_3d_rotation_24),
        contentDescription = "Demo Image",
        colorFilter = ColorFilter.tint(Color.Gray),
        alignment = Alignment.Center
    )
}



@Composable
fun setColumn() {
    Column(
        verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "A",
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            color = Color.Blue,
            fontSize = 24.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = "B",
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            color = Color.Red,
            fontSize = 24.sp,
            textAlign = TextAlign.Center
        )
    }

}

@Composable
fun setRow() {
    Row(
        horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically

    ) {
        Text(
            text = "A",
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            color = Color.Blue,
            fontSize = 24.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = "B",
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            color = Color.Red,
            fontSize = 24.sp,
            textAlign = TextAlign.Center
        )
    }

}

@Composable
fun listItem(imgId: Int, name: String, occupation: String,modifier: Modifier) {
    Row(modifier.padding(8.dp)) {
        Image(
            painter = painterResource(id = imgId),modifier = Modifier.size(40.dp).clip(CircleShape).border(2.dp,Color.LightGray, CircleShape), alignment = Alignment.Center, contentDescription = ""
        )
        Column() {
            Text(
                text = name, fontStyle = FontStyle.Normal, color = Color.Black, fontSize = 15.sp,modifier=Modifier.padding(5.dp)
            )
            Text(
                text = occupation,
                fontStyle = FontStyle.Normal,
                color = Color.Gray,
                fontSize = 12.sp
            )
        }
    }
}

@Composable
fun textSet(name: String) {
    Text(
        text = "Hello $name",
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.Bold,
        color = Color.Blue,
        fontSize = 18.sp,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .clickable { }
            .background(Color.Blue)
            .size(200.dp)
            .padding(16.dp)
            .border(4.dp, Color.Gray)
            .padding(5.dp)
            .clip(CircleShape)
            .background(Color.Green)

    )
}
@Composable
fun circularImage() {
    Image(
        painter = painterResource(id = R.drawable.ic_baseline_supervised_user_circle_24),
        contentScale = ContentScale.Crop,
        modifier = Modifier.size(80.dp).clip(CircleShape).border(2.dp,Color.LightGray, CircleShape),
        contentDescription = ""
    )
}