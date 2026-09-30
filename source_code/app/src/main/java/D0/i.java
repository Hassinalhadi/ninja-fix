package D0;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ i[] f933a;
    public static final i alpha;
    public static final i purple;
    public static final i red;
    public static final i silver;
    public static final i teal;
    public static final i white;
    public static final i yellow;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Enum, D0.i] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Enum, D0.i] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Enum, D0.i] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Enum, D0.i] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Enum, D0.i] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, D0.i] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, D0.i] */
    static {
        ?? r72 = new Enum("Paragraph", 0);
        alpha = r72;
        ?? r82 = new Enum("Span", 1);
        purple = r82;
        ?? r92 = new Enum("VerbatimTts", 2);
        red = r92;
        ?? r10 = new Enum("Url", 3);
        silver = r10;
        ?? r11 = new Enum("Link", 4);
        teal = r11;
        ?? r12 = new Enum("Clickable", 5);
        white = r12;
        ?? r13 = new Enum("String", 6);
        yellow = r13;
        i[] iVarArr = {r72, r82, r92, r10, r11, r12, r13};
        f933a = iVarArr;
        AbstractC2708l7.bravo(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f933a.clone();
    }
}
