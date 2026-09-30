package androidx.appcompat.widget;

import android.database.DataSetObserver;
import com.google.android.material.tabs.TabLayout;

/* renamed from: androidx.appcompat.widget.i0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0460i0 extends DataSetObserver {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object bravo;

    public /* synthetic */ C0460i0(int i4, Object obj) {
        this.alpha = i4;
        this.bravo = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.alpha) {
            case 0:
                C0466l0 c0466l0 = (C0466l0) this.bravo;
                if (c0466l0.f2900s.isShowing()) {
                    c0466l0.golf();
                    return;
                }
                return;
            case 1:
                ((TabLayout) this.bravo).juliet();
                return;
            default:
                R0 r02 = (R0) this.bravo;
                r02.alpha = true;
                r02.notifyDataSetChanged();
                return;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.alpha) {
            case 0:
                ((C0466l0) this.bravo).dismiss();
                return;
            case 1:
                ((TabLayout) this.bravo).juliet();
                return;
            default:
                R0 r02 = (R0) this.bravo;
                r02.alpha = false;
                r02.notifyDataSetInvalidated();
                return;
        }
    }
}
