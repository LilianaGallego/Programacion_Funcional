package katas;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import model.BoxArt;
import model.Movie;
import model.MovieList;
import util.DataUtil;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
    Goal: Retrieve id, title, and a 150x200 box art url for every video
    DataSource: DataUtil.getMovieLists()
    Output: List of ImmutableMap.of("id", "5", "title", "Bad Boys", "boxart": BoxArt)
*/
public class Kata4 {
    public static List<Map> execute() {
        List<MovieList> movieLists = DataUtil.getMovieLists();
        List<Movie> movie = movieLists.stream().flatMap(c->c.getVideos().stream())
                .collect(Collectors.toList());
        List<Map> result = movie.stream()
                .map(m-> ImmutableMap.of("id",m.getId(),"title",m.getTitle(),"boxart", new BoxArt(150, 200, m.getUri())))
                .collect(Collectors.toList());
        return  result;
       // return ImmutableList.of(ImmutableMap.of("id", 5, "title", "Bad Boys", "boxart", new BoxArt(150, 200, "url")));
    }
}
