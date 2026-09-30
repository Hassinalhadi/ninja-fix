package sc;

import com.google.android.gms.measurement.internal.C1471u;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: sc.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC2848c {
    public static final C1471u alpha;
    public static final EnumC2848c purple;
    public static final EnumC2848c red;
    public static final /* synthetic */ EnumC2848c[] silver;
    public static final /* synthetic */ Qd.b teal;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [sc.c, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r9v0, types: [sc.c, java.lang.Enum] */
    static {
        ?? r92 = new Enum("PENDING", 0);
        purple = r92;
        Enum r10 = new Enum("AUTO_ASSIGNED", 1);
        Enum r11 = new Enum("ACCEPTED", 2);
        Enum r12 = new Enum("REJECTED", 3);
        Enum r13 = new Enum("ACCEPTED_OTHER", 4);
        Enum r14 = new Enum("DEMAND_SATISFIED_BY_OTHER_CAPTAIN", 5);
        Enum r15 = new Enum("EXPIRED", 6);
        Enum r32 = new Enum("CANCELLED", 7);
        ?? r22 = new Enum("UNKNOWN", 8);
        red = r22;
        EnumC2848c[] enumC2848cArr = {r92, r10, r11, r12, r13, r14, r15, r32, r22};
        silver = enumC2848cArr;
        teal = AbstractC2708l7.bravo(enumC2848cArr);
        alpha = new C1471u(15);
    }

    public static EnumC2848c valueOf(String str) {
        return (EnumC2848c) Enum.valueOf(EnumC2848c.class, str);
    }

    public static EnumC2848c[] values() {
        return (EnumC2848c[]) silver.clone();
    }
}
