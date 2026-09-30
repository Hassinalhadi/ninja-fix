package Y1;

import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.variables.CTVariableUtils;
import com.google.maps.android.BuildConfig;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2743p6;
import s6.W6;
import s6.X6;
import s6.Z6;

/* loaded from: classes3.dex */
public final class e extends aq {
    public final /* synthetic */ int romeo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i4, boolean z2) {
        super(z2);
        this.romeo = i4;
    }

    @Override // Y1.aq
    public final Object alpha(Bundle bundle, String key) {
        switch (this.romeo) {
            case 0:
                if (!Q0.c.beige(bundle, "bundle", key, Constants.KEY_KEY, key) || W6.juliet(bundle, key)) {
                    return null;
                }
                boolean z2 = bundle.getBoolean(key, false);
                if (!z2 && bundle.getBoolean(key, true)) {
                    X6.charlie(key);
                    throw null;
                }
                return Boolean.valueOf(z2);
            case 1:
                Intrinsics.echo(bundle, "bundle");
                Intrinsics.echo(key, "key");
                return Float.valueOf(W6.charlie(bundle, key));
            case 2:
                Intrinsics.echo(bundle, "bundle");
                Intrinsics.echo(key, "key");
                return Integer.valueOf(W6.delta(bundle, key));
            case 3:
                Intrinsics.echo(bundle, "bundle");
                Intrinsics.echo(key, "key");
                return Long.valueOf(W6.echo(bundle, key));
            case 4:
                Intrinsics.echo(bundle, "bundle");
                Intrinsics.echo(key, "key");
                return Integer.valueOf(W6.delta(bundle, key));
            default:
                if (Q0.c.beige(bundle, "bundle", key, Constants.KEY_KEY, key) && !W6.juliet(bundle, key)) {
                    return W6.hotel(bundle, key);
                }
                return null;
        }
    }

    @Override // Y1.aq
    public final String bravo() {
        switch (this.romeo) {
            case 0:
                return CTVariableUtils.BOOLEAN;
            case 1:
                return "float";
            case 2:
                return "integer";
            case 3:
                return "long";
            case 4:
                return "reference";
            default:
                return CTVariableUtils.STRING;
        }
    }

    @Override // Y1.aq
    public final Object delta(String value) {
        boolean z2;
        int parseInt;
        String str;
        long parseLong;
        int parseInt2;
        switch (this.romeo) {
            case 0:
                Intrinsics.echo(value, "value");
                if (Intrinsics.areEqual(value, "true")) {
                    z2 = true;
                } else if (Intrinsics.areEqual(value, "false")) {
                    z2 = false;
                } else {
                    throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
                }
                return Boolean.valueOf(z2);
            case 1:
                Intrinsics.echo(value, "value");
                return Float.valueOf(Float.parseFloat(value));
            case 2:
                Intrinsics.echo(value, "value");
                if (kotlin.text.r.quebec(value, "0x", false)) {
                    String substring = value.substring(2);
                    Intrinsics.delta(substring, "substring(...)");
                    AbstractC2743p6.alpha(16);
                    parseInt = Integer.parseInt(substring, 16);
                } else {
                    parseInt = Integer.parseInt(value);
                }
                return Integer.valueOf(parseInt);
            case 3:
                Intrinsics.echo(value, "value");
                if (kotlin.text.r.golf(value, "L", false)) {
                    str = value.substring(0, value.length() - 1);
                    Intrinsics.delta(str, "substring(...)");
                } else {
                    str = value;
                }
                if (kotlin.text.r.quebec(value, "0x", false)) {
                    String substring2 = str.substring(2);
                    Intrinsics.delta(substring2, "substring(...)");
                    AbstractC2743p6.alpha(16);
                    parseLong = Long.parseLong(substring2, 16);
                } else {
                    parseLong = Long.parseLong(str);
                }
                return Long.valueOf(parseLong);
            case 4:
                Intrinsics.echo(value, "value");
                if (kotlin.text.r.quebec(value, "0x", false)) {
                    String substring3 = value.substring(2);
                    Intrinsics.delta(substring3, "substring(...)");
                    AbstractC2743p6.alpha(16);
                    parseInt2 = Integer.parseInt(substring3, 16);
                } else {
                    parseInt2 = Integer.parseInt(value);
                }
                return Integer.valueOf(parseInt2);
            default:
                Intrinsics.echo(value, "value");
                if (Intrinsics.areEqual(value, BuildConfig.TRAVIS)) {
                    return null;
                }
                return value;
        }
    }

    @Override // Y1.aq
    public final void echo(Bundle bundle, String key, Object obj) {
        switch (this.romeo) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Intrinsics.echo(key, "key");
                bundle.putBoolean(key, booleanValue);
                return;
            case 1:
                float floatValue = ((Number) obj).floatValue();
                Intrinsics.echo(key, "key");
                bundle.putFloat(key, floatValue);
                return;
            case 2:
                int intValue = ((Number) obj).intValue();
                Intrinsics.echo(key, "key");
                bundle.putInt(key, intValue);
                return;
            case 3:
                long longValue = ((Number) obj).longValue();
                Intrinsics.echo(key, "key");
                bundle.putLong(key, longValue);
                return;
            case 4:
                int intValue2 = ((Number) obj).intValue();
                Intrinsics.echo(key, "key");
                bundle.putInt(key, intValue2);
                return;
            default:
                String str = (String) obj;
                Intrinsics.echo(key, "key");
                if (str != null) {
                    Z6.echo(key, str, bundle);
                    return;
                } else {
                    Z6.bravo(bundle, key);
                    return;
                }
        }
    }

    @Override // Y1.aq
    public String foxtrot(Object obj) {
        switch (this.romeo) {
            case 5:
                String str = (String) obj;
                if (str != null) {
                    return ar.bravo(str);
                }
                return BuildConfig.TRAVIS;
            default:
                return super.foxtrot(obj);
        }
    }
}
