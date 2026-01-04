package models;

import java.time.LocalDate;

public class Desenvolvedor extends Funcionario{
    private String [] linguagens;
    private String nivel;
    private double bonusPorProjeto;

    public Desenvolvedor(String nome, String cpf, LocalDate dataAdmissao, double salarioBase, String nivel, String[] linguagens){
        super(nome, cpf, salarioBase, dataAdmissao);
        this.nivel = nivel;
        this.linguagens = linguagens;
        this.bonusPorProjeto = 0;
    }

    @Override
    public double calcularSalario(){
        double multiplicador = switch (nivel.toUpperCase()) {
            case "JUNIOR" -> 1.0;
            case "PLENO" -> 1.5;
            case "SENIOR" -> 2.0;
            default -> 1.0;
        };
        return this.getSalarioBase() *multiplicador *bonusPorProjeto;
    }
    
    @Override
    public String getTipo(){
        return "Desenvolvedor "+nivel;
    }

    public void adicionarBonus(double bonus){
        this.bonusPorProjeto+=bonus;
    }

    public void promover() {
        if (nivel.equalsIgnoreCase("JUNIOR")) {
            nivel = "PLENO";
            System.out.println(getNome() + " promovido(a) para Pleno!");
        } else if (nivel.equalsIgnoreCase("PLENO")) {
            nivel = "SENIOR";
            System.out.println(getNome() + " promovido(a) para Senior!");
        } else {
            System.out.println(getNome() + " já está no nível máximo.");
        }
    }

    public String[] getLinguagens(){
        return linguagens;
    }
}
