package B9;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.network.network.models.Score;
import delivery.samurai.android.R;

/* loaded from: classes2.dex */
public final class r1 extends z1.g {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f614k = 0;

    /* renamed from: f, reason: collision with root package name */
    public final ConstraintLayout f615f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f616g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f617h;

    /* renamed from: i, reason: collision with root package name */
    public Score f618i;

    /* renamed from: j, reason: collision with root package name */
    public long f619j;

    public r1(z1.c cVar, View view, ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        super(view, 0, cVar);
        this.f615f = constraintLayout;
        this.f616g = textView;
        this.f617h = textView2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0055  */
    @Override // z1.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void foxtrot() {
        long j5;
        boolean z2;
        String str;
        String str2;
        long j6;
        Double d4;
        synchronized (this) {
            j5 = this.f619j;
            this.f619j = 0L;
        }
        Score score = this.f618i;
        long j7 = j5 & 3;
        String str3 = null;
        if (j7 != 0) {
            if (score != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (j7 != 0) {
                if (z2) {
                    j5 |= 8;
                } else {
                    j5 |= 4;
                }
            }
            if (score != null) {
                str = score.getTitle();
                if ((8 & j5) == 0) {
                    if (score != null) {
                        d4 = score.getScore();
                    } else {
                        d4 = null;
                    }
                    str2 = String.format(this.f616g.getResources().getString(R.string.score_with_percent), d4);
                } else {
                    str2 = null;
                }
                j6 = j5 & 3;
                if (j6 != 0) {
                    if (!z2) {
                        str2 = "";
                    }
                    str3 = str2;
                }
                if (j6 == 0) {
                    J2.f.bravo(this.f616g, str3);
                    J2.f.bravo(this.f617h, str);
                    return;
                }
                return;
            }
        } else {
            z2 = false;
        }
        str = null;
        if ((8 & j5) == 0) {
        }
        j6 = j5 & 3;
        if (j6 != 0) {
        }
        if (j6 == 0) {
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f619j != 0) {
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // z1.g
    public final void lima() {
        synchronized (this) {
            this.f619j = 2L;
        }
        oscar();
    }
}
