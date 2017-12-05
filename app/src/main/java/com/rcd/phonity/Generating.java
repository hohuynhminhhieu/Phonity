package com.rcd.phonity;

import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

/**
 * Created by Duc Hung on 05/12/2017.
 */

public class Generating{
    private ArrayList<UserModel> userArrayList;

    public Generating(){
        userArrayList = new ArrayList<UserModel>();
    }

    public void generate(int numberOfUsers){
        FirebaseDatabase.getInstance().getReference().removeValue();
        generateListUsers(numberOfUsers);
    }

    private ArrayList<UserModel> generateListUsers(int numberOfUsers){
        ArrayList<UserModel> userArrayList = new ArrayList<UserModel>();

        for(int i = 0; i < numberOfUsers; i++) {
            userArrayList.add(generateSingleUser(i));
        }

        return userArrayList;
    }
    private UserModel generateSingleUser(int userID){
        UserModel newUser = new UserModel();
        newUser.setUserID(userID);
        newUser.setUsername("phonity" + userID);
        newUser.setPassword("phonity" + userID);

        FirebaseDatabase
                .getInstance()
                .getReference()
                .child("root")
                .child("users")
                .child(newUser.getUsername() + "-" + newUser.getPassword())
                .setValue(newUser);

        return newUser;
    }

}

