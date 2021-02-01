package edu.arapahoe;
public class Main {
    public static void main(String[] args) {
        carObject myJeep = new carObject();
        myJeep.setState("Started");
        myJeep.setState("Stopped");
        myJeep.setState("Abc123");
        myJeep.setState(null);
    }
}