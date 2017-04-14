package com.childgrowth.childgrowth.classes;

/**
 * Created by Kevin on 4/14/2017.
 */

import java.io.IOException;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.prefs.Preferences;


public class ChildUser implements Serializable{


    //private Picture pictureURL;
    private int id;
    private Date birthday;
    private String name;
    private String gender;
    private double weight;
    private double height;
    private HashMap<String, String> potentialMatches;
    private HashMap<String, String> swipedLeft;
    private HashMap<String, String> swipedRight;
    private HashMap<String, String> finalizedMatches;
    private Preferences preferences;



    public ChildUser()
    {
    }

    public ChildUser(int userId, String name, String birthday, String gender,double weight, double height){
        this.id = userId;
        this.name = name;
        this.gender=gender;
        this.weight=weight;
        this.height=height;
        DateFormat format = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        Date date = null;
        try {
            date = format.parse(birthday);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }






}
