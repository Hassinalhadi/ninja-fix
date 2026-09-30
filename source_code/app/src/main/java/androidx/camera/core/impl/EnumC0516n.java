package androidx.camera.core.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.camera.core.impl.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC0516n {
    public static final EnumC0516n alpha;
    public static final EnumC0516n purple;
    public static final EnumC0516n red;
    public static final EnumC0516n silver;
    public static final EnumC0516n teal;
    public static final EnumC0516n white;
    public static final /* synthetic */ EnumC0516n[] yellow;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Enum, androidx.camera.core.impl.n] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Enum, androidx.camera.core.impl.n] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Enum, androidx.camera.core.impl.n] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, androidx.camera.core.impl.n] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, androidx.camera.core.impl.n] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, androidx.camera.core.impl.n] */
    static {
        ?? r62 = new Enum("UNKNOWN", 0);
        alpha = r62;
        ?? r72 = new Enum("INACTIVE", 1);
        purple = r72;
        ?? r82 = new Enum("SEARCHING", 2);
        red = r82;
        ?? r92 = new Enum("FLASH_REQUIRED", 3);
        silver = r92;
        ?? r10 = new Enum("CONVERGED", 4);
        teal = r10;
        ?? r11 = new Enum("LOCKED", 5);
        white = r11;
        yellow = new EnumC0516n[]{r62, r72, r82, r92, r10, r11};
    }

    public static EnumC0516n valueOf(String str) {
        return (EnumC0516n) Enum.valueOf(EnumC0516n.class, str);
    }

    public static EnumC0516n[] values() {
        return (EnumC0516n[]) yellow.clone();
    }
}
