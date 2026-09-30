package androidx.compose.foundation.layout;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class E {
    public static final E alpha;
    public static final /* synthetic */ E[] purple;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, androidx.compose.foundation.layout.E] */
    static {
        ?? r22 = new Enum("Horizontal", 0);
        alpha = r22;
        E[] eArr = {r22, new Enum("Vertical", 1)};
        purple = eArr;
        AbstractC2708l7.bravo(eArr);
    }

    public static E valueOf(String str) {
        return (E) Enum.valueOf(E.class, str);
    }

    public static E[] values() {
        return (E[]) purple.clone();
    }
}
