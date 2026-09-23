package Idade;
import javax.swing.JOptionPane;
public class Idade {
    public static void main(String[] args){
        boolean func = true;
        int dia,mes,ano,idade,dian,mesn,anon;
        Pessoa p1 = new Pessoa();
        while(func == true){
            try{
                String nome =JOptionPane.showInputDialog(null,"Digite o seu nome: ");
                String x =JOptionPane.showInputDialog(null,"Digite o dia do seu nascimento: ");
                dia = Integer.parseInt(x); 
                String y =JOptionPane.showInputDialog(null,"Digite o mes do seu nascimento: ");
                mes = Integer.parseInt(y); 
                String z =JOptionPane.showInputDialog(null,"Digite o ano do seu nascimento: ");
                ano = Integer.parseInt(z);
                p1.AjustaDtNascimento(dia, mes, ano);
                boolean loop = true; 
                while(loop == true){
                    String opcao =JOptionPane.showInputDialog(null,"1.Informar idade\n2.Informar o Nome\n3.Ajustar a data de nascimento\n4.sair");
                    switch(opcao){
                        case "1":
                            idade = p1.CalcularIdade();
                            p1.InformaIdade(idade);
                        break;
                        case"2":
                            p1.InformaNome(nome);
                        break;
                        case"3":
                            String xn =JOptionPane.showInputDialog(null,"Digite o novo dia do seu nascimento: ");
                            dian = Integer.parseInt(xn); 
                            String yn =JOptionPane.showInputDialog(null,"Digite o novo mes do seu nascimento: ");
                            mesn = Integer.parseInt(yn); 
                            String zn =JOptionPane.showInputDialog(null,"Digite o novo ano do seu nascimento: ");
                            anon = Integer.parseInt(zn);
                            p1.AjustaDtNascimento(dian,mesn,anon);
                        break;
                        case"4":
                            loop = false;
                        break;
                    }

                }
                func = false;
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Digite um numero");
            }
        }



        

    }   

}
