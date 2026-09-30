package E;

import a0.C0366t;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.ax;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import ao.ad;
import b.D;
import b.E;
import f.InterfaceC1673j;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d implements D {
    public final boolean alpha;
    public final float bravo;
    public final ax charlie;

    public d(boolean z2, float f5, ax axVar) {
        this.alpha = z2;
        this.bravo = f5;
        this.charlie = axVar;
    }

    @Override // b.D
    public final E bravo(InterfaceC1673j interfaceC1673j, C0585q c0585q) {
        long bravo;
        c0585q.purple(988743187);
        n nVar = (n) c0585q.kilo(o.alpha);
        ax axVar = this.charlie;
        if (((C0366t) axVar.getValue()).alpha != 16) {
            c0585q.purple(762952444);
            c0585q.quebec(false);
            bravo = ((C0366t) axVar.getValue()).alpha;
        } else {
            c0585q.purple(763010228);
            bravo = nVar.bravo(c0585q);
            c0585q.quebec(false);
        }
        ax black = C0564b.black(new C0366t(bravo), c0585q);
        ax black2 = C0564b.black(nVar.alpha(c0585q), c0585q);
        c0585q.purple(331259447);
        ViewGroup bravo2 = p.bravo((View) c0585q.kilo(AndroidCompositionLocals_androidKt.foxtrot));
        boolean golf = c0585q.golf(interfaceC1673j) | c0585q.golf(this) | c0585q.golf(bravo2);
        Object jade = c0585q.jade();
        Object obj = C0580l.alpha;
        if (golf || jade == obj) {
            Object aVar = new a(this.alpha, this.bravo, black, black2, bravo2);
            c0585q.f(aVar);
            jade = aVar;
        }
        a aVar2 = (a) jade;
        c0585q.quebec(false);
        boolean golf2 = c0585q.golf(interfaceC1673j) | c0585q.india(aVar2);
        Object jade2 = c0585q.jade();
        if (golf2 || jade2 == obj) {
            jade2 = new f(interfaceC1673j, aVar2, null);
            c0585q.f(jade2);
        }
        C0564b.golf(aVar2, interfaceC1673j, (Xd.l) jade2, c0585q);
        c0585q.quebec(false);
        return aVar2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.alpha != dVar.alpha || !Q0.g.alpha(this.bravo, dVar.bravo) || !Intrinsics.areEqual(this.charlie, dVar.charlie)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i4;
        if (this.alpha) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        return this.charlie.hashCode() + ad.sierra(this.bravo, i4 * 31, 31);
    }
}
