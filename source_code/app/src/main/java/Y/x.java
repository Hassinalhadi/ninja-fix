package Y;

import kotlin.NoWhenBranchMatchedException;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class x implements v {
    public static final x alpha;
    public static final x purple;
    public static final x red;
    public static final x silver;
    public static final /* synthetic */ x[] teal;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [Y.x, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [Y.x, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v1, types: [Y.x, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [Y.x, java.lang.Enum] */
    static {
        ?? r4 = new Enum("Active", 0);
        alpha = r4;
        ?? r5 = new Enum("ActiveParent", 1);
        purple = r5;
        ?? r62 = new Enum("Captured", 2);
        red = r62;
        ?? r72 = new Enum("Inactive", 3);
        silver = r72;
        x[] xVarArr = {r4, r5, r62, r72};
        teal = xVarArr;
        AbstractC2708l7.bravo(xVarArr);
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) teal.clone();
    }

    public final boolean alpha() {
        int i4 = w.$EnumSwitchMapping$0[ordinal()];
        if (i4 == 1 || i4 == 2 || i4 == 3) {
            return true;
        }
        if (i4 == 4) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean bravo() {
        int i4 = w.$EnumSwitchMapping$0[ordinal()];
        if (i4 == 1 || i4 == 2) {
            return true;
        }
        if (i4 != 3 && i4 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return false;
    }
}
