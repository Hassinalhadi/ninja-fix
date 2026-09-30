package X9;

import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import vf.C3207k;

/* loaded from: classes2.dex */
public final class v implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ C3207k purple;

    public /* synthetic */ v(C3207k c3207k, int i4) {
        this.alpha = i4;
        this.purple = c3207k;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C3207k c3207k = this.purple;
        switch (this.alpha) {
            case 0:
                c3207k.resumeWith(Result.m206constructorimpl((com.google.android.play.core.integrity.m) obj));
                return Unit.INSTANCE;
            case 1:
                Result.Companion companion = Result.INSTANCE;
                c3207k.resumeWith(Result.m206constructorimpl(((com.google.android.play.core.integrity.l) obj).alpha));
                return Unit.INSTANCE;
            default:
                Result.Companion companion2 = Result.INSTANCE;
                Unit unit = Unit.INSTANCE;
                c3207k.resumeWith(Result.m206constructorimpl(unit));
                return unit;
        }
    }
}
