package t0;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class Y {
    public static final A7.a foxtrot = new A7.a(9);
    public final Rect alpha = new Rect();
    public final Rect bravo = new Rect();
    public final Rect charlie = new Rect();
    public final X delta = new X(new h9.aq(12, this));
    public final ArrayList echo = new ArrayList();

    public static void delta(ViewGroup viewGroup, Rect rect) {
        int height = viewGroup.getHeight() + viewGroup.getScrollY();
        int width = viewGroup.getWidth() + viewGroup.getScrollX();
        rect.set(width, height, width, height);
    }

    public final View alpha(int i4, Rect rect, View view, ViewGroup viewGroup, ArrayList arrayList) {
        int indexOf;
        int lastIndexOf;
        int i5;
        Rect rect2 = this.alpha;
        if (view != null) {
            view.getFocusedRect(rect2);
            viewGroup.offsetDescendantRectToMyCoords(view, rect2);
        } else if (rect != null) {
            rect2.set(rect);
        } else if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 17 && i4 != 33) {
                    if (i4 == 66 || i4 == 130) {
                        int scrollY = viewGroup.getScrollY();
                        int scrollX = viewGroup.getScrollX();
                        rect2.set(scrollX, scrollY, scrollX, scrollY);
                    }
                } else {
                    delta(viewGroup, rect2);
                }
            } else if (viewGroup.getLayoutDirection() == 1) {
                delta(viewGroup, rect2);
            } else {
                int scrollY2 = viewGroup.getScrollY();
                int scrollX2 = viewGroup.getScrollX();
                rect2.set(scrollX2, scrollY2, scrollX2, scrollY2);
            }
        } else if (viewGroup.getLayoutDirection() == 1) {
            int scrollY3 = viewGroup.getScrollY();
            int scrollX3 = viewGroup.getScrollX();
            rect2.set(scrollX3, scrollY3, scrollX3, scrollY3);
        } else {
            delta(viewGroup, rect2);
        }
        if (i4 != 1 && i4 != 2) {
            if (i4 != 17 && i4 != 33 && i4 != 66 && i4 != 130) {
                throw new IllegalArgumentException(ao.ad.zulu(i4, "Unknown direction: "));
            }
            return charlie(i4, rect2, view, viewGroup, arrayList);
        }
        X x4 = this.delta;
        try {
            x4.alpha(arrayList, viewGroup);
            Collections.sort(arrayList, x4);
            x4.silver.alpha();
            x4.red.bravo();
            x4.teal.alpha();
            x4.purple.alpha();
            int size = arrayList.size();
            View view2 = null;
            if (size < 2) {
                return null;
            }
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 17 || i4 == 33 || i4 == 66 || i4 == 130) {
                        view2 = charlie(i4, this.alpha, view, viewGroup, arrayList);
                    }
                } else if (size >= 2) {
                    view2 = (view == null || (lastIndexOf = arrayList.lastIndexOf(view)) < 0 || (i5 = lastIndexOf + 1) >= size) ? (View) arrayList.get(0) : (View) arrayList.get(i5);
                }
            } else if (size >= 2) {
                view2 = (view == null || (indexOf = arrayList.indexOf(view)) <= 0) ? (View) arrayList.get(size - 1) : (View) arrayList.get(indexOf - 1);
            }
            if (view2 == null) {
                return (View) arrayList.get(size - 1);
            }
            return view2;
        } catch (Throwable th) {
            x4.silver.alpha();
            x4.red.bravo();
            x4.teal.alpha();
            x4.purple.alpha();
            throw th;
        }
    }

    public final View bravo(int i4, View view, ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        View view2 = null;
        if (view != null && view != viewGroup) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup3 = null;
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    break;
                }
                if (parent == viewGroup) {
                    if (viewGroup3 != null) {
                        viewGroup2 = viewGroup3;
                    }
                } else {
                    ViewGroup viewGroup4 = (ViewGroup) parent;
                    if (viewGroup4.getTouchscreenBlocksFocus() && view.getContext().getPackageManager().hasSystemFeature("android.hardware.touchscreen")) {
                        viewGroup3 = viewGroup4;
                    }
                    parent = viewGroup4.getParent();
                }
            }
        }
        viewGroup2 = viewGroup;
        View alpha = W.alpha(i4, view, viewGroup2);
        boolean z2 = true;
        View view3 = alpha;
        while (alpha != null) {
            if (alpha.isFocusable() && alpha.getVisibility() == 0 && (!alpha.isInTouchMode() || alpha.isFocusableInTouchMode())) {
                view2 = alpha;
                break;
            }
            alpha = W.alpha(i4, alpha, viewGroup2);
            boolean z10 = !z2;
            if (!z2) {
                if (view3 != null) {
                    view3 = W.alpha(i4, view3, viewGroup2);
                } else {
                    view3 = null;
                }
                if (view3 == alpha) {
                    break;
                }
            }
            z2 = z10;
        }
        if (view2 != null) {
            return view2;
        }
        ArrayList<View> arrayList = this.echo;
        try {
            arrayList.clear();
            if (Build.VERSION.SDK_INT < 26) {
                W.charlie(viewGroup2, arrayList, viewGroup2.isInTouchMode());
            } else {
                viewGroup2.addFocusables(arrayList, i4, viewGroup2.isInTouchMode() ? 1 : 0);
            }
            if (!arrayList.isEmpty()) {
                view2 = alpha(i4, null, view, viewGroup2, arrayList);
            }
            arrayList.clear();
            return view2;
        } catch (Throwable th) {
            arrayList.clear();
            throw th;
        }
    }

    public final View charlie(int i4, Rect rect, View view, ViewGroup viewGroup, ArrayList arrayList) {
        int i5;
        Rect rect2 = this.bravo;
        rect2.set(rect);
        if (i4 != 17) {
            if (i4 != 33) {
                if (i4 != 66) {
                    if (i4 == 130) {
                        rect2.offset(0, (-rect.height()) - 1);
                    }
                } else {
                    rect2.offset((-rect.width()) - 1, 0);
                }
            } else {
                rect2.offset(0, rect.height() + 1);
            }
        } else {
            rect2.offset(rect.width() + 1, 0);
        }
        int size = arrayList.size();
        View view2 = null;
        for (int i10 = 0; i10 < size; i10++) {
            View view3 = (View) arrayList.get(i10);
            if (!Intrinsics.areEqual(view3, view) && !Intrinsics.areEqual(view3, viewGroup)) {
                Rect rect3 = this.charlie;
                view3.getFocusedRect(rect3);
                viewGroup.offsetDescendantRectToMyCoords(view3, rect3);
                Z.c blue = a0.ao.blue(rect3);
                Z.c blue2 = a0.ao.blue(rect2);
                Z.c blue3 = a0.ao.blue(rect);
                Y.d oscar = Y.g.oscar(i4);
                if (oscar != null) {
                    i5 = oscar.alpha;
                } else {
                    i5 = 1;
                }
                if (Y.ae.golf(blue, blue2, blue3, i5)) {
                    rect2.set(rect3);
                    view2 = view3;
                }
            }
        }
        return view2;
    }
}
