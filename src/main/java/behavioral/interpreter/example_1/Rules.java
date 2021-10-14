package behavioral.interpreter.example_1;

import behavioral.interpreter.example_1.expressions.AndExpression;
import behavioral.interpreter.example_1.expressions.Expression;
import behavioral.interpreter.example_1.expressions.OrExpression;
import behavioral.interpreter.example_1.expressions.ContextExpression;

public class Rules {

    public static Expression getCorrectMccExpression(){
        Expression mcc5812 = new ContextExpression("5812");
        Expression mcc6059 = new ContextExpression("6059");
        return new OrExpression(mcc5812, mcc6059);
    }

    public static Expression getGoodEveningExpression(){
        Expression alcohol = new ContextExpression("Alcohol");
        Expression pizza = new ContextExpression("Pizza");
        return new AndExpression(alcohol, pizza);
    }
}
