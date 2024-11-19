package Solution2WithCompositeDesign;



public class Main {

    /*
                *
 left         /   \    right
expression   2     +    expression
                  / \
                 1   7

     */



    public static void main(String args[]){
        ArithmeticExpression two = new Number(2);
        ArithmeticExpression one = new Number(1);
        ArithmeticExpression seven = new Number(7);


        ArithmeticExpression addExpression = new Expressions(one, seven, Operation.ADD);
        ArithmeticExpression parentExpression = new Expressions(two, addExpression, Operation.MULTIPLY);

        System.out.println(parentExpression.evaluate());

    }
}
