
package Calculator;


import static Calculator.OperatorType.Add;
import static Calculator.OperatorType.Divide;
import static Calculator.OperatorType.Multiply;
import static Calculator.OperatorType.Subtract;

public class CalculatorTest {

    
    public static void main(String[] args) {
        Operator operator1 = new Operator(0);
        Operator operator2 = new Operator(2);
        Operator operator3 = new Operator(-13);
        Operator operator4 = new Operator(31);
        Operator operator5 = new Operator(-13);
        Operator operator6 = new Operator(-0.5);
        Operator operator7 = new Operator(0.75);
        Operator operator8 = new Operator(Math.PI);
        Operator operator9 = new Operator(1/3);
        Operator operator18 = new Operator(Double.NEGATIVE_INFINITY);
        Operator operator19 = new Operator(Double.NaN);
        Operator operator10 = new Operator(Multiply,operator1,operator2);
        Operator operator11 = new Operator(Add,operator10,operator3);
        Operator operator12 = new Operator(Divide,operator4,operator5);
        Operator operator13 = new Operator(Add,operator12,operator11);
        Operator operator14 = new Operator(Subtract,operator13,operator11);
        Operator operator15 = new Operator(Add,operator6,operator11);
        Operator operator16 = new Operator(Add,operator7,operator14);
        Operator operator17 = new Operator(Multiply,operator15,operator16);
        Operator operator20 = new Operator(Add,operator8,operator17);
        Operator operator21 = new Operator(Add,operator20,operator18);
        Operator operator22 = new Operator(Multiply,operator21,operator19);

        System.out.println(operator22 + " = " + operator22.getValue());
    }
}
