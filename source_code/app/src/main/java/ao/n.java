package ao;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import l1.InterfaceMenuItemC2052a;
import t6.AbstractC3032n3;

/* loaded from: classes3.dex */
public final class n implements InterfaceMenuItemC2052a {

    /* renamed from: a, reason: collision with root package name */
    public char f3219a;
    public final int alpha;

    /* renamed from: c, reason: collision with root package name */
    public char f3221c;
    public Drawable e;

    /* renamed from: g, reason: collision with root package name */
    public final l f3224g;

    /* renamed from: h, reason: collision with root package name */
    public ae f3225h;

    /* renamed from: i, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f3226i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f3227j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f3228k;
    public final int purple;

    /* renamed from: r, reason: collision with root package name */
    public int f3235r;
    public final int red;

    /* renamed from: s, reason: collision with root package name */
    public View f3236s;
    public final int silver;

    /* renamed from: t, reason: collision with root package name */
    public o f3237t;
    public CharSequence teal;

    /* renamed from: u, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f3238u;
    public CharSequence white;
    public Intent yellow;

    /* renamed from: b, reason: collision with root package name */
    public int f3220b = 4096;

    /* renamed from: d, reason: collision with root package name */
    public int f3222d = 4096;

    /* renamed from: f, reason: collision with root package name */
    public int f3223f = 0;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f3229l = null;

    /* renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f3230m = null;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3231n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3232o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3233p = false;

    /* renamed from: q, reason: collision with root package name */
    public int f3234q = 16;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3239v = false;

    public n(l lVar, int i4, int i5, int i10, int i11, CharSequence charSequence, int i12) {
        this.f3224g = lVar;
        this.alpha = i5;
        this.purple = i4;
        this.red = i10;
        this.silver = i11;
        this.teal = charSequence;
        this.f3235r = i12;
    }

    public static void charlie(int i4, int i5, String str, StringBuilder sb2) {
        if ((i4 & i5) == i5) {
            sb2.append(str);
        }
    }

    @Override // l1.InterfaceMenuItemC2052a
    public final o alpha() {
        return this.f3237t;
    }

    @Override // l1.InterfaceMenuItemC2052a
    public final InterfaceMenuItemC2052a bravo(o oVar) {
        this.f3236s = null;
        this.f3237t = oVar;
        this.f3224g.papa(true);
        o oVar2 = this.f3237t;
        if (oVar2 != null) {
            oVar2.alpha = new O7.l(28, this);
            oVar2.bravo.setVisibilityListener(oVar2);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f3235r & 8) == 0) {
            return false;
        }
        if (this.f3236s == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f3238u;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.f3224g.delta(this);
    }

    public final Drawable delta(Drawable drawable) {
        if (drawable != null && this.f3233p && (this.f3231n || this.f3232o)) {
            drawable = drawable.mutate();
            if (this.f3231n) {
                drawable.setTintList(this.f3229l);
            }
            if (this.f3232o) {
                drawable.setTintMode(this.f3230m);
            }
            this.f3233p = false;
        }
        return drawable;
    }

    public final boolean echo() {
        o oVar;
        if ((this.f3235r & 8) != 0) {
            if (this.f3236s == null && (oVar = this.f3237t) != null) {
                this.f3236s = oVar.bravo.onCreateActionView(this);
            }
            if (this.f3236s != null) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (echo()) {
            MenuItem.OnActionExpandListener onActionExpandListener = this.f3238u;
            if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionExpand(this)) {
                return false;
            }
            return this.f3224g.foxtrot(this);
        }
        return false;
    }

    public final void foxtrot(boolean z2) {
        int i4;
        int i5 = this.f3234q & (-5);
        if (z2) {
            i4 = 4;
        } else {
            i4 = 0;
        }
        this.f3234q = i4 | i5;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f3236s;
        if (view != null) {
            return view;
        }
        o oVar = this.f3237t;
        if (oVar != null) {
            View onCreateActionView = oVar.bravo.onCreateActionView(this);
            this.f3236s = onCreateActionView;
            return onCreateActionView;
        }
        return null;
    }

