public class GitHub {

    // Static variables declaration
    public static String repoName = "Java-Project";
    public static int stars = 1500;
    public static int forks = 300;
    public static float issues = 45.5f;

    public static void getDetails() {
        String platform = "GitHub";
        System.out.println("Platform: " + platform);

        long totalRepos = 1000000L;
        System.out.println("Total Repos: " + totalRepos);

        String ceo = "Taufiq Raza";
        System.out.println("CEO: " + ceo);

        String headquarters = "Bengaluru";
        System.out.println("Headquarters: " + headquarters);
    }

    public static void setCreationYear(int year, long contributors) {
        int creationYear = year;
        System.out.println("Creation Year: " + creationYear);

        long totalContributors = contributors;
        System.out.println("Total Contributors: " + totalContributors);
    }

    public static void main(String[] args) {
        System.out.println("Repo Name: " + repoName);
        System.out.println("Stars: " + stars);
        System.out.println("Forks: " + forks);
        System.out.println("Issues: " + issues);

        GitHub.getDetails();
        GitHub.setCreationYear(2008, 300000L);
    }
}
