package com.migcavero.fraglibrary.fragmentlibraryexercise;

import android.net.Uri;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.migcavero.fraglibrary.fragmentlib.CustomFragment;

public class MainActivity extends AppCompatActivity implements CustomFragment.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager = getSupportFragmentManager();
        CustomFragment customFragment = (CustomFragment) fragmentManager.findFragmentById(R.id.main_fragment);
        customFragment.changeText("Hello World!");
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
