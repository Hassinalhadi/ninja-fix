package t0;

import android.view.View;
import androidx.compose.runtime.C0564b;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Ref;

/* loaded from: classes3.dex */
public final class M0 extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ Ref.ObjectRef red;
    public final /* synthetic */ androidx.compose.runtime.Y silver;
    public final /* synthetic */ androidx.lifecycle.al teal;
    public final /* synthetic */ N0 white;
    public final /* synthetic */ View yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M0(Ref.ObjectRef objectRef, androidx.compose.runtime.Y y10, androidx.lifecycle.al alVar, N0 n02, View view, Nd.c cVar) {
        super(2, cVar);
        this.red = objectRef;
        this.silver = y10;
        this.teal = alVar;
        this.white = n02;
        this.yellow = view;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        M0 m02 = new M0(this.red, this.silver, this.teal, this.white, this.yellow, cVar);
        m02.purple = obj;
        return m02;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((M0) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a2  */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vf.I i4;
        vf.Y y10;
        Object obj2 = Od.a.alpha;
        int i5 = this.alpha;
        androidx.lifecycle.al alVar = this.teal;
        N0 n02 = this.white;
        if (i5 != 0) {
            if (i5 == 1) {
                i4 = (vf.I) this.purple;
                try {
                    ResultKt.alpha(obj);
                } catch (Throwable th) {
                    th = th;
                    if (i4 != null) {
                        i4.foxtrot(null);
                    }
                    alVar.getLifecycle().charlie(n02);
                    throw th;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            vf.ab abVar = (vf.ab) this.purple;
            try {
                C2919i0 c2919i0 = (C2919i0) this.red.alpha;
                if (c2919i0 != null) {
                    yf.L alpha = P0.alpha(this.yellow.getContext().getApplicationContext());
                    ((androidx.compose.runtime.n0) c2919i0.alpha).kilo(((Number) alpha.getValue()).floatValue());
                    y10 = vf.ad.zulu(abVar, null, null, new L0(alpha, c2919i0, null), 3);
                } else {
                    y10 = null;
                }
            } catch (Throwable th2) {
                th = th2;
                i4 = null;
            }
            try {
                androidx.compose.runtime.Y y11 = this.silver;
                this.purple = y10;
                this.alpha = 1;
                Object blue = vf.ad.blue(y11.alpha, new androidx.compose.runtime.V(y11, new androidx.compose.runtime.X(y11, null), C0564b.sierra(getContext()), null), this);
                if (blue != obj2) {
                    blue = Unit.INSTANCE;
                }
                if (blue != obj2) {
                    blue = Unit.INSTANCE;
                }
                if (blue == obj2) {
                    return obj2;
                }
                i4 = y10;
            } catch (Throwable th3) {
                i4 = y10;
                th = th3;
                if (i4 != null) {
                }
                alVar.getLifecycle().charlie(n02);
                throw th;
            }
        }
        if (i4 != null) {
            i4.foxtrot(null);
        }
        alVar.getLifecycle().charlie(n02);
        return Unit.INSTANCE;
    }
}
