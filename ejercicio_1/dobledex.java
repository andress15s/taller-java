package ejercicio_1;

import javax.swing.JOptionPane;

public class dobledex 
{
    public static void main(String[] args) 
    {
        int numero;
        int doble;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite el número: "));
        doble = (numero * 2);
        JOptionPane.showMessageDialog(null, "El doble de " + numero + " es " + doble + "!", "Doble Número",
                JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}