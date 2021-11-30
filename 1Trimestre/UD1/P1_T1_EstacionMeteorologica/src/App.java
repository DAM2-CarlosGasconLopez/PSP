import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

import com.google.gson.Gson;

public class App {
    public static void main(String[] args) throws Exception {
        
        Gson gson = new Gson();

        String fichero = "";
 
        try (BufferedReader br = new BufferedReader(new FileReader("D:\\Users\\damA\\Desktop\\items\\1a00a919"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                fichero += linea;
            }
            System.out.println(fichero);
        
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        Properties properties = gson.fromJson(fichero, Properties.class);

        Estacion estacion = new Estacion(properties.get("fecha"), properties.get("nombre"), properties.get("tmax"), properties.get("tmin"));



        System.out.println(estacion.getNombre());
    }
}
