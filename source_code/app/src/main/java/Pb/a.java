package Pb;

import androidx.viewpager.widget.h;
import com.google.android.material.button.MaterialButton;
import delivery.samurai.android.ui.onboarding.TutorialActivity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a implements h {
    public final /* synthetic */ TutorialActivity alpha;

    public a(TutorialActivity tutorialActivity) {
        this.alpha = tutorialActivity;
    }

    @Override // androidx.viewpager.widget.h
    public final void onPageScrollStateChanged(int i4) {
    }

    @Override // androidx.viewpager.widget.h
    public final void onPageScrolled(int i4, float f5, int i5) {
    }

    @Override // androidx.viewpager.widget.h
    public final void onPageSelected(int i4) {
        boolean z2;
        MaterialButton btnNext = (MaterialButton) this.alpha.foxtrot().red;
        Intrinsics.delta(btnNext, "btnNext");
        int i5 = 0;
        if (i4 == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            i5 = 8;
        }
        btnNext.setVisibility(i5);
    }
}
