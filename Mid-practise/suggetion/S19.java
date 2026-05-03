class student{
    String name;
    int roll;

    void display(){
        System.out.println("Name : "+ name);
        System.out.println("Roll : "+ roll);
    }
}


public class S19 {
    public static void main(String[] args){
       student obj = new student();
       obj.name = "Karim";
       obj.roll = 10023;

       obj.display();
    }
}
