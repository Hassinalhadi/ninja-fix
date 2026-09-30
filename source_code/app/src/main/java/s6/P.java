package s6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class P {
    public static final P alpha;
    public static final /* synthetic */ P[] purple;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [s6.P, java.lang.Enum] */
    static {
        ?? r32 = new Enum("DEFAULT", 0);
        alpha = r32;
        purple = new P[]{r32, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static P[] values() {
        return (P[]) purple.clone();
    }
}
