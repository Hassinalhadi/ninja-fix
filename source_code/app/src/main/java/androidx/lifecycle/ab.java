package androidx.lifecycle;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ab {
    public static final ab alpha;
    public static final ab purple;
    public static final ab red;
    public static final ab silver;
    public static final ab teal;
    public static final /* synthetic */ ab[] white;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Enum, androidx.lifecycle.ab] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, androidx.lifecycle.ab] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, androidx.lifecycle.ab] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, androidx.lifecycle.ab] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, androidx.lifecycle.ab] */
    static {
        ?? r5 = new Enum("DESTROYED", 0);
        alpha = r5;
        ?? r62 = new Enum("INITIALIZED", 1);
        purple = r62;
        ?? r72 = new Enum("CREATED", 2);
        red = r72;
        ?? r82 = new Enum("STARTED", 3);
        silver = r82;
        ?? r92 = new Enum("RESUMED", 4);
        teal = r92;
        ab[] abVarArr = {r5, r62, r72, r82, r92};
        white = abVarArr;
        AbstractC2708l7.bravo(abVarArr);
    }

    public static ab valueOf(String str) {
        return (ab) Enum.valueOf(ab.class, str);
    }

    public static ab[] values() {
        return (ab[]) white.clone();
    }

    public final boolean alpha(ab abVar) {
        if (compareTo(abVar) >= 0) {
            return true;
        }
        return false;
    }
}
