package ru.eskina.springcourse.config.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.eskina.springcourse.calculator.CalculatorActionType;
import ru.eskina.springcourse.calculator.EnumConstantNotSupportedException;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/first")
public class FirstController {
    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name", required = false) String name,
                            @RequestParam(value = "surname", required = false) String surname,
                            Model model) {
        model.addAttribute("message", "Hello " +  name + " " + surname );

        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodbyePage() {
        return "first/goodbye";
    }

    @GetMapping("/calculator")
    public String calculate(HttpServletRequest request, Model model) {
        int a = Integer.valueOf(request.getParameter("a"));
        int b = Integer.valueOf(request.getParameter("b"));
        try {
            CalculatorActionType actionType = CalculatorActionType.getActionByName(request.getParameter("action"));
            String sign = actionType.getSign();
            int result;
            switch (actionType) {
                case MULTIPLY -> {result = a*b;}
                case ADD -> {result = a + b;}
                case SUBTRACT->{result = a - b;}
                case DIVIDE->{result = a / b;}
                default -> throw new IllegalStateException("Unexpected value: " + actionType);
            }
            model.addAttribute("message", String.format("%d %s %d = %d", a, sign, b, result));
        } catch (EnumConstantNotSupportedException e) {
            e.printStackTrace();
        }
        return "first/calculator";
    }
}
