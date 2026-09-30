package B9;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.network.network.models.PlatformListResponse;
import delivery.samurai.android.R;
import s6.AbstractC2643e5;

/* loaded from: classes2.dex */
public final class T0 extends S0 {

    /* renamed from: k, reason: collision with root package name */
    public static final SparseIntArray f235k;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f236i;

    /* renamed from: j, reason: collision with root package name */
    public long f237j;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f235k = sparseIntArray;
        sparseIntArray.put(R.id.flag, 2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public T0(View view) {
        super(null, view, r1);
        Object[] november = z1.g.november(view, 3, null, f235k);
        ConstraintLayout constraintLayout = (ConstraintLayout) november[0];
        this.f237j = -1L;
        this.f228f.setTag(null);
        TextView textView = (TextView) november[1];
        this.f236i = textView;
        textView.setTag(null);
        papa(view);
        lima();
    }

    @Override // z1.g
    public final void foxtrot() {
        long j5;
        String str;
        synchronized (this) {
            j5 = this.f237j;
            this.f237j = 0L;
        }
        PlatformListResponse platformListResponse = this.f229g;
        Boolean bool = this.f230h;
        long j6 = 5 & j5;
        if (j6 != 0 && platformListResponse != null) {
            str = platformListResponse.getLocalizedName();
        } else {
            str = null;
        }
        if ((j5 & 6) != 0) {
            AbstractC2643e5.echo(this.f236i, bool);
        }
        if (j6 != 0) {
            J2.f.bravo(this.f236i, str);
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f237j != 0) {
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
            this.f237j = 4L;
        }
        oscar();
    }

    @Override // B9.S0
    public final void romeo(Boolean bool) {
        this.f230h = bool;
        synchronized (this) {
            this.f237j |= 2;
        }
        delta();
        oscar();
    }
}
