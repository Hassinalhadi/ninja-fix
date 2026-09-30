package B9;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import delivery.samurai.android.R;

/* loaded from: classes2.dex */
public final class B extends A {

    /* renamed from: m, reason: collision with root package name */
    public static final SparseIntArray f74m;

    /* renamed from: l, reason: collision with root package name */
    public long f75l;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f74m = sparseIntArray;
        sparseIntArray.put(R.id.toolbar, 1);
        sparseIntArray.put(R.id.tvTitle, 2);
        sparseIntArray.put(R.id.tvDescription, 3);
        sparseIntArray.put(R.id.tvUrPayHeader, 4);
        sparseIntArray.put(R.id.ilUrPay, 5);
        sparseIntArray.put(R.id.etUrPay, 6);
        sparseIntArray.put(R.id.ilUrPayId, 7);
        sparseIntArray.put(R.id.etUrPayId, 8);
        sparseIntArray.put(R.id.tvBank, 9);
        sparseIntArray.put(R.id.ilBankNumber, 10);
        sparseIntArray.put(R.id.etBankNumber, 11);
        sparseIntArray.put(R.id.ilBankName, 12);
        sparseIntArray.put(R.id.etBankName, 13);
        sparseIntArray.put(R.id.cvContinueButton, 14);
        sparseIntArray.put(R.id.btnSubmit, 15);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public B(View view) {
        super(null, view, r6, r7, r8, r9, r10);
        Object[] november = z1.g.november(view, 16, null, f74m);
        MaterialButton materialButton = (MaterialButton) november[15];
        TextInputEditText textInputEditText = (TextInputEditText) november[13];
        TextInputLayout textInputLayout = (TextInputLayout) november[10];
        TextInputLayout textInputLayout2 = (TextInputLayout) november[5];
        TextInputLayout textInputLayout3 = (TextInputLayout) november[7];
        this.f75l = -1L;
        ((ConstraintLayout) november[0]).setTag(null);
        papa(view);
        lima();
    }

    @Override // z1.g
    public final void foxtrot() {
        synchronized (this) {
            this.f75l = 0L;
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f75l != 0) {
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
            this.f75l = 1L;
        }
        oscar();
    }
}
