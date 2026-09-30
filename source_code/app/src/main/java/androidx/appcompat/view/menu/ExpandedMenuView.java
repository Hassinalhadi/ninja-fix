package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import ao.k;
import ao.l;
import ao.n;
import ao.z;
import id.C1915c;

/* loaded from: classes3.dex */
public final class ExpandedMenuView extends ListView implements k, z, AdapterView.OnItemClickListener {
    public static final int[] purple = {R.attr.background, R.attr.divider};
    public l alpha;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C1915c victor = C1915c.victor(context, attributeSet, purple, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) victor.red;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(victor.oscar(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(victor.oscar(1));
        }
        victor.xray();
    }

    @Override // ao.z
    public final void alpha(l lVar) {
        this.alpha = lVar;
    }

    @Override // ao.k
    public final boolean bravo(n nVar) {
        return this.alpha.quebec(nVar, null, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i4, long j5) {
        bravo((n) getAdapter().getItem(i4));
    }
}
