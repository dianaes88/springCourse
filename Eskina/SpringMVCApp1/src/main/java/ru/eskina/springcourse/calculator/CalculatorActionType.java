package ru.eskina.springcourse.calculator;

public enum CalculatorActionType {
    MULTIPLY("multiplication", "*"),
    ADD("addition", "+"),
    SUBTRACT("subtraction", "-"),
    DIVIDE("division", "/");
    private String action;
    private String sign;

    private CalculatorActionType(String action, String sign) {
        this.action = action;
        this.sign = sign;
    }

    public String getAction() {
        return action;
    }

    public String getSign() {
        return sign;
    }

    public static CalculatorActionType getActionByName(String actionName) throws EnumConstantNotSupportedException {
        switch (actionName) {
            case("multiplication"):
                return MULTIPLY;
            case("addition"):
                return ADD;
            case("subtraction"):
                return SUBTRACT;
            case("division"):
                return DIVIDE;
            default:
                throw new EnumConstantNotSupportedException("This action processing  isn't supported");
        }
    }
}
