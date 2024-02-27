import java.utill.Scanner;
public class UserInputSample {
    public staic void main(String[]args){
        String name;
        Int age;
        float height;
        float weight;
        char grade;
        double bmi;
        Scanner  sc = new Scanner(System.in);
        System.out.println("enterb your name");
        name=sc.nextLine();
        System.out.println("enter your age");
        age=sc.nextInt();
        System.out.println("enter your height");
        age=sc.nextFloat();
        System.out.println("enter your wight");
        weight=sc.nextFloat();
        
        bmi=weight/(height*height);
        System.out.println(bmi);

        System.out,println("Hello," + "name," + "you're " +"age," +"years old" +"and your bmi is" +"bmi");



    }
}