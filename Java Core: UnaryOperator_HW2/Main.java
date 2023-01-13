package unarytwo;

import java.util.function.UnaryOperator;

public class Main {

	public static void main(String[] args) {
		
		String text = "kjgjgfk1123 ghg 123  ";
		
		UnaryOperator<String> unOp = a -> {
			String newText = "";
			char[] chars = a.toCharArray();
			for (Character c : chars) {
				if(Character.isDigit(c)) {
					newText += c;
				}
			}
			return newText;
		};
		
		String modText = unOp.apply(text);
		System.out.println(modText);

	}

}
