package d;

import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ao extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ ap red;
    public final /* synthetic */ long silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao(ap apVar, long j5, Nd.c cVar) {
        super(2, cVar);
        this.red = apVar;
        this.silver = j5;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        ao aoVar = new ao(this.red, this.silver, cVar);
        aoVar.purple = obj;
        return aoVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((ao) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        float f5;
        float bravo;
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
            vf.ab abVar = (vf.ab) this.purple;
            ap apVar = this.red;
            Xd.m mVar = apVar.f11989i;
            boolean z2 = apVar.f11990j;
            long j5 = this.silver;
            if (z2) {
                f5 = -1.0f;
            } else {
                f5 = 1.0f;
            }
            long foxtrot = Q0.r.foxtrot(f5, j5);
            K k6 = apVar.f11986f;
            ak akVar = al.alpha;
            if (k6 == K.alpha) {
                bravo = Q0.r.charlie(foxtrot);
            } else {
                bravo = Q0.r.bravo(foxtrot);
            }
            Float f10 = new Float(bravo);
            this.alpha = 1;
            if (mVar.invoke(abVar, f10, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
