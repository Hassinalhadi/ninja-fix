package D5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class y {
    public static final y alpha;
    public static final /* synthetic */ y[] purple;

    /* JADX INFO: Fake field, exist only in values array */
    y EF2;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [D5.y, java.lang.Enum] */
    static {
        Enum r22 = new Enum("UNKNOWN", 0);
        ?? r32 = new Enum("ANDROID_FIREBASE", 1);
        alpha = r32;
        purple = new y[]{r22, r32};
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) purple.clone();
    }
}
