import java.util.*; 
class Main {
    public static boolean isSubSequence(String str1,String str2)  
    { 
        int m = str1.length(), n = str2.length(); 
  
        int j = 0;  
        for (int i = 0; i < n && j < m; i++) 
        { 
            if (str1.charAt(j) == str2.charAt(i))  
            { 
                j++; 
            } 
        } 
  
        return (j == m); 
    } 
   
    public static String findLongestString(Vector<String> dict,String str) 
    { 
        String result = ""; 
        int length = 0; 
        for (String word : dict) 
        { 
            
            if (length < word.length() && 
                isSubSequence(word, str)) 
            { 
                result = word; 
                length = word.length(); 
            } 
        } 
        return result; 
    } 
  
    
    public static void main(String[] args)  
    { 
        String[] arr = {"ale", "apple", "monkey", "plea"}; 
        Vector dict = new Vector(Arrays.asList(arr)); 
        String str = "abpcplea"; 
        System.out.println(findLongestString(dict, str)); 
    } 
}