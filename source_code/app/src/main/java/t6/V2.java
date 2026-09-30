package t6;

import android.content.Context;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.lifecycle.InterfaceC0651v;
import androidx.navigation.compose.BackStackEntryIdViewModel;
import delivery.samurai.android.AndroidApp;
import ge.InterfaceC1772d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p2.AbstractC2268a;
import s6.F7;

/* loaded from: classes2.dex */
public abstract class V2 {
    public static final void alpha(Y1.l lVar, R.e eVar, P.d dVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        int i11 = 2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(233973821);
        if (c0585q.india(lVar)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i12 = i5 | i4;
        if (c0585q.india(eVar)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        if (((i12 | i10) & 147) == 146 && c0585q.bronze()) {
            c0585q.ochre();
        } else {
            C0564b.bravo(new androidx.compose.runtime.O[]{U1.a.alpha.alpha(lVar), R1.e.alpha.alpha(lVar), AbstractC2268a.alpha.alpha(lVar)}, P.e.echo(1808964477, new P0.b(i11, eVar, dVar), c0585q), c0585q, 56);
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ac.n(lVar, eVar, dVar, i4, 6);
        }
    }

    public static final void bravo(R.e eVar, P.d dVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        T1.c cVar;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(832919318);
        if (c0585q.india(eVar)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i11 = i5 | i4;
        if (c0585q.india(dVar)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i12 = i11 | i10;
        if ((i12 & 19) == 18 && c0585q.bronze()) {
            c0585q.ochre();
        } else {
            Object jade = c0585q.jade();
            if (jade == C0580l.alpha) {
                jade = new X9.i(23);
                c0585q.f(jade);
            }
            Function1 function1 = (Function1) jade;
            androidx.lifecycle.d0 alpha = U1.a.alpha(c0585q);
            if (alpha != null) {
                kotlin.jvm.internal.v vVar = kotlin.jvm.internal.u.alpha;
                InterfaceC1772d bravo = vVar.bravo(BackStackEntryIdViewModel.class);
                Fe.t tVar = new Fe.t(1);
                tVar.alpha(vVar.bravo(BackStackEntryIdViewModel.class), function1);
                T1.d bravo2 = tVar.bravo();
                if (alpha instanceof InterfaceC0651v) {
                    cVar = ((InterfaceC0651v) alpha).getDefaultViewModelCreationExtras();
                } else {
                    cVar = T1.a.bravo;
                }
                BackStackEntryIdViewModel backStackEntryIdViewModel = (BackStackEntryIdViewModel) F7.bravo(bravo, alpha, null, bravo2, cVar, c0585q);
                backStackEntryIdViewModel.charlie = new androidx.core.widget.f(eVar);
                Object obj = backStackEntryIdViewModel.bravo;
                eVar.alpha(obj, dVar, c0585q, ((i12 << 6) & 896) | (i12 & 112));
            } else {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Cb.a(i4, 19, eVar, dVar);
        }
    }

    public static Context charlie() {
        Context applicationContext = delta().getApplicationContext();
        Intrinsics.delta(applicationContext, "getApplicationContext(...)");
        return applicationContext;
    }

    public static AndroidApp delta() {
        AndroidApp androidApp = AndroidApp.yellow;
        if (androidApp != null) {
            return androidApp;
        }
        Intrinsics.lima("instance");
        throw null;
    }
}
