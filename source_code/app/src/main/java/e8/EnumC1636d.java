package e8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: e8.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC1636d {
    public static final EnumC1636d alpha;
    public static final /* synthetic */ EnumC1636d[] purple;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, e8.d] */
    static {
        ?? r32 = new Enum("DEFAULT", 0);
        alpha = r32;
        purple = new EnumC1636d[]{r32, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static EnumC1636d valueOf(String str) {
        return (EnumC1636d) Enum.valueOf(EnumC1636d.class, str);
    }

    public static EnumC1636d[] values() {
        return (EnumC1636d[]) purple.clone();
    }
}
