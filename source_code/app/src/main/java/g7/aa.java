package g7;

import android.view.View;
import com.google.android.material.navigation.NavigationView;

/* loaded from: classes2.dex */
public final class aa extends y {
    public aa(NavigationView navigationView) {
        delta(navigationView);
    }

    private void delta(View view) {
        view.setOutlineProvider(new R6.c(2, this));
    }

    @Override // g7.y
    public final void alpha(NavigationView navigationView) {
        navigationView.setClipToOutline(!this.alpha);
        if (this.alpha) {
            navigationView.invalidate();
        } else {
            navigationView.invalidateOutline();
        }
    }

    @Override // g7.y
    public final boolean bravo() {
        return this.alpha;
    }
}
