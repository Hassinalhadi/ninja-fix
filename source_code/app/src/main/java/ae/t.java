package ae;

import android.view.Window;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class t extends s {
    @Override // t6.AbstractC2997g3
    public void alpha(@NotNull Window window) {
        Intrinsics.echo(window, "window");
        window.getAttributes().layoutInDisplayCutoutMode = 1;
    }
}
