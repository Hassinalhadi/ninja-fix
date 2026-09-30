package h7;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* renamed from: h7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1816a {
    public static final /* synthetic */ int charlie = 0;
    public final /* synthetic */ int alpha;
    public final SideSheetBehavior bravo;

    public /* synthetic */ C1816a(SideSheetBehavior sideSheetBehavior, int i4) {
        this.alpha = i4;
        this.bravo = sideSheetBehavior;
    }

    public final int alpha() {
        switch (this.alpha) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.bravo;
                return Math.max(0, sideSheetBehavior.f8109g + sideSheetBehavior.f8110h);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.bravo;
                return Math.max(0, (sideSheetBehavior2.f8108f - sideSheetBehavior2.e) - sideSheetBehavior2.f8110h);
        }
    }

    public final int bravo() {
        switch (this.alpha) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.bravo;
                return (-sideSheetBehavior.e) - sideSheetBehavior.f8110h;
            default:
                return this.bravo.f8108f;
        }
    }

    public final int charlie(View view) {
        switch (this.alpha) {
            case 0:
                return view.getRight() + this.bravo.f8110h;
            default:
                return view.getLeft() - this.bravo.f8110h;
        }
    }

    public final int delta() {
        switch (this.alpha) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    public final void echo(ViewGroup.MarginLayoutParams marginLayoutParams, int i4) {
        switch (this.alpha) {
            case 0:
                marginLayoutParams.leftMargin = i4;
                return;
            default:
                marginLayoutParams.rightMargin = i4;
                return;
        }
    }
}
