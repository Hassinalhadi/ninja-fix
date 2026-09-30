package com.google.android.material.button;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.datepicker.r;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import delivery.samurai.android.R;
import i7.AbstractC1900f;
import i7.C1901g;
import s1.C2569b;
import s1.C2576i;
import t1.C2951c;
import t1.C2952d;

/* loaded from: classes2.dex */
public final class e extends C2569b {
    public final /* synthetic */ int delta;
    public final /* synthetic */ Object echo;

    public /* synthetic */ e(int i4, Object obj) {
        this.delta = i4;
        this.echo = obj;
    }

    @Override // s1.C2569b
    public void charlie(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.delta) {
            case 2:
                super.charlie(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.echo).silver);
                return;
            default:
                super.charlie(view, accessibilityEvent);
                return;
        }
    }

    @Override // s1.C2569b
    public final void delta(View view, C2952d c2952d) {
        int i4;
        String string;
        Object obj = this.echo;
        View.AccessibilityDelegate accessibilityDelegate = this.alpha;
        switch (this.delta) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c2952d.alpha);
                int i5 = MaterialButtonToggleGroup.f7927j;
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                if (view instanceof MaterialButton) {
                    i4 = 0;
                    for (int i10 = 0; i10 < materialButtonToggleGroup.getChildCount(); i10++) {
                        if (materialButtonToggleGroup.getChildAt(i10) != view) {
                            if ((materialButtonToggleGroup.getChildAt(i10) instanceof MaterialButton) && materialButtonToggleGroup.getChildAt(i10).getVisibility() != 8) {
                                i4++;
                            }
                        } else {
                            c2952d.lima(C2576i.hotel(0, 1, i4, 1, false, ((MaterialButton) view).f7910h));
                            return;
                        }
                    }
                }
                i4 = -1;
                c2952d.lima(C2576i.hotel(0, 1, i4, 1, false, ((MaterialButton) view).f7910h));
                return;
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c2952d.alpha);
                r rVar = (r) obj;
                if (rVar.f7992g.getVisibility() == 0) {
                    string = rVar.getString(R.string.mtrl_picker_toggle_to_year_selection);
                } else {
                    string = rVar.getString(R.string.mtrl_picker_toggle_to_day_selection);
                }
                c2952d.bravo(new C2951c(16, string));
                return;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo = c2952d.alpha;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo.setCheckable(checkableImageButton.teal);
                accessibilityNodeInfo.setChecked(checkableImageButton.silver);
                return;
            case 3:
                AccessibilityNodeInfo accessibilityNodeInfo2 = c2952d.alpha;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setCheckable(((NavigationMenuItemView) obj).f8043b);
                return;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo3 = c2952d.alpha;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                c2952d.alpha(1048576);
                accessibilityNodeInfo3.setDismissable(true);
                return;
        }
    }

    @Override // s1.C2569b
    public boolean golf(View view, int i4, Bundle bundle) {
        switch (this.delta) {
            case 4:
                if (i4 == 1048576) {
                    ((C1901g) ((AbstractC1900f) this.echo)).alpha(3);
                    return true;
                }
                return super.golf(view, i4, bundle);
            default:
                return super.golf(view, i4, bundle);
        }
    }
}
