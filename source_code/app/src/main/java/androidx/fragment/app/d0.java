package androidx.fragment.app;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import o1.C2188a;

/* loaded from: classes3.dex */
public abstract class d0 {
    public static void foxtrot(List list, View view) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (list.get(i4) == view) {
                return;
            }
        }
        WeakHashMap weakHashMap = s1.au.alpha;
        if (s1.al.foxtrot(view) != null) {
            list.add(view);
        }
        for (int i5 = size; i5 < list.size(); i5++) {
            View view2 = (View) list.get(i5);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    int i11 = 0;
                    while (true) {
                        if (i11 < size) {
                            if (list.get(i11) == childAt) {
                                break;
                            } else {
                                i11++;
                            }
                        } else if (s1.al.foxtrot(childAt) != null) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    public static void juliet(View view, Rect rect) {
        if (!view.isAttachedToWindow()) {
            return;
        }
        RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getMatrix().mapRect(rectF);
        rectF.offset(view.getLeft(), view.getTop());
        Object parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            rectF.offset(-view2.getScrollX(), -view2.getScrollY());
            view2.getMatrix().mapRect(rectF);
            rectF.offset(view2.getLeft(), view2.getTop());
            parent = view2.getParent();
        }
        view.getRootView().getLocationOnScreen(new int[2]);
        rectF.offset(r1[0], r1[1]);
        rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
    }

    public static boolean kilo(List list) {
        if (list != null && !list.isEmpty()) {
            return false;
        }
        return true;
    }

    public abstract void alpha(View view, Object obj);

    public abstract void bravo(Object obj, ArrayList arrayList);

    public void charlie(Object obj) {
    }

    public void delta(Object obj, RunnableC0617l runnableC0617l) {
    }

    public abstract void echo(ViewGroup viewGroup, Object obj);

    public abstract boolean golf(Object obj);

    public abstract Object hotel(Object obj);

    public Object india(ViewGroup viewGroup, Object obj) {
        return null;
    }

    public abstract boolean lima();

    public abstract boolean mike(Object obj);

    public abstract Object november(Object obj, Object obj2, Object obj3);

    public abstract Object oscar(Object obj, Object obj2);

    public abstract void papa(Object obj, View view, ArrayList arrayList);

    public abstract void quebec(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2);

    public void romeo(Object obj, float f5) {
    }

    public abstract void sierra(View view, Object obj);

    public abstract void tango(Object obj, Rect rect);

    public abstract void uniform(ai aiVar, Object obj, C2188a c2188a, Runnable runnable);

    public void victor(Object obj, C2188a c2188a, RunnableC0628x runnableC0628x, Runnable runnable) {
        ((RunnableC0616k) runnable).run();
    }

    public abstract void whiskey(Object obj, View view, ArrayList arrayList);

    public abstract void xray(Object obj, ArrayList arrayList, ArrayList arrayList2);

    public abstract Object yankee(Object obj);
}
