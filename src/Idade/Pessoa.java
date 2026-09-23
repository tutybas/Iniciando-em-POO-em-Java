package Idade;
import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Pessoa {
    //atributos
    String nome;
    int dia,mes,ano,idade,dian,mesn,anon;

    //config da data:
    LocalDate dataAtual = LocalDate.now();
    int anoAtual = dataAtual.getYear();
    int mesAtual = dataAtual.getMonthValue();
    int diaAtual = dataAtual.getDayOfMonth();

    //construtor
    Pessoa(){
        nome = "";
        dia = 0;
        mes = 0;
        ano = 0;
        idade = 0;
        dian = 0;
        mesn = 0;
        anon = 0;
    }   

    public void InformaNome(String nome){
        JOptionPane.showMessageDialog(null,"seu nome é "+nome);
    }

    public int CalcularIdade (){
        idade = anoAtual - ano;
        if(mesAtual<mes){
            idade--;
        }
        else if(mesAtual==mes && diaAtual<dia){
            idade--;
        }
        return idade;
    }

    public void InformaIdade(int idade){
        JOptionPane.showMessageDialog(null,"Sua idade é "+idade);
    }

    public void AjustaDtNascimento(int dian, int mesn, int anon){
        dia = dian;
        mes = mesn;
        ano = anon;

    }

  

}
