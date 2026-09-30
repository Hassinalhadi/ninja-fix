package F;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class R1 {
    public static final R1 alpha;
    public static final R1 purple;
    public static final R1 red;
    public static final R1 silver;
    public static final R1 teal;
    public static final /* synthetic */ R1[] white;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Enum, F.R1] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, F.R1] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, F.R1] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, F.R1] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, F.R1] */
    static {
        ?? r5 = new Enum("TopBar", 0);
        alpha = r5;
        ?? r62 = new Enum("MainContent", 1);
        purple = r62;
        ?? r72 = new Enum("Snackbar", 2);
        red = r72;
        ?? r82 = new Enum("Fab", 3);
        silver = r82;
        ?? r92 = new Enum("BottomBar", 4);
        teal = r92;
        white = new R1[]{r5, r62, r72, r82, r92};
    }

    public static R1 valueOf(String str) {
        return (R1) Enum.valueOf(R1.class, str);
    }

    public static R1[] values() {
        return (R1[]) white.clone();
    }
}
