class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int n=s.length();
        int val=map.get(s.charAt(n-1));
        for(int i=n-2;i>=0;i--){
            int temp=map.get(s.charAt(i+1));
           
            if(map.get(s.charAt(i))<temp){
                val-=map.get(s.charAt(i));
            }
             else{
                 val+=map.get(s.charAt(i));
             }                
                             
                             
        }
                              
        return val;
    }
}