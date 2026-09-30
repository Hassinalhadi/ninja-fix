package w;

import androidx.compose.runtime.C0564b;
import kotlin.ResultKt;
import kotlin.Unit;
import pe.AbstractC2327c;
import pf.C2361k;
import vf.ab;
import yf.as;
import yf.az;

/* renamed from: w.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3223a extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ C3227e purple;
    public final /* synthetic */ o red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3223a(C3227e c3227e, o oVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = c3227e;
        this.red = oVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C3223a(this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C3223a) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                throw AbstractC2327c.amber(obj);
            }
            ResultKt.alpha(obj);
        } else {
            ResultKt.alpha(obj);
            C2361k c2361k = new C2361k(23);
            this.alpha = 1;
            if (C0564b.sierra(getContext()).blue(new S.a(1, c2361k), this) == aVar) {
                return aVar;
            }
        }
        as india = this.purple.india();
        if (india != null) {
            Ba.e eVar = new Ba.e(12, this.red);
            this.alpha = 2;
            az.juliet((az) india, eVar, this);
            return aVar;
        }
        return Unit.INSTANCE;
    }
}
