package br.com.quasa.download.streaming.servlet;

import br.com.quasa.download.streaming.service.StreamingService;
import org.apache.commons.io.output.ChunkedOutputStream;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class StreamingServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static final int BUFFER_SIZE = -1;

    @Inject
    private StreamingService service;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("======================================================================");
        String looping = request.getParameter("multiplo");
        System.out.println(String.format("[ ==> multiplo recebido...: %-5s ]", looping));
        long multiplo = 5;
        if (looping != null && !looping.equals("")) {
            multiplo = Integer.valueOf(looping);
        }
        System.out.println(String.format("[ ==> multiplo considerado: %-5d ]", multiplo));


        try {
            response.setContentType("application/octet-stream");
            response.setHeader("Transfer-Encoding", "chunked; filename=\"csvServlet.csv\"");
            response.setContentLength(BUFFER_SIZE);
            ChunkedOutputStream cos = new ChunkedOutputStream(response.getOutputStream());
            for (int i = 0; i < multiplo; i++) {

                System.out.println(String.format("[ $> %-5dº flush ]", i + 1));
                cos.write(service.gerarCSV(i));
                cos.flush();
            }
            cos.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("[ ==> Arquivo finalizado com sucesso!!! ]");
    }
}
