package S0;

import java.util.List;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class a {
    public static String alpha(List list, String str, Function1 function1, int i4) {
        String str2;
        if ((i4 & 1) != 0) {
            str = ", ";
        }
        String str3 = "";
        if ((i4 & 2) != 0) {
            str2 = "";
        } else {
            str2 = "[\n\t";
        }
        if ((i4 & 4) == 0) {
            str3 = "\n]";
        }
        if ((i4 & 32) != 0) {
            function1 = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) str2);
        int size = list.size();
        int i5 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            boolean z2 = true;
            i5++;
            if (i5 > 1) {
                sb2.append((CharSequence) str);
            }
            if (function1 != null) {
                sb2.append((CharSequence) function1.invoke(obj));
            } else {
                if (obj != null) {
                    z2 = obj instanceof CharSequence;
                }
                if (z2) {
                    sb2.append((CharSequence) obj);
                } else if (obj instanceof Character) {
                    sb2.append(((Character) obj).charValue());
                } else {
                    sb2.append((CharSequence) obj.toString());
                }
            }
        }
        sb2.append((CharSequence) str3);
        return sb2.toString();
    }

    public static final void bravo(@NotNull String str) {
        throw new UnsupportedOperationException(str);
    }
}
