package com.coderzf1.counter;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {
    private MutableLiveData<Integer> _counter = new MutableLiveData<>(0);
    LiveData<Integer>counter = _counter;

    void increaseCounter(){
        _counter.postValue(_counter.getValue()+1);
    }
}
