package c2;

import Y1.aa;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: c2.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0824b extends aa implements Y1.g {
    public String yellow;

    @Override // Y1.aa
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C0824b) && super.equals(obj) && Intrinsics.areEqual(this.yellow, ((C0824b) obj).yellow)) {
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
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, h.alpha);
        Intrinsics.delta(obtainAttributes, "obtainAttributes(...)");
        String string = obtainAttributes.getString(0);
        if (string != null) {
            this.yellow = string;
        }
        obtainAttributes.recycle();
    }
}
