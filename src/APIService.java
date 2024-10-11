import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class APIService {
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/3d8af3ff65205328f19be715/latest/";

    public double obtenerTasaCambio(String monedaBase, String monedaObjetivo) {
        try {
            URL url = new URL(API_URL + monedaBase);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder respuesta = new StringBuilder();
            String linea;

            while ((linea = reader.readLine()) != null) {
                respuesta.append(linea);
            }
            reader.close();

            // Aquí se utiliza Gson para analizar la respuesta JSON
            Gson gson = new Gson();
            JsonObject jsonResponse = JsonParser.parseString(respuesta.toString()).getAsJsonObject();
            return jsonResponse.getAsJsonObject("conversion_rates").get(monedaObjetivo).getAsDouble();

        } catch (Exception e) {
            System.out.println("Error al obtener la tasa de cambio: " + e.getMessage());
            return 0.0;
        }
    }
}
