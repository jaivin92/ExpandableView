package com.example.myapplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Data {

    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> fruitname = new ArrayList<String>();
        fruitname.add("Banana");
        fruitname.add("Mango");
        fruitname.add("Orange");
        fruitname.add("Apple");
        fruitname.add("Kiwi");
        fruitname.add("Papaya");
        fruitname.add("Strawberries");
        fruitname.add("Watermelon");
        fruitname.add("Grapes");
        fruitname.add("Guava");

        List<String> vegetablename = new ArrayList<String>();
        vegetablename.add("Potato");
        vegetablename.add("Tomato");
        vegetablename.add("Peas");
        vegetablename.add("Brinjal");
        vegetablename.add("Tomato");
        vegetablename.add("Cauliflower");
        vegetablename.add("Lady Finger");
        vegetablename.add("Radish");
        vegetablename.add("Onion");
        vegetablename.add("Garlic");

        List<String> flowername = new ArrayList<String>();
        flowername.add("Rose");
        flowername.add("Lotus");
        flowername.add("Jasmine");
        flowername.add("Sunflower");
        flowername.add("Marigold");
        flowername.add("Daisy");
        flowername.add("Lily");
        flowername.add("Tulip");
        flowername.add("Chrysanthemum");
        flowername.add("Hiptage");

        expandableListDetail.put("FRUIT NAME", fruitname);
        expandableListDetail.put("VEGETABLES NAME", vegetablename);
        expandableListDetail.put("FLOWERS NAME", flowername);
        return expandableListDetail;
    }
}
