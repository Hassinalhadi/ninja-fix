package t0;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import androidx.compose.runtime.AbstractC0587t;
import delivery.samurai.android.R;
import java.util.LinkedHashMap;
import s6.U6;
import t6.AbstractC3017k3;
import yf.AbstractC3428A;

/* loaded from: classes3.dex */
public abstract class P0 {
    public static final LinkedHashMap alpha = new LinkedHashMap();

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, yf.E] */
    public static final yf.L alpha(Context context) {
        yf.L l10;
        LinkedHashMap linkedHashMap = alpha;
        synchronized (linkedHashMap) {
            try {
                Object obj = linkedHashMap.get(context);
                if (obj == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    xf.e bravo = AbstractC3017k3.bravo(-1, 6, null);
                    obj = AbstractC3428A.romeo(new C1.t(new O0(contentResolver, uriFor, new com.google.android.gms.internal.measurement.U0(bravo, U6.alpha(Looper.getMainLooper())), bravo, context, null)), vf.ad.echo(), new Object(), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    linkedHashMap.put(context, obj);
                }
                l10 = (yf.L) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return l10;
    }

    public static final AbstractC0587t bravo(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof AbstractC0587t) {
            return (AbstractC0587t) tag;
        }
        return null;
    }
}
