package androidx.compose.foundation.lazy.layout;

import d.K;
import kotlin.jvm.internal.Intrinsics;
import s0.e0;

/* loaded from: classes3.dex */
public final class aq extends T.r implements e0 {
    public ge.s alpha;
    public am purple;
    public K red;
    public boolean silver;
    public A0.i teal;
    public final an white = new an(this, 0);
    public an yellow;

    public aq(ge.s sVar, am amVar, K k6, boolean z2) {
        this.alpha = sVar;
        this.purple = amVar;
        this.red = k6;
        this.silver = z2;
        b();
    }

    public final void b() {
        an anVar;
        this.teal = new A0.i(new ao(this, 0), new ao(this, 1));
        if (this.silver) {
            anVar = new an(this, 1);
        } else {
            anVar = null;
        }
        this.yellow = anVar;
    }

    @Override // s0.e0
    public final /* synthetic */ boolean charlie() {
        return true;
    }

    @Override // T.r
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // s0.e0
    public final void india(A0.ad adVar) {
        A0.aa.foxtrot(adVar);
        A0.k kVar = (A0.k) adVar;
        kVar.hotel(A0.x.gold, this.white);
        if (this.red == K.alpha) {
            A0.i iVar = this.teal;
            if (iVar != null) {
                A0.ac acVar = A0.x.uniform;
                ge.v vVar = A0.aa.alpha[12];
                acVar.alpha(adVar, iVar);
            } else {
                Intrinsics.lima("scrollAxisRange");
                throw null;
            }
        } else {
            A0.i iVar2 = this.teal;
            if (iVar2 != null) {
                A0.ac acVar2 = A0.x.tango;
                ge.v vVar2 = A0.aa.alpha[11];
                acVar2.alpha(adVar, iVar2);
            } else {
                Intrinsics.lima("scrollAxisRange");
                throw null;
            }
        }
        an anVar = this.yellow;
        if (anVar != null) {
            kVar.hotel(A0.j.foxtrot, new A0.a(null, anVar));
        }
        kVar.hotel(A0.j.azure, new A0.a(null, new A0.p(1, new ao(this, 2))));
        A0.b foxtrot = this.purple.foxtrot();
        A0.ac acVar3 = A0.x.foxtrot;
        ge.v vVar3 = A0.aa.alpha[22];
        acVar3.alpha(adVar, foxtrot);
    }

    @Override // s0.e0
    public final /* synthetic */ boolean yankee() {
        return false;
    }

    @Override // s0.e0
    public final /* synthetic */ boolean yellow() {
        return false;
    }
}
