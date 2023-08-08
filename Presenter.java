public class Presenter {
    private Model model;
    private View view;

    public Presenter(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void performCalculation() {
        double num1 = view.getNumberInput();
        String operator = view.getOperatorInput();
        double num2 = view.getNumberInput();

        try {
            double result = model.performOperation(num1, num2, operator);
            view.displayResult(result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}