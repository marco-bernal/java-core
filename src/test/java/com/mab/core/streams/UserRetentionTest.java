package com.mab.core.streams;

import com.mab.core.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import static org.assertj.core.api.Assertions.assertThat;

class UserRetentionTest {

    private UserRetention userRetention;

    @BeforeEach
    void setUp() {
        userRetention = new UserRetention();
    }

    @Test
    void computeR28() {
        //given
        List<User> users = generateUsers();

        //when
        double result = userRetention.computeR28(users, 28);

        //then
        assertThat(result).isPositive();
    }

    private List<User> generateUsers() {
        List<User> users = new ArrayList<>();

        for (int i = 0; i < 35; i++) {
            User user = new User(
                    generateRandomId(50000, 10000),
                    generateRandomDate(),
                    generateRandomId(5000, 1000)
            );

            users.add(user);
        }

        return users;
    }

    private Integer generateRandomId(int max, int min) {
        Random random = new Random();
        return random.nextInt((max - min + 1) + min);
    }

    private Instant generateRandomDate() {
        return Instant.ofEpochSecond(ThreadLocalRandom.current().nextInt());
    }
}