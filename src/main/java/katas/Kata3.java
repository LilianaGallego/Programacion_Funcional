package katas;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import model.Movie;

import model.MovieList;
import util.DataUtil;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
    Goal: Use map() and flatMap() to project and flatten the movieLists into an array of video ids (flatMap(c -> c.stream()))
    DataSource: DataUtil.getMovieLists()
    Output: List of Integers
*/
public class Kata3 {
    public static List<Integer> execute() {
        List<MovieList> movieLists = DataUtil.getMovieLists();
        List<Movie> movie = movieLists.stream().flatMap(c->c.getVideos().stream())
                .collect(Collectors.toList());

        List<Integer> idList =   movie.stream().map(movie1 -> movie1.getId())
                .collect(Collectors.toList());

        idList.forEach(System.out::println);

        return idList;
    }
}
