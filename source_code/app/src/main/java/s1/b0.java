package s1;

import android.view.View;
import android.view.Window;
import androidx.recyclerview.widget.RecyclerView;
import g.C1718a;

/* loaded from: classes3.dex */
public class b0 extends t6.ab {
    public final Window alpha;
    public final C1718a bravo;

    public b0(Window window, C1718a c1718a) {
        this.alpha = window;
        this.bravo = c1718a;
    }

    @Override // t6.ab
    public final void alpha(int i4) {
        for (int i5 = 1; i5 <= 512; i5 <<= 1) {
            if ((i4 & i5) != 0) {
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 == 8) {
                            ((aa) this.bravo.purple).alpha();
                        }
                    } else {
                        golf(2);
                    }
                } else {
                    golf(4);
                }
            }
        }
    }

    @Override // t6.ab
    public final boolean bravo() {
        if ((this.alpha.getDecorView().getSystemUiVisibility() & 8192) != 0) {
            return true;
        }
        return false;
    }

    @Override // t6.ab
    public final void echo(boolean z2) {
        if (z2) {
            Window window = this.alpha;
            window.clearFlags(67108864);
            window.addFlags(RecyclerView.UNDEFINED_DURATION);
            golf(8192);
            return;
        }
        hotel(8192);
    }

    @Override // t6.ab
    public final void foxtrot() {
        this.alpha.getDecorView().setTag(356039078, 2);
        hotel(2048);
        golf(4096);
    }

    public final void golf(int i4) {
        View decorView = this.alpha.getDecorView();
        decorView.setSystemUiVisibility(i4 | decorView.getSystemUiVisibility());
    }

    public final void hotel(int i4) {
        View decorView = this.alpha.getDecorView();
        decorView.setSystemUiVisibility((~i4) & decorView.getSystemUiVisibility());
    }
}
