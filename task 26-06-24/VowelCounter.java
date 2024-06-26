//5. developer needs to count vowels in the array 
public class VowelCounter {
    public static void main(String[] args) {
        String[] arr = {"hello", "world", "this", "is", "a", "test"};
        System.out.println("Total vowels: " + countVowels(arr));
    }

    public static int countVowels(String[] arr) {
        int totalCount = 0;
        String vowels = "aeiouAEIOU";
        
        for (String str : arr) {
            for (char ch : str.toCharArray()) {
                if (vowels.indexOf(ch) != -1) {
                    totalCount++;
                }
            }
        }
        
        return totalCount;
    }
}
