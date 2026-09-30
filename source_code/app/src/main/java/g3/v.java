package g3;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ v[] f12647a;
    public static final v alpha;
    public static final v purple;
    public static final v red;
    public static final v silver;
    public static final v teal;
    public static final v white;
    public static final v yellow;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Enum, g3.v] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Enum, g3.v] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Enum, g3.v] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Enum, g3.v] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Enum, g3.v] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, g3.v] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, g3.v] */
    static {
        ?? r72 = new Enum("NULL_LOCATION", 0);
        alpha = r72;
        ?? r82 = new Enum("MOCK_NOT_ALLOWED", 1);
        purple = r82;
        ?? r92 = new Enum("INVALID_ACCURACY", 2);
        red = r92;
        ?? r10 = new Enum("ACCURACY_TOO_POOR", 3);
        silver = r10;
        ?? r11 = new Enum("TOO_OLD", 4);
        teal = r11;
        ?? r12 = new Enum("INVALID_COORDINATES", 5);
        white = r12;
        ?? r13 = new Enum("STALE_OR_FAR_FROM_LAST_SENT", 6);
        yellow = r13;
        v[] vVarArr = {r72, r82, r92, r10, r11, r12, r13};
        f12647a = vVarArr;
        AbstractC2708l7.bravo(vVarArr);
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f12647a.clone();
    }
}
