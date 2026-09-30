package t0;

import android.view.View;
import android.view.ViewStructure;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class af {
    public static final af alpha = new Object();

    public final void alpha(@NotNull ViewStructure viewStructure, @NotNull View view) {
        viewStructure.setClassName(view.getAccessibilityClassName().toString());
    }
}
