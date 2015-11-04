package com.koombea.mvpsample.view.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.koombea.mvpsample.R;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String string = getIntent().getStringExtra("name");
        String stringLastName = getIntent().getStringExtra("last_name");
        String stringCarrear = getIntent().getStringExtra("carrear");


        TextView textView = (TextView) findViewById(R.id.textView_name);
        TextView textViewLastName = (TextView) findViewById(R.id.textView_last_name);
        TextView textViewCarrear = (TextView) findViewById(R.id.textView_carrear);

        textViewLastName.setText(stringLastName);
        textViewCarrear.setText(stringCarrear);
        textView.setText(string);

    }

}
