class Solution {
    public static String find(String str){
        String s="";
        int n=1;
        int i=0;
        for(;i<str.length()-1;i++){
            if(str.charAt(i+1)!=str.charAt(i)){
                char p=(char)(n+'0');
                s=s+p+str.charAt(i);
                n=1;
            }
            else{
                n++;
            }
        }
        char p=(char)(n+'0');
        s=s+p+str.charAt(i);
        return s;
    }
    public String countAndSay(int n) {
        String str="1";
        for(int i=2;i<=n;i++){
            str=find(str);
        }
        return str;
    }
}