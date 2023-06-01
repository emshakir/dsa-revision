package dsa.revision.others.removeduplicateObj;

import java.util.Objects;

public class Car {

    private String make;
    private String model;
    private int year;
    private boolean turnSignal;

    public Car() {
    }

    public Car(String make, String model, int year, boolean turnSignal) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.turnSignal = turnSignal;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isTurnSignal() {
        return turnSignal;
    }

    public void setTurnSignal(boolean turnSignal) {
        this.turnSignal = turnSignal;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.make);
        hash = 89 * hash + Objects.hashCode(this.model);
        hash = 89 * hash + this.year;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Car other = (Car) obj;
        if (this.year != other.year) {
            return false;
        }
        if (!Objects.equals(this.make, other.make)) {
            return false;
        }
        return Objects.equals(this.model, other.model);
    }

    @Override
    public String toString() {
        return "Car{" + "make=" + make + ", model=" + model + ", year=" + year + ", turnSignal=" + turnSignal + '}';
    }

    public static void main(String[] args) {
    }

}
