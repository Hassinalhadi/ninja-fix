package androidx.appcompat.app;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.C0469n;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.Z0;
import androidx.appcompat.widget.e1;
import java.util.ArrayList;
import java.util.WeakHashMap;
import s1.au;

/* loaded from: classes3.dex */
public final class ak extends a {
    public final e1 alpha;
    public final w bravo;
    public final aj charlie;
    public boolean delta;
    public boolean echo;
    public boolean foxtrot;
    public final ArrayList golf = new ArrayList();
    public final F6.b hotel = new F6.b(10, this);

    public ak(Toolbar toolbar, CharSequence charSequence, w wVar) {
        aj ajVar = new aj(this);
        e1 e1Var = new e1(toolbar, false);
        this.alpha = e1Var;
        wVar.getClass();
        this.bravo = wVar;
        e1Var.kilo = wVar;
        toolbar.setOnMenuItemClickListener(ajVar);
        if (!e1Var.golf) {
            e1Var.hotel = charSequence;
            if ((e1Var.bravo & 8) != 0) {
                Toolbar toolbar2 = e1Var.alpha;
                toolbar2.setTitle(charSequence);
                if (e1Var.golf) {
                    au.oscar(toolbar2.getRootView(), charSequence);
                }
            }
        }
        this.charlie = new aj(this);
    }

    @Override // androidx.appcompat.app.a
    public final boolean alpha() {
        C0469n c0469n;
        ActionMenuView actionMenuView = this.alpha.alpha.alpha;
        if (actionMenuView != null && (c0469n = actionMenuView.teal) != null && c0469n.golf()) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.a
    public final boolean bravo() {
        ao.n nVar;
        Z0 z02 = this.alpha.alpha.f2827F;
        if (z02 != null && (nVar = z02.purple) != null) {
            if (z02 == null) {
                nVar = null;
            }
            if (nVar != null) {
                nVar.collapseActionView();
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.a
    public final void charlie(boolean z2) {
        if (z2 != this.foxtrot) {
            this.foxtrot = z2;
            ArrayList arrayList = this.golf;
            if (arrayList.size() <= 0) {
                return;
            }
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    @Override // androidx.appcompat.app.a
    public final int delta() {
        return this.alpha.bravo;
    }

    @Override // androidx.appcompat.app.a
    public final Context echo() {
        return this.alpha.alpha.getContext();
    }

    @Override // androidx.appcompat.app.a
    public final void foxtrot() {
        this.alpha.alpha.setVisibility(8);
    }

    @Override // androidx.appcompat.app.a
    public final boolean golf() {
        e1 e1Var = this.alpha;
        Toolbar toolbar = e1Var.alpha;
        F6.b bVar = this.hotel;
        toolbar.removeCallbacks(bVar);
        Toolbar toolbar2 = e1Var.alpha;
        WeakHashMap weakHashMap = au.alpha;
        toolbar2.postOnAnimation(bVar);
        return true;
    }

    @Override // androidx.appcompat.app.a
    public final void hotel() {
    }

    @Override // androidx.appcompat.app.a
    public final void india() {
        this.alpha.alpha.removeCallbacks(this.hotel);
    }

    @Override // androidx.appcompat.app.a
    public final boolean juliet(int i4, KeyEvent keyEvent) {
        Menu xray = xray();
        if (xray == null) {
            return false;
        }
        boolean z2 = true;
        if (KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() == 1) {
            z2 = false;
        }
        xray.setQwertyMode(z2);
        return xray.performShortcut(i4, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.a
    public final boolean kilo(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            lima();
        }
        return true;
    }

    @Override // androidx.appcompat.app.a
    public final boolean lima() {
        return this.alpha.alpha.uniform();
    }

    @Override // androidx.appcompat.app.a
    public final void mike(ColorDrawable colorDrawable) {
        this.alpha.alpha.setBackground(colorDrawable);
    }

    @Override // androidx.appcompat.app.a
    public final void november(boolean z2) {
    }

    @Override // androidx.appcompat.app.a
    public final void oscar(boolean z2) {
        int i4;
        if (z2) {
            i4 = 4;
        } else {
            i4 = 0;
        }
        e1 e1Var = this.alpha;
        e1Var.alpha((i4 & 4) | (e1Var.bravo & (-5)));
    }

    @Override // androidx.appcompat.app.a
    public final void papa(boolean z2) {
        int i4;
        if (z2) {
            i4 = 2;
        } else {
            i4 = 0;
        }
        e1 e1Var = this.alpha;
        e1Var.alpha((i4 & 2) | (e1Var.bravo & (-3)));
    }

    @Override // androidx.appcompat.app.a
    public final void quebec(int i4) {
        this.alpha.bravo(i4);
    }

    @Override // androidx.appcompat.app.a
    public final void romeo(Drawable drawable) {
        e1 e1Var = this.alpha;
        e1Var.foxtrot = drawable;
        int i4 = e1Var.bravo & 4;
        Toolbar toolbar = e1Var.alpha;
        if (i4 != 0) {
            if (drawable == null) {
                drawable = e1Var.oscar;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        toolbar.setNavigationIcon((Drawable) null);
    }

    @Override // androidx.appcompat.app.a
    public final void sierra(boolean z2) {
    }

    @Override // androidx.appcompat.app.a
    public final void tango(CharSequence charSequence) {
        e1 e1Var = this.alpha;
        e1Var.golf = true;
        e1Var.hotel = charSequence;
        if ((e1Var.bravo & 8) != 0) {
            Toolbar toolbar = e1Var.alpha;
            toolbar.setTitle(charSequence);
            if (e1Var.golf) {
                au.oscar(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // androidx.appcompat.app.a
    public final void uniform(CharSequence charSequence) {
        e1 e1Var = this.alpha;
        if (!e1Var.golf) {
            e1Var.hotel = charSequence;
            if ((e1Var.bravo & 8) != 0) {
                Toolbar toolbar = e1Var.alpha;
                toolbar.setTitle(charSequence);
                if (e1Var.golf) {
                    au.oscar(toolbar.getRootView(), charSequence);
                }
            }
        }
    }

    @Override // androidx.appcompat.app.a
    public final void victor() {
        this.alpha.alpha.setVisibility(0);
    }

    public final Menu xray() {
        boolean z2 = this.echo;
        e1 e1Var = this.alpha;
        if (!z2) {
            Pf.j jVar = new Pf.j((Object) this, 2, false);
            O7.j jVar2 = new O7.j(21, this);
            Toolbar toolbar = e1Var.alpha;
            toolbar.f2828G = jVar;
            toolbar.f2829H = jVar2;
            ActionMenuView actionMenuView = toolbar.alpha;
            if (actionMenuView != null) {
                actionMenuView.white = jVar;
                actionMenuView.yellow = jVar2;
            }
            this.echo = true;
        }
        return e1Var.alpha.getMenu();
    }
}
