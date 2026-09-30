package g7;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.clevertap.android.sdk.Constants;
import s6.Q4;
import s6.R4;

/* loaded from: classes2.dex */
public final class m {
    public static final j mike = new j(0.5f);
    public Q4 alpha = new Object();
    public Q4 bravo = new Object();
    public Q4 charlie = new Object();
    public Q4 delta = new Object();
    public d echo = new C1755a(0.0f);
    public d foxtrot = new C1755a(0.0f);
    public d golf = new C1755a(0.0f);
    public d hotel = new C1755a(0.0f);
    public f india = new f(0);
    public f juliet = new f(0);
    public f kilo = new f(0);
    public f lima = new f(0);

    public static l alpha(Context context, int i4, int i5) {
        return bravo(context, i4, i5, new C1755a(0));
    }

    public static l bravo(Context context, int i4, int i5, d dVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i4);
        if (i5 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i5, true);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(L6.a.gold);
        try {
            int i10 = obtainStyledAttributes.getInt(0, 0);
            int i11 = obtainStyledAttributes.getInt(3, i10);
            int i12 = obtainStyledAttributes.getInt(4, i10);
            int i13 = obtainStyledAttributes.getInt(2, i10);
            int i14 = obtainStyledAttributes.getInt(1, i10);
            d delta = delta(obtainStyledAttributes, 5, dVar);
            d delta2 = delta(obtainStyledAttributes, 8, delta);
            d delta3 = delta(obtainStyledAttributes, 9, delta);
            d delta4 = delta(obtainStyledAttributes, 7, delta);
            d delta5 = delta(obtainStyledAttributes, 6, delta);
            l lVar = new l();
            Q4 alpha = R4.alpha(i11);
            lVar.alpha = alpha;
            l.bravo(alpha);
            lVar.echo = delta2;
            Q4 alpha2 = R4.alpha(i12);
            lVar.bravo = alpha2;
            l.bravo(alpha2);
            lVar.foxtrot = delta3;
            Q4 alpha3 = R4.alpha(i13);
            lVar.charlie = alpha3;
            l.bravo(alpha3);
            lVar.golf = delta4;
            Q4 alpha4 = R4.alpha(i14);
            lVar.delta = alpha4;
            l.bravo(alpha4);
            lVar.hotel = delta5;
            return lVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static l charlie(Context context, AttributeSet attributeSet, int i4, int i5) {
        C1755a c1755a = new C1755a(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, L6.a.beige, i4, i5);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return bravo(context, resourceId, resourceId2, c1755a);
    }

    public static d delta(TypedArray typedArray, int i4, d dVar) {
        TypedValue peekValue = typedArray.peekValue(i4);
        if (peekValue != null) {
            int i5 = peekValue.type;
            if (i5 == 5) {
                return new C1755a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i5 == 6) {
                return new j(peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return dVar;
    }

    public final boolean echo() {
        if ((this.bravo instanceof k) && (this.alpha instanceof k) && (this.charlie instanceof k) && (this.delta instanceof k)) {
            return true;
        }
        return false;
    }

    public final boolean foxtrot(RectF rectF) {
        boolean z2;
        boolean z10;
        if (this.lima.getClass().equals(f.class) && this.juliet.getClass().equals(f.class) && this.india.getClass().equals(f.class) && this.kilo.getClass().equals(f.class)) {
            z2 = true;
        } else {
            z2 = false;
        }
        float alpha = this.echo.alpha(rectF);
        if (this.foxtrot.alpha(rectF) == alpha && this.hotel.alpha(rectF) == alpha && this.golf.alpha(rectF) == alpha) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z2 || !z10 || !echo()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [g7.l, java.lang.Object] */
    public final l golf() {
        ?? obj = new Object();
        obj.alpha = this.alpha;
        obj.bravo = this.bravo;
        obj.charlie = this.charlie;
        obj.delta = this.delta;
        obj.echo = this.echo;
        obj.foxtrot = this.foxtrot;
        obj.golf = this.golf;
        obj.hotel = this.hotel;
        obj.india = this.india;
        obj.juliet = this.juliet;
        obj.kilo = this.kilo;
        obj.lima = this.lima;
        return obj;
    }

    public final String toString() {
        return Constants.AES_PREFIX + this.echo + ", " + this.foxtrot + ", " + this.golf + ", " + this.hotel + Constants.AES_SUFFIX;
    }
}
