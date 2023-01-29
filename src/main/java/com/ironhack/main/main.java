package com.ironhack.main;
import com.ironhack.classes.Student;
import java.util.HashMap;
import java.util.Map;

public class main {

    public static void main(String[] args) {



        Map<String, Student> rootMap = new HashMap<>();

        Student esteban = new Student("Esteban Quito", 20);
        Student ezequiel = new Student("Ezequiel Gomez", 50);
        Student macarena = new Student("Macarena Montoya", 40);
        Student federico = new Student("Federico Elizalde", 80);

        rootMap.put(esteban.getName(), esteban);
        rootMap.put(ezequiel.getName(), ezequiel);
        rootMap.put(macarena.getName(), macarena);
        rootMap.put(federico.getName(), federico);

        System.out.println(increaseGrade(rootMap));

    }


    public static Map<String, Student> increaseGrade(Map<String, Student> studentsMap) {
        for (Student student : studentsMap.values()) {
            student.setGrade((int) (student.getGrade() * 1.1));
        }
        return studentsMap;
    }
    
}