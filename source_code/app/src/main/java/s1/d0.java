package s1;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import g.C1718a;

/* loaded from: classes3.dex */
public class d0 extends t6.ab {
    public final WindowInsetsController alpha;
    public final C1718a bravo;
    public final Window charlie;

    public d0(Window window, C1718a c1718a) {
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.alpha = insetsController;
        this.bravo = c1718a;
        this.charlie = window;
    }

    @Override // t6.ab
    public final void alpha(int i4) {
        if ((i4 & 8) != 0) {
            ((aa) this.bravo.purple).alpha();
        }
        this.alpha.hide(i4 & (-9));
    }

    @Override // t6.ab
    public boolean bravo() {
        int systemBarsAppearance;
        this.alpha.setSystemBarsAppearance(0, 0);
        systemBarsAppearance = this.alpha.getSystemBarsAppearance();
        if ((systemBarsAppearance & 8) != 0) {
            return true;
        }
        return false;
    }

    @Override // t6.ab
    public final void delta(boolean z2) {
        Window window = this.charlie;
        if (z2) {
            if (window != null) {
                golf(16);
            }
            this.alpha.setSystemBarsAppearance(16, 16);
        } else {
            if (window != null) {
                hotel(16);
            }
            this.alpha.setSystemBarsAppearance(0, 16);
        }
    }

    @Override // t6.ab
    public final void echo(boolean z2) {
        Window window = this.charlie;
        if (z2) {
            if (window != null) {
                golf(8192);
            }
            this.alpha.setSystemBarsAppearance(8, 8);
        } else {
            if (window != null) {
                hotel(8192);
            }
            this.alpha.setSystemBarsAppearance(0, 8);
        }
    }

    @Override // t6.ab
    public void foxtrot() {
        Window window = this.charlie;
        if (window == null) {
            this.alpha.setSystemBarsBehavior(2);
            return;
        }
        window.getDecorView().setTag(356039078, 2);
        hotel(2048);
        golf(4096);
    }

    public final void golf(int i4) {
        View decorView = this.charlie.getDecorView();
        decorView.setSystemUiVisibility(i4 | decorView.getSystemUiVisibility());
    }

    public final void hotel(int i4) {
        View decorView = this.charlie.getDecorView();
        decorView.setSystemUiVisibility((~i4) & decorView.getSystemUiVisibility());
    }
}
