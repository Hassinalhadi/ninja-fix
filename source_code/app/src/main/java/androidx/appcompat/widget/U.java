package androidx.appcompat.widget;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public abstract class U {
    public static final Method alpha;
    public static final Method bravo;
    public static final Method charlie;
    public static final boolean delta;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
            alpha = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            bravo = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            charlie = declaredMethod3;
            declaredMethod3.setAccessible(true);
            delta = true;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
