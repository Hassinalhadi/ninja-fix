package E8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class c {
    public static final c alpha;
    public static final c purple;
    public static final c red;
    public static final c silver;
    public static final c teal;
    public static final /* synthetic */ c[] white;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Enum, E8.c] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, E8.c] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, E8.c] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, E8.c] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, E8.c] */
    static {
        ?? r5 = new Enum("UNKNOWN", 0);
        alpha = r5;
        ?? r62 = new Enum("CONFIG_UPDATE_STREAM_ERROR", 1);
        purple = r62;
        ?? r72 = new Enum("CONFIG_UPDATE_MESSAGE_INVALID", 2);
        red = r72;
        ?? r82 = new Enum("CONFIG_UPDATE_NOT_FETCHED", 3);
        silver = r82;
        ?? r92 = new Enum("CONFIG_UPDATE_UNAVAILABLE", 4);
        teal = r92;
        white = new c[]{r5, r62, r72, r82, r92};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) white.clone();
    }
}
