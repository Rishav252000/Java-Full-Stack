package app68;

import java.util.Stack;

public class M7 {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(100);
		stack.push(200);
		stack.push(300);
		stack.push(400);
		stack.push(500);
		stack.push(600);
		System.out.println(stack);
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		System.out.println(stack);
	}
}
