package d2;

import Y1.aq;
import Y1.ar;
import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import com.google.maps.android.BuildConfig;
import kotlin.jvm.internal.Intrinsics;
import s6.W6;
import s6.X6;
import s6.Z6;

/* renamed from: d2.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1584i extends aq {
    public static final C1584i sierra = new C1584i(0, false);
    public final /* synthetic */ int romeo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1584i(int i4, boolean z2) {
        super(z2);
        this.romeo = i4;
    }

    @Override // Y1.aq
    public final Object alpha(Bundle bundle, String key) {
        switch (this.romeo) {
            case 0:
                Intrinsics.echo(bundle, "bundle");
                Intrinsics.echo(key, "key");
                return null;
            case 1:
                if (!Q0.c.beige(bundle, "bundle", key, Constants.KEY_KEY, key) || W6.juliet(bundle, key)) {
                    return null;
                }
                boolean z2 = bundle.getBoolean(key, false);
                if (!z2 && bundle.getBoolean(key, true)) {
                    X6.charlie(key);
                    throw null;
                }
                return Boolean.valueOf(z2);
            case 2:
                if (Q0.c.beige(bundle, "bundle", key, Constants.KEY_KEY, key) && !W6.juliet(bundle, key)) {
                    return Double.valueOf(W6.bravo(bundle, key));
                }
                return null;
            case 3:
                Intrinsics.echo(bundle, "bundle");
                Intrinsics.echo(key, "key");
                return Double.valueOf(W6.bravo(bundle, key));
            case 4:
                if (Q0.c.beige(bundle, "bundle", key, Constants.KEY_KEY, key) && !W6.juliet(bundle, key)) {
                    return Float.valueOf(W6.charlie(bundle, key));
                }
                return null;
            case 5:
                if (Q0.c.beige(bundle, "bundle", key, Constants.KEY_KEY, key) && !W6.juliet(bundle, key)) {
                    return Integer.valueOf(W6.delta(bundle, key));
                }
                return null;
            case 6:
                if (Q0.c.beige(bundle, "bundle", key, Constants.KEY_KEY, key) && !W6.juliet(bundle, key)) {
                    return Long.valueOf(W6.echo(bundle, key));
                }
                return null;
            default:
                if (Q0.c.beige(bundle, "bundle", key, Constants.KEY_KEY, key) && !W6.juliet(bundle, key)) {
                    return W6.hotel(bundle, key);
                }
                return BuildConfig.TRAVIS;
        }
    }

    @Override // Y1.aq
    public final String bravo() {
        switch (this.romeo) {
            case 0:
                return "unknown";
            case 1:
                return "boolean_nullable";
            case 2:
                return "double_nullable";
            case 3:
                return "double";
            case 4:
                return "float_nullable";
            case 5:
                return "integer_nullable";
            case 6:
                return "long_nullable";
            default:
                return "string_non_nullable";
        }
    }

    @Override // Y1.aq
    public final Object delta(String value) {
        switch (this.romeo) {
            case 0:
                Intrinsics.echo(value, "value");
                return BuildConfig.TRAVIS;
            case 1:
                Intrinsics.echo(value, "value");
                if (Intrinsics.areEqual(value, BuildConfig.TRAVIS)) {
                    return null;
                }
                return (Boolean) aq.lima.delta(value);
            case 2:
                Intrinsics.echo(value, "value");
                if (Intrinsics.areEqual(value, BuildConfig.TRAVIS)) {
                    return null;
                }
                return Double.valueOf(Double.parseDouble(value));
            case 3:
                Intrinsics.echo(value, "value");
                return Double.valueOf(Double.parseDouble(value));
            case 4:
                Intrinsics.echo(value, "value");
                if (Intrinsics.areEqual(value, BuildConfig.TRAVIS)) {
                    return null;
                }
                return (Float) aq.india.delta(value);
            case 5:
                Intrinsics.echo(value, "value");
                if (Intrinsics.areEqual(value, BuildConfig.TRAVIS)) {
                    return null;
                }
                return (Integer) aq.bravo.delta(value);
            case 6:
                Intrinsics.echo(value, "value");
                if (Intrinsics.areEqual(value, BuildConfig.TRAVIS)) {
                    return null;
                }
                return (Long) aq.foxtrot.delta(value);
            default:
                Intrinsics.echo(value, "value");
                return value;
        }
    }

    @Override // Y1.aq
    public final void echo(Bundle bundle, String key, Object obj) {
        switch (this.romeo) {
            case 0:
                Intrinsics.echo(key, "key");
                Intrinsics.echo((String) obj, "value");
                return;
            case 1:
                Boolean bool = (Boolean) obj;
                Intrinsics.echo(key, "key");
                if (bool == null) {
                    Z6.bravo(bundle, key);
                    return;
                } else {
                    aq.lima.echo(bundle, key, bool);
                    return;
                }
            case 2:
                Double d4 = (Double) obj;
                Intrinsics.echo(key, "key");
                if (d4 == null) {
                    Z6.bravo(bundle, key);
                    return;
                } else {
                    bundle.putDouble(key, d4.doubleValue());
                    return;
                }
            case 3:
                double doubleValue = ((Number) obj).doubleValue();
                Intrinsics.echo(key, "key");
                bundle.putDouble(key, doubleValue);
                return;
            case 4:
                Float f5 = (Float) obj;
                Intrinsics.echo(key, "key");
                if (f5 == null) {
                    Z6.bravo(bundle, key);
                    return;
                } else {
                    aq.india.echo(bundle, key, f5);
                    return;
                }
            case 5:
                Integer num = (Integer) obj;
                Intrinsics.echo(key, "key");
                if (num == null) {
                    Z6.bravo(bundle, key);
                    return;
                } else {
                    aq.bravo.echo(bundle, key, num);
                    return;
                }
            case 6:
                Long l10 = (Long) obj;
                Intrinsics.echo(key, "key");
                if (l10 == null) {
                    Z6.bravo(bundle, key);
                    return;
                } else {
                    aq.foxtrot.echo(bundle, key, l10);
                    return;
                }
            default:
                String value = (String) obj;
                Intrinsics.echo(key, "key");
                Intrinsics.echo(value, "value");
                Z6.echo(key, value, bundle);
                return;
        }
    }

    @Override // Y1.aq
    public String foxtrot(Object obj) {
        switch (this.romeo) {
            case 7:
                String value = (String) obj;
                Intrinsics.echo(value, "value");
                return ar.bravo(value);
            default:
                return super.foxtrot(obj);
        }
    }
}
