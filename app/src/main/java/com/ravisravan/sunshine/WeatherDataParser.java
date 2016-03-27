package com.ravisravan.sunshine;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by ravisravankumar on 11/12/15.
 */
public class WeatherDataParser {

    public static double getMaxTemperatureForDay(String jsonStr,int dayIndex){
        double maxTemp = -1;
        try {
            JSONObject jsonObject = new JSONObject(jsonStr);
            if(jsonObject!=null && jsonObject.has("list")){
                JSONArray jsonArray = jsonObject.getJSONArray("list");
                if(jsonArray!=null && jsonArray.length()<=dayIndex) {
                    JSONObject dayTempObject = jsonArray.getJSONObject(dayIndex);
                    if(dayTempObject!=null && dayTempObject.has("max")){
                        maxTemp = dayTempObject.getDouble("max");
                    }
                }
            }


        } catch (JSONException e) {
            e.printStackTrace();
        }
        return maxTemp;
    }
}
