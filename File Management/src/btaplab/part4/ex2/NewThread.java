package btaplab.part4.ex2;

public class NewThread extends Thread{
    String name;
    int count;
    NewThread(String name, int count){
        this.name = name;
        this.count = count;
    }



    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        System.out.println("New thread : [Thread "+name+","+count+",main]");
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        for(int i = count; i >= 1;i--){
            System.out.println(name+" : "+i);
            if(i==1){
                System.out.println(name+" Exiting");
            }
            try {
                Thread.sleep(3000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }
        System.out.println("Main thread exiting");
    }

}
