package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(61));
    }

    private static String getDurationString(long minutes, long seconds){
       if((minutes<0) || (seconds<0) || (seconds>60)){
           return "Invalid value";
       }

       long hours = minutes/60;
       long remainingMinutes = minutes%60;

       String hoursString = hours + "h";
       if(hours<10){
           hoursString="0"+hoursString;
       }

        String minutesString = remainingMinutes + "m";
        if(remainingMinutes<10){
            minutesString="0"+minutesString;
        }

        String secondsString = seconds + "s";
        if(seconds<10){
            secondsString="0"+secondsString;
        }

       return hoursString+" "+minutesString+" "+secondsString+"";
    }

    private static String getDurationString(long seconds){
        if(seconds<0){
            return "Invalid value";
        }

        long minutes = seconds/60;
        long remainingSeconds = seconds%60;
        return getDurationString(minutes,remainingSeconds);
    }
}
