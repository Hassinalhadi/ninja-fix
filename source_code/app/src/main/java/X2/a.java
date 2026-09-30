package X2;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class a {
    public static final a red;
    public static final a silver;
    public static final /* synthetic */ a[] teal;
    public final boolean alpha;
    public final boolean purple;

    static {
        a aVar = new a("ENABLED", 0, true, true);
        red = aVar;
        a aVar2 = new a("READ_ONLY", 1, true, false);
        a aVar3 = new a("WRITE_ONLY", 2, false, true);
        a aVar4 = new a("DISABLED", 3, false, false);
        silver = aVar4;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
        teal = aVarArr;
        AbstractC2708l7.bravo(aVarArr);
    }

    public a(String str, int i4, boolean z2, boolean z10) {
        this.alpha = z2;
        this.purple = z10;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) teal.clone();
    }
}
