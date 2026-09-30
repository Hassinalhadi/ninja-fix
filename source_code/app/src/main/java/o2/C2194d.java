package o2;

import android.os.Bundle;
import androidx.appcompat.app.h;
import androidx.lifecycle.C0652w;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import q2.C2406a;
import s6.W6;

/* renamed from: o2.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2194d {
    public final C2406a alpha;
    public h bravo;

    public C2194d(C2406a c2406a) {
        this.alpha = c2406a;
    }

    public final Bundle alpha(String key) {
        Bundle bundle;
        Intrinsics.echo(key, "key");
        C2406a c2406a = this.alpha;
        if (c2406a.golf) {
            Bundle bundle2 = c2406a.foxtrot;
            if (bundle2 == null) {
                return null;
            }
            if (bundle2.containsKey(key)) {
                bundle = W6.foxtrot(bundle2, key);
            } else {
                bundle = null;
            }
            bundle2.remove(key);
            if (bundle2.isEmpty()) {
                c2406a.foxtrot = null;
            }
            return bundle;
        }
        throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
    }

    public final InterfaceC2193c bravo() {
        InterfaceC2193c interfaceC2193c;
        C2406a c2406a = this.alpha;
        synchronized (c2406a.charlie) {
            Iterator it = c2406a.delta.entrySet().iterator();
            do {
                interfaceC2193c = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                InterfaceC2193c interfaceC2193c2 = (InterfaceC2193c) entry.getValue();
                if (Intrinsics.areEqual(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    interfaceC2193c = interfaceC2193c2;
                }
            } while (interfaceC2193c == null);
        }
        return interfaceC2193c;
    }

    public final void charlie(String str, InterfaceC2193c provider) {
        Intrinsics.echo(provider, "provider");
        C2406a c2406a = this.alpha;
        synchronized (c2406a.charlie) {
            if (!c2406a.delta.containsKey(str)) {
                c2406a.delta.put(str, provider);
            } else {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
        }
    }

    public final void delta() {
        if (this.alpha.hotel) {
            h hVar = this.bravo;
            if (hVar == null) {
                hVar = new h(this);
            }
            this.bravo = hVar;
            try {
                C0652w.class.getDeclaredConstructor(null);
                h hVar2 = this.bravo;
                if (hVar2 != null) {
                    ((LinkedHashSet) hVar2.bravo).add(C0652w.class.getName());
                    return;
                }
                return;
            } catch (NoSuchMethodException e) {
                throw new IllegalArgumentException("Class " + C0652w.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }
}