    @Override // l1.InterfaceMenuItemC2052a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f3222d;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f3221c;
    }

    @Override // l1.InterfaceMenuItemC2052a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f3227j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.purple;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return delta(drawable);
        }
        int i4 = this.f3223f;
        if (i4 != 0) {
            Drawable echo = AbstractC3032n3.echo(i4, this.f3224g.alpha);
            this.f3223f = 0;
            this.e = echo;
            return delta(echo);
        }
        return null;
    }

    @Override // l1.InterfaceMenuItemC2052a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f3229l;
    }

    @Override // l1.InterfaceMenuItemC2052a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f3230m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.yellow;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.alpha;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // l1.InterfaceMenuItemC2052a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f3220b;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f3219a;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.red;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f3225h;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.teal;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.white;
        if (charSequence != null) {
            return charSequence;
        }
        return this.teal;
    }

    @Override // l1.InterfaceMenuItemC2052a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f3228k;
    }

    public final void golf(boolean z2) {
        if (z2) {
            this.f3234q |= 32;
        } else {
            this.f3234q &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        if (this.f3225h != null) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f3239v;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        if ((this.f3234q & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        if ((this.f3234q & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        if ((this.f3234q & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        o oVar = this.f3237t;
        if (oVar != null && oVar.bravo.overridesItemVisibility()) {
            if ((this.f3234q & 8) != 0 || !this.f3237t.bravo.isVisible()) {
                return false;
            }
            return true;
        }
        if ((this.f3234q & 8) != 0) {
            return false;
        }
        return true;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i4;
        this.f3236s = view;
        this.f3237t = null;
        if (view != null && view.getId() == -1 && (i4 = this.alpha) > 0) {
            view.setId(i4);
        }
        l lVar = this.f3224g;
        lVar.f3206d = true;
        lVar.papa(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c3) {
        if (this.f3221c == c3) {
            return this;
        }
        this.f3221c = Character.toLowerCase(c3);
        this.f3224g.papa(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        int i4 = this.f3234q;
        int i5 = (z2 ? 1 : 0) | (i4 & (-2));
        this.f3234q = i5;
        if (i4 != i5) {
            this.f3224g.papa(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        boolean z10;
        int i4;
        int i5 = this.f3234q;
        int i10 = 2;
        if ((i5 & 4) != 0) {
            l lVar = this.f3224g;
            lVar.getClass();
            ArrayList arrayList = lVar.white;
            int size = arrayList.size();
            lVar.whiskey();
            for (int i11 = 0; i11 < size; i11++) {
                n nVar = (n) arrayList.get(i11);
                if (nVar.purple == this.purple && (nVar.f3234q & 4) != 0 && nVar.isCheckable()) {
                    if (nVar == this) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int i12 = nVar.f3234q;
                    int i13 = i12 & (-3);
                    if (z10) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    int i14 = i4 | i13;
                    nVar.f3234q = i14;
                    if (i12 != i14) {
                        nVar.f3224g.papa(false);
                    }
                }
            }
            lVar.victor();
            return this;
        }
        int i15 = i5 & (-3);
        if (!z2) {
            i10 = 0;
        }
        int i16 = i15 | i10;
        this.f3234q = i16;
        if (i5 != i16) {
            this.f3224g.papa(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z2) {
        if (z2) {
            this.f3234q |= 16;
        } else {
            this.f3234q &= -17;
        }
        this.f3224g.papa(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f3223f = 0;
        this.e = drawable;
        this.f3233p = true;
        this.f3224g.papa(false);
        return this;
    }

    @Override // l1.InterfaceMenuItemC2052a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f3229l = colorStateList;
        this.f3231n = true;
        this.f3233p = true;
        this.f3224g.papa(false);
        return this;
    }

    @Override // l1.InterfaceMenuItemC2052a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f3230m = mode;
        this.f3232o = true;
        this.f3233p = true;
        this.f3224g.papa(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.yellow = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c3) {
        if (this.f3219a == c3) {
            return this;
        }
        this.f3219a = c3;
        this.f3224g.papa(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f3238u = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f3226i = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c3, char c4) {
        this.f3219a = c3;
        this.f3221c = Character.toLowerCase(c4);
        this.f3224g.papa(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i4) {
        int i5 = i4 & 3;
        if (i5 != 0 && i5 != 1 && i5 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f3235r = i4;
        l lVar = this.f3224g;
        lVar.f3206d = true;
        lVar.papa(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i4) {
        setShowAsAction(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.teal = charSequence;
        this.f3224g.papa(false);
        ae aeVar = this.f3225h;
        if (aeVar != null) {
            aeVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.white = charSequence;
        this.f3224g.papa(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        int i4;
        int i5 = this.f3234q;
        int i10 = i5 & (-9);
        if (z2) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        int i11 = i4 | i10;
        this.f3234q = i11;
        if (i5 != i11) {
            l lVar = this.f3224g;
            lVar.f3203a = true;
            lVar.papa(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.teal;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // l1.InterfaceMenuItemC2052a, android.view.MenuItem
    public final InterfaceMenuItemC2052a setContentDescription(CharSequence charSequence) {
        this.f3227j = charSequence;
        this.f3224g.papa(false);
        return this;
    }

    @Override // l1.InterfaceMenuItemC2052a, android.view.MenuItem
    public final InterfaceMenuItemC2052a setTooltipText(CharSequence charSequence) {
        this.f3228k = charSequence;
        this.f3224g.papa(false);
        return this;
    }

    @Override // l1.InterfaceMenuItemC2052a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c3, int i4) {
        if (this.f3221c == c3 && this.f3222d == i4) {
            return this;
        }
        this.f3221c = Character.toLowerCase(c3);
        this.f3222d = KeyEvent.normalizeMetaState(i4);
        this.f3224g.papa(false);
        return this;
    }

    @Override // l1.InterfaceMenuItemC2052a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c3, int i4) {
        if (this.f3219a == c3 && this.f3220b == i4) {
            return this;
        }
        this.f3219a = c3;
        this.f3220b = KeyEvent.normalizeMetaState(i4);
        this.f3224g.papa(false);
        return this;
    }

    @Override // l1.InterfaceMenuItemC2052a, android.view.MenuItem
    public final MenuItem setShortcut(char c3, char c4, int i4, int i5) {
        this.f3219a = c3;
        this.f3220b = KeyEvent.normalizeMetaState(i4);
        this.f3221c = Character.toLowerCase(c4);
        this.f3222d = KeyEvent.normalizeMetaState(i5);
        this.f3224g.papa(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i4) {
        this.e = null;
        this.f3223f = i4;
        this.f3233p = true;
        this.f3224g.papa(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i4) {
        setTitle(this.f3224g.alpha.getString(i4));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i4) {
        int i5;
        Context context = this.f3224g.alpha;
        View inflate = LayoutInflater.from(context).inflate(i4, (ViewGroup) new LinearLayout(context), false);
        this.f3236s = inflate;
        this.f3237t = null;
        if (inflate != null && inflate.getId() == -1 && (i5 = this.alpha) > 0) {
            inflate.setId(i5);
        }
        l lVar = this.f3224g;
        lVar.f3206d = true;
        lVar.papa(true);
        return this;
    }
}
