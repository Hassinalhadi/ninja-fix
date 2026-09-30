package bj;

import a4.u;
import android.util.Size;
import androidx.appcompat.widget.P0;
import androidx.camera.core.impl.ah;
import androidx.camera.core.impl.ai;
import s6.T7;
import t6.AbstractC3003i;
import t6.j4;

/* loaded from: classes3.dex */
public final class j extends ah {
    public final V0.k oscar;
    public V0.h papa;
    public ah quebec;
    public l romeo;

    public j(Size size, int i4) {
        super(size, i4);
        this.oscar = AbstractC3003i.alpha(new u(9, this));
    }

    @Override // androidx.camera.core.impl.ah
    public final void alpha() {
        super.alpha();
        j4.delta(new g(this, 2));
    }

    @Override // androidx.camera.core.impl.ah
    public final com.google.common.util.concurrent.e foxtrot() {
        return this.oscar;
    }

    public final boolean golf(ah ahVar, Runnable runnable) {
        boolean z2;
        boolean z10;
        j4.alpha();
        ahVar.getClass();
        ah ahVar2 = this.quebec;
        boolean z11 = false;
        if (ahVar2 == ahVar) {
            return false;
        }
        if (ahVar2 == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        T7.golf("A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider", z2);
        Size size = this.hotel;
        Size size2 = ahVar.hotel;
        T7.bravo("The provider's size(" + size + ") must match the parent(" + size2 + ")", size.equals(size2));
        int i4 = ahVar.india;
        int i5 = this.india;
        if (i5 == i4) {
            z11 = true;
        }
        T7.bravo(P0.azure(i5, i4, "The provider's format(", ") must match the parent(", ")"), z11);
        synchronized (this.alpha) {
            z10 = this.charlie;
        }
        T7.golf("The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.", !z10);
        this.quebec = ahVar;
        be.h.echo(true, ahVar.charlie(), this.papa, tg.k.bravo());
        ahVar.delta();
        be.h.delta(this.echo).foxtrot(new ai(15, ahVar), tg.k.bravo());
        be.h.delta(ahVar.golf).foxtrot(runnable, tg.k.echo());
        return true;
    }
}
