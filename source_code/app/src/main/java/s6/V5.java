package s6;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class V5 {
    public static final /* synthetic */ int alpha = 0;

    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v1, types: [K1.g, K1.u] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static K1.u alpha(Context context) {
        U8.a aVar;
        ProviderInfo providerInfo;
        p1.d dVar;
        ApplicationInfo applicationInfo;
        if (Build.VERSION.SDK_INT >= 28) {
            aVar = new U8.a(5);
        } else {
            aVar = new U8.a(5);
        }
        PackageManager packageManager = context.getPackageManager();
        T7.foxtrot(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (it.hasNext()) {
                providerInfo = it.next().providerInfo;
                if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                    break;
                }
            } else {
                providerInfo = null;
                break;
            }
        }
        if (providerInfo != null) {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] hotel = aVar.hotel(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : hotel) {
                    arrayList.add(signature.toByteArray());
                }
                dVar = new p1.d(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), null, null);
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
            }
            if (dVar != null) {
                return null;
            }
            return new K1.g(new K1.t(context, dVar));
        }
        dVar = null;
        if (dVar != null) {
        }
    }
}
