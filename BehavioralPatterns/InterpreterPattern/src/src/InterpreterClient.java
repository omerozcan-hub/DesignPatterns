package src;
public class InterpreterClient {
    private Expression expression;

    public InterpreterClient(Expression expression) {
        this.expression = expression;
    }

    public int evaluate() {
        return expression.interpret();
    }
}
