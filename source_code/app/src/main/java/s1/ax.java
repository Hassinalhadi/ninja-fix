package s1;

import android.view.View;
import android.view.ViewGroup;
import kotlin.ResultKt;
import kotlin.Unit;
import pf.C2359i;
import pf.C2363m;

/* loaded from: classes3.dex */
public final class ax extends Pd.h implements Xd.l {
    public int purple;
    public /* synthetic */ Object red;
    public final /* synthetic */ View silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax(View view, Nd.c cVar) {
        super(2, cVar);
        this.silver = view;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        ax axVar = new ax(this.silver, cVar);
        axVar.red = obj;
        return axVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((ax) create((C2359i) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3 = Od.a.alpha;
        int i4 = this.purple;
        View view = this.silver;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    ResultKt.alpha(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C2359i c2359i = (C2359i) this.red;
                ResultKt.alpha(obj);
                if (view instanceof ViewGroup) {
                    this.red = null;
                    this.purple = 2;
                    c2359i.getClass();
                    C2363m c2363m = new C2363m(new Lf.h(8, (ViewGroup) view));
                    if (!c2363m.purple.hasNext()) {
                        obj2 = Unit.INSTANCE;
                    } else {
                        c2359i.red = c2363m;
                        c2359i.alpha = 2;
                        c2359i.silver = this;
                        obj2 = obj3;
                    }
                    if (obj2 != obj3) {
                        obj2 = Unit.INSTANCE;
                    }
                    if (obj2 == obj3) {
                        return obj3;
                    }
                }
            }
            return Unit.INSTANCE;
        }
        ResultKt.alpha(obj);
        C2359i c2359i2 = (C2359i) this.red;
        this.red = c2359i2;
        this.purple = 1;
        c2359i2.bravo(this, view);
        return obj3;
    }
}
