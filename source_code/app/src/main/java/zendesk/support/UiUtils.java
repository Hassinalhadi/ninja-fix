package zendesk.support;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import av.q;
import com.zendesk.logger.Logger;
import ja.burhanrashid52.photoeditor.shape.ShapeBuilder;
import java.util.Locale;

/* loaded from: classes.dex */
public class UiUtils {
    private static UiUtils IMPL = new UiUtils();
    private static final String LOG_TAG = "UiUtils";

    /* loaded from: classes.dex */
    public enum ScreenSize {
        UNKNOWN,
        UNDEFINED,
        X_LARGE,
        LARGE,
        NORMAL,
        SMALL
    }

    private UiUtils() {
    }

    public static CharSequence decodeHtmlEntities(String str) {
        Spanned fromHtml;
        if (Build.VERSION.SDK_INT >= 24) {
            fromHtml = Html.fromHtml(str, 0);
            return fromHtml;
        }
        return Html.fromHtml(str);
    }

    public static void dismissKeyboard(Activity activity) {
        IMPL.internalDismissKeyboard(activity);
    }

    public static int resolveColor(int i4, Context context) {
        return IMPL.internalResolveColor(i4, context);
    }

    public static void setTint(int i4, Drawable drawable, View view) {
        IMPL.internalSetTint(i4, drawable, view);
    }

    public static void setUiUtils(UiUtils uiUtils) {
        IMPL = uiUtils;
    }

    public static void setVisibility(View view, int i4) {
        if (view == null) {
            Logger.w(LOG_TAG, "View is null and can't change visibility", new Object[0]);
        } else {
            view.setVisibility(i4);
        }
    }

    public static void showKeyboard(View view) {
        IMPL.internalShowKeyboard(view);
    }

    public static int themeAttributeToColor(int i4, Context context, int i5) {
        return IMPL.internalThemeAttributeToColor(i4, context, i5);
    }

    public void internalDismissKeyboard(Activity activity) {
        if (activity == null) {
            Logger.w(LOG_TAG, "Cannot dismiss the keyboard when fragment is detached or the activity is null.", new Object[0]);
            return;
        }
        Object systemService = activity.getSystemService("input_method");
        if (!(systemService instanceof InputMethodManager)) {
            Logger.w(LOG_TAG, "Cannot hide soft input because we could not get the InputMethodManager", new Object[0]);
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus == null) {
            Logger.w(LOG_TAG, "Cannot hide soft input because window token could not be obtained", new Object[0]);
        } else {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    public int internalResolveColor(int i4, Context context) {
        return context.getColor(i4);
    }

    public void internalSetTint(int i4, Drawable drawable, View view) {
        if (drawable == null) {
            Logger.e(LOG_TAG, "Drawable is null, cannot apply a tint", new Object[0]);
            return;
        }
        drawable.mutate().setTint(i4);
        if (view != null) {
            view.invalidate();
        }
    }

    public void internalShowKeyboard(View view) {
        if (view == null) {
            Logger.w(LOG_TAG, "Cannot show soft input because window token could not be obtained", new Object[0]);
            return;
        }
        Object systemService = view.getContext().getSystemService("input_method");
        if (systemService instanceof InputMethodManager) {
            ((InputMethodManager) systemService).showSoftInput(view, 1);
        } else {
            Logger.w(LOG_TAG, "Cannot hide soft input because we could not get the InputMethodManager", new Object[0]);
        }
    }

    public int internalThemeAttributeToColor(int i4, Context context, int i5) {
        if (i4 != 0 && context != null && i5 != 0) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(i4, typedValue, true)) {
                Locale locale = Locale.US;
                Logger.e(LOG_TAG, q.delta(i4, "Resource ", " not found. Resource is either missing or you are using a non-ui context."), new Object[0]);
                return resolveColor(i5, context);
            }
            int i10 = typedValue.resourceId;
            if (i10 == 0) {
                return typedValue.data;
            }
            return resolveColor(i10, context);
        }
        Logger.d(LOG_TAG, "themeAttributeId, context, and fallbackColorId are required.", new Object[0]);
        return ShapeBuilder.DEFAULT_SHAPE_COLOR;
    }

    public int internalThemeAttributeToPixels(int i4, Context context, int i5, float f5) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i4, typedValue, true)) {
            Locale locale = Locale.US;
            Logger.e(LOG_TAG, q.delta(i4, "Resource ", " not found. Resource is either missing or you are using a non-ui context."), new Object[0]);
            return Math.round(TypedValue.applyDimension(i5, f5, context.getResources().getDisplayMetrics()));
        }
        return Math.round(typedValue.getDimension(context.getResources().getDisplayMetrics()));
    }

    public static void dismissKeyboard(View view) {
        IMPL.internalDismissKeyboard(view);
    }

    public void internalDismissKeyboard(View view) {
        if (view == null) {
            Logger.w(LOG_TAG, "Cannot hide soft input because window token could not be obtained", new Object[0]);
            return;
        }
        Object systemService = view.getContext().getSystemService("input_method");
        if (!(systemService instanceof InputMethodManager)) {
            Logger.w(LOG_TAG, "Cannot hide soft input because we could not get the InputMethodManager", new Object[0]);
        } else {
            ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}
