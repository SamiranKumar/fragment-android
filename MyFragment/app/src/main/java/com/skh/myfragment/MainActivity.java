package com.skh.myfragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.skh.myfragment.person.FragmentPerson;
import com.skh.myfragment.person.Person;

public class MainActivity extends AppCompatActivity {
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Person person = new Person();
        person.setName("Samiran Kumar");
        person.setAge(24);

        Fragment fragment = FragmentPerson.createInstance(person);
        addFragment(fragment);
    }


    public void addFragment(Fragment fragment) {

        String TAG = fragment.getClass().getSimpleName();
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.fragment_container, fragment, TAG);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commitAllowingStateLoss();
    }

    public void showFragment(Fragment fragment) {

        String TAG = fragment.getClass().getSimpleName();
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, fragment, TAG);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commitAllowingStateLoss();
    }
}
