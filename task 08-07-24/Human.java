public class Human {

    public static void introduce(String name) {
        System.out.println("Hello, I'm " + name);
    }

    public static void introduce(String name, int age) {
        System.out.println("Hello, I'm " + name + ", and I'm " + age + " years old");
    }

    public static void introduce(String name, int age, String occupation) {
        System.out.println("Hello, I'm " + name + ", I'm " + age + " years old, and I work as a " + occupation);
    }

    public static void introduce(String name, int age, String occupation, String hobby) {
        System.out.println("Hello, I'm " + name + ", I'm " + age + " years old, I work as a " + occupation +
                           ", and I enjoy " + hobby);
    }

}
