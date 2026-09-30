package G2;

import A2.z;
import Pd.i;
import Xd.l;
import kotlin.ResultKt;
import kotlin.Unit;
import t6.AbstractC3027m3;
import xf.r;

/* loaded from: classes3.dex */
public final class b extends i implements l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ c red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Nd.c cVar2) {
        super(2, cVar2);
        this.red = cVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        b bVar = new b(this.red, cVar);
        bVar.purple = obj;
        return bVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((r) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            r rVar = (r) this.purple;
            c cVar = this.red;
            a aVar2 = new a(cVar, rVar);
            H2.f fVar = cVar.alpha;
            fVar.getClass();
            synchronized (fVar.charlie) {
                try {
                    if (fVar.delta.add(aVar2)) {
                        if (fVar.delta.size() == 1) {
                            fVar.echo = fVar.alpha();
                            z.echo().alpha(H2.g.alpha, fVar.getClass().getSimpleName() + ": initial state = " + fVar.echo);
                            fVar.charlie();
                        }
                        aVar2.alpha(fVar.echo);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Aa.i iVar = new Aa.i(10, this.red, aVar2);
            this.alpha = 1;
            if (AbstractC3027m3.alpha(rVar, iVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
