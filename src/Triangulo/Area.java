package Triangulo;
import javax.swing.JOptionPane;

public class Area {

    public static void main(String[] args){
        boolean func = true;
        float a,b;
        Triangulo tri1 = new Triangulo();
        while (func) {
            try{
                String x =JOptionPane.showInputDialog(null,"Digite o valor base do triangulo: ");
                b = Float.parseFloat(x);
                String y =JOptionPane.showInputDialog(null,"Digite o valor altura do triangulo: ");
                a = Float.parseFloat(y);
                tri1.SetterTriangulo(b,a);
                func = false;
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Digite um numero");
            }
        }
        
        JOptionPane.showMessageDialog(null,"a area do triangulo Triangulo = "+tri1.GetTriangulo());
                
    }
    
}
