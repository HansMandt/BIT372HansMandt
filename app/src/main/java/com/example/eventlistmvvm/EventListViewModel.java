package com.example.eventlistmvvm;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class EventListViewModel extends ViewModel {
    // TODO: Complete the VM class
    // Make the MutableLiveData a singleton
    private MutableLiveData<String> data;

    private EventListViewModel(){}

    public MutableLiveData<String> getCurrentText() {
        if(data == null) {
            data = new MutableLiveData<>();
        }
        return data;
    }
}
