package m0;

import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.C3207k;

/* loaded from: classes3.dex */
public final class ad extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ long purple;
    public final /* synthetic */ af red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad(long j5, af afVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = j5;
        this.red = afVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new ad(this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((ad) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (vf.ad.november(8, r10) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002b, code lost:
    
        if (vf.ad.november(r4 - 8, r10) == r0) goto L15;
     */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        long j5 = this.purple;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    ResultKt.alpha(obj);
                    C3207k c3207k = this.red.red;
                    if (c3207k != null) {
                        Result.Companion companion = Result.INSTANCE;
                        c3207k.resumeWith(Result.m206constructorimpl(ResultKt.createFailure(new PointerEventTimeoutCancellationException(j5))));
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.alpha(obj);
        } else {
            ResultKt.alpha(obj);
            this.alpha = 1;
        }
        this.alpha = 2;
    }
}
