package com.example.stephentaylor.daftcatapp_espresso;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Ste on 03/04/2017.
 */

public class CatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat);
        TextView greeting = (TextView)findViewById(R.id.greeting);
        String catMasterName = getIntent().getStringExtra("EXTRA_NAME");
        greeting.setText((catMasterName == null || catMasterName.equals("")) ? getString(R.string.meow_master) : String.format(getString(R.string.meow), catMasterName));
    }
}
