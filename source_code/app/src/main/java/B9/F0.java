package B9;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.android.material.button.MaterialButton;
import delivery.samurai.android.R;
import okhttp3.internal.ws.RealWebSocket;

/* loaded from: classes2.dex */
public final class F0 extends E0 {

    /* renamed from: l, reason: collision with root package name */
    public static final SparseIntArray f130l;

    /* renamed from: k, reason: collision with root package name */
    public long f131k;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f130l = sparseIntArray;
        sparseIntArray.put(R.id.tvDebugProximity, 6);
        sparseIntArray.put(R.id.receiptInfo, 7);
        sparseIntArray.put(R.id.imageView2, 8);
        sparseIntArray.put(R.id.expandIcon, 9);
        sparseIntArray.put(R.id.title, 10);
        sparseIntArray.put(R.id.cl_content_container, 11);
        sparseIntArray.put(R.id.tvAddress, 12);
        sparseIntArray.put(R.id.clNotes, 13);
        sparseIntArray.put(R.id.ivAddNoteIcon, 14);
        sparseIntArray.put(R.id.tvAddNoteTitle, 15);
        sparseIntArray.put(R.id.tvNoteDesc, 16);
        sparseIntArray.put(R.id.btnProcessOrder, 17);
        sparseIntArray.put(R.id.llc, 18);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public F0(View view) {
        super(null, view, r6, r7, r8, r9, r10);
        Object[] november = z1.g.november(view, 19, null, f130l);
        MaterialButton materialButton = (MaterialButton) november[4];
        MaterialButton materialButton2 = (MaterialButton) november[3];
        ImageView imageView = (ImageView) november[1];
        MaterialButton materialButton3 = (MaterialButton) november[5];
        TextView textView = (TextView) november[2];
        this.f131k = -1L;
        this.f124f.setTag(null);
        this.f125g.setTag(null);
        this.f126h.setTag(null);
        ((LinearLayoutCompat) november[0]).setTag(null);
        this.f127i.setTag(null);
        this.f128j.setTag(null);
        papa(view);
        lima();
    }

    @Override // z1.g
    public final void foxtrot() {
        long j5;
        int i4;
        synchronized (this) {
            j5 = this.f131k;
            this.f131k = 0L;
        }
        long j6 = j5 & 3;
        if (j6 != 0) {
            if (j6 != 0) {
                j5 |= 4;
            }
            if ((j5 & 3) != 0) {
                j5 |= 256;
            }
            if ((j5 & 3) != 0) {
                j5 |= 16;
            }
            if ((j5 & 3) != 0) {
                j5 |= 64;
            }
            if ((j5 & 3) != 0) {
                j5 |= RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
            }
            i4 = 8;
        } else {
            i4 = 0;
        }
        int i5 = i4;
        if ((j5 & 3) != 0) {
            this.f124f.setVisibility(i4);
            this.f125g.setVisibility(i5);
            this.f126h.setVisibility(i5);
            this.f127i.setVisibility(i5);
            this.f128j.setVisibility(i5);
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f131k != 0) {
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
            this.f131k = 2L;
        }
        oscar();
    }
}
