package p2;

import androidx.compose.runtime.N;
import h5.C1809a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.c;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k;
import o2.InterfaceC2196f;

/* renamed from: p2.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2268a {
    public static final N alpha;

    static {
        Object m206constructorimpl;
        N n5;
        Object obj = null;
        try {
            Result.Companion companion = Result.INSTANCE;
            ClassLoader classLoader = InterfaceC2196f.class.getClassLoader();
            Intrinsics.checkNotNull(classLoader);
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalSavedStateRegistryOwner", null);
            Annotation[] annotations = method.getAnnotations();
            Intrinsics.delta(annotations, "getAnnotations(...)");
            int length = annotations.length;
            int i4 = 0;
            while (true) {
                if (i4 < length) {
                    if (annotations[i4] instanceof c) {
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
            n5 = null;
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
            n10 = new N(new C1809a(24));
        }
        alpha = n10;
    }
}
