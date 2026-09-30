package l2;

import androidx.work.impl.WorkDatabase_Impl;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ad;
import yf.InterfaceC3440j;

/* loaded from: classes3.dex */
public final class d extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ WorkDatabase_Impl red;
    public final /* synthetic */ String[] silver;
    public final /* synthetic */ J2.q teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(WorkDatabase_Impl workDatabase_Impl, String[] strArr, J2.q qVar, Nd.c cVar) {
        super(2, cVar);
        this.red = workDatabase_Impl;
        this.silver = strArr;
        this.teal = qVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        d dVar = new d(this.red, this.silver, this.teal, cVar);
        dVar.purple = obj;
        return dVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((InterfaceC3440j) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            C2055c c2055c = new C2055c(this.red, (InterfaceC3440j) this.purple, this.silver, this.teal, null);
            this.alpha = 1;
            if (ad.mike(c2055c, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
