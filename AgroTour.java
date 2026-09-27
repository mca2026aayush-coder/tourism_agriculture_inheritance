/**
 * Represents an agricultural tourism activity.
 * @author Aayush
 */
class AgroTour extends Tourist implements Farming, TouristActivity {

    public void farming() {
        System.out.println("Tourist is learning agricultural activities.");
    }

    public void tourism() {
        System.out.println("Tourist is enjoying agricultural tourism.");
    }

    void agroTour() {
        System.out.println("Tourist is visiting an agricultural farm.");
    }
}