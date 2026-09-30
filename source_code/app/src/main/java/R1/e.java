package R1;

import androidx.compose.runtime.N;
import androidx.lifecycle.al;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k;

/* loaded from: classes3.dex */
public abstract class e {
    public static final N alpha;

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        r1 = null;
     */
    static {
        Object m206constructorimpl;
        N n5;
        Object obj = null;
        try {
            Result.Companion companion = Result.INSTANCE;
            ClassLoader classLoader = al.class.getClassLoader();
            Intrinsics.checkNotNull(classLoader);
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", null);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i4 = 0;
            while (true) {
                if (i4 < length) {
                    if (annotations[i4] instanceof kotlin.c) {
                        break;
                    } else {
                        i4++;
                    }
                } else {
                    Object invoke = method.invoke(null, null);
                    if (invoke instanceof N) {
                        n5 = (N) invoke;
                    }
                }
            }
            m206constructorimpl = Result.m206constructorimpl(n5);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        if (!(m206constructorimpl instanceof k)) {
            obj = m206constructorimpl;
        }
        N n10 = (N) obj;
        if (n10 == null) {
            n10 = new N(new Q4.a(23));
        }
        alpha = n10;
    }
}
