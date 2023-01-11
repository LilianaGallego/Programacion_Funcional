package katas;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;


public class Kata6Test {

    @Test
    public void testExecute() {
        Assert.assertThat(Kata6.execute(), equalTo("http://api.netflix.com/catalog/titles/movies/70111470"));
    }
}
