package com.mab.core.model;

import java.time.Instant;

public record User(
        Integer userId,
        Instant latestAccess,
        Integer activeDays
) {}


