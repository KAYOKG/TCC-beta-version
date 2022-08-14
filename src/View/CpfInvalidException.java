package View;

public class CpfInvalidException extends RuntimeException {

    public CpfInvalidException() {
        super("ERRO! CPF/CNPJ ja cadastrado");

    }

}
