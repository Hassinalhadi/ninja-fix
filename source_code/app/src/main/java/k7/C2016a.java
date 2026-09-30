package k7;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.gms.measurement.internal.C1469t;
import com.google.android.material.tabs.TabLayout;

/* renamed from: k7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2016a extends C1469t {
    public final /* synthetic */ int silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2016a(int i4) {
        super(11);
        this.silver = i4;
    }

    @Override // com.google.android.gms.measurement.internal.C1469t
    public final void charlie(TabLayout tabLayout, View view, View view2, float f5, Drawable drawable) {
        float cos;
        float f10;
        float bravo;
        switch (this.silver) {
            case 0:
                RectF alpha = C1469t.alpha(tabLayout, view);
                RectF alpha2 = C1469t.alpha(tabLayout, view2);
                if (alpha.left < alpha2.left) {
                    double d4 = (f5 * 3.141592653589793d) / 2.0d;
                    f10 = (float) (1.0d - Math.cos(d4));
                    cos = (float) Math.sin(d4);
                } else {
                    double d9 = (f5 * 3.141592653589793d) / 2.0d;
                    float sin = (float) Math.sin(d9);
                    cos = (float) (1.0d - Math.cos(d9));
                    f10 = sin;
                }
                drawable.setBounds(M6.a.charlie((int) alpha.left, (int) alpha2.left, f10), drawable.getBounds().top, M6.a.charlie((int) alpha.right, (int) alpha2.right, cos), drawable.getBounds().bottom);
                return;
            default:
                if (f5 >= 0.5f) {
                    view = view2;
                }
                RectF alpha3 = C1469t.alpha(tabLayout, view);
                if (f5 < 0.5f) {
                    bravo = M6.a.bravo(1.0f, 0.0f, 0.0f, 0.5f, f5);
                } else {
                    bravo = M6.a.bravo(0.0f, 1.0f, 0.5f, 1.0f, f5);
                }
                drawable.setBounds((int) alpha3.left, drawable.getBounds().top, (int) alpha3.right, drawable.getBounds().bottom);
                drawable.setAlpha((int) (bravo * 255.0f));
                return;
        }
    }
}
