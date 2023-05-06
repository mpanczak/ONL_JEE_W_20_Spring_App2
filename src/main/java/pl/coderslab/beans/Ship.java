package pl.coderslab.beans;

public class Ship {
    Captain capitan;

    public Ship(Captain capitan) {
        this.capitan = capitan;
    }

    public Captain getCaptain() {
        return capitan;
    }
}
