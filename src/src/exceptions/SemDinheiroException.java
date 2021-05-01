
package exceptions;

public class SemDinheiroException extends Exception {

    public SemDinheiroException(double valor) {
        super(String.format("Valor: %.2f", valor));
    }

}
