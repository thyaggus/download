package br.com.quasar.download.streaming.resource;

import br.com.quasar.download.streaming.service.StreamingService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@RequestScoped
@Path("/download")
public class StreamResource {

    private static final String CONTENT_TYPE = "text/html; charset=UTF-8";

    @Inject
    private StreamingService service;

    @GET
    @Path("/streamingjaxrs")
    public Response streaming() {

        /*try {
            OutputStream output = response.getOutputStream();
            for (int i = 0; i < 5; i++) {
                byte[] stream = service.gerarCSV(0);

                Response.ResponseBuilder response = Response.ok(output);
                response.header("Content-Disposition", "attachment; filename=\"streaming.csv\"");
                output.write(stream);
                output.flush();
            }
            output.close();
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        return Response.ok("Apenas teste").build();
    }
}
