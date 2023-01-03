package br.com.quasa.download.streaming.entidade;

public class Dado {
    private String nome;
    private int agencia;
    private long conta;
    private String data;
    private String dia;
    private String historico;
    private String subHistorico;
    private String documento;
    private String Origem;
    private String valor;
    private String saldo;

    public Dado() {
    }

    public Dado(
            String nome,
            int agencia,
            long conta,
            String data,
            String dia,
            String historico,
            String subHistorico,
            String documento,
            String origem,
            String valor,
            String saldo
    ) {
        this.nome = nome;
        this.agencia = agencia;
        this.conta = conta;
        this.data = data;
        this.dia = dia;
        this.historico = historico;
        this.subHistorico = subHistorico;
        this.documento = documento;
        Origem = origem;
        this.valor = valor;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public long getConta() {
        return conta;
    }

    public void setConta(long conta) {
        this.conta = conta;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public String getSubHistorico() {
        return subHistorico;
    }

    public void setSubHistorico(String subHistorico) {
        this.subHistorico = subHistorico;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getOrigem() {
        return Origem;
    }

    public void setOrigem(String origem) {
        Origem = origem;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    public String gerarBarraTitulo(String separador) {
        return "Nome" + separador +
                "Agencia" + separador +
                "Conta" + separador +
                "Data" + separador +
                "Dia" + separador +
                "Historico" + separador +
                "SubHistorico" + separador +
                "Documento" + separador +
                "Origem" + separador +
                "Valor" + separador +
                "Saldo" + separador;
    }

    public String gerarLinha(String separador) {
        return nome + separador +
                agencia + separador +
                conta + separador +
                data + separador +
                dia + separador +
                historico + separador +
                subHistorico + separador +
                documento + separador +
                Origem + separador +
                valor + separador +
                saldo + separador;
    }



    @Override
    public String toString() {
        return "Dado{" +
                "nome='" + nome + '\'' +
                ", agencia=" + agencia +
                ", conta=" + conta +
                ", data='" + data + '\'' +
                ", dia='" + dia + '\'' +
                ", historico='" + historico + '\'' +
                ", subHistorico='" + subHistorico + '\'' +
                ", documento=" + documento +
                ", Origem='" + Origem + '\'' +
                ", valor='" + valor + '\'' +
                ", saldo='" + saldo + '\'' +
                '}';
    }
}
