package je;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: je.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1962a {
    static {
        Object m206constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(Class.forName("java.lang.ClassValue"));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        if (!(m206constructorimpl instanceof kotlin.k)) {
            m206constructorimpl = Boolean.TRUE;
        }
        Object m206constructorimpl2 = Result.m206constructorimpl(m206constructorimpl);
        Boolean bool = Boolean.FALSE;
        if (m206constructorimpl2 instanceof kotlin.k) {
            m206constructorimpl2 = bool;
        }
        ((Boolean) m206constructorimpl2).getClass();
    }

    public static final gd.a alpha(Function1 compute) {
        Intrinsics.echo(compute, "compute");
        return new gd.a(compute);
    }
}
