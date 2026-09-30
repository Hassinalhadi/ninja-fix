package androidx.navigation.internal;

import Y1.aa;
import Y1.ac;
import androidx.lifecycle.T;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function1 {
    public final /* synthetic */ int alpha;

    public /* synthetic */ c(int i4) {
        this.alpha = i4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                T1.c initializer = (T1.c) obj;
                Intrinsics.echo(initializer, "$this$initializer");
                return new NavBackStackEntryImpl$SavedStateViewModel(T.bravo(initializer));
            case 1:
                aa destination = (aa) obj;
                Intrinsics.echo(destination, "destination");
                ac acVar = destination.red;
                if (acVar == null || acVar.yellow.alpha != destination.purple.charlie) {
                    return null;
                }
                return acVar;
            case 2:
                aa destination2 = (aa) obj;
                Intrinsics.echo(destination2, "destination");
                ac acVar2 = destination2.red;
                if (acVar2 == null || acVar2.yellow.alpha != destination2.purple.charlie) {
                    return null;
                }
                return acVar2;
            default:
                aa it = (aa) obj;
                Intrinsics.echo(it, "it");
                return Integer.valueOf(it.purple.charlie);
        }
    }
}
