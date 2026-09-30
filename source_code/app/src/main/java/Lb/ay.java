package Lb;

import F.AbstractC0127k2;
import a0.C0366t;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.t0;
import delivery.samurai.android.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import m.AbstractC2094g;
import t6.AbstractC3086y3;
import t6.AbstractC3087z;

/* loaded from: classes2.dex */
public final /* synthetic */ class ay implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ D purple;

    public /* synthetic */ ay(D d4, int i4) {
        this.alpha = i4;
        this.purple = d4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
        boolean z10;
        boolean z11;
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
                    D d4 = this.purple;
                    int ordinal = ((B) ((t0) d4.f1711w).getValue()).ordinal();
                    T.p pVar = T.p.alpha;
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal == 2) {
                                c0585q.purple(963398162);
                                float f5 = 20;
                                AbstractC0127k2.alpha(AbstractC3087z.alpha(androidx.compose.foundation.layout.V.charlie(pVar, 1.0f), AbstractC2094g.delta(f5, f5)), AbstractC2094g.delta(f5, f5), C0366t.echo, 0L, 0.0f, 0.0f, null, P.e.echo(980833327, new ay(d4, 3), c0585q), c0585q, 12583296, 120);
                                c0585q.quebec(false);
                            } else {
                                throw ao.ad.black(c0585q, 963307784, false);
                            }
                        } else {
                            c0585q.purple(963359064);
                            float f10 = 20;
                            AbstractC0127k2.alpha(AbstractC3087z.alpha(androidx.compose.foundation.layout.V.charlie(pVar, 1.0f), AbstractC2094g.delta(f10, f10)), AbstractC2094g.delta(f10, f10), C0366t.echo, 0L, 0.0f, 0.0f, null, P.e.echo(-1079089170, new ay(d4, 2), c0585q), c0585q, 12583296, 120);
                            c0585q.quebec(false);
                        }
                    } else {
                        c0585q.purple(963307641);
                        float f11 = 20;
                        AbstractC0127k2.alpha(AbstractC3087z.alpha(androidx.compose.foundation.layout.V.charlie(pVar, 1.0f), AbstractC2094g.delta(f11, f11)), AbstractC2094g.delta(f11, f11), C0366t.echo, 0L, 0.0f, 0.0f, null, P.e.echo(2142162103, new ay(d4, 1), c0585q), c0585q, 12583296, 120);
                        c0585q.quebec(false);
                    }
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
                    String bravo = AbstractC3086y3.bravo(c0585q2, R.string.update_stc_bank_number);
                    String bravo2 = AbstractC3086y3.bravo(c0585q2, R.string.stc_bank_info_message);
                    String bravo3 = AbstractC3086y3.bravo(c0585q2, R.string.stc_section_label);
                    String bravo4 = AbstractC3086y3.bravo(c0585q2, R.string.stc_mobile_hint);
                    String bravo5 = AbstractC3086y3.bravo(c0585q2, R.string.stc_btn_submit);
                    String bravo6 = AbstractC3086y3.bravo(c0585q2, R.string.stc_btn_dismiss);
                    final D d9 = this.purple;
                    String str = (String) ((t0) d9.f1712x).getValue();
                    String str2 = (String) ((t0) d9.f1713y).getValue();
                    boolean india = c0585q2.india(d9);
                    Object jade = c0585q2.jade();
                    androidx.compose.runtime.as asVar = C0580l.alpha;
                    if (india || jade == asVar) {
                        jade = new A(d9, 2);
                        c0585q2.f(jade);
                    }
                    Function1 function1 = (Function1) jade;
                    boolean india2 = c0585q2.india(d9);
                    Object jade2 = c0585q2.jade();
                    if (india2 || jade2 == asVar) {
                        jade2 = new A(d9, 3);
                        c0585q2.f(jade2);
                    }
                    Function1 function12 = (Function1) jade2;
                    boolean india3 = c0585q2.india(d9);
                    Object jade3 = c0585q2.jade();
                    if (india3 || jade3 == asVar) {
                        final int i4 = 2;
                        jade3 = new Function0() { // from class: Lb.az
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i4) {
                                    case 0:
                                        d9.juliet();
                                        return Unit.INSTANCE;
                                    case 1:
                                        D d10 = d9;
                                        Function1 function13 = d10.f1710v;
                                        if (function13 != null) {
                                            function13.invoke(((t0) d10.f1712x).getValue());
                                        }
                                        d10.juliet();
                                        return Unit.INSTANCE;
                                    default:
                                        d9.juliet();
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        c0585q2.f(jade3);
                    }
                    AbstractC0220c.amber(bravo, bravo2, bravo3, bravo4, bravo5, bravo6, str, str2, function1, function12, (Function0) jade3, ((Boolean) ((t0) d9.B).getValue()).booleanValue(), (String) ((t0) d9.C).getValue(), null, c0585q2, 0, 0, 8192);
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
                    final D d10 = this.purple;
                    String str3 = (String) ((t0) d10.f1712x).getValue();
                    Integer num = (Integer) ((t0) d10.A).getValue();
                    String str4 = (String) ((t0) d10.f1714z).getValue();
                    boolean india4 = c0585q3.india(d10);
                    Object jade4 = c0585q3.jade();
                    androidx.compose.runtime.as asVar2 = C0580l.alpha;
                    if (india4 || jade4 == asVar2) {
                        jade4 = new A(d10, 4);
                        c0585q3.f(jade4);
                    }
                    Function1 function13 = (Function1) jade4;
                    boolean india5 = c0585q3.india(d10);
                    Object jade5 = c0585q3.jade();
                    if (india5 || jade5 == asVar2) {
                        jade5 = new A(d10, 5);
                        c0585q3.f(jade5);
                    }
                    Function1 function14 = (Function1) jade5;
                    boolean india6 = c0585q3.india(d10);
                    Object jade6 = c0585q3.jade();
                    if (india6 || jade6 == asVar2) {
                        final int i5 = 0;
                        jade6 = new Function0() { // from class: Lb.az
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i5) {
                                    case 0:
                                        d10.juliet();
                                        return Unit.INSTANCE;
                                    case 1:
                                        D d102 = d10;
                                        Function1 function132 = d102.f1710v;
                                        if (function132 != null) {
                                            function132.invoke(((t0) d102.f1712x).getValue());
                                        }
                                        d102.juliet();
                                        return Unit.INSTANCE;
                                    default:
                                        d10.juliet();
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        c0585q3.f(jade6);
                    }
                    AbstractC0220c.zulu(str3, num, str4, function13, function14, (Function0) jade6, (String) ((t0) d10.f1705E).getValue(), (String) ((t0) d10.f1706F).getValue(), (String) ((t0) d10.f1707G).getValue(), ((Boolean) ((t0) d10.B).getValue()).booleanValue(), (String) ((t0) d10.C).getValue(), null, c0585q3, 0, 0, 2048);
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
                    final D d11 = this.purple;
                    boolean india7 = c0585q4.india(d11);
                    Object jade7 = c0585q4.jade();
                    if (india7 || jade7 == C0580l.alpha) {
                        final int i10 = 1;
                        jade7 = new Function0() { // from class: Lb.az
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i10) {
                                    case 0:
                                        d11.juliet();
                                        return Unit.INSTANCE;
                                    case 1:
                                        D d102 = d11;
                                        Function1 function132 = d102.f1710v;
                                        if (function132 != null) {
                                            function132.invoke(((t0) d102.f1712x).getValue());
                                        }
                                        d102.juliet();
                                        return Unit.INSTANCE;
                                    default:
                                        d11.juliet();
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        c0585q4.f(jade7);
                    }
                    AbstractC0220c.azure((Function0) jade7, (String) ((t0) d11.f1708H).getValue(), null, c0585q4, 0, 4);
                } else {
                    c0585q4.ochre();
                }
                return Unit.INSTANCE;
        }
    }
}
