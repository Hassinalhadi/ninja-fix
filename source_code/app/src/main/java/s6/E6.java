package s6;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class E6 {
    public static final String alpha(String str) {
        Intrinsics.echo(str, "<this>");
        if (str.length() == 0) {
            return str;
        }
        char charAt = str.charAt(0);
        if ('a' <= charAt && charAt < '{') {
            char upperCase = Character.toUpperCase(charAt);
            String substring = str.substring(1);
            Intrinsics.delta(substring, "this as java.lang.String).substring(startIndex)");
            return upperCase + substring;
        }
        return str;
    }

    public static final double bravo(int i4, int i5, int i10, int i11, Y2.g gVar) {
        double d4 = i10 / i4;
        double d9 = i11 / i5;
        int i12 = O2.h.$EnumSwitchMapping$0[gVar.ordinal()];
        if (i12 != 1) {
            if (i12 == 2) {
                return Math.min(d4, d9);
            }
            throw new NoWhenBranchMatchedException();
        }
        return Math.max(d4, d9);
    }

    public static final boolean charlie(int i4, String str) {
        char charAt = str.charAt(i4);
        if ('A' <= charAt && charAt < '[') {
            return true;
        }
        return false;
    }

    public static final String delta(String str) {
        Intrinsics.echo(str, "<this>");
        StringBuilder sb2 = new StringBuilder(str.length());
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = str.charAt(i4);
            if ('A' <= charAt && charAt < '[') {
                charAt = Character.toLowerCase(charAt);
            }
            sb2.append(charAt);
        }
        String sb3 = sb2.toString();
        Intrinsics.delta(sb3, "builder.toString()");
        return sb3;
    }
}
