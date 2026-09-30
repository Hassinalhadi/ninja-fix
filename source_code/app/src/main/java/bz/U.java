package bz;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.t0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class U {
    public final g0 alpha;
    public final androidx.compose.runtime.ax bravo = C0564b.zulu(null);
    public final /* synthetic */ a0 charlie;

    public U(a0 a0Var, g0 g0Var, String str) {
        this.charlie = a0Var;
        this.alpha = g0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final T alpha(Function1 function1, Function1 function12) {
        androidx.compose.runtime.ax axVar = this.bravo;
        T t5 = (T) ((t0) axVar).getValue();
        a0 a0Var = this.charlie;
        if (t5 == null) {
            Object invoke = function12.invoke(a0Var.alpha.L());
            Object invoke2 = function12.invoke(a0Var.alpha.L());
            g0 g0Var = this.alpha;
            r rVar = (r) g0Var.alpha.invoke(invoke2);
            rVar.delta();
            X x4 = new X(a0Var, invoke, rVar, g0Var);
            t5 = new T(this, x4, function1, function12);
            ((t0) axVar).setValue(t5);
            a0Var.india.add(x4);
        }
        t5.red = (Lambda) function12;
        t5.purple = (Lambda) function1;
        t5.alpha(a0Var.foxtrot());
        return t5;
    }
}
