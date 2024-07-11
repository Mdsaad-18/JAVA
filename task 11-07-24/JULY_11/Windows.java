public class Windows {

    // Method with no return type
    public static void operatingSystem() {
        System.out.println("The name of the operating system is: Windows 11");
    }

    public static void operatingSystem(char name) {
        System.out.println("The name of the operating system is: " + name);
    }

    public static void operatingSystem(char name, int version) {
        System.out.println("Name: " + name + " Version: " + version);
    }

    public static void operatingSystem(char name, int version, boolean isSecure) {
        System.out.println("Name: " + name + " Version: " + version + " Secure: " + isSecure);
    }

    public static void operatingSystem(char name, int version, boolean isSecure, double size) {
        System.out.println("Name: " + name + " Version: " + version + " Secure: " + isSecure + " Size: " + size + " GB");
    }

    // Method with return type
    public static int operatingSystem(char name, int version, boolean isSecure, double size, int users) {
        System.out.println("Name: " + name + " Version: " + version + " Secure: " + isSecure + " Size: " + size + " GB" + " Users: " + users);
        return version;
    }

    public static void main(String[] args) {
        Windows.operatingSystem();
        Windows.operatingSystem('W');
        Windows.operatingSystem('W', 11);
        Windows.operatingSystem('W', 11, true);
        Windows.operatingSystem('W', 11, true, 30.5);
        Windows.operatingSystem('W', 11, true, 30.5, 100);
    }
}
