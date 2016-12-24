package com.example.kaiso.habittracker;

import java.util.ArrayList;

/**
 * Created by kaiso on 12/23/2016.
 */
public class HabitList {


    ArrayList<Habit> list = new ArrayList<Habit>();


    ////////////////////////////////////////
    public void setList(Habit name){

        //this.list = name;
        list.add(name);

    }

    public ArrayList<Habit> getList(){


        return this.list;
    }



}
