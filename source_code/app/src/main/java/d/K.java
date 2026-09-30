package d;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class K {
    public static final K alpha;
    public static final K purple;
    public static final /* synthetic */ K[] red;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [d.K, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [d.K, java.lang.Enum] */
    static {
        ?? r22 = new Enum("Vertical", 0);
        alpha = r22;
        ?? r32 = new Enum("Horizontal", 1);
        purple = r32;
        K[] kArr = {r22, r32};
        red = kArr;
        AbstractC2708l7.bravo(kArr);
    }

    public static K valueOf(String str) {
        return (K) Enum.valueOf(K.class, str);
    }

    public static K[] values() {
        return (K[]) red.clone();
    }
}
