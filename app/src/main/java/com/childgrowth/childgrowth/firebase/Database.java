package com.childgrowth.childgrowth.firebase;

import java.util.HashMap;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by juanbravo on 9/6/17.
 */

public class Database {
    public static Object userWriteLock;
    public static HashMap<String, String> users = new HashMap<String, String>();


    /**
     * makeUser will store a user's email inside the database
     * @param id email's id
     * @param email is the actual email
     */
    public static void  makeUser (String id, String email){
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference userRef = database.getReference("Users Emails");
        DatabaseReference newUserRef = userRef.child(id);
        newUserRef.setValue(email);
    }

}
