
import javax.swing.*;

public class PilaNotacionMain {

    public static void main(String[] args) {

        PilaDemo pilaDemo = new PilaDemo();
        String menu[] = {"Notación prefija", "Notación postfija"};
        String outMenu[] = {"Si", "No"};
        String outDecision = null;
        while (!"No".equals(outDecision)) {
            String equation = JOptionPane.showInputDialog(
                    "Ingrese una ecuación cualquiera");
            String decision = (String) JOptionPane.showInputDialog(
                    null,
                    "¿Qué notación desea para la ecuación?",
                    null,
                    JOptionPane.PLAIN_MESSAGE,
                    new ImageIcon(),
                    menu, menu[0]);
            pilaDemo.setStack(equation);
            switch (decision) {
                case "Notación prefija":
                    pilaDemo.preFix(equation);
                    break;
                case "Notación postfija":
                    pilaDemo.postFix(equation);
                    break;
            }
            outDecision = (String) JOptionPane.showInputDialog(
                    null, 
                    "¿Desea intentar de nuevo?",
                    null,
                    JOptionPane.PLAIN_MESSAGE,
                    new ImageIcon(),
                    outMenu, outMenu[0]);
        }
    }
}
