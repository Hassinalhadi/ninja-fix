package c2;

import Y1.aa;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.maps.android.BuildConfig;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f extends aa {
    public String yellow;

    @Override // Y1.aa
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof f) && super.equals(obj) && Intrinsics.areEqual(this.yellow, ((f) obj).yellow)) {
            return true;
        }
        return false;
    }

    @Override // Y1.aa
    public final int hashCode() {
        int i4;
        int hashCode = super.hashCode() * 31;
        String str = this.yellow;
        if (str != null) {
            i4 = str.hashCode();
        } else {
            i4 = 0;
        }
        return hashCode + i4;
    }

    @Override // Y1.aa
    public final void lima(Context context, AttributeSet attrs) {
        Intrinsics.echo(context, "context");
        Intrinsics.echo(attrs, "attrs");
        super.lima(context, attrs);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, h.bravo);
        Intrinsics.delta(obtainAttributes, "obtainAttributes(...)");
        String string = obtainAttributes.getString(0);
        if (string != null) {
            this.yellow = string;
        }
        obtainAttributes.recycle();
    }

    @Override // Y1.aa
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" class=");
        String str = this.yellow;
        if (str == null) {
            sb2.append(BuildConfig.TRAVIS);
        } else {
            sb2.append(str);
        }
        String sb3 = sb2.toString();
        Intrinsics.delta(sb3, "toString(...)");
        return sb3;
    }
}
