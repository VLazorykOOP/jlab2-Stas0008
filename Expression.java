import java.util.Scanner;
import java.util.Stack;

public class Expression {

    public int evaluate(String expression) {
        
        Stack<Integer> numbers = new Stack<>();
        
        int num = 0; 
        char sign = '+';
        
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }
            
            if (!Character.isDigit(ch) && ch != ' ' || i == expression.length() - 1) {
                if (sign == '+') {
                    numbers.push(num);
                } else if (sign == '-') {
                    numbers.push(-num);
                } else if (sign == '*') {
                    numbers.push(numbers.pop() * num);
                }
                sign = ch;
                num = 0;
            }
        }
        
        int result = 0;
        while (!numbers.isEmpty()) {
            result += numbers.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Expression evaluator = new Expression();
        
        System.out.print("Введiть арифметичний вираз:");
        String expression = scanner.nextLine();
        
        int result = evaluator.evaluate(expression);
        
        System.out.println("Результат: " + result);
        
        scanner.close();
    }
}
