import java.util.Scanner;
class Student{
    int regNo;
    String name;
    int mark;
    Student(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Register Number: ");
        regNo=sc.nextInt();
        System.out.print("Enter Name: ");
        sc.nextLine();
        name=sc.nextLine();
        System.out.print("Enter mark: ");
        mark=sc.nextInt();
    }
    char findGrade(){
        if (mark>=90) return 'S';
        else if(mark>=80) return 'A';
        else if(mark>=70) return 'B';
        else if(mark>=60) return 'C';
        else if(mark>=50) return 'D';
        else if(mark>=40) return 'E';
        else return 'F';
    }
}
class StudMain{
    public static void main(String[]args){
        int count=0;

        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();

        System.out.printf("%d %s %c\n",s1.regNo,s1.name,s1.findGrade());
        System.out.printf("%d %s %c\n",s2.regNo,s2.name,s2.findGrade());
        System.out.printf("%d %s %c\n",s3.regNo,s3.name,s3.findGrade());
        if(s1.findGrade()=='S') count++;
        if(s2.findGrade()=='S') count++;
        if(s3.findGrade()=='S') count++;
        System.out.printf("Count of Grade Obtained 'S' : %d",count);
    }
}
