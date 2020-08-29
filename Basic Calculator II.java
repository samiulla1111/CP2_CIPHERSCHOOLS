class Solution {
    public int calculate(String s) {
        s = s.replaceAll(" ","");
        System.out.println(s);
        ArrayList<Integer> numbers = getNumbers(s);
        ArrayList<Character> operations = getOperations(s);
        Stack<Integer> stack = new Stack<>();
        stack.push(numbers.get(0));
        int num_index = 1, ops_index = 0;
        while(num_index<numbers.size() && ops_index<operations.size()) {
            char op = operations.get(ops_index);
            if(op=='+') stack.push(numbers.get(num_index));
            else if (op=='-') stack.push(numbers.get(num_index)*-1);
            else if (op=='*') stack.push(stack.pop()*numbers.get(num_index));
            else if (op=='/') stack.push((int)(stack.pop()/numbers.get(num_index)));
            else ;
            num_index++;
            ops_index++;
        }
        int answer = 0;
        while(!stack.isEmpty()) answer+= stack.pop();
        return answer;
    }
    
    public ArrayList<Character> getOperations(String s) {
        // Return the operations in the expression string
        ArrayList<Character> operations = new ArrayList<>();
        for(int i = 0; i<s.length(); i++) {
            char operation = s.charAt(i);
            if(operation=='+'||operation=='-'||operation=='*'||operation=='/') {
                operations.add(operation);
            }
        }
        return operations;
    }
    
    public ArrayList<Integer> getNumbers(String s) {
        // Return the numbers in the expression string
        ArrayList<Integer> numbers = new ArrayList<>();
        String[] nums = s.split("\\+|\\-|\\/|\\*");
        for(String num : nums) numbers.add(Integer.parseInt(num));
        return numbers;
    }
}