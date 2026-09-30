package Cb;

import Jb.C0196d;
import Jb.C0208p;
import a2.C0383h;
import a2.C0385j;
import android.content.Context;
import android.view.View;
import androidx.compose.foundation.layout.b0;
import androidx.compose.foundation.lazy.layout.ar;
import androidx.compose.runtime.D0;
import androidx.compose.runtime.ax;
import androidx.compose.runtime.t0;
import androidx.fragment.app.C0606a;
import androidx.fragment.app.L;
import androidx.fragment.app.ai;
import androidx.lifecycle.az;
import bz.T;
import bz.U;
import bz.X;
import bz.a0;
import bz.aj;
import delivery.samurai.android.ui.allocation.OrdersViewModel;
import f.C1674k;
import f.C1675l;
import f.C1676m;
import f.InterfaceC1673j;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function1;
import n.h0;
import s1.C2579l;
import s1.al;
import s1.au;
import t0.ap;
import t0.aq;

/* loaded from: classes2.dex */
public final class af implements androidx.compose.runtime.af {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object bravo;
    public final /* synthetic */ Object charlie;

    public /* synthetic */ af(int i4, Object obj, Object obj2) {
        this.alpha = i4;
        this.bravo = obj;
        this.charlie = obj2;
    }

    @Override // androidx.compose.runtime.af
    public final void dispose() {
        Object obj = this.bravo;
        Object obj2 = this.charlie;
        switch (this.alpha) {
            case 0:
                L l10 = (L) obj;
                ai blue = l10.blue((String) obj2);
                if (blue != null && !l10.jade()) {
                    C0606a c0606a = new C0606a(l10);
                    c0606a.mike(blue);
                    c0606a.juliet(true, true);
                    return;
                }
                return;
            case 1:
                ((C0208p) obj).kilo().oscar().removeObserver((C0196d) obj2);
                return;
            case 2:
                ((OrdersViewModel) obj).golf.removeObserver((C0196d) obj2);
                return;
            case 3:
                ((az) obj).removeObserver((C0196d) obj2);
                return;
            case 4:
                ((az) obj).removeObserver((C0196d) obj2);
                return;
            case 5:
                ((Y1.l) obj).f2268a.kilo.charlie((C0385j) obj2);
                return;
            case 6:
                Iterator it = ((List) ((D0) obj).getValue()).iterator();
                while (it.hasNext()) {
                    ((C0383h) obj2).bravo().charlie((Y1.l) it.next());
                }
                return;
            case 7:
                b0 b0Var = (b0) obj;
                int i4 = b0Var.uniform - 1;
                b0Var.uniform = i4;
                if (i4 == 0) {
                    WeakHashMap weakHashMap = au.alpha;
                    View view = (View) obj2;
                    al.lima(view, null);
                    au.papa(view, null);
                    view.removeOnAttachStateChangeListener(b0Var.victor);
                    return;
                }
                return;
            case 8:
                ((ar) obj).red.kilo(obj2);
                return;
            case 9:
                ((aj) obj).alpha.lima((bz.ag) obj2);
                return;
            case 10:
                ((a0) obj).juliet.remove((a0) obj2);
                return;
            case 11:
                a0 a0Var = (a0) obj;
                a0Var.getClass();
                T t5 = (T) ((t0) ((U) obj2).bravo).getValue();
                if (t5 != null) {
                    a0Var.india.remove(t5.alpha);
                    return;
                }
                return;
            case 12:
                ((a0) obj).india.remove((X) obj2);
                return;
            case 13:
                ax axVar = (ax) obj;
                C1676m c1676m = (C1676m) axVar.getValue();
                if (c1676m != null) {
                    C1675l c1675l = new C1675l(c1676m);
                    InterfaceC1673j interfaceC1673j = (InterfaceC1673j) obj2;
                    if (interfaceC1673j != null) {
                        ((C1674k) interfaceC1673j).bravo(c1675l);
                    }
                    axVar.setValue(null);
                    return;
                }
                return;
            case 14:
                ((h0) obj).charlie.remove((Function1) obj2);
                return;
            case 15:
                ((Context) obj).getApplicationContext().unregisterComponentCallbacks((ap) obj2);
                return;
            case 16:
                ((Context) obj).getApplicationContext().unregisterComponentCallbacks((aq) obj2);
                return;
            default:
                ((androidx.lifecycle.ac) obj).charlie((C2579l) obj2);
                return;
        }
    }
}
