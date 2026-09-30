package androidx.camera.core.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.camera.core.impl.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC0518p {
    public static final EnumC0518p alpha;
    public static final EnumC0518p purple;
    public static final EnumC0518p red;
    public static final EnumC0518p silver;
    public static final EnumC0518p teal;
    public static final /* synthetic */ EnumC0518p[] white;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.camera.core.impl.p, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.camera.core.impl.p, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.camera.core.impl.p, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.camera.core.impl.p, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r9v1, types: [androidx.camera.core.impl.p, java.lang.Enum] */
    static {
        ?? r5 = new Enum("UNKNOWN", 0);
        alpha = r5;
        ?? r62 = new Enum("INACTIVE", 1);
        purple = r62;
        ?? r72 = new Enum("METERING", 2);
        red = r72;
        ?? r82 = new Enum("CONVERGED", 3);
        silver = r82;
        ?? r92 = new Enum("LOCKED", 4);
        teal = r92;
        white = new EnumC0518p[]{r5, r62, r72, r82, r92};
    }

    public static EnumC0518p valueOf(String str) {
        return (EnumC0518p) Enum.valueOf(EnumC0518p.class, str);
    }

    public static EnumC0518p[] values() {
        return (EnumC0518p[]) white.clone();
    }
}
