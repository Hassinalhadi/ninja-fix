package V1;

import androidx.appcompat.widget.P0;
import androidx.lifecycle.Y;
import androidx.lifecycle.a0;
import ge.InterfaceC1772d;
import kotlin.jvm.internal.Intrinsics;
import t6.AbstractC3013k;
import t6.AbstractC3062u;

/* loaded from: classes3.dex */
public final class b implements a0 {
    public static final b alpha = new Object();

    @Override // androidx.lifecycle.a0
    public final /* synthetic */ Y create(Class cls) {
        P0.delta(cls);
        throw null;
    }

    @Override // androidx.lifecycle.a0
    public final /* synthetic */ Y create(Class cls, T1.c cVar) {
        return P0.charlie(this, cls, cVar);
    }

    @Override // androidx.lifecycle.a0
    public final Y create(InterfaceC1772d modelClass, T1.c cVar) {
        Intrinsics.echo(modelClass, "modelClass");
        return AbstractC3013k.echo(AbstractC3062u.bravo(modelClass));
    }
}
