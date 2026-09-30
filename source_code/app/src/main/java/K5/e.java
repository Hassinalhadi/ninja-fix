package K5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class e {
    public static final e alpha;
    public static final e purple;
    public static final e red;
    public static final /* synthetic */ e[] silver;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [K5.e, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v1, types: [K5.e, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [K5.e, java.lang.Enum] */
    static {
        ?? r32 = new Enum("NETWORK_UNMETERED", 0);
        alpha = r32;
        ?? r4 = new Enum("DEVICE_IDLE", 1);
        purple = r4;
        ?? r5 = new Enum("DEVICE_CHARGING", 2);
        red = r5;
        silver = new e[]{r32, r4, r5};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) silver.clone();
    }
}
