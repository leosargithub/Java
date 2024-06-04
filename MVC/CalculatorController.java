import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    private final CalculatorModel model;
    private final CalculatorView view;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;

        this.view.addCalculateListener(new CalculateListener());
    }

    class CalculateListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double firstNumber, secondNumber;

            try {
                firstNumber = view.getFirstNumber();
                secondNumber = view.getSecondNumber();
                
                String operation = view.getOperation();

                if (operation.equals("Add")) {
                    model.add(firstNumber, secondNumber);
                } else if (operation.equals("Subtract")) {
                    model.subtract(firstNumber, secondNumber);
                }

                view.setResult(model.getResult());
            } catch (NumberFormatException ex) {
                view.displayErrorMessage("Please enter two valid numbers");
            }
        }
    }
}
