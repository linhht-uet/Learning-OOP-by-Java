package Task1;


public class Subtraction extends BinaryExpression{
    Expression left;
    Expression right;

    public Subtraction(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Expression left() {
        return this.left;
    }

    @Override
    public Expression right() {
        return this.right;
    }

    @Override
    public String toString() {
        return "(" + left.toString() + "-" + right.toString() + ")" ;
    }

    @Override
    public int evaluate() {
        return this.left.evaluate()-this.right.evaluate();
    }
}
