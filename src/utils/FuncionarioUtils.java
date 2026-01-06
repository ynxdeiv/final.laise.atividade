package utils;

import models.Funcionario;

public class FuncionarioUtils {
    public static void imprimirDados(Funcionario funcionario) {
        System.out.println(funcionario.getDadosCompletos() + " | Salário: " + funcionario.calcularSalario());
    }
}
