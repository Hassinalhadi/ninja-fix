package s6;

import com.clevertap.android.sdk.Constants;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: s6.j6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2689j6 {
    public static final boolean alpha(Object[] objArr, int i4, int i5, List list) {
        if (i5 == list.size()) {
            for (int i10 = 0; i10 < i5; i10++) {
                if (Intrinsics.areEqual(objArr[i4 + i10], list.get(i10))) {
                }
            }
            return true;
        }
        return false;
    }

    public static final String bravo(Object[] objArr, int i4, int i5, kotlin.collections.g gVar) {
        StringBuilder sb2 = new StringBuilder((i5 * 3) + 2);
        sb2.append(Constants.AES_PREFIX);
        for (int i10 = 0; i10 < i5; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object obj = objArr[i4 + i10];
            if (obj == gVar) {
                sb2.append("(this Collection)");
            } else {
                sb2.append(obj);
            }
        }
        sb2.append(Constants.AES_SUFFIX);
        String sb3 = sb2.toString();
        Intrinsics.delta(sb3, "toString(...)");
        return sb3;
    }

    public static void charlie(Throwable th, Throwable exception) {
        boolean z2;
        Intrinsics.echo(th, "<this>");
        Intrinsics.echo(exception, "exception");
        if (th != exception) {
            Integer num = Sd.a.alpha;
            if (num != null && num.intValue() < 19) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                th.addSuppressed(exception);
                return;
            }
            Method method = Rd.a.alpha;
            if (method != null) {
                method.invoke(th, exception);
            }
        }
    }

    public static final void delta(int i4, Object[] objArr, int i5) {
        Intrinsics.echo(objArr, "<this>");
        while (i4 < i5) {
            objArr[i4] = null;
            i4++;
        }
    }

    public static String echo(Throwable th) {
        Intrinsics.echo(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        Intrinsics.delta(stringWriter2, "toString(...)");
        return stringWriter2;
    }
}
