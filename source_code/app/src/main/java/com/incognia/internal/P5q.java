package com.incognia.internal;

/* loaded from: classes2.dex */
public abstract class P5q {
    public static final boolean b(BGx bGx, jVu jvu) {
        double d4 = bGx.f8409b;
        if (-90.0d <= d4 && d4 <= 90.0d) {
            double d9 = bGx.f8408W;
            if (-180.0d <= d9 && d9 <= 180.0d && ((Boolean) jvu.f10691W.invoke(bGx)).booleanValue() && ((Boolean) jvu.f10692b.invoke(bGx)).booleanValue() && ((Boolean) jvu.f10693f9.invoke(bGx)).booleanValue()) {
                return true;
            }
            return false;
        }
        return false;
    }
}
