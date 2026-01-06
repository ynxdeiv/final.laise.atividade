package exceptions;

public class BeneficioInvalidoException extends RuntimeException {
    public BeneficioInvalidoException(String mensagem) {
        super(mensagem);
    }
}
