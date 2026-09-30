package ao;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import l1.InterfaceMenuItemC2052a;

/* loaded from: classes3.dex */
public final class a implements InterfaceMenuItemC2052a {

    /* renamed from: a, reason: collision with root package name */
    public Drawable f3162a;
    public CharSequence alpha;

    /* renamed from: b, reason: collision with root package name */
    public Context f3163b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f3164c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f3165d;
    public ColorStateList e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f3166f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3167g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3168h;

    /* renamed from: i, reason: collision with root package name */
    public int f3169i;
    public CharSequence purple;
    public Intent red;
    public char silver;
    public int teal;
    public char white;
    public int yellow;

    @Override // l1.InterfaceMenuItemC2052a
    public final o alpha() {
        return null;
    }

    @Override // l1.InterfaceMenuItemC2052a
    public final InterfaceMenuItemC2052a bravo(o oVar) {
        throw new UnsupportedOperationException();
    }

    public final void charlie() {
        Drawable drawable = this.f3162a;
        if (drawable != null) {
            if (this.f3167g || this.f3168h) {
                this.f3162a = drawable;
                Drawable mutate = drawable.mutate();
                this.f3162a = mutate;
                if (this.f3167g) {
                    mutate.setTintList(this.e);
                }
                if (this.f3168h) {
                    this.f3162a.setTintMode(this.f3166f);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // l1.InterfaceMenuItemC2052a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.yellow;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.white;
    }

    @Override // l1.InterfaceMenuItemC2052a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f3164c;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f3162a;
    }

    @Override // l1.InterfaceMenuItemC2052a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.e;
    }

    @Override // l1.InterfaceMenuItemC2052a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f3166f;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.red;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // l1.InterfaceMenuItemC2052a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.teal;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.silver;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.alpha;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.purple;
        if (charSequence != null) {
            return charSequence;
        }
        return this.alpha;
    }

    @Override // l1.InterfaceMenuItemC2052a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f3165d;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        if ((this.f3169i & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        if ((this.f3169i & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        if ((this.f3169i & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        if ((this.f3169i & 8) == 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c3) {
        this.white = Character.toLowerCase(c3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        this.f3169i = (z2 ? 1 : 0) | (this.f3169i & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        int i4;
        int i5 = this.f3169i & (-3);
        if (z2) {
            i4 = 2;
        } else {
            i4 = 0;
        }
        this.f3169i = i4 | i5;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f3164c = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z2) {
        int i4;
        int i5 = this.f3169i & (-17);
        if (z2) {
            i4 = 16;
        } else {
            i4 = 0;
        }
        this.f3169i = i4 | i5;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f3162a = drawable;
        charlie();
        return this;
    }

    @Override // l1.InterfaceMenuItemC2052a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.e = colorStateList;
        this.f3167g = true;
        charlie();
        return this;
    }

    @Override // l1.InterfaceMenuItemC2052a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f3166f = mode;
        this.f3168h = true;
        charlie();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.red = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c3) {
        this.silver = c3;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c3, char c4) {
        this.silver = c3;
        this.white = Character.toLowerCase(c4);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i4) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i4) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.alpha = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.purple = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f3165d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        int i4 = 8;
        int i5 = this.f3169i & 8;
        if (z2) {
            i4 = 0;
        }
        this.f3169i = i5 | i4;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i4) {
        throw new UnsupportedOperationException();
    }

    @Override // l1.InterfaceMenuItemC2052a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c3, int i4) {
        this.white = Character.toLowerCase(c3);
        this.yellow = KeyEvent.normalizeMetaState(i4);
        return this;
    }

    @Override // l1.InterfaceMenuItemC2052a, android.view.MenuItem
    public final InterfaceMenuItemC2052a setContentDescription(CharSequence charSequence) {
        this.f3164c = charSequence;
        return this;
    }

    @Override // l1.InterfaceMenuItemC2052a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c3, int i4) {
        this.silver = c3;
        this.teal = KeyEvent.normalizeMetaState(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i4) {
        this.alpha = this.f3163b.getResources().getString(i4);
        return this;
    }

    @Override // l1.InterfaceMenuItemC2052a, android.view.MenuItem
    public final InterfaceMenuItemC2052a setTooltipText(CharSequence charSequence) {
        this.f3165d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i4) {
        this.f3162a = this.f3163b.getDrawable(i4);
        charlie();
        return this;
    }

    @Override // l1.InterfaceMenuItemC2052a, android.view.MenuItem
    public final MenuItem setShortcut(char c3, char c4, int i4, int i5) {
        this.silver = c3;
        this.teal = KeyEvent.normalizeMetaState(i4);
        this.white = Character.toLowerCase(c4);
        this.yellow = KeyEvent.normalizeMetaState(i5);
        return this;
    }
}
