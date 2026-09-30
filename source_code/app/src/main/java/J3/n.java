package J3;

import android.content.Context;
import android.net.Uri;
import s6.L4;

/* loaded from: classes3.dex */
public final class n implements r {
    public final /* synthetic */ int alpha;
    public final Context bravo;

    public n(Context context, int i4) {
        this.alpha = i4;
        switch (i4) {
            case 1:
                this.bravo = context.getApplicationContext();
                return;
            case 2:
                this.bravo = context.getApplicationContext();
                return;
            default:
                this.bravo = context;
                return;
        }
    }

    @Override // J3.r
    public final q alpha(Object obj, int i4, int i5, E3.i iVar) {
        Long l10;
        switch (this.alpha) {
            case 0:
                Uri uri = (Uri) obj;
                return new q(new X3.d(uri), new m(0, this.bravo, uri));
            case 1:
                Uri uri2 = (Uri) obj;
                if (i4 != Integer.MIN_VALUE && i5 != Integer.MIN_VALUE && i4 <= 512 && i5 <= 384) {
                    X3.d dVar = new X3.d(uri2);
                    Context context = this.bravo;
                    return new q(dVar, F3.b.bravo(context, uri2, new F3.a(context.getContentResolver(), 0)));
                }
                return null;
            default:
                Uri uri3 = (Uri) obj;
                if (i4 != Integer.MIN_VALUE && i5 != Integer.MIN_VALUE && i4 <= 512 && i5 <= 384 && (l10 = (Long) iVar.charlie(com.bumptech.glide.load.resource.bitmap.ab.delta)) != null && l10.longValue() == -1) {
                    X3.d dVar2 = new X3.d(uri3);
                    Context context2 = this.bravo;
                    return new q(dVar2, F3.b.bravo(context2, uri3, new F3.a(context2.getContentResolver(), 1)));
                }
                return null;
        }
    }

    @Override // J3.r
    public final boolean bravo(Object obj) {
        switch (this.alpha) {
            case 0:
                return L4.bravo((Uri) obj);
            case 1:
                Uri uri = (Uri) obj;
                if (L4.bravo(uri) && !uri.getPathSegments().contains("video")) {
                    return true;
                }
                return false;
            default:
                Uri uri2 = (Uri) obj;
                if (L4.bravo(uri2) && uri2.getPathSegments().contains("video")) {
                    return true;
                }
                return false;
        }
    }
}
