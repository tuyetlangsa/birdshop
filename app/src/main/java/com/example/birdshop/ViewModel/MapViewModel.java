package com.example.birdshop.ViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.birdshop.map.models.GeocodeResult;
import com.example.birdshop.map.models.PlaceSuggestion;
import com.example.birdshop.map.models.RouteResult;
import com.example.birdshop.repository.MapRepository;

import java.util.List;

public class MapViewModel extends ViewModel {

    private final MapRepository repository = new MapRepository();

    private final MutableLiveData<List<PlaceSuggestion>> suggestions = new MutableLiveData<>();
    private final MutableLiveData<List<GeocodeResult>> geocodeResults = new MutableLiveData<>();
    private final MutableLiveData<List<RouteResult>> routeResults = new MutableLiveData<>();
    private final MutableLiveData<String> error = new MutableLiveData<>();

    public LiveData<List<PlaceSuggestion>> getSuggestions() { return suggestions; }
    public LiveData<List<GeocodeResult>> getGeocodeResults(){ return geocodeResults; }
    public LiveData<List<RouteResult>> getRouteResults(){ return routeResults; }
    public LiveData<String> getError(){ return error; }

    public void search(String q){
        repository.geocode(q, (data, err) -> {
            if (err != null) error.postValue(err.getMessage());
            else geocodeResults.postValue(data);
        });
    }

    public void autoComplete(String q){
        repository.autocomplete(q, (data, err) -> {
            if (err != null) {
                error.postValue("Autocomplete failed: " + err.getMessage());
                return;
            }
            suggestions.postValue(data);
        });
    }

    public void route(double sLat,double sLng,double eLat,double eLng,int alt){
        repository.route(sLat, sLng, eLat, eLng, alt, (data, err) -> {
            if (err != null) error.postValue(err.getMessage());
            else routeResults.postValue(data);
        });
    }
    public void reverseGeocode(double lat, double lng) {
        repository.reverseGeocode(lat, lng, (data, err) -> {
            if (err != null) error.postValue(err.getMessage());
            else geocodeResults.postValue(data);
        });
    }
}