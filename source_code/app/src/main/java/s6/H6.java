package s6;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public abstract class H6 {
    public static final /* synthetic */ int alpha = 0;

    public static boolean alpha(String current, String str) {
        Intrinsics.echo(current, "current");
        if (Intrinsics.areEqual(current, str)) {
            return true;
        }
        if (current.length() != 0) {
            int i4 = 0;
            int i5 = 0;
            int i10 = 0;
            while (true) {
                if (i4 < current.length()) {
                    char charAt = current.charAt(i4);
                    int i11 = i10 + 1;
                    if (i10 == 0 && charAt != '(') {
                        break;
                    }
                    if (charAt == '(') {
                        i5++;
                    } else if (charAt == ')' && i5 - 1 == 0 && i10 != current.length() - 1) {
                        break;
                    }
                    i4++;
                    i10 = i11;
                } else if (i5 == 0) {
                    String substring = current.substring(1, current.length() - 1);
                    Intrinsics.delta(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    return Intrinsics.areEqual(StringsKt.b(substring).toString(), str);
                }
            }
        }
        return false;
    }
}
