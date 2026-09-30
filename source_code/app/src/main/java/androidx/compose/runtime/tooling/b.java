package androidx.compose.runtime.tooling;

import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2689j6;

/* loaded from: classes3.dex */
public abstract class b {
    public static final boolean alpha(Throwable th, Function0 function0) {
        List sierra;
        boolean z2;
        Object invoke;
        Intrinsics.echo(th, "<this>");
        Integer num = Sd.a.alpha;
        DiagnosticComposeException diagnosticComposeException = null;
        if (num != null && num.intValue() < 19) {
            Method method = Rd.a.bravo;
            if (method != null && (invoke = method.invoke(th, null)) != null) {
                sierra = ArraysKt.sierra((Throwable[]) invoke);
            } else {
                sierra = CollectionsKt.emptyList();
            }
        } else {
            Throwable[] suppressed = th.getSuppressed();
            Intrinsics.delta(suppressed, "getSuppressed(...)");
            sierra = ArraysKt.sierra(suppressed);
        }
        boolean z10 = false;
        if (sierra != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 || !sierra.isEmpty()) {
            Iterator it = sierra.iterator();
            while (it.hasNext()) {
                if (((Throwable) it.next()) instanceof DiagnosticComposeException) {
                    return false;
                }
            }
        }
        try {
            List list = (List) function0.invoke();
            boolean isEmpty = list.isEmpty();
            z10 = !isEmpty;
            if (!isEmpty) {
                diagnosticComposeException = new DiagnosticComposeException(list);
            }
        } catch (Throwable th2) {
            diagnosticComposeException = th2;
        }
        if (diagnosticComposeException != null) {
            AbstractC2689j6.charlie(th, diagnosticComposeException);
        }
        return z10;
    }
}
