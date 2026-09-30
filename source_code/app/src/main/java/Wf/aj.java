package Wf;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class aj implements o {
    public static final com.google.mlkit.common.sdkinternal.b alpha;
    public static final aj purple;
    public static final aj red;
    public static final /* synthetic */ aj[] silver;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [Wf.aj, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [Wf.aj, java.lang.Enum] */
    static {
        ?? r22 = new Enum("LIGHT", 0);
        purple = r22;
        ?? r32 = new Enum("DARK", 1);
        red = r32;
        aj[] ajVarArr = {r22, r32};
        silver = ajVarArr;
        AbstractC2708l7.bravo(ajVarArr);
        alpha = new com.google.mlkit.common.sdkinternal.b(12);
    }

    public static aj valueOf(String str) {
        return (aj) Enum.valueOf(aj.class, str);
    }

    public static aj[] values() {
        return (aj[]) silver.clone();
    }
}
