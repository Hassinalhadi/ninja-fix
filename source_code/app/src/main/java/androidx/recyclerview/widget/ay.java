package androidx.recyclerview.widget;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ay {
    public static final ay alpha;
    public static final /* synthetic */ ay[] purple;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, androidx.recyclerview.widget.ay] */
    static {
        ?? r32 = new Enum("ALLOW", 0);
        alpha = r32;
        purple = new ay[]{r32, new Enum("PREVENT_WHEN_EMPTY", 1), new Enum("PREVENT", 2)};
    }

    public static ay valueOf(String str) {
        return (ay) Enum.valueOf(ay.class, str);
    }

    public static ay[] values() {
        return (ay[]) purple.clone();
    }
}
