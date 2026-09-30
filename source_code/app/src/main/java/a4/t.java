package a4;

import com.canhub.cropper.CropImageOptions;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class t {
    public final CropImageOptions alpha;

    public t(CropImageOptions cropImageOptions) {
        this.alpha = cropImageOptions;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof t) {
                t tVar = (t) obj;
                tVar.getClass();
                if (!Intrinsics.areEqual(null, null) || !Intrinsics.areEqual(this.alpha, tVar.alpha)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public final String toString() {
        return "CropImageContractOptions(uri=null, cropImageOptions=" + this.alpha + ')';
    }
}
