package com.incognia.internal;

import java.io.File;
import java.util.List;

/* loaded from: classes2.dex */
public final class FW {
    public static Long b(String str) {
        try {
            return Long.valueOf(new File(str).length());
        } catch (Throwable unused) {
            return null;
        }
    }

    public final native List fep(List list);
}
