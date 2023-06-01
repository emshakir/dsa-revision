package dsa.revision.others.removeduplicateObj;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {

    @Override
    public int compare(Car c1, Car c2) {

        int make = c1.getMake().compareToIgnoreCase(c2.getMake());

        if (make != 0) {
            return make;
        }

        int model = c1.getModel().compareToIgnoreCase(c2.getModel());

        if (model != 0) {
            return model;
        }

        return Integer.compare(c1.getYear(), c2.getYear());
    }

}
