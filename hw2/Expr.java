package hw2;
public sealed interface Expr {
    double evaluate();

    public record Constant(double value) implements Expr {
        @Override
        public double evaluate() {
            return value;
        }
    }

    public record Negate(Expr operand) implements Expr {
        @Override
        public double evaluate() {
            return -operand.evaluate();
        }
    }

    public record Exponent(Expr base, int exponent) implements Expr {
        @Override
        public double evaluate() {
            return Math.pow(base.evaluate(), exponent);
        }
    }

    public record Addition(Expr left, Expr right) implements Expr {

        @Override
        public double evaluate() {
            return left.evaluate() + right.evaluate();
        }
    }

    public record Multiplication(Expr left, Expr right) implements Expr {
        @Override
        public double evaluate() {
            return left.evaluate() * right.evaluate();
        }
    }
}
