package org.example.Comparator;

import org.apache.commons.lang3.StringUtils;
import org.example.Student;

public class StudentFullNameComparator implements StudentComparator {
    @Override
    public int compare(Student s1, Student s2) {
        return StringUtils.compare(s1.getFullName(), s2.getFullName());
    }
}