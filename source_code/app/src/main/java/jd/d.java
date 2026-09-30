package jd;

import Xd.o;
import id.C1914b;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.ResultKt;
import kotlin.Unit;
import od.C2226c;

/* loaded from: classes2.dex */
public final class d extends Pd.i implements o {
    public int alpha;
    public /* synthetic */ C2226c purple;
    public /* synthetic */ Object red;
    public final /* synthetic */ ArrayList silver;
    public final /* synthetic */ LinkedHashSet teal;
    public final /* synthetic */ C1914b white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Nd.c cVar, C1914b c1914b, ArrayList arrayList, LinkedHashSet linkedHashSet) {
        super(5, cVar);
        this.silver = arrayList;
        this.teal = linkedHashSet;
        this.white = c1914b;
    }

    @Override // Xd.o
    public final Object golf(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        d dVar = new d((Nd.c) obj5, this.white, this.silver, this.teal);
        dVar.purple = (C2226c) obj2;
        dVar.red = obj3;
        return dVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.alpha(obj);
        C2226c c2226c = this.purple;
        Object obj2 = this.red;
        this.purple = null;
        this.alpha = 1;
        Object alpha = h.alpha(this.silver, this.teal, this.white, c2226c, obj2, this);
        if (alpha == aVar) {
            return aVar;
        }
        return alpha;
    }
}
