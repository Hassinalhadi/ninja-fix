package bp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class h {
    public static final h alpha;
    public static final h purple;
    public static final /* synthetic */ h[] red;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, bp.h] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, bp.h] */
    static {
        ?? r22 = new Enum("IDLE", 0);
        alpha = r22;
        ?? r32 = new Enum("STREAMING", 1);
        purple = r32;
        red = new h[]{r22, r32};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) red.clone();
    }
}
