package t6;

import ja.burhanrashid52.photoeditor.shape.ShapeBuilder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import s6.AbstractC2760r6;

/* loaded from: classes2.dex */
public abstract class A2 {
    public static final void alpha(int i4, int i5) {
        if (i4 >= 0 && i4 < i5) {
        } else {
            throw new IndexOutOfBoundsException(A0.z.juliet("index: ", i4, i5, ", size: "));
        }
    }

    public static final void bravo(int i4, int i5) {
        if (i4 >= 0 && i4 <= i5) {
        } else {
            throw new IndexOutOfBoundsException(A0.z.juliet("index: ", i4, i5, ", size: "));
        }
    }

    public static final void charlie(int i4, int i5, int i10) {
        if (i4 >= 0 && i5 <= i10) {
            if (i4 <= i5) {
            } else {
                throw new IllegalArgumentException(A0.z.juliet("fromIndex: ", i4, i5, " > toIndex: "));
            }
        } else {
            StringBuilder hotel = av.q.hotel(i4, i5, "fromIndex: ", ", toIndex: ", ", size: ");
            hotel.append(i10);
            throw new IndexOutOfBoundsException(hotel.toString());
        }
    }

    public static final int delta(String str) {
        if (kotlin.text.r.quebec(str, "#", false)) {
            int length = str.length();
            if (length != 4) {
                if (length != 5) {
                    if (length != 7) {
                        if (length != 9) {
                            return ShapeBuilder.DEFAULT_SHAPE_COLOR;
                        }
                        String substring = str.substring(1);
                        Intrinsics.delta(substring, "substring(...)");
                        return AbstractC2760r6.charlie(substring);
                    }
                    String substring2 = str.substring(1);
                    Intrinsics.delta(substring2, "substring(...)");
                    return AbstractC2760r6.charlie(substring2) | ShapeBuilder.DEFAULT_SHAPE_COLOR;
                }
                String substring3 = str.substring(1);
                Intrinsics.delta(substring3, "substring(...)");
                int charlie = AbstractC2760r6.charlie(substring3);
                return ((charlie & 15) * 17) | (((charlie >> 12) & 15) * 285212672) | (((charlie >> 8) & 15) * 1114112) | (((charlie >> 4) & 15) * 4352) | ShapeBuilder.DEFAULT_SHAPE_COLOR;
            }
            String substring4 = str.substring(1);
            Intrinsics.delta(substring4, "substring(...)");
            int charlie2 = AbstractC2760r6.charlie(substring4);
            return ((charlie2 & 15) * 17) | (((charlie2 >> 8) & 15) * 1114112) | (((charlie2 >> 4) & 15) * 4352) | ShapeBuilder.DEFAULT_SHAPE_COLOR;
        }
        throw new IllegalArgumentException("Invalid color value ".concat(str).toString());
    }

    public static final float echo(String str, Q0.d density) {
        Intrinsics.echo(density, "density");
        if (str == null) {
            return 0.0f;
        }
        if (kotlin.text.r.golf(str, "dp", false)) {
            return Float.parseFloat(StringsKt.magenta(str, "dp"));
        }
        if (kotlin.text.r.golf(str, "px", false)) {
            return density.gold(Float.parseFloat(StringsKt.magenta(str, "px")));
        }
        throw new UnsupportedOperationException("value should ends with dp or px");
    }

    public static final int foxtrot(String str) {
        int hashCode = str.hashCode();
        if (hashCode != -1073910849) {
            if (hashCode != -436781190) {
                if (hashCode == 94742715 && str.equals("clamp")) {
                    return 0;
                }
            } else if (str.equals("repeated")) {
                return 1;
            }
        } else if (str.equals("mirror")) {
            return 2;
        }
        throw new UnsupportedOperationException("unknown tileMode: ".concat(str));
    }
}
