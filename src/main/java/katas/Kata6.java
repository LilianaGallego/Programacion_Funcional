package katas;

import com.google.common.collect.ImmutableMap;
import model.BoxArt;
import model.Movie;
import util.DataUtil;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
    Goal: Retrieve the url of the largest boxart using map() and reduce()
    DataSource: DataUtil.getMovieLists()
    Output: String
*/
public class Kata6 {
    public static String execute() {
        List<Movie> movies = DataUtil.getMovies();
        Integer uriLargest = movies.stream()
                .flatMap(movie -> movie.getBoxarts().stream())
                .map(boxart -> boxart.getWidth() * boxart.getHeight())
                .reduce(Integer::max)
                .orElse(0);
        String uri = movies.stream()
                .flatMap(movie -> movie.getBoxarts().stream())
                .filter(boxart -> uriLargest.equals(boxart.getWidth() * boxart.getHeight()))
                .map(BoxArt::getUrl)
                .collect(Collectors.joining());
        System.out.println(uri);
        return uri;
    }
}
