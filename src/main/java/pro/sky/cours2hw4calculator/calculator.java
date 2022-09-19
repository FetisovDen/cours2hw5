package pro.sky.cours2hw4calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class calculator {
    private final CalculatorService calculatorService;
    public calculator (CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
    @GetMapping
    public String Welcome() {
        return calculatorService.Welcome();
    }
    @GetMapping(path = "/plus")
        public String Plus(@RequestParam("num1")String num1, @RequestParam("num2") String num2){
            return  num1 + "+" + num2 +"=" + calculatorService.plus(num1, num2);
        }
    @GetMapping(path = "/minus")
    public String Minus(@RequestParam("num1")String num1, @RequestParam("num2") String num2){
        return  num1 + "-" + num2 +"=" + calculatorService.minus(num1, num2);
    }
    @GetMapping(path = "/multiply")
    public String Multiply(@RequestParam("num1")String num1, @RequestParam("num2") String num2){
        return  num1 + "*" + num2 +"=" + calculatorService.multiply(num1, num2);
    }
    @GetMapping(path = "/divide")
    public String Divide(@RequestParam("num1")String num1, @RequestParam("num2") String num2){
        if  (Integer.parseInt(num2) == 0)  return "На ноль делить нельзя";
        return  num1 + "/" + num2 +"=" + calculatorService.divide(num1, num2);
    }

    }



