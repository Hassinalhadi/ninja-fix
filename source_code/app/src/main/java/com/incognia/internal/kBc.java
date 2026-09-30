package com.incognia.internal;

import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class kBc {
    public static U91 b(String str) {
        String lowerCase = str.toLowerCase(Locale.US);
        try {
            for (Object obj : (List) U91.f9697b.getValue()) {
                if (Intrinsics.areEqual(((U91) obj).W(), lowerCase)) {
                    return (U91) obj;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        } catch (NoSuchElementException unused) {
            throw new IllegalArgumentException("Invalid value: ".concat(str));
        }
    }
}
