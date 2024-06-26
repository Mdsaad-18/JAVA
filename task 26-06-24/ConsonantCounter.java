//6. developer needs to count the consonants in the array 
public class ConsonantCounter {
    public static void main(String[] args) {
        String[] arr = {"hello", "world", "this", "is", "a", "test"};
        System.out.println("Total consonants: " + countConsonants(arr));
    }

    public static int countConsonants(String[] arr) {
        int totalCount = 0;
        String vowels = "aeiouAEIOU";
        
        for (String str : arr) {
            for (char ch : str.toCharArray()) {
                if (Character.isLetter(ch) && vowels.indexOf(ch) == -1) {
                    totalCount++;
                }
            }
        }
        
        return totalCount;
    }
}
