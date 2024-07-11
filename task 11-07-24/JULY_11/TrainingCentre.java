public class TrainingCentre {

    static String name;
    static String location;
    static int capacity;
    static int numberOfRooms;
    static boolean hasProjectors;
    static double area; 
    static String headTrainer;
    static int numberOfStudents;
    static boolean isOpen;
    static String contactEmail;

    public static void main(String[] args) {
        TrainingCentre.name = "Xworkz";
        TrainingCentre.location = "BtmLayout";
        TrainingCentre.capacity = 100;
        TrainingCentre.numberOfRooms = 5;
        TrainingCentre.hasProjectors = true;
        TrainingCentre.area = 500.0;
        TrainingCentre.headTrainer = "RajajiNagar";
        TrainingCentre.numberOfStudents = 50;
        TrainingCentre.isOpen = true;
        TrainingCentre.contactEmail = "contact@x-workz.com";

        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Capacity: " + capacity + " people");
        System.out.println("Number of Rooms: " + numberOfRooms);
        System.out.println("Has Projectors: " + hasProjectors);
        System.out.println("Area: " + area + " square meters");
        System.out.println("Head Trainer: " + headTrainer);
        System.out.println("Number of Students: " + numberOfStudents);
        System.out.println("Is Open: " + isOpen);
        System.out.println("Contact Email: " + contactEmail);
    }
}
