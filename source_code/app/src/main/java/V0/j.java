package V0;

import androidx.appcompat.widget.P0;
import com.clevertap.android.sdk.Constants;

/* loaded from: classes3.dex */
public final class j extends g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f2168a;

    public j(k kVar) {
        this.f2168a = kVar;
    }

    @Override // V0.g
    public final String hotel() {
        h hVar = (h) this.f2168a.alpha.get();
        if (hVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return P0.emerald(new StringBuilder("tag=["), hVar.alpha, Constants.AES_SUFFIX);
    }
}
