package s6;

import androidx.compose.runtime.InterfaceC0581m;
import ge.InterfaceC1772d;
import kotlin.jvm.internal.Intrinsics;
import qe.C2473i;
import qe.InterfaceC2472h;

/* loaded from: classes2.dex */
public abstract class F7 {
    public static final InterfaceC2472h alpha(InterfaceC2472h first, InterfaceC2472h second) {
        Intrinsics.echo(first, "first");
        Intrinsics.echo(second, "second");
        if (first.isEmpty()) {
            return second;
        }
        if (second.isEmpty()) {
            return first;
        }
        return new C2473i(new InterfaceC2472h[]{first, second});
    }

    public static final androidx.lifecycle.Y bravo(InterfaceC1772d modelClass, androidx.lifecycle.d0 d0Var, String str, androidx.lifecycle.a0 a0Var, T1.c extras, InterfaceC0581m interfaceC0581m) {
        androidx.lifecycle.c0 store = d0Var.getViewModelStore();
        Intrinsics.echo(store, "store");
        Intrinsics.echo(extras, "extras");
        J2.i iVar = new J2.i(store, a0Var, extras);
        if (str != null) {
            Intrinsics.echo(modelClass, "modelClass");
            return iVar.charlie(modelClass, str);
        }
        Intrinsics.echo(modelClass, "modelClass");
        String juliet = modelClass.juliet();
        if (juliet != null) {
            return iVar.charlie(modelClass, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(juliet));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
