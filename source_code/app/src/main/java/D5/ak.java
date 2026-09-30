package D5;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ak {
    public static final ak alpha;
    public static final /* synthetic */ ak[] purple;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [D5.ak, java.lang.Enum, java.lang.Object] */
    static {
        ?? r62 = new Enum("DEFAULT", 0);
        alpha = r62;
        Enum r72 = new Enum("UNMETERED_ONLY", 1);
        Enum r82 = new Enum("UNMETERED_OR_DAILY", 2);
        Enum r92 = new Enum("FAST_IF_RADIO_AWAKE", 3);
        Enum r10 = new Enum("NEVER", 4);
        Enum r11 = new Enum("UNRECOGNIZED", 5);
        purple = new ak[]{r62, r72, r82, r92, r10, r11};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, r62);
        sparseArray.put(1, r72);
        sparseArray.put(2, r82);
        sparseArray.put(3, r92);
        sparseArray.put(4, r10);
        sparseArray.put(-1, r11);
    }

    public static ak valueOf(String str) {
        return (ak) Enum.valueOf(ak.class, str);
    }

    public static ak[] values() {
        return (ak[]) purple.clone();
    }
}
