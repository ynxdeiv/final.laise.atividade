package models;

import interfaces.Beneficiario;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Estagiario extends Funcionario implements Beneficiario {
    private int cargaHoraria;
    private List<String> beneficios;

    public Estagiario(String nome, String cpf, LocalDate dataAdmissao, double salarioBase, int cargaHoraria) {
        super(nome, cpf, salarioBase, dataAdmissao);
        this.cargaHoraria = cargaHoraria;
        this.beneficios = new ArrayList<>();
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() * (cargaHoraria / 30.0);
    }

    @Override
    public String getTipo() {
        return "Estagiário";
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