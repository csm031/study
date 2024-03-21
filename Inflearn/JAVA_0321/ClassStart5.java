package Inflearn.JAVA_0321;

import Inflearn.JAVA_0320.Student;
// 리팩토링
public class ClassStart5 {
    public static void main(String[] args) {
        Student student1 = new Student(); // x001
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student(); // x002
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student[] students = {student1, student2};


        // 기존 코드
       /* for (int i = 0; i<students.length;i++){
            System.out.println("이름: " + students[i].name + " 나이 : "+ students[i].age + " 성적: " + students[i].grade);
        }*/

        // 미리 선언해서 리팩토링 | 향상된 for문으로 사용하는게 더 좋다.
       /* for (int i = 0; i<students.length;i++){
            Student s = students[i];
            System.out.println("이름: " + s.name + " 나이 : "+ s.age + " 성적: " + s.grade);
        }*/

        // 향상된 for문
        for (Student s : students){
            System.out.println("이름: " + s.name + " 나이 : "+ s.age + " 성적: " + s.grade);
        }
    }
}
