package katas;

import com.google.common.collect.ImmutableMap;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.equalTo;


public class Kata8Test {

    @Test
    public void testSize() {
        Assert.assertThat(Kata8.execute().size(), equalTo(3));
    }

    @Test
    public void testResult() {
        List<Map> videoBookmarks = new ArrayList<>();
        videoBookmarks.add(ImmutableMap.of("videoId", 70111470, "bookmarkId", 470));
        videoBookmarks.add(ImmutableMap.of("videoId", 654356453, "bookmarkId", 453));
        videoBookmarks.add(ImmutableMap.of("videoId", 65432445, "bookmarkId", 445));
        Assert.assertThat(Kata8.execute(), equalTo(videoBookmarks));
    }

}
