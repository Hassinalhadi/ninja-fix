package androidx.lifecycle;

import Yb.C0312j0;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import o2.C2194d;
import o2.InterfaceC2193c;
import s6.S6;
import s6.Z6;

/* loaded from: classes3.dex */
public final class U implements InterfaceC2193c {
    public final C2194d alpha;
    public boolean bravo;
    public Bundle charlie;
    public final Lazy delta;

    public U(C2194d savedStateRegistry, d0 viewModelStoreOwner) {
        Intrinsics.echo(savedStateRegistry, "savedStateRegistry");
        Intrinsics.echo(viewModelStoreOwner, "viewModelStoreOwner");
        this.alpha = savedStateRegistry;
        this.delta = LazyKt.lazy(new C0312j0(9, viewModelStoreOwner));
    }

    @Override // o2.InterfaceC2193c
    public final Bundle alpha() {
        Bundle charlie = S6.charlie((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Bundle bundle = this.charlie;
        if (bundle != null) {
            charlie.putAll(bundle);
        }
        for (Map.Entry entry : ((SavedStateHandlesVM) this.delta.getValue()).alpha.entrySet()) {
            String str = (String) entry.getKey();
            Bundle alpha = ((S1.a) ((P) entry.getValue()).bravo.teal).alpha();
            if (!alpha.isEmpty()) {
                Z6.delta(charlie, str, alpha);
            }
        }
        this.bravo = false;
        return charlie;
    }

    public final void bravo() {
        if (!this.bravo) {
            Bundle alpha = this.alpha.alpha("androidx.lifecycle.internal.SavedStateHandlesProvider");
            Bundle charlie = S6.charlie((Pair[]) Arrays.copyOf(new Pair[0], 0));
            Bundle bundle = this.charlie;
            if (bundle != null) {
                charlie.putAll(bundle);
            }
            if (alpha != null) {
                charlie.putAll(alpha);
            }
            this.charlie = charlie;
            this.bravo = true;
        }
    }
}
