package androidx.appcompat.widget;

import android.view.MenuItem;
import java.util.Iterator;
import s1.InterfaceC2582o;

/* loaded from: classes3.dex */
public final class X0 implements r, ao.j {
    public final /* synthetic */ Toolbar alpha;

    public /* synthetic */ X0(Toolbar toolbar) {
        this.alpha = toolbar;
    }

    @Override // ao.j
    public void coral(ao.l lVar) {
        Toolbar toolbar = this.alpha;
        C0469n c0469n = toolbar.alpha.teal;
        if (c0469n == null || !c0469n.juliet()) {
            Iterator it = toolbar.f2859z.bravo.iterator();
            while (it.hasNext()) {
                ((androidx.fragment.app.az) ((InterfaceC2582o) it.next())).alpha.tango(lVar);
            }
        }
        O7.j jVar = toolbar.f2829H;
        if (jVar != null) {
            jVar.coral(lVar);
        }
    }

    @Override // ao.j
    public boolean sierra(ao.l lVar, MenuItem menuItem) {
        O7.j jVar = this.alpha.f2829H;
        return false;
    }
}
