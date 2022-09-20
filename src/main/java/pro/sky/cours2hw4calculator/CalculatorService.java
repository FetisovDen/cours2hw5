package pro.sky.cours2hw4calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int plus(int num1, int num2){
        int result = num1 + num2;
        return  result;
    }
    public int minus(int num1, int num2){
        int result = num1 - num2;
        return  result;
    }
    public int multiply(int num1, int num2){
        int result = num1 * num2;
        return  result;
    }
    public double divide(int num1, int num2)  {
        double result = (double)num1 / num2;
        return  result;
    }
}
