package o2;

import android.os.Bundle;
import androidx.lifecycle.ab;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import q2.C2406a;
import s6.S6;
import s6.W6;
import s6.Z6;

/* renamed from: o2.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2195e {
    public final C2406a alpha;
    public final C2194d bravo;

    public C2195e(C2406a c2406a) {
        this.alpha = c2406a;
        this.bravo = new C2194d(c2406a);
    }

    public final void alpha() {
        this.alpha.alpha();
    }

    public final void bravo(Bundle bundle) {
        C2406a c2406a = this.alpha;
        if (!c2406a.echo) {
            c2406a.alpha();
        }
        InterfaceC2196f interfaceC2196f = c2406a.alpha;
        if (interfaceC2196f.getLifecycle().bravo().compareTo(ab.silver) < 0) {
            if (!c2406a.golf) {
                Bundle bundle2 = null;
                if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
                    bundle2 = W6.foxtrot(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key");
                }
                c2406a.foxtrot = bundle2;
                c2406a.golf = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + interfaceC2196f.getLifecycle().bravo()).toString());
    }

    public final void charlie(Bundle bundle) {
        C2406a c2406a = this.alpha;
        Bundle charlie = S6.charlie((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Bundle bundle2 = c2406a.foxtrot;
        if (bundle2 != null) {
            charlie.putAll(bundle2);
        }
        synchronized (c2406a.charlie) {
            for (Map.Entry entry : c2406a.delta.entrySet()) {
                Z6.delta(charlie, (String) entry.getKey(), ((InterfaceC2193c) entry.getValue()).alpha());
            }
        }
        if (!charlie.isEmpty()) {
            Z6.delta(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key", charlie);
        }
    }
}
