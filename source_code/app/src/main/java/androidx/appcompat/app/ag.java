package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0478s;
import androidx.appcompat.widget.C0482u;
import androidx.appcompat.widget.C0484v;
import bv.aw;
import java.lang.reflect.Constructor;

/* loaded from: classes3.dex */
public class ag {
    public static final Class[] bravo = {Context.class, AttributeSet.class};
    public static final int[] charlie = {R.attr.onClick};
    public static final int[] delta = {R.attr.accessibilityHeading};
    public static final int[] echo = {R.attr.accessibilityPaneTitle};
    public static final int[] foxtrot = {R.attr.screenReaderFocusable};
    public static final String[] golf = {"android.widget.", "android.view.", "android.webkit."};
    public static final aw hotel = new aw(0);
    public final Object[] alpha = new Object[2];

    public C0478s alpha(Context context, AttributeSet attributeSet) {
        return new C0478s(context, attributeSet);
    }

    public C0482u bravo(Context context, AttributeSet attributeSet) {
        return new C0482u(context, attributeSet, delivery.samurai.android.R.attr.buttonStyle);
    }

    public C0484v charlie(Context context, AttributeSet attributeSet) {
        return new C0484v(context, attributeSet, delivery.samurai.android.R.attr.checkboxStyle);
    }

    public androidx.appcompat.widget.ah delta(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.ah(context, attributeSet);
    }

    public AppCompatTextView echo(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    public final View foxtrot(Context context, String str, String str2) {
        String concat;
        aw awVar = hotel;
        Constructor constructor = (Constructor) awVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    concat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                concat = str;
            }
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(bravo);
            awVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.alpha);
    }
}
