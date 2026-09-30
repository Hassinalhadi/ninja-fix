package org.junit.runners.model;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class TestTimedOutException extends Exception {
    private static final long serialVersionUID = 31935685163547539L;
    private final TimeUnit timeUnit;
    private final long timeout;

    public TestTimedOutException(long j5, TimeUnit timeUnit) {
        super(String.format("test timed out after %d %s", Long.valueOf(j5), timeUnit.name().toLowerCase()));
        this.timeUnit = timeUnit;
        this.timeout = j5;
    }

    public TimeUnit getTimeUnit() {
        return this.timeUnit;
    }

    public long getTimeout() {
        return this.timeout;
    }
}
