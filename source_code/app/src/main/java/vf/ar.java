package vf;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class ar extends K {
    public final /* synthetic */ int teal;
    public final Object white;

    public /* synthetic */ ar(int i4, Object obj) {
        this.teal = i4;
        this.white = obj;
    }

    @Override // vf.K
    public final boolean juliet() {
        switch (this.teal) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                return false;
        }
    }

    @Override // vf.K
    public final void kilo(Throwable th) {
        Object obj = this.white;
        switch (this.teal) {
            case 0:
                ((aq) obj).dispose();
                return;
            case 1:
                ((Function1) obj).invoke(th);
                return;
            default:
                Object obj2 = P.alpha.get(india());
                L l10 = (L) obj;
                if (obj2 instanceof C3215t) {
                    Result.Companion companion = Result.INSTANCE;
                    l10.resumeWith(Result.m206constructorimpl(ResultKt.createFailure(((C3215t) obj2).alpha)));
                    return;
                } else {
                    Result.Companion companion2 = Result.INSTANCE;
                    l10.resumeWith(Result.m206constructorimpl(ad.black(obj2)));
                    return;
                }
        }
    }
}
