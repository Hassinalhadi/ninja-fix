package a4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class q {
    public static final q alpha;
    public static final q purple;
    public static final /* synthetic */ q[] red;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, a4.q] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, a4.q] */
    static {
        ?? r22 = new Enum("CAMERA", 0);
        alpha = r22;
        ?? r32 = new Enum("GALLERY", 1);
        purple = r32;
        red = new q[]{r22, r32};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) red.clone();
    }
}
