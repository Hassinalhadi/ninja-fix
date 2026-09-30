package E3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class j {
    public static final j alpha;
    public static final /* synthetic */ j[] purple;

    /* JADX INFO: Fake field, exist only in values array */
    j EF2;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, E3.j] */
    static {
        Enum r22 = new Enum("SRGB", 0);
        ?? r32 = new Enum("DISPLAY_P3", 1);
        alpha = r32;
        purple = new j[]{r22, r32};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) purple.clone();
    }
}
