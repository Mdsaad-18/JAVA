public class RealEstateRunner {

    public static void main(String[] args) {
        RealEstate.PropertyID();
        RealEstate.ToBuyer("John Doe");
        RealEstate.ToLocation();
        String[] features = {"Swimming Pool", "Gym", "Parking", "Garden"};
        RealEstate.PropertyDetails(features);
    }
}
