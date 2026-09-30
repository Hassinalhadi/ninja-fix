package y;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: y.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC3381u {
    public static final EnumC3381u alpha;
    public static final /* synthetic */ EnumC3381u[] purple;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [y.u, java.lang.Enum] */
    static {
        ?? r22 = new Enum("EditableText", 0);
        alpha = r22;
        EnumC3381u[] enumC3381uArr = {r22, new Enum("StaticText", 1)};
        purple = enumC3381uArr;
        AbstractC2708l7.bravo(enumC3381uArr);
    }

    public static EnumC3381u valueOf(String str) {
        return (EnumC3381u) Enum.valueOf(EnumC3381u.class, str);
    }

    public static EnumC3381u[] values() {
        return (EnumC3381u[]) purple.clone();
    }
}
