public class Human {
    public boolean isLeapYear(int year) {
        return (year % 4 == 0) ? ((year % 100 != 0) ? true : ((year % 400 == 0) ? true : false)) : false;
    }

    public static void main(String[] args) {
        Human human = new Human();
        
        int year = 2024;
        boolean result = human.isLeapYear(year);
        
        System.out.println(year + " is a leap year: " + result);
        
        year = 2023;
        result = human.isLeapYear(year);
        
        System.out.println(year + " is a leap year: " + result);
    }
}
