package SegundoGrau;
import javax.swing.JOptionPane;

public class Equacao {
    
    public static void main(String[] args){
        boolean func = true;
        int num1,num2,num3;
        Calculo eq1 = new Calculo();        
        while(func){
            try{
            String x =JOptionPane.showInputDialog(null,"Digite o valor do a: ");
            num1 = Integer.parseInt(x); 
            String y =JOptionPane.showInputDialog(null,"Digite o valor do b: ");
                num2 = Integer.parseInt(y); 
            String z =JOptionPane.showInputDialog(null,"Digite o valor do c: ");
            num3 = Integer.parseInt(z); 
            eq1.SetterCalculo(num1, num2, num3);            
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Digite um numero");
            }
            eq1.GetCalculo();
            func = false;
        }
    }
    
}
