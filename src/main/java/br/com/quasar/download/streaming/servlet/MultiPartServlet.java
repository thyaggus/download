//https://javadigest.wordpress.com/2012/02/13/downloading-multiple-files-using-multipart-response/

package br.com.quasar.download.streaming.servlet;

import br.com.quasar.download.streaming.service.StreamingService;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MultiPartServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private static final int BUFFER_SIZE = -1;

    @Inject
    private StreamingService service;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String looping = request.getParameter("multiplo");
        System.out.println(String.format("[ ==> multiplo recebido...: %-5s ]", looping));
        long multiplo = 5;
        if (looping != null && !looping.equals("")) {
            multiplo = Integer.valueOf(looping);
        }
        System.out.println(String.format("] ==> multiplo considerado: %-5d [", multiplo));

        // Set the response type and specify the boundary string
        response.setContentType("multipart/x-mixed-replace;boundary=???");

        response.setContentLength(BUFFER_SIZE);

        ServletOutputStream out = response.getOutputStream();


        for (int i = 0; i < multiplo; i++) {
            byte[] stream = new byte[0];
            try {
                stream = service.gerarCSV(i);
                System.out.println("] ==> Enviando arquivo csvMulti.csv [");
                out.write(stream, 0, stream.length);
                out.flush();
                System.out.println("] ==> Finalizado o envio do arquio csvMulti.csv [");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        out.close();
    }
}
