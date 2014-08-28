package com.example.jbworth.remindme;

import java.util.Random;

/**
 * Created by jbworth on 8/27/14.
 */
public class ReminderBook {

    //Member variable
    public String[] mReminders = {
            "Call Uncle.",
            "Buy milk and eggs.",
            "Take vitamins.",
            "Tape America's Got Talent",
            "Pay Gas Bill.",
            "Send e-mail to Mike.",
            "Fix shower.",
            "Make doctor's appointment.",
            "Get directions for trip.",
            "Book hotel."
    };

    //Method
    public String getReminder() {

        String reminder = "";

        // Randomly select a reminder.
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mReminders.length);

        reminder = mReminders[randomNumber];

        return reminder;

    }
}
