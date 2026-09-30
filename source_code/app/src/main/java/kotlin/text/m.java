package kotlin.text;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class m {
    public static final /* synthetic */ m[] alpha;

    static {
        m[] mVarArr = {new m("IGNORE_CASE", 0, 2), new m("MULTILINE", 1, 8), new m("LITERAL", 2, 16), new m("UNIX_LINES", 3, 1), new m("COMMENTS", 4, 4), new m("DOT_MATCHES_ALL", 5, 32), new m("CANON_EQ", 6, 128)};
        alpha = mVarArr;
        AbstractC2708l7.bravo(mVarArr);
    }

    public m(String str, int i4, int i5) {
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) alpha.clone();
    }
}
