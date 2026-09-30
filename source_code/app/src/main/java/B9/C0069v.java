package B9;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import delivery.samurai.android.R;

/* renamed from: B9.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0069v extends AbstractC0067u {

    /* renamed from: k, reason: collision with root package name */
    public static final SparseIntArray f703k;

    /* renamed from: j, reason: collision with root package name */
    public long f704j;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f703k = sparseIntArray;
        sparseIntArray.put(R.id.toolbar, 1);
        sparseIntArray.put(R.id.scrollContent, 2);
        sparseIntArray.put(R.id.tvNote, 3);
        sparseIntArray.put(R.id.amountRow, 4);
        sparseIntArray.put(R.id.etAmount, 5);
        sparseIntArray.put(R.id.tvCurrencySymbol, 6);
        sparseIntArray.put(R.id.dividerWhite, 7);
        sparseIntArray.put(R.id.cv_continue_button, 8);
        sparseIntArray.put(R.id.btnTopUp, 9);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0069v(View view) {
        super(null, view, r6, r7, r8, r9);
        Object[] november = z1.g.november(view, 10, null, f703k);
        MaterialButton materialButton = (MaterialButton) november[9];
        View view2 = (View) november[7];
        EditText editText = (EditText) november[5];
        TextView textView = (TextView) november[6];
        this.f704j = -1L;
        ((ConstraintLayout) november[0]).setTag(null);
        papa(view);
        lima();
    }

    @Override // z1.g
    public final void foxtrot() {
        synchronized (this) {
            this.f704j = 0L;
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f704j != 0) {
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
            this.f704j = 1L;
        }
        oscar();
    }
}
