package Dc;

import Ec.av;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.ax;
import androidx.compose.runtime.t0;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.T;
import com.app.network.network.models.Shift;
import delivery.samurai.android.ui.shiftsV2.ShiftSummariesViewModelV2;
import delivery.samurai.android.ui.shiftsV2.ShiftsFragmentV2;
import delivery.samurai.android.ui.shiftsV2.ShiftsViewModelV2;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2717m7;
import vf.ad;
import yf.N;

/* loaded from: classes2.dex */
public final /* synthetic */ class p implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ ShiftsFragmentV2 purple;
    public final /* synthetic */ ComposeView red;

    public /* synthetic */ p(ShiftsFragmentV2 shiftsFragmentV2, ComposeView composeView, int i4) {
        this.alpha = i4;
        this.purple = shiftsFragmentV2;
        this.red = composeView;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x026b  */
    @Override // Xd.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
        boolean z10;
        boolean z11;
        String str;
        long j5;
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
                    final ShiftsFragmentV2 shiftsFragmentV2 = this.purple;
                    ax bravo = AbstractC2717m7.bravo(shiftsFragmentV2.romeo().charlie, c0585q, 0);
                    ax bravo2 = AbstractC2717m7.bravo(shiftsFragmentV2.romeo().echo, c0585q, 0);
                    ax bravo3 = AbstractC2717m7.bravo(shiftsFragmentV2.quebec().charlie, c0585q, 0);
                    ax bravo4 = AbstractC2717m7.bravo(shiftsFragmentV2.quebec().echo, c0585q, 0);
                    Unit unit = Unit.INSTANCE;
                    boolean india = c0585q.india(shiftsFragmentV2);
                    ComposeView composeView = this.red;
                    boolean india2 = india | c0585q.india(composeView);
                    Object jade = c0585q.jade();
                    Object obj3 = C0580l.alpha;
                    if (india2 || jade == obj3) {
                        jade = new r(shiftsFragmentV2, composeView, null);
                        c0585q.f(jade);
                    }
                    C0564b.foxtrot((Xd.l) jade, c0585q, unit);
                    boolean india3 = c0585q.india(shiftsFragmentV2) | c0585q.india(composeView);
                    Object jade2 = c0585q.jade();
                    if (india3 || jade2 == obj3) {
                        jade2 = new s(shiftsFragmentV2, composeView, null);
                        c0585q.f(jade2);
                    }
                    C0564b.foxtrot((Xd.l) jade2, c0585q, unit);
                    e eVar = (e) bravo.getValue();
                    boolean booleanValue = ((Boolean) bravo2.getValue()).booleanValue();
                    boolean india4 = c0585q.india(shiftsFragmentV2) | c0585q.india(composeView);
                    Object jade3 = c0585q.jade();
                    if (india4 || jade3 == obj3) {
                        jade3 = new p(shiftsFragmentV2, composeView, 1);
                        c0585q.f(jade3);
                    }
                    Xd.l lVar = (Xd.l) jade3;
                    boolean india5 = c0585q.india(shiftsFragmentV2);
                    Object jade4 = c0585q.jade();
                    if (india5 || jade4 == obj3) {
                        jade4 = new n(shiftsFragmentV2, 4);
                        c0585q.f(jade4);
                    }
                    Function1 function1 = (Function1) jade4;
                    boolean india6 = c0585q.india(shiftsFragmentV2) | c0585q.india(composeView);
                    Object jade5 = c0585q.jade();
                    if (india6 || jade5 == obj3) {
                        jade5 = new Ac.g(4, shiftsFragmentV2, composeView);
                        c0585q.f(jade5);
                    }
                    Function0 function0 = (Function0) jade5;
                    boolean india7 = c0585q.india(shiftsFragmentV2);
                    Object jade6 = c0585q.jade();
                    if (india7 || jade6 == obj3) {
                        final int i4 = 5;
                        jade6 = new Function0() { // from class: Dc.o
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i4) {
                                    case 0:
                                        shiftsFragmentV2.quebec().alpha(true);
                                        return Unit.INSTANCE;
                                    case 1:
                                        ShiftSummariesViewModelV2 quebec = shiftsFragmentV2.quebec();
                                        if (!quebec.india && !quebec.juliet) {
                                            quebec.hotel++;
                                            quebec.juliet = true;
                                            N n5 = quebec.bravo;
                                            k kVar = (k) n5.getValue();
                                            if (kVar instanceof j) {
                                                j jVar = (j) kVar;
                                                List items = jVar.alpha;
                                                Intrinsics.echo(items, "items");
                                                n5.juliet(null, new j(items, jVar.bravo, true));
                                            }
                                            quebec.alpha(false);
                                        }
                                        return Unit.INSTANCE;
                                    case 2:
                                        ((t0) shiftsFragmentV2.f12484j).setValue(Boolean.FALSE);
                                        return Unit.INSTANCE;
                                    case 3:
                                        ShiftsFragmentV2 shiftsFragmentV22 = shiftsFragmentV2;
                                        ((t0) shiftsFragmentV22.f12485k).setValue(Boolean.FALSE);
                                        shiftsFragmentV22.romeo().alpha(true);
                                        return Unit.INSTANCE;
                                    case 4:
                                        ((t0) shiftsFragmentV2.f12486l).setValue(null);
                                        return Unit.INSTANCE;
                                    case 5:
                                        shiftsFragmentV2.romeo().alpha(true);
                                        return Unit.INSTANCE;
                                    default:
                                        ShiftsViewModelV2 romeo = shiftsFragmentV2.romeo();
                                        if (!romeo.kilo && !romeo.lima) {
                                            romeo.juliet++;
                                            romeo.lima = true;
                                            romeo.alpha(false);
                                        }
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        c0585q.f(jade6);
                    }
                    Function0 function02 = (Function0) jade6;
                    boolean india8 = c0585q.india(shiftsFragmentV2);
                    Object jade7 = c0585q.jade();
                    if (india8 || jade7 == obj3) {
                        final int i5 = 6;
                        jade7 = new Function0() { // from class: Dc.o
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i5) {
                                    case 0:
                                        shiftsFragmentV2.quebec().alpha(true);
                                        return Unit.INSTANCE;
                                    case 1:
                                        ShiftSummariesViewModelV2 quebec = shiftsFragmentV2.quebec();
                                        if (!quebec.india && !quebec.juliet) {
                                            quebec.hotel++;
                                            quebec.juliet = true;
                                            N n5 = quebec.bravo;
                                            k kVar = (k) n5.getValue();
                                            if (kVar instanceof j) {
                                                j jVar = (j) kVar;
                                                List items = jVar.alpha;
                                                Intrinsics.echo(items, "items");
                                                n5.juliet(null, new j(items, jVar.bravo, true));
                                            }
                                            quebec.alpha(false);
                                        }
                                        return Unit.INSTANCE;
                                    case 2:
                                        ((t0) shiftsFragmentV2.f12484j).setValue(Boolean.FALSE);
                                        return Unit.INSTANCE;
                                    case 3:
                                        ShiftsFragmentV2 shiftsFragmentV22 = shiftsFragmentV2;
                                        ((t0) shiftsFragmentV22.f12485k).setValue(Boolean.FALSE);
                                        shiftsFragmentV22.romeo().alpha(true);
                                        return Unit.INSTANCE;
                                    case 4:
                                        ((t0) shiftsFragmentV2.f12486l).setValue(null);
                                        return Unit.INSTANCE;
                                    case 5:
                                        shiftsFragmentV2.romeo().alpha(true);
                                        return Unit.INSTANCE;
                                    default:
                                        ShiftsViewModelV2 romeo = shiftsFragmentV2.romeo();
                                        if (!romeo.kilo && !romeo.lima) {
                                            romeo.juliet++;
                                            romeo.lima = true;
                                            romeo.alpha(false);
                                        }
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        c0585q.f(jade7);
                    }
                    Function0 function03 = (Function0) jade7;
                    boolean india9 = c0585q.india(shiftsFragmentV2);
                    Object jade8 = c0585q.jade();
                    if (india9 || jade8 == obj3) {
                        jade8 = new n(shiftsFragmentV2, 1);
                        c0585q.f(jade8);
                    }
                    Function1 function12 = (Function1) jade8;
                    k kVar = (k) bravo3.getValue();
                    boolean booleanValue2 = ((Boolean) bravo4.getValue()).booleanValue();
                    boolean india10 = c0585q.india(shiftsFragmentV2);
                    Object jade9 = c0585q.jade();
                    if (india10 || jade9 == obj3) {
                        final int i10 = 0;
                        jade9 = new Function0() { // from class: Dc.o
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i10) {
                                    case 0:
                                        shiftsFragmentV2.quebec().alpha(true);
                                        return Unit.INSTANCE;
                                    case 1:
                                        ShiftSummariesViewModelV2 quebec = shiftsFragmentV2.quebec();
                                        if (!quebec.india && !quebec.juliet) {
                                            quebec.hotel++;
                                            quebec.juliet = true;
                                            N n5 = quebec.bravo;
                                            k kVar2 = (k) n5.getValue();
                                            if (kVar2 instanceof j) {
                                                j jVar = (j) kVar2;
                                                List items = jVar.alpha;
                                                Intrinsics.echo(items, "items");
                                                n5.juliet(null, new j(items, jVar.bravo, true));
                                            }
                                            quebec.alpha(false);
                                        }
                                        return Unit.INSTANCE;
                                    case 2:
                                        ((t0) shiftsFragmentV2.f12484j).setValue(Boolean.FALSE);
                                        return Unit.INSTANCE;
                                    case 3:
                                        ShiftsFragmentV2 shiftsFragmentV22 = shiftsFragmentV2;
                                        ((t0) shiftsFragmentV22.f12485k).setValue(Boolean.FALSE);
                                        shiftsFragmentV22.romeo().alpha(true);
                                        return Unit.INSTANCE;
                                    case 4:
                                        ((t0) shiftsFragmentV2.f12486l).setValue(null);
                                        return Unit.INSTANCE;
                                    case 5:
                                        shiftsFragmentV2.romeo().alpha(true);
                                        return Unit.INSTANCE;
                                    default:
                                        ShiftsViewModelV2 romeo = shiftsFragmentV2.romeo();
                                        if (!romeo.kilo && !romeo.lima) {
                                            romeo.juliet++;
                                            romeo.lima = true;
                                            romeo.alpha(false);
                                        }
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        c0585q.f(jade9);
                    }
                    Function0 function04 = (Function0) jade9;
                    boolean india11 = c0585q.india(shiftsFragmentV2);
                    Object jade10 = c0585q.jade();
                    if (india11 || jade10 == obj3) {
                        final int i11 = 1;
                        jade10 = new Function0() { // from class: Dc.o
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i11) {
                                    case 0:
                                        shiftsFragmentV2.quebec().alpha(true);
                                        return Unit.INSTANCE;
                                    case 1:
                                        ShiftSummariesViewModelV2 quebec = shiftsFragmentV2.quebec();
                                        if (!quebec.india && !quebec.juliet) {
                                            quebec.hotel++;
                                            quebec.juliet = true;
                                            N n5 = quebec.bravo;
                                            k kVar2 = (k) n5.getValue();
                                            if (kVar2 instanceof j) {
                                                j jVar = (j) kVar2;
                                                List items = jVar.alpha;
                                                Intrinsics.echo(items, "items");
                                                n5.juliet(null, new j(items, jVar.bravo, true));
                                            }
                                            quebec.alpha(false);
                                        }
                                        return Unit.INSTANCE;
                                    case 2:
                                        ((t0) shiftsFragmentV2.f12484j).setValue(Boolean.FALSE);
                                        return Unit.INSTANCE;
                                    case 3:
                                        ShiftsFragmentV2 shiftsFragmentV22 = shiftsFragmentV2;
                                        ((t0) shiftsFragmentV22.f12485k).setValue(Boolean.FALSE);
                                        shiftsFragmentV22.romeo().alpha(true);
                                        return Unit.INSTANCE;
                                    case 4:
                                        ((t0) shiftsFragmentV2.f12486l).setValue(null);
                                        return Unit.INSTANCE;
                                    case 5:
                                        shiftsFragmentV2.romeo().alpha(true);
                                        return Unit.INSTANCE;
                                    default:
                                        ShiftsViewModelV2 romeo = shiftsFragmentV2.romeo();
                                        if (!romeo.kilo && !romeo.lima) {
                                            romeo.juliet++;
                                            romeo.lima = true;
                                            romeo.alpha(false);
                                        }
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        c0585q.f(jade10);
                    }
                    av.alpha(eVar, booleanValue, lVar, function1, function0, function02, function03, function12, kVar, booleanValue2, function04, (Function0) jade10, c0585q, 0);
                    if (((Boolean) ((t0) shiftsFragmentV2.f12484j).getValue()).booleanValue()) {
                        t0 t0Var = (t0) shiftsFragmentV2.f12483i;
                        if (!((Collection) t0Var.getValue()).isEmpty()) {
                            c0585q.purple(1109528064);
                            List list = (List) t0Var.getValue();
                            boolean india12 = c0585q.india(shiftsFragmentV2);
                            Object jade11 = c0585q.jade();
                            if (india12 || jade11 == obj3) {
                                jade11 = new n(shiftsFragmentV2, 2);
                                c0585q.f(jade11);
                            }
                            Function1 function13 = (Function1) jade11;
                            boolean india13 = c0585q.india(shiftsFragmentV2);
                            Object jade12 = c0585q.jade();
                            if (india13 || jade12 == obj3) {
                                final int i12 = 2;
                                jade12 = new Function0() { // from class: Dc.o
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        switch (i12) {
                                            case 0:
                                                shiftsFragmentV2.quebec().alpha(true);
                                                return Unit.INSTANCE;
                                            case 1:
                                                ShiftSummariesViewModelV2 quebec = shiftsFragmentV2.quebec();
                                                if (!quebec.india && !quebec.juliet) {
                                                    quebec.hotel++;
                                                    quebec.juliet = true;
                                                    N n5 = quebec.bravo;
                                                    k kVar2 = (k) n5.getValue();
                                                    if (kVar2 instanceof j) {
                                                        j jVar = (j) kVar2;
                                                        List items = jVar.alpha;
                                                        Intrinsics.echo(items, "items");
                                                        n5.juliet(null, new j(items, jVar.bravo, true));
                                                    }
                                                    quebec.alpha(false);
                                                }
                                                return Unit.INSTANCE;
                                            case 2:
                                                ((t0) shiftsFragmentV2.f12484j).setValue(Boolean.FALSE);
                                                return Unit.INSTANCE;
                                            case 3:
                                                ShiftsFragmentV2 shiftsFragmentV22 = shiftsFragmentV2;
                                                ((t0) shiftsFragmentV22.f12485k).setValue(Boolean.FALSE);
                                                shiftsFragmentV22.romeo().alpha(true);
                                                return Unit.INSTANCE;
                                            case 4:
                                                ((t0) shiftsFragmentV2.f12486l).setValue(null);
                                                return Unit.INSTANCE;
                                            case 5:
                                                shiftsFragmentV2.romeo().alpha(true);
                                                return Unit.INSTANCE;
                                            default:
                                                ShiftsViewModelV2 romeo = shiftsFragmentV2.romeo();
                                                if (!romeo.kilo && !romeo.lima) {
                                                    romeo.juliet++;
                                                    romeo.lima = true;
                                                    romeo.alpha(false);
                                                }
                                                return Unit.INSTANCE;
                                        }
                                    }
                                };
                                c0585q.f(jade12);
                            }
                            z10 = false;
                            Ec.ax.alpha(list, function13, (Function0) jade12, c0585q, 0);
                            c0585q.quebec(z10);
                            if (!((Boolean) ((t0) shiftsFragmentV2.f12485k).getValue()).booleanValue()) {
                                c0585q.purple(1110025428);
                                int i13 = shiftsFragmentV2.f12482h;
                                boolean india14 = c0585q.india(shiftsFragmentV2);
                                Object jade13 = c0585q.jade();
                                if (india14 || jade13 == obj3) {
                                    final int i14 = 3;
                                    jade13 = new Function0() { // from class: Dc.o
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i14) {
                                                case 0:
                                                    shiftsFragmentV2.quebec().alpha(true);
                                                    return Unit.INSTANCE;
                                                case 1:
                                                    ShiftSummariesViewModelV2 quebec = shiftsFragmentV2.quebec();
                                                    if (!quebec.india && !quebec.juliet) {
                                                        quebec.hotel++;
                                                        quebec.juliet = true;
                                                        N n5 = quebec.bravo;
                                                        k kVar2 = (k) n5.getValue();
                                                        if (kVar2 instanceof j) {
                                                            j jVar = (j) kVar2;
                                                            List items = jVar.alpha;
                                                            Intrinsics.echo(items, "items");
                                                            n5.juliet(null, new j(items, jVar.bravo, true));
                                                        }
                                                        quebec.alpha(false);
                                                    }
                                                    return Unit.INSTANCE;
                                                case 2:
                                                    ((t0) shiftsFragmentV2.f12484j).setValue(Boolean.FALSE);
                                                    return Unit.INSTANCE;
                                                case 3:
                                                    ShiftsFragmentV2 shiftsFragmentV22 = shiftsFragmentV2;
                                                    ((t0) shiftsFragmentV22.f12485k).setValue(Boolean.FALSE);
                                                    shiftsFragmentV22.romeo().alpha(true);
                                                    return Unit.INSTANCE;
                                                case 4:
                                                    ((t0) shiftsFragmentV2.f12486l).setValue(null);
                                                    return Unit.INSTANCE;
                                                case 5:
                                                    shiftsFragmentV2.romeo().alpha(true);
                                                    return Unit.INSTANCE;
                                                default:
                                                    ShiftsViewModelV2 romeo = shiftsFragmentV2.romeo();
                                                    if (!romeo.kilo && !romeo.lima) {
                                                        romeo.juliet++;
                                                        romeo.lima = true;
                                                        romeo.alpha(false);
                                                    }
                                                    return Unit.INSTANCE;
                                            }
                                        }
                                    };
                                    c0585q.f(jade13);
                                }
                                z11 = false;
                                Ec.p.alpha((Function0) jade13, i13, c0585q, 0);
                            } else {
                                z11 = false;
                                c0585q.purple(1104705456);
                            }
                            c0585q.quebec(z11);
                            str = (String) ((t0) shiftsFragmentV2.f12486l).getValue();
                            if (str != null) {
                                c0585q.purple(1110342960);
                            } else {
                                c0585q.purple(1110342961);
                                boolean india15 = c0585q.india(shiftsFragmentV2);
                                Object jade14 = c0585q.jade();
                                if (india15 || jade14 == obj3) {
                                    final int i15 = 4;
                                    jade14 = new Function0() { // from class: Dc.o
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i15) {
                                                case 0:
                                                    shiftsFragmentV2.quebec().alpha(true);
                                                    return Unit.INSTANCE;
                                                case 1:
                                                    ShiftSummariesViewModelV2 quebec = shiftsFragmentV2.quebec();
                                                    if (!quebec.india && !quebec.juliet) {
                                                        quebec.hotel++;
                                                        quebec.juliet = true;
                                                        N n5 = quebec.bravo;
                                                        k kVar2 = (k) n5.getValue();
                                                        if (kVar2 instanceof j) {
                                                            j jVar = (j) kVar2;
                                                            List items = jVar.alpha;
                                                            Intrinsics.echo(items, "items");
                                                            n5.juliet(null, new j(items, jVar.bravo, true));
                                                        }
                                                        quebec.alpha(false);
                                                    }
                                                    return Unit.INSTANCE;
                                                case 2:
                                                    ((t0) shiftsFragmentV2.f12484j).setValue(Boolean.FALSE);
                                                    return Unit.INSTANCE;
                                                case 3:
                                                    ShiftsFragmentV2 shiftsFragmentV22 = shiftsFragmentV2;
                                                    ((t0) shiftsFragmentV22.f12485k).setValue(Boolean.FALSE);
                                                    shiftsFragmentV22.romeo().alpha(true);
                                                    return Unit.INSTANCE;
                                                case 4:
                                                    ((t0) shiftsFragmentV2.f12486l).setValue(null);
                                                    return Unit.INSTANCE;
                                                case 5:
                                                    shiftsFragmentV2.romeo().alpha(true);
                                                    return Unit.INSTANCE;
                                                default:
                                                    ShiftsViewModelV2 romeo = shiftsFragmentV2.romeo();
                                                    if (!romeo.kilo && !romeo.lima) {
                                                        romeo.juliet++;
                                                        romeo.lima = true;
                                                        romeo.alpha(false);
                                                    }
                                                    return Unit.INSTANCE;
                                            }
                                        }
                                    };
                                    c0585q.f(jade14);
                                }
                                z11 = false;
                                Ec.s.alpha(str, (Function0) jade14, c0585q, 0);
                            }
                            c0585q.quebec(z11);
                        }
                    }
                    z10 = false;
                    c0585q.purple(1104705456);
                    c0585q.quebec(z10);
                    if (!((Boolean) ((t0) shiftsFragmentV2.f12485k).getValue()).booleanValue()) {
                    }
                    c0585q.quebec(z11);
                    str = (String) ((t0) shiftsFragmentV2.f12486l).getValue();
                    if (str != null) {
                    }
                    c0585q.quebec(z11);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            default:
                Shift shift = (Shift) obj;
                String reason = (String) obj2;
                Intrinsics.echo(shift, "shift");
                Intrinsics.echo(reason, "reason");
                ShiftsViewModelV2 romeo = this.purple.romeo();
                Long id2 = shift.getId();
                if (id2 != null) {
                    j5 = id2.longValue();
                } else {
                    j5 = 0;
                }
                ad.zulu(T.hotel(romeo), null, null, new x(romeo, j5, reason, new Aa.l(4, this.red), null), 3);
                return Unit.INSTANCE;
        }
    }
}
