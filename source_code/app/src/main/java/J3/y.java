package J3;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;

/* loaded from: classes3.dex */
public final class y implements s {
    public final /* synthetic */ int alpha;
    public final Resources purple;

    public /* synthetic */ y(Resources resources, int i4) {
        this.alpha = i4;
        this.purple = resources;
    }

    @Override // J3.s
    public final r sierra(x xVar) {
        switch (this.alpha) {
            case 0:
                return new b(this.purple, xVar.bravo(Uri.class, AssetFileDescriptor.class));
            default:
                return new b(this.purple, ac.bravo);
        }
    }
}
