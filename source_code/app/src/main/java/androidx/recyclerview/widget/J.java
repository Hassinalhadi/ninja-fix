package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public final class J {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ L bravo;

    public /* synthetic */ J(L l10, int i4) {
        this.alpha = i4;
        this.bravo = l10;
    }

    public final int alpha(View view) {
        switch (this.alpha) {
            case 0:
                M m4 = (M) view.getLayoutParams();
                this.bravo.getClass();
                return L.blue(view) + ((ViewGroup.MarginLayoutParams) m4).rightMargin;
            default:
                M m5 = (M) view.getLayoutParams();
                this.bravo.getClass();
                return L.zulu(view) + ((ViewGroup.MarginLayoutParams) m5).bottomMargin;
        }
    }

    public final int bravo(View view) {
        switch (this.alpha) {
            case 0:
                M m4 = (M) view.getLayoutParams();
                this.bravo.getClass();
                return L.azure(view) - ((ViewGroup.MarginLayoutParams) m4).leftMargin;
            default:
                M m5 = (M) view.getLayoutParams();
                this.bravo.getClass();
                return L.bronze(view) - ((ViewGroup.MarginLayoutParams) m5).topMargin;
        }
    }

    public final int charlie() {
        switch (this.alpha) {
            case 0:
                L l10 = this.bravo;
                return l10.november - l10.fuchsia();
            default:
                L l11 = this.bravo;
                return l11.oscar - l11.cyan();
        }
    }

    public final int delta() {
        switch (this.alpha) {
            case 0:
                return this.bravo.emerald();
            default:
                return this.bravo.gold();
        }
    }
}
