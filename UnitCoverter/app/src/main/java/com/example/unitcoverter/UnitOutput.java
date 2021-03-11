package com.example.unitcoverter;

import androidx.lifecycle.MutableLiveData;

public class UnitOutput {
    public MutableLiveData<String> unit;

    public UnitOutput(String unit) {
        this.unit = new MutableLiveData<>();
        this.unit.setValue(unit);
    }
}
