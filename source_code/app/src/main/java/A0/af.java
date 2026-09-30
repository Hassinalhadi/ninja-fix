package A0;

import android.util.Rational;
import java.util.Comparator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s0.al;
import s6.AbstractC2769s6;

/* loaded from: classes3.dex */
public final class af implements Comparator {
    public final /* synthetic */ int alpha;
    public final Object purple;

    public /* synthetic */ af(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        float f5;
        float f10;
        switch (this.alpha) {
            case 0:
                int compare = ((Comparator) this.purple).compare(obj, obj2);
                if (compare == 0) {
                    return al.f13276M.compare(((s) obj).charlie, ((s) obj2).charlie);
                }
                return compare;
            case 1:
                int compare2 = ((af) this.purple).compare(obj, obj2);
                if (compare2 == 0) {
                    return AbstractC2769s6.bravo(Integer.valueOf(((s) obj).golf), Integer.valueOf(((s) obj2).golf));
                }
                return compare2;
            case 2:
                Rational rational = (Rational) obj2;
                Rational rational2 = (Rational) this.purple;
                float floatValue = ((Rational) obj).floatValue();
                float floatValue2 = rational2.floatValue();
                if (floatValue > floatValue2) {
                    f5 = floatValue2 / floatValue;
                } else {
                    f5 = floatValue / floatValue2;
                }
                float floatValue3 = rational.floatValue();
                float floatValue4 = rational2.floatValue();
                if (floatValue3 > floatValue4) {
                    f10 = floatValue4 / floatValue3;
                } else {
                    f10 = floatValue3 / floatValue4;
                }
                return Float.compare(f10, f5);
            case 3:
                je.ad tmp0 = (je.ad) this.purple;
                Intrinsics.echo(tmp0, "$tmp0");
                return ((Number) tmp0.invoke(obj, obj2)).intValue();
            default:
                kotlin.reflect.jvm.internal.impl.types.y it = (kotlin.reflect.jvm.internal.impl.types.y) obj;
                Intrinsics.delta(it, "it");
                Function1 function1 = (Function1) this.purple;
                String obj3 = function1.invoke(it).toString();
                kotlin.reflect.jvm.internal.impl.types.y it2 = (kotlin.reflect.jvm.internal.impl.types.y) obj2;
                Intrinsics.delta(it2, "it");
                return AbstractC2769s6.bravo(obj3, function1.invoke(it2).toString());
        }
    }

    public af(Comparator comparator) {
        this.alpha = 0;
        s0.af afVar = al.f13273J;
        this.purple = comparator;
    }
}
