package s0;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import q0.AbstractC2367C;
import q0.C2396o;

/* renamed from: s0.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2562w extends au {
    @Override // s0.at
    public final int c(C2396o c2396o) {
        int i4;
        ay ayVar = this.f13315i.f13251i.f13306y.quebec;
        Intrinsics.checkNotNull(ayVar);
        boolean z2 = ayVar.f13324d;
        am amVar = ayVar.f13330k;
        if (!z2) {
            ap apVar = ayVar.white;
            if (apVar.delta == ag.purple) {
                amVar.foxtrot = true;
                if (amVar.bravo) {
                    apVar.foxtrot = true;
                    apVar.golf = true;
                }
            } else {
                amVar.golf = true;
            }
        }
        C2562w c2562w = ayVar.golf().f13352L;
        if (c2562w != null) {
            c2562w.f13312d = true;
        }
        ayVar.bronze();
        C2562w c2562w2 = ayVar.golf().f13352L;
        if (c2562w2 != null) {
            c2562w2.f13312d = false;
        }
        Integer num = (Integer) amVar.india.get(c2396o);
        if (num != null) {
            i4 = num.intValue();
        } else {
            i4 = RecyclerView.UNDEFINED_DURATION;
        }
        this.f13320n.hotel(i4, c2396o);
        return i4;
    }

    @Override // q0.InterfaceC2401t
    public final int delta(int i4) {
        gd.a uniform = this.f13315i.f13251i.uniform();
        q0.ap foxtrot = uniform.foxtrot();
        al alVar = (al) uniform.purple;
        return foxtrot.hotel((L) alVar.f13305x.foxtrot, alVar.lima(), i4);
    }

    @Override // q0.InterfaceC2401t
    public final int jade(int i4) {
        gd.a uniform = this.f13315i.f13251i.uniform();
        q0.ap foxtrot = uniform.foxtrot();
        al alVar = (al) uniform.purple;
        return foxtrot.bravo((L) alVar.f13305x.foxtrot, alVar.lima(), i4);
    }

    @Override // q0.InterfaceC2401t
    public final int lima(int i4) {
        gd.a uniform = this.f13315i.f13251i.uniform();
        q0.ap foxtrot = uniform.foxtrot();
        al alVar = (al) uniform.purple;
        return foxtrot.alpha((L) alVar.f13305x.foxtrot, alVar.lima(), i4);
    }

    @Override // s0.au
    public final void q() {
        ay ayVar = this.f13315i.f13251i.f13306y.quebec;
        Intrinsics.checkNotNull(ayVar);
        ayVar.f();
    }

    @Override // q0.InterfaceC2401t
    public final int romeo(int i4) {
        gd.a uniform = this.f13315i.f13251i.uniform();
        q0.ap foxtrot = uniform.foxtrot();
        al alVar = (al) uniform.purple;
        return foxtrot.golf((L) alVar.f13305x.foxtrot, alVar.lima(), i4);
    }

    @Override // q0.ao
    public final AbstractC2367C victor(long j5) {
        a(j5);
        L l10 = this.f13315i;
        J.e zulu = l10.f13251i.zulu();
        Object[] objArr = zulu.alpha;
        int i4 = zulu.red;
        for (int i5 = 0; i5 < i4; i5++) {
            ay ayVar = ((al) objArr[i5]).f13306y.quebec;
            Intrinsics.checkNotNull(ayVar);
            ayVar.f13323c = ai.red;
        }
        al alVar = l10.f13251i;
        au.p(this, alVar.f13296o.delta(this, alVar.lima(), j5));
        return this;
    }
}
