package org.itstep;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteJSON {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("src/date/data.json");
            JSONTokener tokener = new JSONTokener(file);
            JSONObject obj = new JSONObject(tokener);
            //System.out.println(obj.toString(2));

            JSONArray persons = obj.getJSONArray("persons");
            for (int i=0; i<persons.length(); i++){
                JSONObject person = persons.getJSONObject(i);
                String name = person.getString("name");
                System.out.println(name);
                String phone = person.getString("phone");
                System.out.println(phone);
                System.out.println("emails: ");
                JSONArray emails = person.getJSONArray("emails");
                for (int j = 0; j < emails.length(); j++) {
                    System.out.println(emails.get(j));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
