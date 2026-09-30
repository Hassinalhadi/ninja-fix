package ao;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* loaded from: classes3.dex */
public abstract class t implements ab, x, AdapterView.OnItemClickListener {
    public Rect alpha;

    public static int oscar(ListAdapter listAdapter, Context context, int i4) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i5 = 0;
        int i10 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i11 = 0; i11 < count; i11++) {
            int itemViewType = listAdapter.getItemViewType(i11);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i11, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i4) {
                return i4;
            }
            if (measuredWidth > i5) {
                i5 = measuredWidth;
            }
        }
        return i5;
    }

    public static boolean whiskey(l lVar) {
        int size = lVar.white.size();
        for (int i4 = 0; i4 < size; i4++) {
            MenuItem item = lVar.getItem(i4);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // ao.x
    public final void charlie(Context context, l lVar) {
    }

    @Override // ao.x
    public final boolean foxtrot(n nVar) {
        return false;
    }

    @Override // ao.x
    public final int getId() {
        return 0;
    }

    @Override // ao.x
    public final boolean kilo(n nVar) {
        return false;
    }

    public abstract void november(l lVar);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i4, long j5) {
        i iVar;
        int i5;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        if (listAdapter instanceof HeaderViewListAdapter) {
            iVar = (i) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        } else {
            iVar = (i) listAdapter;
        }
        l lVar = iVar.alpha;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i4);
        if (!(this instanceof f)) {
            i5 = 0;
        } else {
            i5 = 4;
        }
        lVar.quebec(menuItem, this, i5);
    }

    public abstract void papa(View view);

    public abstract void quebec(boolean z2);

    public abstract void romeo(int i4);

    public abstract void sierra(int i4);

    public abstract void tango(PopupWindow.OnDismissListener onDismissListener);

    public abstract void uniform(boolean z2);

    public abstract void victor(int i4);
}
