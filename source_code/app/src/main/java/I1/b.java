package I1;

import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.drawerlayout.widget.DrawerLayout;
import java.util.WeakHashMap;
import s1.C2569b;
import s1.au;
import t1.C2951c;
import t1.C2952d;

/* loaded from: classes3.dex */
public final class b extends C2569b {
    public final Rect delta = new Rect();
    public final /* synthetic */ DrawerLayout echo;

    public b(DrawerLayout drawerLayout) {
        this.echo = drawerLayout;
    }

    @Override // s1.C2569b
    public final boolean alpha(View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.getText();
            DrawerLayout drawerLayout = this.echo;
            View foxtrot = drawerLayout.foxtrot();
            if (foxtrot != null) {
                int hotel = drawerLayout.hotel(foxtrot);
                drawerLayout.getClass();
                WeakHashMap weakHashMap = au.alpha;
                Gravity.getAbsoluteGravity(hotel, drawerLayout.getLayoutDirection());
                return true;
            }
            return true;
        }
        return this.alpha.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // s1.C2569b
    public final void charlie(View view, AccessibilityEvent accessibilityEvent) {
        super.charlie(view, accessibilityEvent);
        accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
    }

    @Override // s1.C2569b
    public final void delta(View view, C2952d c2952d) {
        boolean z2 = DrawerLayout.f3083y;
        View.AccessibilityDelegate accessibilityDelegate = this.alpha;
        AccessibilityNodeInfo accessibilityNodeInfo = c2952d.alpha;
        if (z2) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        } else {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, obtain);
            c2952d.charlie = -1;
            accessibilityNodeInfo.setSource(view);
            WeakHashMap weakHashMap = au.alpha;
            Object parentForAccessibility = view.getParentForAccessibility();
            if (parentForAccessibility instanceof View) {
                c2952d.bravo = -1;
                accessibilityNodeInfo.setParent((View) parentForAccessibility);
            }
            Rect rect = this.delta;
            obtain.getBoundsInScreen(rect);
            c2952d.india(rect);
            accessibilityNodeInfo.setVisibleToUser(obtain.isVisibleToUser());
            accessibilityNodeInfo.setPackageName(obtain.getPackageName());
            c2952d.juliet(obtain.getClassName());
            accessibilityNodeInfo.setContentDescription(obtain.getContentDescription());
            accessibilityNodeInfo.setEnabled(obtain.isEnabled());
            accessibilityNodeInfo.setFocused(obtain.isFocused());
            accessibilityNodeInfo.setAccessibilityFocused(obtain.isAccessibilityFocused());
            accessibilityNodeInfo.setSelected(obtain.isSelected());
            c2952d.alpha(obtain.getActions());
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = viewGroup.getChildAt(i4);
                if (DrawerLayout.india(childAt)) {
                    accessibilityNodeInfo.addChild(childAt);
                }
            }
        }
        c2952d.juliet("androidx.drawerlayout.widget.DrawerLayout");
        accessibilityNodeInfo.setFocusable(false);
        accessibilityNodeInfo.setFocused(false);
        accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) C2951c.echo.alpha);
        accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) C2951c.foxtrot.alpha);
    }

    @Override // s1.C2569b
    public final boolean foxtrot(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        if (!DrawerLayout.f3083y && !DrawerLayout.india(view)) {
            return false;
        }
        return this.alpha.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }
}
