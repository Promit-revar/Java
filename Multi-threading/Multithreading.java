import java.util.*;
class Thread1 extends Thread{
    public void run() {
		Random r = new Random();
		for (int j=0;j<10;j++) {
			int i=r.nextInt(100);
			System.out.println("Random Integer generated : " + i);
			if((i%2)==0) {
				Thread2 t = new Thread2(i);
				t.start();
			}
			else {
				Thread3 c = new Thread3(i);
				c.start();
			}
			try {
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
class Thread2 extends Thread{
    int n;
    Thread2(int n){
        this.n=n;

    }
    public void run(){
        System.out.println("Running Thread2: "+(n*n));
    }
}
class Thread3 extends Thread{
    int n;
    Thread3(int n){
       this.n=n;
    }
    public void run(){
        System.out.println("Running Thread3: "+(n*n*n));
    }
}
public class Multithreading{
    public static void main(String args[]){
        Thread1 s = new Thread1();
		s.start();
    }
}