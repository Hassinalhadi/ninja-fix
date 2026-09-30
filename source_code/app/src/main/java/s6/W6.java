package s6;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.compose.LottieConstants;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import t6.AbstractC3062u;

/* loaded from: classes2.dex */
public abstract class W6 {
    public static final Q0.f alpha(Context context) {
        float f5 = context.getResources().getConfiguration().fontScale;
        float f10 = context.getResources().getDisplayMetrics().density;
        R0.a alpha = R0.b.alpha(f5);
        if (alpha == null) {
            alpha = new Q0.o(f5);
        }
        return new Q0.f(f10, f5, alpha);
    }

    public static final double bravo(Bundle bundle, String key) {
        Intrinsics.echo(key, "key");
        double d4 = bundle.getDouble(key, Double.MIN_VALUE);
        if (d4 == Double.MIN_VALUE && bundle.getDouble(key, Double.MAX_VALUE) == Double.MAX_VALUE) {
            X6.charlie(key);
            throw null;
        }
        return d4;
    }

    public static final float charlie(Bundle bundle, String key) {
        Intrinsics.echo(key, "key");
        float f5 = bundle.getFloat(key, Float.MIN_VALUE);
        if (f5 == Float.MIN_VALUE && bundle.getFloat(key, Float.MAX_VALUE) == Float.MAX_VALUE) {
            X6.charlie(key);
            throw null;
        }
        return f5;
    }

    public static final int delta(Bundle bundle, String key) {
        Intrinsics.echo(key, "key");
        int i4 = bundle.getInt(key, RecyclerView.UNDEFINED_DURATION);
        if (i4 == Integer.MIN_VALUE && bundle.getInt(key, LottieConstants.IterateForever) == Integer.MAX_VALUE) {
            X6.charlie(key);
            throw null;
        }
        return i4;
    }

    public static final long echo(Bundle bundle, String key) {
        Intrinsics.echo(key, "key");
        long j5 = bundle.getLong(key, Long.MIN_VALUE);
        if (j5 == Long.MIN_VALUE && bundle.getLong(key, Long.MAX_VALUE) == Long.MAX_VALUE) {
            X6.charlie(key);
            throw null;
        }
        return j5;
    }

    public static final Bundle foxtrot(Bundle bundle, String key) {
        Intrinsics.echo(key, "key");
        Bundle bundle2 = bundle.getBundle(key);
        if (bundle2 != null) {
            return bundle2;
        }
        X6.charlie(key);
        throw null;
    }

    public static final ArrayList golf(Bundle bundle, String key) {
        ArrayList parcelableArrayList;
        Intrinsics.echo(key, "key");
        Class bravo = AbstractC3062u.bravo(kotlin.jvm.internal.u.alpha.bravo(Bundle.class));
        if (Build.VERSION.SDK_INT >= 34) {
            parcelableArrayList = U0.o.charlie(bundle, key, bravo);
        } else {
            parcelableArrayList = bundle.getParcelableArrayList(key);
        }
        if (parcelableArrayList != null) {
            return parcelableArrayList;
        }
        X6.charlie(key);
        throw null;
    }

    public static final String hotel(Bundle bundle, String key) {
        Intrinsics.echo(key, "key");
        String string = bundle.getString(key);
        if (string != null) {
            return string;
        }
        X6.charlie(key);
        throw null;
    }

    public static final String[] india(Bundle bundle, String key) {
        Intrinsics.echo(key, "key");
        String[] stringArray = bundle.getStringArray(key);
        if (stringArray != null) {
            return stringArray;
        }
        X6.charlie(key);
        throw null;
    }

    public static final boolean juliet(Bundle bundle, String key) {
        Intrinsics.echo(key, "key");
        if (bundle.containsKey(key) && bundle.get(key) == null) {
            return true;
        }
        return false;
    }

    public static final Ld.g kilo(Bundle bundle) {
        Ld.g gVar = new Ld.g(bundle.size());
        for (String str : bundle.keySet()) {
            Intrinsics.checkNotNull(str);
            gVar.put(str, bundle.get(str));
        }
        return gVar.bravo();
    }
}
