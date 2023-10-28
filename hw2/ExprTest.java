import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class ExprTest {
    @Test
    public void testConstantEvaluation() {
        Expr.Constant constant = new Expr.Constant(5.0);
        assertThat(constant.evaluate()).isEqualTo(5.0);
    }

    @Test
    public void testNegateEvaluation() {
        Expr.Negate negation = new Expr.Negate(new Expr.Constant(3.0));
        assertThat(negation.evaluate()).isEqualTo(-3.0);
    }

    @Test
    public void testExponentEvaluation() {
        Expr.Exponent exponent = new Expr.Exponent(new Expr.Constant(2.0), 3);
        assertThat(exponent.evaluate()).isEqualTo(8.0);
    }

    @Test
    public void testAdditionEvaluation() {
        Expr.Addition addition = new Expr.Addition(new Expr.Constant(2.0), new Expr.Constant(3.0));
        assertThat(addition.evaluate()).isEqualTo(5.0);
    }

    @Test
    public void testMultiplicationEvaluation() {
        Expr.Multiplication multiplication = new Expr.Multiplication(new Expr.Constant(2.0), new Expr.Constant(3.0));
        assertThat(multiplication.evaluate()).isEqualTo(6.0);
    }

    @Test
    public void testComplexExpressionEvaluation() {
        var two = new Expr.Constant(2);
        var four = new Expr.Constant(4);
        var negOne = new Expr.Negate(new Expr.Constant(1));
        var sumTwoFour = new Expr.Addition(two, four);
        var mult = new Expr.Multiplication(sumTwoFour, negOne);
        var exp = new Expr.Exponent(mult, 2);
        var res = new Expr.Addition(exp, new Expr.Constant(1));

        assertThat(res.evaluate()).isEqualTo(37.0);
    }
}
