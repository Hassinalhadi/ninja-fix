package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public final class as extends K1.g {
    public final /* synthetic */ int delta;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ as(L l10, int i4) {
        super(l10);
        this.delta = i4;
    }

    @Override // K1.g
    public final int bravo(View view) {
        switch (this.delta) {
            case 0:
                M m4 = (M) view.getLayoutParams();
                ((L) this.bravo).getClass();
                return L.blue(view) + ((ViewGroup.MarginLayoutParams) m4).rightMargin;
            default:
                M m5 = (M) view.getLayoutParams();
                ((L) this.bravo).getClass();
                return L.zulu(view) + ((ViewGroup.MarginLayoutParams) m5).bottomMargin;
        }
    }

    @Override // K1.g
    public final int charlie(View view) {
        switch (this.delta) {
            case 0:
                M m4 = (M) view.getLayoutParams();
                ((L) this.bravo).getClass();
                return L.black(view) + ((ViewGroup.MarginLayoutParams) m4).leftMargin + ((ViewGroup.MarginLayoutParams) m4).rightMargin;
            default:
                M m5 = (M) view.getLayoutParams();
                ((L) this.bravo).getClass();
                return L.beige(view) + ((ViewGroup.MarginLayoutParams) m5).topMargin + ((ViewGroup.MarginLayoutParams) m5).bottomMargin;
        }
    }

    @Override // K1.g
    public final int delta(View view) {
        switch (this.delta) {
            case 0:
                M m4 = (M) view.getLayoutParams();
                ((L) this.bravo).getClass();
                return L.beige(view) + ((ViewGroup.MarginLayoutParams) m4).topMargin + ((ViewGroup.MarginLayoutParams) m4).bottomMargin;
            default:
                M m5 = (M) view.getLayoutParams();
                ((L) this.bravo).getClass();
                return L.black(view) + ((ViewGroup.MarginLayoutParams) m5).leftMargin + ((ViewGroup.MarginLayoutParams) m5).rightMargin;
        }
    }

    @Override // K1.g
    public final int echo(View view) {
        switch (this.delta) {
            case 0:
                M m4 = (M) view.getLayoutParams();
                ((L) this.bravo).getClass();
                return L.azure(view) - ((ViewGroup.MarginLayoutParams) m4).leftMargin;
            default:
                M m5 = (M) view.getLayoutParams();
                ((L) this.bravo).getClass();
                return L.bronze(view) - ((ViewGroup.MarginLayoutParams) m5).topMargin;
        }
    }

    @Override // K1.g
    public final int foxtrot() {
        switch (this.delta) {
            case 0:
                return ((L) this.bravo).november;
            default:
                return ((L) this.bravo).oscar;
        }
    }

    @Override // K1.g
    public final int golf() {
        switch (this.delta) {
            case 0:
                L l10 = (L) this.bravo;
                return l10.november - l10.fuchsia();
            default:
                L l11 = (L) this.bravo;
                return l11.oscar - l11.cyan();
        }
    }

    @Override // K1.g
    public final int hotel() {
        switch (this.delta) {
            case 0:
                return ((L) this.bravo).fuchsia();
            default:
                return ((L) this.bravo).cyan();
        }
    }

    @Override // K1.g
    public final int india() {
        switch (this.delta) {
            case 0:
                return ((L) this.bravo).lima;
            default:
                return ((L) this.bravo).mike;
        }
    }

    @Override // K1.g
    public final int juliet() {
        switch (this.delta) {
            case 0:
                return ((L) this.bravo).mike;
            default:
                return ((L) this.bravo).lima;
        }
    }

    @Override // K1.g
    public final int kilo() {
        switch (this.delta) {
            case 0:
                return ((L) this.bravo).emerald();
            default:
                return ((L) this.bravo).gold();
        }
    }

    @Override // K1.g
    public final int lima() {
        switch (this.delta) {
            case 0:
                L l10 = (L) this.bravo;
                return (l10.november - l10.emerald()) - l10.fuchsia();
            default:
                L l11 = (L) this.bravo;
                return (l11.oscar - l11.gold()) - l11.cyan();
        }
    }

    @Override // K1.g
    public final int november(View view) {
        switch (this.delta) {
            case 0:
                L l10 = (L) this.bravo;
                Rect rect = (Rect) this.charlie;
                l10.ivory(view, rect);
                return rect.right;
            default:
                L l11 = (L) this.bravo;
                Rect rect2 = (Rect) this.charlie;
                l11.ivory(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // K1.g
    public final int oscar(View view) {
        switch (this.delta) {
            case 0:
                L l10 = (L) this.bravo;
                Rect rect = (Rect) this.charlie;
                l10.ivory(view, rect);
                return rect.left;
            default:
                L l11 = (L) this.bravo;
                Rect rect2 = (Rect) this.charlie;
                l11.ivory(view, rect2);
                return rect2.top;
        }
    }

    @Override // K1.g
    public final void papa(int i4) {
        switch (this.delta) {
            case 0:
                ((L) this.bravo).magenta(i4);
                return;
            default:
                ((L) this.bravo).maroon(i4);
                return;
        }
    }
}
