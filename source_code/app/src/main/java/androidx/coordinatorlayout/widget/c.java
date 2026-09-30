package androidx.coordinatorlayout.widget;

import android.graphics.Rect;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import ja.burhanrashid52.photoeditor.shape.ShapeBuilder;
import s1.a0;

/* loaded from: classes3.dex */
public abstract class c {
    public static Object getTag(View view) {
        return ((f) view.getLayoutParams()).romeo;
    }

    public static void setTag(View view, Object obj) {
        ((f) view.getLayoutParams()).romeo = obj;
    }

    public boolean blocksInteractionBelow(CoordinatorLayout coordinatorLayout, View view) {
        if (getScrimOpacity(coordinatorLayout, view) > 0.0f) {
            return true;
        }
        return false;
    }

    public boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
        return false;
    }

    public int getScrimColor(CoordinatorLayout coordinatorLayout, View view) {
        return ShapeBuilder.DEFAULT_SHAPE_COLOR;
    }

    public float getScrimOpacity(CoordinatorLayout coordinatorLayout, View view) {
        return 0.0f;
    }

    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return false;
    }

    public a0 onApplyWindowInsets(CoordinatorLayout coordinatorLayout, View view, a0 a0Var) {
        return a0Var;
    }

    public void onAttachedToLayoutParams(f fVar) {
    }

    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return false;
    }

    public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, View view, View view2) {
    }

    public void onDetachedFromLayoutParams() {
    }

    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i4) {
        return false;
    }

    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i4, int i5, int i10, int i11) {
        return false;
    }

    public boolean onNestedFling(CoordinatorLayout coordinatorLayout, View view, View view2, float f5, float f10, boolean z2) {
        return false;
    }

    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, View view, View view2, float f5, float f10) {
        return false;
    }

    @Deprecated
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i5, int[] iArr) {
    }

    @Deprecated
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i5, int i10, int i11) {
    }

    @Deprecated
    public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i4) {
    }

    public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z2) {
        return false;
    }

    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
    }

    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, View view) {
        return View.BaseSavedState.EMPTY_STATE;
    }

    @Deprecated
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i4) {
        return false;
    }

    @Deprecated
    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2) {
    }

    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i5, int[] iArr, int i10) {
        if (i10 == 0) {
            onNestedPreScroll(coordinatorLayout, view, view2, i4, i5, iArr);
        }
    }

    @Deprecated
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i5, int i10, int i11, int i12) {
        if (i12 == 0) {
            onNestedScroll(coordinatorLayout, view, view2, i4, i5, i10, i11);
        }
    }

    public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScrollAccepted(coordinatorLayout, view, view2, view3, i4);
        }
    }

    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i4, int i5) {
        if (i5 == 0) {
            return onStartNestedScroll(coordinatorLayout, view, view2, view3, i4);
        }
        return false;
    }

    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i4) {
        if (i4 == 0) {
            onStopNestedScroll(coordinatorLayout, view, view2);
        }
    }

    public void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i5, int i10, int i11, int i12, int[] iArr) {
        iArr[0] = iArr[0] + i10;
        iArr[1] = iArr[1] + i11;
        onNestedScroll(coordinatorLayout, view, view2, i4, i5, i10, i11, i12);
    }
}
