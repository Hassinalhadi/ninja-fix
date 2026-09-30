package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import y2.AbstractC3392a;
import y2.C3393b;

/* loaded from: classes3.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC3392a abstractC3392a) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.alpha = abstractC3392a.foxtrot(iconCompat.alpha, 1);
        byte[] bArr = iconCompat.charlie;
        if (abstractC3392a.echo(2)) {
            Parcel parcel = ((C3393b) abstractC3392a).echo;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.charlie = bArr;
        iconCompat.delta = abstractC3392a.golf(iconCompat.delta, 3);
        iconCompat.echo = abstractC3392a.foxtrot(iconCompat.echo, 4);
        iconCompat.foxtrot = abstractC3392a.foxtrot(iconCompat.foxtrot, 5);
        iconCompat.golf = (ColorStateList) abstractC3392a.golf(iconCompat.golf, 6);
        String str = iconCompat.india;
        if (abstractC3392a.echo(7)) {
            str = ((C3393b) abstractC3392a).echo.readString();
        }
        iconCompat.india = str;
        String str2 = iconCompat.juliet;
        if (abstractC3392a.echo(8)) {
            str2 = ((C3393b) abstractC3392a).echo.readString();
        }
        iconCompat.juliet = str2;
        iconCompat.hotel = PorterDuff.Mode.valueOf(iconCompat.india);
        switch (iconCompat.alpha) {
            case -1:
                Parcelable parcelable = iconCompat.delta;
                if (parcelable != null) {
                    iconCompat.bravo = parcelable;
                    return iconCompat;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.delta;
                if (parcelable2 != null) {
                    iconCompat.bravo = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.charlie;
                iconCompat.bravo = bArr3;
                iconCompat.alpha = 3;
                iconCompat.echo = 0;
                iconCompat.foxtrot = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.charlie, Charset.forName("UTF-16"));
                iconCompat.bravo = str3;
                if (iconCompat.alpha == 2 && iconCompat.juliet == null) {
                    iconCompat.juliet = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.bravo = iconCompat.charlie;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC3392a abstractC3392a) {
        abstractC3392a.getClass();
        iconCompat.india = iconCompat.hotel.name();
        switch (iconCompat.alpha) {
            case -1:
                iconCompat.delta = (Parcelable) iconCompat.bravo;
                break;
            case 1:
            case 5:
                iconCompat.delta = (Parcelable) iconCompat.bravo;
                break;
            case 2:
                iconCompat.charlie = ((String) iconCompat.bravo).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.charlie = (byte[]) iconCompat.bravo;
                break;
            case 4:
            case 6:
                iconCompat.charlie = iconCompat.bravo.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i4 = iconCompat.alpha;
        if (-1 != i4) {
            abstractC3392a.juliet(i4, 1);
        }
        byte[] bArr = iconCompat.charlie;
        if (bArr != null) {
            abstractC3392a.india(2);
            int length = bArr.length;
            Parcel parcel = ((C3393b) abstractC3392a).echo;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.delta;
        if (parcelable != null) {
            abstractC3392a.india(3);
            ((C3393b) abstractC3392a).echo.writeParcelable(parcelable, 0);
        }
        int i5 = iconCompat.echo;
        if (i5 != 0) {
            abstractC3392a.juliet(i5, 4);
        }
        int i10 = iconCompat.foxtrot;
        if (i10 != 0) {
            abstractC3392a.juliet(i10, 5);
        }
        ColorStateList colorStateList = iconCompat.golf;
        if (colorStateList != null) {
            abstractC3392a.india(6);
            ((C3393b) abstractC3392a).echo.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.india;
        if (str != null) {
            abstractC3392a.india(7);
            ((C3393b) abstractC3392a).echo.writeString(str);
        }
        String str2 = iconCompat.juliet;
        if (str2 != null) {
            abstractC3392a.india(8);
            ((C3393b) abstractC3392a).echo.writeString(str2);
        }
    }
}
