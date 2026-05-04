package com.gla.stream_api;

import java.util.*;

class Film {
    String title;
    double rating;
    int releaseYear;

    Film(String title, double rating, int releaseYear) {
        this.title = title;
        this.rating = rating;
        this.releaseYear = releaseYear;
    }
}

public class TopTrendingMoviesApp {
    public static void main(String[] args) {

        List<Film> filmList = Arrays.asList(
                new Film("Movie1", 8.5, 2023),
                new Film("Movie2", 9.0, 2022),
                new Film("Movie3", 7.5, 2024),
                new Film("Movie4", 8.8, 2021),
                new Film("Movie5", 9.2, 2023),
                new Film("Movie6", 8.0, 2024)
        );

        filmList.stream()
                .sorted(Comparator.comparingDouble((Film f) -> f.rating).reversed()
                        .thenComparing(f -> f.releaseYear, Comparator.reverseOrder()))
                .limit(5)
                .forEach(f -> System.out.println(f.title + " | " + f.rating + " | " + f.releaseYear));
    }
}
