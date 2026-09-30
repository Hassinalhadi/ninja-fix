package com.google.common.util.concurrent;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class CycleDetectingLockFactory$PotentialDeadlockException extends CycleDetectingLockFactory$ExampleStackTrace {
    private final CycleDetectingLockFactory$ExampleStackTrace conflictingStackTrace;

    public CycleDetectingLockFactory$ExampleStackTrace getConflictingStackTrace() {
        return this.conflictingStackTrace;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        Objects.requireNonNull(message);
        StringBuilder sb2 = new StringBuilder(message);
        for (Throwable th = this.conflictingStackTrace; th != null; th = th.getCause()) {
            sb2.append(", ");
            sb2.append(th.getMessage());
        }
        return sb2.toString();
    }

    private CycleDetectingLockFactory$PotentialDeadlockException(final b bVar, final b bVar2, CycleDetectingLockFactory$ExampleStackTrace cycleDetectingLockFactory$ExampleStackTrace) {
        new IllegalStateException(bVar, bVar2) { // from class: com.google.common.util.concurrent.CycleDetectingLockFactory$ExampleStackTrace
            static final StackTraceElement[] EMPTY_STACK_TRACE = new StackTraceElement[0];
            static final com.google.common.collect.f EXCLUDED_CLASS_NAMES = com.google.common.collect.f.lima(3, c.class.getName(), "com.google.common.util.concurrent.CycleDetectingLockFactory$ExampleStackTrace", b.class.getName());

            {
                throw null;
            }
        };
        this.conflictingStackTrace = cycleDetectingLockFactory$ExampleStackTrace;
        initCause(cycleDetectingLockFactory$ExampleStackTrace);
    }
}
