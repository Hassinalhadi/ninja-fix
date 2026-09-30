package androidx.appcompat.widget;

import android.view.MenuItem;

/* renamed from: androidx.appcompat.widget.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0465l implements ao.w, ao.j, E {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ C0465l(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    private final void foxtrot(ao.l lVar) {
    }

    public void alpha(int i4) {
    }

    @Override // ao.w
    public void bravo(ao.l lVar, boolean z2) {
        if (lVar instanceof ao.ae) {
            ((ao.ae) lVar).f3182s.kilo().charlie(false);
        }
        ao.w wVar = ((C0469n) this.purple).teal;
        if (wVar != null) {
            wVar.bravo(lVar, z2);
        }
    }

    public void charlie(int i4) {
    }

    @Override // ao.j
    public void coral(ao.l lVar) {
        switch (this.alpha) {
            case 1:
                ao.j jVar = ((ActionMenuView) this.purple).yellow;
                if (jVar != null) {
                    jVar.coral(lVar);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void delta(int i4, float f5) {
    }

    @Override // ao.w
    public boolean echo(ao.l lVar) {
        C0469n c0469n = (C0469n) this.purple;
        if (lVar == c0469n.red) {
            return false;
        }
        c0469n.f2917r = ((ao.ae) lVar).f3183t.alpha;
        ao.w wVar = c0469n.teal;
        if (wVar == null) {
            return false;
        }
        return wVar.echo(lVar);
    }

    @Override // ao.j
    public boolean sierra(ao.l lVar, MenuItem menuItem) {
        boolean z2;
        switch (this.alpha) {
            case 1:
                r rVar = ((ActionMenuView) this.purple).e;
                if (rVar == null) {
                    return false;
                }
                Toolbar toolbar = ((X0) rVar).alpha;
                if (toolbar.f2859z.alpha(menuItem)) {
                    z2 = true;
                } else {
                    b1 b1Var = toolbar.B;
                    if (b1Var != null) {
                        z2 = ((androidx.appcompat.app.aj) b1Var).alpha.bravo.alpha.onMenuItemSelected(0, menuItem);
                    } else {
                        z2 = false;
                    }
                }
                if (!z2) {
                    return false;
                }
                return true;
            default:
                InterfaceC0479s0 interfaceC0479s0 = ((C0481t0) this.purple).delta;
                if (interfaceC0479s0 != null) {
                    return interfaceC0479s0.onMenuItemClick(menuItem);
                }
                return false;
        }
    }
}
