package a3;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.webkit.MimeTypeMap;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.compose.LottieConstants;
import com.clevertap.android.sdk.variables.CTVariableUtils;
import java.io.Closeable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Headers;
import t6.AbstractC3001h2;

/* loaded from: classes3.dex */
public abstract class h {
    public static final Bitmap.Config[] alpha;
    public static final Bitmap.Config bravo;
    public static final Headers charlie;

    static {
        Bitmap.Config[] configArr;
        Bitmap.Config config;
        Bitmap.Config config2;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26) {
            config2 = Bitmap.Config.RGBA_F16;
            configArr = new Bitmap.Config[]{Bitmap.Config.ARGB_8888, config2};
        } else {
            configArr = new Bitmap.Config[]{Bitmap.Config.ARGB_8888};
        }
        alpha = configArr;
        if (i4 >= 26) {
            config = Bitmap.Config.HARDWARE;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        bravo = config;
        charlie = new Headers.Builder().build();
    }

    public static final void alpha(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final String bravo(MimeTypeMap mimeTypeMap, String str) {
        if (str != null && !StringsKt.gray(str)) {
            String white = StringsKt.white(StringsKt.white(str, '#'), '?');
            return mimeTypeMap.getMimeTypeFromExtension(StringsKt.purple('.', StringsKt.purple('/', white, white), ""));
        }
        return null;
    }

    public static final boolean charlie(Uri uri) {
        if (Intrinsics.areEqual(uri.getScheme(), CTVariableUtils.FILE) && Intrinsics.areEqual((String) CollectionsKt.green(uri.getPathSegments()), "android_asset")) {
            return true;
        }
        return false;
    }

    public static final int delta(AbstractC3001h2 abstractC3001h2, Y2.g gVar) {
        if (abstractC3001h2 instanceof Y2.a) {
            return ((Y2.a) abstractC3001h2).alpha;
        }
        int i4 = g.$EnumSwitchMapping$2[gVar.ordinal()];
        if (i4 != 1) {
            if (i4 == 2) {
                return LottieConstants.IterateForever;
            }
            throw new NoWhenBranchMatchedException();
        }
        return RecyclerView.UNDEFINED_DURATION;
    }
}
