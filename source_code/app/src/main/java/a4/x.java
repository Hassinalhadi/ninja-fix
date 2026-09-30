package a4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class x {
    public static final x alpha;
    public static final /* synthetic */ x[] purple;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [a4.x, java.lang.Enum] */
    static {
        ?? r4 = new Enum("RECTANGLE", 0);
        alpha = r4;
        purple = new x[]{r4, new Enum("OVAL", 1), new Enum("RECTANGLE_VERTICAL_ONLY", 2), new Enum("RECTANGLE_HORIZONTAL_ONLY", 3)};
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) purple.clone();
    }
}
