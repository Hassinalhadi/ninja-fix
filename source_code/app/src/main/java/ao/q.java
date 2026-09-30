package ao;

import android.view.MenuItem;

/* loaded from: classes3.dex */
public final class q implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener alpha;
    public final /* synthetic */ s bravo;

    public q(s sVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.bravo = sVar;
        this.alpha = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.alpha.onMenuItemActionCollapse(this.bravo.india(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.alpha.onMenuItemActionExpand(this.bravo.india(menuItem));
    }
}
