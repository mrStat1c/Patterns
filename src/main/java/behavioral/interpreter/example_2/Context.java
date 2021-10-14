package behavioral.interpreter.example_2;

import behavioral.interpreter.example_2.expressions.Expression;
import behavioral.interpreter.example_2.expressions.MinusExpression;
import behavioral.interpreter.example_2.expressions.NumberExpression;
import behavioral.interpreter.example_2.expressions.PlusExpression;

public class Context {

    Expression evaluate(String s) {

        int pos = s.length() - 1;

        while (pos > 0) {
            if (Character.isDigit(s.charAt(pos))) {
                pos--;
            } else {
                Expression left = evaluate(s.substring(0, pos));
                Expression right = new NumberExpression(Integer.parseInt(s.substring(pos + 1)));
                char operator = s.charAt(pos);
                switch (operator) {
                    case '-':
                        return new MinusExpression(left, right);
                    case '+':
                        return new PlusExpression(left, right);
                }
            }
        }
        return new NumberExpression(Integer.parseInt(s));
    }
}
