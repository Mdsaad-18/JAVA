public class Gmail {

    // Method 1
    public static void checkInbox() {
        boolean hasUnreadEmails = true;
        boolean hasSpam = false;
        boolean hasImportantEmails = true;
        boolean hasPromotions = false;
        boolean hasSocialEmails = true;

        if (hasUnreadEmails) {
            System.out.println("There are unread emails in the inbox.");
        }

        if (hasSpam) {
            System.out.println("There are spam emails in the inbox.");
        }

        if (hasImportantEmails) {
            System.out.println("There are important emails in the inbox.");
        }

        if (hasPromotions) {
            System.out.println("There are promotional emails in the inbox.");
        }

        if (hasSocialEmails) {
            System.out.println("There are social emails in the inbox.");
        }
    }

    // Method 2
    public static void checkEmailStatus() {
        boolean isRead = true;
        boolean isStarred = true;
        boolean isArchived = false;
        boolean isDeleted = false;
        boolean isDraft = true;

        if (isRead) {
            System.out.println("The email is read.");
        }

        if (isStarred) {
            System.out.println("The email is starred.");
        }

        if (isArchived) {
            System.out.println("The email is archived.");
        }

        if (isDeleted) {
            System.out.println("The email is deleted.");
        }

        if (isDraft) {
            System.out.println("The email is in draft.");
        }
    }

    // Method 3
    public static void checkAccountSettings() {
        boolean notificationsEnabled = true;
        boolean twoFactorAuthEnabled = true;
        boolean darkModeEnabled = false;
        boolean vacationResponderEnabled = true;
        boolean emailForwardingEnabled = false;

        if (notificationsEnabled) {
            System.out.println("Notifications are enabled.");
        }

        if (twoFactorAuthEnabled) {
            System.out.println("Two-factor authentication is enabled.");
        }

        if (darkModeEnabled) {
            System.out.println("Dark mode is enabled.");
        }

        if (vacationResponderEnabled) {
            System.out.println("Vacation responder is enabled.");
        }

        if (emailForwardingEnabled) {
            System.out.println("Email forwarding is enabled.");
        }
    }

 }