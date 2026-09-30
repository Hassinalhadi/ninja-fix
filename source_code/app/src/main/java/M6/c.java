package M6;

import android.util.Property;
import android.view.ViewGroup;
import delivery.samurai.android.R;

/* loaded from: classes2.dex */
public final class c extends Property {
    public static final c alpha = new Property(Float.class, "childrenAlpha");

    @Override // android.util.Property
    public final Object get(Object obj) {
        Float f5 = (Float) ((ViewGroup) obj).getTag(R.id.mtrl_internal_children_alpha_tag);
        if (f5 != null) {
            return f5;
        }
        return Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) obj;
        Float f5 = (Float) obj2;
        float floatValue = f5.floatValue();
        viewGroup.setTag(R.id.mtrl_internal_children_alpha_tag, f5);
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            viewGroup.getChildAt(i4).setAlpha(floatValue);
        }
    }
}
