package s0;

import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class au extends at implements q0.ao {

    /* renamed from: i, reason: collision with root package name */
    public final L f13315i;

    /* renamed from: k, reason: collision with root package name */
    public LinkedHashMap f13317k;

    /* renamed from: m, reason: collision with root package name */
    public q0.aq f13319m;

    /* renamed from: n, reason: collision with root package name */
    public final bv.ag f13320n;

    /* renamed from: j, reason: collision with root package name */
    public long f13316j = 0;

    /* renamed from: l, reason: collision with root package name */
    public final q0.an f13318l = new q0.an(this);

    public au(L l10) {
        this.f13315i = l10;
        bv.ag agVar = bv.aq.alpha;
        this.f13320n = new bv.ag();
    }

    public static final void p(au auVar, q0.aq aqVar) {
        LinkedHashMap linkedHashMap;
        if (aqVar != null) {
            auVar.yellow((aqVar.alpha() & 4294967295L) | (aqVar.bravo() << 32));
        } else {
            auVar.yellow(0L);
        }
        if (!Intrinsics.areEqual(auVar.f13319m, aqVar) && aqVar != null && ((((linkedHashMap = auVar.f13317k) != null && !linkedHashMap.isEmpty()) || !aqVar.charlie().isEmpty()) && !Intrinsics.areEqual(aqVar.charlie(), auVar.f13317k))) {
            ay ayVar = auVar.f13315i.f13251i.f13306y.quebec;
            Intrinsics.checkNotNull(ayVar);
            ayVar.f13330k.foxtrot();
            LinkedHashMap linkedHashMap2 = auVar.f13317k;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                auVar.f13317k = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(aqVar.charlie());
        }
        auVar.f13319m = aqVar;
    }

    @Override // Q0.d
    public final float alpha() {
        return this.f13315i.alpha();
    }

    @Override // s0.at
    public final at f() {
        L l10 = this.f13315i.f13252j;
        if (l10 != null) {
            return l10.y();
        }
        return null;
    }

    @Override // s0.at
    public final q0.z g() {
        return this.f13318l;
    }

    @Override // q0.InterfaceC2402u
    public final Q0.n getLayoutDirection() {
        return this.f13315i.f13251i.f13299r;
    }

    @Override // s0.at
    public final boolean h() {
        if (this.f13319m != null) {
            return true;
        }
        return false;
    }

    @Override // s0.at
    public final q0.aq i() {
        q0.aq aqVar = this.f13319m;
        if (aqVar != null) {
            return aqVar;
        }
        throw Q0.c.xray("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // Q0.d
    public final float indigo() {
        return this.f13315i.indigo();
    }

    @Override // s0.at, q0.InterfaceC2402u
    public final boolean ivory() {
        return true;
    }

    @Override // s0.at
    public final at j() {
        L l10 = this.f13315i.f13253k;
        if (l10 != null) {
            return l10.y();
        }
        return null;
    }

    @Override // s0.at
    public final long k() {
        return this.f13316j;
    }

    @Override // s0.at
    public final void o() {
        silver(this.f13316j, 0.0f, null);
    }

    @Override // s0.at, s0.D
    public final al plum() {
        return this.f13315i.f13251i;
    }

    public void q() {
        i().delta();
    }

    public final void r(long j5) {
        if (!Q0.k.alpha(this.f13316j, j5)) {
            this.f13316j = j5;
            L l10 = this.f13315i;
            ay ayVar = l10.f13251i.f13306y.quebec;
            if (ayVar != null) {
                ayVar.d();
            }
            at.m(l10);
        }
        if (!this.f13312d) {
            e(i());
        }
    }

    public final long s(au auVar, boolean z2) {
        long j5 = 0;
        au auVar2 = this;
        while (!Intrinsics.areEqual(auVar2, auVar)) {
            if (!auVar2.f13310b || !z2) {
                j5 = Q0.k.charlie(j5, auVar2.f13316j);
            }
            L l10 = auVar2.f13315i.f13253k;
            Intrinsics.checkNotNull(l10);
            auVar2 = l10.y();
            Intrinsics.checkNotNull(auVar2);
        }
        return j5;
    }

    @Override // q0.AbstractC2367C
    public final void silver(long j5, float f5, Function1 function1) {
        r(j5);
        if (this.f13311c) {
            return;
        }
        q();
    }

    @Override // q0.AbstractC2367C, q0.InterfaceC2401t
    public final Object yankee() {
        return this.f13315i.yankee();
    }
}
