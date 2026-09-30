package g3;

import com.app.network.network.models.AttributeActionType;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: g3.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC1747h {
    public static final EnumC1747h alpha;
    public static final EnumC1747h purple;
    public static final EnumC1747h red;
    public static final /* synthetic */ EnumC1747h[] silver;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, g3.h] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, g3.h] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, g3.h] */
    static {
        ?? r32 = new Enum(AttributeActionType.FORCE, 0);
        alpha = r32;
        ?? r4 = new Enum("OPTIONAL", 1);
        purple = r4;
        ?? r5 = new Enum("INFO", 2);
        red = r5;
        EnumC1747h[] enumC1747hArr = {r32, r4, r5};
        silver = enumC1747hArr;
        AbstractC2708l7.bravo(enumC1747hArr);
    }

    public static EnumC1747h valueOf(String str) {
        return (EnumC1747h) Enum.valueOf(EnumC1747h.class, str);
    }

    public static EnumC1747h[] values() {
        return (EnumC1747h[]) silver.clone();
    }
}
