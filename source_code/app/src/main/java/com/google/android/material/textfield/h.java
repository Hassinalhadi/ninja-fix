package com.google.android.material.textfield;

import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import l3.AbstractC2056a;
import t0.ad;

/* loaded from: classes2.dex */
public final /* synthetic */ class h implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object bravo;

    public /* synthetic */ h(int i4, Object obj) {
        this.alpha = i4;
        this.bravo = obj;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z2) {
        int i4;
        switch (this.alpha) {
            case 0:
                i iVar = (i) this.bravo;
                AutoCompleteTextView autoCompleteTextView = iVar.hotel;
                if (autoCompleteTextView != null && !AbstractC2056a.bravo(autoCompleteTextView)) {
                    if (z2) {
                        i4 = 2;
                    } else {
                        i4 = 1;
                    }
                    iVar.delta.setImportantForAccessibility(i4);
                    return;
                }
                return;
            default:
                ad adVar = (ad) this.bravo;
                adVar.kilo = adVar.golf.getEnabledAccessibilityServiceList(-1);
                return;
        }
    }
}
