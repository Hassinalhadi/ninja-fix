package androidx.compose.runtime;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class an {
    public static final an alpha;
    public static final an purple;
    public static final an red;
    public static final an silver;
    public static final /* synthetic */ an[] teal;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, androidx.compose.runtime.an] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, androidx.compose.runtime.an] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, androidx.compose.runtime.an] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, androidx.compose.runtime.an] */
    static {
        ?? r4 = new Enum("IGNORED", 0);
        alpha = r4;
        ?? r5 = new Enum("SCHEDULED", 1);
        purple = r5;
        ?? r62 = new Enum("DEFERRED", 2);
        red = r62;
        ?? r72 = new Enum("IMMINENT", 3);
        silver = r72;
        an[] anVarArr = {r4, r5, r62, r72};
        teal = anVarArr;
        AbstractC2708l7.bravo(anVarArr);
    }

    public static an valueOf(String str) {
        return (an) Enum.valueOf(an.class, str);
    }

    public static an[] values() {
        return (an[]) teal.clone();
    }
}
