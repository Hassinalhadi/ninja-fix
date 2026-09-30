package androidx.camera.core.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.camera.core.impl.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC0517o {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ EnumC0517o[] f2951a;
    public static final EnumC0517o alpha;
    public static final EnumC0517o purple;
    public static final EnumC0517o red;
    public static final EnumC0517o silver;
    public static final EnumC0517o teal;
    public static final EnumC0517o white;
    public static final EnumC0517o yellow;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [androidx.camera.core.impl.o, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r11v1, types: [androidx.camera.core.impl.o, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r12v1, types: [androidx.camera.core.impl.o, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r13v1, types: [androidx.camera.core.impl.o, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v0, types: [androidx.camera.core.impl.o, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.camera.core.impl.o, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r9v1, types: [androidx.camera.core.impl.o, java.lang.Enum] */
    static {
        ?? r72 = new Enum("UNKNOWN", 0);
        alpha = r72;
        ?? r82 = new Enum("INACTIVE", 1);
        purple = r82;
        ?? r92 = new Enum("SCANNING", 2);
        red = r92;
        ?? r10 = new Enum("PASSIVE_FOCUSED", 3);
        silver = r10;
        ?? r11 = new Enum("PASSIVE_NOT_FOCUSED", 4);
        teal = r11;
        ?? r12 = new Enum("LOCKED_FOCUSED", 5);
        white = r12;
        ?? r13 = new Enum("LOCKED_NOT_FOCUSED", 6);
        yellow = r13;
        f2951a = new EnumC0517o[]{r72, r82, r92, r10, r11, r12, r13};
    }

    public static EnumC0517o valueOf(String str) {
        return (EnumC0517o) Enum.valueOf(EnumC0517o.class, str);
    }

    public static EnumC0517o[] values() {
        return (EnumC0517o[]) f2951a.clone();
    }
}
