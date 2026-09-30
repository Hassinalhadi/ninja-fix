package I1;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import androidx.drawerlayout.widget.DrawerLayout;
import s1.C2569b;
import t1.C2951c;
import t1.C2952d;

/* loaded from: classes3.dex */
public final class c extends C2569b {
    public final /* synthetic */ int delta;

    public /* synthetic */ c(int i4) {
        this.delta = i4;
    }

    @Override // s1.C2569b
    public void charlie(View view, AccessibilityEvent accessibilityEvent) {
        boolean z2;
        switch (this.delta) {
            case 1:
                super.charlie(view, accessibilityEvent);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityEvent.setClassName(ScrollView.class.getName());
                if (nestedScrollView.getScrollRange() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                accessibilityEvent.setScrollable(z2);
                accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
                accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
                return;
            default:
                super.charlie(view, accessibilityEvent);
                return;
        }
    }

    @Override // s1.C2569b
    public final void delta(View view, C2952d c2952d) {
        int scrollRange;
        switch (this.delta) {
            case 0:
                View.AccessibilityDelegate accessibilityDelegate = this.alpha;
                AccessibilityNodeInfo accessibilityNodeInfo = c2952d.alpha;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                if (!DrawerLayout.india(view)) {
                    c2952d.bravo = -1;
                    accessibilityNodeInfo.setParent(null);
                    return;
                }
                return;
            case 1:
                this.alpha.onInitializeAccessibilityNodeInfo(view, c2952d.alpha);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                c2952d.juliet(ScrollView.class.getName());
                if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                    c2952d.mike(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        c2952d.bravo(C2951c.kilo);
                        c2952d.bravo(C2951c.oscar);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        c2952d.bravo(C2951c.juliet);
                        c2952d.bravo(C2951c.quebec);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                this.alpha.onInitializeAccessibilityNodeInfo(view, c2952d.alpha);
                c2952d.kilo(null);
                return;
            case 3:
                this.alpha.onInitializeAccessibilityNodeInfo(view, c2952d.alpha);
                c2952d.mike(false);
                return;
            case 4:
                this.alpha.onInitializeAccessibilityNodeInfo(view, c2952d.alpha);
                c2952d.kilo(null);
                return;
            default:
                View.AccessibilityDelegate accessibilityDelegate2 = this.alpha;
                AccessibilityNodeInfo accessibilityNodeInfo2 = c2952d.alpha;
                accessibilityDelegate2.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setVisibleToUser(false);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        if (r6 != 16908346) goto L32;
     */
    @Override // s1.C2569b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean golf(View view, int i4, Bundle bundle) {
        switch (this.delta) {
            case 1:
                if (super.golf(view, i4, bundle)) {
                    return true;
                }
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                if (nestedScrollView.isEnabled()) {
                    int height = nestedScrollView.getHeight();
                    Rect rect = new Rect();
                    if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                        height = rect.height();
                    }
                    if (i4 != 4096) {
                        if (i4 != 8192 && i4 != 16908344) {
                            break;
                        } else {
                            int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                            if (max != nestedScrollView.getScrollY()) {
                                nestedScrollView.papa(0 - nestedScrollView.getScrollX(), max - nestedScrollView.getScrollY(), true);
                                return true;
                            }
                        }
                    }
                    int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                    if (min != nestedScrollView.getScrollY()) {
                        nestedScrollView.papa(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), true);
                        return true;
                    }
                }
                return false;
            default:
                return super.golf(view, i4, bundle);
        }
    }
}
