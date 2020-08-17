class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(numRows<=0){
            return list;
        }
        List<Integer> a1=new ArrayList<>();
        a1.add(1);
        list.add(a1);
        if(numRows==1){
            return list;
        }
        List<Integer> a2=new ArrayList<>();
        a2.add(1);
        a2.add(1);
        list.add(a2);
        if(numRows==2){
            return list;
        }
        
        for(int i=1;i<numRows-1;i++){
             a1=list.get(i);
            List<Integer> a3=new ArrayList<>();
             a3.add(1);
            for(int j=1;j<a1.size();j++){
                a3.add(a1.get(j-1)+a1.get(j));
            }
            a3.add(1);
            list.add(a3);
        }
        return list;
    }
}