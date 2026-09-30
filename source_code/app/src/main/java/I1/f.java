package I1;

import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import t6.A3;
import y1.C3391d;

/* loaded from: classes3.dex */
public final class f extends A3 {
    public final int alpha;
    public C3391d bravo;
    public final F6.b charlie = new F6.b(3, this);
    public final /* synthetic */ DrawerLayout delta;

    public f(DrawerLayout drawerLayout, int i4) {
        this.delta = drawerLayout;
        this.alpha = i4;
    }

    @Override // t6.A3
    public final int alpha(int i4, View view) {
        DrawerLayout drawerLayout = this.delta;
        if (drawerLayout.alpha(3, view)) {
            return Math.max(-view.getWidth(), Math.min(i4, 0));
        }
        int width = drawerLayout.getWidth();
        return Math.max(width - view.getWidth(), Math.min(i4, width));
    }

    @Override // t6.A3
    public final int bravo(int i4, View view) {
        return view.getTop();
    }

    @Override // t6.A3
    public final int delta(View view) {
        if (DrawerLayout.lima(view)) {
            return view.getWidth();
        }
        return 0;
    }

    @Override // t6.A3
    public final void foxtrot(int i4, int i5) {
        View delta;
        int i10 = i4 & 1;
        DrawerLayout drawerLayout = this.delta;
        if (i10 == 1) {
            delta = drawerLayout.delta(3);
        } else {
            delta = drawerLayout.delta(5);
        }
        if (delta != null && drawerLayout.golf(delta) == 0) {
            this.bravo.bravo(i5, delta);
        }
    }

    @Override // t6.A3
    public final void golf() {
        this.delta.postDelayed(this.charlie, 160L);
    }

    @Override // t6.A3
    public final void hotel(int i4, View view) {
        ((e) view.getLayoutParams()).charlie = false;
        int i5 = 3;
        if (this.alpha == 3) {
            i5 = 5;
        }
        DrawerLayout drawerLayout = this.delta;
        View delta = drawerLayout.delta(i5);
        if (delta != null) {
            drawerLayout.bravo(delta, true);
        }
    }

    @Override // t6.A3
    public final void india(int i4) {
        this.delta.romeo(i4, this.bravo.tango);
    }

    @Override // t6.A3
    public final void juliet(View view, int i4, int i5) {
        float width;
        int i10;
        int width2 = view.getWidth();
        DrawerLayout drawerLayout = this.delta;
        if (drawerLayout.alpha(3, view)) {
            width = i4 + width2;
        } else {
            width = drawerLayout.getWidth() - i4;
        }
        float f5 = width / width2;
        drawerLayout.oscar(view, f5);
        if (f5 == 0.0f) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        view.setVisibility(i10);
        drawerLayout.invalidate();
    }

    @Override // t6.A3
    public final void kilo(View view, float f5, float f10) {
        int i4;
        DrawerLayout drawerLayout = this.delta;
        int[] iArr = DrawerLayout.f3081w;
        float f11 = ((e) view.getLayoutParams()).bravo;
        int width = view.getWidth();
        if (drawerLayout.alpha(3, view)) {
            if (f5 <= 0.0f && (f5 != 0.0f || f11 <= 0.5f)) {
                i4 = -width;
            } else {
                i4 = 0;
            }
        } else {
            int width2 = drawerLayout.getWidth();
            if (f5 < 0.0f || (f5 == 0.0f && f11 > 0.5f)) {
                width2 -= width;
            }
            i4 = width2;
        }
        this.bravo.quebec(i4, view.getTop());
        drawerLayout.invalidate();
    }

    @Override // t6.A3
    public final boolean oscar(int i4, View view) {
        DrawerLayout drawerLayout = this.delta;
        if (DrawerLayout.lima(view) && drawerLayout.alpha(this.alpha, view) && drawerLayout.golf(view) == 0) {
            return true;
        }
        return false;
    }
}
