package l1;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import ao.o;

/* renamed from: l1.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceMenuItemC2052a extends MenuItem {
    o alpha();

    InterfaceMenuItemC2052a bravo(o oVar);

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    CharSequence getContentDescription();

    @Override // android.view.MenuItem
    ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    CharSequence getTooltipText();

    @Override // android.view.MenuItem
    MenuItem setAlphabeticShortcut(char c3, int i4);

    @Override // android.view.MenuItem
    InterfaceMenuItemC2052a setContentDescription(CharSequence charSequence);

    @Override // android.view.MenuItem
    MenuItem setIconTintList(ColorStateList colorStateList);

    @Override // android.view.MenuItem
    MenuItem setIconTintMode(PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    MenuItem setNumericShortcut(char c3, int i4);

    @Override // android.view.MenuItem
    MenuItem setShortcut(char c3, char c4, int i4, int i5);

    @Override // android.view.MenuItem
    InterfaceMenuItemC2052a setTooltipText(CharSequence charSequence);
}
