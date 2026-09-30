package U2;

import X2.k;
import a3.h;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import androidx.appcompat.widget.P0;
import com.clevertap.android.sdk.variables.CTVariableUtils;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public final class a {
    public final /* synthetic */ int alpha;

    public /* synthetic */ a(int i4) {
        this.alpha = i4;
    }

    public final Object alpha(Object obj, k kVar) {
        String scheme;
        String authority;
        switch (this.alpha) {
            case 0:
                return ByteBuffer.wrap((byte[]) obj);
            case 1:
                Uri uri = (Uri) obj;
                if (!h.charlie(uri) && ((scheme = uri.getScheme()) == null || Intrinsics.areEqual(scheme, CTVariableUtils.FILE))) {
                    String path = uri.getPath();
                    if (path == null) {
                        path = "";
                    }
                    if (StringsKt.orange(path, '/') && ((String) CollectionsKt.green(uri.getPathSegments())) != null) {
                        if (Intrinsics.areEqual(uri.getScheme(), CTVariableUtils.FILE)) {
                            String path2 = uri.getPath();
                            if (path2 != null) {
                                return new File(path2);
                            }
                        } else {
                            return new File(uri.toString());
                        }
                    }
                }
                return null;
            case 2:
                return ((HttpUrl) obj).getUrl();
            case 3:
                Context context = kVar.alpha;
                int intValue = ((Number) obj).intValue();
                try {
                    if (context.getResources().getResourceEntryName(intValue) != null) {
                        return Uri.parse("android.resource://" + context.getPackageName() + '/' + intValue);
                    }
                } catch (Resources.NotFoundException unused) {
                }
                return null;
            case 4:
                Uri uri2 = (Uri) obj;
                if (Intrinsics.areEqual(uri2.getScheme(), "android.resource") && (authority = uri2.getAuthority()) != null && !StringsKt.gray(authority) && uri2.getPathSegments().size() == 2) {
                    String authority2 = uri2.getAuthority();
                    if (authority2 == null) {
                        authority2 = "";
                    }
                    Resources resourcesForApplication = kVar.alpha.getPackageManager().getResourcesForApplication(authority2);
                    List<String> pathSegments = uri2.getPathSegments();
                    int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority2);
                    if (identifier != 0) {
                        return Uri.parse("android.resource://" + authority2 + '/' + identifier);
                    }
                    throw new IllegalStateException(P0.beige(uri2, "Invalid android.resource URI: ").toString());
                }
                return null;
            default:
                return Uri.parse((String) obj);
        }
    }
}
