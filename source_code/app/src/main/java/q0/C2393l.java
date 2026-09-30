package q0;

/* renamed from: q0.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2393l implements ao {
    public final /* synthetic */ int alpha;
    public final InterfaceC2401t purple;
    public final Enum red;
    public final Enum silver;

    public /* synthetic */ C2393l(InterfaceC2401t interfaceC2401t, Enum r22, Enum r32, int i4) {
        this.alpha = i4;
        this.purple = interfaceC2401t;
        this.red = r22;
        this.silver = r32;
    }

    @Override // q0.InterfaceC2401t
    public final int delta(int i4) {
        switch (this.alpha) {
            case 0:
                return this.purple.delta(i4);
            case 1:
                return this.purple.delta(i4);
            default:
                return this.purple.delta(i4);
        }
    }

    @Override // q0.InterfaceC2401t
    public final int jade(int i4) {
        switch (this.alpha) {
            case 0:
                return this.purple.jade(i4);
            case 1:
                return this.purple.jade(i4);
            default:
                return this.purple.jade(i4);
        }
    }

    @Override // q0.InterfaceC2401t
    public final int lima(int i4) {
        switch (this.alpha) {
            case 0:
                return this.purple.lima(i4);
            case 1:
                return this.purple.lima(i4);
            default:
                return this.purple.lima(i4);
        }
    }

    @Override // q0.InterfaceC2401t
    public final int romeo(int i4) {
        switch (this.alpha) {
            case 0:
                return this.purple.romeo(i4);
            case 1:
                return this.purple.romeo(i4);
            default:
                return this.purple.romeo(i4);
        }
    }

    @Override // q0.ao
    public final AbstractC2367C victor(long j5) {
        int jade;
        int lima;
        int jade2;
        int lima2;
        int jade3;
        int lima3;
        switch (this.alpha) {
            case 0:
                EnumC2404w enumC2404w = EnumC2404w.alpha;
                EnumC2403v enumC2403v = (EnumC2403v) this.red;
                EnumC2404w enumC2404w2 = (EnumC2404w) this.silver;
                int i4 = 32767;
                InterfaceC2401t interfaceC2401t = this.purple;
                if (enumC2404w2 == enumC2404w) {
                    if (enumC2403v == EnumC2403v.purple) {
                        lima = interfaceC2401t.romeo(Q0.a.golf(j5));
                    } else {
                        lima = interfaceC2401t.lima(Q0.a.golf(j5));
                    }
                    if (Q0.a.charlie(j5)) {
                        i4 = Q0.a.golf(j5);
                    }
                    return new C2395n(lima, i4, 0);
                }
                if (enumC2403v == EnumC2403v.purple) {
                    jade = interfaceC2401t.delta(Q0.a.hotel(j5));
                } else {
                    jade = interfaceC2401t.jade(Q0.a.hotel(j5));
                }
                if (Q0.a.delta(j5)) {
                    i4 = Q0.a.hotel(j5);
                }
                return new C2395n(i4, jade, 0);
            case 1:
                at atVar = at.alpha;
                as asVar = (as) this.red;
                at atVar2 = (at) this.silver;
                int i5 = 32767;
                InterfaceC2401t interfaceC2401t2 = this.purple;
                if (atVar2 == atVar) {
                    if (asVar == as.purple) {
                        lima2 = interfaceC2401t2.romeo(Q0.a.golf(j5));
                    } else {
                        lima2 = interfaceC2401t2.lima(Q0.a.golf(j5));
                    }
                    if (Q0.a.charlie(j5)) {
                        i5 = Q0.a.golf(j5);
                    }
                    return new C2395n(lima2, i5, 1);
                }
                if (asVar == as.purple) {
                    jade2 = interfaceC2401t2.delta(Q0.a.hotel(j5));
                } else {
                    jade2 = interfaceC2401t2.jade(Q0.a.hotel(j5));
                }
                if (Q0.a.delta(j5)) {
                    i5 = Q0.a.hotel(j5);
                }
                return new C2395n(i5, jade2, 1);
            default:
                s0.O o5 = s0.O.alpha;
                s0.N n5 = (s0.N) this.red;
                s0.O o10 = (s0.O) this.silver;
                int i10 = 32767;
                InterfaceC2401t interfaceC2401t3 = this.purple;
                if (o10 == o5) {
                    if (n5 == s0.N.purple) {
                        lima3 = interfaceC2401t3.romeo(Q0.a.golf(j5));
                    } else {
                        lima3 = interfaceC2401t3.lima(Q0.a.golf(j5));
                    }
                    if (Q0.a.charlie(j5)) {
                        i10 = Q0.a.golf(j5);
                    }
                    return new C2395n(lima3, i10, 2);
                }
                if (n5 == s0.N.purple) {
                    jade3 = interfaceC2401t3.delta(Q0.a.hotel(j5));
                } else {
                    jade3 = interfaceC2401t3.jade(Q0.a.hotel(j5));
                }
                if (Q0.a.delta(j5)) {
                    i10 = Q0.a.hotel(j5);
                }
                return new C2395n(i10, jade3, 2);
        }
    }

    @Override // q0.InterfaceC2401t
    public final Object yankee() {
        switch (this.alpha) {
            case 0:
                return this.purple.yankee();
            case 1:
                return this.purple.yankee();
            default:
                return this.purple.yankee();
        }
    }
}
