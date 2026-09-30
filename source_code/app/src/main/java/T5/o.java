package T5;

import android.view.View;
import com.google.android.gms.common.Feature;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import ga.as;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class o {
    public final /* synthetic */ int alpha;
    public boolean bravo;
    public int charlie;
    public Object delta;
    public Object echo;

    public /* synthetic */ o() {
        this.alpha = 0;
    }

    public static o bravo() {
        o oVar = new o();
        oVar.bravo = true;
        oVar.charlie = 0;
        return oVar;
    }

    public o alpha() {
        boolean z2;
        if (((m) this.delta) != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        V5.x.alpha("execute parameter required", z2);
        return new o(this, (Feature[]) this.echo, this.bravo, this.charlie);
    }

    public void charlie(int i4) {
        switch (this.alpha) {
            case 3:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.echo;
                WeakReference weakReference = bottomSheetBehavior.f7866P;
                if (weakReference != null && weakReference.get() != null) {
                    this.charlie = i4;
                    if (!this.bravo) {
                        ((View) bottomSheetBehavior.f7866P.get()).postOnAnimation((com.google.android.material.bottomsheet.e) this.delta);
                        this.bravo = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.echo;
                WeakReference weakReference2 = sideSheetBehavior.f8111i;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.charlie = i4;
                    if (!this.bravo) {
                        ((View) sideSheetBehavior.f8111i.get()).postOnAnimation((as) this.delta);
                        this.bravo = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public o(l lVar, K1.f fVar, boolean z2, int i4) {
        this.alpha = 1;
        this.echo = lVar;
        this.delta = fVar;
        this.bravo = z2;
        this.charlie = i4;
    }

    public o(o oVar, Feature[] featureArr, boolean z2, int i4) {
        this.alpha = 2;
        this.delta = oVar;
        this.echo = featureArr;
        boolean z10 = false;
        if (featureArr != null && z2) {
            z10 = true;
        }
        this.bravo = z10;
        this.charlie = i4;
    }

    public o(SideSheetBehavior sideSheetBehavior) {
        this.alpha = 4;
        this.echo = sideSheetBehavior;
        this.delta = new as(1, this);
    }

    public o(BottomSheetBehavior bottomSheetBehavior) {
        this.alpha = 3;
        this.echo = bottomSheetBehavior;
        this.delta = new com.google.android.material.bottomsheet.e(this);
    }
}
