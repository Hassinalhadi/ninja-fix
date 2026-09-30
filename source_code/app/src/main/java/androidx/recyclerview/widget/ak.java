package androidx.recyclerview.widget;

import android.view.View;
import androidx.appcompat.widget.P0;

/* loaded from: classes3.dex */
public final class ak {
    public K1.g alpha;
    public int bravo;
    public int charlie;
    public boolean delta;
    public boolean echo;

    public ak() {
        delta();
    }

    public final void alpha() {
        int kilo;
        if (this.delta) {
            kilo = this.alpha.golf();
        } else {
            kilo = this.alpha.kilo();
        }
        this.charlie = kilo;
    }

    public final void bravo(int i4, View view) {
        if (this.delta) {
            this.charlie = this.alpha.mike() + this.alpha.bravo(view);
        } else {
            this.charlie = this.alpha.echo(view);
        }
        this.bravo = i4;
    }

    public final void charlie(int i4, View view) {
        int mike = this.alpha.mike();
        if (mike >= 0) {
            bravo(i4, view);
            return;
        }
        this.bravo = i4;
        if (this.delta) {
            int golf = (this.alpha.golf() - mike) - this.alpha.bravo(view);
            this.charlie = this.alpha.golf() - golf;
            if (golf > 0) {
                int charlie = this.charlie - this.alpha.charlie(view);
                int kilo = this.alpha.kilo();
                int min = charlie - (Math.min(this.alpha.echo(view) - kilo, 0) + kilo);
                if (min < 0) {
                    this.charlie = Math.min(golf, -min) + this.charlie;
                    return;
                }
                return;
            }
            return;
        }
        int echo = this.alpha.echo(view);
        int kilo2 = echo - this.alpha.kilo();
        this.charlie = echo;
        if (kilo2 > 0) {
            int golf2 = (this.alpha.golf() - Math.min(0, (this.alpha.golf() - mike) - this.alpha.bravo(view))) - (this.alpha.charlie(view) + echo);
            if (golf2 < 0) {
                this.charlie -= Math.min(kilo2, -golf2);
            }
        }
    }

    public final void delta() {
        this.bravo = -1;
        this.charlie = RecyclerView.UNDEFINED_DURATION;
        this.delta = false;
        this.echo = false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AnchorInfo{mPosition=");
        sb2.append(this.bravo);
        sb2.append(", mCoordinate=");
        sb2.append(this.charlie);
        sb2.append(", mLayoutFromEnd=");
        sb2.append(this.delta);
        sb2.append(", mValid=");
        return P0.gray(sb2, this.echo, '}');
    }
}
