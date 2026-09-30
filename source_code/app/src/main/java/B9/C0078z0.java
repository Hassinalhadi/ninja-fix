package B9;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.android.material.button.MaterialButton;
import delivery.samurai.android.R;

/* renamed from: B9.z0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0078z0 extends AbstractC0046j {

    /* renamed from: k, reason: collision with root package name */
    public static final SparseIntArray f732k;

    /* renamed from: j, reason: collision with root package name */
    public long f733j;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f732k = sparseIntArray;
        sparseIntArray.put(R.id.taskName, 5);
        sparseIntArray.put(R.id.imageView2, 6);
        sparseIntArray.put(R.id.title, 7);
        sparseIntArray.put(R.id.expandIcon, 8);
        sparseIntArray.put(R.id.cl_content_container, 9);
        sparseIntArray.put(R.id.tvAddress, 10);
        sparseIntArray.put(R.id.imagesRecyclerView, 11);
        sparseIntArray.put(R.id.clNotes, 12);
        sparseIntArray.put(R.id.ivAddNoteIcon, 13);
        sparseIntArray.put(R.id.tvAddNoteTitle, 14);
        sparseIntArray.put(R.id.tvNoteDesc, 15);
        sparseIntArray.put(R.id.rvAddressNotesCards, 16);
        sparseIntArray.put(R.id.clTakeProof, 17);
        sparseIntArray.put(R.id.ivTakeProofIcon, 18);
        sparseIntArray.put(R.id.tvTakeProofTitle, 19);
        sparseIntArray.put(R.id.tvTakeProofSubtitle, 20);
        sparseIntArray.put(R.id.btnTakeProofPhoto, 21);
        sparseIntArray.put(R.id.rvProofImages, 22);
        sparseIntArray.put(R.id.tvProofMessage, 23);
        sparseIntArray.put(R.id.btnProcessOrder, 24);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0078z0(View view) {
        super((z1.c) null, view, r6, r7, r8, r9);
        Object[] november = z1.g.november(view, 25, null, f732k);
        MaterialButton materialButton = (MaterialButton) november[2];
        MaterialButton materialButton2 = (MaterialButton) november[3];
        MaterialButton materialButton3 = (MaterialButton) november[1];
        TextView textView = (TextView) november[4];
        this.f733j = -1L;
        ((MaterialButton) this.f500g).setTag(null);
        ((MaterialButton) this.f501h).setTag(null);
        ((LinearLayoutCompat) november[0]).setTag(null);
        ((MaterialButton) this.f502i).setTag(null);
        this.f499f.setTag(null);
        papa(view);
        lima();
    }

    @Override // z1.g
    public final void foxtrot() {
        long j5;
        int i4;
        synchronized (this) {
            j5 = this.f733j;
            this.f733j = 0L;
        }
        long j6 = j5 & 3;
        if (j6 != 0) {
            if (j6 != 0) {
                j5 |= 16;
            }
            if ((j5 & 3) != 0) {
                j5 |= 64;
            }
            if ((j5 & 3) != 0) {
                j5 |= 4;
            }
            if ((j5 & 3) != 0) {
                j5 |= 256;
            }
            i4 = 8;
        } else {
            i4 = 0;
        }
        int i5 = i4;
        if ((j5 & 3) != 0) {
            ((MaterialButton) this.f500g).setVisibility(i4);
            ((MaterialButton) this.f501h).setVisibility(i5);
            ((MaterialButton) this.f502i).setVisibility(i5);
            this.f499f.setVisibility(i5);
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f733j != 0) {
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
            this.f733j = 2L;
        }
        oscar();
    }
}
