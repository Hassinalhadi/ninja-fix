package com.clevertap.android.sdk.network;

import Nd.c;
import Od.a;
import Pd.e;
import Pd.i;
import Xd.l;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import s6.AbstractC2770s7;
import vf.I;
import vf.O;
import vf.P;
import vf.ab;

@e(c = "com.clevertap.android.sdk.network.ContentFetchManager$cancelAllResponseJobs$1", f = "ContentFetchManager.kt", l = {152}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvf/ab;", "", "<anonymous>", "(Lvf/ab;)V"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes3.dex */
public final class ContentFetchManager$cancelAllResponseJobs$1 extends i implements l {
    Object L$0;
    int label;
    final /* synthetic */ ContentFetchManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentFetchManager$cancelAllResponseJobs$1(ContentFetchManager contentFetchManager, c<? super ContentFetchManager$cancelAllResponseJobs$1> cVar) {
        super(2, cVar);
        this.this$0 = contentFetchManager;
    }

    @Override // Pd.a
    public final c<Unit> create(Object obj, c<?> cVar) {
        return new ContentFetchManager$cancelAllResponseJobs$1(this.this$0, cVar);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Iterator bravo;
        a aVar = a.alpha;
        int i4 = this.label;
        if (i4 != 0) {
            if (i4 == 1) {
                bravo = (Iterator) this.L$0;
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            P p4 = (P) this.this$0.getParentJob();
            p4.getClass();
            bravo = AbstractC2770s7.bravo(new O(null, p4));
        }
        while (bravo.hasNext()) {
            I i5 = (I) bravo.next();
            this.L$0 = bravo;
            this.label = 1;
            if (i5.gray(this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // Xd.l
    public final Object invoke(ab abVar, c<? super Unit> cVar) {
        return ((ContentFetchManager$cancelAllResponseJobs$1) create(abVar, cVar)).invokeSuspend(Unit.INSTANCE);
    }
}
