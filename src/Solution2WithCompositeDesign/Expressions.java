package Solution2WithCompositeDesign;


public class Expressions implements ArithmeticExpression{

    ArithmeticExpression leftExpression;
    ArithmeticExpression rightExpression;
    Operation operation;

    public Expressions(ArithmeticExpression left, ArithmeticExpression right, Operation operation){
        this.leftExpression = left;
        this.rightExpression = right;
        this.operation = operation;
    }

    public int evaluate(){
        int value = 0;

        switch (operation){
            case ADD:
                value = leftExpression.evaluate() + rightExpression.evaluate();
                break;
            case SUBTRACT:
                value = leftExpression.evaluate() - rightExpression.evaluate();
                break;
            case DIVIDE:
                value = leftExpression.evaluate() / rightExpression.evaluate();
                break;
            case MULTIPLY:
                value = leftExpression.evaluate() * rightExpression.evaluate();
                break;
        }

        System.out.println("Expression value is: " + value);
        return value;
    }
}
