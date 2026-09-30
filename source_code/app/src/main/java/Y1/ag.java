package Y1;

import androidx.lifecycle.c0;
import kotlin.jvm.internal.Intrinsics;
import t6.AbstractC2976c2;

/* loaded from: classes3.dex */
public final class ag extends r {
    public final void hotel(androidx.lifecycle.al owner) {
        androidx.lifecycle.ac lifecycle;
        Intrinsics.echo(owner, "owner");
        androidx.navigation.internal.g gVar = this.bravo;
        gVar.getClass();
        if (Intrinsics.areEqual(owner, gVar.november)) {
            return;
        }
        androidx.lifecycle.al alVar = gVar.november;
        Nb.f fVar = gVar.romeo;
        if (alVar != null && (lifecycle = alVar.getLifecycle()) != null) {
            lifecycle.charlie(fVar);
        }
        gVar.november = owner;
        owner.getLifecycle().alpha(fVar);
    }

    public final void india(c0 viewModelStore) {
        Intrinsics.echo(viewModelStore, "viewModelStore");
        androidx.navigation.internal.g gVar = this.bravo;
        gVar.getClass();
        if (Intrinsics.areEqual(gVar.oscar, AbstractC2976c2.alpha(viewModelStore))) {
            return;
        }
        if (gVar.foxtrot.isEmpty()) {
            gVar.oscar = AbstractC2976c2.alpha(viewModelStore);
            return;
        }
        throw new IllegalStateException("ViewModelStore should be set before setGraph call");
    }
}
