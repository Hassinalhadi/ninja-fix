package d3;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import t3.InterfaceC2960e;
import td.C3117a;
import vf.ab;
import vf.ad;
import vf.ao;

/* loaded from: classes3.dex */
public final class h extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ k purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = kVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new h(this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        k kVar = this.purple;
        try {
            if (i4 != 0) {
                if (i4 == 1) {
                    ResultKt.alpha(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.alpha(obj);
                InterfaceC2960e interfaceC2960e = kVar.e;
                if (interfaceC2960e != null) {
                    this.alpha = 1;
                    obj = interfaceC2960e.charlie(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    Intrinsics.lima("repositionService");
                    throw null;
                }
            }
            List list = (List) obj;
            if (!list.isEmpty()) {
                C3117a echo = ad.echo();
                Cf.e eVar = ao.alpha;
                ad.zulu(echo, Af.n.alpha, null, new g(kVar, list, null), 2);
            }
        } catch (Exception unused) {
        }
        return Unit.INSTANCE;
    }
}
