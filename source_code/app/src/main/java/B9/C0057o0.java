package B9;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.network.network.models.Country;
import delivery.samurai.android.R;
import s6.AbstractC2643e5;

/* renamed from: B9.o0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0057o0 extends AbstractC0055n0 {

    /* renamed from: m, reason: collision with root package name */
    public static final SparseIntArray f584m;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f585k;

    /* renamed from: l, reason: collision with root package name */
    public long f586l;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f584m = sparseIntArray;
        sparseIntArray.put(R.id.flag, 2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0057o0(View view) {
        super(null, view, r1);
        Object[] november = z1.g.november(view, 3, null, f584m);
        ConstraintLayout constraintLayout = (ConstraintLayout) november[0];
        this.f586l = -1L;
        this.f572f.setTag(null);
        TextView textView = (TextView) november[1];
        this.f585k = textView;
        textView.setTag(null);
        papa(view);
        lima();
    }

    @Override // z1.g
    public final void foxtrot() {
        long j5;
        boolean z2;
        String str;
        String str2;
        String str3;
        synchronized (this) {
            j5 = this.f586l;
            this.f586l = 0L;
        }
        Country country = this.f573g;
        Boolean bool = this.f575i;
        Boolean bool2 = this.f574h;
        long j6 = j5 & 11;
        boolean z10 = false;
        if (j6 != 0) {
            if (bool == null) {
                z2 = false;
            } else {
                z2 = bool.booleanValue();
            }
            if (j6 != 0) {
                j5 = z2 ? j5 | 128 : j5 | 64;
            }
        } else {
            z2 = false;
        }
        String str4 = null;
        if ((j5 & 192) != 0) {
            if ((128 & j5) != 0 && country != null) {
                str = country.getLocalizedName();
            } else {
                str = null;
            }
            long j7 = j5 & 64;
            if (j7 != 0) {
                if (country != null) {
                    str2 = country.getDemonym();
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    z10 = str2.isEmpty();
                }
                if (j7 != 0) {
                    if (z10) {
                        j5 |= 32;
                    } else {
                        j5 |= 16;
                    }
                }
            } else {
                str2 = null;
            }
        } else {
            str = null;
            str2 = null;
        }
        if ((j5 & 32) != 0 && country != null) {
            str3 = country.getName();
        } else {
            str3 = null;
        }
        if ((64 & j5) != 0) {
            if (z10) {
                str2 = str3;
            }
        } else {
            str2 = null;
        }
        long j10 = 11 & j5;
        if (j10 != 0) {
            if (z2) {
                str4 = str;
            } else {
                str4 = str2;
            }
        }
        String str5 = str4;
        if ((j5 & 12) != 0) {
            AbstractC2643e5.echo(this.f585k, bool2);
        }
        if (j10 != 0) {
            J2.f.bravo(this.f585k, str5);
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f586l != 0) {
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
            this.f586l = 8L;
        }
        oscar();
    }

    @Override // B9.AbstractC0055n0
    public final void romeo(Boolean bool) {
        this.f574h = bool;
        synchronized (this) {
            this.f586l |= 4;
        }
        delta();
        oscar();
    }

    @Override // B9.AbstractC0055n0
    public final void sierra(Boolean bool) {
        this.f575i = bool;
        synchronized (this) {
            this.f586l |= 2;
        }
        delta();
        oscar();
    }
}
