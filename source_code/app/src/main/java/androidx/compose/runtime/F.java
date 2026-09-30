package androidx.compose.runtime;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ F[] f2996a;
    public static final F alpha;
    public static final F purple;
    public static final F red;
    public static final F silver;
    public static final F teal;
    public static final F white;
    public static final F yellow;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [androidx.compose.runtime.F, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r11v1, types: [androidx.compose.runtime.F, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r12v1, types: [androidx.compose.runtime.F, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r13v1, types: [androidx.compose.runtime.F, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v0, types: [androidx.compose.runtime.F, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.compose.runtime.F, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r9v1, types: [androidx.compose.runtime.F, java.lang.Enum] */
    static {
        ?? r72 = new Enum("Invalid", 0);
        alpha = r72;
        ?? r82 = new Enum("Cancelled", 1);
        purple = r82;
        ?? r92 = new Enum("InitialPending", 2);
        red = r92;
        ?? r10 = new Enum("RecomposePending", 3);
        silver = r10;
        ?? r11 = new Enum("Recomposing", 4);
        teal = r11;
        ?? r12 = new Enum("ApplyPending", 5);
        white = r12;
        ?? r13 = new Enum("Applied", 6);
        yellow = r13;
        F[] fArr = {r72, r82, r92, r10, r11, r12, r13};
        f2996a = fArr;
        AbstractC2708l7.bravo(fArr);
    }

    public static F valueOf(String str) {
        return (F) Enum.valueOf(F.class, str);
    }

    public static F[] values() {
        return (F[]) f2996a.clone();
    }
}
