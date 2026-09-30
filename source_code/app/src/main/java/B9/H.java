package B9;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import delivery.samurai.android.R;

/* loaded from: classes2.dex */
public final class H extends G {

    /* renamed from: q, reason: collision with root package name */
    public static final SparseIntArray f144q;

    /* renamed from: p, reason: collision with root package name */
    public long f145p;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f144q = sparseIntArray;
        sparseIntArray.put(R.id.ll_trophy, 1);
        sparseIntArray.put(R.id.siv_trophy_icon, 2);
        sparseIntArray.put(R.id.tv_days_count, 3);
        sparseIntArray.put(R.id.tv_trophy_title, 4);
        sparseIntArray.put(R.id.tv_progress_label, 5);
        sparseIntArray.put(R.id.lpi_trophy_progress, 6);
        sparseIntArray.put(R.id.tv_trophy_desc, 7);
        sparseIntArray.put(R.id.v_separator, 8);
        sparseIntArray.put(R.id.tv_list_label, 9);
        sparseIntArray.put(R.id.rv_trophy_milestones, 10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public H(View view) {
        super(null, view, (LinearProgressIndicator) r0[6], (RecyclerView) r0[10], (ShapeableImageView) r0[2], (TextView) r0[3], (TextView) r0[9], (TextView) r0[5], (TextView) r0[7], (TextView) r0[4], (View) r0[8]);
        Object[] november = z1.g.november(view, 11, null, f144q);
        this.f145p = -1L;
        ((NestedScrollView) november[0]).setTag(null);
        papa(view);
        lima();
    }

    @Override // z1.g
    public final void foxtrot() {
        synchronized (this) {
            this.f145p = 0L;
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f145p != 0) {
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
            this.f145p = 1L;
        }
        oscar();
    }
}
