package a4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class v {
    public static final v alpha;
    public static final v purple;
    public static final /* synthetic */ v[] red;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, a4.v] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, a4.v] */
    static {
        ?? r22 = new Enum("RECTANGLE", 0);
        alpha = r22;
        ?? r32 = new Enum("OVAL", 1);
        purple = r32;
        red = new v[]{r22, r32};
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) red.clone();
    }
}
