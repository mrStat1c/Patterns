package behavioral.interpreter.example_1.expressions;

// Терминальное выражение (конечное)
public class ContextExpression implements Expression {

    private String data;

    public ContextExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
