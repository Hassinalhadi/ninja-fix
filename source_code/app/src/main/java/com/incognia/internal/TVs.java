package com.incognia.internal;

import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class TVs {
    public static zJO b(String str) {
        String lowerCase = str.toLowerCase(Locale.US);
        try {
            for (Object obj : (List) zJO.f11901W.getValue()) {
                if (Intrinsics.areEqual(((zJO) obj).f11902b.toLowerCase(Locale.US), lowerCase)) {
                    return (zJO) obj;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        } catch (NoSuchElementException unused) {
            throw new IllegalArgumentException("Invalid value: ".concat(str));
        }
    }
}
