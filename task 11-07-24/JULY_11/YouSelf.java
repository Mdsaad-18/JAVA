public class YouSelf {

    public static void getYourSelf() {
        System.out.println("I got a job");
        YouSelf.setGoal();
        YouSelf.partTime();
        YouSelf.hardwork();
    }
    
    public static void setGoal() {
        System.out.println("Set your goals");
    }
    
    public static void partTime() {
        System.out.println("Part-time work");
    }
    
    public static void hardwork() {
        System.out.println("Hard work pays off");
    }
    
    public static void main(String[] args) {
        YouSelf.getYourSelf();
    }
}
