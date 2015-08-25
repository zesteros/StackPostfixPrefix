
import java.util.Stack;
import javax.swing.JOptionPane;

public class PilaDemo {

    protected String equation;
    private final Stack<String> stack = new Stack<>();

    void setStack(String equation) {
        this.equation = equation;
        stack.clear();
        if (equation != null) {
            for (int i = 0; i < equation.length(); i++) {
                stack.push(equation.charAt(i) + "");
            }
            JOptionPane.showMessageDialog(null, "La pila infija es: \n" + stack);
        }
    }

    void preFix(String equation) {
        this.equation = equation;
        stack.clear();
        for (int i = 0; i < equation.length(); i++) {
            switch (equation.charAt(i)) {
                case '=':
                    stack.push(equation.charAt(i) + "");
                    break;
                case '+':
                    stack.push(equation.charAt(i) + "");
                    break;
                case '-':
                    stack.push(equation.charAt(i) + "");
                    break;
                case '*':
                    stack.push(equation.charAt(i) + "");
                    break;
                case '/':
                    stack.push(equation.charAt(i) + "");
                    break;
            }
        }
        for (int k = 0; k < equation.length(); k++) {
            switch (equation.charAt(k)) {
                case '=':
                    break;
                case '+':
                    break;
                case '-':
                    break;
                case '*':
                    break;
                case '/':
                    break;
                default:
                    stack.push(equation.charAt(k) + "");
                    break;
            }
        }
        JOptionPane.showMessageDialog(null, "La pila prefija es: \n" + stack);
    }

    void postFix(String equation) {
        this.equation = equation;
        stack.clear();
        for (int k = 0; k < equation.length(); k++) {
            switch (equation.charAt(k)) {
                case '=':
                    break;
                case '+':
                    break;
                case '-':
                    break;
                case '*':
                    break;
                case '/':
                    break;
                default:
                    stack.push(equation.charAt(k) + "");
                    break;
            }
        }
        for (int i = 0; i < equation.length(); i++) {
            switch (equation.charAt(i)) {
                case '=':
                    stack.push(equation.charAt(i) + "");
                    break;
                case '+':
                    stack.push(equation.charAt(i) + "");
                    break;
                case '-':
                    stack.push(equation.charAt(i) + "");
                    break;
                case '*':
                    stack.push(equation.charAt(i) + "");
                    break;
                case '/':
                    stack.push(equation.charAt(i) + "");
                    break;
            }
        }
        JOptionPane.showMessageDialog(null, "La pila postfija es: \n" + stack);
    }
}
