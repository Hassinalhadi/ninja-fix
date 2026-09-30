package a2;

import androidx.compose.runtime.t0;
import bz.C;
import bz.F;
import bz.a0;
import bz.ar;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: a2.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0401z extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ float purple;
    public final /* synthetic */ F red;
    public final /* synthetic */ Y1.l silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0401z(float f5, F f10, Y1.l lVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = f5;
        this.red = f10;
        this.silver = lVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C0401z(this.purple, this.red, this.silver, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C0401z) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0078, code lost:
    
        if (r8 == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0036, code lost:
    
        if (r2.f0(r4, ((androidx.compose.runtime.t0) r2.purple).getValue(), r7) == r0) goto L30;
     */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object alpha;
        Object obj2 = Od.a.alpha;
        int i4 = this.alpha;
        F f5 = this.red;
        float f10 = this.purple;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    ResultKt.alpha(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.alpha(obj);
        } else {
            ResultKt.alpha(obj);
            if (f10 > 0.0f) {
                this.alpha = 1;
            }
        }
        if (f10 == 0.0f) {
            this.alpha = 2;
            a0 a0Var = f5.teal;
            if (a0Var == null) {
                alpha = Unit.INSTANCE;
            } else {
                Object value = ((t0) f5.red).getValue();
                Y1.l lVar = this.silver;
                if (Intrinsics.areEqual(value, lVar) && Intrinsics.areEqual(((t0) f5.purple).getValue(), lVar)) {
                    alpha = Unit.INSTANCE;
                } else {
                    alpha = ar.alpha(f5.f3441d, new C(null, f5, a0Var, lVar), this);
                    if (alpha != obj2) {
                        alpha = Unit.INSTANCE;
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
