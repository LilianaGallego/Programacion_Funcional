package katas;

import com.google.common.collect.ImmutableMap;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static org.hamcrest.CoreMatchers.equalTo;


public class Kata9Test {

    @Test
    public void testSize() {
        Assert.assertThat(Kata9.execute().size(), equalTo(4));
    }

    // This can fail (new Date() instance)
    @Test
    public void testResult() {
        List<Map> videos = new ArrayList<>();
        videos.add(ImmutableMap.of("id", 70111470, "title", "Die Hard", "url", Optional.of("http://cdn-0.nflximg.com/images/2891/DieHard150.jpg"), "time", Optional.of(new Date())));
        videos.add(ImmutableMap.of("id", 654356453, "title", "Bad Boys", "url", Optional.of("http://cdn-0.nflximg.com/images/2891/BadBoys150.jpg"), "time", Optional.of(new Date())));
        videos.add(ImmutableMap.of("id", 65432445, "title", "The Chamber", "url", Optional.of("http://cdn-0.nflximg.com/images/2891/TheChamber150.jpg"), "time", Optional.of(new Date())));
        videos.add(ImmutableMap.of("id", 675465, "title", "Fracture", "url", Optional.of("http://cdn-0.nflximg.com/images/2891/Fracture150.jpg"), "time", Optional.of(new Date())));
        Assert.assertThat(Kata9.execute(), equalTo(videos));
    }

}
