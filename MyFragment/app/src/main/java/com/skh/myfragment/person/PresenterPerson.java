package com.skh.myfragment.person;

import android.os.Bundle;

/**
 * Created by Shomu on 10/7/2017.
 */

public class PresenterPerson implements IPresenterPerson {

    private IViewPerson iViewPerson;

    public PresenterPerson(IViewPerson iViewPerson) {
        this.iViewPerson = iViewPerson;
    }

    @Override
    public void readBundleData(Bundle bundle) {

    }
}
