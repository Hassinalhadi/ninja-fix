package q2;

import Nb.f;
import android.os.Bundle;
import androidx.lifecycle.ab;
import com.google.android.gms.measurement.internal.C1475w;
import java.util.LinkedHashMap;
import kotlin.collections.n;
import kotlin.jvm.internal.Intrinsics;
import o2.InterfaceC2196f;

/* renamed from: q2.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2406a {
    public final InterfaceC2196f alpha;
    public final n bravo;
    public final C1475w charlie;
    public final LinkedHashMap delta;
    public boolean echo;
    public Bundle foxtrot;
    public boolean golf;
    public boolean hotel;

    public C2406a(InterfaceC2196f owner, n nVar) {
        Intrinsics.echo(owner, "owner");
        this.alpha = owner;
        this.bravo = nVar;
        this.charlie = new C1475w(14);
        this.delta = new LinkedHashMap();
        this.hotel = true;
    }

    public final void alpha() {
        InterfaceC2196f interfaceC2196f = this.alpha;
        if (interfaceC2196f.getLifecycle().bravo() == ab.purple) {
            if (!this.echo) {
                this.bravo.invoke();
                interfaceC2196f.getLifecycle().alpha(new f(3, this));
                this.echo = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }
}
