package behavioral.interpreter.example_2.expressions;

// Нетерминальное выражение (промежуточное)
public class MinusExpression implements Expression {

    Expression left;
    Expression right;

    public MinusExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return this.left.interpret() - this.right.interpret();
    }
}
