package pro.sky.cours2hw4calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public String Welcome() {
        return "Добро пожаловать в калькулятор";
    }
    public String plus(String num1, String num2){
        int num_1 = Integer.parseInt(num1);
        int num_2 = Integer.parseInt(num2);
        int num12 = num_1 + num_2;
        String result = String.valueOf(num12);
        return  result;
    }
    public String minus(String num1, String num2){
        int num_1 = Integer.parseInt(num1);
        int num_2 = Integer.parseInt(num2);
        int num12 = num_1 - num_2;
        String result = String.valueOf(num12);
        return  result;
    }
    public String multiply(String num1, String num2){
        int num_1 = Integer.parseInt(num1);
        int num_2 = Integer.parseInt(num2);
        int num12 = num_1 * num_2;
        String result = String.valueOf(num12);
        return  result;
    }
    public String divide(String num1, String num2)  {
        double num_1 = Integer.parseInt(num1);
        double num_2 = Integer.parseInt(num2);
        double num12 = num_1 / num_2;
        String result = String.valueOf(num12);
        return  result;
    }
}
