package s1;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import delivery.samurai.android.R;
import g.C1718a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import t1.C2951c;
import t1.C2952d;

/* renamed from: s1.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2568a extends View.AccessibilityDelegate {
    public final C2569b alpha;

    public C2568a(C2569b c2569b) {
        this.alpha = c2569b;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.alpha.alpha(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        C1718a bravo = this.alpha.bravo(view);
        if (bravo != null) {
            return (AccessibilityNodeProvider) bravo.purple;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.alpha.charlie(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        Object tag;
        boolean z2;
        Object tag2;
        boolean z10;
        Object tag3;
        int i4;
        C2952d c2952d = new C2952d(accessibilityNodeInfo);
        WeakHashMap weakHashMap = au.alpha;
        ClickableSpan[] clickableSpanArr = null;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = Boolean.valueOf(ap.charlie(view));
        } else {
            tag = view.getTag(R.id.tag_screen_reader_focusable);
            if (!Boolean.class.isInstance(tag)) {
                tag = null;
            }
        }
        Boolean bool = (Boolean) tag;
        int i5 = 0;
        if (bool != null && bool.booleanValue()) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            accessibilityNodeInfo.setScreenReaderFocusable(z2);
        } else {
            c2952d.hotel(1, z2);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            tag2 = Boolean.valueOf(ap.bravo(view));
        } else {
            tag2 = view.getTag(R.id.tag_accessibility_heading);
            if (!Boolean.class.isInstance(tag2)) {
                tag2 = null;
            }
        }
        Boolean bool2 = (Boolean) tag2;
        if (bool2 != null && bool2.booleanValue()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 >= 28) {
            accessibilityNodeInfo.setHeading(z10);
        } else {
            c2952d.hotel(2, z10);
        }
        CharSequence echo = au.echo(view);
        if (i10 >= 28) {
            accessibilityNodeInfo.setPaneTitle(echo);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", echo);
        }
        if (i10 >= 30) {
            tag3 = ar.bravo(view);
        } else {
            tag3 = view.getTag(R.id.tag_state_description);
            if (!CharSequence.class.isInstance(tag3)) {
                tag3 = null;
            }
        }
        CharSequence charSequence = (CharSequence) tag3;
        if (i10 >= 30) {
            bc.d.india(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
        this.alpha.delta(view, c2952d);
        CharSequence text = accessibilityNodeInfo.getText();
        if (i10 < 26) {
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                    if (((WeakReference) sparseArray.valueAt(i11)).get() == null) {
                        arrayList.add(Integer.valueOf(i11));
                    }
                }
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    sparseArray.remove(((Integer) arrayList.get(i12)).intValue());
                }
            }
            if (text instanceof Spanned) {
                clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
            }
            if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                accessibilityNodeInfo.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                SparseArray sparseArray2 = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    view.setTag(R.id.tag_accessibility_clickable_spans, sparseArray2);
                }
                int i13 = 0;
                while (i13 < clickableSpanArr.length) {
                    ClickableSpan clickableSpan = clickableSpanArr[i13];
                    int i14 = i5;
                    while (true) {
                        if (i14 < sparseArray2.size()) {
                            if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i14)).get())) {
                                i4 = sparseArray2.keyAt(i14);
                                break;
                            }
                            i14++;
                        } else {
                            i4 = C2952d.delta;
                            C2952d.delta = i4 + 1;
                            break;
                        }
                    }
                    sparseArray2.put(i4, new WeakReference(clickableSpanArr[i13]));
                    ClickableSpan clickableSpan2 = clickableSpanArr[i13];
                    Spanned spanned = (Spanned) text;
                    c2952d.charlie("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                    c2952d.charlie("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                    c2952d.charlie("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                    c2952d.charlie("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i4));
                    i13++;
                    i5 = 0;
                }
            }
        }
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i15 = 0; i15 < list.size(); i15++) {
            c2952d.bravo((C2951c) list.get(i15));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.alpha.echo(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.alpha.foxtrot(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i4, Bundle bundle) {
        return this.alpha.golf(view, i4, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i4) {
        this.alpha.hotel(view, i4);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.alpha.india(view, accessibilityEvent);
    }
}
