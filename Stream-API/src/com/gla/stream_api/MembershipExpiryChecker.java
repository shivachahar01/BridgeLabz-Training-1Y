package com.gla.stream_api;

import java.time.*;
import java.util.*;

class GymMember {
    String memberName;
    LocalDate membershipExpiryDate;

    GymMember(String memberName, LocalDate membershipExpiryDate) {
        this.memberName = memberName;
        this.membershipExpiryDate = membershipExpiryDate;
    }
}

public class MembershipExpiryChecker {
    public static void main(String[] args) {

        List<GymMember> memberList = Arrays.asList(
                new GymMember("Ravi", LocalDate.now().plusDays(10)),
                new GymMember("Amit", LocalDate.now().plusDays(40)),
                new GymMember("Neha", LocalDate.now().plusDays(20))
        );

        memberList.stream()
                .filter(member -> member.membershipExpiryDate.isBefore(LocalDate.now().plusDays(30)))
                .forEach(member -> System.out.println(member.memberName));
    }
}
