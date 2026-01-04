package models;
import java.time.LocalDate;
public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salarioBase;
    private LocalDate dataAdmissao;


    public Funcionario(String nome, String cpf, double salarioBase, LocalDate dataAdmissao) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
        this.dataAdmissao = dataAdmissao;
    }

    public abstract double calcularSalario();
    public abstract String getTipo();

    public String getDadosCompletos(){
        return String.format("Nome: %s | CPF: %s | Tipo: %s | Admissão: %s", nome,cpf, getTipo(),dataAdmissao);
    }

    public int getTempoEmpresa(){
        return LocalDate.now().getYear() - dataAdmissao.getYear();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
