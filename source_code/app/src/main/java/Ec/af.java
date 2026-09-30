package Ec;

import a0.C0366t;
import android.graphics.Typeface;
import android.text.Spannable;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.InterfaceC0555v;
import androidx.compose.foundation.layout.Q;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.t0;
import com.airbnb.lottie.compose.LottieConstants;
import com.app.network.network.models.AddressNoteListItem;
import com.app.network.network.models.ShiftSummary;
import com.checkout.components.card.model.InfoBottomSheetViewStyleState;
import com.checkout.components.card.ui.component.cardnumber.InfoBottomSheetViewKt;
import com.checkout.components.kmp.rememberme.shared.model.customization.DesignTokens;
import com.checkout.components.kmp.rememberme.utils.ResourceProvider;
import com.checkout.components.kmp.rememberme.view.dialog.InfoDialogViewKt;
import com.checkout.components.ui.model.state.InputComponentState;
import com.checkout.components.ui.model.style.view.InputComponentViewStyle;
import com.checkout.components.ui.view.InputContainerViewKt;
import d.C1556t;
import d2.EnumC1581f;
import delivery.samurai.android.R;
import i.InterfaceC1854c;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import okhttp3.internal.http2.Settings;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2636d7;
import s6.AbstractC2715m5;
import s6.F6;
import t6.AbstractC3017k3;
import t6.AbstractC3033o;
import ub.AbstractC3150c;

