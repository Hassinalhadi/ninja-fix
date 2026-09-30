package a4;

import android.content.Context;
import android.net.Uri;
import com.canhub.cropper.CropImageView;
import java.lang.ref.WeakReference;
import vf.P;
import vf.ao;

/* loaded from: classes3.dex */
public final class i implements vf.ab {
    public final Context alpha;
    public final Uri purple;
    public final int red;
    public final int silver;
    public final WeakReference teal;
    public P white = vf.ad.delta();

    public i(Context context, CropImageView cropImageView, Uri uri) {
        this.alpha = context;
        this.purple = uri;
        this.teal = new WeakReference(cropImageView);
        float f5 = cropImageView.getResources().getDisplayMetrics().density;
        double d4 = f5 > 1.0f ? 1.0d / f5 : 1.0d;
        this.red = (int) (r3.widthPixels * d4);
        this.silver = (int) (r3.heightPixels * d4);
    }

    @Override // vf.ab
    public final Nd.h charlie() {
        Cf.e eVar = ao.alpha;
        return Af.n.alpha.plus(this.white);
    }
}
