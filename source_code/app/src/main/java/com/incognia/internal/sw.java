package com.incognia.internal;

import java.util.Comparator;
import java.util.Map;
import s6.AbstractC2769s6;

/* loaded from: classes2.dex */
public final class sw implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return AbstractC2769s6.bravo((Long) ((Map.Entry) obj2).getValue(), (Long) ((Map.Entry) obj).getValue());
    }
}
