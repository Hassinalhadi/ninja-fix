package l2;

import androidx.work.impl.WorkDatabase_Impl;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import t6.AbstractC3017k3;
import vf.AbstractC3220y;
import vf.ab;
import vf.ad;
import yf.AbstractC3428A;
import yf.InterfaceC3440j;

/* renamed from: l2.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2055c extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ WorkDatabase_Impl red;
    public final /* synthetic */ InterfaceC3440j silver;
    public final /* synthetic */ String[] teal;
    public final /* synthetic */ J2.q white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2055c(WorkDatabase_Impl workDatabase_Impl, InterfaceC3440j interfaceC3440j, String[] strArr, J2.q qVar, Nd.c cVar) {
        super(2, cVar);
        this.red = workDatabase_Impl;
        this.silver = interfaceC3440j;
        this.teal = strArr;
        this.white = qVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        C2055c c2055c = new C2055c(this.red, this.silver, this.teal, this.white, cVar);
        c2055c.purple = obj;
        return c2055c;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C2055c) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            ab abVar = (ab) this.purple;
            xf.e bravo = AbstractC3017k3.bravo(-1, 6, null);
            com.google.android.material.internal.ab abVar2 = new com.google.android.material.internal.ab(this.teal, bravo);
            Object obj2 = Unit.INSTANCE;
            bravo.mike(obj2);
            if (abVar.charlie().get(r.alpha) == null) {
                WorkDatabase_Impl workDatabase_Impl = this.red;
                Map map = workDatabase_Impl.juliet;
                Object obj3 = map.get("QueryDispatcher");
                if (obj3 == null) {
                    Executor executor = workDatabase_Impl.bravo;
                    if (executor != null) {
                        obj3 = ad.papa(executor);
                        map.put("QueryDispatcher", obj3);
                    } else {
                        Intrinsics.lima("internalQueryExecutor");
                        throw null;
                    }
                }
                xf.e bravo2 = AbstractC3017k3.bravo(0, 7, null);
                ad.zulu(abVar, (AbstractC3220y) obj3, null, new C2054b(workDatabase_Impl, abVar2, bravo, this.white, bravo2, null), 2);
                this.alpha = 1;
                Object mike = AbstractC3428A.mike(this.silver, bravo2, true, this);
                if (mike == aVar) {
                    obj2 = mike;
                }
                if (obj2 == aVar) {
                    return aVar;
                }
            } else {
                throw new ClassCastException();
            }
        }
        return Unit.INSTANCE;
    }
}
