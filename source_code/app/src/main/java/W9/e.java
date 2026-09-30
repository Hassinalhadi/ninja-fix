package W9;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f2194a;

    /* renamed from: b, reason: collision with root package name */
    public static final e f2195b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f2196c;

    /* renamed from: d, reason: collision with root package name */
    public static final e f2197d;
    public static final e e;

    /* renamed from: f, reason: collision with root package name */
    public static final e f2198f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ e[] f2199g;
    public static final u8.b red;
    public static final e silver;
    public static final e teal;
    public static final e white;
    public static final e yellow;
    public final String alpha;
    public final String purple;

    static {
        e eVar = new e("ALLOCATION_WINDOW", 0, "allocationWindow", "neworder");
        silver = eVar;
        e eVar2 = new e("ORDER", 1, "order", "neworder");
        teal = eVar2;
        e eVar3 = new e("ENVELOP", 2, "envelop", "neworder");
        white = eVar3;
        e eVar4 = new e("WITHDRAW", 3, "withdraw", "neworder");
        yellow = eVar4;
        e eVar5 = new e("NEW_ORDER", 4, "new_order", "neworder");
        e eVar6 = new e("BONUS", 5, "bonus", "neworder");
        f2194a = eVar6;
        e eVar7 = new e("SUPPORT", 6, "tickets", "neworder");
        f2195b = eVar7;
        e eVar8 = new e("SHIFTS", 7, "shifts", "neworder");
        f2196c = eVar8;
        e eVar9 = new e("POINTS", 8, "points_home", "coin");
        f2197d = eVar9;
        e eVar10 = new e("REPOSITION_REQUEST", 9, "repositionRequest", "neworder");
        e = eVar10;
        e eVar11 = new e("OTHER", 10, null, "neworder");
        f2198f = eVar11;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9, eVar10, eVar11};
        f2199g = eVarArr;
        AbstractC2708l7.bravo(eVarArr);
        red = new u8.b(11);
    }

    public e(String str, int i4, String str2, String str3) {
        this.alpha = str2;
        this.purple = str3;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f2199g.clone();
    }
}
