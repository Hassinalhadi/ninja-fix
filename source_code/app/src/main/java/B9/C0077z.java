package B9;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import delivery.samurai.android.R;

/* renamed from: B9.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0077z extends AbstractC0075y {

    /* renamed from: j, reason: collision with root package name */
    public static final SparseIntArray f730j;

    /* renamed from: i, reason: collision with root package name */
    public long f731i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f730j = sparseIntArray;
        sparseIntArray.put(R.id.scroll_content, 1);
        sparseIntArray.put(R.id.iv_header_location, 2);
        sparseIntArray.put(R.id.tv_dialog_header, 3);
        sparseIntArray.put(R.id.tvMainDescription, 4);
        sparseIntArray.put(R.id.iv_close, 5);
        sparseIntArray.put(R.id.mcv_hint_desc, 6);
        sparseIntArray.put(R.id.tv_edit_text_title, 7);
        sparseIntArray.put(R.id.til_note, 8);
        sparseIntArray.put(R.id.et_note, 9);
        sparseIntArray.put(R.id.tv_pickup_caption, 10);
        sparseIntArray.put(R.id.mapCard, 11);
        sparseIntArray.put(R.id.addressMap, 12);
        sparseIntArray.put(R.id.ivCenterPin, 13);
        sparseIntArray.put(R.id.vChangeScrim, 14);
        sparseIntArray.put(R.id.group_change_pickup, 15);
        sparseIntArray.put(R.id.tv_change_msg, 16);
        sparseIntArray.put(R.id.btn_no_change, 17);
        sparseIntArray.put(R.id.btn_yes_change, 18);
        sparseIntArray.put(R.id.tv_images_text_title, 19);
        sparseIntArray.put(R.id.card_upload_building_pic, 20);
        sparseIntArray.put(R.id.v_border_building_pic, 21);
        sparseIntArray.put(R.id.tv_upload_building_pic_title, 22);
        sparseIntArray.put(R.id.iv_building_pic, 23);
        sparseIntArray.put(R.id.btn_clear_building_pic, 24);
        sparseIntArray.put(R.id.card_upload_landmark_pic, 25);
        sparseIntArray.put(R.id.v_border_landmark_pic, 26);
        sparseIntArray.put(R.id.tv_upload_landmark_pic_title, 27);
        sparseIntArray.put(R.id.iv_land_mark_pic, 28);
        sparseIntArray.put(R.id.btn_clear_landmark_pic, 29);
        sparseIntArray.put(R.id.ll_action_buttons, 30);
        sparseIntArray.put(R.id.cv_submit_note, 31);
        sparseIntArray.put(R.id.tv_submit_button, 32);
        sparseIntArray.put(R.id.pb_submit_loading, 33);
        sparseIntArray.put(R.id.cv_skip_note, 34);
        sparseIntArray.put(R.id.tv_skip_button, 35);
        sparseIntArray.put(R.id.pb_skip_loading, 36);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0077z(View view) {
        super(null, view, (View) r0[21], (View) r0[26], (View) r0[14]);
        Object[] november = z1.g.november(view, 37, null, f730j);
        this.f731i = -1L;
        ((ConstraintLayout) november[0]).setTag(null);
        papa(view);
        lima();
    }

    @Override // z1.g
    public final void foxtrot() {
        synchronized (this) {
            this.f731i = 0L;
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f731i != 0) {
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
            this.f731i = 1L;
        }
        oscar();
    }
}
