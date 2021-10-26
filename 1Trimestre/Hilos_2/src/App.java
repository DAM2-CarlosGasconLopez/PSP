public class App {
    public static void main(String[] args) throws Exception {
        Numeros numeros = new Numeros();
        Numeros numeros2 = new Numeros();
        //Letras letras = new Letras();
        numeros.start();
        numeros.join();
        numeros2.start();
        numeros2.join();
        System.out.println("fdsfsfsafsdfgsdfgdsfg");
    }

    
}

class Numeros extends Thread{  

    public void run(){
        for (int i = 0; i < 2; i++) {   
            System.out.println(" Hilo -->" + getName());
            for (int numero = 1; numero < 61; numero++) {
                System.out.print(numero + " ");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {                    
                    e.printStackTrace();
                }
            }
            System.out.println();
        }
    }
}

class Letras extends Thread{

    public void run(){
        for (int i = 0; i < 2; i++) {           
            System.out.println("Hilo -->" + getName());
            for (char caracter = 'a'; caracter <= 'z'; caracter++) {
                System.out.print(caracter + " ");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                 
                    e.printStackTrace();
                }
            }
            for (char caracter = 'A'; caracter <= 'Z'; caracter++) {
                System.out.print(caracter + " ");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                  
                    e.printStackTrace();
                }
            }
            System.out.println();
        }
    }
}
