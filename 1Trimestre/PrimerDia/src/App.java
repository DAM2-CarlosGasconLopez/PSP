import java.io.BufferedReader;



public class App {
    public static void main(String[] args) throws Exception {
            // Lanzamos la calculadora creando un nuevo proceso en el 50 de ese programa
            Process pCalc = new ProcessBuilder("notepad.exe").start();
            //Process pCalc = Runtime.getRuntime().exec("notepad.exe");
            System.out.println("Lanzado proceso calculadora con java. PID: " + pCalc.pid());

            pCalc.waitFor();
            // Mostrar que el programa va a finalizar
            System.out.println("Programa finalizado");


            // Comando a ejecutar
            // String command = "tasklist";
            // Process pCommand = Runtime.getRuntime().exec(command);

            // Accedemos al buffer de lectura de proceso lanzado
            //BufferedReader reader = new BufferedReader(new InputStreamReader(pCommand.getInputStream()));

            // Leemos el resultado del comando




    }
}