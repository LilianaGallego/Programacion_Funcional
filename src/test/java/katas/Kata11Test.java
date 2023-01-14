package katas;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static org.hamcrest.CoreMatchers.equalTo;


public class Kata11Test {

    @Test
    public void testSize() {
        Assert.assertThat(Kata11.execute().size(), equalTo(2));
    }

    @Test
    public void testResult() {
        List<Map> list = new ArrayList<>();
        list.add(ImmutableMap.of("name", "New Releases", "videos", ImmutableList.of(ImmutableMap.of("id", 65432445, "title", "The Chamber", "time", Optional.of(32432), "boxArt", Optional.of("http://cdn-0.nflximg.com/images/2891/TheChamber130.jpg")), ImmutableMap.of("id", 675465, "title", "Fracture", "time", Optional.of(3534543), "boxArt", Optional.of("http://cdn-0.nflximg.com/images/2891/Fracture120.jpg")))));
        list.add(ImmutableMap.of("name", "Thrillers", "videos", ImmutableList.of(ImmutableMap.of("id", 70111470, "title", "Die Hard", "time", Optional.of(645243), "boxArt", Optional.of("http://cdn-0.nflximg.com/images/2891/DieHard150.jpg")), ImmutableMap.of("id", 654356453, "title", "Bad Boys", "time", Optional.of(984934), "boxArt", Optional.of("http://cdn-0.nflximg.com/images/2891/BadBoys140.jpg")))));
        Assert.assertThat(Kata11.execute(), equalTo(list));
    }

}
