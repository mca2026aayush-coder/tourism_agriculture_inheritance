/**
 * Represents a farm tourism activity.
 * @author Aayush
 */
class FarmTour implements Farming, TouristActivity {

    public void farming() {
        System.out.println("Tourist is learning farming.");
    }

    public void tourism() {
        System.out.println("Tourist is enjoying farm tourism.");
    }
}