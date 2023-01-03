package br.com.quasar.download.streaming.service;

import br.com.quasar.download.streaming.entidade.Dado;

import java.util.LinkedList;
import java.util.List;

public class StreamingService {
    private static final String SEPARADOR = ";";
    private static final String NOVA_LINHA = System.lineSeparator();
    private static final String CARSET = "UTF8";
    private static final long QUANTIDADE = 230000;


    private static List<Dado> gerarLancamentos(long inicio) {
        List<Dado> lancamentos = new LinkedList<>();
        for (long i = inicio * QUANTIDADE; i < ((inicio + 1) * QUANTIDADE); i++) {
            lancamentos.add(new Dado(
                    "Tiago S F",
                    9988,
                    12345678901L,
                    "13/04/1981",
                    "13",
                    "historico",
                    "subHistorico",
                    String.valueOf(i),
                    "Origem",
                    String.valueOf(i),
                    String.valueOf(i)
            ));
        }
        return lancamentos;
    }

    public static byte[] gerarCSV(long indice) throws Exception {

        StringBuilder sb = indice == 0 ? new StringBuilder(new Dado().gerarBarraTitulo(SEPARADOR)) : new StringBuilder();
        List<Dado> lancamentos = gerarLancamentos(indice);
        lancamentos.stream().forEach(lancamento -> sb.append(lancamento.gerarLinha(SEPARADOR)).append(NOVA_LINHA));
        return sb.toString().getBytes(CARSET);
    }
}
