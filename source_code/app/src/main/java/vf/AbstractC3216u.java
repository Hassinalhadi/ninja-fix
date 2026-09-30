package vf;

import kotlin.Result;
import kotlin.ResultKt;

/* renamed from: vf.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3216u {
    public static final Object alpha(Object obj) {
        if (obj instanceof C3215t) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m206constructorimpl(ResultKt.createFailure(((C3215t) obj).alpha));
        }
        return Result.m206constructorimpl(obj);
    }
}
