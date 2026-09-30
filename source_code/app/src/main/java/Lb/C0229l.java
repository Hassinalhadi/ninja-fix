package Lb;

import F.K1;
import a0.C0366t;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.t0;
import com.app.network.network.models.AttributeActionType;
import com.app.network.network.models.AttributeGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import m.C2093f;
import s6.I0;
import t6.P3;

/* renamed from: Lb.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0229l implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ C0233p purple;
    public final /* synthetic */ AttributeGroup red;

    public /* synthetic */ C0229l(C0233p c0233p, AttributeGroup attributeGroup, int i4) {
        this.alpha = i4;
        this.purple = c0233p;
        this.red = attributeGroup;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
        boolean z10;
        boolean z11;
        Function0 function0;
        boolean z12;
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
                    I0.alpha(P.e.echo(739651316, new C0229l(this.purple, this.red, 1), c0585q), c0585q, 48);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            case 1:
                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C0585q c0585q2 = (C0585q) interfaceC0581m2;
                if (c0585q2.magenta(intValue2 & 1, z10)) {
                    final C0233p c0233p = this.purple;
                    int ordinal = ((EnumC0231n) ((t0) c0233p.f1813y).getValue()).ordinal();
                    T.p pVar = T.p.alpha;
                    AttributeGroup attributeGroup = this.red;
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal == 2) {
                                c0585q2.purple(1772533070);
                                long j5 = C0366t.echo;
                                C2093f bravo = AbstractC2094g.bravo(20);
                                Object jade = c0585q2.jade();
                                if (jade == C0580l.alpha) {
                                    jade = new F4.h(20);
                                    c0585q2.f(jade);
                                }
                                K1.alpha((Function0) jade, AbstractC0220c.alpha, null, null, null, null, P.e.echo(-594865087, new C0229l(c0233p, attributeGroup, 3), c0585q2), bravo, j5, 0L, 0L, 0L, 0.0f, null, c0585q2, 102236214, 15932);
                                c0585q2.quebec(false);
                            } else {
                                throw ao.ad.black(c0585q2, 2135314613, false);
                            }
                        } else {
                            c0585q2.purple(2135352753);
                            float f5 = 20;
                            final int i4 = 0;
                            P3.alpha(androidx.compose.foundation.layout.V.charlie(pVar, 1.0f), AbstractC2094g.delta(f5, f5), C0366t.echo, 0L, 0.0f, P.e.echo(1491940983, new Xd.l() { // from class: Lb.m
                                @Override // Xd.l
                                public final Object invoke(Object obj3, Object obj4) {
                                    boolean z13;
                                    switch (i4) {
                                        case 0:
                                            InterfaceC0581m interfaceC0581m3 = (InterfaceC0581m) obj3;
                                            int intValue3 = ((Integer) obj4).intValue();
                                            if ((intValue3 & 3) != 2) {
                                                z13 = true;
                                            } else {
                                                z13 = false;
                                            }
                                            C0585q c0585q3 = (C0585q) interfaceC0581m3;
                                            if (c0585q3.magenta(intValue3 & 1, z13)) {
                                                C0233p c0233p2 = c0233p;
                                                String str = (String) ((t0) c0233p2.f1803G).getValue();
                                                int juliet = c0233p2.C.juliet();
                                                String str2 = (String) ((t0) c0233p2.B).getValue();
                                                String str3 = (String) ((t0) c0233p2.f1804H).getValue();
                                                String str4 = (String) ((t0) c0233p2.f1805I).getValue();
                                                String str5 = (String) ((t0) c0233p2.f1806J).getValue();
                                                boolean booleanValue = ((Boolean) ((t0) c0233p2.f1801E).getValue()).booleanValue();
                                                String str6 = (String) ((t0) c0233p2.f1802F).getValue();
                                                boolean india = c0585q3.india(c0233p2);
                                                Object jade2 = c0585q3.jade();
                                                androidx.compose.runtime.as asVar = C0580l.alpha;
                                                if (india || jade2 == asVar) {
                                                    jade2 = new C0228k(c0233p2, 0);
                                                    c0585q3.f(jade2);
                                                }
                                                Function1 function1 = (Function1) jade2;
                                                boolean india2 = c0585q3.india(c0233p2);
                                                Object jade3 = c0585q3.jade();
                                                if (india2 || jade3 == asVar) {
                                                    jade3 = new C0228k(c0233p2, 1);
                                                    c0585q3.f(jade3);
                                                }
                                                AbstractC0220c.foxtrot(str, juliet, str2, function1, (Function1) jade3, str3, str4, str5, booleanValue, str6, null, c0585q3, 0);
                                            } else {
                                                c0585q3.ochre();
                                            }
                                            return Unit.INSTANCE;
                                        default:
                                            String key = (String) obj3;
                                            String value = (String) obj4;
                                            Intrinsics.echo(key, "key");
                                            Intrinsics.echo(value, "value");
                                            C0233p c0233p3 = c0233p;
                                            c0233p3.f1814z.put(key, value);
                                            c0233p3.A.remove(key);
                                            ((t0) c0233p3.f1802F).setValue(null);
                                            return Unit.INSTANCE;
                                    }
                                }
                            }, c0585q2), c0585q2, 1573254, 56);
                            c0585q2.quebec(false);
                        }
                    } else {
                        c0585q2.purple(2135314680);
                        T.s charlie = androidx.compose.foundation.layout.V.charlie(pVar, 1.0f);
                        float f10 = 20;
                        P3.alpha(charlie, AbstractC2094g.delta(f10, f10), C0366t.echo, 0L, 0.0f, P.e.echo(-1274867776, new C0229l(attributeGroup, c0233p), c0585q2), c0585q2, 1573254, 56);
                        c0585q2.quebec(false);
                    }
                } else {
                    c0585q2.ochre();
                }
                return Unit.INSTANCE;
            case 2:
                InterfaceC0581m interfaceC0581m3 = (InterfaceC0581m) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                C0585q c0585q3 = (C0585q) interfaceC0581m3;
                if (c0585q3.magenta(intValue3 & 1, z11)) {
                    final C0233p c0233p2 = this.purple;
                    boolean india = c0585q3.india(c0233p2);
                    Object jade2 = c0585q3.jade();
                    Object obj3 = C0580l.alpha;
                    if (india || jade2 == obj3) {
                        final int i5 = 1;
                        jade2 = new Xd.l() { // from class: Lb.m
                            @Override // Xd.l
                            public final Object invoke(Object obj32, Object obj4) {
                                boolean z13;
                                switch (i5) {
                                    case 0:
                                        InterfaceC0581m interfaceC0581m32 = (InterfaceC0581m) obj32;
                                        int intValue32 = ((Integer) obj4).intValue();
                                        if ((intValue32 & 3) != 2) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        C0585q c0585q32 = (C0585q) interfaceC0581m32;
                                        if (c0585q32.magenta(intValue32 & 1, z13)) {
                                            C0233p c0233p22 = c0233p2;
                                            String str = (String) ((t0) c0233p22.f1803G).getValue();
                                            int juliet = c0233p22.C.juliet();
                                            String str2 = (String) ((t0) c0233p22.B).getValue();
                                            String str3 = (String) ((t0) c0233p22.f1804H).getValue();
                                            String str4 = (String) ((t0) c0233p22.f1805I).getValue();
                                            String str5 = (String) ((t0) c0233p22.f1806J).getValue();
                                            boolean booleanValue = ((Boolean) ((t0) c0233p22.f1801E).getValue()).booleanValue();
                                            String str6 = (String) ((t0) c0233p22.f1802F).getValue();
                                            boolean india2 = c0585q32.india(c0233p22);
                                            Object jade22 = c0585q32.jade();
                                            androidx.compose.runtime.as asVar = C0580l.alpha;
                                            if (india2 || jade22 == asVar) {
                                                jade22 = new C0228k(c0233p22, 0);
                                                c0585q32.f(jade22);
                                            }
                                            Function1 function1 = (Function1) jade22;
                                            boolean india22 = c0585q32.india(c0233p22);
                                            Object jade3 = c0585q32.jade();
                                            if (india22 || jade3 == asVar) {
                                                jade3 = new C0228k(c0233p22, 1);
                                                c0585q32.f(jade3);
                                            }
                                            AbstractC0220c.foxtrot(str, juliet, str2, function1, (Function1) jade3, str3, str4, str5, booleanValue, str6, null, c0585q32, 0);
                                        } else {
                                            c0585q32.ochre();
                                        }
                                        return Unit.INSTANCE;
                                    default:
                                        String key = (String) obj32;
                                        String value = (String) obj4;
                                        Intrinsics.echo(key, "key");
                                        Intrinsics.echo(value, "value");
                                        C0233p c0233p3 = c0233p2;
                                        c0233p3.f1814z.put(key, value);
                                        c0233p3.A.remove(key);
                                        ((t0) c0233p3.f1802F).setValue(null);
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        c0585q3.f(jade2);
                    }
                    Xd.l lVar = (Xd.l) jade2;
                    boolean india2 = c0585q3.india(c0233p2);
                    Object jade3 = c0585q3.jade();
                    if (india2 || jade3 == obj3) {
                        jade3 = new C0227j(c0233p2, 0);
                        c0585q3.f(jade3);
                    }
                    Function0 function02 = (Function0) jade3;
                    AttributeGroup attributeGroup2 = this.red;
                    if (Intrinsics.areEqual(attributeGroup2.getActionType(), AttributeActionType.RECOMMENDED)) {
                        c0585q3.purple(810538372);
                        boolean india3 = c0585q3.india(c0233p2);
                        Object jade4 = c0585q3.jade();
                        if (india3 || jade4 == obj3) {
                            jade4 = new C0227j(c0233p2, 1);
                            c0585q3.f(jade4);
                        }
                        function0 = (Function0) jade4;
                        c0585q3.quebec(false);
                    } else {
                        c0585q3.purple(810634781);
                        c0585q3.quebec(false);
                        function0 = null;
                    }
                    Function0 function03 = function0;
                    AbstractC0220c.golf(attributeGroup2, c0233p2.f1814z, c0233p2.A, lVar, function02, function03, ((Boolean) ((t0) c0233p2.f1801E).getValue()).booleanValue(), (String) ((t0) c0233p2.f1802F).getValue(), null, c0585q3, 0);
                } else {
                    c0585q3.ochre();
                }
                return Unit.INSTANCE;
            default:
                InterfaceC0581m interfaceC0581m4 = (InterfaceC0581m) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                C0585q c0585q4 = (C0585q) interfaceC0581m4;
                if (c0585q4.magenta(intValue4 & 1, z12)) {
                    C0233p c0233p3 = this.purple;
                    boolean india4 = c0585q4.india(c0233p3);
                    AttributeGroup attributeGroup3 = this.red;
                    boolean india5 = india4 | c0585q4.india(attributeGroup3);
                    Object jade5 = c0585q4.jade();
                    if (india5 || jade5 == C0580l.alpha) {
                        jade5 = new Ac.g(13, c0233p3, attributeGroup3);
                        c0585q4.f(jade5);
                    }
                    AbstractC0220c.hotel(0, null, c0585q4, (String) ((t0) c0233p3.f1807K).getValue(), (Function0) jade5);
                } else {
                    c0585q4.ochre();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C0229l(AttributeGroup attributeGroup, C0233p c0233p) {
        this.alpha = 2;
        this.red = attributeGroup;
        this.purple = c0233p;
    }
}
