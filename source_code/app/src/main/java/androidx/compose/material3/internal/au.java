package androidx.compose.material3.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class au {
    public static final au alpha;
    public static final au purple;
    public static final /* synthetic */ au[] red;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.compose.material3.internal.au, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.material3.internal.au, java.lang.Enum] */
    static {
        ?? r22 = new Enum("Filled", 0);
        alpha = r22;
        ?? r32 = new Enum("Outlined", 1);
        purple = r32;
        red = new au[]{r22, r32};
    }

    public static au valueOf(String str) {
        return (au) Enum.valueOf(au.class, str);
    }

    public static au[] values() {
        return (au[]) red.clone();
    }
}
