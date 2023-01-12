package katas;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import model.Bookmark;
import model.InterestingMoment;
import model.Movie;
import model.MovieList;
import util.DataUtil;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
    Goal: Retrieve each video's id, title, middle interesting moment time, and smallest box art url
    DataSource: DataUtil.getMovies()
    Output: List of ImmutableMap.of("id", 5, "title", "some title", "time", new Date(), "url", "someUrl")
*/
public class Kata9 {
    public static List<Map> execute() {
        List<MovieList> movieLists = DataUtil.getMovieLists();

        List <Movie> movies = movieLists.stream()
                .flatMap(movieList -> movieList.getVideos().stream())
                .collect(Collectors.toList());
        List<Map> result = movies.stream()
                .map(m->ImmutableMap.of("id", m.getId(),"title",
                        m.getTitle(), "middle",m.getInterestingMoments().stream()
                                .filter(i->"Middle".equals(i.getType()))
                                .map(InterestingMoment::getTime)
                                .findFirst()
                ))
                .collect(Collectors.toList());

        result.forEach(System.out::println);
        return result;
    }
}
