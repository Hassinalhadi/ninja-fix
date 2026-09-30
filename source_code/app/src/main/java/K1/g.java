package K1;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.L;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.as;

/* loaded from: classes3.dex */
public abstract class g {
    public int alpha;
    public final Object bravo;
    public final Object charlie;

    public g(L l10) {
        this.alpha = RecyclerView.UNDEFINED_DURATION;
        this.charlie = new Rect();
        this.bravo = l10;
    }

    public static g alpha(L l10, int i4) {
        if (i4 != 0) {
            if (i4 == 1) {
                return new as(l10, 1);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return new as(l10, 0);
    }

    public abstract int bravo(View view);

    public abstract int charlie(View view);

    public abstract int delta(View view);

    public abstract int echo(View view);

    public abstract int foxtrot();

    public abstract int golf();

    public abstract int hotel();

    public abstract int india();

    public abstract int juliet();

    public abstract int kilo();

    public abstract int lima();

    public int mike() {
        if (Integer.MIN_VALUE == this.alpha) {
            return 0;
        }
        return lima() - this.alpha;
    }

    public abstract int november(View view);

    public abstract int oscar(View view);

    public abstract void papa(int i4);

    public g(j jVar) {
        this.alpha = 0;
        this.charlie = new d();
        this.bravo = jVar;
    }
}
