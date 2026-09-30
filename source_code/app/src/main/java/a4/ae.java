package a4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ae {
    public static final ae alpha;
    public static final ae purple;
    public static final ae red;
    public static final /* synthetic */ ae[] silver;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [a4.ae, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v1, types: [a4.ae, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [a4.ae, java.lang.Enum] */
    static {
        ?? r4 = new Enum("FIT_CENTER", 0);
        alpha = r4;
        Enum r5 = new Enum("CENTER", 1);
        ?? r62 = new Enum("CENTER_CROP", 2);
        purple = r62;
        ?? r72 = new Enum("CENTER_INSIDE", 3);
        red = r72;
        silver = new ae[]{r4, r5, r62, r72};
    }

    public static ae valueOf(String str) {
        return (ae) Enum.valueOf(ae.class, str);
    }

    public static ae[] values() {
        return (ae[]) silver.clone();
    }
}
