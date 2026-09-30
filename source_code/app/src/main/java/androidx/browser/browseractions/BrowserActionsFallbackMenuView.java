package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import delivery.samurai.android.R;

@Deprecated
/* loaded from: classes3.dex */
public class BrowserActionsFallbackMenuView extends LinearLayout {
    public final int alpha;
    public final int purple;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.alpha = getResources().getDimensionPixelOffset(R.dimen.browser_actions_context_menu_min_padding);
        this.purple = getResources().getDimensionPixelOffset(R.dimen.browser_actions_context_menu_max_width);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.alpha * 2), this.purple), 1073741824), i5);
    }
}
