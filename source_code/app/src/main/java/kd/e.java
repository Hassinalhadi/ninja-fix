package kd;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f12929a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ e[] f12930b;
    public static final e silver;
    public static final e teal;
    public static final e white;
    public static final e yellow;
    public final boolean alpha;
    public final boolean purple;
    public final boolean red;

    static {
        e eVar = new e("ALL", true, true, true, 0);
        silver = eVar;
        e eVar2 = new e("HEADERS", true, true, false, 1);
        teal = eVar2;
        e eVar3 = new e("BODY", true, false, true, 2);
        white = eVar3;
        e eVar4 = new e("INFO", true, false, false, 3);
        yellow = eVar4;
        e eVar5 = new e("NONE", false, false, false, 4);
        f12929a = eVar5;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5};
        f12930b = eVarArr;
        AbstractC2708l7.bravo(eVarArr);
    }

    public e(String str, boolean z2, boolean z10, boolean z11, int i4) {
        this.alpha = z2;
        this.purple = z10;
        this.red = z11;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f12930b.clone();
    }
}
