package an;

import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.Window;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class m {
    public static void alpha(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int i4) {
        callback.onProvideKeyboardShortcuts(list, menu, i4);
    }
}
