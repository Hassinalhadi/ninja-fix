package ae;

import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class y extends Lambda implements Function0 {
    public static final y alpha = new Lambda(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        try {
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            declaredField3.setAccessible(true);
            return new aa(declaredField3, declaredField, declaredField2);
        } catch (NoSuchFieldException unused) {
            return z.alpha;
        }
    }
}
