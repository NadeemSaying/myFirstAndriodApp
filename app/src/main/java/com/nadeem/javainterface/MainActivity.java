package com.nadeem.javainterface;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.widget.EditText;
import android.graphics.Color;
import android.content.res.Resources;
import android.util.TypedValue;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Layout
            RelativeLayout layout1 = new RelativeLayout(this);
            layout1.setBackgroundColor(Color.CYAN);

        // Button
            Button layout2 = new Button(this);
            layout2.setText("LOG IN");
            layout2.setBackgroundColor(Color.WHITE);

        // Username
            EditText username = new EditText(this);
                layout2.setId(1);
                username.setId(2);

            RelativeLayout.LayoutParams buttonDetails = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT);

            RelativeLayout.LayoutParams usernameDetails = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT);

                    usernameDetails.addRule(RelativeLayout.ABOVE, layout2.getId());
                    usernameDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
                    usernameDetails.setMargins(0,0,0,50);

                    buttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
                    buttonDetails.addRule(RelativeLayout.CENTER_VERTICAL);

            Resources r = getResources();

        // Add widget to layout (button is now child of Layoy)
            layout1.addView(layout2, buttonDetails);
            layout1.addView(username, usernameDetails);

        // set the activity to content/display to view
            setContentView(layout1);

    }
}
