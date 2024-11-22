package calculator;

public class Calculator {

    public double calculate(double firstNumber, double secondNumber, char operator) {
        if (operator == '*') {
            return firstNumber * secondNumber;
        }

        if (operator == '+'){
            return firstNumber + secondNumber;
        }

        if(operator == '-'){
            return firstNumber - secondNumber;
        }

        return 0;
    }
}
