package Cb;

import D0.am;
import D0.an;
import Ec.ap;
import F.G2;
import F.O;
import F.Q;
import F.S2;
import F.T2;
import Jb.C0201i;
import Y1.aq;
import a0.C0352f;
import a0.C0366t;
import a0.ao;
import android.content.Context;
import android.graphics.Bitmap;
import android.location.Location;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.InterfaceC0550p;
import androidx.compose.foundation.layout.InterfaceC0555v;
import androidx.compose.foundation.layout.L;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.V;
import androidx.compose.foundation.layout.as;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import com.app.network.network.models.UserInfo;
import com.checkout.address.AddressComponent;
import com.checkout.components.card.ui.component.address.AddressViewKt;
import com.checkout.components.card.ui.component.cardnumber.SchemeChoiceSelectionViewKt;
import com.checkout.components.card.ui.component.cardnumber.SchemeComponentViewKt;
import com.checkout.components.core.ui.content.FlowComponentItemViewKt;
import com.checkout.components.kmp.rememberme.shared.model.customization.DesignTokens;
import com.checkout.components.kmp.rememberme.view.dialog.InfoDialogViewKt;
import com.checkout.components.rememberme.AbstractC0993x;
import com.checkout.components.rememberme.M1;
import com.checkout.components.rememberme.di.DiComponent;
import com.checkout.components.rememberme.model.WalletCvvViewState;
import com.checkout.components.ui.model.style.base.ImageStyle;
import com.clevertap.android.sdk.customviews.MediaPlayerRecyclerView;
import com.zendesk.service.HttpConstants;
import d2.EnumC1581f;
import delivery.samurai.android.R;
import f0.C1679a;
import ga.AbstractC1760c;
import i.InterfaceC1854c;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import n.C2121A;
import n.d0;
import pe.AbstractC2327c;
import q0.AbstractC2367C;
import q0.C2391j;
import q0.ar;
import q0.av;
import qb.C2445l;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2636d7;
import s6.AbstractC2833z7;
import s6.J4;
import s6.K0;
import s6.M4;
import t6.AbstractC3086y3;
import t6.R3;
import t6.W3;
import t6.X3;
import w.C3230h;
import y.C3344D;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Xd.m {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ d(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        EnumC1581f enumC1581f;
        boolean z18;
        Unit AddressView$lambda$11$lambda$10;
        Object obj4 = C0580l.alpha;
        T.p pVar = T.p.alpha;
        int i4 = 2;
        boolean z19 = true;
        Object obj5 = this.purple;
        switch (this.alpha) {
            case 0:
                InterfaceC0555v CardSection = (InterfaceC0555v) obj;
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj2;
                int intValue = ((Integer) obj3).intValue();
                Intrinsics.echo(CardSection, "$this$CardSection");
                if ((intValue & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(intValue & 1, z2)) {
                    c cVar = (c) obj5;
                    String str = cVar.charlie;
                    c0585q.purple(-363296089);
                    an anVar = ((S2) c0585q.kilo(T2.alpha)).lima;
                    G2.bravo(cVar.charlie, AbstractC0538d.whiskey(T.p.alpha, 0.0f, 0.0f, 0.0f, Db.d.charlie, 7), ((O) c0585q.kilo(Q.alpha)).sierra, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, anVar, c0585q, 0, 0, 65528);
                    c0585q.quebec(false);
                    cVar.echo.invoke(c0585q, 0);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            case 1:
                InterfaceC1854c item = (InterfaceC1854c) obj;
                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                Intrinsics.echo(item, "$this$item");
                if ((intValue2 & 17) != 16) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C0585q c0585q2 = (C0585q) interfaceC0581m2;
                if (c0585q2.magenta(intValue2 & 1, z10)) {
                    z.alpha((b) obj5, null, c0585q2, 0);
                } else {
                    c0585q2.ochre();
                }
                return Unit.INSTANCE;
            case 2:
                InterfaceC0550p PullToRefreshBox = (InterfaceC0550p) obj;
                InterfaceC0581m interfaceC0581m3 = (InterfaceC0581m) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                Intrinsics.echo(PullToRefreshBox, "$this$PullToRefreshBox");
                if ((intValue3 & 17) != 16) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                C0585q c0585q3 = (C0585q) interfaceC0581m3;
                if (c0585q3.magenta(intValue3 & 1, z11)) {
                    ap.echo(X3.bravo(V.charlie, X3.alpha(c0585q3), true), ((Dc.h) ((Dc.k) obj5)).alpha, c0585q3, 0, 0);
                } else {
                    c0585q3.ochre();
                }
                return Unit.INSTANCE;
            case 3:
                ((Ef.h) obj5).bravo();
                return Unit.INSTANCE;
            case 4:
                return FlowComponentItemViewKt.alpha((Xd.l) obj5, (bx.aa) obj, (InterfaceC0581m) obj2, ((Integer) obj3).intValue());
            case 5:
                InterfaceC1854c item2 = (InterfaceC1854c) obj;
                InterfaceC0581m interfaceC0581m4 = (InterfaceC0581m) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                Intrinsics.echo(item2, "$this$item");
                if ((intValue4 & 17) != 16) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                C0585q c0585q4 = (C0585q) interfaceC0581m4;
                if (c0585q4.magenta(intValue4 & 1, z12)) {
                    AbstractC0538d.echo(V.echo(pVar, 12), c0585q4);
                    C2445l c2445l = new C2445l(AbstractC3086y3.bravo(c0585q4, R.string.status_header_internet_lost), AbstractC3086y3.bravo(c0585q4, R.string.reconnect_message), AbstractC3086y3.bravo(c0585q4, R.string.mobile_setting));
                    Context context = (Context) obj5;
                    boolean india = c0585q4.india(context);
                    Object jade = c0585q4.jade();
                    if (india || jade == obj4) {
                        jade = new C0201i(context, 0);
                        c0585q4.f(jade);
                    }
                    AbstractC2833z7.alpha(c2445l, (Function0) jade, AbstractC0538d.uniform(V.charlie(pVar, 1.0f), 8, 0.0f, 2), null, 0L, 0L, 0L, 0L, false, c0585q4, 384);
                } else {
                    c0585q4.ochre();
                }
                return Unit.INSTANCE;
            case 6:
                InterfaceC0550p PullToRefreshBox2 = (InterfaceC0550p) obj;
                InterfaceC0581m interfaceC0581m5 = (InterfaceC0581m) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                Intrinsics.echo(PullToRefreshBox2, "$this$PullToRefreshBox");
                if ((intValue5 & 17) != 16) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                C0585q c0585q5 = (C0585q) interfaceC0581m5;
                if (c0585q5.magenta(intValue5 & 1, z13)) {
                    Jc.o.delta(0, null, c0585q5, ((Kc.b) ((Kc.e) obj5)).alpha);
                } else {
                    c0585q5.ochre();
                }
                return Unit.INSTANCE;
            case 7:
                InterfaceC1854c item3 = (InterfaceC1854c) obj;
                InterfaceC0581m interfaceC0581m6 = (InterfaceC0581m) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                Intrinsics.echo(item3, "$this$item");
                if ((intValue6 & 17) != 16) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                C0585q c0585q6 = (C0585q) interfaceC0581m6;
                if (c0585q6.magenta(intValue6 & 1, z14)) {
                    UserInfo userInfo = (UserInfo) obj5;
                    if (userInfo != null) {
                        z15 = Intrinsics.areEqual(userInfo.getAwaitingOrders(), Boolean.TRUE);
                    } else {
                        z15 = false;
                    }
                    if (z15) {
                        c0585q6.purple(1696094528);
                        z16 = false;
                        Sb.d.foxtrot(c0585q6, 0);
                    } else {
                        z16 = false;
                        c0585q6.purple(1686677720);
                    }
                    c0585q6.quebec(z16);
                } else {
                    c0585q6.ochre();
                }
                return Unit.INSTANCE;
            case 8:
                return InfoDialogViewKt.golf((DesignTokens) obj5, (InterfaceC1854c) obj, (InterfaceC0581m) obj2, ((Integer) obj3).intValue());
            case 9:
                T OutlinedButton = (T) obj;
                InterfaceC0581m interfaceC0581m7 = (InterfaceC0581m) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                Intrinsics.echo(OutlinedButton, "$this$OutlinedButton");
                if ((intValue7 & 17) != 16) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                C0585q c0585q7 = (C0585q) interfaceC0581m7;
                if (c0585q7.magenta(intValue7 & 1, z17)) {
                    G2.bravo(AbstractC3086y3.bravo(c0585q7, R.string.skip), null, Zb.a.delta, AbstractC2636d7.charlie(14), H0.v.f1409c, (H0.k) obj5, 0L, new O0.k(3), 0L, 0, false, 0, 0, null, null, c0585q7, 200064, 0, 130450);
                } else {
                    c0585q7.ochre();
                }
                return Unit.INSTANCE;
            case 10:
                return M1.a((WalletCvvViewState) obj5, (bx.aa) obj, (InterfaceC0581m) obj2, ((Integer) obj3).intValue());
            case 11:
                return AbstractC0993x.a((DiComponent) obj5, (Function0) obj, (InterfaceC0581m) obj2, ((Integer) obj3).intValue());
            case 12:
                return SchemeChoiceSelectionViewKt.echo((ImageStyle) obj5, (InterfaceC0555v) obj, (InterfaceC0581m) obj2, ((Integer) obj3).intValue());
            case 13:
                return SchemeComponentViewKt.bravo((List) obj5, (as) obj, (InterfaceC0581m) obj2, ((Integer) obj3).intValue());
            case 14:
                return MediaPlayerRecyclerView.romeo((MediaPlayerRecyclerView) obj5, (String) obj, ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue());
            case 15:
                ((C2121A) obj5).purple.bravo(((m0.r) obj2).charlie);
                return Unit.INSTANCE;
            case 16:
                int intValue8 = ((Integer) obj).intValue();
                String argName = (String) obj2;
                aq navType = (aq) obj3;
                Intrinsics.echo(argName, "argName");
                Intrinsics.echo(navType, "navType");
                com.google.firebase.messaging.o oVar = (com.google.firebase.messaging.o) obj5;
                if (!(navType instanceof Y1.f) && !((KSerializer) oVar.bravo).getDescriptor().victor(intValue8)) {
                    enumC1581f = EnumC1581f.alpha;
                } else {
                    enumC1581f = EnumC1581f.purple;
                }
                int ordinal = enumC1581f.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        oVar.foxtrot(argName, "{" + argName + '}');
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    oVar.charlie = ((String) oVar.charlie) + '/' + AbstractC2327c.victor('}', "{", argName);
                }
                return Unit.INSTANCE;
            case 17:
                L padding = (L) obj;
                InterfaceC0581m interfaceC0581m8 = (InterfaceC0581m) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                Intrinsics.echo(padding, "padding");
                if ((intValue9 & 6) == 0) {
                    if (((C0585q) interfaceC0581m8).golf(padding)) {
                        i4 = 4;
                    }
                    intValue9 |= i4;
                }
                if ((intValue9 & 19) != 18) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                C0585q c0585q8 = (C0585q) interfaceC0581m8;
                if (c0585q8.magenta(intValue9 & 1, z18)) {
                    T.s tango = AbstractC0538d.tango(AbstractC0538d.romeo(pVar, padding).then(V.charlie), 12, 24);
                    C0554u alpha = AbstractC0553t.alpha(AbstractC0542h.golf(32), T.d.f2063g, c0585q8, 54);
                    long j5 = c0585q8.magenta;
                    int i5 = (int) (j5 ^ (j5 >>> 32));
                    I mike = c0585q8.mike();
                    T.s charlie = T.a.charlie(tango, c0585q8);
                    InterfaceC2552l.maroon.getClass();
                    C2550j c2550j = C2551k.bravo;
                    c0585q8.white();
                    if (c0585q8.lime) {
                        c0585q8.lima(c2550j);
                    } else {
                        c0585q8.i();
                    }
                    C2549i c2549i = C2551k.foxtrot;
                    C0564b.blue(c2549i, c0585q8, alpha);
                    C2549i c2549i2 = C2551k.echo;
                    C0564b.blue(c2549i2, c0585q8, mike);
                    C2549i c2549i3 = C2551k.golf;
                    if (c0585q8.lime || !Intrinsics.areEqual(c0585q8.jade(), Integer.valueOf(i5))) {
                        ao.ad.blue(i5, c0585q8, i5, c2549i3);
                    }
                    C2549i c2549i4 = C2551k.delta;
                    C0564b.blue(c2549i4, c0585q8, charlie);
                    String bravo = AbstractC3086y3.bravo(c0585q8, R.string.qr_code_heading);
                    long charlie2 = AbstractC2636d7.charlie(24);
                    H0.n nVar = Db.g.alpha;
                    G2.bravo(bravo, V.charlie(pVar, 1.0f), AbstractC1760c.alpha, charlie2, new H0.v(HttpConstants.HTTP_BLOCKED), nVar, 0L, new O0.k(3), 0L, 0, false, 0, 0, null, null, c0585q8, 200112, 0, 130448);
                    T.k kVar = T.d.teal;
                    Bitmap bitmap = (Bitmap) obj5;
                    if (bitmap != null) {
                        c0585q8.purple(-192120861);
                        C0352f c0352f = new C0352f(bitmap);
                        T.s lima = V.lima(pVar, 220, 213);
                        av avVar = C2391j.bravo;
                        boolean golf = c0585q8.golf(c0352f);
                        Object jade2 = c0585q8.jade();
                        if (golf || jade2 == obj4) {
                            jade2 = K0.alpha(c0352f, 1);
                            c0585q8.f(jade2);
                        }
                        W3.alpha((C1679a) jade2, null, lima, kVar, avVar, 1.0f, null, c0585q8, 432, 0);
                        c0585q8.quebec(false);
                    } else {
                        c0585q8.purple(-191872985);
                        long j6 = C0366t.delta;
                        a0.an anVar2 = ao.alpha;
                        T.s bravo2 = androidx.compose.foundation.a.bravo(R3.charlie(V.lima(pVar, 220, 213), 1, j6, anVar2), AbstractC1760c.delta, anVar2);
                        q0.ap delta = AbstractC0547m.delta(kVar, false);
                        long j7 = c0585q8.magenta;
                        int i10 = (int) (j7 ^ (j7 >>> 32));
                        I mike2 = c0585q8.mike();
                        T.s charlie3 = T.a.charlie(bravo2, c0585q8);
                        c0585q8.white();
                        if (c0585q8.lime) {
                            c0585q8.lima(c2550j);
                        } else {
                            c0585q8.i();
                        }
                        C0564b.blue(c2549i, c0585q8, delta);
                        C0564b.blue(c2549i2, c0585q8, mike2);
                        if (c0585q8.lime || !Intrinsics.areEqual(c0585q8.jade(), Integer.valueOf(i10))) {
                            ao.ad.blue(i10, c0585q8, i10, c2549i3);
                        }
                        C0564b.blue(c2549i4, c0585q8, charlie3);
                        G2.bravo(AbstractC3086y3.bravo(c0585q8, R.string.qr_code_preview_placeholder), null, C0366t.charlie, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q8, 384, 0, 131066);
                        c0585q8.quebec(true);
                        c0585q8.quebec(false);
                    }
                    G2.bravo(AbstractC3086y3.bravo(c0585q8, R.string.qr_code_description), V.charlie(pVar, 1.0f), AbstractC1760c.bravo, AbstractC2636d7.charlie(14), new H0.v(HttpConstants.HTTP_BLOCKED), nVar, 0L, new O0.k(3), 0L, 0, false, 0, 0, null, null, c0585q8, 200112, 0, 130448);
                    c0585q8.quebec(true);
                } else {
                    c0585q8.ochre();
                }
                return Unit.INSTANCE;
            case 18:
                Q0.a aVar = (Q0.a) obj3;
                long j10 = ((d0) obj5).foxtrot;
                long j11 = aVar.alpha;
                int juliet = Q0.a.juliet(j11);
                long j12 = aVar.alpha;
                AbstractC2367C victor = ((q0.ao) obj2).victor(Q0.a.alpha(j11, J4.delta((int) (j10 >> 32), juliet, Q0.a.hotel(j12)), 0, J4.delta((int) (j10 & 4294967295L), Q0.a.india(j12), Q0.a.golf(j12)), 0, 10));
                return ((ar) obj).papa(victor.alpha, victor.purple, kotlin.collections.t.alpha, new N2.t(victor, 9));
            case 19:
                Location location = (Location) obj;
                Function0 onInvalid = (Function0) obj2;
                Function0 onValid = (Function0) obj3;
                Intrinsics.echo(location, "location");
                Intrinsics.echo(onInvalid, "onInvalid");
                Intrinsics.echo(onValid, "onValid");
                M4 bravo3 = p3.ab.bravo((p3.ab) obj5, location, p3.ae.white);
                if (bravo3 instanceof g3.x) {
                    onInvalid.invoke();
                } else if (bravo3 instanceof g3.y) {
                    onValid.invoke();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.INSTANCE;
            case 20:
                AddressView$lambda$11$lambda$10 = AddressViewKt.AddressView$lambda$11$lambda$10((AddressComponent) obj5, (bx.aa) obj, (InterfaceC0581m) obj2, ((Integer) obj3).intValue());
                return AddressView$lambda$11$lambda$10;
            case 21:
                ((ad) obj5).invoke((Throwable) obj);
                return Unit.INSTANCE;
            default:
                int intValue10 = ((Integer) obj).intValue();
                int intValue11 = ((Integer) obj2).intValue();
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                C3230h c3230h = (C3230h) obj5;
                if (!booleanValue) {
                    intValue10 = c3230h.f14003b.transformedToOriginal(intValue10);
                }
                if (!booleanValue) {
                    intValue11 = c3230h.f14003b.transformedToOriginal(intValue11);
                }
                if (c3230h.yellow) {
                    long j13 = c3230h.silver.bravo;
                    int i11 = am.charlie;
                    if (intValue10 != ((int) (j13 >> 32)) || intValue11 != ((int) (j13 & 4294967295L))) {
                        if (Math.min(intValue10, intValue11) >= 0 && Math.max(intValue10, intValue11) <= c3230h.silver.alpha.purple.length()) {
                            if (!booleanValue && intValue10 != intValue11) {
                                c3230h.f14004c.juliet(true);
                            } else {
                                C3344D c3344d = c3230h.f14004c;
                                c3344d.uniform(false);
                                c3344d.romeo(n.am.alpha);
                            }
                            c3230h.teal.victor.invoke(new I0.aa(c3230h.silver.alpha, D0.ae.bravo(intValue10, intValue11), (am) null));
                            return Boolean.valueOf(z19);
                        }
                        C3344D c3344d2 = c3230h.f14004c;
                        c3344d2.uniform(false);
                        c3344d2.romeo(n.am.alpha);
                    }
                }
                z19 = false;
                return Boolean.valueOf(z19);
        }
    }
}
