package ao;

import android.view.MenuItem;

/* loaded from: classes3.dex */
public final class r implements MenuItem.OnMenuItemClickListener {
    public final MenuItem.OnMenuItemClickListener alpha;
    public final /* synthetic */ s bravo;

    public r(s sVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.bravo = sVar;
        this.alpha = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.alpha.onMenuItemClick(this.bravo.india(menuItem));
    }
}
