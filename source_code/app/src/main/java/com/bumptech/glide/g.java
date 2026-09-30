package com.bumptech.glide;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class g {
    public static final g alpha;
    public static final g purple;
    public static final g red;
    public static final g silver;
    public static final /* synthetic */ g[] teal;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, com.bumptech.glide.g] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, com.bumptech.glide.g] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, com.bumptech.glide.g] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, com.bumptech.glide.g] */
    static {
        ?? r4 = new Enum("IMMEDIATE", 0);
        alpha = r4;
        ?? r5 = new Enum("HIGH", 1);
        purple = r5;
        ?? r62 = new Enum("NORMAL", 2);
        red = r62;
        ?? r72 = new Enum("LOW", 3);
        silver = r72;
        teal = new g[]{r4, r5, r62, r72};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) teal.clone();
    }
}
