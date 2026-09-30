package an;

import android.view.ActionMode;
import android.view.SearchEvent;
import android.view.Window;

/* loaded from: classes3.dex */
public abstract class l {
    public static boolean alpha(Window.Callback callback, SearchEvent searchEvent) {
        return callback.onSearchRequested(searchEvent);
    }

    public static ActionMode bravo(Window.Callback callback, ActionMode.Callback callback2, int i4) {
        return callback.onWindowStartingActionMode(callback2, i4);
    }
}
