package behavioral.interpreter.example_2;

import behavioral.interpreter.example_2.expressions.Expression;

public class Client {


    public static void main(String[] args) {

        String s = "4-8+13";
        Expression exp = new Context().evaluate(s);
        System.out.println(s + "=" + exp.interpret());

    }
}
