package Vc;

import F.G1;
import T.s;
import a0.C0366t;
import a0.an;
import a0.ao;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.D0;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.compose.runtime.as;
import androidx.compose.runtime.ax;
import ao.ad;
import com.app.network.network.models.PaymentSession;
import delivery.samurai.android.ui.wallet.WalletViewModel;
import i.AbstractC1876y;
import i.C1874w;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import q0.ap;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2717m7;

/* loaded from: classes2.dex */
public abstract class r {
    public static final long alpha = ao.delta(4294638330L);
    public static final /* synthetic */ int bravo = 0;

    public static final void alpha(WalletViewModel walletViewModel, s sVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        as asVar;
        boolean z10;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-904364756);
        if (c0585q.india(walletViewModel)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i10 = i5 | i4 | 48;
        if ((i10 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i10 & 1, z2)) {
            T.p pVar = T.p.alpha;
            ax bravo2 = AbstractC2717m7.bravo(walletViewModel.delta, c0585q, 0);
            ax bravo3 = AbstractC2717m7.bravo(walletViewModel.foxtrot, c0585q, 0);
            C1874w alpha2 = AbstractC1876y.alpha(c0585q);
            Unit unit = Unit.INSTANCE;
            boolean india = c0585q.india(walletViewModel);
            Object jade = c0585q.jade();
            as asVar2 = C0580l.alpha;
            if (india || jade == asVar2) {
                jade = new p(walletViewModel, null);
                c0585q.f(jade);
            }
            C0564b.foxtrot((Xd.l) jade, c0585q, unit);
            Object jade2 = c0585q.jade();
            if (jade2 == asVar2) {
                jade2 = C0564b.quebec(new Ac.g(24, alpha2, bravo2));
                c0585q.f(jade2);
            }
            D0 d02 = (D0) jade2;
            Boolean bool = (Boolean) d02.getValue();
            bool.booleanValue();
            boolean india2 = c0585q.india(walletViewModel);
            Object jade3 = c0585q.jade();
            if (india2 || jade3 == asVar2) {
                jade3 = new q(walletViewModel, d02, null);
                c0585q.f(jade3);
            }
            C0564b.foxtrot((Xd.l) jade3, c0585q, bool);
            boolean z11 = ((Tc.m) bravo2.getValue()) instanceof Tc.k;
            boolean india3 = c0585q.india(walletViewModel);
            Object jade4 = c0585q.jade();
            if (india3 || jade4 == asVar2) {
                jade4 = new n(walletViewModel, 1);
                c0585q.f(jade4);
            }
            FillElement fillElement = V.charlie;
            an anVar = ao.alpha;
            sVar = pVar;
            G.l.alpha(z11, (Function0) jade4, androidx.compose.foundation.a.bravo(fillElement, alpha, anVar), null, null, null, P.e.echo(1232952594, new o(alpha2, walletViewModel, bravo2, 0), c0585q), c0585q, 1572864);
            if (((Tc.i) bravo3.getValue()) instanceof Tc.f) {
                c0585q.purple(406130891);
                s bravo4 = androidx.compose.foundation.a.bravo(fillElement, C0366t.bravo(0.3f, C0366t.bravo), anVar);
                Object jade5 = c0585q.jade();
                if (jade5 == asVar2) {
                    jade5 = new i(2);
                    c0585q.f(jade5);
                }
                s echo = androidx.compose.foundation.a.echo(14, bravo4, null, (Function0) jade5, false);
                ap delta = AbstractC0547m.delta(T.d.teal, false);
                long j5 = c0585q.magenta;
                int i11 = (int) (j5 ^ (j5 >>> 32));
                I mike = c0585q.mike();
                s charlie = T.a.charlie(echo, c0585q);
                InterfaceC2552l.maroon.getClass();
                C2550j c2550j = C2551k.bravo;
                c0585q.white();
                if (c0585q.lime) {
                    c0585q.lima(c2550j);
                } else {
                    c0585q.i();
                }
                C0564b.blue(C2551k.foxtrot, c0585q, delta);
                C0564b.blue(C2551k.echo, c0585q, mike);
                C2549i c2549i = C2551k.golf;
                if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i11))) {
                    ad.blue(i11, c0585q, i11, c2549i);
                }
                C0564b.blue(C2551k.delta, c0585q, charlie);
                asVar = asVar2;
                G1.bravo(null, C0366t.echo, 0.0f, 0L, 0, c0585q, 48, 29);
                c0585q.quebec(true);
                z10 = false;
            } else {
                asVar = asVar2;
                z10 = false;
                c0585q.purple(397258102);
            }
            c0585q.quebec(z10);
            Tc.i iVar = (Tc.i) bravo3.getValue();
            if (iVar instanceof Tc.g) {
                c0585q.purple(406622489);
                Tc.g gVar = (Tc.g) iVar;
                PaymentSession paymentSession = gVar.bravo;
                String str = gVar.charlie;
                String str2 = gVar.delta;
                boolean india4 = c0585q.india(walletViewModel) | c0585q.golf(iVar);
                Object jade6 = c0585q.jade();
                if (india4 || jade6 == asVar) {
                    jade6 = new Ac.g(25, walletViewModel, (Tc.g) iVar);
                    c0585q.f(jade6);
                }
                Function0 function0 = (Function0) jade6;
                boolean india5 = c0585q.india(walletViewModel);
                Object jade7 = c0585q.jade();
                if (india5 || jade7 == asVar) {
                    jade7 = new n(walletViewModel, 2);
                    c0585q.f(jade7);
                }
                Function0 function02 = (Function0) jade7;
                boolean india6 = c0585q.india(walletViewModel);
                Object jade8 = c0585q.jade();
                if (india6 || jade8 == asVar) {
                    jade8 = new n(walletViewModel, 3);
                    c0585q.f(jade8);
                }
                c.bravo(paymentSession, gVar.alpha, str, str2, function0, function02, (Function0) jade8, c0585q, 0);
                c0585q = c0585q;
                c0585q.quebec(false);
            } else if (iVar instanceof Tc.h) {
                c0585q.purple(407159440);
                boolean india7 = c0585q.india(walletViewModel);
                Object jade9 = c0585q.jade();
                if (india7 || jade9 == asVar) {
                    jade9 = new n(walletViewModel, 4);
                    c0585q.f(jade9);
                }
                c.charlie(true, (Function0) jade9, c0585q, 6);
                c0585q.quebec(false);
            } else if (iVar instanceof Tc.d) {
                c0585q.purple(407424955);
                boolean india8 = c0585q.india(walletViewModel);
                Object jade10 = c0585q.jade();
                if (india8 || jade10 == asVar) {
                    jade10 = new n(walletViewModel, 5);
                    c0585q.f(jade10);
                }
                c.charlie(false, (Function0) jade10, c0585q, 6);
                c0585q.quebec(false);
            } else {
                c0585q.purple(407590836);
                c0585q.quebec(false);
            }
        } else {
            c0585q.ochre();
        }
        s sVar2 = sVar;
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Cb.a(i4, 14, walletViewModel, sVar2);
        }
    }
}
