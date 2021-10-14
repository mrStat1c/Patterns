package behavioral.interpreter.example_2.expressions;

// Терминальное выражение (конечное)
public class NumberExpression implements Expression {

    int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    public int interpret() {
        return this.number;
    }
}
