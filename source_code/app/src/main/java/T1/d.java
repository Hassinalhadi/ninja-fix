package T1;

import androidx.appcompat.widget.P0;
import androidx.lifecycle.Y;
import androidx.lifecycle.a0;
import ge.InterfaceC1772d;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import t6.AbstractC3062u;

/* loaded from: classes3.dex */
public final class d implements a0 {
    public final f[] alpha;

    public d(f... initializers) {
        Intrinsics.echo(initializers, "initializers");
        this.alpha = initializers;
    }

    @Override // androidx.lifecycle.a0
    public final /* synthetic */ Y create(InterfaceC1772d interfaceC1772d, c cVar) {
        return P0.bravo(this, interfaceC1772d, cVar);
    }

    @Override // androidx.lifecycle.a0
    public final /* synthetic */ Y create(Class cls) {
        P0.delta(cls);
        throw null;
    }

    @Override // androidx.lifecycle.a0
    public final Y create(Class modelClass, c extras) {
        Y y10;
        f fVar;
        Function1 function1;
        Intrinsics.echo(modelClass, "modelClass");
        Intrinsics.echo(extras, "extras");
        InterfaceC1772d echo = AbstractC3062u.echo(modelClass);
        f[] fVarArr = this.alpha;
        f[] initializers = (f[]) Arrays.copyOf(fVarArr, fVarArr.length);
        Intrinsics.echo(initializers, "initializers");
        int length = initializers.length;
        int i4 = 0;
        while (true) {
            y10 = null;
            if (i4 >= length) {
                fVar = null;
                break;
            }
            fVar = initializers[i4];
            if (Intrinsics.areEqual(fVar.alpha, echo)) {
                break;
            }
            i4++;
        }
        if (fVar != null && (function1 = fVar.bravo) != null) {
            y10 = (Y) function1.invoke(extras);
        }
        if (y10 != null) {
            return y10;
        }
        throw new IllegalArgumentException(("No initializer set for given class " + echo.juliet()).toString());
    }
}
