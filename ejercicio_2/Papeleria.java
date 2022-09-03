package ejercicio_2;

import javax.swing.JOptionPane;

public class Papeleria
{
    public static void main(String[] args) 
    {
       //declaramos una variable
       double x;
       double costototal;
        double iva;

       //input
       x = Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor del producto: "));
        costototal = 0;
        iva = 500;
        //processing 

        if(x <= 3000)
        {
            costototal = ((0.15* x) + (x));
            JOptionPane.showMessageDialog(null,"el valor a pagar: "+ "$" + costototal );
        }
        if (x > 3000 & x <= 6000 )
        {
                costototal = (x + iva );
                JOptionPane.showMessageDialog(null,"el valor a pagar: "+ "$" + costototal  );
        }
        else( x > 6000 )
        {
            costototal = ((x*0.25) + (x));
            JOptionPane.showMessageDialog(null,"el valor a pagar: "+ "$" + costototal );
        }
        
    }
    






}