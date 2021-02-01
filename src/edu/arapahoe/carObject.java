package edu.arapahoe;

public class carObject {
    private String myState = null;

    void setState(String state) {

        if (state == null) {
            throw new IllegalArgumentException("Car state cannot be null");
        } else

        switch (state.toUpperCase()) {
            case ("STARTED"):
                myState = state;
                System.out.println("Car has been started");
                break;
            case ("STOPPED"):
                myState = state;
                System.out.println("Car has been stopped");
                break;
            default:
                System.out.println("Invalid state was passed " + state);
        }

    }
}