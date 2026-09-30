package B9;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.network.network.models.City;
import delivery.samurai.android.R;
import s6.AbstractC2643e5;

/* renamed from: B9.i0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0045i0 extends AbstractC0043h0 {

    /* renamed from: l, reason: collision with root package name */
    public static final SparseIntArray f490l;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f491j;

    /* renamed from: k, reason: collision with root package name */
    public long f492k;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f490l = sparseIntArray;
        sparseIntArray.put(R.id.flag, 2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0045i0(View view) {
        super(null, view, r1);
        Object[] november = z1.g.november(view, 3, null, f490l);
        ConstraintLayout constraintLayout = (ConstraintLayout) november[0];
        this.f492k = -1L;
        this.f483f.setTag(null);
        TextView textView = (TextView) november[1];
        this.f491j = textView;
        textView.setTag(null);
        papa(view);
        lima();
    }

    @Override // z1.g
    public final void foxtrot() {
        long j5;
        String str;
        synchronized (this) {
            j5 = this.f492k;
            this.f492k = 0L;
        }
        City city = this.f484g;
        Boolean bool = this.f485h;
        long j6 = 5 & j5;
        if (j6 != 0 && city != null) {
            str = city.getLocalizedName();
        } else {
            str = null;
        }
        if ((j5 & 6) != 0) {
            AbstractC2643e5.echo(this.f491j, bool);
        }
        if (j6 != 0) {
            J2.f.bravo(this.f491j, str);
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f492k != 0) {
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
            this.f492k = 4L;
        }
        oscar();
    }

    @Override // B9.AbstractC0043h0
    public final void romeo(Boolean bool) {
        this.f485h = bool;
        synchronized (this) {
            this.f492k |= 2;
        }
        delta();
        oscar();
    }
}
