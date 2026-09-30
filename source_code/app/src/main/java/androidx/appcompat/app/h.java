package androidx.appcompat.app;

import android.os.Bundle;
import java.util.Arrays;
import java.util.LinkedHashSet;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o2.C2194d;
import o2.InterfaceC2193c;
import s6.S6;
import s6.Z6;

/* loaded from: classes3.dex */
public final class h implements InterfaceC2193c {
    public final /* synthetic */ int alpha = 0;
    public final Object bravo;

    public h(C2194d registry) {
        Intrinsics.echo(registry, "registry");
        this.bravo = new LinkedHashSet();
        registry.charlie("androidx.savedstate.Restarter", this);
    }

    @Override // o2.InterfaceC2193c
    public final Bundle alpha() {
        switch (this.alpha) {
            case 0:
                Bundle bundle = new Bundle();
                ((i) this.bravo).getDelegate().getClass();
                return bundle;
            default:
                Bundle charlie = S6.charlie((Pair[]) Arrays.copyOf(new Pair[0], 0));
                Z6.golf(charlie, "classes_to_restore", CollectionsKt.z((LinkedHashSet) this.bravo));
                return charlie;
        }
    }

    public h(i iVar) {
        this.bravo = iVar;
    }
}
