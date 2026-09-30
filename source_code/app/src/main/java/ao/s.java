package ao;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;
import l1.InterfaceMenuItemC2052a;

/* loaded from: classes3.dex */
public final class s extends K3.b implements MenuItem {
    public final InterfaceMenuItemC2052a silver;
    public Method teal;

    public s(Context context, InterfaceMenuItemC2052a interfaceMenuItemC2052a) {
        super(context);
        if (interfaceMenuItemC2052a != null) {
            this.silver = interfaceMenuItemC2052a;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return this.silver.collapseActionView();
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return this.silver.expandActionView();
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        o alpha = this.silver.alpha();
        if (alpha != null) {
            return alpha.bravo;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View actionView = this.silver.getActionView();
        if (actionView instanceof p) {
            return (View) ((p) actionView).alpha;
        }
        return actionView;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.silver.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.silver.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.silver.getContentDescription();
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.silver.getGroupId();
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.silver.getIcon();
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.silver.getIconTintList();
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.silver.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.silver.getIntent();
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.silver.getItemId();
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.silver.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.silver.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.silver.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.silver.getOrder();
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.silver.getSubMenu();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.silver.getTitle();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        return this.silver.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.silver.getTooltipText();
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.silver.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.silver.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return this.silver.isCheckable();
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return this.silver.isChecked();
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return this.silver.isEnabled();
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return this.silver.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        o oVar = new o(this, actionProvider);
        if (actionProvider == null) {
            oVar = null;
        }
        this.silver.bravo(oVar);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new p(view);
        }
        this.silver.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c3) {
        this.silver.setAlphabeticShortcut(c3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        this.silver.setCheckable(z2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        this.silver.setChecked(z2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.silver.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z2) {
        this.silver.setEnabled(z2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.silver.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.silver.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.silver.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.silver.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c3) {
        this.silver.setNumericShortcut(c3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        q qVar;
        if (onActionExpandListener != null) {
            qVar = new q(this, onActionExpandListener);
        } else {
            qVar = null;
        }
        this.silver.setOnActionExpandListener(qVar);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        r rVar;
        if (onMenuItemClickListener != null) {
            rVar = new r(this, onMenuItemClickListener);
        } else {
            rVar = null;
        }
        this.silver.setOnMenuItemClickListener(rVar);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c3, char c4) {
        this.silver.setShortcut(c3, c4);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i4) {
        this.silver.setShowAsAction(i4);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i4) {
        this.silver.setShowAsActionFlags(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.silver.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.silver.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.silver.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        return this.silver.setVisible(z2);
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c3, int i4) {
        this.silver.setAlphabeticShortcut(c3, i4);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i4) {
        this.silver.setIcon(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c3, int i4) {
        this.silver.setNumericShortcut(c3, i4);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c3, char c4, int i4, int i5) {
        this.silver.setShortcut(c3, c4, i4, i5);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i4) {
        this.silver.setTitle(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i4) {
        InterfaceMenuItemC2052a interfaceMenuItemC2052a = this.silver;
        interfaceMenuItemC2052a.setActionView(i4);
        View actionView = interfaceMenuItemC2052a.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            interfaceMenuItemC2052a.setActionView(new p(actionView));
        }
        return this;
    }
}
