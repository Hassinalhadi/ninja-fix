package androidx.camera.core;

import androidx.appcompat.widget.P0;
import be.InterfaceC0757c;
import java.util.concurrent.CancellationException;
import s6.T7;

/* loaded from: classes3.dex */
public final class K implements InterfaceC0757c {
    public final /* synthetic */ com.google.common.util.concurrent.e alpha;
    public final /* synthetic */ V0.h purple;
    public final /* synthetic */ String red;

    public K(com.google.common.util.concurrent.e eVar, V0.h hVar, String str) {
        this.alpha = eVar;
        this.purple = hVar;
        this.red = str;
    }

    @Override // be.InterfaceC0757c
    public final void b(final Throwable th) {
        boolean z2 = th instanceof CancellationException;
        V0.h hVar = this.purple;
        if (z2) {
            final String gold = P0.gold(new StringBuilder(), this.red, " cancelled.");
            T7.golf(null, hVar.delta(new RuntimeException(gold, th) { // from class: androidx.camera.core.SurfaceRequest$RequestCancelledException
            }));
        } else {
            hVar.bravo(null);
        }
    }

    @Override // be.InterfaceC0757c
    public final void onSuccess(Object obj) {
        be.h.echo(true, this.alpha, this.purple, tg.k.bravo());
    }
}
