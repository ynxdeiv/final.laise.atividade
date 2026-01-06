package models;

import interfaces.Beneficiario;
import interfaces.Promovivel;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Gerente extends Funcionario implements Beneficiario, Promovivel {
    private double bonusAnual;
    private List<String> beneficios;

    public Gerente(String nome, String cpf, LocalDate dataAdmissao, double salarioBase) {
        super(nome, cpf, salarioBase, dataAdmissao);
        this.bonusAnual = 0;
        this.beneficios = new ArrayList<>();
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + bonusAnual;
    }

    @Override
    public String getTipo() {
        return "Gerente";
    }

    public void adicionarBonusAnual(double bonus) {
        this.bonusAnual += bonus;
    }

    @Override
    public void promover() {
        System.out.println(getNome() + " já está no cargo máximo de Gerente.");
    }

    @Override
    public void adicionarBeneficio(String beneficio) {
        if (beneficio == null || beneficio.isBlank()) {
            throw new exceptions.BeneficioInvalidoException("Benefício não pode ser vazio ou nulo.");
        }
        beneficios.add(beneficio);
    }

    @Override
    public String[] listarBeneficios() {
        return beneficios.toArray(new String[0]);
    }
}