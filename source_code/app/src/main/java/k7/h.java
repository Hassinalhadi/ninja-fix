package k7;

import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class h implements androidx.viewpager.widget.h {
    public final WeakReference alpha;
    public int bravo;
    public int charlie;

    public h(TabLayout tabLayout) {
        this.alpha = new WeakReference(tabLayout);
    }

    @Override // androidx.viewpager.widget.h
    public final void onPageScrollStateChanged(int i4) {
        this.bravo = this.charlie;
        this.charlie = i4;
        TabLayout tabLayout = (TabLayout) this.alpha.get();
        if (tabLayout != null) {
            tabLayout.f8131N = this.charlie;
        }
    }

    @Override // androidx.viewpager.widget.h
    public final void onPageScrolled(int i4, float f5, int i5) {
        boolean z2;
        TabLayout tabLayout = (TabLayout) this.alpha.get();
        if (tabLayout != null) {
            int i10 = this.charlie;
            boolean z10 = true;
            if (i10 == 2 && this.bravo != 1) {
                z2 = true;
                z10 = false;
            } else {
                z2 = true;
            }
            if (i10 == 2 && this.bravo == 0) {
                z2 = false;
            }
            tabLayout.november(i4, f5, z10, z2, false);
        }
    }

    @Override // androidx.viewpager.widget.h
    public final void onPageSelected(int i4) {
        boolean z2;
        TabLayout tabLayout = (TabLayout) this.alpha.get();
        if (tabLayout != null && tabLayout.getSelectedTabPosition() != i4 && i4 < tabLayout.getTabCount()) {
            int i5 = this.charlie;
            if (i5 != 0 && (i5 != 2 || this.bravo != 0)) {
                z2 = false;
            } else {
                z2 = true;
            }
            tabLayout.lima(tabLayout.hotel(i4), z2);
        }
    }
}
