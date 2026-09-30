package kotlin.text;

import s6.AbstractC2752q6;

/* loaded from: classes2.dex */
public final class f {
    public static final f bravo = new f();
    public final boolean alpha = true;

    public f() {
        if (!AbstractC2752q6.alpha("")) {
            AbstractC2752q6.alpha("");
        }
    }

    public final void alpha(StringBuilder sb2, String str) {
        Q0.c.azure(sb2, str, "prefix = \"", "", "\",");
        sb2.append('\n');
        sb2.append(str);
        sb2.append("suffix = \"");
        sb2.append("");
        sb2.append("\",");
        sb2.append('\n');
        sb2.append(str);
        sb2.append("removeLeadingZeros = ");
        sb2.append(false);
        sb2.append(',');
        sb2.append('\n');
        sb2.append(str);
        sb2.append("minLength = ");
        sb2.append(1);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("NumberHexFormat(\n");
        alpha(sb2, "    ");
        sb2.append('\n');
        sb2.append(")");
        return sb2.toString();
    }
}
