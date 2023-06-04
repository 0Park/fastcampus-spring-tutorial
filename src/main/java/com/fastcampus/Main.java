package com.fastcampus;


import com.fastcampus.config.Config;
import com.fastcampus.logic.BubbleSort;
import com.fastcampus.logic.Sort;
import com.fastcampus.services.SortService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        context 하나 생성
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        SortService sortService = context.getBean(SortService.class);
        System.out.println("[result]"+sortService.doSort(Arrays.asList(args)));

    }
}