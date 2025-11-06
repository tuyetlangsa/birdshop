package com.example.birdshop.map.core.interfaces;

import com.example.birdshop.map.models.GeocodeResult;

import java.util.List;

public interface GeocodingProvider {
    void geocode(String q, Callback cb);
    void reverse(double lat, double lng, Callback cb);
    void reverseGeocode(double lat, double lng, Callback cb); // thêm dòng này

    interface Callback {
        void onSuccess(List<GeocodeResult> results);
        void onError(Throwable t);
    }
}