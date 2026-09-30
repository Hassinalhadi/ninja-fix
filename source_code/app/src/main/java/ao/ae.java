package ao;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes3.dex */
public class ae extends l implements SubMenu {

    /* renamed from: s, reason: collision with root package name */
    public final l f3182s;

    /* renamed from: t, reason: collision with root package name */
    public final n f3183t;

    public ae(Context context, l lVar, n nVar) {
        super(context);
        this.f3182s = lVar;
        this.f3183t = nVar;
    }

    @Override // ao.l
    public final boolean delta(n nVar) {
        return this.f3182s.delta(nVar);
    }

    @Override // ao.l
    public final boolean echo(l lVar, MenuItem menuItem) {
        if (!super.echo(lVar, menuItem) && !this.f3182s.echo(lVar, menuItem)) {
            return false;
        }
        return true;
    }

    @Override // ao.l
    public final boolean foxtrot(n nVar) {
        return this.f3182s.foxtrot(nVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f3183t;
    }

    @Override // ao.l
    public final String juliet() {
        int i4;
        n nVar = this.f3183t;
        if (nVar != null) {
            i4 = nVar.alpha;
        } else {
            i4 = 0;
        }
        if (i4 == 0) {
            return null;
        }
        return ad.zulu(i4, "android:menu:actionviewstates:");
    }

    @Override // ao.l
    public final l kilo() {
        return this.f3182s.kilo();
    }

    @Override // ao.l
    public final boolean mike() {
        return this.f3182s.mike();
    }

    @Override // ao.l
    public final boolean november() {
        return this.f3182s.november();
    }

    @Override // ao.l
    public final boolean oscar() {
        return this.f3182s.oscar();
    }

    @Override // ao.l, android.view.Menu
    public final void setGroupDividerEnabled(boolean z2) {
        this.f3182s.setGroupDividerEnabled(z2);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        uniform(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        uniform(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        uniform(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f3183t.setIcon(drawable);
        return this;
    }

    @Override // ao.l, android.view.Menu
    public final void setQwertyMode(boolean z2) {
        this.f3182s.setQwertyMode(z2);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i4) {
        uniform(0, null, i4, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i4) {
        uniform(i4, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i4) {
        this.f3183t.setIcon(i4);
        return this;
    }
}
