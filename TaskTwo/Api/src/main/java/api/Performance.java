/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

/**
 *
 * @author konst
 */
public class Performance {

    private final int mondayHours = 6;
    private final int tuesdayHours = 8;
    private final int wednesdayHours = 7;
    private final int thursdayHours = 5;
    private final int fridayHours = 4;

    public int getMondayHours() {
        return mondayHours;
    }

    public int getTuesdayHours() {
        return tuesdayHours;
    }

    public int getWednesdayHours() {
        return wednesdayHours;
    }

    public int getThursdayHours() {
        return thursdayHours;
    }

    public int getFridayHours() {
        return fridayHours;
    }

    public int getWeekHours() {

        return mondayHours
                + tuesdayHours
                + wednesdayHours
                + thursdayHours
                + fridayHours;
    }
}
