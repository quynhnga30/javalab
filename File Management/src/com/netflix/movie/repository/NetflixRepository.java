package com.netflix.movie.repository;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.netflix.movie.model.Netflix;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class NetflixRepository {
    public List<Netflix> netflixList = new ArrayList<>();

    public void getData(){
        try{
            FileReader reader = new FileReader("Netflix.json");
            //chuyen tu JSON text -> JSON object
            Type objectType = new TypeToken<List<Netflix>>(){}.getType();
            netflixList = new Gson().fromJson(reader,objectType);

            for (Netflix netflix: netflixList) {
                System.out.println(netflix);// call toString()

            }


        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        NetflixRepository netflixRepository = new NetflixRepository();
        netflixRepository.getData();

    }

}
