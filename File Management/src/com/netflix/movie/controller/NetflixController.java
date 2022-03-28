package com.netflix.movie.controller;

import com.netflix.movie.model.Netflix;
import com.netflix.movie.repository.NetflixRepository;

import java.util.List;

public class NetflixController {

    // nhac object tu class khac sang day -> chay duoc
    NetflixRepository netflixRepository = new NetflixRepository();
    public void searchMovieByName(List<Netflix> list, String name){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getTitle().contains(name)){
                System.out.println(list.get(i));//toString();

            }
        }

    }
    public void searchMovieByCategory(List<Netflix> list, String name){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getCategory().contains(name)){
                System.out.println(list.get(i));//toString();

            }
        }


    }
    public void searchMovieByLanguage(List<Netflix> list, String name){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getLanguage().contains(name)){
                System.out.println(list.get(i));//toString();

            }
        }
    }
    public void countMovieByCategory(){}


}
