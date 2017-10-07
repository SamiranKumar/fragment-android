package com.skh.myfragment.person;

import android.os.Bundle;

import com.skh.myfragment.LogPrint;

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
        Person person = new Person();

        if (bundle != null) {
            person.setName(bundle.getString(ConfigKey.KEY_NAME));
            person.setAge(bundle.getInt(ConfigKey.KEY_AGE));
            LogPrint.print("bundle != null");

        }else {
            LogPrint.print("bundle is null");

        }
        LogPrint.print(""+person.toString());


        iViewPerson.setData(person);
    }
}
