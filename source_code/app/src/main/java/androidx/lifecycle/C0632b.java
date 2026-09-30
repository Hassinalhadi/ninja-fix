package androidx.lifecycle;

import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0632b extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ av.ao purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0632b(av.ao aoVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = aoVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C0632b(this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C0632b) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        av.ao aoVar = this.purple;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            aoVar.getClass();
            this.alpha = 1;
            if (vf.ad.november(5000L, this) == aVar) {
                return aVar;
            }
        }
        if (!((C0639i) aoVar.alpha).hasActiveObservers()) {
            vf.Y y10 = (vf.Y) aoVar.teal;
            if (y10 != null) {
                y10.foxtrot(null);
            }
            aoVar.teal = null;
        }
        return Unit.INSTANCE;
    }
}
