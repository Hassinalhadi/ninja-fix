package t0;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: t0.G, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2889G implements InterfaceC2888F, Nd.g, B0, H0.h {
    public static final C2889G purple = new C2889G(0);
    public static final C2889G red = new C2889G(1);
    public static final /* synthetic */ C2889G silver = new C2889G(2);
    public static final C2889G teal = new C2889G(3);
    public static final G0 white = new Object();
    public final /* synthetic */ int alpha;

    public /* synthetic */ C2889G(int i4) {
        this.alpha = i4;
    }

    @Override // t0.InterfaceC2888F
    public Rect alpha(Activity activity) {
        int i4;
        switch (this.alpha) {
            case 0:
                Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                Rect rect = new Rect();
                int i5 = point.x;
                if (i5 != 0 && (i4 = point.y) != 0) {
                    rect.right = i5;
                    rect.bottom = i4;
                } else {
                    defaultDisplay.getRectSize(rect);
                }
                return rect;
            default:
                Configuration configuration = activity.getResources().getConfiguration();
                try {
                    Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(configuration);
                    Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                    Intrinsics.charlie(invoke, "null cannot be cast to non-null type android.graphics.Rect");
                    return new Rect((Rect) invoke);
                } catch (Exception e) {
                    if (!(e instanceof NoSuchFieldException) && !(e instanceof NoSuchMethodException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException)) {
                        throw e;
                    }
                    return C2891I.alpha.alpha(activity);
                }
        }
    }

    @Override // t0.B0
    public Function0 bravo(AbstractC2902a abstractC2902a) {
        w0 w0Var = new w0(abstractC2902a, 0);
        abstractC2902a.addOnAttachStateChangeListener(w0Var);
        return new qa.j(6, abstractC2902a, w0Var);
    }
}
