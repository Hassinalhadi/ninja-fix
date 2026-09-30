package ae;

import android.util.Log;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.C0644n;
import androidx.navigation.fragment.FragmentNavigator;
import java.util.List;
import s1.C2581n;
import s1.InterfaceC2582o;
import vf.I;
import yf.N;

/* renamed from: ae.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0428g implements androidx.lifecycle.aj {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;

    public /* synthetic */ C0428g(int i4, Object obj, Object obj2) {
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
    }

    @Override // androidx.lifecycle.aj
    public final void onStateChanged(androidx.lifecycle.al alVar, androidx.lifecycle.aa aaVar) {
        switch (this.alpha) {
            case 0:
                if (aaVar == androidx.lifecycle.aa.ON_CREATE) {
                    OnBackInvokedDispatcher alpha = U0.o.alpha((o) this.red);
                    ai aiVar = (ai) this.purple;
                    aiVar.echo = alpha;
                    aiVar.echo(aiVar.golf);
                    return;
                }
                return;
            case 1:
                androidx.lifecycle.ab bravo = alVar.getLifecycle().bravo();
                androidx.lifecycle.ab abVar = androidx.lifecycle.ab.alpha;
                androidx.lifecycle.ad adVar = (androidx.lifecycle.ad) this.purple;
                if (bravo == abVar) {
                    ((I) this.red).foxtrot(null);
                    adVar.alpha();
                    return;
                }
                androidx.lifecycle.ab bravo2 = alVar.getLifecycle().bravo();
                adVar.getClass();
                int compareTo = bravo2.compareTo(androidx.lifecycle.ab.silver);
                C0644n c0644n = adVar.bravo;
                if (compareTo < 0) {
                    c0644n.alpha = true;
                    return;
                } else {
                    if (c0644n.alpha) {
                        if (!c0644n.bravo) {
                            c0644n.alpha = false;
                            c0644n.alpha();
                            return;
                        }
                        throw new IllegalStateException("Cannot resume a finished dispatcher");
                    }
                    return;
                }
            case 2:
                androidx.lifecycle.aa aaVar2 = androidx.lifecycle.aa.ON_RESUME;
                FragmentNavigator fragmentNavigator = (FragmentNavigator) this.purple;
                Y1.l lVar = (Y1.l) this.red;
                if (aaVar == aaVar2 && ((List) ((N) fragmentNavigator.bravo().echo.alpha).getValue()).contains(lVar)) {
                    if (FragmentNavigator.november()) {
                        Log.v("FragmentNavigator", "Marking transition complete for entry " + lVar + " due to fragment " + alVar + " view lifecycle reaching RESUMED");
                    }
                    fragmentNavigator.bravo().charlie(lVar);
                }
                if (aaVar == androidx.lifecycle.aa.ON_DESTROY) {
                    fragmentNavigator.getClass();
                    if (FragmentNavigator.november()) {
                        Log.v("FragmentNavigator", "Marking transition complete for entry " + lVar + " due to fragment " + alVar + " view lifecycle reaching DESTROYED");
                    }
                    fragmentNavigator.bravo().charlie(lVar);
                    return;
                }
                return;
            default:
                C2581n c2581n = (C2581n) this.purple;
                c2581n.getClass();
                if (aaVar == androidx.lifecycle.aa.ON_DESTROY) {
                    c2581n.bravo((InterfaceC2582o) this.red);
                    return;
                }
                return;
        }
    }
}
