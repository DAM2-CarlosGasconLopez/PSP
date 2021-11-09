import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("MENU");
        System.out.println("=====================================");
        System.out.println("1 - Ejercicio 1");
        System.out.println("2 - Ejercicio 2");
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                Ejercicio1();
                break;
            case 2:
                Ejercicio2();
                break;
        
            default:
                break;
        }
        
    }
    private static void Ejercicio2(){

        try {
            ProcessBuilder pb = new ProcessBuilder("D:\\Users\\damA\\Desktop\\bation.bat");
            File bien = new File("D:\\Users\\damA\\Desktop\\bien.log");
            File error = new File("D:\\Users\\damA\\Desktop\\errores.log");

            pb.redirectOutput(bien);
            pb.redirectError(error);



            Process p = pb.start();
            p.waitFor();


        } catch (IOException e) {
          e.printStackTrace();
        } catch (InterruptedException e) {
         e.printStackTrace();
        }
    }

    private static void Ejercicio1(){
        try {
            ProcessBuilder pb = new ProcessBuilder("c:\\Program Files (x86)\\Notepad++\\Notepad++.exe", "D:\\Users\\damA\\Documents\\Concurrencia.txt");

            Process p = pb.start();

            p.waitFor();


        } catch (IOException e) {
          e.printStackTrace();
        } catch (InterruptedException e) {
         e.printStackTrace();
        }
    }
}
