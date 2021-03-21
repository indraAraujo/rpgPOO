/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.exceptions;

/**
 *
 * @author indra
 */
public class SemDinheiroException extends Exception {

    public SemDinheiroException(double valor) {
        super(String.format("Valor: %.2f", valor));
    }

}
