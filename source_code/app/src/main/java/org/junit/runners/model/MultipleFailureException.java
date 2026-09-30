package org.junit.runners.model;

import cg.c;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.junit.TestCouldNotBeSkippedException;
import org.junit.internal.AssumptionViolatedException;

/* loaded from: classes2.dex */
public class MultipleFailureException extends Exception {
    private static final long serialVersionUID = 1;
    private final List<Throwable> fErrors;

    public MultipleFailureException(List<Throwable> list) {
        if (!list.isEmpty()) {
            this.fErrors = new ArrayList(list.size());
            for (Throwable th : list) {
                if (th instanceof AssumptionViolatedException) {
                    th = new TestCouldNotBeSkippedException((AssumptionViolatedException) th);
                }
                this.fErrors.add(th);
            }
            return;
        }
        throw new IllegalArgumentException("List of Throwables must not be empty");
    }

    public static void assertEmpty(List<Throwable> list) throws Exception {
        if (list.isEmpty()) {
            return;
        }
        if (list.size() == 1) {
            Throwable th = list.get(0);
            int i4 = c.alpha;
            throw th;
        }
        throw new org.junit.internal.runners.model.MultipleFailureException(list);
    }

    public List<Throwable> getFailures() {
        return Collections.unmodifiableList(this.fErrors);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb2 = new StringBuilder(String.format("There were %d errors:", Integer.valueOf(this.fErrors.size())));
        for (Throwable th : this.fErrors) {
            sb2.append(String.format("%n  %s(%s)", th.getClass().getName(), th.getMessage()));
        }
        return sb2.toString();
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        Iterator<Throwable> it = this.fErrors.iterator();
        while (it.hasNext()) {
            it.next().printStackTrace();
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        Iterator<Throwable> it = this.fErrors.iterator();
        while (it.hasNext()) {
            it.next().printStackTrace(printStream);
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        Iterator<Throwable> it = this.fErrors.iterator();
        while (it.hasNext()) {
            it.next().printStackTrace(printWriter);
        }
    }
}
