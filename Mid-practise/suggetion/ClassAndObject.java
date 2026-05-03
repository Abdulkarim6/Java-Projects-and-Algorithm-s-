public class ClassAndObject {
        String wname;
        int wage;

        ClassAndObject(String name, int age){
          this.wname = name;
          this.wage = age;
          //System.out.println("8l " + wname + " " + wage);
        }

    public static void main(String args[]){
       ClassAndObject obj1 = new ClassAndObject("gooogle", 40 ); 
       ClassAndObject obj2 = new ClassAndObject("facebook", 25 ); 

       System.out.println("15 l" + obj1.wname + " " + obj1.wage);
      // System.out.println(obj2.wname + " " + obj2.wage);
 
    }
}
