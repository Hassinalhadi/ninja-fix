package s6;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import t6.AbstractC3032n3;

/* renamed from: s6.w6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2805w6 {
    public static volatile boolean alpha = true;
    public static final /* synthetic */ int bravo = 0;

    public static Drawable alpha(Context context, Context context2, int i4, Resources.Theme theme) {
        try {
            if (alpha) {
                return bravo(context2, i4, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return context2.getDrawable(i4);
            }
            throw e;
        } catch (NoClassDefFoundError unused2) {
            alpha = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal threadLocal = i1.k.alpha;
        return resources.getDrawable(i4, theme);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.ContextWrapper, an.d] */
    public static Drawable bravo(Context context, int i4, Resources.Theme theme) {
        if (theme != null) {
            ?? contextWrapper = new ContextWrapper(context);
            contextWrapper.bravo = theme;
            contextWrapper.alpha(theme.getResources().getConfiguration());
            context = contextWrapper;
        }
        return AbstractC3032n3.echo(i4, context);
    }
}
