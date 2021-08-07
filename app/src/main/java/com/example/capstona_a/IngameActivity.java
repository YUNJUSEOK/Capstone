package com.example.capstona_a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class IngameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingame);
        Intent intent3 = getIntent();
        CUserDTO User =(CUserDTO)intent3.getSerializableExtra("user");
        TextView textview3 = (TextView)findViewById(R.id.name_summoner_ingame);
        ImageView img=(ImageView)findViewById(R.id.img_ingame);
        textview3.setText(User.getName());
        ListView listView = (ListView)findViewById(R.id.listview_ingame);
        String api_key="RGAPI-20a0010d-63d7-4d65-916d-ea00d5178511";
        String imgSrc = "https://ddragon.leagueoflegends.com/cdn/11.15.1/img/profileicon/"+String.valueOf(User.getProfileIconId())+".png";
        Glide.with(this).load(imgSrc).into(img);

        /*
        MatchlistDto list = new MatchlistDto();
        list = response.body();

        MatchData matchData = list.getMatchData();*/



    }
}