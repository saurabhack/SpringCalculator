package com.Calculator.SpringBootCalculator.restControler;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class CalculatorControler {

    @GetMapping("/calculator")
    public String calculator(){
        return "Calculator";
    }

    @GetMapping("/Calculations")
    public String calculations(HttpServletRequest request, Model model){

        int a= Integer.parseInt(request.getParameter("firstNumber"));
        String operator=request.getParameter("operator");
        int b=Integer.parseInt(request.getParameter("secondNumber"));

        int ans = 0;
        if(operator.equals("+")){
             ans =  a + b;
             System.out.print(ans);
        }
        else if(operator.equals("-")){
            ans=a-b;
            System.out.print(ans);
        }
        else if(operator.equals("/")){
            ans=a/b;
            System.out.print(ans);
        }
        else if(operator.equals("%")){
            ans=a%b;
            System.out.print(ans);
        }
        else if(operator.equals("*")){
            ans=a*b;
            System.out.print(ans);
        }

        model.addAttribute("ans",ans);

        return "calculations";
    }



}
