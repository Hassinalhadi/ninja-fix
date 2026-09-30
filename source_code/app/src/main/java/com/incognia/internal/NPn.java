package com.incognia.internal;

import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class NPn {
    public static RuF b(String str) {
        String lowerCase = str.toLowerCase(Locale.US);
        try {
            for (Object obj : (List) RuF.f9565W.getValue()) {
                if (Intrinsics.areEqual(((RuF) obj).f9566b.toLowerCase(Locale.US), lowerCase)) {
                    return (RuF) obj;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        } catch (NoSuchElementException unused) {
            throw new IllegalArgumentException("Invalid value: ".concat(str));
        }
    }
}
