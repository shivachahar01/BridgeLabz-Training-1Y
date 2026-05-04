package com.gla.stream_api;

import java.util.*;

class Physician {
    String doctorName;
    String specialization;
    boolean isAvailableOnWeekend;

    Physician(String doctorName, String specialization, boolean isAvailableOnWeekend) {
        this.doctorName = doctorName;
        this.specialization = specialization;
        this.isAvailableOnWeekend = isAvailableOnWeekend;
    }
}

public class DoctorAvailabilityApp {
    public static void main(String[] args) {

        List<Physician> doctorList = Arrays.asList(
                new Physician("Dr. Sharma", "Cardiology", true),
                new Physician("Dr. Mehta", "Neurology", false),
                new Physician("Dr. Khan", "Dermatology", true)
        );

        doctorList.stream()
                .filter(doc -> doc.isAvailableOnWeekend)
                .sorted(Comparator.comparing(doc -> doc.specialization))
                .forEach(doc -> System.out.println(doc.doctorName + " - " + doc.specialization));
    }
}
