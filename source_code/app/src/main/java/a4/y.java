package a4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class y {
    public static final y alpha;
    public static final y purple;
    public static final /* synthetic */ y[] red;

    /* JADX INFO: Fake field, exist only in values array */
    y EF3;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [a4.y, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [a4.y, java.lang.Enum] */
    static {
        Enum r32 = new Enum("OFF", 0);
        ?? r4 = new Enum("ON_TOUCH", 1);
        alpha = r4;
        ?? r5 = new Enum("ON", 2);
        purple = r5;
        red = new y[]{r32, r4, r5};
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) red.clone();
    }
}
