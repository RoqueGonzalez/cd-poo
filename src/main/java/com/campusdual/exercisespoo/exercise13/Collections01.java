package com.campusdual.exercisespoo.exercise13;

import com.campusdual.exercisespoo.exercise09.Doctor;
import com.campusdual.exercisespoo.exercise09.Person;
import com.campusdual.exercisespoo.exercise09.PoliceOficcer;
import com.campusdual.exercisespoo.exercise09.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Collections01 {

    public static void main(String[] args) {

        List<Person> stringList = new ArrayList<>();

        stringList.add(new Person("Pedro","Lopez"));
        stringList.add(new Teacher("Messi","Suarez","Mates"));
        stringList.add(new PoliceOficcer("Javi","Suarez"));
        stringList.add(new Doctor("Mateo","Suarez"));

        for (int i = 0; i < stringList.size(); i++){
            stringList.get(i).getDetails();
        }
        for (Person p : stringList){
            p.getDetails();
        }


    }

}
