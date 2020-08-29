class Solution {
    public String minWindow(String s, String t) {
        int left = 0, right = 0;
        int[] arrS = new int[256];
        int[] arrT = new int[256];
        for(int i=0; i<t.length(); i++) {
            arrT[t.charAt(i)]++;
        }
        int found = 0;
        String min = "";
        while(right < s.length()) {
            if(arrT[s.charAt(right)] > 0) {
                if(arrS[s.charAt(right)]++ < arrT[s.charAt(right)]) {
                    found++;
                }
            }
            right++;
            while(found == t.length()) {
                if(min.length() == 0 || min.length() > right - left) {
                    min = s.substring(left, right);
                }
                if(arrT[s.charAt(left)] > 0 && arrS[s.charAt(left)]-- <= arrT[s.charAt(left)]) {
                    found--;
                }
                left++;
            }
        }
        
        return min;
    }
}