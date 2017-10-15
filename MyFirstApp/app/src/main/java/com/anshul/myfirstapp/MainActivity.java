package com.anshul.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    Toast Button
    public void toastMe(View view)
    {
        // Create a toast
        Toast myToast = Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT);

        // Show Toast
        myToast.show();
    }

//    Count Button
    public void countMe(View view)
    {
        //Get textview
        TextView tv = (TextView) findViewById(R.id.textView);

        // Get current count value
        String countString = tv.getText().toString();
        Integer count = Integer.parseInt(countString);

        //Increment the count vaue
        count++;

        // Set the incremented value in the textview
        tv.setText(count.toString());
    }

    private static final String TOTAL_COUNT = "total_count";

    //    Random Button
    public void randomMe(View view)
    {
        // Create an Intent to start the second activity
        Intent randomIntent = new Intent(this, SecondActivity.class);

        // Get the text view that shows the count.
        TextView showCountTextView = (TextView) findViewById(R.id.textView);

        // Get the value of the text view.
        String countString = showCountTextView.getText().toString();

        // Convert the count to an int
        int count = Integer.parseInt(countString);

        // Add the count to the extras for the Intent.
        randomIntent.putExtra(TOTAL_COUNT, count);

        // Start the new activity.
        startActivity(randomIntent);
    }

}
