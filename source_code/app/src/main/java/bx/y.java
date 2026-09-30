package bx;

import androidx.compose.runtime.t0;
import bz.a0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import q0.AbstractC2367C;

/* loaded from: classes3.dex */
public final class y extends Lambda implements Xd.m {
    public final /* synthetic */ Function1 alpha;
    public final /* synthetic */ a0 purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(Function1 function1, a0 a0Var) {
        super(3);
        this.alpha = function1;
        this.purple = a0Var;
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j5;
        q0.ar arVar = (q0.ar) obj;
        AbstractC2367C victor = ((q0.ao) obj2).victor(((Q0.a) obj3).alpha);
        if (arVar.ivory()) {
            if (!((Boolean) this.alpha.invoke(((t0) this.purple.delta).getValue())).booleanValue()) {
                j5 = 0;
                return arVar.papa((int) (j5 >> 32), (int) (4294967295L & j5), kotlin.collections.t.alpha, new U0.k(victor, 2));
            }
        }
        j5 = (victor.alpha << 32) | (victor.purple & 4294967295L);
        return arVar.papa((int) (j5 >> 32), (int) (4294967295L & j5), kotlin.collections.t.alpha, new U0.k(victor, 2));
    }
}
