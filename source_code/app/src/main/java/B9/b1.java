package B9;

import android.util.SparseIntArray;
import com.google.android.material.textview.MaterialTextView;
import delivery.samurai.android.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b1 extends AbstractC0046j {

    /* renamed from: k, reason: collision with root package name */
    public static final SparseIntArray f422k;

    /* renamed from: j, reason: collision with root package name */
    public long f423j;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f422k = sparseIntArray;
        sparseIntArray.put(R.id.iv_ticket_icon, 5);
    }

    @Override // z1.g
    public final void foxtrot() {
        long j5;
        synchronized (this) {
            j5 = this.f423j;
            this.f423j = 0L;
        }
        long j6 = j5 & 3;
        if (j6 == 0) {
            if (j6 != 0) {
                J2.f.bravo((MaterialTextView) this.f499f, null);
                J2.f.bravo((MaterialTextView) this.f500g, null);
                J2.f.bravo((MaterialTextView) this.f501h, null);
                J2.f.bravo((MaterialTextView) this.f502i, null);
                return;
            }
            return;
        }
        Intrinsics.echo(null, "<this>");
        Intrinsics.delta(new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format((Date) null), "format(...)");
        throw null;
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f423j != 0) {
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
            this.f423j = 2L;
        }
        oscar();
    }
}
