
package View;

public class Vendedor {
   //dados pessoais
   private String nome, id, cidade, estado, inscEstadual, endereco;
  //dados bancarios
   private String banco, agencia, conta, cidadeBanco, estadoBanco, tipoConta;

    public Vendedor(String nome, String id, String cidade, String estado, String inscEstadual, String endereco, String banco, String agencia, String conta, String cidadeBanco, String estadoBanco, String tipoConta ) {
        this.nome = nome;
        this.id = id;
        this.cidade = cidade;
        this.estado = estado;
        this.inscEstadual = inscEstadual;
        this.endereco = endereco;
        this.banco = banco;
        this.agencia = agencia;
        this.conta = conta;
        this.cidadeBanco = cidadeBanco;
        this.estadoBanco = estadoBanco;
        this.tipoConta = tipoConta;
    }

    public Vendedor() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getCidadeBanco() {
        return cidadeBanco;
    }

    public void setCidadeBanco(String cidadeBanco) {
        this.cidadeBanco = cidadeBanco;
    }

    public String getEstadoBanco() {
        return estadoBanco;
    }

    public void setEstadoBanco(String estadoBanco) {
        this.estadoBanco = estadoBanco;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "nome=" + nome + ", id=" + id + ", cidade=" + cidade + ", estado=" + estado + ", inscEstadual=" + inscEstadual + ", endereco=" + endereco + ", banco=" + banco + ", agencia=" + agencia + ", conta=" + conta + ", cidadeBanco=" + cidadeBanco + ", estadoBanco=" + estadoBanco + ", tipoConta=" + tipoConta + '}';
    }

   

  
   
   
    
    
    
    
}
