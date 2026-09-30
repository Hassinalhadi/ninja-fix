package androidx.viewpager.widget;

import android.database.DataSetObserver;

/* loaded from: classes3.dex */
public final class j extends DataSetObserver {
    public final /* synthetic */ ViewPager alpha;

    public j(ViewPager viewPager) {
        this.alpha = viewPager;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.alpha.dataSetChanged();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.alpha.dataSetChanged();
    }
}
