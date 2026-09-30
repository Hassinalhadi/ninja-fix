package com.google.android.gms.tasks;

import G6.q;

/* loaded from: classes2.dex */
public final class DuplicateTaskCompletionException extends IllegalStateException {
    private DuplicateTaskCompletionException(String str, Throwable th) {
        super(str, th);
    }

    public static IllegalStateException of(Task task) {
        String str;
        if (!task.india()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception golf = task.golf();
        if (golf != null) {
            str = "failure";
        } else if (task.juliet()) {
            str = "result ".concat(String.valueOf(task.hotel()));
        } else if (((q) task).delta) {
            str = "cancellation";
        } else {
            str = "unknown issue";
        }
        return new DuplicateTaskCompletionException("Complete with: ".concat(str), golf);
    }
}
