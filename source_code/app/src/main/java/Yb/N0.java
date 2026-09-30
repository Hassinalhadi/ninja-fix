package Yb;

import android.view.View;
import com.canhub.cropper.CropImageOptions;
import g1.AbstractC1735d;

/* loaded from: classes2.dex */
public final /* synthetic */ class N0 implements View.OnClickListener {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ O0 purple;

    public /* synthetic */ N0(O0 o02, int i4) {
        this.alpha = i4;
        this.purple = o02;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z2;
        switch (this.alpha) {
            case 0:
                this.purple.juliet();
                return;
            default:
                O0 o02 = this.purple;
                if (AbstractC1735d.alpha(o02.requireContext(), "android.permission.CAMERA") == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                CropImageOptions cropImageOptions = new CropImageOptions(null, null, 0.0f, 0.0f, 0.0f, a4.y.purple, null, false, false, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, false, 0.0f, 0, null, -129, -1);
                cropImageOptions.purple = z2;
                cropImageOptions.alpha = true;
                o02.f2340w.alpha(new a4.t(cropImageOptions));
                return;
        }
    }
}
