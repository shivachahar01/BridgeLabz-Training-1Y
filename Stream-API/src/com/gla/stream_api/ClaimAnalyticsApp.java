package com.gla.stream_api;

import java.util.*;
import java.util.stream.*;

class InsuranceClaim {
    String claimCategory;
    double claimValue;

    InsuranceClaim(String claimCategory, double claimValue) {
        this.claimCategory = claimCategory;
        this.claimValue = claimValue;
    }
}

public class ClaimAnalyticsApp {
    public static void main(String[] args) {

        List<InsuranceClaim> claimRecords = Arrays.asList(
                new InsuranceClaim("Health", 1000),
                new InsuranceClaim("Health", 2000),
                new InsuranceClaim("Vehicle", 1500),
                new InsuranceClaim("Vehicle", 2500)
        );

        Map<String, Double> averageClaimByType = claimRecords.stream()
                .collect(Collectors.groupingBy(
                        c -> c.claimCategory,
                        Collectors.averagingDouble(c -> c.claimValue)
                ));

        System.out.println(averageClaimByType);
    }
}
