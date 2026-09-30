package bx;

import androidx.compose.runtime.C0564b;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class o implements q0.az {
    public final androidx.compose.runtime.ax alpha;

    public o(boolean z2) {
        this.alpha = C0564b.zulu(Boolean.valueOf(z2));
    }

    @Override // T.s
    public final /* synthetic */ boolean all(Function1 function1) {
        return Q0.c.alpha(this, function1);
    }

    @Override // T.s
    public final Object foldIn(Object obj, Xd.l lVar) {
        return lVar.invoke(obj, this);
    }

    @Override // q0.az
    public final Object foxtrot() {
        return this;
    }

    @Override // T.s
    public final /* synthetic */ T.s then(T.s sVar) {
        return Q0.c.charlie(this, sVar);
    }
}
