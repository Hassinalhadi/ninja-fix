package S9;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import g3.C1743d;
import g3.C1745f;
import g3.InterfaceC1740a;
import g3.n;
import g3.o;
import g3.q;
import g3.r;
import g3.s;
import g3.u;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;

/* loaded from: classes2.dex */
public final class a implements InterfaceC1740a {
    public final Context alpha;

    public a(Context context) {
        this.alpha = context;
    }

    public final s alpha() {
        C1745f c1745f = C1745f.alpha;
        Context context = this.alpha;
        C1743d alpha = c1745f.alpha(context);
        if (alpha.alpha) {
            return new q();
        }
        u uVar = (u) CollectionsKt.green(alpha.bravo);
        if (uVar != null) {
            int ordinal = uVar.ordinal();
            if (ordinal != 0 && ordinal != 1) {
                if (ordinal != 2 && ordinal != 3 && ordinal != 4) {
                    if (ordinal == 5) {
                        return new o(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", context.getPackageName(), null));
                return new n(intent);
            }
            Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent2.setData(Uri.fromParts("package", context.getPackageName(), null));
            return new n(intent2);
        }
        String str = alpha.charlie;
        if (str == null) {
            str = "Location compliance check failed";
        }
        return new r(str);
    }
}
