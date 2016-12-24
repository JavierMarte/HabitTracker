package com.example.kaiso.habittracker;

import java.util.ArrayList;

/**
 * Created by kaiso on 12/22/2016.
 */
public class Habit {

    ArrayList<String> companies;

    int icons;
    String name;



    public void setIcon(int icon){
        this.icons = icon;

    }

    public int getIcon(){
        return this.icons;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

}
