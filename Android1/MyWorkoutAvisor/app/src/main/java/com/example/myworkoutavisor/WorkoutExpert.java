package com.example.myworkoutavisor;
import java.util.List;

import java.util.List;
import java.util.ArrayList;

public class WorkoutExpert {
    List<String> getWorkouts (String workouttypes)
    {
        List<String> workout = new ArrayList<String>();

        if(workouttypes.equals("Chest"))
        {
            workout.add("Bench Press");
            workout.add("Cable Flys");
        }
        else if(workouttypes.equals("Triceps")){
            workout.add("Tricep Ext");
            workout.add("Tricep PushDown");
        }
        else if(workouttypes.equals("Shoulder")){
            workout.add("Shouder Press");
        }
        else if(workouttypes.equals("Biceps")){
            workout.add("Biceps Curls");
        }
        return workout;
    }
}
