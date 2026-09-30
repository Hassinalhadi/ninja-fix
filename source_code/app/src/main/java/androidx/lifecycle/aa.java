package androidx.lifecycle;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class aa {
    private static final /* synthetic */ Qd.a $ENTRIES;
    private static final /* synthetic */ aa[] $VALUES;

    @NotNull
    public static final C0654y Companion;
    public static final aa ON_ANY;
    public static final aa ON_CREATE;
    public static final aa ON_DESTROY;
    public static final aa ON_PAUSE;
    public static final aa ON_RESUME;
    public static final aa ON_START;
    public static final aa ON_STOP;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, androidx.lifecycle.y] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Enum, androidx.lifecycle.aa] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Enum, androidx.lifecycle.aa] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Enum, androidx.lifecycle.aa] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Enum, androidx.lifecycle.aa] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Enum, androidx.lifecycle.aa] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, androidx.lifecycle.aa] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, androidx.lifecycle.aa] */
    static {
        ?? r72 = new Enum("ON_CREATE", 0);
        ON_CREATE = r72;
        ?? r82 = new Enum("ON_START", 1);
        ON_START = r82;
        ?? r92 = new Enum("ON_RESUME", 2);
        ON_RESUME = r92;
        ?? r10 = new Enum("ON_PAUSE", 3);
        ON_PAUSE = r10;
        ?? r11 = new Enum("ON_STOP", 4);
        ON_STOP = r11;
        ?? r12 = new Enum("ON_DESTROY", 5);
        ON_DESTROY = r12;
        ?? r13 = new Enum("ON_ANY", 6);
        ON_ANY = r13;
        aa[] aaVarArr = {r72, r82, r92, r10, r11, r12, r13};
        $VALUES = aaVarArr;
        $ENTRIES = AbstractC2708l7.bravo(aaVarArr);
        Companion = new Object();
    }

    public static aa valueOf(String str) {
        return (aa) Enum.valueOf(aa.class, str);
    }

    public static aa[] values() {
        return (aa[]) $VALUES.clone();
    }

    public final ab alpha() {
        switch (AbstractC0655z.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
            case 2:
                return ab.red;
            case 3:
            case 4:
                return ab.silver;
            case 5:
                return ab.teal;
            case 6:
                return ab.alpha;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
