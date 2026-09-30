package t6;

/* loaded from: classes2.dex */
public abstract class Z3 {
    public static int alpha(int i4, int i5, boolean z2) {
        int i10;
        if (z2) {
            i10 = ((i5 - i4) + 360) % 360;
        } else {
            i10 = (i5 + i4) % 360;
        }
        if (AbstractC3066u3.foxtrot(2, AbstractC3066u3.hotel("CameraOrientationUtil"))) {
            StringBuilder hotel = av.q.hotel(i4, i5, "getRelativeImageRotation: destRotationDegrees=", ", sourceRotationDegrees=", ", isOppositeFacing=");
            hotel.append(z2);
            hotel.append(", result=");
            hotel.append(i10);
            AbstractC3066u3.bravo("CameraOrientationUtil", hotel.toString());
        }
        return i10;
    }

    public static int bravo(int i4) {
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 3) {
                        return 270;
                    }
                    throw new IllegalArgumentException(ao.ad.zulu(i4, "Unsupported surface rotation: "));
                }
                return 180;
            }
            return 90;
        }
        return 0;
    }
}
