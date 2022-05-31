package Colltrollers;

import models.Student;

import java.util.Comparator;

public class SortById1 implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getMsv()>o2.getMsv()){
            return 1;
        }
        else {
            return -1;
        }
    }
}

