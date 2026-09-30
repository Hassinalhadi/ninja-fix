package g7;

import android.graphics.RectF;
import android.view.View;
import com.google.android.material.navigation.NavigationView;

/* loaded from: classes2.dex */
public final class z extends y {
    public boolean foxtrot = false;
    public float golf = 0.0f;

    public z(NavigationView navigationView) {
        delta(navigationView);
    }

    private void delta(View view) {
        view.setOutlineProvider(new R6.c(1, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010b  */
    @Override // g7.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void alpha(NavigationView navigationView) {
        float f5;
        boolean z2;
        m mVar;
        m mVar2;
        RectF rectF;
        m mVar3 = this.charlie;
        if (mVar3 != null && (rectF = this.delta) != null) {
            f5 = mVar3.foxtrot.alpha(rectF);
        } else {
            f5 = 0.0f;
        }
        this.golf = f5;
        boolean z10 = false;
        if (!this.delta.isEmpty() && (mVar2 = this.charlie) != null) {
            z2 = mVar2.foxtrot(this.delta);
        } else {
            z2 = false;
        }
        if (!z2) {
            if (!this.delta.isEmpty() && (mVar = this.charlie) != null && this.bravo && !mVar.foxtrot(this.delta)) {
                m mVar4 = this.charlie;
                if ((mVar4.alpha instanceof k) && (mVar4.bravo instanceof k) && (mVar4.delta instanceof k) && (mVar4.charlie instanceof k)) {
                    float alpha = mVar4.echo.alpha(this.delta);
                    float alpha2 = this.charlie.foxtrot.alpha(this.delta);
                    float alpha3 = this.charlie.hotel.alpha(this.delta);
                    float alpha4 = this.charlie.golf.alpha(this.delta);
                    if (alpha == 0.0f && alpha3 == 0.0f && alpha2 == alpha4) {
                        RectF rectF2 = this.delta;
                        rectF2.set(rectF2.left - alpha2, rectF2.top, rectF2.right, rectF2.bottom);
                        this.golf = alpha2;
                    } else if (alpha == 0.0f && alpha2 == 0.0f && alpha3 == alpha4) {
                        RectF rectF3 = this.delta;
                        rectF3.set(rectF3.left, rectF3.top - alpha3, rectF3.right, rectF3.bottom);
                        this.golf = alpha3;
                    } else if (alpha2 == 0.0f && alpha4 == 0.0f && alpha == alpha3) {
                        RectF rectF4 = this.delta;
                        rectF4.set(rectF4.left, rectF4.top, rectF4.right + alpha, rectF4.bottom);
                        this.golf = alpha;
                    } else if (alpha3 == 0.0f && alpha4 == 0.0f && alpha == alpha2) {
                        RectF rectF5 = this.delta;
                        rectF5.set(rectF5.left, rectF5.top, rectF5.right, rectF5.bottom + alpha);
                        this.golf = alpha;
                    }
                }
            }
            this.foxtrot = z10;
            navigationView.setClipToOutline(!bravo());
            if (!bravo()) {
                navigationView.invalidate();
                return;
            } else {
                navigationView.invalidateOutline();
                return;
            }
        }
        z10 = true;
        this.foxtrot = z10;
        navigationView.setClipToOutline(!bravo());
        if (!bravo()) {
        }
    }

    @Override // g7.y
    public final boolean bravo() {
        if (this.foxtrot && !this.alpha) {
            return false;
        }
        return true;
    }
}
