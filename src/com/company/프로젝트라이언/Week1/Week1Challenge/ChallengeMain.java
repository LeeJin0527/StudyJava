package com.company.프로젝트라이언.Week1.Week1Challenge;

import com.company.프로젝트라이언.Week1.Week1HW.Lecturer;
import com.company.프로젝트라이언.Week1.Week1HW.Person;
import com.company.프로젝트라이언.Week1.Week1HW.Student;

import java.util.*;

public class ChallengeMain {
    public static void main(String[] args) {
        Student student = new Student("이진", 1);
        Lecturer lecturer = new Lecturer("이호맹", 2);
        List<Person> everyone = new ArrayList<>();
        everyone.add(student);
        everyone.add(lecturer);준
        printItems(everyone);

        Vector<Person> everyone1 = new Vector<>();
        everyone1.add(student);
        everyone1.add(lecturer);
        printItems(everyone1);

        LinkedList<Person> everyone2 = new LinkedList<>();
        everyone2.add(student);
        everyone2.add(lecturer);
        printItems(everyone2);

        Set<Person> everyone3 = new HashSet<>();
        everyone3.add(student);
        everyone3.add(lecturer);
        printItems(everyone3);
    }

    //정적함수
    public static <T> void printItems(Iterable<T> iterable){
        Iterator<T> iterator = iterable.iterator();
        if ( ! iterator.hasNext()){
            System.out.println("No Elements");
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("idx\titem\n");
        for(int i = 0; iterator.hasNext(); i++){
            T item = iterator.next();
            stringBuilder.append(
                    String.format("%d\t\t%s\n", i, item.toString())
            );

        }
        System.out.println(stringBuilder);

    }
}
