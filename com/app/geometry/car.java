abstract class car{
    private int tyer;
    abstract public void start();
}

class bike extends car{
public void start(){
    System.out.println("its start with kick");
}
}

class tester{
    public static void main(String args[]){
    car c=new bike();
    c.start();
    }
}