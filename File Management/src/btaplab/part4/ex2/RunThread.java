package btaplab.part4.ex2;

public class RunThread {
    public static void main(String[] args) {
        NewThread[] newThreads = new NewThread[3];

        newThreads[0] = new NewThread("First", 5);
        newThreads[1] = new NewThread("Second", 5);
        newThreads[2] = new NewThread("Third", 5);
        System.out.println("start");
        for (int i = 0; i<3;i++){
            newThreads[i].start();
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }


    }
}
