package Wb;

import B9.AbstractC0028a;
import android.content.Intent;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.orders.note.ui.AddressNoteActivity;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import r3.C2492a;
import s6.AbstractC2643e5;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ AddressNoteActivity purple;

    public /* synthetic */ c(AddressNoteActivity addressNoteActivity, int i4) {
        this.alpha = i4;
        this.purple = addressNoteActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        String str2;
        AddressNoteActivity addressNoteActivity = this.purple;
        switch (this.alpha) {
            case 0:
                C2492a c2492a = (C2492a) obj;
                int i4 = AddressNoteActivity.f12347W;
                int i5 = c2492a.alpha;
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 == 2) {
                            addressNoteActivity.magenta(true);
                        }
                    } else {
                        addressNoteActivity.magenta(false);
                        addressNoteActivity.ivory().echo.setValue(new Vb.a(null, null));
                        Intent intent = new Intent();
                        intent.putExtra("UPDATED_TASK_ID", addressNoteActivity.f12353M);
                        if (addressNoteActivity.f12355O) {
                            intent.putExtra("SKIPPED_ORDER_ID", addressNoteActivity.f12354N);
                        }
                        addressNoteActivity.setResult(-1, intent);
                        new m(addressNoteActivity, new B2.q(23, addressNoteActivity)).show();
                        CountDownTimer countDownTimer = addressNoteActivity.f12359T;
                        if (countDownTimer != null) {
                            countDownTimer.cancel();
                        }
                    }
                } else {
                    addressNoteActivity.magenta(false);
                    String str3 = c2492a.bravo;
                    if (str3 == null) {
                        str3 = addressNoteActivity.getString(R.string.failed_to_add_address_note);
                        Intrinsics.delta(str3, "getString(...)");
                    }
                    L9.d.pink(addressNoteActivity, str3);
                }
                return Unit.INSTANCE;
            default:
                Vb.a aVar = (Vb.a) obj;
                AbstractC0028a abstractC0028a = addressNoteActivity.f12350J;
                if (abstractC0028a != null) {
                    Pair pair = aVar.alpha;
                    if (pair != null) {
                        str = (String) pair.getSecond();
                    } else {
                        str = null;
                    }
                    ImageButton btnClearBuildingPic = abstractC0028a.f294g;
                    TextView tvUploadBuildingPicTitle = abstractC0028a.f309v;
                    View vBorderBuildingPic = abstractC0028a.f311x;
                    ImageView ivBuildingPic = abstractC0028a.f301n;
                    if (str != null) {
                        Intrinsics.delta(vBorderBuildingPic, "vBorderBuildingPic");
                        vBorderBuildingPic.setVisibility(8);
                        Intrinsics.delta(ivBuildingPic, "ivBuildingPic");
                        ivBuildingPic.setVisibility(0);
                        Intrinsics.delta(tvUploadBuildingPicTitle, "tvUploadBuildingPicTitle");
                        tvUploadBuildingPicTitle.setVisibility(8);
                        Object second = aVar.alpha.getSecond();
                        Intrinsics.checkNotNull(second);
                        AbstractC2643e5.bravo(ivBuildingPic, (String) second, R.dimen.spacing_zero);
                        Intrinsics.delta(btnClearBuildingPic, "btnClearBuildingPic");
                        btnClearBuildingPic.setVisibility(0);
                    } else {
                        Intrinsics.delta(vBorderBuildingPic, "vBorderBuildingPic");
                        vBorderBuildingPic.setVisibility(0);
                        Intrinsics.delta(ivBuildingPic, "ivBuildingPic");
                        ivBuildingPic.setVisibility(8);
                        Intrinsics.delta(tvUploadBuildingPicTitle, "tvUploadBuildingPicTitle");
                        tvUploadBuildingPicTitle.setVisibility(0);
                        Intrinsics.delta(btnClearBuildingPic, "btnClearBuildingPic");
                        btnClearBuildingPic.setVisibility(8);
                    }
                    Pair pair2 = aVar.bravo;
                    if (pair2 != null) {
                        str2 = (String) pair2.getSecond();
                    } else {
                        str2 = null;
                    }
                    ImageButton btnClearLandmarkPic = abstractC0028a.f295h;
                    TextView tvUploadLandmarkPicTitle = abstractC0028a.f310w;
                    View vBorderLandmarkPic = abstractC0028a.f312y;
                    ImageView ivLandMarkPic = abstractC0028a.f302o;
                    if (str2 != null) {
                        Intrinsics.delta(vBorderLandmarkPic, "vBorderLandmarkPic");
                        vBorderLandmarkPic.setVisibility(8);
                        Intrinsics.delta(ivLandMarkPic, "ivLandMarkPic");
                        ivLandMarkPic.setVisibility(0);
                        Intrinsics.delta(tvUploadLandmarkPicTitle, "tvUploadLandmarkPicTitle");
                        tvUploadLandmarkPicTitle.setVisibility(8);
                        Object second2 = pair2.getSecond();
                        Intrinsics.checkNotNull(second2);
                        AbstractC2643e5.bravo(ivLandMarkPic, (String) second2, R.dimen.spacing_zero);
                        Intrinsics.delta(btnClearLandmarkPic, "btnClearLandmarkPic");
                        btnClearLandmarkPic.setVisibility(0);
                    } else {
                        Intrinsics.delta(vBorderLandmarkPic, "vBorderLandmarkPic");
                        vBorderLandmarkPic.setVisibility(0);
                        Intrinsics.delta(ivLandMarkPic, "ivLandMarkPic");
                        ivLandMarkPic.setVisibility(8);
                        Intrinsics.delta(tvUploadLandmarkPicTitle, "tvUploadLandmarkPicTitle");
                        tvUploadLandmarkPicTitle.setVisibility(0);
                        Intrinsics.delta(btnClearLandmarkPic, "btnClearLandmarkPic");
                        btnClearLandmarkPic.setVisibility(8);
                    }
                    addressNoteActivity.lime(true);
                    return Unit.INSTANCE;
                }
                Intrinsics.lima("binding");
                throw null;
        }
    }
}
