package com.test.composedevelopment

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun preViewItem() {

    LazyColumn(content = {
        items(getCategoryList()){item->
            blogCategory(img = item.img, title = item.title, subTitle = item.subTitle)
        }
    })


}

@Composable
fun blogCategory(img: Int, title: String, subTitle: String) {
    Card(
        elevation = 8.dp,
        modifier = Modifier.padding(8.dp)
    ) {

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp)
        ) {
            Image(
                painter = painterResource(id = img),
                contentDescription = "",
                modifier = Modifier
                    .size(80.dp)
                    .padding(8.dp)
                    .weight(.2f)
            )
            itemDescription(title, subTitle,Modifier.weight(.8f))

        }

    }
}

@Composable
fun itemDescription(title: String, subTitle: String,modifier: Modifier) {
    Column(modifier=modifier) {
        Text(
            text = title,
            style = MaterialTheme.typography.h6,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = subTitle,
            style = MaterialTheme.typography.subtitle1,
            fontWeight = FontWeight.Normal
        )

    }
}


 data class CateGory(val img:Int,val title:String,val subTitle:String)
 fun  getCategoryList():MutableList<CateGory>{
     val list= mutableListOf<CateGory>()
     list.add(CateGory(R.drawable.ic_baseline_supervised_user_circle_24,"Subhajit Sarkar","Project Manager"))
     list.add(CateGory(R.drawable.ic_baseline_supervised_blue_user_circle_24,"Subhadip Sarkar","Team Lead"))
     list.add(CateGory(R.drawable.ic_baseline_supervised_purple_user_circle_24,"Benoy Roy","Team Lead(Developer)"))
     list.add(CateGory(R.drawable.ic_baseline_supervised_green_user_circle_24,"Md.Hanif","Backend Developer"))
     list.add(CateGory(R.drawable.ic_baseline_supervised_red_user_circle_24,"Riju Nag","Software Tester"))
     list.add(CateGory(R.drawable.ic_baseline_supervised_deep_green_user_circle_24,"Moumita Jana","Software Tester"))
     list.add(CateGory(R.drawable.ic_baseline_supervised_orange_user_circle_24,"Soumyajit Sen","Android Developer"))
     list.add(CateGory(R.drawable.ic_baseline_supervised_user_circle_24,"Shankadip Dutta",".Net Developer"))
     list.add(CateGory(R.drawable.ic_baseline_supervised_blue_user_circle_24,"Md.Amiruddin",".Net Developer"))
     list.add(CateGory(R.drawable.ic_baseline_supervised_purple_user_circle_24,"Shuvendhu Shaw","Software Designer"))
     list.add(CateGory(R.drawable.ic_baseline_supervised_green_user_circle_24,"Abhisek Bera",".Net Developer"))
     list.add(CateGory(R.drawable.ic_baseline_supervised_red_user_circle_24,"Tuhina Mandal","Software Tester"))
     list.add(CateGory(R.drawable.ic_baseline_supervised_deep_green_user_circle_24,"Ritik Shaw","Android Developer"))
     list.add(CateGory(R.drawable.ic_baseline_supervised_orange_user_circle_24,"Madhurima Banik","Pl/Sql Developer"))
     list.add(CateGory(R.drawable.ic_baseline_supervised_user_circle_24,"Prassana Sarkar","Pl/Sql Developer"))
     list.add(CateGory(R.drawable.ic_baseline_supervised_blue_user_circle_24,"Anirban Mukherjee",".Net Developer"))
     list.add(CateGory(R.drawable.ic_baseline_supervised_purple_user_circle_24,"Asit Raul","Java Developer"))




     return list
 }