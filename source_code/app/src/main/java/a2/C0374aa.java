package a2;

import androidx.compose.runtime.t0;
import bz.AbstractC0779d;
import bz.F;
import bz.a0;
import bz.ar;
import bz.ax;
import bz.f0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: a2.aa, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0374aa extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ F red;
    public final /* synthetic */ Y1.l silver;
    public final /* synthetic */ a0 teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0374aa(F f5, Y1.l lVar, a0 a0Var, Nd.c cVar) {
        super(2, cVar);
        this.red = f5;
        this.silver = lVar;
        this.teal = a0Var;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        C0374aa c0374aa = new C0374aa(this.red, this.silver, this.teal, cVar);
        c0374aa.purple = obj;
        return c0374aa;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C0374aa) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (r14 == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0084, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0082, code lost:
    
        if (bz.P.alpha(r7, 0.0f, 0.0f, r10, r11, r13) == r0) goto L23;
     */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object alpha;
        Object obj2 = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 != 1 && i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.alpha(obj);
        } else {
            ResultKt.alpha(obj);
            vf.ab abVar = (vf.ab) this.purple;
            F f5 = this.red;
            Object value = ((t0) f5.red).getValue();
            Y1.l lVar = this.silver;
            if (!Intrinsics.areEqual(value, lVar)) {
                this.alpha = 1;
                a0 a0Var = f5.teal;
                if (a0Var == null) {
                    alpha = Unit.INSTANCE;
                } else {
                    alpha = ar.alpha(f5.f3441d, new ax(null, f5, a0Var, lVar), this);
                    if (alpha != obj2) {
                        alpha = Unit.INSTANCE;
                    }
                }
            } else {
                long longValue = ((Number) this.teal.lima.getValue()).longValue() / 1000000;
                float d02 = f5.d0();
                f0 kilo = AbstractC0779d.kilo((int) (f5.d0() * ((float) longValue)), 0, null, 6);
                Ac.n nVar = new Ac.n(abVar, f5, lVar, 7);
                this.alpha = 2;
            }
        }
        return Unit.INSTANCE;
    }
}
