package s1;

import android.view.View;

/* loaded from: classes3.dex */
public interface r {
    void onNestedPreScroll(View view, int i4, int i5, int[] iArr, int i10);

    void onNestedScroll(View view, int i4, int i5, int i10, int i11, int i12);

    void onNestedScrollAccepted(View view, View view2, int i4, int i5);

    boolean onStartNestedScroll(View view, View view2, int i4, int i5);

    void onStopNestedScroll(View view, int i4);
}
