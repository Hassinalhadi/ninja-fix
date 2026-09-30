package androidx.compose.foundation.layout;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class aa {
    public static final aa alpha;
    public static final aa purple;
    public static final aa red;
    public static final /* synthetic */ aa[] silver;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.compose.foundation.layout.aa, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.foundation.layout.aa, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.foundation.layout.aa, java.lang.Enum] */
    static {
        ?? r32 = new Enum("Vertical", 0);
        alpha = r32;
        ?? r4 = new Enum("Horizontal", 1);
        purple = r4;
        ?? r5 = new Enum("Both", 2);
        red = r5;
        aa[] aaVarArr = {r32, r4, r5};
        silver = aaVarArr;
        AbstractC2708l7.bravo(aaVarArr);
    }

    public static aa valueOf(String str) {
        return (aa) Enum.valueOf(aa.class, str);
    }

    public static aa[] values() {
        return (aa[]) silver.clone();
    }
}
