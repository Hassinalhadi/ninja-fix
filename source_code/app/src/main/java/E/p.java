package E;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public abstract class p {
    public static final i alpha(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = viewGroup.getChildAt(i4);
            if (childAt instanceof i) {
                return (i) childAt;
            }
        }
        i iVar = new i(viewGroup.getContext());
        viewGroup.addView(iVar);
        return iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.ViewParent] */
    public static final ViewGroup bravo(View view) {
        while (!(view instanceof ViewGroup)) {
            ?? parent = view.getParent();
            if (parent instanceof View) {
                view = parent;
            } else {
                throw new IllegalArgumentException(("Couldn't find a valid parent for " + view + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
        }
        return (ViewGroup) view;
    }
}
