package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class InputDataTest {

    @Test
    public void resultString() {
        InputData inputData = new InputData();
        String testString = inputData.resultString("ІКНІ", "КН-405");
        assertTrue(testString.contains("https://student.lpnu.ua/students_schedule"));
        assertTrue(testString.contains("?departmentparent_abbrname_selective=ІКНІ"));
        assertTrue(testString.contains("&studygroup_abbrname_selective=КН-405"));
    }
}