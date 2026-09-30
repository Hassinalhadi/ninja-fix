package s6;

import com.stfalcon.imageviewer.common.pager.MultiTouchViewPager;
import l9.C2061a;

/* renamed from: s6.t6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2778t6 {
    public final /* synthetic */ int alpha = 1;

    public static C2061a alpha(MultiTouchViewPager multiTouchViewPager, u9.a aVar, Ce.l lVar, int i4) {
        if ((i4 & 2) != 0) {
            aVar = null;
        }
        if ((i4 & 4) != 0) {
            lVar = null;
        }
        C2061a c2061a = new C2061a(aVar, lVar);
        multiTouchViewPager.addOnPageChangeListener(c2061a);
        return c2061a;
    }

    public abstract String bravo();

    public String toString() {
        switch (this.alpha) {
            case 1:
                return bravo();
            default:
                return super.toString();
        }
    }
}
