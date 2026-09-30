package B9;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import delivery.samurai.android.R;
import t6.S3;

/* renamed from: B9.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0030b extends AbstractC0028a {
    public static final SparseIntArray A;

    /* renamed from: z, reason: collision with root package name */
    public long f415z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(R.id.include_type_selector, 2);
        sparseIntArray.put(R.id.toolbar, 3);
        sparseIntArray.put(R.id.scroll_content, 4);
        sparseIntArray.put(R.id.tv_address_info_title, 5);
        sparseIntArray.put(R.id.address_form_container, 6);
        sparseIntArray.put(R.id.tv_photos_title, 7);
        sparseIntArray.put(R.id.card_upload_building_pic, 8);
        sparseIntArray.put(R.id.v_border_building_pic, 9);
        sparseIntArray.put(R.id.tv_upload_building_pic_title, 10);
        sparseIntArray.put(R.id.iv_building_pic, 11);
        sparseIntArray.put(R.id.btn_clear_building_pic, 12);
        sparseIntArray.put(R.id.card_upload_landmark_pic, 13);
        sparseIntArray.put(R.id.v_border_landmark_pic, 14);
        sparseIntArray.put(R.id.tv_upload_landmark_pic_title, 15);
        sparseIntArray.put(R.id.iv_land_mark_pic, 16);
        sparseIntArray.put(R.id.btn_clear_landmark_pic, 17);
        sparseIntArray.put(R.id.ll_action_buttons, 18);
        sparseIntArray.put(R.id.cv_submit_note, 19);
        sparseIntArray.put(R.id.tv_submit_button, 20);
        sparseIntArray.put(R.id.pb_submit_loading, 21);
        sparseIntArray.put(R.id.cv_skip_note, 22);
        sparseIntArray.put(R.id.tv_skip_button, 23);
        sparseIntArray.put(R.id.pb_skip_loading, 24);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0030b(View view) {
        super(null, view, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, (TextView) r0[23], (TextView) r0[20], (TextView) r0[10], (TextView) r0[15], (View) r0[9], (View) r0[14]);
        ab abVar;
        Object[] november = z1.g.november(view, 25, null, A);
        FrameLayout frameLayout = (FrameLayout) november[6];
        ImageButton imageButton = (ImageButton) november[12];
        ImageButton imageButton2 = (ImageButton) november[17];
        ConstraintLayout constraintLayout = (ConstraintLayout) november[8];
        ConstraintLayout constraintLayout2 = (ConstraintLayout) november[13];
        MaterialCardView materialCardView = (MaterialCardView) november[22];
        MaterialCardView materialCardView2 = (MaterialCardView) november[19];
        Object obj = november[2];
        if (obj != null) {
            View view2 = (View) obj;
            int i4 = R.id.box_building;
            View bravo = S3.bravo(R.id.box_building, view2);
            if (bravo != null) {
                J alpha = J.alpha(bravo);
                i4 = R.id.box_business;
                View bravo2 = S3.bravo(R.id.box_business, view2);
                if (bravo2 != null) {
                    J alpha2 = J.alpha(bravo2);
                    i4 = R.id.box_compound;
                    View bravo3 = S3.bravo(R.id.box_compound, view2);
                    if (bravo3 != null) {
                        J alpha3 = J.alpha(bravo3);
                        i4 = R.id.box_other;
                        View bravo4 = S3.bravo(R.id.box_other, view2);
                        if (bravo4 != null) {
                            J alpha4 = J.alpha(bravo4);
                            i4 = R.id.box_villa;
                            View bravo5 = S3.bravo(R.id.box_villa, view2);
                            if (bravo5 != null) {
                                J alpha5 = J.alpha(bravo5);
                                i4 = R.id.container_building;
                                if (((LinearLayout) S3.bravo(R.id.container_building, view2)) != null) {
                                    i4 = R.id.container_business;
                                    if (((LinearLayout) S3.bravo(R.id.container_business, view2)) != null) {
                                        i4 = R.id.container_compound;
                                        if (((LinearLayout) S3.bravo(R.id.container_compound, view2)) != null) {
                                            i4 = R.id.container_other;
                                            if (((LinearLayout) S3.bravo(R.id.container_other, view2)) != null) {
                                                i4 = R.id.container_villa;
                                                if (((LinearLayout) S3.bravo(R.id.container_villa, view2)) != null) {
                                                    i4 = R.id.tv_select_address_type_title;
                                                    abVar = ((TextView) S3.bravo(R.id.tv_select_address_type_title, view2)) != null ? new ab((LinearLayout) view2, alpha, alpha2, alpha3, alpha4, alpha5, 6) : abVar;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i4)));
        }
        abVar = null;
        ImageView imageView = (ImageView) november[11];
        ImageView imageView2 = (ImageView) november[16];
        ProgressBar progressBar = (ProgressBar) november[24];
        ProgressBar progressBar2 = (ProgressBar) november[21];
        Toolbar toolbar = (Toolbar) november[3];
        TextView textView = (TextView) november[5];
        this.f415z = -1L;
        ((ConstraintLayout) november[0]).setTag(null);
        ((LinearLayout) november[1]).setTag(null);
        papa(view);
        lima();
    }

    @Override // z1.g
    public final void foxtrot() {
        synchronized (this) {
            this.f415z = 0L;
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f415z != 0) {
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
            this.f415z = 1L;
        }
        oscar();
    }
}
