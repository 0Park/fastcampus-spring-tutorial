package com.fastcampus.services;

import com.fastcampus.logic.BubbleSort;
import com.fastcampus.logic.JavaSort;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest {
    private  SortService sut = new SortService(new BubbleSort<String>());

    @Test
    void doSort() {
        //given

        //when
         List<String> output =sut.doSort(List.of("3","2","1"));


         //then
        assertEquals(List.of("1","2","3"),output);

    }
}