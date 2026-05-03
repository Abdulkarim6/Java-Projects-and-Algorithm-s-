class Student {
    private String Name;
    private int rollNo;
    private double gpa;

    public String getName() {
        return this.Name;
    }

    public int getRollNo() {
        return this.rollNo;
    }

    public double getGpa() {
        return this.gpa;
    }

    public void setName(String nameIn) {
        this.Name = nameIn;
    }

    public void setRollNo(int rollIn) {
        this.rollNo = rollIn;
    }

    public void setGpa(double gpaIn) {
        if (gpaIn >= 0.0 && gpaIn <= 4.0) {
            this.gpa = gpaIn;
        } else {
            System.out.println("Invalid GPA. gpa cannot be negative or over 4.0.");
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student obj = new Student();

        obj.setName("Karim");
        obj.setRollNo(23);
        obj.setGpa(8.0);

        System.out.println("Name: " + obj.getName());
        System.out.println("Roll: " + obj.getRollNo());
        System.out.println("Gpa: " + obj.getGpa());

    }
}