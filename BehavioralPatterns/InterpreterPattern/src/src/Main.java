package src;
public class Main {
    public static void main(String[] args) {
        Expression five = new NumberExpression(5);
        Expression ten = new NumberExpression(10);
        Expression addExpression = new AddExpression(five, ten);
        Expression subtractExpression = new SubtractExpression(ten, five);

        InterpreterClient clientAdd = new InterpreterClient(addExpression);
        InterpreterClient clientSubtract = new InterpreterClient(subtractExpression);

        System.out.println("Result of 5 + 10: " + clientAdd.evaluate());
        System.out.println("Result of 10 - 5: " + clientSubtract.evaluate());
    }
}