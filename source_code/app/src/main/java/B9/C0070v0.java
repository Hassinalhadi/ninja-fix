package B9;

import android.util.SparseIntArray;
import delivery.samurai.android.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: B9.v0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0070v0 extends X {

    /* renamed from: l, reason: collision with root package name */
    public static final SparseIntArray f705l;

    /* renamed from: k, reason: collision with root package name */
    public long f706k;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f705l = sparseIntArray;
        sparseIntArray.put(R.id.ll_date, 5);
        sparseIntArray.put(R.id.cl_badge, 6);
        sparseIntArray.put(R.id.medalImage, 7);
    }

    @Override // z1.g
    public final void foxtrot() {
        long j5;
        synchronized (this) {
            j5 = this.f706k;
            this.f706k = 0L;
        }
        long j6 = j5 & 6;
        if (j6 == 0) {
            if (j6 != 0) {
                J2.f.bravo(this.f264f, null);
                J2.f.bravo(this.f265g, null);
                J2.f.bravo(this.f266h, null);
                J2.f.bravo(this.f267i, null);
                return;
            }
            return;
        }
        Intrinsics.echo(null, "<this>");
        Intrinsics.delta(new SimpleDateFormat("dd", Locale.getDefault()).format((Date) null), "format(...)");
        throw null;
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f706k != 0) {
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
            this.f706k = 4L;
        }
        oscar();
    }
}
