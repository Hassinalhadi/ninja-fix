package Af;

import ao.ad;
import com.airbnb.lottie.compose.LottieConstants;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.internal.DiagnosticCoroutineContextException;
import kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed;
import s6.AbstractC2689j6;
import vf.AbstractC3218w;
import vf.AbstractC3220y;
import vf.C3215t;
import vf.H;
import vf.I;
import vf.ay;
import vf.b0;
import vf.h0;

/* loaded from: classes2.dex */
public abstract class f {
    public static final t alpha;
    public static final t bravo;
    public static final t charlie = new t("NO_THREAD_ELEMENTS", 0);
    public static final v delta = new v(0);
    public static final v echo = new v(1);
    public static final v foxtrot = new v(2);

    static {
        int i4 = 0;
        alpha = new t("UNDEFINED", i4);
        bravo = new t("REUSABLE_CLAIMED", i4);
    }

    public static final void alpha(int i4) {
        if (i4 >= 1) {
        } else {
            throw new IllegalArgumentException(ad.zulu(i4, "Expected positive parallelism level, but got ").toString());
        }
    }

    public static final r bravo(Object obj) {
        if (obj != b.alpha) {
            return (r) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void charlie(Nd.h hVar, Throwable th) {
        Throwable runtimeException;
        Iterator it = d.alpha.iterator();
        while (it.hasNext()) {
            try {
                ((CoroutineExceptionHandler) it.next()).handleException(hVar, th);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    AbstractC2689j6.charlie(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            AbstractC2689j6.charlie(th, new DiagnosticCoroutineContextException(hVar));
        } catch (Throwable unused2) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final boolean delta(Object obj) {
        if (obj == b.alpha) {
            return true;
        }
        return false;
    }

    public static final Object echo(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void foxtrot(Nd.h hVar, Object obj) {
        if (obj != charlie) {
            if (obj instanceof x) {
                x xVar = (x) obj;
                Df.a[] aVarArr = xVar.charlie;
                int length = aVarArr.length - 1;
                if (length < 0) {
                    return;
                }
                while (true) {
                    int i4 = length - 1;
                    Df.a aVar = aVarArr[length];
                    Intrinsics.checkNotNull(aVar);
                    aVar.beige(xVar.bravo[length]);
                    if (i4 >= 0) {
                        length = i4;
                    } else {
                        return;
                    }
                }
            } else {
                Object fold = hVar.fold(null, echo);
                Intrinsics.charlie(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
                ((Df.a) fold).beige(obj);
            }
        }
    }

    public static final void golf(Nd.c cVar, Object obj) {
        Object c3215t;
        h0 h0Var;
        if (cVar instanceof e) {
            e eVar = (e) cVar;
            Throwable m207exceptionOrNullimpl = Result.m207exceptionOrNullimpl(obj);
            if (m207exceptionOrNullimpl == null) {
                c3215t = obj;
            } else {
                c3215t = new C3215t(m207exceptionOrNullimpl, false);
            }
            AbstractC3220y abstractC3220y = eVar.silver;
            Pd.c cVar2 = eVar.teal;
            if (india(abstractC3220y, cVar2.getContext())) {
                eVar.white = c3215t;
                eVar.red = 1;
                hotel(abstractC3220y, cVar2.getContext(), eVar);
                return;
            }
            ay alpha2 = b0.alpha();
            if (alpha2.purple >= 4294967296L) {
                eVar.white = c3215t;
                eVar.red = 1;
                alpha2.navy(eVar);
                return;
            }
            alpha2.peach(true);
            try {
                I i4 = (I) cVar2.getContext().get(H.alpha);
                if (i4 != null && !i4.echo()) {
                    eVar.resumeWith(Result.m206constructorimpl(ResultKt.createFailure(i4.quebec())));
                } else {
                    Object obj2 = eVar.yellow;
                    Nd.h context = cVar2.getContext();
                    Object mike = mike(context, obj2);
                    if (mike != charlie) {
                        h0Var = AbstractC3218w.charlie(cVar2, context, mike);
                    } else {
                        h0Var = null;
                    }
                    try {
                        cVar2.resumeWith(obj);
                    } finally {
                        if (h0Var == null || h0Var.d()) {
                            foxtrot(context, mike);
                        }
                    }
                }
                do {
                } while (alpha2.purple());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        cVar.resumeWith(obj);
    }

    public static final void hotel(AbstractC3220y abstractC3220y, Nd.h hVar, Runnable runnable) {
        try {
            abstractC3220y.beige(hVar, runnable);
        } catch (Throwable th) {
            throw new DispatchException(th, abstractC3220y, hVar);
        }
    }

    public static final boolean india(AbstractC3220y abstractC3220y, Nd.h hVar) {
        try {
            return abstractC3220y.indigo(hVar);
        } catch (Throwable th) {
            throw new DispatchException(th, abstractC3220y, hVar);
        }
    }

    public static final long juliet(String str, long j5, long j6, long j7) {
        String str2;
        int i4 = u.alpha;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j5;
        }
        Long uniform = kotlin.text.r.uniform(str2);
        if (uniform != null) {
            long longValue = uniform.longValue();
            if (j6 <= longValue && longValue <= j7) {
                return longValue;
            }
            StringBuilder sb2 = new StringBuilder("System property '");
            sb2.append(str);
            sb2.append("' should be in range ");
            sb2.append(j6);
            Q0.c.amber(sb2, "..", j7, ", but is '");
            sb2.append(longValue);
            sb2.append('\'');
            throw new IllegalStateException(sb2.toString().toString());
        }
        throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
    }

    public static int kilo(int i4, int i5, String str) {
        int i10;
        if ((i5 & 8) != 0) {
            i10 = LottieConstants.IterateForever;
        } else {
            i10 = 2097150;
        }
        return (int) juliet(str, i4, 1, i10);
    }

    public static final Object lima(Nd.h hVar) {
        Object fold = hVar.fold(0, delta);
        Intrinsics.checkNotNull(fold);
        return fold;
    }

    public static final Object mike(Nd.h hVar, Object obj) {
        if (obj == null) {
            obj = lima(hVar);
        }
        if (obj == 0) {
            return charlie;
        }
        if (obj instanceof Integer) {
            return hVar.fold(new x(((Number) obj).intValue(), hVar), foxtrot);
        }
        Intrinsics.charlie(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((Df.a) obj).indigo(hVar);
    }
}
