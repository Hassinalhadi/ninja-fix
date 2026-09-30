package a0;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class al {
    public static final /* synthetic */ al[] alpha;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        al[] alVarArr = {new Enum("CounterClockwise", 0), new Enum("Clockwise", 1)};
        alpha = alVarArr;
        AbstractC2708l7.bravo(alVarArr);
    }

    public static al valueOf(String str) {
        return (al) Enum.valueOf(al.class, str);
    }

    public static al[] values() {
        return (al[]) alpha.clone();
    }
}
