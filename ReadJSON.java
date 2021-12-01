package org.itstep;

import netscape.javascript.JSObject;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ReadJSON {
    public static void main(String[] args) {
        FileWriter file = null;
        JSONObject main = new JSONObject();
        JSONArray persons = new JSONArray();
        main.put("persons",persons);

        JSONObject obj1 = new JSONObject();
        obj1.put("name", "Vlad");
        obj1.put("phone", "+375336065444");
        persons.put(obj1);

        JSONArray emails1 = new JSONArray();
        emails1.put("datamail.ru");
        emails1.put("mainmail.ru");
        obj1.put("emails", emails1);

        JSONObject obj2 = new JSONObject();
        obj2.put("name", "Demo");
        obj2.put("phone", "+375449743214");
        persons.put(obj2);

        JSONArray emails2 = new JSONArray();
        emails2.put("data2mail.ru");
        emails2.put("main2mail.ru");
        obj2.put("emails", emails2);

        try {
            file = new FileWriter("src/date/data.json");
            file.write(main.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                //file.flush();
                file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
