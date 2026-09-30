package androidx.sqlite.db.framework;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class e {
    public static final e alpha;
    public static final e purple;
    public static final e red;
    public static final e silver;
    public static final e teal;
    public static final /* synthetic */ e[] white;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Enum, androidx.sqlite.db.framework.e] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, androidx.sqlite.db.framework.e] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, androidx.sqlite.db.framework.e] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, androidx.sqlite.db.framework.e] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, androidx.sqlite.db.framework.e] */
    static {
        ?? r5 = new Enum("ON_CONFIGURE", 0);
        alpha = r5;
        ?? r62 = new Enum("ON_CREATE", 1);
        purple = r62;
        ?? r72 = new Enum("ON_UPGRADE", 2);
        red = r72;
        ?? r82 = new Enum("ON_DOWNGRADE", 3);
        silver = r82;
        ?? r92 = new Enum("ON_OPEN", 4);
        teal = r92;
        white = new e[]{r5, r62, r72, r82, r92};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) white.clone();
    }
}
