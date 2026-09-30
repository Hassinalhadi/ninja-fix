package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;

/* renamed from: androidx.appcompat.widget.v0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0485v0 {
    public final /* synthetic */ int alpha;

    public /* synthetic */ C0485v0(int i4) {
        this.alpha = i4;
    }

    public final Drawable alpha(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        switch (this.alpha) {
            case 0:
                String classAttribute = attributeSet.getClassAttribute();
                if (classAttribute == null) {
                    return null;
                }
                try {
                    Drawable drawable = (Drawable) C0485v0.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(null).newInstance(null);
                    am.a.charlie(drawable, context.getResources(), xmlResourceParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e);
                    return null;
                }
            case 1:
                try {
                    return al.e.charlie(context, context.getResources(), xmlResourceParser, attributeSet, theme);
                } catch (Exception e4) {
                    Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e4);
                    return null;
                }
            case 2:
                try {
                    Resources resources = context.getResources();
                    androidx.vectordrawable.graphics.drawable.e eVar = new androidx.vectordrawable.graphics.drawable.e(context);
                    eVar.inflate(resources, xmlResourceParser, attributeSet, theme);
                    return eVar;
                } catch (Exception e5) {
                    Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e5);
                    return null;
                }
            default:
                try {
                    Resources resources2 = context.getResources();
                    androidx.vectordrawable.graphics.drawable.p pVar = new androidx.vectordrawable.graphics.drawable.p();
                    pVar.inflate(resources2, xmlResourceParser, attributeSet, theme);
                    return pVar;
                } catch (Exception e10) {
                    Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e10);
                    return null;
                }
        }
    }
}
