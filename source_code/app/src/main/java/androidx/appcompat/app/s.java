package androidx.appcompat.app;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
import s1.au;
import t6.AbstractC3082y;

/* loaded from: classes3.dex */
public final class s extends AbstractC3082y {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object bravo;

    public /* synthetic */ s(int i4, Object obj) {
        this.alpha = i4;
        this.bravo = obj;
    }

    @Override // s1.InterfaceC2566A
    public final void bravo() {
        Object obj = this.bravo;
        switch (this.alpha) {
            case 0:
                ab abVar = ((p) obj).purple;
                abVar.f2738o.setAlpha(1.0f);
                abVar.f2741r.delta(null);
                abVar.f2741r = null;
                return;
            case 1:
                ab abVar2 = (ab) obj;
                abVar2.f2738o.setAlpha(1.0f);
                abVar2.f2741r.delta(null);
                abVar2.f2741r = null;
                return;
            default:
                J2.e eVar = (J2.e) obj;
                ((ab) eVar.red).f2738o.setVisibility(8);
                ab abVar3 = (ab) eVar.red;
                PopupWindow popupWindow = abVar3.f2739p;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (abVar3.f2738o.getParent() instanceof View) {
                    View view = (View) abVar3.f2738o.getParent();
                    WeakHashMap weakHashMap = au.alpha;
                    s1.aj.charlie(view);
                }
                abVar3.f2738o.echo();
                abVar3.f2741r.delta(null);
                abVar3.f2741r = null;
                ViewGroup viewGroup = abVar3.f2743t;
                WeakHashMap weakHashMap2 = au.alpha;
                s1.aj.charlie(viewGroup);
                return;
        }
    }

    @Override // t6.AbstractC3082y, s1.InterfaceC2566A
    public void onAnimationStart() {
        Object obj = this.bravo;
        switch (this.alpha) {
            case 0:
                ((p) obj).purple.f2738o.setVisibility(0);
                return;
            case 1:
                ab abVar = (ab) obj;
                abVar.f2738o.setVisibility(0);
                if (abVar.f2738o.getParent() instanceof View) {
                    View view = (View) abVar.f2738o.getParent();
                    WeakHashMap weakHashMap = au.alpha;
                    s1.aj.charlie(view);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
