package ClassesAndObjects;

public class Student {
    int id;
    String name;
    String surname;
    String phone;
    int NumOfLessons;
    boolean isActive;

    public void findSum(int a, int b){
        if (a != 0 && b != 0){
            System.out.println(a + b);
        } else{
            System.out.println("--------");
        }
    }

    public int setId(int id){
        return id;
    }

    public String showName(){
        return name;

    }

    void studentInfo(){
        System.out.println("id: " + id);
        System.out.println("Student name and surname: " + name + " " + surname);
        System.out.println("number of lessons he/she took: " + NumOfLessons);
        System.out.println("Student activity: " + isActive);
        }
    void IsActiveOrNo(){
        if(isActive == true){
            System.out.println("Active student");
        } else {
            System.out.println("Delete inactive student: " + name + " " + surname);
        }
    }


}
