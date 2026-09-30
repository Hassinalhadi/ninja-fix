package s1;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import delivery.samurai.android.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class at {
    public static final ArrayList delta = new ArrayList();
    public WeakHashMap alpha;
    public SparseArray bravo;
    public WeakReference charlie;

    public final View alpha(View view) {
        int size;
        WeakHashMap weakHashMap = this.alpha;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View alpha = alpha(viewGroup.getChildAt(childCount));
                    if (alpha != null) {
                        return alpha;
                    }
                }
            }
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                arrayList.get(size).getClass();
                throw new ClassCastException();
            }
            return null;
        }
        return null;
    }
}
