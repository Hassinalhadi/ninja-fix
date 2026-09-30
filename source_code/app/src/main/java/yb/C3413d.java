package yb;

import D0.an;
import Db.f;
import F.AbstractC0127k2;
import F.G2;
import F.S2;
import F.T2;
import F.Y1;
import F.Z1;
import H0.v;
import T.i;
import T.p;
import T.s;
import Xd.l;
import a0.C0366t;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import ao.ad;
import delivery.samurai.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2088a;
import qb.EnumC2443j;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;

/* renamed from: yb.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3413d implements l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ EnumC2443j purple;

    public /* synthetic */ C3413d(EnumC2443j enumC2443j, int i4) {
        this.alpha = i4;
        this.purple = enumC2443j;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
        String str;
        long j5;
        boolean z10;
        long bravo;
        EnumC2443j enumC2443j = this.purple;
        p pVar = p.alpha;
        int i4 = 0;
        switch (this.alpha) {
            case 0:
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(intValue & 1, z2)) {
                    int ordinal = enumC2443j.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal == 2) {
                                str = Q0.c.oscar(c0585q, -50888094, R.string.warning, c0585q, false);
                            } else {
                                throw ad.black(c0585q, -50894113, false);
                            }
                        } else {
                            c0585q.purple(-1488285978);
                            c0585q.quebec(false);
                            str = "Inactive";
                        }
                    } else {
                        c0585q.purple(378225955);
                        c0585q.quebec(false);
                        str = "Active";
                    }
                    String str2 = str;
                    an anVar = ((S2) c0585q.kilo(T2.alpha)).oscar;
                    int ordinal2 = enumC2443j.ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 != 1) {
                            if (ordinal2 == 2) {
                                j5 = Db.c.echo;
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            j5 = Db.c.delta;
                        }
                    } else {
                        j5 = Db.c.charlie;
                    }
                    G2.bravo(str2, AbstractC0538d.tango(pVar, f.charlie, f.alpha), j5, 0L, v.f1408b, null, 0L, null, 0L, 0, false, 0, 0, null, anVar, c0585q, 196608, 0, 65496);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            default:
                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C0585q c0585q2 = (C0585q) interfaceC0581m2;
                if (c0585q2.magenta(intValue2 & 1, z10)) {
                    i iVar = T.d.f2064h;
                    C0537c c0537c = AbstractC0542h.alpha;
                    C0554u alpha = AbstractC0553t.alpha(AbstractC0542h.golf(f.bravo), iVar, c0585q2, 48);
                    long j6 = c0585q2.magenta;
                    int i5 = (int) (j6 ^ (j6 >>> 32));
                    I mike = c0585q2.mike();
                    s charlie = T.a.charlie(pVar, c0585q2);
                    InterfaceC2552l.maroon.getClass();
                    C2550j c2550j = C2551k.bravo;
                    c0585q2.white();
                    if (c0585q2.lime) {
                        c0585q2.lima(c2550j);
                    } else {
                        c0585q2.i();
                    }
                    C0564b.blue(C2551k.foxtrot, c0585q2, alpha);
                    C0564b.blue(C2551k.echo, c0585q2, mike);
                    C2549i c2549i = C2551k.golf;
                    if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i5))) {
                        ad.blue(i5, c0585q2, i5, c2549i);
                    }
                    C0564b.blue(C2551k.delta, c0585q2, charlie);
                    AbstractC2088a abstractC2088a = ((Y1) c0585q2.kilo(Z1.alpha)).bravo;
                    int ordinal3 = enumC2443j.ordinal();
                    if (ordinal3 != 0) {
                        if (ordinal3 != 1) {
                            if (ordinal3 == 2) {
                                bravo = C0366t.bravo(0.2f, Db.c.echo);
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            bravo = C0366t.bravo(0.2f, Db.c.delta);
                        }
                    } else {
                        bravo = C0366t.bravo(0.2f, Db.c.charlie);
                    }
                    AbstractC0127k2.alpha(null, abstractC2088a, bravo, 0L, 0.0f, 0.0f, null, P.e.echo(1658045755, new C3413d(enumC2443j, i4), c0585q2), c0585q2, 12582912, 121);
                    c0585q2.quebec(true);
                } else {
                    c0585q2.ochre();
                }
                return Unit.INSTANCE;
        }
    }
}
