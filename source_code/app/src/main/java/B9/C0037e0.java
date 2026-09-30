package B9;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.app.network.network.models.Bank;
import delivery.samurai.android.R;
import s6.AbstractC2643e5;

/* renamed from: B9.e0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0037e0 extends AbstractC0035d0 {

    /* renamed from: l, reason: collision with root package name */
    public static final SparseIntArray f444l;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f445j;

    /* renamed from: k, reason: collision with root package name */
    public long f446k;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f444l = sparseIntArray;
        sparseIntArray.put(R.id.flag, 2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0037e0(View view) {
        super(null, view, r1);
        Object[] november = z1.g.november(view, 3, null, f444l);
        LinearLayout linearLayout = (LinearLayout) november[0];
        this.f446k = -1L;
        this.f439f.setTag(null);
        TextView textView = (TextView) november[1];
        this.f445j = textView;
        textView.setTag(null);
        papa(view);
        lima();
    }

    @Override // z1.g
    public final void foxtrot() {
        long j5;
        String str;
        synchronized (this) {
            j5 = this.f446k;
            this.f446k = 0L;
        }
        Boolean bool = this.f441h;
        Bank bank = this.f440g;
        long j6 = 5 & j5;
        long j7 = j5 & 6;
        if (j7 != 0 && bank != null) {
            str = bank.getLocalizedName();
        } else {
            str = null;
        }
        if (j6 != 0) {
            AbstractC2643e5.echo(this.f445j, bool);
        }
        if (j7 != 0) {
            J2.f.bravo(this.f445j, str);
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f446k != 0) {
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
            this.f446k = 4L;
        }
        oscar();
    }

    @Override // B9.AbstractC0035d0
    public final void romeo(Boolean bool) {
        this.f441h = bool;
        synchronized (this) {
            this.f446k |= 1;
        }
        delta();
        oscar();
    }
}
