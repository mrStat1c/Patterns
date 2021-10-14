package behavioral.interpreter.example_1;

import behavioral.interpreter.example_1.expressions.Expression;

public class Client {


    public static void main(String[] args) {


        Expression correctMcc = Rules.getCorrectMccExpression();
        Expression goodEvening = Rules.getGoodEveningExpression();

        System.out.println("MCC is correct?\n" + correctMcc.interpret("1111"));
        System.out.println("Evening is good?\n" + goodEvening.interpret("Super Party Alcohol Memes Girls Pizza Cats"));

    }
}
