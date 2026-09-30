package org.junit;

import Vf.b;

/* loaded from: classes2.dex */
public class AssumptionViolatedException extends org.junit.internal.AssumptionViolatedException {
    private static final long serialVersionUID = 1;

    public <T> AssumptionViolatedException(T t5, b bVar) {
        super(t5, bVar);
    }

    public <T> AssumptionViolatedException(String str, T t5, b bVar) {
        super(str, t5, bVar);
    }

    public AssumptionViolatedException(String str) {
        super(str);
    }

    public AssumptionViolatedException(String str, Throwable th) {
        super(str, th);
    }
}
