package R2;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.clevertap.android.sdk.Constants;
import java.io.File;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a implements f {
    public final /* synthetic */ int alpha;

    public /* synthetic */ a(int i4) {
        this.alpha = i4;
    }

    @Override // R2.f
    public final g alpha(Object obj, X2.k kVar) {
        switch (this.alpha) {
            case 0:
                Uri uri = (Uri) obj;
                if (!a3.h.charlie(uri)) {
                    return null;
                }
                return new b(uri, kVar, 0);
            case 1:
                return new c((Bitmap) obj, kVar, 0);
            case 2:
                return new c((ByteBuffer) obj, kVar, 1);
            case 3:
                Uri uri2 = (Uri) obj;
                if (!Intrinsics.areEqual(uri2.getScheme(), Constants.KEY_CONTENT)) {
                    return null;
                }
                return new b(uri2, kVar, 1);
            case 4:
                return new c((Drawable) obj, kVar, 2);
            case 5:
                return new h((File) obj);
            default:
                Uri uri3 = (Uri) obj;
                if (!Intrinsics.areEqual(uri3.getScheme(), "android.resource")) {
                    return null;
                }
                return new b(uri3, kVar, 2);
        }
    }
}
