package B9;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import delivery.samurai.android.R;

/* loaded from: classes2.dex */
public final class az extends ay {

    /* renamed from: w, reason: collision with root package name */
    public static final SparseIntArray f413w;

    /* renamed from: v, reason: collision with root package name */
    public long f414v;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f413w = sparseIntArray;
        sparseIntArray.put(R.id.toolbar, 1);
        sparseIntArray.put(R.id.tvTitle, 2);
        sparseIntArray.put(R.id.tvDescription, 3);
        sparseIntArray.put(R.id.tvPersonalInfo, 4);
        sparseIntArray.put(R.id.ilFName, 5);
        sparseIntArray.put(R.id.etFName, 6);
        sparseIntArray.put(R.id.ilLName, 7);
        sparseIntArray.put(R.id.etLName, 8);
        sparseIntArray.put(R.id.ilSelectNationality, 9);
        sparseIntArray.put(R.id.etSelectNationality, 10);
        sparseIntArray.put(R.id.ilSelectDate, 11);
        sparseIntArray.put(R.id.etSelectDate, 12);
        sparseIntArray.put(R.id.tvVerifyingInfo, 13);
        sparseIntArray.put(R.id.ilIdNumber, 14);
        sparseIntArray.put(R.id.etIdNumber, 15);
        sparseIntArray.put(R.id.ilMobileNumber, 16);
        sparseIntArray.put(R.id.etMobileNumber, 17);
        sparseIntArray.put(R.id.tv_referral_section, 18);
        sparseIntArray.put(R.id.til_referral, 19);
        sparseIntArray.put(R.id.et_referral, 20);
        sparseIntArray.put(R.id.cvContinueButton, 21);
        sparseIntArray.put(R.id.btnContinue, 22);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public az(View view) {
        super(null, view, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21);
        Object[] november = z1.g.november(view, 23, null, f413w);
        MaterialButton materialButton = (MaterialButton) november[22];
        TextInputEditText textInputEditText = (TextInputEditText) november[6];
        TextInputEditText textInputEditText2 = (TextInputEditText) november[15];
        TextInputEditText textInputEditText3 = (TextInputEditText) november[8];
        TextInputEditText textInputEditText4 = (TextInputEditText) november[17];
        TextInputEditText textInputEditText5 = (TextInputEditText) november[20];
        TextInputEditText textInputEditText6 = (TextInputEditText) november[12];
        TextInputEditText textInputEditText7 = (TextInputEditText) november[10];
        TextInputLayout textInputLayout = (TextInputLayout) november[5];
        TextInputLayout textInputLayout2 = (TextInputLayout) november[14];
        TextInputLayout textInputLayout3 = (TextInputLayout) november[7];
        TextInputLayout textInputLayout4 = (TextInputLayout) november[16];
        TextInputLayout textInputLayout5 = (TextInputLayout) november[11];
        TextInputLayout textInputLayout6 = (TextInputLayout) november[9];
        TextInputLayout textInputLayout7 = (TextInputLayout) november[19];
        TextView textView = (TextView) november[18];
        this.f414v = -1L;
        ((ConstraintLayout) november[0]).setTag(null);
        papa(view);
        lima();
    }

    @Override // z1.g
    public final void foxtrot() {
        synchronized (this) {
            this.f414v = 0L;
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f414v != 0) {
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
            this.f414v = 1L;
        }
        oscar();
    }
}
