package View;

import java.io.Serializable;

public class Corretora implements Serializable{

    private String idContrato, data, descricao, observacao, produto;
    private float preco, total;
    private int quantidade;
    private Comprador c;
    private Vendedor v;

    public Corretora() {

    }

    public Corretora(String idContrato, String data, String descricao, String observacao, String produto, float preco, float total, int quantidade, Comprador c, Vendedor v) {
        this.idContrato = idContrato;
        this.data = data;
        this.descricao = descricao;
        this.observacao = observacao;
        this.produto = produto;
        this.preco = preco;
        this.total = total;
        this.quantidade = quantidade;
        this.c = c;
        this.v = v;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }


    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
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

    @Override
    public String toString() {
        return "id Contrato: " + idContrato + ", data: " + data +  ", Produto: " + produto + ", descricao:" + descricao + ", observacao: " + observacao + ", preco(R$): " + preco + ", total(R$): " + total + ", quantidade: " + quantidade + "\n" + c + "\n" + v + "\n" ;
    }

}
