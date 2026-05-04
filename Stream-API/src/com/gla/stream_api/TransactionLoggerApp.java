package com.gla.stream_api;

import java.time.LocalDateTime;
import java.util.*;

public class TransactionLoggerApp {
    public static void main(String[] args) {

        List<String> transactionList = Arrays.asList("TXN1001", "TXN1002", "TXN1003");

        transactionList.forEach(txn ->
                System.out.println(LocalDateTime.now() + " | Transaction ID: " + txn)
        );
    }
}