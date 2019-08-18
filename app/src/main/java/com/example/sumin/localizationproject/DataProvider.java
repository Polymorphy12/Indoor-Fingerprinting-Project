package com.example.sumin.localizationproject;

/**
 * Created by Sumin on 2018-05-01.
 */

public abstract class DataProvider {
    public abstract String getName();
    public abstract Object getData();
    public void onStartPushing() {}
    public void onStopPushing() {}
}
