package T2;

import X2.k;
import a3.h;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import com.checkout.address.utils.NumberOnlyZipVisualTransformation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c implements b {
    @Override // T2.b
    public final String alpha(Object obj, k kVar) {
        Uri uri = (Uri) obj;
        if (Intrinsics.areEqual(uri.getScheme(), "android.resource")) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(uri);
            sb2.append(NumberOnlyZipVisualTransformation.HYPHEN);
            Configuration configuration = kVar.alpha.getResources().getConfiguration();
            Bitmap.Config[] configArr = h.alpha;
            sb2.append(configuration.uiMode & 48);
            return sb2.toString();
        }
        return uri.toString();
    }
}
