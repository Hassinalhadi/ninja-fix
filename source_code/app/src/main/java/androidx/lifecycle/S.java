package androidx.lifecycle;

import androidx.appcompat.widget.P0;
import ge.InterfaceC1772d;
import kotlin.jvm.internal.Intrinsics;
import t6.AbstractC3013k;
import t6.AbstractC3062u;

/* loaded from: classes3.dex */
public class S implements a0 {
    public static S bravo;
    public final /* synthetic */ int alpha;

    public /* synthetic */ S(int i4) {
        this.alpha = i4;
    }

    @Override // androidx.lifecycle.a0
    public Y create(Class modelClass) {
        switch (this.alpha) {
            case 0:
                P0.delta(modelClass);
                throw null;
            default:
                Intrinsics.echo(modelClass, "modelClass");
                return AbstractC3013k.echo(modelClass);
        }
    }

    @Override // androidx.lifecycle.a0
    public Y create(Class modelClass, T1.c extras) {
        switch (this.alpha) {
            case 0:
                return P0.charlie(this, modelClass, extras);
            default:
                Intrinsics.echo(modelClass, "modelClass");
                Intrinsics.echo(extras, "extras");
                return create(modelClass);
        }
    }

    @Override // androidx.lifecycle.a0
    public final Y create(InterfaceC1772d modelClass, T1.c cVar) {
        switch (this.alpha) {
            case 0:
                Intrinsics.echo(modelClass, "modelClass");
                return new SavedStateHandlesVM();
            default:
                Intrinsics.echo(modelClass, "modelClass");
                return create(AbstractC3062u.bravo(modelClass), cVar);
        }
    }
}
