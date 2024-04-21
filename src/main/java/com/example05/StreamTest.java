package com.example05;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamTest {
    private static final List<Student> STUDENTS = create();

    private static final String CLAZZ1 = "软件1班";

    private static final String CLAZZ2 = "软件2班";

    private static List<Student> create() {

        Student s1 = new Student(2018008, "张扬", CLAZZ2, 66);

        Student s2 = new Student(2018005, "刘飞", CLAZZ1, 92);

        Student s3 = new Student(2018007, "李明", CLAZZ2, 42);

        Student s4 = new Student(2018006, "赵勇", CLAZZ2, 56);

        Student s5 = new Student(2018002, "王磊", CLAZZ1, 81);

        Student s6 = new Student(2018010, "牛娜", CLAZZ1, 78);

        List<Student> students = new ArrayList<>();

        students.add(s1);
        students.add(s2);
        students.add(s3);

        students.add(s4);
        students.add(s5);
        students.add(s6);

        return students;
    }
    public static void main(String[] args) {
//     List<Student> studentList = listGrade(STUDENTS,60);
//     studentList.forEach(student -> System.out.println(student.getName()));
//        List<Student> studentList = listGradeClazz(STUDENTS,90,CLAZZ2);
//        studentList.forEach(student -> System.out.println(student.getName()));
//        List<String> studentList = listGradeClazzString(STUDENTS,90,CLAZZ2);
//        studentList.forEach(System.out::println);
//
//        List<Student> studentList = listGradeSort(STUDENTS);
//        studentList.forEach(student -> System.out.println(student.getName()));
        //List<Student> studentList = listGradeClazzSort(STUDENTS,90,CLAZZ2);
       // studentList.forEach(student -> System.out.println(student.getName()));
       // List<Integer> studentList = listGradeClazzSortNumber(STUDENTS,90,CLAZZ2);
       // studentList.forEach(System.out::println);
        Map<Integer,Integer> map = listGradeClazzMap(STUDENTS,90,CLAZZ2);
        map.forEach((k,v)-> System.out.println(k +" " + v));
    }
    public static List<Student> listGrade(List<Student> students , int sorce){
        return students.stream().filter(student -> student.getScore()<= sorce).toList();
    }
    public static List<Student> listGradeClazz(List<Student> students, int score , String clazz){
        return students
                .stream()
                .filter(student -> clazz.equals(student.getClazz()))
                .filter(student -> student.getScore() <= score)
                .toList();
    }
    public static List<String> listGradeClazzString(List<Student> students, int score , String clazz){
        return students.stream()
                .filter(student -> clazz.equals(student.getClazz()))
                .filter(student -> student.getScore() <= score)
                .map(Student::getName)
                .toList();
    }
    public static List<Student> listGradeSort(List<Student> students){
        return students.stream().sorted(Comparator.comparing(Student::getScore)).toList();
    }
    public static List<Student> listGradeClazzSort(List<Student> students, int score , String clazz){
        return students.stream()
                .filter(student -> clazz.equals(student.getClazz()))
                .filter(student -> student.getScore() <= score)
                .sorted(Comparator.comparing(Student::getScore).reversed())
                .toList();
    }
    public static List<Integer> listGradeClazzSortNumber(List<Student> students, int score , String clazz){
        return students.stream()
                .filter(student -> clazz.equals(student.getClazz()))
                .filter(student -> student.getScore() <= score)
                .sorted(Comparator.comparing(Student::getScore).reversed())
                .map(Student::getNumber)
                .toList();
    }
    public static Map<Integer,Integer> listGradeClazzMap(List<Student> students, int score , String clazz){
        return students.stream()
                .filter(student -> clazz.equals(student.getClazz()))
                .filter(student -> student.getScore() <= score)
                .collect(Collectors.toMap(Student::getNumber, Student::getScore));
    }
}
