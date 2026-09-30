package com.google.android.gms.internal.measurement;

import java.util.LinkedHashMap;

/* renamed from: com.google.android.gms.internal.measurement.v1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1384v1 implements N1 {
    public static final C1384v1 purple = new C1384v1(0);
    public final /* synthetic */ int alpha;

    public /* synthetic */ C1384v1(int i4) {
        this.alpha = i4;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.LinkedHashMap, com.google.android.gms.internal.measurement.L1] */
    public static final L1 charlie(Object obj, Object obj2) {
        L1 l12 = (L1) obj;
        L1 l13 = (L1) obj2;
        if (!l13.isEmpty()) {
            if (!l12.alpha) {
                if (l12.isEmpty()) {
                    l12 = new L1();
                } else {
                    ?? linkedHashMap = new LinkedHashMap(l12);
                    linkedHashMap.alpha = true;
                    l12 = linkedHashMap;
                }
            }
            l12.bravo();
            if (!l13.isEmpty()) {
                l12.putAll(l13);
            }
        }
        return l12;
    }

    @Override // com.google.android.gms.internal.measurement.N1
    public W1 alpha(Class cls) {
        switch (this.alpha) {
            case 0:
                if (AbstractC1392x1.class.isAssignableFrom(cls)) {
                    try {
                        return (W1) AbstractC1392x1.golf(cls.asSubclass(AbstractC1392x1.class)).mike(3);
                    } catch (Exception e) {
                        throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
                    }
                }
                throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.N1
    public boolean bravo(Class cls) {
        switch (this.alpha) {
            case 0:
                return AbstractC1392x1.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
