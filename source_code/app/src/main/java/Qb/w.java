package Qb;

import android.view.View;
import com.canhub.cropper.CropImageOptions;
import g1.AbstractC1735d;

/* loaded from: classes2.dex */
public final /* synthetic */ class w implements View.OnClickListener {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ x purple;

    public /* synthetic */ w(x xVar, int i4) {
        this.alpha = i4;
        this.purple = xVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z2;
        switch (this.alpha) {
            case 0:
                this.purple.juliet();
                return;
            default:
                x xVar = this.purple;
                if (AbstractC1735d.alpha(xVar.requireContext(), "android.permission.CAMERA") == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                CropImageOptions cropImageOptions = new CropImageOptions(null, null, 0.0f, 0.0f, 0.0f, a4.y.purple, null, false, false, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, false, 0.0f, 0, null, -129, -1);
                cropImageOptions.purple = z2;
                cropImageOptions.alpha = true;
                xVar.f1953w.alpha(new a4.t(cropImageOptions));
                return;
        }
    }
}
