package com.company.BranchEason;

public class Main {

    public static void main(String[] args) {
        int i = 0;
        String[] weekday= {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int[] temps = {45, 29, 10, 22,28, 33};
        int[] percippercent ={95, 60, 25, 5, 0, 75, 90};
        for (i = 0; i < temps.length; i++) {
            if (temps[i] <=32 && percippercent[i]>50) {
                System.out.print("On "+weekday[i]+" The temp will be "+temps[i]+"'F");
                System.out.println(" With a "+percippercent[i]+"% chance of precipitation ");
            }


        }
    }
}