package L1;

import K1.k;
import android.text.InputFilter;
import android.widget.TextView;
import s6.AbstractC2662g6;

/* loaded from: classes3.dex */
public final class g extends AbstractC2662g6 {
    public final f alpha;

    public g(TextView textView) {
        this.alpha = new f(textView);
    }

    @Override // s6.AbstractC2662g6
    public final InputFilter[] bravo(InputFilter[] inputFilterArr) {
        if (!k.delta()) {
            return inputFilterArr;
        }
        return this.alpha.bravo(inputFilterArr);
    }

    @Override // s6.AbstractC2662g6
    public final boolean charlie() {
        return this.alpha.charlie;
    }

    @Override // s6.AbstractC2662g6
    public final void delta(boolean z2) {
        if (!k.delta()) {
            return;
        }
        this.alpha.delta(z2);
    }

    @Override // s6.AbstractC2662g6
    public final void echo(boolean z2) {
        boolean delta = k.delta();
        f fVar = this.alpha;
        if (!delta) {
            fVar.charlie = z2;
        } else {
            fVar.echo(z2);
        }
    }
}
