package com.mab.core.collections.map;

import lombok.extern.slf4j.Slf4j;

import java.util.Map;

@Slf4j
public class BasicMapExample {

    public void printMapValuesWithLambda(Map<String, Integer> map) {
        map.forEach((k, v) -> log.info("key: {}. value: {}", k, v));
    }

    public void printMapValuesWithStreams(Map<String, Integer> map) {
        map.entrySet()
                .stream()
                .forEach(entry -> log.info("key: {}. value: {}", entry.getKey(), entry.getValue()));
    }
}
