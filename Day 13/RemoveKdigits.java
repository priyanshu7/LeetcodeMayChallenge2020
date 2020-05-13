package may2020;

import java.util.Stack;

public class RemoveKdigits {
	
	public static String removeKdigits(String num, int k) {
        if(num.length() == k)
        	return "0";
        StringBuilder sb = new StringBuilder(num);
        while(k > 0) {
        	int i = 0;
        	while(i < sb.length() - 1 && sb.charAt(i) <= sb.charAt(i+1)) {
        		i++;
        	}
        	sb.delete(i, i+1);
        	k--;
        }
        
        while(sb.length() > 0 && sb.charAt(0) == '0') {
        	sb.delete(0, 1);
        }
        
        if(sb.length() == 0)
        	return "0";
        return sb.toString();
    }
	
	public static String removeKdigitsStack(String num, int k) {
        if(num.length() == k)
        	return "0";
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        int i = 0;
        while(i < num.length()) {
        	while(k > 0 && !stack.isEmpty() && num.charAt(i) < stack.peek()) {
        		stack.pop();
        		k--;
        	}
        	stack.push(num.charAt(i));
        	i++;
        }
        
        while(k > 0) {
        	stack.pop();
        	k--;
        }
        
        while(!stack.isEmpty()) {
        	sb.append(stack.pop());
        }
        
        while(sb.length() > 1 && sb.charAt(sb.length() - 1) == '0') {
        	sb.deleteCharAt(sb.length() - 1);
        }
        
        if(sb.length() == 0)
        	return "0";
        
        sb.reverse();
        
        
        return sb.toString();
    }
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ans = removeKdigits("739215642", 4);
		System.out.println(ans);

	}

}
