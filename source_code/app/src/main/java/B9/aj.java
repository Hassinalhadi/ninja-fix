package B9;

import android.util.SparseIntArray;
import android.view.View;
import androidx.cardview.widget.CardView;
import delivery.samurai.android.R;

/* loaded from: classes2.dex */
public final class aj extends ai {

    /* renamed from: g, reason: collision with root package name */
    public static final SparseIntArray f343g;

    /* renamed from: f, reason: collision with root package name */
    public long f344f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f343g = sparseIntArray;
        sparseIntArray.put(R.id.ivCheck, 1);
        sparseIntArray.put(R.id.tvTitle, 2);
        sparseIntArray.put(R.id.tvSubtitle, 3);
        sparseIntArray.put(R.id.timerContainer, 4);
        sparseIntArray.put(R.id.tvMinutes, 5);
        sparseIntArray.put(R.id.tvColon, 6);
        sparseIntArray.put(R.id.tvSeconds, 7);
        sparseIntArray.put(R.id.tvMinutesLabel, 8);
        sparseIntArray.put(R.id.tvSecondsLabel, 9);
        sparseIntArray.put(R.id.btnGotIt, 10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj(View view) {
        super(view, 0, null);
        Object[] november = z1.g.november(view, 11, null, f343g);
        this.f344f = -1L;
        ((CardView) november[0]).setTag(null);
        papa(view);
        lima();
    }

    @Override // z1.g
    public final void foxtrot() {
        synchronized (this) {
            this.f344f = 0L;
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f344f != 0) {
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
            this.f344f = 1L;
        }
        oscar();
    }
}
