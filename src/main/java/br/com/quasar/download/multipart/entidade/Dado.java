package br.com.quasar.download.multipart.entidade;

public class Dado {

    private String dataContabil;
    private String dataLan;
    private String historico;
    private String complemento;
    private String lote;
    private String banco;
    private String origem;
    private String documento;
    private String valor;
    private String saldo;

    public Dado() {
    }

    public Dado(
            String dataContabil,
            String dataLan,
            String historico,
            String complemento,
            String lote,
            String banco,
            String origem,
            String documento,
            String valor,
            String saldo) {
        this.dataContabil = dataContabil;
        this.dataLan = dataLan;
        this.historico = historico;
        this.complemento = complemento;
        this.lote = lote;
        this.banco = banco;
        this.origem = origem;
        this.documento = documento;
        this.valor = valor;
        this.saldo = saldo;
    }

    public String getDataContabil() {
        return dataContabil;
    }

    public void setDataContabil(String dataContabil) {
        this.dataContabil = dataContabil;
    }

    public String getDataLan() {
        return dataLan;
    }

    public void setDataLan(String dataLan) {
        this.dataLan = dataLan;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
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
        return "dataContabil" + separador +
                "dataLan" + separador +
                "historico" + separador +
                "complemento" + separador +
                "lote" + separador +
                "banco" + separador +
                "origem" + separador +
                "documento" + separador +
                "valor" + separador +
                "saldo" + separador;
    }

    public String gerarLinha(String separador) {
        return dataContabil + separador +
                dataLan + separador +
                historico + separador +
                complemento + separador +
                lote + separador +
                banco + separador +
                origem + separador +
                documento + separador +
                valor + separador +
                saldo + separador;
    }

    @Override
    public String toString() {
        return "Dado{" +
                "dataContabil='" + dataContabil + '\'' +
                ", dataLan='" + dataLan + '\'' +
                ", historico='" + historico + '\'' +
                ", complemento='" + complemento + '\'' +
                ", lote='" + lote + '\'' +
                ", banco='" + banco + '\'' +
                ", origem='" + origem + '\'' +
                ", documento='" + documento + '\'' +
                ", valor='" + valor + '\'' +
                ", saldo='" + saldo + '\'' +
                '}';
    }
}