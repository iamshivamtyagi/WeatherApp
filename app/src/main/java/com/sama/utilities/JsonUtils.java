package com.sama.utilities;

import android.content.Context;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.net.HttpURLConnection;

public final class JsonUtils {

    public static String[] getSimpleWeatherStringsFromJson(Context context, String forecastJsonStr) throws JSONException {

        final String OWN_LIST = "list";

        final String OWN_TEMPERATURE = "temp";

        final String OWN_MAX = "max";
        final String OWN_MIN = "min";

        final String OWN_WEATHER = "weather";
        final String OWN_DESCRIPTION = "main";

        final String OWN_MESSAGE_CODE = "cod";

        String[] parsedWeatherData = null;

        JSONObject weatherJson = new JSONObject(forecastJsonStr);

        if (weatherJson.has(OWN_MESSAGE_CODE)) {
            int errorCode = weatherJson.getInt(OWN_MESSAGE_CODE);

            switch (errorCode) {
                case HttpURLConnection.HTTP_OK:
                    break;
                case HttpURLConnection.HTTP_NOT_FOUND:
                    return null;
                default:
                    return null;

            }
        }

        JSONArray weatherArray = weatherJson.getJSONArray(OWN_LIST);

        parsedWeatherData = new String[weatherArray.length()];

        long localDate = System.currentTimeMillis();
        long utcDate = SunshineDateUtils.getUTCDateFromLocal(localDate);
        long startDay = SunshineDateUtils.normalizeDate(utcDate);

        for(int i = 0 ; i < weatherArray.length() ; i++){
            String date;
            String highAndLow;
  
        }
    }
}
