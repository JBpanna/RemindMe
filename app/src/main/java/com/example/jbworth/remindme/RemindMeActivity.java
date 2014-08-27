package com.example.jbworth.remindme;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class RemindMeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remind_me);

        // Declare our view variables
        final TextView reminderLabel = (TextView) findViewById(R.id.reminderTextView);
        Button showReminderLabel = (Button) findViewById(R.id.showReminderButton);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //The button was clicked, so show a new reminder.
                String reminder = "";
                // Randomly select a reminder.
                Random randomGenerator = new Random();
                int randomNumber = randomGenerator.nextInt(3);
                reminder = randomNumber + "";

                //Update the label with a randomly selected reminder.
                reminderLabel.setText(reminder);
            }
        };
            showReminderLabel.setOnClickListener(listener);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.remind_me, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}