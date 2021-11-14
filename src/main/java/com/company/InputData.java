package com.company;


public class InputData {
    public String resultString(String inst, String group)
    {
        String res = "https://student.lpnu.ua/students_schedule?departmentparent_abbrname_selective="+inst+"&studygroup_abbrname_selective="+group+"&semestrduration=1";
        return res;
    }
}
