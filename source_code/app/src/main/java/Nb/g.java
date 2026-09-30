package Nb;

import Xd.l;
import android.content.Context;
import android.net.ConnectivityManager;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import vf.ab;
import yf.AbstractC3428A;
import yf.InterfaceC3439i;

/* loaded from: classes2.dex */
public final class g extends Pd.i implements l {
    public int alpha;
    public final /* synthetic */ h purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = hVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new g(this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            h hVar = this.purple;
            Context context = hVar.alpha;
            Intrinsics.echo(context, "context");
            Object systemService = context.getSystemService("connectivity");
            Intrinsics.charlie(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            InterfaceC3439i lima = AbstractC3428A.lima(AbstractC3428A.india(new d((ConnectivityManager) systemService, null)));
            Ba.e eVar = new Ba.e(7, hVar);
            this.alpha = 1;
            if (lima.collect(eVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
