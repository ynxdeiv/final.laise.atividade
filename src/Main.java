import exceptions.BeneficioInvalidoException;
import java.time.LocalDate;
import models.Desenvolvedor;
import models.Estagiario;
import models.Gerente;
import services.FuncionarioService;
import utils.FuncionarioUtils;

public class Main {
    public static void main(String[] args) {
        FuncionarioService service = new FuncionarioService();

        Desenvolvedor dev = new Desenvolvedor(
            "Ana", "123.456.789-00", LocalDate.of(2022, 1, 10), 3000, "Junior", new String[]{"Java", "Python"}
        );
        Gerente gerente = new Gerente(
            "Carlos", "987.654.321-00", LocalDate.of(2020, 5, 20), 6000
        );
        Estagiario estagiario = new Estagiario(
            "Lucas", "111.222.333-44", LocalDate.of(2023, 3, 1), 1500, 30
        );

        try {
            dev.adicionarBeneficio("Vale Refeição");
            gerente.adicionarBeneficio("Plano de Saúde");
            estagiario.adicionarBeneficio(""); 
        } catch (BeneficioInvalidoException e) {
            System.out.println("Erro ao adicionar benefício: " + e.getMessage());
        }

        dev.promover();
        gerente.adicionarBonusAnual(2000);

        service.adicionar(dev);
        service.adicionar(gerente);
        service.adicionar(estagiario);

        System.out.println("\n--- Funcionários cadastrados ---");
        for (var f : service.listar()) {
            FuncionarioUtils.imprimirDados(f);
        }
    }
}
