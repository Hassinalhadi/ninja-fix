package androidx.lifecycle;

import ge.InterfaceC1772d;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b0 {
    public static final W8.a bravo = new W8.a(15);
    public final J2.i alpha;

    public b0(c0 store, a0 factory, T1.c defaultCreationExtras) {
        Intrinsics.echo(store, "store");
        Intrinsics.echo(factory, "factory");
        Intrinsics.echo(defaultCreationExtras, "defaultCreationExtras");
        this.alpha = new J2.i(store, factory, defaultCreationExtras);
    }

    public final Y alpha(InterfaceC1772d modelClass) {
        Intrinsics.echo(modelClass, "modelClass");
        String juliet = modelClass.juliet();
        if (juliet != null) {
            return this.alpha.charlie(modelClass, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(juliet));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
