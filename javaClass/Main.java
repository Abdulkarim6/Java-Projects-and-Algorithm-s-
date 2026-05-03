import java.util.Scanner;

class Student{
   int rollNo;
   String name;
   double marks;

   Student(int rollIn, String nameIn, double marksIn){
      rollNo = rollIn;
      name = nameIn;
      marks = marksIn;
   }

  void displayInfo(){
    System.out.println("Student Name: " + name + "; " + name+"\'s Roll: " + rollNo + "; " + name+"\'s Marks: " + marks);
   }
}

class StudentManagerList{
    Student[] students = new Student[100];
    int indexCount = 0;
    Scanner scan = new Scanner(System.in);

    void addStudent() {
        while (true) {
            System.out.print("Enter Student Roll: ");
            int rollNo = scan.nextInt();
            scan.nextLine(); // removes extra new line that is created by Enter pressing.
    
            System.out.print("Enter Student Name: ");
            String name = scan.nextLine();
    
            System.out.print("Enter Student Marks: ");
            double marks = scan.nextDouble();
    
            students[indexCount] = new Student(rollNo, name, marks);
            System.out.println("New student added successfully.");
            indexCount++;
    
            System.out.print("Do you want to add another student? (y/n): ");
            scan.nextLine(); // removes extra new line that is created by Enter pressing.
            String answer = scan.nextLine();
    
            if (answer.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
    

    void displayAllStudents(){
        if (indexCount == 0) {
            System.out.println("No student found, the student list is empty.");
        } else {
            System.out.println("All Student List:");
            for (int i = 0; i < indexCount; i++) {
                students[i].displayInfo();
            }
        }
    }

    void searchStudent(int roll){
        boolean found = false;
        if (indexCount == 0) {
            System.out.println("The student list is empty.");
        } else {
            for (int i = 0; i < indexCount; i++) {
                if(students[i].rollNo == roll){
                  System.out.println("Student found by the roll number:");
                  students[i].displayInfo();
                  found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No student found by " + roll + " number.");
        }
    }
}

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        StudentManagerList obj = new StudentManagerList();
        int optionNum;
        
        do {  
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by Roll Number");
            System.out.println("4. Exit the program");
            System.out.print("Which one do you want now? Enter the number of options: ");
            optionNum = scan.nextInt();

            switch (optionNum) {
                case 1:
                    obj.addStudent();
                    break;
                case 2:
                    obj.displayAllStudents();
                    break;
                case 3:
                    System.out.print("Enter Student Roll Number: ");
                    int roll = scan.nextInt();
                    obj.searchStudent(roll);
                    break;
                case 4:
                    System.out.println("Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("You entered invalid number. Try again..");
                    break;
            }
        } while (optionNum != 4);
    
    scan.close();
    }
}
