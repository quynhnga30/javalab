package btaplab.part4.ex1;

public class ThreadA extends Thread {


    private String Name;

    public ThreadA(String name) {
        this.Name = name;
    }
    public void run() {
        System.out.println("Name: " + this.Name);
    }

    public void setNameThread(String namet) {
        this.Name = namet;
        System.out.println("Name:" + this.Name);
    }
    public void sleepNumber(){
        try {
            for(int i=0 ;i<10;i++){
                System.out.println(i);
                Thread.sleep(1500);
            }
        }catch (InterruptedException c){
            c.printStackTrace();
        }
    }
}