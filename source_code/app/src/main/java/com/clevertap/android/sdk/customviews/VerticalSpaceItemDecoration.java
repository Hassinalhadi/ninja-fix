package com.clevertap.android.sdk.customviews;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.I;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b0;

/* loaded from: classes3.dex */
public class VerticalSpaceItemDecoration extends I {
    private final int verticalSpaceHeight;

    public VerticalSpaceItemDecoration(int i4) {
        this.verticalSpaceHeight = i4;
    }

    @Override // androidx.recyclerview.widget.I
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, b0 b0Var) {
        rect.bottom = this.verticalSpaceHeight;
    }
}
