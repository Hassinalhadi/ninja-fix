package androidx.appcompat.app;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;
import s1.au;
import t6.AbstractC3082y;

/* loaded from: classes3.dex */
public final class an extends AbstractC3082y {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ ap bravo;

    public /* synthetic */ an(ap apVar, int i4) {
        this.alpha = i4;
        this.bravo = apVar;
    }

    @Override // s1.InterfaceC2566A
    public final void bravo() {
        View view;
        ap apVar = this.bravo;
        switch (this.alpha) {
            case 0:
                if (apVar.oscar && (view = apVar.golf) != null) {
                    view.setTranslationY(0.0f);
                    apVar.delta.setTranslationY(0.0f);
                }
                apVar.delta.setVisibility(8);
                apVar.delta.setTransitioning(false);
                apVar.tango = null;
                J2.e eVar = apVar.kilo;
                if (eVar != null) {
                    eVar.i(apVar.juliet);
                    apVar.juliet = null;
                    apVar.kilo = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = apVar.charlie;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = au.alpha;
                    s1.aj.charlie(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                apVar.tango = null;
                apVar.delta.requestLayout();
                return;
        }
    }
}
