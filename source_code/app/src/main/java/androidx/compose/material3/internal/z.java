package androidx.compose.material3.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class z {
    public static final z alpha;
    public static final z purple;
    public static final z red;
    public static final /* synthetic */ z[] silver;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, androidx.compose.material3.internal.z] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, androidx.compose.material3.internal.z] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, androidx.compose.material3.internal.z] */
    static {
        ?? r32 = new Enum("Focused", 0);
        alpha = r32;
        ?? r4 = new Enum("UnfocusedEmpty", 1);
        purple = r4;
        ?? r5 = new Enum("UnfocusedNotEmpty", 2);
        red = r5;
        silver = new z[]{r32, r4, r5};
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) silver.clone();
    }
}
