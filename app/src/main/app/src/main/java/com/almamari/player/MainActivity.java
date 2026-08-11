package com.almamari.player;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView title = new TextView(this);
        title.setText("Almamari");
        title.setTextSize(32);
        title.setTextColor(Color.WHITE);
        title.setGravity(17);
        title.setBackgroundColor(Color.BLACK);

        setContentView(title);
    }
}
