package B9;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.android.material.button.MaterialButton;
import delivery.samurai.android.R;
import okhttp3.internal.ws.RealWebSocket;

/* renamed from: B9.y0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0076y0 extends X {

    /* renamed from: l, reason: collision with root package name */
    public static final SparseIntArray f728l;

    /* renamed from: k, reason: collision with root package name */
    public long f729k;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f728l = sparseIntArray;
        sparseIntArray.put(R.id.taskName, 6);
        sparseIntArray.put(R.id.tvDebugProximity, 7);
        sparseIntArray.put(R.id.imageView2, 8);
        sparseIntArray.put(R.id.title, 9);
        sparseIntArray.put(R.id.expandIcon, 10);
        sparseIntArray.put(R.id.cl_content_container, 11);
        sparseIntArray.put(R.id.tvAddress, 12);
        sparseIntArray.put(R.id.imagesRecyclerView, 13);
        sparseIntArray.put(R.id.clNotes, 14);
        sparseIntArray.put(R.id.ivAddNoteIcon, 15);
        sparseIntArray.put(R.id.tvAddNoteTitle, 16);
        sparseIntArray.put(R.id.tvNoteDesc, 17);
        sparseIntArray.put(R.id.rvAddressNotesCards, 18);
        sparseIntArray.put(R.id.clTakeProof, 19);
        sparseIntArray.put(R.id.ivTakeProofIcon, 20);
        sparseIntArray.put(R.id.tvTakeProofTitle, 21);
        sparseIntArray.put(R.id.tvTakeProofSubtitle, 22);
        sparseIntArray.put(R.id.btnTakeProofPhoto, 23);
        sparseIntArray.put(R.id.rvProofImages, 24);
        sparseIntArray.put(R.id.tvProofMessage, 25);
        sparseIntArray.put(R.id.btnProcessOrder, 26);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0076y0(View view) {
        super((z1.c) null, view, r6, r7, r8, r9, r10);
        Object[] november = z1.g.november(view, 27, null, f728l);
        MaterialButton materialButton = (MaterialButton) november[3];
        MaterialButton materialButton2 = (MaterialButton) november[5];
        MaterialButton materialButton3 = (MaterialButton) november[2];
        TextView textView = (TextView) november[4];
        TextView textView2 = (TextView) november[1];
        this.f729k = -1L;
        ((MaterialButton) this.f266h).setTag(null);
        ((MaterialButton) this.f267i).setTag(null);
        ((LinearLayoutCompat) november[0]).setTag(null);
        ((MaterialButton) this.f268j).setTag(null);
        this.f264f.setTag(null);
        this.f265g.setTag(null);
        papa(view);
        lima();
    }

    @Override // z1.g
    public final void foxtrot() {
        long j5;
        int i4;
        synchronized (this) {
            j5 = this.f729k;
            this.f729k = 0L;
        }
        long j6 = j5 & 3;
        if (j6 != 0) {
            if (j6 != 0) {
                j5 |= 16;
            }
            if ((j5 & 3) != 0) {
                j5 |= 256;
            }
            if ((j5 & 3) != 0) {
                j5 |= 4;
            }
            if ((j5 & 3) != 0) {
                j5 |= RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
            }
            if ((j5 & 3) != 0) {
                j5 |= 64;
            }
            i4 = 8;
        } else {
            i4 = 0;
        }
        int i5 = i4;
        if ((j5 & 3) != 0) {
            ((MaterialButton) this.f266h).setVisibility(i4);
            ((MaterialButton) this.f267i).setVisibility(i5);
            ((MaterialButton) this.f268j).setVisibility(i5);
            J2.f.bravo(this.f264f, null);
            this.f264f.setVisibility(i5);
            this.f265g.setVisibility(i5);
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f729k != 0) {
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
            this.f729k = 2L;
        }
        oscar();
    }
}
