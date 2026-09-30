package Pe;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ac {
    public static final ac alpha;
    public static final ac purple;
    public static final /* synthetic */ ac[] red;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, Pe.ac] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, Pe.ac] */
    static {
        ?? r32 = new Enum("RENDER_OVERRIDE", 0);
        alpha = r32;
        ?? r4 = new Enum("RENDER_OPEN", 1);
        purple = r4;
        red = new ac[]{r32, r4, new Enum("RENDER_OPEN_OVERRIDE", 2)};
    }

    public static ac valueOf(String str) {
        return (ac) Enum.valueOf(ac.class, str);
    }

    public static ac[] values() {
        return (ac[]) red.clone();
    }
}
