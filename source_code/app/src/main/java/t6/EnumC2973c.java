package t6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: t6.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC2973c {
    public static final EnumC2973c alpha;
    public static final /* synthetic */ EnumC2973c[] purple;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [t6.c, java.lang.Enum] */
    static {
        ?? r32 = new Enum("DEFAULT", 0);
        alpha = r32;
        purple = new EnumC2973c[]{r32, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static EnumC2973c[] values() {
        return (EnumC2973c[]) purple.clone();
    }
}
