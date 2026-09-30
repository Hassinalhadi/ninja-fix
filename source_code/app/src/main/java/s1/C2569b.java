package s1;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import delivery.samurai.android.R;
import g.C1718a;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import t1.C2951c;
import t1.C2952d;

/* renamed from: s1.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2569b {
    public static final View.AccessibilityDelegate charlie = new View.AccessibilityDelegate();
    public final View.AccessibilityDelegate alpha;
    public final C2568a bravo;

    public C2569b() {
        this(charlie);
    }

    public boolean alpha(View view, AccessibilityEvent accessibilityEvent) {
        return this.alpha.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public C1718a bravo(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.alpha.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C1718a(29, accessibilityNodeProvider);
        }
        return null;
    }

    public void charlie(View view, AccessibilityEvent accessibilityEvent) {
        this.alpha.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void delta(View view, C2952d c2952d) {
        this.alpha.onInitializeAccessibilityNodeInfo(view, c2952d.alpha);
    }

    public void echo(View view, AccessibilityEvent accessibilityEvent) {
        this.alpha.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean foxtrot(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.alpha.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean golf(View view, int i4, Bundle bundle) {
        ClickableSpan[] clickableSpanArr;
        boolean z2;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        boolean z10 = false;
        int i5 = 0;
        while (true) {
            clickableSpanArr = null;
            if (i5 >= list.size()) {
                break;
            }
            C2951c c2951c = (C2951c) list.get(i5);
            if (c2951c.alpha() == i4) {
                t1.n nVar = c2951c.delta;
                if (nVar != null) {
                    Class cls = c2951c.charlie;
                    if (cls != null) {
                        try {
                            if (cls.getDeclaredConstructor(null).newInstance(null) == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        } catch (Exception e) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e);
                        }
                    }
                    z2 = nVar.charlie(view);
                }
            } else {
                i5++;
            }
        }
        z2 = false;
        if (!z2) {
            z2 = this.alpha.performAccessibilityAction(view, i4, bundle);
        }
        if (!z2 && i4 == R.id.accessibility_action_clickable_span && bundle != null) {
            int i10 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i10)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
                CharSequence text = view.createAccessibilityNodeInfo().getText();
                if (text instanceof Spanned) {
                    clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                }
                int i11 = 0;
                while (true) {
                    if (clickableSpanArr == null || i11 >= clickableSpanArr.length) {
                        break;
                    }
                    if (clickableSpan.equals(clickableSpanArr[i11])) {
                        clickableSpan.onClick(view);
                        z10 = true;
                        break;
                    }
                    i11++;
                }
            }
            return z10;
        }
        return z2;
    }

    public void hotel(View view, int i4) {
        this.alpha.sendAccessibilityEvent(view, i4);
    }

    public void india(View view, AccessibilityEvent accessibilityEvent) {
        this.alpha.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C2569b(View.AccessibilityDelegate accessibilityDelegate) {
        this.alpha = accessibilityDelegate;
        this.bravo = new C2568a(this);
    }
}
