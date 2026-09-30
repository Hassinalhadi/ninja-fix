package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public class NavigationMenuView extends RecyclerView implements ao.z {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager(1, false));
    }

    @Override // ao.z
    public final void alpha(ao.l lVar) {
    }

    public int getWindowAnimations() {
        return 0;
    }
}
