package androidx.recyclerview.widget;

import android.view.View;
import com.airbnb.lottie.compose.LottieConstants;
import java.util.List;

/* loaded from: classes3.dex */
public final class am {
    public boolean alpha;
    public int bravo;
    public int charlie;
    public int delta;
    public int echo;
    public int foxtrot;
    public int golf;
    public int hotel;
    public int india;
    public int juliet;
    public List kilo;
    public boolean lima;

    public final void alpha(View view) {
        int layoutPosition;
        int size = this.kilo.size();
        View view2 = null;
        int i4 = LottieConstants.IterateForever;
        for (int i5 = 0; i5 < size; i5++) {
            View view3 = ((f0) this.kilo.get(i5)).itemView;
            M m4 = (M) view3.getLayoutParams();
            if (view3 != view && !m4.alpha.isRemoved() && (layoutPosition = (m4.alpha.getLayoutPosition() - this.delta) * this.echo) >= 0 && layoutPosition < i4) {
                view2 = view3;
                if (layoutPosition == 0) {
                    break;
                } else {
                    i4 = layoutPosition;
                }
            }
        }
        if (view2 == null) {
            this.delta = -1;
        } else {
            this.delta = ((M) view2.getLayoutParams()).alpha.getLayoutPosition();
        }
    }

    public final View bravo(U u4) {
        List list = this.kilo;
        if (list != null) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = ((f0) this.kilo.get(i4)).itemView;
                M m4 = (M) view.getLayoutParams();
                if (!m4.alpha.isRemoved() && this.delta == m4.alpha.getLayoutPosition()) {
                    alpha(view);
                    return view;
                }
            }
            return null;
        }
        View delta = u4.delta(this.delta);
        this.delta += this.echo;
        return delta;
    }
}
