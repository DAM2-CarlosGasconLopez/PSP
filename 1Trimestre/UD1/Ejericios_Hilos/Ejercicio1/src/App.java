

public class App {
    public static void main(String[] args) {
       
        Ejercicio1 hola = new Ejercicio1();
        Ejercicio2 mundo = new Ejercicio2();

        hola.start();      
        mundo.start();
        

   
            try {
                Thread.sleep(5000);
                hola.interrupt();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


       
        

    

    }
    
}

class Ejercicio1 extends Thread{
    public void run(){
        
        for (int i = 0; i < 15; i++) {
            System.out.print("Hola ");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                
                System.out.println("Hilo Interrumpido");
                break;
            }

            
        }
        

    }

}

class Ejercicio2 extends Thread{
    public void run(){
        try {
            Thread.sleep(20);
        } catch (InterruptedException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        for (int i = 0; i < 15; i++) {
            System.out.println("Mundo !!!");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {

                    e.printStackTrace();
                }
        }
    }
}



