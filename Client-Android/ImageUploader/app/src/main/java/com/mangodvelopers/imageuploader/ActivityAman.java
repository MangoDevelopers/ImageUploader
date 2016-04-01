package com.mangodvelopers.imageuploader;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by AmanTugnawat on 31-03-16.
 */
public class ActivityAman extends AppCompatActivity {
    TextView gfdgfd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aman);
        Button andab=(Button)findViewById(R.id.button);
        gfdgfd=(TextView)findViewById(R.id.editTextId);

        andab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gfdgfd.setText("Mango");
            }
        });

    }
}
