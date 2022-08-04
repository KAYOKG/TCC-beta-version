package View;

public class Corretora {
    private String idContrato, data, descricao;
    private Comprador c;
    private Vendedor v;

    public Corretora() {
    }

    public String getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(String numeroContrato) {
        this.idContrato = numeroContrato;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Comprador getC() {
        return c;
    }

    public void setC(Comprador c) {
        this.c = c;
    }

    public Vendedor getV() {
        return v;
    }

    public void setV(Vendedor v) {
        this.v = v;
    }
    
    
}
