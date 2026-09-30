package k7;

import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes2.dex */
public final class g {
    public CharSequence alpha;
    public int bravo;
    public View charlie;
    public TabLayout delta;
    public j echo;

    public final void alpha() {
        TabLayout tabLayout = this.delta;
        if (tabLayout != null) {
            tabLayout.lima(this, true);
            return;
        }
        throw new IllegalArgumentException("Tab not attached to a TabLayout");
    }
}
