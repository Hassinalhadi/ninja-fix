package B9;

import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.measurement.C1298c;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import delivery.samurai.android.R;

/* renamed from: B9.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0044i extends AbstractC0042h {

    /* renamed from: q, reason: collision with root package name */
    public static final SparseIntArray f488q;

    /* renamed from: p, reason: collision with root package name */
    public long f489p;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f488q = sparseIntArray;
        sparseIntArray.put(R.id.appBarLayout, 1);
        sparseIntArray.put(R.id.toolbar, 2);
        sparseIntArray.put(R.id.customerInfoCard, 3);
        sparseIntArray.put(R.id.tvAddressTitle, 4);
        sparseIntArray.put(R.id.tvAddressDesc, 5);
        sparseIntArray.put(R.id.tvCustomerPhotosLabel, 6);
        sparseIntArray.put(R.id.rvCustomerPhotos, 7);
        sparseIntArray.put(R.id.cvDriverNotes, 8);
        sparseIntArray.put(R.id.tvDriverNote, 9);
        sparseIntArray.put(R.id.cvDriverMap, 10);
        sparseIntArray.put(R.id.driverMapStub, 11);
        sparseIntArray.put(R.id.llDriverPhotosSection, 12);
        sparseIntArray.put(R.id.tvDriverPhotosLabel, 13);
        sparseIntArray.put(R.id.rvDriverPhotos, 14);
        sparseIntArray.put(R.id.llBottomActions, 15);
        sparseIntArray.put(R.id.btnCallCustomer, 16);
        sparseIntArray.put(R.id.btnSkipCall, 17);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0044i(View view) {
        super(null, view, r0, r4, r5, r6, r7, (RecyclerView) r16[7], (RecyclerView) r16[14], (Toolbar) r16[2], (TextView) r16[5], (TextView) r16[4], (TextView) r16[6], (TextView) r16[9], (TextView) r16[13]);
        Object[] november = z1.g.november(view, 18, null, f488q);
        MaterialButton materialButton = (MaterialButton) november[16];
        MaterialButton materialButton2 = (MaterialButton) november[17];
        MaterialCardView materialCardView = (MaterialCardView) november[10];
        MaterialCardView materialCardView2 = (MaterialCardView) november[8];
        ViewStub viewStub = (ViewStub) november[11];
        C1298c c1298c = new C1298c(12);
        viewStub.setOnInflateListener(new z1.h(c1298c));
        this.f489p = -1L;
        this.f476i.silver = this;
        ((CoordinatorLayout) november[0]).setTag(null);
        papa(view);
        lima();
    }

    @Override // z1.g
    public final void foxtrot() {
        synchronized (this) {
            this.f489p = 0L;
        }
        z1.g gVar = (z1.g) this.f476i.purple;
        if (gVar != null) {
            gVar.golf();
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f489p != 0) {
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
            this.f489p = 2L;
        }
        oscar();
    }
}
