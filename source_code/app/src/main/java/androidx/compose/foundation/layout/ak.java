package androidx.compose.foundation.layout;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ak {
    public static final ak alpha;
    public static final /* synthetic */ ak[] purple;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, androidx.compose.foundation.layout.ak] */
    static {
        Enum r4 = new Enum("Visible", 0);
        ?? r5 = new Enum("Clip", 1);
        alpha = r5;
        ak[] akVarArr = {r4, r5, new Enum("ExpandIndicator", 2), new Enum("ExpandOrCollapseIndicator", 3)};
        purple = akVarArr;
        AbstractC2708l7.bravo(akVarArr);
    }

    public static ak valueOf(String str) {
        return (ak) Enum.valueOf(ak.class, str);
    }

    public static ak[] values() {
        return (ak[]) purple.clone();
    }
}
