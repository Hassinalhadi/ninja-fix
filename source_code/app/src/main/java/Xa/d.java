package Xa;

import Xd.l;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import vf.ab;

/* loaded from: classes2.dex */
public final class d extends Pd.i implements l {
    public final /* synthetic */ g alpha;
    public final /* synthetic */ ArrayList purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, ArrayList arrayList, Nd.c cVar) {
        super(2, cVar);
        this.alpha = gVar;
        this.purple = arrayList;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new d(this.alpha, this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        b bVar = this.alpha.C;
        if (bVar != null) {
            bVar.bravo(this.purple);
            return Unit.INSTANCE;
        }
        Intrinsics.lima("adapter");
        throw null;
    }
}
