package Pf;

import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes2.dex */
public abstract class d {
    public static final int alpha;

    static {
        Object m206constructorimpl;
        int i4;
        Integer num;
        Object obj = null;
        try {
            Result.Companion companion = Result.INSTANCE;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            if (property != null) {
                num = kotlin.text.r.tango(property);
            } else {
                num = null;
            }
            m206constructorimpl = Result.m206constructorimpl(num);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        if (!(m206constructorimpl instanceof kotlin.k)) {
            obj = m206constructorimpl;
        }
        Integer num2 = (Integer) obj;
        if (num2 != null) {
            i4 = num2.intValue();
        } else {
            i4 = 2097152;
        }
        alpha = i4;
    }
}
