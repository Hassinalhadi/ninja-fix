package s6;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class Z6 {
    public static final long alpha(float f5, float f10) {
        return (Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32);
    }

    public static final void bravo(Bundle bundle, String key) {
        Intrinsics.echo(key, "key");
        bundle.putString(key, null);
    }

    public static final void charlie(Intent intent, Bundle bundle) {
        bundle.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
    }

    public static final void delta(Bundle bundle, String key, Bundle value) {
        Intrinsics.echo(key, "key");
        Intrinsics.echo(value, "value");
        bundle.putBundle(key, value);
    }

    public static final void echo(String key, String value, Bundle bundle) {
        Intrinsics.echo(key, "key");
        Intrinsics.echo(value, "value");
        bundle.putString(key, value);
    }

    public static final void foxtrot(Bundle bundle, String key, String[] value) {
        Intrinsics.echo(key, "key");
        Intrinsics.echo(value, "value");
        bundle.putStringArray(key, value);
    }

    public static final void golf(Bundle bundle, String str, List value) {
        ArrayList<String> arrayList;
        Intrinsics.echo(value, "value");
        if (value instanceof ArrayList) {
            arrayList = (ArrayList) value;
        } else {
            arrayList = new ArrayList<>(value);
        }
        bundle.putStringArrayList(str, arrayList);
    }
}
