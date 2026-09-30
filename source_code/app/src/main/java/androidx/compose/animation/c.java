package androidx.compose.animation;

import Q0.m;
import T.s;
import androidx.recyclerview.widget.RecyclerView;
import bz.AbstractC0779d;
import bz.aa;
import t6.AbstractC3087z;

/* loaded from: classes3.dex */
public abstract class c {
    public static final long alpha;

    static {
        long j5 = RecyclerView.UNDEFINED_DURATION;
        alpha = (j5 & 4294967295L) | (j5 << 32);
    }

    public static s alpha(s sVar, aa aaVar, int i4) {
        if ((i4 & 1) != 0) {
            long j5 = 1;
            aaVar = AbstractC0779d.juliet(400.0f, new m((j5 & 4294967295L) | (j5 << 32)), 1);
        }
        return AbstractC3087z.bravo(sVar).then(new SizeAnimationModifierElement(aaVar));
    }
}
