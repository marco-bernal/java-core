package com.mab.core.streams;

import com.mab.core.model.User;
import lombok.extern.slf4j.Slf4j;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import static java.time.temporal.ChronoUnit.DAYS;

/*
 * TODO: Once defined the R28 metric. Implement the rolling window here.
 * Not c;ear yet how this should work. HINT: Might be a rolling window function.
 * Steps:
 * Get latest access date
 * Separate new users and returning ones
 * Compute r28
 * Group by week
 * */
@Slf4j
public class UserRetention {

    public double computeR28(List<User> users, Integer threshold) {
        Instant thresholdDate = Instant.now().minus(threshold, DAYS);
        List<User> activeUsers = new ArrayList<>();
        List<User> nonActiveUsers = new ArrayList<>();

        users.forEach(
                u -> {
                    // Get the non-active users if the latest access is older than 28 days
                    if (u.latestAccess().isBefore(thresholdDate)) {
                        nonActiveUsers.add(u);
                        log.info("Added Non active user: {}", u);

                    } // Get active users if the latest access is not older than 28 days
                    else {
                        activeUsers.add(u);
                        log.info("Added Active user: {}", u);
                    }
                }
        );

        int nonActiveUsersCount = nonActiveUsers.size();
        int activeUsersCount = activeUsers.size();
        log.info("nonActiveUsersCount: {}, activeUsersCount: {}", nonActiveUsersCount, activeUsersCount);

        log.info("R28: {}", nonActiveUsersCount / activeUsersCount);

        return nonActiveUsersCount / activeUsersCount;
    }
}
