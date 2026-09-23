package Idade;

public class genios {
    public static void main(String[] args){
        Pessoa einstein = new Pessoa();
        einstein.InformaNome("Albert Einstein");
        einstein.AjustaDtNascimento(14, 3, 1879);
        int idadeEinstein = einstein.CalcularIdade();
        einstein.InformaIdade(idadeEinstein);

        Pessoa newton = new Pessoa();
        newton.InformaNome("Isaac Newton");
        newton.AjustaDtNascimento(4, 1, 1643);
        int idadeNewton = newton.CalcularIdade();
        newton.InformaIdade(idadeNewton);
    }
}