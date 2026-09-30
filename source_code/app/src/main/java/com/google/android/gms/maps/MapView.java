package com.google.android.gms.maps;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import x6.s;

/* loaded from: classes2.dex */
public class MapView extends FrameLayout {
    public final s alpha;

    public MapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.alpha = new s(this, context, GoogleMapOptions.o(context, attributeSet));
        setClickable(true);
    }

    public MapView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, 0);
        this.alpha = new s(this, context, GoogleMapOptions.o(context, attributeSet));
        setClickable(true);
    }
}
