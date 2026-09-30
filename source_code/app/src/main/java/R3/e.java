package R3;

import android.view.View;
import androidx.fragment.app.an;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class e implements f {
    public final Set alpha = Collections.newSetFromMap(new WeakHashMap());
    public volatile boolean purple;

    @Override // R3.f
    public final void charlie(an anVar) {
        if (this.purple || !this.alpha.add(anVar)) {
            return;
        }
        View decorView = anVar.getWindow().getDecorView();
        decorView.getViewTreeObserver().addOnDrawListener(new d(this, decorView));
    }
}
