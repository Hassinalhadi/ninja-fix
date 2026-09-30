package ao;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import bv.aw;
import l1.InterfaceMenuItemC2052a;

/* loaded from: classes3.dex */
public class aa extends K3.b implements Menu {
    public final l silver;

    public aa(Context context, l lVar) {
        super(context);
        if (lVar != null) {
            this.silver = lVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return india(this.silver.alpha(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i4, int i5, int i10, ComponentName componentName, Intent[] intentArr, Intent intent, int i11, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2;
        if (menuItemArr != null) {
            menuItemArr2 = new MenuItem[menuItemArr.length];
        } else {
            menuItemArr2 = null;
        }
        MenuItem[] menuItemArr3 = menuItemArr2;
        int addIntentOptions = this.silver.addIntentOptions(i4, i5, i10, componentName, intentArr, intent, i11, menuItemArr3);
        if (menuItemArr3 != null) {
            int length = menuItemArr3.length;
            for (int i12 = 0; i12 < length; i12++) {
                menuItemArr[i12] = india(menuItemArr3[i12]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.silver.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        aw awVar = (aw) this.red;
        if (awVar != null) {
            awVar.clear();
        }
        this.silver.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.silver.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i4) {
        return india(this.silver.findItem(i4));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i4) {
        return india(this.silver.getItem(i4));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.silver.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i4, KeyEvent keyEvent) {
        return this.silver.isShortcutKey(i4, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i4, int i5) {
        return this.silver.performIdentifierAction(i4, i5);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i4, KeyEvent keyEvent, int i5) {
        return this.silver.performShortcut(i4, keyEvent, i5);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i4) {
        if (((aw) this.red) != null) {
            int i5 = 0;
            while (true) {
                aw awVar = (aw) this.red;
                if (i5 >= awVar.red) {
                    break;
                }
                if (((InterfaceMenuItemC2052a) awVar.foxtrot(i5)).getGroupId() == i4) {
                    ((aw) this.red).hotel(i5);
                    i5--;
                }
                i5++;
            }
        }
        this.silver.removeGroup(i4);
    }

    @Override // android.view.Menu
    public final void removeItem(int i4) {
        if (((aw) this.red) != null) {
            int i5 = 0;
            while (true) {
                aw awVar = (aw) this.red;
                if (i5 >= awVar.red) {
                    break;
                }
                if (((InterfaceMenuItemC2052a) awVar.foxtrot(i5)).getItemId() == i4) {
                    ((aw) this.red).hotel(i5);
                    break;
                }
                i5++;
            }
        }
        this.silver.removeItem(i4);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i4, boolean z2, boolean z10) {
        this.silver.setGroupCheckable(i4, z2, z10);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i4, boolean z2) {
        this.silver.setGroupEnabled(i4, z2);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i4, boolean z2) {
        this.silver.setGroupVisible(i4, z2);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z2) {
        this.silver.setQwertyMode(z2);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.silver.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i4) {
        return this.silver.addSubMenu(i4);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i4) {
        return india(this.silver.add(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i4, int i5, int i10, CharSequence charSequence) {
        return this.silver.addSubMenu(i4, i5, i10, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i4, int i5, int i10, CharSequence charSequence) {
        return india(this.silver.alpha(i4, i5, i10, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i4, int i5, int i10, int i11) {
        return this.silver.addSubMenu(i4, i5, i10, i11);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i4, int i5, int i10, int i11) {
        return india(this.silver.add(i4, i5, i10, i11));
    }
}
