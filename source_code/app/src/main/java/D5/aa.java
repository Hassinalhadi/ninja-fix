package D5;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class aa {
    public static final aa alpha;
    public static final /* synthetic */ aa[] purple;

    /* JADX INFO: Fake field, exist only in values array */
    aa EF2;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, D5.aa, java.lang.Object] */
    static {
        Enum r22 = new Enum("NOT_SET", 0);
        ?? r32 = new Enum("EVENT_OVERRIDE", 1);
        alpha = r32;
        purple = new aa[]{r22, r32};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, r22);
        sparseArray.put(5, r32);
    }

    public static aa valueOf(String str) {
        return (aa) Enum.valueOf(aa.class, str);
    }

    public static aa[] values() {
        return (aa[]) purple.clone();
    }
}
