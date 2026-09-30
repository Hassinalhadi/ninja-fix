package B9;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.button.MaterialButton;
import delivery.samurai.android.R;

/* renamed from: B9.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0034d extends AbstractC0032c {

    /* renamed from: l, reason: collision with root package name */
    public static final SparseIntArray f436l;

    /* renamed from: k, reason: collision with root package name */
    public long f437k;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f436l = sparseIntArray;
        sparseIntArray.put(R.id.toolbar, 2);
        sparseIntArray.put(R.id.swipe_refresh, 3);
        sparseIntArray.put(R.id.rv_all_address_notes, 4);
        sparseIntArray.put(R.id.pb_loading, 5);
        sparseIntArray.put(R.id.cv_add_note, 6);
        sparseIntArray.put(R.id.btn_add_address, 7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0034d(View view) {
        super(null, view, r6, r7, r8, r9, (TextView) r0[1]);
        Object[] november = z1.g.november(view, 8, null, f436l);
        MaterialButton materialButton = (MaterialButton) november[7];
        ProgressBar progressBar = (ProgressBar) november[5];
        RecyclerView recyclerView = (RecyclerView) november[4];
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) november[3];
        this.f437k = -1L;
        ((ConstraintLayout) november[0]).setTag(null);
        this.f428j.setTag(null);
        papa(view);
        lima();
    }

    @Override // z1.g
    public final void foxtrot() {
        long j5;
        synchronized (this) {
            j5 = this.f437k;
            this.f437k = 0L;
        }
        if ((j5 & 3) != 0) {
            J2.f.bravo(this.f428j, null);
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f437k != 0) {
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
            this.f437k = 2L;
        }
        oscar();
    }
}
