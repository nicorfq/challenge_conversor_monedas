import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConsultaAPI {

    void muestraConsulta(String baseCoin, String exchangeCoin, double amount) {

        String clave = "1a21dec1f56d30a34674f06d";
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/" + clave + "/pair/" + baseCoin + "/" + exchangeCoin + "/" + amount);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        HttpResponse<String> response;
        {
            try {
                response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        String json = response.body();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .create();
        Conversion miConversion = gson.fromJson(json, Conversion.class);

        LocalDateTime mifecha = LocalDateTime.from(LocalDateTime.now());
        DateTimeFormatter miFechaFormateada = DateTimeFormatter.ofPattern("dd/MM/yyyy - hh:mm a");
        String text = mifecha.format(miFechaFormateada);

        System.out.println("Resultado:");
        System.out.println( "1.0 " + baseCoin + " --> " + miConversion.conversion_rate() + " " + exchangeCoin + "\n" +
                amount + " " + baseCoin + " --> " + miConversion.conversion_result() + " " + exchangeCoin +
                " - Fecha: " + text + "\n");
    }
}
