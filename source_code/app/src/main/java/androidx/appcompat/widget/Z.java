package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import delivery.samurai.android.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public class Z extends ListView {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2860a;
    public final Rect alpha;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2861b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2862c;

    /* renamed from: d, reason: collision with root package name */
    public androidx.core.widget.d f2863d;
    public Y e;
    public int purple;
    public int red;
    public int silver;
    public int teal;
    public int white;
    public W yellow;

    public Z(Context context, boolean z2) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.alpha = new Rect();
        this.purple = 0;
        this.red = 0;
        this.silver = 0;
        this.teal = 0;
        this.f2861b = z2;
        setCacheColorHint(0);
    }

    public final int alpha(int i4, int i5) {
        int makeMeasureSpec;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i10 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i11 = 0;
        View view = null;
        for (int i12 = 0; i12 < count; i12++) {
            int itemViewType = adapter.getItemViewType(i12);
            if (itemViewType != i11) {
                view = null;
                i11 = itemViewType;
            }
            view = adapter.getView(i12, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i13 = layoutParams.height;
            if (i13 > 0) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i4, makeMeasureSpec);
            view.forceLayout();
            if (i12 > 0) {
                i10 += dividerHeight;
            }
            i10 += view.getMeasuredHeight();
            if (i10 >= i5) {
                return i5;
            }
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x014a A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean bravo(MotionEvent motionEvent, int i4) {
        boolean z2;
        boolean z10;
        boolean z11;
        boolean z12;
        View childAt;
        View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z13 = false;
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z2 = true;
                    if (z2 || z13) {
                        this.f2862c = false;
                        setPressed(false);
                        drawableStateChanged();
                        childAt2 = getChildAt(this.white - getFirstVisiblePosition());
                        if (childAt2 != null) {
                            childAt2.setPressed(false);
                        }
                    }
                    if (!z2) {
                        if (this.f2863d == null) {
                            this.f2863d = new androidx.core.widget.d(this);
                        }
                        androidx.core.widget.d dVar = this.f2863d;
                        boolean z14 = dVar.f3068i;
                        dVar.f3068i = true;
                        dVar.onTouch(this, motionEvent);
                    } else {
                        androidx.core.widget.d dVar2 = this.f2863d;
                        if (dVar2 != null) {
                            if (dVar2.f3068i) {
                                dVar2.delta();
                            }
                            dVar2.f3068i = false;
                        }
                    }
                    return z2;
                }
                z2 = false;
                if (z2) {
                }
                this.f2862c = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.white - getFirstVisiblePosition());
                if (childAt2 != null) {
                }
                if (!z2) {
                }
                return z2;
            }
            z2 = true;
        } else {
            z2 = false;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i4);
        if (findPointerIndex >= 0) {
            int x4 = (int) motionEvent.getX(findPointerIndex);
            int y10 = (int) motionEvent.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x4, y10);
            if (pointToPosition == -1) {
                z13 = true;
            } else {
                View childAt3 = getChildAt(pointToPosition - getFirstVisiblePosition());
                float f5 = x4;
                float f10 = y10;
                this.f2862c = true;
                int i5 = Build.VERSION.SDK_INT;
                T.alpha(this, f5, f10);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i10 = this.white;
                if (i10 != -1 && (childAt = getChildAt(i10 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.white = pointToPosition;
                T.alpha(childAt3, f5 - childAt3.getLeft(), f10 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                if (selector != null && pointToPosition != -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.alpha;
                rect.set(left, top, right, bottom);
                rect.left -= this.purple;
                rect.top -= this.red;
                rect.right += this.silver;
                rect.bottom += this.teal;
                if (i5 >= 33) {
                    z11 = V.alpha(this);
                } else {
                    Field field = X.alpha;
                    if (field != null) {
                        try {
                            z11 = field.getBoolean(this);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                    }
                    z11 = false;
                }
                if (childAt3.isEnabled() != z11) {
                    boolean z15 = !z11;
                    if (Build.VERSION.SDK_INT >= 33) {
                        V.bravo(this, z15);
                    } else {
                        Field field2 = X.alpha;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z15));
                            } catch (IllegalAccessException e4) {
                                e4.printStackTrace();
                            }
                        }
                    }
                    if (pointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z10) {
                    float exactCenterX = rect.exactCenterX();
                    float exactCenterY = rect.exactCenterY();
                    if (getVisibility() == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    selector.setVisible(z12, false);
                    selector.setHotspot(exactCenterX, exactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && pointToPosition != -1) {
                    selector2.setHotspot(f5, f10);
                }
                W w4 = this.yellow;
                if (w4 != null) {
                    w4.purple = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, pointToPosition, getItemIdAtPosition(pointToPosition));
                }
                z2 = true;
                z13 = false;
            }
            if (z2) {
            }
            this.f2862c = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.white - getFirstVisiblePosition());
            if (childAt2 != null) {
            }
            if (!z2) {
            }
            return z2;
        }
        z2 = false;
        if (z2) {
        }
        this.f2862c = false;
        setPressed(false);
        drawableStateChanged();
        childAt2 = getChildAt(this.white - getFirstVisiblePosition());
        if (childAt2 != null) {
        }
        if (!z2) {
        }
        return z2;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.alpha;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.e == null) {
            super.drawableStateChanged();
            W w4 = this.yellow;
            if (w4 != null) {
                w4.purple = true;
            }
            Drawable selector = getSelector();
            if (selector != null && this.f2862c && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        if (!this.f2861b && !super.hasFocus()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        if (!this.f2861b && !super.hasWindowFocus()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean isFocused() {
        if (!this.f2861b && !super.isFocused()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        if ((this.f2861b && this.f2860a) || super.isInTouchMode()) {
            return true;
        }
        return false;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.e = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.e == null) {
            Y y10 = new Y(this, 0);
            this.e = y10;
            post(y10);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return onHoverEvent;
        }
        int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i4 >= 30 && U.delta) {
                    try {
                        U.alpha.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                        U.bravo.invoke(this, Integer.valueOf(pointToPosition));
                        U.charlie.invoke(this, Integer.valueOf(pointToPosition));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e4) {
                        e4.printStackTrace();
                    }
                } else {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f2862c && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.white = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        Y y10 = this.e;
        if (y10 != null) {
            Z z2 = (Z) y10.purple;
            z2.e = null;
            z2.removeCallbacks(y10);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z2) {
        this.f2860a = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.graphics.drawable.Drawable$Callback, android.graphics.drawable.Drawable, androidx.appcompat.widget.W] */
    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        W w4;
        if (drawable != 0) {
            ?? drawable2 = new Drawable();
            Drawable drawable3 = drawable2.alpha;
            if (drawable3 != null) {
                drawable3.setCallback(null);
            }
            drawable2.alpha = drawable;
            if (drawable != 0) {
                drawable.setCallback(drawable2);
            }
            drawable2.purple = true;
            w4 = drawable2;
        } else {
            w4 = null;
        }
        this.yellow = w4;
        super.setSelector(w4);
        Rect rect = new Rect();
        if (drawable != 0) {
            drawable.getPadding(rect);
        }
        this.purple = rect.left;
        this.red = rect.top;
        this.silver = rect.right;
        this.teal = rect.bottom;
    }
}
