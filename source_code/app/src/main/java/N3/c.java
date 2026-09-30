package N3;

import E3.h;
import E3.i;
import E3.k;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import androidx.appcompat.widget.P0;
import com.bumptech.glide.load.engine.w;
import java.util.List;
import s6.AbstractC2805w6;

/* loaded from: classes3.dex */
public final class c implements k {
    public static final h bravo = new h("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", null, h.echo);
    public final Context alpha;

    public c(Context context) {
        this.alpha = context.getApplicationContext();
    }

    @Override // E3.k
    public final boolean alpha(Object obj, i iVar) {
        String scheme = ((Uri) obj).getScheme();
        if (scheme != null && scheme.equals("android.resource")) {
            return true;
        }
        return false;
    }

    @Override // E3.k
    public final /* bridge */ /* synthetic */ w bravo(Object obj, int i4, int i5, i iVar) {
        return charlie((Uri) obj, iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final w charlie(Uri uri, i iVar) {
        Context createPackageContext;
        List<String> pathSegments;
        int parseInt;
        Resources.Theme theme;
        Drawable alpha;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            Context context = this.alpha;
            if (!authority.equals(context.getPackageName())) {
                try {
                    createPackageContext = context.createPackageContext(authority, 0);
                } catch (PackageManager.NameNotFoundException e) {
                    if (!authority.contains(context.getPackageName())) {
                        throw new IllegalArgumentException(P0.beige(uri, "Failed to obtain context or unrecognized Uri format for: "), e);
                    }
                }
                pathSegments = uri.getPathSegments();
                if (pathSegments.size() != 2) {
                    List<String> pathSegments2 = uri.getPathSegments();
                    String authority2 = uri.getAuthority();
                    String str = pathSegments2.get(0);
                    String str2 = pathSegments2.get(1);
                    parseInt = createPackageContext.getResources().getIdentifier(str2, str, authority2);
                    if (parseInt == 0) {
                        parseInt = Resources.getSystem().getIdentifier(str2, str, "android");
                    }
                    if (parseInt == 0) {
                        throw new IllegalArgumentException(P0.beige(uri, "Failed to find resource id for: "));
                    }
                } else if (pathSegments.size() == 1) {
                    try {
                        parseInt = Integer.parseInt(uri.getPathSegments().get(0));
                    } catch (NumberFormatException e4) {
                        throw new IllegalArgumentException(P0.beige(uri, "Unrecognized Uri format: "), e4);
                    }
                } else {
                    throw new IllegalArgumentException(P0.beige(uri, "Unrecognized Uri format: "));
                }
                if (!authority.equals(context.getPackageName())) {
                    theme = (Resources.Theme) iVar.charlie(bravo);
                } else {
                    theme = null;
                }
                if (theme != null) {
                    alpha = AbstractC2805w6.alpha(context, createPackageContext, parseInt, null);
                } else {
                    alpha = AbstractC2805w6.alpha(context, context, parseInt, theme);
                }
                if (alpha != null) {
                    return null;
                }
                return new b(alpha, 0);
            }
            createPackageContext = context;
            pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
            }
            if (!authority.equals(context.getPackageName())) {
            }
            if (theme != null) {
            }
            if (alpha != null) {
            }
        } else {
            throw new IllegalStateException("Package name for " + uri + " is null or empty");
        }
    }
}
