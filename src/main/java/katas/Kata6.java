package katas;

import model.Movie;
import util.DataUtil;

import java.util.List;

/*
    Goal: Retrieve the url of the largest boxart using map() and reduce()
    DataSource: DataUtil.getMovieLists()
    Output: String
*/
public class Kata6 {
    public static String execute() {
        List<Movie> movies = DataUtil.getMovies();
        String majorUri = movies.stream()
                .map(movie -> movie.getUri())
                .reduce("", ((uri_1, uri_2) -> uri_1.length()> uri_2.length()? uri_1:uri_2));
        return majorUri;
    }
}
