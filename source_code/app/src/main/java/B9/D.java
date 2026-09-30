package B9;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import delivery.samurai.android.R;

/* loaded from: classes2.dex */
public final class D extends C {
    public static final SparseIntArray B;
    public long A;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        B = sparseIntArray;
        sparseIntArray.put(R.id.toolbar, 1);
        sparseIntArray.put(R.id.tv_header, 2);
        sparseIntArray.put(R.id.tv_page_desc, 3);
        sparseIntArray.put(R.id.tv_personal_section_title, 4);
        sparseIntArray.put(R.id.card_upload_profile_pic, 5);
        sparseIntArray.put(R.id.v_border_profile_pic, 6);
        sparseIntArray.put(R.id.tv_upload_pic_title, 7);
        sparseIntArray.put(R.id.tv_upload_pic_desc, 8);
        sparseIntArray.put(R.id.iv_profile_pic, 9);
        sparseIntArray.put(R.id.btn_clear_profile_pic, 10);
        sparseIntArray.put(R.id.card_upload_iqama, 11);
        sparseIntArray.put(R.id.v_border_iqama, 12);
        sparseIntArray.put(R.id.tv_upload_iqama_title, 13);
        sparseIntArray.put(R.id.tv_upload_iqama_desc, 14);
        sparseIntArray.put(R.id.iv_iqama_pic, 15);
        sparseIntArray.put(R.id.btn_clear_iqama, 16);
        sparseIntArray.put(R.id.tv_vehicle_section_title, 17);
        sparseIntArray.put(R.id.card_upload_driving_license, 18);
        sparseIntArray.put(R.id.v_border_driving_license, 19);
        sparseIntArray.put(R.id.tv_upload_driving_license_title, 20);
        sparseIntArray.put(R.id.tv_upload_driving_license_desc, 21);
        sparseIntArray.put(R.id.iv_driving_license, 22);
        sparseIntArray.put(R.id.btn_clear_driving_license, 23);
        sparseIntArray.put(R.id.card_upload_car_license, 24);
        sparseIntArray.put(R.id.v_border_car_license, 25);
        sparseIntArray.put(R.id.tv_upload_car_license_title, 26);
        sparseIntArray.put(R.id.tv_upload_car_license_desc, 27);
        sparseIntArray.put(R.id.iv_car_license, 28);
        sparseIntArray.put(R.id.btn_clear_car_license, 29);
        sparseIntArray.put(R.id.tv_vehicle_details_title, 30);
        sparseIntArray.put(R.id.til_vehicle_plate, 31);
        sparseIntArray.put(R.id.et_vehicle_plate, 32);
        sparseIntArray.put(R.id.til_vehicle_sequence, 33);
        sparseIntArray.put(R.id.et_vehicle_sequence, 34);
        sparseIntArray.put(R.id.cv_continue_button, 35);
        sparseIntArray.put(R.id.btnContinue, 36);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public D(View view) {
        super(null, view, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, (View) r0[25], (View) r0[19], (View) r0[12], (View) r0[6]);
        Object[] november = z1.g.november(view, 37, null, B);
        ImageButton imageButton = (ImageButton) november[29];
        ImageButton imageButton2 = (ImageButton) november[23];
        ImageButton imageButton3 = (ImageButton) november[16];
        ImageButton imageButton4 = (ImageButton) november[10];
        MaterialButton materialButton = (MaterialButton) november[36];
        ConstraintLayout constraintLayout = (ConstraintLayout) november[24];
        ConstraintLayout constraintLayout2 = (ConstraintLayout) november[18];
        ConstraintLayout constraintLayout3 = (ConstraintLayout) november[11];
        ConstraintLayout constraintLayout4 = (ConstraintLayout) november[5];
        TextInputEditText textInputEditText = (TextInputEditText) november[32];
        TextInputEditText textInputEditText2 = (TextInputEditText) november[34];
        ImageView imageView = (ImageView) november[28];
        ImageView imageView2 = (ImageView) november[22];
        ImageView imageView3 = (ImageView) november[15];
        ImageView imageView4 = (ImageView) november[9];
        TextInputLayout textInputLayout = (TextInputLayout) november[31];
        TextInputLayout textInputLayout2 = (TextInputLayout) november[33];
        this.A = -1L;
        ((ConstraintLayout) november[0]).setTag(null);
        papa(view);
        lima();
    }

    @Override // z1.g
    public final void foxtrot() {
        synchronized (this) {
            this.A = 0L;
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.A != 0) {
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
            this.A = 1L;
        }
        oscar();
    }
}