/* loaded from: classes2.dex */
public final /* synthetic */ class af implements Xd.m {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;

    public /* synthetic */ af(int i4, Object obj, Object obj2) {
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z2;
        int i4;
        int i5;
        Typeface typeface;
        boolean z10;
        boolean z11;
        Unit InfoDialogView$lambda$7$lambda$6$lambda$5$lambda$4$lambda$3;
        boolean z12;
        Unit InfoBottomSheetView$lambda$6;
        EnumC1581f enumC1581f;
        Unit InputComponentContainerView$lambda$2$lambda$1$lambda$0;
        boolean z13;
        boolean z14;
        int i10;
        androidx.compose.runtime.as asVar = C0580l.alpha;
        T.p pVar = T.p.alpha;
        Unit unit = null;
        int i11 = 19;
        Object obj4 = this.red;
        Object obj5 = this.purple;
        switch (this.alpha) {
            case 0:
                InterfaceC0555v Card = (InterfaceC0555v) obj;
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj2;
                int intValue = ((Integer) obj3).intValue();
                Intrinsics.echo(Card, "$this$Card");
                if ((intValue & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(intValue & 1, z2)) {
                    float f5 = 16;
                    T.s sierra = AbstractC0538d.sierra(pVar, f5);
                    C0554u alpha = AbstractC0553t.alpha(AbstractC0542h.golf(f5), T.d.f2062f, c0585q, 6);
                    long j5 = c0585q.magenta;
                    int i12 = (int) (j5 ^ (j5 >>> 32));
                    I mike = c0585q.mike();
                    T.s charlie = T.a.charlie(sierra, c0585q);
                    InterfaceC2552l.maroon.getClass();
                    C2550j c2550j = C2551k.bravo;
                    c0585q.white();
                    if (c0585q.lime) {
                        c0585q.lima(c2550j);
                    } else {
                        c0585q.i();
                    }
                    C0564b.blue(C2551k.foxtrot, c0585q, alpha);
                    C0564b.blue(C2551k.echo, c0585q, mike);
                    C2549i c2549i = C2551k.golf;
                    if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i12))) {
                        ao.ad.blue(i12, c0585q, i12, c2549i);
                    }
                    C0564b.blue(C2551k.delta, c0585q, charlie);
                    ShiftSummary shiftSummary = (ShiftSummary) obj5;
                    ap.bravo(shiftSummary, c0585q, 0);
                    ap.mike(shiftSummary, c0585q, 0);
                    androidx.compose.runtime.ax axVar = (androidx.compose.runtime.ax) obj4;
                    androidx.compose.animation.b.charlie(((Boolean) axVar.getValue()).booleanValue(), null, bx.ar.alpha(null, 15), bx.ar.delta(null, 15), null, P.e.echo(1548105174, new aj(shiftSummary, 1), c0585q), c0585q, 1600518, 18);
                    boolean booleanValue = ((Boolean) axVar.getValue()).booleanValue();
                    boolean golf = c0585q.golf(axVar);
                    Object jade = c0585q.jade();
                    if (golf || jade == asVar) {
                        jade = new Cb.u(axVar, 4);
                        c0585q.f(jade);
                    }
                    ap.hotel(booleanValue, (Function0) jade, c0585q, 0);
                    c0585q.quebec(true);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            case 1:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Ef.c.hotel;
                ((Ef.b) obj4).getClass();
                Ef.c cVar = (Ef.c) obj5;
                atomicReferenceFieldUpdater.set(cVar, null);
                cVar.foxtrot(null);
                return Unit.INSTANCE;
            case 2:
                D0.af afVar = (D0.af) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int intValue3 = ((Integer) obj3).intValue();
                H0.k kVar = afVar.foxtrot;
                H0.v vVar = afVar.charlie;
                if (vVar == null) {
                    vVar = H0.v.yellow;
                }
                H0.r rVar = afVar.delta;
                if (rVar != null) {
                    i4 = rVar.alpha;
                } else {
                    i4 = 0;
                }
                H0.s sVar = afVar.echo;
                if (sVar != null) {
                    i5 = sVar.alpha;
                } else {
                    i5 = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                }
                L0.d dVar = (L0.d) ((L0.c) obj4).purple;
                H0.af bravo = ((H0.l) dVar.teal).bravo(kVar, vVar, i4, i5);
                if (!(bravo instanceof H0.ae)) {
                    J2.t tVar = new J2.t(bravo, dVar.f1702c);
                    dVar.f1702c = tVar;
                    Object obj6 = tVar.red;
                    Intrinsics.charlie(obj6, "null cannot be cast to non-null type android.graphics.Typeface");
                    typeface = (Typeface) obj6;
                } else {
                    Object obj7 = ((H0.ae) bravo).alpha;
                    Intrinsics.charlie(obj7, "null cannot be cast to non-null type android.graphics.Typeface");
                    typeface = (Typeface) obj7;
                }
                ((Spannable) obj5).setSpan(new G0.b(1, typeface), intValue2, intValue3, 33);
                return Unit.INSTANCE;
            case 3:
                InterfaceC1854c item = (InterfaceC1854c) obj;
                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                Intrinsics.echo(item, "$this$item");
                if ((intValue4 & 17) != 16) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C0585q c0585q2 = (C0585q) interfaceC0581m2;
                if (c0585q2.magenta(intValue4 & 1, z10)) {
                    Ma.a aVar = (Ma.a) obj5;
                    Function1 function1 = (Function1) obj4;
                    boolean golf2 = c0585q2.golf(function1) | c0585q2.golf(aVar);
                    Object jade2 = c0585q2.jade();
                    if (golf2 || jade2 == asVar) {
                        jade2 = new Ac.g(i11, function1, aVar);
                        c0585q2.f(jade2);
                    }
                    Pa.i.golf(0, null, c0585q2, aVar.alpha, (Function0) jade2);
                } else {
                    c0585q2.ochre();
                }
                return Unit.INSTANCE;
            case 4:
                InterfaceC1854c item2 = (InterfaceC1854c) obj;
                InterfaceC0581m interfaceC0581m3 = (InterfaceC0581m) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                Intrinsics.echo(item2, "$this$item");
                if ((intValue5 & 17) != 16) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                C0585q c0585q3 = (C0585q) interfaceC0581m3;
                if (c0585q3.magenta(intValue5 & 1, z11)) {
                    Pa.i.bravo(0, null, c0585q3, ((Oa.c) ((Oa.f) obj5)).alpha, (Function0) obj4);
                } else {
                    c0585q3.ochre();
                }
                return Unit.INSTANCE;
            case 5:
                InfoDialogView$lambda$7$lambda$6$lambda$5$lambda$4$lambda$3 = InfoDialogViewKt.InfoDialogView$lambda$7$lambda$6$lambda$5$lambda$4$lambda$3((DesignTokens) obj5, (ResourceProvider) obj4, (T) obj, (InterfaceC0581m) obj2, ((Integer) obj3).intValue());
                return InfoDialogView$lambda$7$lambda$6$lambda$5$lambda$4$lambda$3;
            case 6:
                InterfaceC0555v Card2 = (InterfaceC0555v) obj;
                InterfaceC0581m interfaceC0581m4 = (InterfaceC0581m) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                Intrinsics.echo(Card2, "$this$Card");
                if ((intValue6 & 17) != 16) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                C0585q c0585q4 = (C0585q) interfaceC0581m4;
                if (c0585q4.magenta(intValue6 & 1, z12)) {
                    T.s charlie2 = V.charlie(pVar, 1.0f);
                    C0537c c0537c = AbstractC0542h.charlie;
                    T.i iVar = T.d.f2062f;
                    C0554u alpha2 = AbstractC0553t.alpha(c0537c, iVar, c0585q4, 0);
                    long j6 = c0585q4.magenta;
                    int i13 = (int) (j6 ^ (j6 >>> 32));
                    I mike2 = c0585q4.mike();
                    T.s charlie3 = T.a.charlie(charlie2, c0585q4);
                    InterfaceC2552l.maroon.getClass();
                    C2550j c2550j2 = C2551k.bravo;
                    c0585q4.white();
                    if (c0585q4.lime) {
                        c0585q4.lima(c2550j2);
                    } else {
                        c0585q4.i();
                    }
                    C2549i c2549i2 = C2551k.foxtrot;
                    C0564b.blue(c2549i2, c0585q4, alpha2);
                    C2549i c2549i3 = C2551k.echo;
                    C0564b.blue(c2549i3, c0585q4, mike2);
                    C2549i c2549i4 = C2551k.golf;
                    if (c0585q4.lime || !Intrinsics.areEqual(c0585q4.jade(), Integer.valueOf(i13))) {
                        ao.ad.blue(i13, c0585q4, i13, c2549i4);
                    }
                    C2549i c2549i5 = C2551k.delta;
                    C0564b.blue(c2549i5, c0585q4, charlie3);
                    float f10 = 14;
                    T.s tango = AbstractC0538d.tango(V.charlie(pVar, 1.0f), f10, f10);
                    C0554u alpha3 = AbstractC0553t.alpha(c0537c, iVar, c0585q4, 0);
                    long j7 = c0585q4.magenta;
                    int i14 = (int) (j7 ^ (j7 >>> 32));
                    I mike3 = c0585q4.mike();
                    T.s charlie4 = T.a.charlie(tango, c0585q4);
                    c0585q4.white();
                    if (c0585q4.lime) {
                        c0585q4.lima(c2550j2);
                    } else {
                        c0585q4.i();
                    }
                    C0564b.blue(c2549i2, c0585q4, alpha3);
                    C0564b.blue(c2549i3, c0585q4, mike3);
                    if (c0585q4.lime || !Intrinsics.areEqual(c0585q4.jade(), Integer.valueOf(i14))) {
                        ao.ad.blue(i14, c0585q4, i14, c2549i4);
                    }
                    C0564b.blue(c2549i5, c0585q4, charlie4);
                    c0585q4.quebec(true);
                    AbstractC3033o.alpha(V.charlie(pVar, 1.0f), 0.0f, c0585q4, 6, 2);
                    float f11 = 12;
                    float f12 = 18;
                    T.s uniform = AbstractC0538d.uniform(com.google.android.material.datepicker.j.hotel(pVar, f11, c0585q4, pVar, 1.0f), f12, 0.0f, 2);
                    C0554u alpha4 = AbstractC0553t.alpha(c0537c, iVar, c0585q4, 0);
                    long j10 = c0585q4.magenta;
                    int i15 = (int) (j10 ^ (j10 >>> 32));
                    I mike4 = c0585q4.mike();
                    T.s charlie5 = T.a.charlie(uniform, c0585q4);
                    c0585q4.white();
                    if (c0585q4.lime) {
                        c0585q4.lima(c2550j2);
                    } else {
                        c0585q4.i();
                    }
                    C0564b.blue(c2549i2, c0585q4, alpha4);
                    C0564b.blue(c2549i3, c0585q4, mike4);
                    if (c0585q4.lime || !Intrinsics.areEqual(c0585q4.jade(), Integer.valueOf(i15))) {
                        ao.ad.blue(i15, c0585q4, i15, c2549i4);
                    }
                    C0564b.blue(c2549i5, c0585q4, charlie5);
                    AddressNoteListItem addressNoteListItem = (AddressNoteListItem) obj5;
                    cc.g.alpha(addressNoteListItem, null, c0585q4, 0);
                    c0585q4.quebec(true);
                    AbstractC0538d.echo(V.echo(pVar, f11), c0585q4);
                    T.s uniform2 = AbstractC0538d.uniform(V.charlie(pVar, 1.0f), f12, 0.0f, 2);
                    C0554u alpha5 = AbstractC0553t.alpha(c0537c, iVar, c0585q4, 0);
                    long j11 = c0585q4.magenta;
                    int i16 = (int) (j11 ^ (j11 >>> 32));
                    I mike5 = c0585q4.mike();
                    T.s charlie6 = T.a.charlie(uniform2, c0585q4);
                    c0585q4.white();
                    if (c0585q4.lime) {
                        c0585q4.lima(c2550j2);
                    } else {
                        c0585q4.i();
                    }
                    C0564b.blue(c2549i2, c0585q4, alpha5);
                    C0564b.blue(c2549i3, c0585q4, mike5);
                    if (c0585q4.lime || !Intrinsics.areEqual(c0585q4.jade(), Integer.valueOf(i16))) {
                        ao.ad.blue(i16, c0585q4, i16, c2549i4);
                    }
                    C0564b.blue(c2549i5, c0585q4, charlie6);
                    cc.g.hotel(addressNoteListItem, c0585q4, 0);
                    c0585q4.quebec(true);
                    float f13 = 16;
                    AbstractC3033o.alpha(com.google.android.material.datepicker.j.hotel(pVar, f13, c0585q4, pVar, 1.0f), 0.0f, c0585q4, 6, 2);
                    T.s whiskey = AbstractC0538d.whiskey(AbstractC0538d.uniform(com.google.android.material.datepicker.j.hotel(pVar, f11, c0585q4, pVar, 1.0f), f12, 0.0f, 2), 0.0f, 0.0f, 0.0f, f13, 7);
                    C0554u alpha6 = AbstractC0553t.alpha(c0537c, iVar, c0585q4, 0);
                    long j12 = c0585q4.magenta;
                    int i17 = (int) (j12 ^ (j12 >>> 32));
                    I mike6 = c0585q4.mike();
                    T.s charlie7 = T.a.charlie(whiskey, c0585q4);
                    c0585q4.white();
                    if (c0585q4.lime) {
                        c0585q4.lima(c2550j2);
                    } else {
                        c0585q4.i();
                    }
                    C0564b.blue(c2549i2, c0585q4, alpha6);
                    C0564b.blue(c2549i3, c0585q4, mike6);
                    if (c0585q4.lime || !Intrinsics.areEqual(c0585q4.jade(), Integer.valueOf(i17))) {
                        ao.ad.blue(i17, c0585q4, i17, c2549i4);
                    }
                    C0564b.blue(c2549i5, c0585q4, charlie7);
                    cc.g.foxtrot(addressNoteListItem, (Xd.m) obj4, null, c0585q4, 0);
                    c0585q4.quebec(true);
                    c0585q4.quebec(true);
                } else {
                    c0585q4.ochre();
                }
                return Unit.INSTANCE;
            case 7:
                InfoBottomSheetView$lambda$6 = InfoBottomSheetViewKt.InfoBottomSheetView$lambda$6((Function0) obj5, (InfoBottomSheetViewStyleState) obj4, (InterfaceC0555v) obj, (InterfaceC0581m) obj2, ((Integer) obj3).intValue());
                return InfoBottomSheetView$lambda$6;
            case 8:
                m0.r rVar2 = (m0.r) obj;
                m0.r rVar3 = (m0.r) obj2;
                Z.b bVar = (Z.b) obj3;
                d.aj ajVar = (d.aj) obj5;
                ajVar.f11984c = 0L;
                if (((Boolean) ajVar.silver.invoke(rVar2)).booleanValue()) {
                    if (!ajVar.f11983b) {
                        if (ajVar.yellow == null) {
                            ajVar.yellow = AbstractC3017k3.bravo(LottieConstants.IterateForever, 6, null);
                        }
                        ajVar.f11983b = true;
                        vf.ad.zulu(ajVar.getCoroutineScope(), null, null, new d.ai(ajVar, null), 3);
                    }
                    F6.alpha((bn.g) obj4, rVar2, 0L);
                    long foxtrot = Z.b.foxtrot(rVar3.charlie, bVar.alpha);
                    xf.e eVar = ajVar.yellow;
                    if (eVar != null) {
                        eVar.mike(new C1556t(foxtrot));
                    }
                }
                return Unit.INSTANCE;
            case 9:
                int intValue7 = ((Integer) obj).intValue();
                String argName = (String) obj2;
                Y1.aq navType = (Y1.aq) obj3;
                Intrinsics.echo(argName, "argName");
                Intrinsics.echo(navType, "navType");
                Object obj8 = ((Map) obj5).get(argName);
                Intrinsics.checkNotNull(obj8);
                List value = (List) obj8;
                com.google.firebase.messaging.o oVar = (com.google.firebase.messaging.o) obj4;
                Intrinsics.echo(value, "value");
                if (!(navType instanceof Y1.f) && !((KSerializer) oVar.bravo).getDescriptor().victor(intValue7)) {
                    enumC1581f = EnumC1581f.alpha;
                } else {
                    enumC1581f = EnumC1581f.purple;
                }
                int ordinal = enumC1581f.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        Iterator it = value.iterator();
                        while (it.hasNext()) {
                            oVar.foxtrot(argName, (String) it.next());
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (value.size() == 1) {
                    oVar.charlie = ((String) oVar.charlie) + '/' + ((String) CollectionsKt.gold(value));
                } else {
                    StringBuilder victor = Q0.c.victor("Expected one value for argument ", argName, ", found ");
                    victor.append(value.size());
                    victor.append("values instead.");
                    throw new IllegalArgumentException(victor.toString().toString());
                }
                return Unit.INSTANCE;
            case 10:
                InputComponentContainerView$lambda$2$lambda$1$lambda$0 = InputContainerViewKt.InputComponentContainerView$lambda$2$lambda$1$lambda$0((InputComponentViewStyle) obj5, (InputComponentState) obj4, (bx.aa) obj, (InterfaceC0581m) obj2, ((Integer) obj3).intValue());
                return InputComponentContainerView$lambda$2$lambda$1$lambda$0;
            case 11:
                T Button = (T) obj;
                InterfaceC0581m interfaceC0581m5 = (InterfaceC0581m) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                Intrinsics.echo(Button, "$this$Button");
                if ((intValue8 & 17) != 16) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                C0585q c0585q5 = (C0585q) interfaceC0581m5;
                if (c0585q5.magenta(intValue8 & 1, z13)) {
                    S alpha7 = Q.alpha(AbstractC0542h.golf(4), T.d.f2061d, c0585q5, 54);
                    long j13 = c0585q5.magenta;
                    int i18 = (int) (j13 ^ (j13 >>> 32));
                    I mike7 = c0585q5.mike();
                    T.s charlie8 = T.a.charlie(pVar, c0585q5);
                    InterfaceC2552l.maroon.getClass();
                    C2550j c2550j3 = C2551k.bravo;
                    c0585q5.white();
                    if (c0585q5.lime) {
                        c0585q5.lima(c2550j3);
                    } else {
                        c0585q5.i();
                    }
                    C0564b.blue(C2551k.foxtrot, c0585q5, alpha7);
                    C0564b.blue(C2551k.echo, c0585q5, mike7);
                    C2549i c2549i6 = C2551k.golf;
                    if (c0585q5.lime || !Intrinsics.areEqual(c0585q5.jade(), Integer.valueOf(i18))) {
                        ao.ad.blue(i18, c0585q5, i18, c2549i6);
                    }
                    C0564b.blue(C2551k.delta, c0585q5, charlie8);
                    z.ak.bravo((String) obj5, null, C0366t.echo, AbstractC2636d7.charlie(14), H0.v.f1409c, new H0.n(ArraysKt.sierra(new H0.i[]{AbstractC2715m5.alpha(R.font.circularstd, null, 0, 14)})), 0L, new O0.k(3), 0L, 0, false, 0, 0, null, null, c0585q5, 1772928, 0, 130450);
                    P.d dVar2 = (P.d) obj4;
                    if (dVar2 == null) {
                        c0585q5.purple(1996214350);
                    } else {
                        c0585q5.purple(-212700653);
                        dVar2.invoke(c0585q5, 0);
                    }
                    c0585q5.quebec(false);
                    c0585q5.quebec(true);
                } else {
                    c0585q5.ochre();
                }
                return Unit.INSTANCE;
            default:
                N2.aa SubcomposeAsyncImage = (N2.aa) obj;
                InterfaceC0581m interfaceC0581m6 = (InterfaceC0581m) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                Intrinsics.echo(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                if ((intValue9 & 6) == 0) {
                    if (((C0585q) interfaceC0581m6).golf(SubcomposeAsyncImage)) {
                        i10 = 4;
                    } else {
                        i10 = 2;
                    }
                    intValue9 |= i10;
                }
                if ((intValue9 & 19) != 18) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                C0585q c0585q6 = (C0585q) interfaceC0581m6;
                if (c0585q6.magenta(intValue9 & 1, z14)) {
                    N2.h hVar = (N2.h) ((t0) SubcomposeAsyncImage.bravo.f1864g).getValue();
                    if (hVar instanceof N2.f) {
                        c0585q6.purple(978454802);
                        P.d dVar3 = (P.d) obj5;
                        if (dVar3 == null) {
                            c0585q6.purple(978483197);
                            c0585q6.quebec(false);
                        } else {
                            c0585q6.purple(2109773956);
                            dVar3.invoke(c0585q6, 0);
                            c0585q6.quebec(false);
                            unit = Unit.INSTANCE;
                        }
                        if (unit == null) {
                            c0585q6.purple(2109774359);
                            AbstractC3150c.charlie(c0585q6, 0);
                        } else {
                            c0585q6.purple(2109773584);
                        }
                        c0585q6.quebec(false);
                        c0585q6.quebec(false);
                    } else if (hVar instanceof N2.e) {
                        c0585q6.purple(978586490);
                        P.d dVar4 = (P.d) obj4;
                        if (dVar4 == null) {
                            c0585q6.purple(978609181);
                            c0585q6.quebec(false);
                        } else {
                            c0585q6.purple(2109778020);
                            dVar4.invoke(c0585q6, 0);
                            c0585q6.quebec(false);
                            unit = Unit.INSTANCE;
                        }
                        if (unit == null) {
                            c0585q6.purple(2109778421);
                            AbstractC3150c.bravo(c0585q6, 0);
                        } else {
                            c0585q6.purple(2109777832);
                        }
                        c0585q6.quebec(false);
                        c0585q6.quebec(false);
                    } else {
                        c0585q6.purple(978682249);
                        N2.p.golf(SubcomposeAsyncImage, null, null, null, null, null, 0.0f, false, c0585q6, intValue9 & 14);
                        c0585q6.quebec(false);
                    }
                } else {
                    c0585q6.ochre();
                }
                return Unit.INSTANCE;
        }
    }
}
