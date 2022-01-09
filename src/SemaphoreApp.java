import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SemaphoreApp {
// Semaphore permits more than one threads according to RenetrantLock
    private Semaphore sem = new Semaphore(5); // 5 threads enter in same block in same time .

    public void threadFunction(int id){

        try {
            sem.acquire(); // control to "new Semaphore(5);" it should not be zero"0".

        }catch (InterruptedException ex){
            Logger.getLogger(SemaphoreApp.class.getName()).log(Level.SEVERE,null,ex);
        }

        System.out.println("Thread is starting... ID" + id);

        try {
            Thread.sleep(5000);
        }catch (InterruptedException ex){
            Logger.getLogger(SemaphoreApp.class.getName()).log(Level.SEVERE,null,ex);
        }
        System.out.println("Thread exits.... ID :" +id);

        sem.release(); //Semaphore will increase as +1 .

    }

}
