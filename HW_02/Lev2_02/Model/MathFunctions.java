package java_35e_HW.HW_02.Lev2_02.Model;

public class MathFunctions implements IMathFunction {

    @Override
    public double power(double a, int b) {
        double answer = 1;
        for (int i = 0; i < b; i++) {
            answer *= a;
        }
        return answer;
    }

    @Override
    public double absComplex(double a, double b) {
        return Math.sqrt(power(a, 2)+power(b, 2));
    }

    public double lengthCircle(double radius) {
        return PI * 2 * radius;
    }
}
