package t;

import androidx.compose.runtime.t0;
import g.AbstractC1719b;
import kotlin.KotlinNothingValueException;
import q0.z;
import t6.AbstractC3016k2;
import t6.I2;
import u.InterfaceC3132f;

/* renamed from: t.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2878d implements InterfaceC3132f {
    public final long alpha;
    public final /* synthetic */ C2880f purple;

    public C2878d(C2880f c2880f, long j5) {
        this.purple = c2880f;
        this.alpha = j5;
    }

    @Override // u.InterfaceC3132f
    public final q.c cyan() {
        return AbstractC3016k2.alpha(this.purple);
    }

    @Override // u.InterfaceC3132f
    public final long gray(z zVar) {
        z zVar2 = (z) ((t0) this.purple.silver).getValue();
        if (zVar2 != null) {
            return zVar.oscar(zVar2, this.alpha);
        }
        AbstractC1719b.delta("Tried to open context menu before the anchor was placed.");
        throw new KotlinNothingValueException();
    }

    @Override // u.InterfaceC3132f
    public final Z.c lima(z zVar) {
        return I2.alpha(gray(zVar), 0L);
    }
}
