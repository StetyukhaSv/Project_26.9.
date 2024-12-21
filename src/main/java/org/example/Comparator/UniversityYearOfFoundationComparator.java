package org.example.Comparator;

import org.example.University;

public class UniversityYearOfFoundationComparator implements UniversityComparator {
    @Override
    public int compare(University u1, University u2) {
        return Integer.compare(u1.getYearOfFoundation(), u2.getYearOfFoundation());
    }
}
