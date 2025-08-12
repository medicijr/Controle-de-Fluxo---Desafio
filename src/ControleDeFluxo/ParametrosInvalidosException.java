package ControleDeFluxo;

import java.beans.XMLEncoder;

public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message){
        super (message);
    }
}
