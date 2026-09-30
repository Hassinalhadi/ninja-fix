package K3;

import E3.i;
import J3.q;
import J3.r;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import s6.L4;

/* loaded from: classes3.dex */
public final class e implements r {
    public final Context alpha;
    public final r bravo;
    public final r charlie;
    public final Class delta;

    public e(Context context, r rVar, r rVar2, Class cls) {
        this.alpha = context.getApplicationContext();
        this.bravo = rVar;
        this.charlie = rVar2;
        this.delta = cls;
    }

    @Override // J3.r
    public final q alpha(Object obj, int i4, int i5, i iVar) {
        Uri uri = (Uri) obj;
        return new q(new X3.d(uri), new d(this.alpha, this.bravo, this.charlie, uri, i4, i5, iVar, this.delta));
    }

    @Override // J3.r
    public final boolean bravo(Object obj) {
        Uri uri = (Uri) obj;
        if (Build.VERSION.SDK_INT >= 29 && L4.bravo(uri)) {
            return true;
        }
        return false;
    }
}
