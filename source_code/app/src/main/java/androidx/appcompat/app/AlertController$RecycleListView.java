package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;

/* loaded from: classes3.dex */
public class AlertController$RecycleListView extends ListView {
    public final int alpha;
    public final int purple;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aj.a.uniform);
        this.purple = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.alpha = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
