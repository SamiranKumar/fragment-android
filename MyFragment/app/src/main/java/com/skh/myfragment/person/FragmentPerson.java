package com.skh.myfragment.person;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.skh.myfragment.R;

import static com.skh.myfragment.person.ConfigKey.*;

/**
 * Created by Shomu on 10/7/2017.
 */

public class FragmentPerson extends Fragment implements IViewPerson {
    private Activity activity;
    private IPresenterPerson iPresenterPerson;
    private TextView tvName;
    private TextView tvAge;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_person, container, false);


        tvName =  view.findViewById(R.id.tv_name);
        tvAge =  view.findViewById(R.id.tv_age);

        iPresenterPerson = new PresenterPerson(this);
        iPresenterPerson.readBundleData(getArguments());


        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        activity = getActivity();

    }

    public FragmentPerson() {
    }


    public static FragmentPerson createInstance(Person person) {
        Bundle bundle = new Bundle();
        bundle.putString(KEY_NAME, person.getName());
        bundle.putInt(KEY_AGE, person.getAge());

        FragmentPerson fragment = new FragmentPerson();
        fragment.setArguments(bundle);

        return fragment;
    }

    @Override
    public void setData(Person person) {
        tvName.setText(String.format("Name: ", person.getName()));
        tvAge.setText(String.format("Age  : ", person.getAge()));
    }


}
