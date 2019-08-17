package com.sama.data;

import android.content.Context;

public class DefaultPreferences {

    public static final String PREF_CITY_NAME = "city_name";

    public static final String PREF_COORD_LAT = "coord_lat";
    public static final String PREF_COORD_LONG = "coord_long";

    private static final String DEFAULT_WEATHER_LOCATION = "110036,INDIA";
    private static final double[] DEFAULT_WEATHER_COORDINATES = {28.6724656, 77.1595679};

    private static final String DEFAULT_MAP_LOCATION =
            "Delhi - 110035";

    static public void setLocationDetails(Context c, String cityName, double lat, double lon) {
    }

    static public void setLocation(Context c, String locationSetting, double lat, double lon) {
    }

    static public void resetLocationCoordinates(Context c) {
    }
    public static String getPreferredWeatherLocation(Context context) {
        return getDefaultWeatherLocation();
    }
    public static boolean isMetric(Context context) {
        return true;
    }

    public static double[] getLocationCoordinates(Context context) {
        return getDefaultWeatherCoordinates();
    }

    public static boolean isLocationLatLonAvailable(Context context) {
        return false;
    }

    private static String getDefaultWeatherLocation() {
        return DEFAULT_WEATHER_LOCATION;
    }

    public static double[] getDefaultWeatherCoordinates() {
        return DEFAULT_WEATHER_COORDINATES;
    }
}