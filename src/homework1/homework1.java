package homework1;

public class homework1 {
    //Class initializing instance variable
    String Homework;
    public void student(String home) {
        Homework=home;
    }
    
    //Prints object based off class homework1
    public static void main(String[] args){
        Homework one=new Homework("commit");
        System.out.println(one);
    }
}
