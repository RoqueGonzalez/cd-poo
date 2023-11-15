package com.campusdual.exercisespoo;

import com.campusdual.exercisespoo.exercise09.Doctor;
import com.campusdual.exercisespoo.exercise09.Person;
import com.campusdual.exercisespoo.exercise09.PoliceOficcer;
import com.campusdual.exercisespoo.exercise09.Teacher;

import java.util.HashMap;
import java.util.Map;

public class Exercise15 {
    public static void main(String[] args) {
        Map<String, Person> customMap = new HashMap<>();

        customMap.put("person",new Person("Benito","Garcia"));
        customMap.put("teacher", new Teacher("Maria","Lopez","Mates"));
        customMap.put("police", new PoliceOficcer("jake","peralta"));
        customMap.put("doctor", new Doctor("Maria","Lopez"));

        customMap.get("teacher").getDetails();
        customMap.remove("teacher");

        System.out.println("Conten a clave \"police\": " + customMap.containsKey("police"));
        System.out.println("Conten a clave \"teacher\": " + customMap.containsKey("teacher"));

    }
}
