package w;

import android.view.View;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import t0.au;
import v.AbstractC3164c;
import vf.ab;
import vf.ad;

/* renamed from: w.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3225c extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ au red;
    public final /* synthetic */ Ec.d silver;
    public final /* synthetic */ C3227e teal;
    public final /* synthetic */ q white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3225c(au auVar, Ec.d dVar, C3227e c3227e, q qVar, Nd.c cVar) {
        super(2, cVar);
        this.red = auVar;
        this.silver = dVar;
        this.teal = c3227e;
        this.white = qVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        C3225c c3225c = new C3225c(this.red, this.silver, this.teal, this.white, cVar);
        c3225c.purple = obj;
        return c3225c;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((C3225c) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
        return Od.a.alpha;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        C3227e c3227e = this.teal;
        try {
            if (i4 != 0) {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.alpha(obj);
                throw new KotlinNothingValueException();
            }
            ResultKt.alpha(obj);
            ab abVar = (ab) this.purple;
            s sVar = t.alpha;
            au auVar = this.red;
            View view = auVar.alpha;
            sVar.getClass();
            o oVar = new o(view);
            u uVar = new u(auVar.alpha, new C3224b(this.white), oVar);
            if (AbstractC3164c.alpha) {
                ad.zulu(abVar, null, null, new C3223a(c3227e, oVar, null), 3);
            }
            Ec.d dVar = this.silver;
            if (dVar != null) {
                dVar.invoke(uVar);
            }
            c3227e.charlie = uVar;
            this.alpha = 1;
            auVar.alpha(uVar, this);
            return aVar;
        } catch (Throwable th) {
            c3227e.charlie = null;
            throw th;
        }
    }
}
