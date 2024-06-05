import javax.swing.*;
public class IfComElse {
    public static void main(String[] args) {
        String aux = JOptionPane.showInputDialog("Forneça o número do mês: ");
        if (aux != null) {
            try {
                int mes = Integer.parseInt(aux);
                if (mes >= 1 && mes <= 12) {
                    JOptionPane.showMessageDialog(null,
                            "Número do mês válido!\n " + mes);
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Número do mês invalido!\n " + mes);
                }
            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null,
                        "Digite apenas valores inteiros!" + erro);
            }
        }
        else {
            JOptionPane.showMessageDialog(null,
                    "Opção cancelada.");
        }
        System.exit(0);
    }
}
