
package src.exceptions;

public class QuantidadeInsuficienteException extends Exception {
    public QuantidadeInsuficienteException(int qnt) {
        super(String.format("Quantidade desejada: %d", qnt));
    }
}
