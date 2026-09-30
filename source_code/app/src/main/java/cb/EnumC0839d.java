package cb;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: cb.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0839d {
    public static final EnumC0839d alpha;
    public static final EnumC0839d purple;
    public static final EnumC0839d red;
    public static final EnumC0839d silver;
    public static final /* synthetic */ EnumC0839d[] teal;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, cb.d] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, cb.d] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, cb.d] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, cb.d] */
    static {
        ?? r4 = new Enum("INACTIVE", 0);
        alpha = r4;
        ?? r5 = new Enum("START", 1);
        purple = r5;
        ?? r62 = new Enum("IN_PROGRESS", 2);
        red = r62;
        ?? r72 = new Enum("COMPLETED", 3);
        silver = r72;
        EnumC0839d[] enumC0839dArr = {r4, r5, r62, r72};
        teal = enumC0839dArr;
        AbstractC2708l7.bravo(enumC0839dArr);
    }

    public static EnumC0839d valueOf(String str) {
        return (EnumC0839d) Enum.valueOf(EnumC0839d.class, str);
    }

    public static EnumC0839d[] values() {
        return (EnumC0839d[]) teal.clone();
    }
}
