package exceptions;

public class EstagiarioInvalidoException extends RuntimeException {
    public EstagiarioInvalidoException(String mensagem) {
        super(mensagem);
    }
}
