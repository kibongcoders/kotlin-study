package com.kibong.kotlinstudy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class KeywordJavaTest {

    @Test
    public void variableTest() {
        final String immutableKiBong = "immutable kibong";
        String mutableKiBong = "mutable kibong";
        //immutableKiBong = "immutable kibong test"; Error
        mutableKiBong = "mutable kibong test";
    }

    @Test
    public void variableInitTest(){
        final String immutableKiBong;
        immutableKiBong = "immutable kibong";
        assertEquals(immutableKiBong, "immutable kibong");
    }

    @Test
    public void ListImmutableTest(){
        final List<String> kibongList = new ArrayList<>();
        kibongList.add("Immutable");
        kibongList.add("kibong");
        kibongList.add("is Good");

        assertEquals(kibongList.size(), 3);
    }



}
