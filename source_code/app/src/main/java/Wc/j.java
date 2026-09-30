package Wc;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class j extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ l red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, Nd.c cVar) {
        super(2, cVar);
        this.red = lVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        j jVar = new j(this.red, cVar);
        jVar.purple = obj;
        return jVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((j) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
        return Od.a.alpha;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        vf.ab abVar = (vf.ab) this.purple;
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        l lVar = this.red;
        try {
            if (i4 != 0) {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.alpha(obj);
                throw new KotlinNothingValueException();
            }
            ResultKt.alpha(obj);
            vf.ad.zulu(abVar, null, null, new h(lVar, null), 3);
            vf.ad.zulu(abVar, null, null, new i(lVar, null), 3);
            this.purple = null;
            this.alpha = 1;
            vf.ad.india(this);
            return aVar;
        } catch (Throwable th) {
            lVar.victor().tango();
            lVar.coral().alpha();
            throw th;
        }
    }
}
