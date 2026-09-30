package U0;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ae {
    public static final ae alpha;
    public static final ae purple;
    public static final /* synthetic */ ae[] red;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [U0.ae, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v1, types: [U0.ae, java.lang.Enum] */
    static {
        ?? r32 = new Enum("Inherit", 0);
        alpha = r32;
        ?? r4 = new Enum("SecureOn", 1);
        purple = r4;
        ae[] aeVarArr = {r32, r4, new Enum("SecureOff", 2)};
        red = aeVarArr;
        AbstractC2708l7.bravo(aeVarArr);
    }

    public static ae valueOf(String str) {
        return (ae) Enum.valueOf(ae.class, str);
    }

    public static ae[] values() {
        return (ae[]) red.clone();
    }
}
