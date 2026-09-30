package Af;

import aa.AbstractC0417a;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes2.dex */
public abstract class s {
    public static final /* synthetic */ int alpha = 0;

    static {
        Object m206constructorimpl;
        Object m206constructorimpl2;
        Exception exc = new Exception();
        String simpleName = AbstractC0417a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            Result.Companion companion = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(Pd.a.class.getCanonicalName());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m207exceptionOrNullimpl(m206constructorimpl) != null) {
            m206constructorimpl = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            m206constructorimpl2 = Result.m206constructorimpl(s.class.getCanonicalName());
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            m206constructorimpl2 = Result.m206constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m207exceptionOrNullimpl(m206constructorimpl2) != null) {
            m206constructorimpl2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
