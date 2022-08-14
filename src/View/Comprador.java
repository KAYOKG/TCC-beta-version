package View;

import java.io.Serializable;

public class Comprador implements Serializable {

    private String nome, id, cidade, estado, inscEstadual, endereco;

    public Comprador(String nome, String id, String cidade, String estado, String inscEstadual, String endereco) {
        this.nome = nome;
        this.id = id;
        this.cidade = cidade;
        this.estado = estado;
        this.inscEstadual = inscEstadual;
        this.endereco = endereco;
    }

    public Comprador() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getInscEstadual() {
        return inscEstadual;
    }

    public void setInscEstadual(String inscEstadual) {
        this.inscEstadual = inscEstadual;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Comprador " + "Nome: " + nome + ", Id: " + id + ", Cidade: " + cidade + ", Estado: " + estado + ", Inscricao Estadual: " + inscEstadual + ", Endereco: " + endereco;
    }

}
