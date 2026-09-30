package O7;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class e {
    public static final e alpha;
    public static final HashMap purple;
    public static final /* synthetic */ e[] red;

    /* JADX INFO: Fake field, exist only in values array */
    e EF10;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, O7.e] */
    static {
        Enum r10 = new Enum("X86_32", 0);
        Enum r11 = new Enum("X86_64", 1);
        Enum r12 = new Enum("ARM_UNKNOWN", 2);
        Enum r13 = new Enum("PPC", 3);
        Enum r14 = new Enum("PPC64", 4);
        Enum r15 = new Enum("ARMV6", 5);
        Enum r62 = new Enum("ARMV7", 6);
        ?? r4 = new Enum("UNKNOWN", 7);
        alpha = r4;
        Enum r32 = new Enum("ARMV7S", 8);
        Enum r22 = new Enum("ARM64", 9);
        red = new e[]{r10, r11, r12, r13, r14, r15, r62, r4, r32, r22};
        HashMap hashMap = new HashMap(4);
        purple = hashMap;
        hashMap.put("armeabi-v7a", r62);
        hashMap.put("armeabi", r15);
        hashMap.put("arm64-v8a", r22);
        hashMap.put("x86", r10);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) red.clone();
    }
}
