package zendesk.commonui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import android.util.TypedValue;
import android.view.View;
import av.q;
import com.zendesk.logger.Logger;
import ja.burhanrashid52.photoeditor.shape.ShapeBuilder;
import java.util.Locale;

/* loaded from: classes.dex */
public class UiUtils {
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

    public static int resolveColor(int i4, Context context) {
        return context.getColor(i4);
    }

    public static void setTint(int i4, Drawable drawable, View view) {
        if (drawable == null) {
            Logger.e(LOG_TAG, "Drawable is null, cannot apply a tint", new Object[0]);
            return;
        }
        drawable.mutate().setTint(i4);
        if (view != null) {
            view.invalidate();
        }
    }

    public static void setVisibility(View view, int i4) {
        if (view == null) {
            Logger.w(LOG_TAG, "View is null and can't change visibility", new Object[0]);
        } else {
            view.setVisibility(i4);
        }
    }

    public static int themeAttributeToColor(int i4, Context context, int i5) {
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

    public int themeAttributeToPixels(int i4, Context context, int i5, float f5) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i4, typedValue, true)) {
            Locale locale = Locale.US;
            Logger.e(LOG_TAG, q.delta(i4, "Resource ", " not found. Resource is either missing or you are using a non-ui context."), new Object[0]);
            return Math.round(TypedValue.applyDimension(i5, f5, context.getResources().getDisplayMetrics()));
        }
        return Math.round(typedValue.getDimension(context.getResources().getDisplayMetrics()));
    }
}
