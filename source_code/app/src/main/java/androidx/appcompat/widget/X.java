package androidx.appcompat.widget;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* loaded from: classes3.dex */
public abstract class X {
    public static final Field alpha;

    static {
        Field field = null;
        try {
            field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            field.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        alpha = field;
    }
}
