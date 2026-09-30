package androidx.viewpager.widget;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import s1.C2569b;
import t1.C2952d;

/* loaded from: classes3.dex */
public final class f extends C2569b {
    public final /* synthetic */ ViewPager delta;

    public f(ViewPager viewPager) {
        this.delta = viewPager;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r0.getCount() > 1) goto L8;
     */
    @Override // s1.C2569b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void charlie(View view, AccessibilityEvent accessibilityEvent) {
        boolean z2;
        a aVar;
        super.charlie(view, accessibilityEvent);
        accessibilityEvent.setClassName(ViewPager.class.getName());
        ViewPager viewPager = this.delta;
        a aVar2 = viewPager.mAdapter;
        if (aVar2 != null) {
            z2 = true;
        }
        z2 = false;
        accessibilityEvent.setScrollable(z2);
        if (accessibilityEvent.getEventType() == 4096 && (aVar = viewPager.mAdapter) != null) {
            accessibilityEvent.setItemCount(aVar.getCount());
            accessibilityEvent.setFromIndex(viewPager.mCurItem);
            accessibilityEvent.setToIndex(viewPager.mCurItem);
        }
    }

    @Override // s1.C2569b
    public final void delta(View view, C2952d c2952d) {
        boolean z2;
        this.alpha.onInitializeAccessibilityNodeInfo(view, c2952d.alpha);
        c2952d.juliet(ViewPager.class.getName());
        ViewPager viewPager = this.delta;
        a aVar = viewPager.mAdapter;
        if (aVar != null && aVar.getCount() > 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        c2952d.mike(z2);
        if (viewPager.canScrollHorizontally(1)) {
            c2952d.alpha(4096);
        }
        if (viewPager.canScrollHorizontally(-1)) {
            c2952d.alpha(8192);
        }
    }

    @Override // s1.C2569b
    public final boolean golf(View view, int i4, Bundle bundle) {
        if (super.golf(view, i4, bundle)) {
            return true;
        }
        ViewPager viewPager = this.delta;
        if (i4 != 4096) {
            if (i4 != 8192 || !viewPager.canScrollHorizontally(-1)) {
                return false;
            }
            viewPager.setCurrentItem(viewPager.mCurItem - 1);
            return true;
        }
        if (!viewPager.canScrollHorizontally(1)) {
            return false;
        }
        viewPager.setCurrentItem(viewPager.mCurItem + 1);
        return true;
    }
}
