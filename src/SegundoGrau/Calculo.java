package SegundoGrau;
import javax.swing.JOptionPane;

public class Calculo{
    double a,b,c,r1,r2,delta,rd;

    Calculo(){
        a = 0;
        b = 0;
        c = 0;
        delta = 0;
        rd = 0;
        r1 = 0;
        r2 = 0;          
    }
    
    public void SetterCalculo(int num1,int num2,int num3){
        a = num1;
        b = num2;
        c = num3;
    }
    
    public void GetCalculo(){
        delta = (b*b)-4*(a*c);
        rd = Math.sqrt(delta);        
        if(delta<0){
            JOptionPane.showMessageDialog(null,"Não existem raízes reais");
        }
        else if(delta==0){
            r1 = (-b+rd)/(2*a);
            JOptionPane.showMessageDialog(null,"Existe apenas uma raiz real: "+r1);

        }
        else{
            r1 = (-b+rd)/(2*a);
            r2 = (-b-rd)/(2*a);
            JOptionPane.showMessageDialog(null,"Existem duas raízes reais: "+r1+" e "+r2);
        }
    }
    

}


