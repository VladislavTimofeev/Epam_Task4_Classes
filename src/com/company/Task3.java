package com.company;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        Student[] students = new Student[2];
        students[0] = createStudent("Пупкн", 23, 8, 9, 10);
        students[1] = createStudent("Тимон", 13, 9, 10);
        printFilteredStudents(students);
    }

    private static Student createStudent(String surname, int groupNumber, int... progress) {
        Student student = new Student();
        student.setGroupNumber(groupNumber);
        student.setProgress(progress);
        student.setSurname(surname);
        return student;
    }
    public static void printFilteredStudentsByMarks(Student[] students, int... marks) {

    }
    public static void printFilteredStudents(Student[] students) {
        int[] requiredProgress = new int[]{9, 10};
        for (Student student : students) {
//            if (isStudentProgressContains(student.getProgress(), requiredProgress)) {
//                Util.print(student.toString());
//            }
            boolean result = true;
            for (int progressValue : student.getProgress()) {
                if (progressValue < 9) {
                    result = false;
                    break;
                }
            }
            if (result) {
                Util.print(student.toString());
            }
        }
    }

    private static boolean isStudentProgressContains(int[] studentProgress, int... progress) {
//        boolean result = true;
//        for (int studentProgressValue : studentProgress) {
//            for (int progressValue : progress) {
//                if (studentProgressValue != progressValue) {
//                    result = false;
//                    break;
//                }
//            }
//            // если уже что-то не подошло, то не надо дальше продолжать идти по циклу.
//            if (!result) {
//                break;
//            }
//        }
//        return result;
        return Arrays.asList(studentProgress).containsAll(Arrays.asList(progress));
    }
}
