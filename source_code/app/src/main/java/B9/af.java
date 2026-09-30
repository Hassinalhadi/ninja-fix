package B9;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import delivery.samurai.android.R;

/* loaded from: classes2.dex */
public final class af extends ae {

    /* renamed from: o, reason: collision with root package name */
    public static final SparseIntArray f337o;

    /* renamed from: n, reason: collision with root package name */
    public long f338n;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f337o = sparseIntArray;
        sparseIntArray.put(R.id.tv_dialog_header, 1);
        sparseIntArray.put(R.id.iv_close, 2);
        sparseIntArray.put(R.id.tvMainDescription, 3);
        sparseIntArray.put(R.id.cl_upload_doc, 4);
        sparseIntArray.put(R.id.iv_place_holder, 5);
        sparseIntArray.put(R.id.iv_doc, 6);
        sparseIntArray.put(R.id.tvNote1, 7);
        sparseIntArray.put(R.id.iv_note_1, 8);
        sparseIntArray.put(R.id.tvNote2, 9);
        sparseIntArray.put(R.id.cv_continue_button, 10);
        sparseIntArray.put(R.id.btn_take_photo, 11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public af(View view) {
        super(null, view, r6, r7, r8, (AppCompatImageView) r0[5], (TextView) r0[1], (AppCompatTextView) r0[3], (AppCompatTextView) r0[7], (AppCompatTextView) r0[9]);
        Object[] november = z1.g.november(view, 12, null, f337o);
        MaterialButton materialButton = (MaterialButton) november[11];
        AppCompatImageView appCompatImageView = (AppCompatImageView) november[2];
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) november[6];
        this.f338n = -1L;
        ((ConstraintLayout) november[0]).setTag(null);
        papa(view);
        lima();
    }

    @Override // z1.g
    public final void foxtrot() {
        synchronized (this) {
            this.f338n = 0L;
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f338n != 0) {
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
            this.f338n = 1L;
        }
        oscar();
    }
}
