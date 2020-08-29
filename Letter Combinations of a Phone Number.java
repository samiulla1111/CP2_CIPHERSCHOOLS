class Solution {
    public List<String> letterCombinations(String digits) {
    List<String> res = new ArrayList<>();
    HashMap<Integer, Character[]> hs = new HashMap<>();

    Solution s = new Solution();
    
    hs = s.getHashMap();
    
    if(digits.length() > 0)
        res = s.getStrings(digits, 0, "", hs, res);
            
    return res;
}

public List<String> getStrings(String digits, int i, String str, HashMap<Integer, Character[]> hs, List<String> res){
    if(i>=digits.length()){
        res.add(str);
        return res;
    }
    
    Character[] c = hs.get((int)digits.charAt(i) - 48);
    
    
    for(int j=0; j<c.length; j++){
        getStrings(digits, i+1, str + String.valueOf(c[j]), hs, res);
    }
    
    return res;
}


public HashMap<Integer,Character[]> getHashMap(){
    HashMap<Integer, Character[]> hs = new HashMap<>();
    
    Character[] c2 = {'a', 'b', 'c'};
    hs.put(2, c2);
    
    Character[] c3 = {'d', 'e', 'f'};
    hs.put(3, c3);
    
    Character[] c4 = {'g', 'h', 'i'};
    hs.put(4, c4);
    
    Character[] c5 = {'j', 'k', 'l'};
    hs.put(5, c5);
    
    Character[] c6 = {'m', 'n', 'o'};
    hs.put(6, c6);
    
    Character[] c7 = {'p', 'q', 'r', 's'};
    hs.put(7, c7);
    
    Character[] c8 = {'t', 'u', 'v'};
    hs.put(8, c8);
    
    Character[] c9 = {'w', 'x', 'y', 'z'};
    hs.put(9, c9);
    
    return hs;
}
}