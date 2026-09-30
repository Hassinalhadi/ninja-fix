package Zd;

import Ke.e;
import Ne.b;
import Ne.f;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.compose.LottieConstants;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class a {
    public static final b alpha(e eVar, int i4) {
        Intrinsics.echo(eVar, "<this>");
        return b.echo(eVar.hotel(i4), eVar.mike(i4));
    }

    public static final f bravo(e eVar, int i4) {
        Intrinsics.echo(eVar, "<this>");
        return f.delta(eVar.getString(i4));
    }

    public static int charlie(double d4) {
        if (!Double.isNaN(d4)) {
            if (d4 > 2.147483647E9d) {
                return LottieConstants.IterateForever;
            }
            if (d4 < -2.147483648E9d) {
                return RecyclerView.UNDEFINED_DURATION;
            }
            return (int) Math.round(d4);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    public static int delta(float f5) {
        if (!Float.isNaN(f5)) {
            return Math.round(f5);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    public static long echo(double d4) {
        if (!Double.isNaN(d4)) {
            return Math.round(d4);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }
}
