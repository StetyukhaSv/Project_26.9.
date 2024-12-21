package org.example.Comparator;

import org.apache.commons.lang3.StringUtils;
import org.example.Student;

public class StudentUniversityIdComparator implements StudentComparator {
    @Override
    public int compare(Student s1, Student s2) {
        return StringUtils.compare(s1.getUniversityId(), s2.getUniversityId());
    }
}
