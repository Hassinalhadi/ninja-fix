package O6;

import a7.C0413h;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.compose.material3.internal.aj;
import b7.w;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.i;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import x2.z;

/* loaded from: classes2.dex */
public final class b extends AnimatorListenerAdapter {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object bravo;

    public /* synthetic */ b(int i4, Object obj) {
        this.alpha = i4;
        this.bravo = obj;
    }

    private final void alpha(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.alpha) {
            case 3:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.bravo;
                actionBarOverlayLayout.f2797p = null;
                actionBarOverlayLayout.f2785c = false;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.alpha) {
            case 0:
                ((HideBottomViewOnScrollBehavior) this.bravo).f7848d = null;
                return;
            case 1:
                ((HideViewOnScrollBehavior) this.bravo).f7852d = null;
                return;
            case 2:
                C0413h c0413h = (C0413h) this.bravo;
                c0413h.bravo.setTranslationY(0.0f);
                c0413h.bravo(0.0f);
                return;
            case 3:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.bravo;
                actionBarOverlayLayout.f2797p = null;
                actionBarOverlayLayout.f2785c = false;
                return;
            case 4:
                androidx.vectordrawable.graphics.drawable.e eVar = (androidx.vectordrawable.graphics.drawable.e) this.bravo;
                ArrayList arrayList = new ArrayList(eVar.teal);
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((androidx.vectordrawable.graphics.drawable.c) arrayList.get(i4)).onAnimationEnd(eVar);
                }
                return;
            case 5:
            default:
                super.onAnimationEnd(animator);
                return;
            case 6:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.bravo;
                bottomSheetBehavior.tango(5);
                WeakReference weakReference = bottomSheetBehavior.f7866P;
                if (weakReference != null && weakReference.get() != null) {
                    ((View) bottomSheetBehavior.f7866P.get()).requestLayout();
                    return;
                }
                return;
            case 7:
                i iVar = (i) this.bravo;
                iVar.quebec();
                iVar.romeo.start();
                return;
            case 8:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.bravo;
                sideSheetBehavior.foxtrot(5);
                WeakReference weakReference2 = sideSheetBehavior.f8111i;
                if (weakReference2 != null && weakReference2.get() != null) {
                    ((View) sideSheetBehavior.f8111i.get()).requestLayout();
                    return;
                }
                return;
            case 9:
                View makeGone = (View) this.bravo;
                Intrinsics.foxtrot(makeGone, "$this$makeGone");
                makeGone.setVisibility(8);
                return;
            case 10:
                ((aj) this.bravo).invoke(animator);
                return;
            case 11:
                ((ExpandableTransformationBehavior) this.bravo).purple = null;
                return;
            case 12:
                ((z) this.bravo).mike();
                animator.removeListener(this);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.alpha) {
            case 5:
                super.onAnimationRepeat(animator);
                w wVar = (w) this.bravo;
                wVar.yellow = (wVar.yellow + 1) % wVar.white.echo.length;
                wVar.f3365a = true;
                return;
            default:
                super.onAnimationRepeat(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.alpha) {
            case 4:
                androidx.vectordrawable.graphics.drawable.e eVar = (androidx.vectordrawable.graphics.drawable.e) this.bravo;
                ArrayList arrayList = new ArrayList(eVar.teal);
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((androidx.vectordrawable.graphics.drawable.c) arrayList.get(i4)).onAnimationStart(eVar);
                }
                return;
            case 10:
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
