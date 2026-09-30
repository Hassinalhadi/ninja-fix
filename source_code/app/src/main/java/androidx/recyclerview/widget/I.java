package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;

/* loaded from: classes3.dex */
public abstract class I {
    @Deprecated
    public void getItemOffsets(Rect rect, int i4, RecyclerView recyclerView) {
        rect.set(0, 0, 0, 0);
    }

    @Deprecated
    public void onDraw(Canvas canvas, RecyclerView recyclerView) {
    }

    @Deprecated
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView) {
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, b0 b0Var) {
        getItemOffsets(rect, ((M) view.getLayoutParams()).alpha.getLayoutPosition(), recyclerView);
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, b0 b0Var) {
        onDraw(canvas, recyclerView);
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, b0 b0Var) {
        onDrawOver(canvas, recyclerView);
    }
}
