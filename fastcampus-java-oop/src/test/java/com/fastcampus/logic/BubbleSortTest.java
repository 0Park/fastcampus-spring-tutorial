package com.fastcampus.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {


    @DisplayName("버블소트- 리스트르를 넣으면 정렬된 결과를 보여준다.")
    @Test
    void sort() {
        //given
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();

        //when
        List<Integer> output=  bubbleSort.sort(List.of(5,6,3,8,1,2));

        //then
        assertEquals(List.of(1,2,3,5,6,8),output);


    }
}