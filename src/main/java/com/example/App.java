package com.example;

import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String, String> myInfo = new HashMap<>();
        myInfo.put("name", "Vitaliy");
        myInfo.put("lastName", "Kuzmak");

        Gson gson = new Gson();
        String json = gson.toJson(myInfo);

        System.out.println(json);
    }
}

