package androidx.compose.runtime;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class S {
    public static final S alpha;
    public static final S purple;
    public static final S red;
    public static final S silver;
    public static final S teal;
    public static final S white;
    public static final /* synthetic */ S[] yellow;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [androidx.compose.runtime.S, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r11v1, types: [androidx.compose.runtime.S, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v0, types: [androidx.compose.runtime.S, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.runtime.S, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.compose.runtime.S, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r9v1, types: [androidx.compose.runtime.S, java.lang.Enum] */
    static {
        ?? r62 = new Enum("ShutDown", 0);
        alpha = r62;
        ?? r72 = new Enum("ShuttingDown", 1);
        purple = r72;
        ?? r82 = new Enum("Inactive", 2);
        red = r82;
        ?? r92 = new Enum("InactivePendingWork", 3);
        silver = r92;
        ?? r10 = new Enum("Idle", 4);
        teal = r10;
        ?? r11 = new Enum("PendingWork", 5);
        white = r11;
        S[] sArr = {r62, r72, r82, r92, r10, r11};
        yellow = sArr;
        AbstractC2708l7.bravo(sArr);
    }

    public static S valueOf(String str) {
        return (S) Enum.valueOf(S.class, str);
    }

    public static S[] values() {
        return (S[]) yellow.clone();
    }
}
