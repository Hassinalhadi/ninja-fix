package com.incognia.internal;

/* loaded from: classes2.dex */
public abstract class lzc {
    public static String b(Throwable th) {
        try {
            Throwable cause = th.getCause();
            StringBuilder sb2 = new StringBuilder();
            for (int i4 = 0; cause != null && i4 < 5; i4++) {
                sb2.append(cause.getClass().getName());
                sb2.append(": ");
                sb2.append(cause.getMessage());
                sb2.append("\n");
                cause = cause.getCause();
            }
            return sb2.toString();
        } catch (Throwable unused) {
            return null;
        }
    }
}
