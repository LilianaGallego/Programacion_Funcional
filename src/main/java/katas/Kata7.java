package katas;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import model.Bookmark;
import model.BoxArt;
import model.Movie;
import model.MovieList;
import util.DataUtil;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
    Goal: Retrieve the id, title, and smallest box art url for every video
    DataSource: DataUtil.getMovieLists()
    Output: List of ImmutableMap.of("id", "5", "title", "Bad Boys", "boxart": "url)
*/
public class Kata7 {
    public static List<Map> execute() {
        List<Map> videos = DataUtil.getMovieLists().stream()
                .flatMap(movieList -> movieList.getVideos().stream())
                .map(video -> ImmutableMap.of("id", video.getId(), "title", video.getTitle(),
                        "url", video.getBoxarts().stream().reduce((min, box) -> {
                            int minSize = min.getWidth() * min.getHeight();
                            int boxSize = box.getWidth() * box.getHeight();
                            return (boxSize < minSize) ? box : min;
                        }).map(BoxArt::getUrl)))
                .collect(Collectors.toList());
        videos.forEach(System.out::println);
        return videos;
    }
}
