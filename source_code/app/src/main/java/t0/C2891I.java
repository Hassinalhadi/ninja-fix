package t0;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.DisplayCutout;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: t0.I, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2891I implements InterfaceC2888F {
    public static final C2891I alpha = new Object();

    @Override // t0.InterfaceC2888F
    public final Rect alpha(Activity activity) {
        int i4;
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        DisplayCutout displayCutout = null;
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (activity.isInMultiWindowMode()) {
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                Intrinsics.charlie(invoke, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) invoke);
            } else {
                Object invoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                Intrinsics.charlie(invoke2, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) invoke2);
            }
        } catch (Exception e) {
            if (!(e instanceof NoSuchFieldException) && !(e instanceof NoSuchMethodException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException)) {
                throw e;
            }
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        if (!activity.isInMultiWindowMode()) {
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            if (identifier > 0) {
                i4 = resources.getDimensionPixelSize(identifier);
            } else {
                i4 = 0;
            }
            int i5 = rect.bottom + i4;
            if (i5 == point.y) {
                rect.bottom = i5;
            } else {
                int i10 = rect.right + i4;
                if (i10 == point.x) {
                    rect.right = i10;
                } else if (rect.left == i4) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activity.isInMultiWindowMode()) {
            try {
                Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
                constructor.setAccessible(true);
                Object newInstance = constructor.newInstance(null);
                Method declaredMethod = defaultDisplay.getClass().getDeclaredMethod("getDisplayInfo", newInstance.getClass());
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(defaultDisplay, newInstance);
                Field declaredField2 = newInstance.getClass().getDeclaredField("displayCutout");
                declaredField2.setAccessible(true);
                Object obj2 = declaredField2.get(newInstance);
                if (obj2 instanceof DisplayCutout) {
                    displayCutout = (DisplayCutout) obj2;
                }
            } catch (Exception e4) {
                if (!(e4 instanceof ClassNotFoundException) && !(e4 instanceof NoSuchMethodException) && !(e4 instanceof NoSuchFieldException) && !(e4 instanceof IllegalAccessException) && !(e4 instanceof InvocationTargetException) && !(e4 instanceof InstantiationException)) {
                    throw e4;
                }
            }
            if (displayCutout != null) {
                if (rect.left == displayCutout.getSafeInsetLeft()) {
                    rect.left = 0;
                }
                if (point.x - rect.right == displayCutout.getSafeInsetRight()) {
                    rect.right = displayCutout.getSafeInsetRight() + rect.right;
                }
                if (rect.top == displayCutout.getSafeInsetTop()) {
                    rect.top = 0;
                }
                if (point.y - rect.bottom == displayCutout.getSafeInsetBottom()) {
                    rect.bottom = displayCutout.getSafeInsetBottom() + rect.bottom;
                }
            }
        }
        return rect;
    }
}
