public class House {
    
    public static void displayFamilyDetails(String... familyMembers) {
        System.out.println("Family Details:");
        for (String member : familyMembers) {
            System.out.println("- " + member);
        }
    }
}
