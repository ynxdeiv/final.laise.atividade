package models;

public class Gerente extends Funcionario{
    private int senha;
    public Gerente(String nome, String cpf, double salario){
        super(nome,cpf,salario);
    }
    @Override
    public double getBonificacao(){
        return super.getSalarioBase();
    }

}
