package Gf;

import androidx.appcompat.widget.P0;
import com.checkout.components.card.utils.constants.ExpiryDateConstantsKt;
import com.clevertap.android.sdk.Constants;
import java.io.EOFException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class k {
    public static final char[] alpha = {'0', ExpiryDateConstantsKt.EXPIRY_DATE_ZERO_POSITION_CHECK, ExpiryDateConstantsKt.EXPIRY_DATE_VALID_TEEN_MONTH_SUFFIX_CHECK, '3', '4', '5', '6', '7', '8', '9', 'a', Constants.INAPP_POSITION_BOTTOM, Constants.INAPP_POSITION_CENTER, 'd', 'e', 'f'};

    public static final void alpha(long j5, long j6, long j7) {
        if (j6 >= 0 && j7 <= j5) {
            if (j6 <= j7) {
                return;
            }
            StringBuilder uniform = Q0.c.uniform("startIndex (", j6, ") > endIndex (");
            uniform.append(j7);
            uniform.append(')');
            throw new IllegalArgumentException(uniform.toString());
        }
        StringBuilder uniform2 = Q0.c.uniform("startIndex (", j6, ") and endIndex (");
        uniform2.append(j7);
        uniform2.append(") are not within the range [0..size(");
        uniform2.append(j5);
        uniform2.append("))");
        throw new IndexOutOfBoundsException(uniform2.toString());
    }

    public static final int bravo(g gVar, byte b2, int i4, int i5) {
        if (i4 >= 0 && i4 < gVar.bravo()) {
            if (i4 <= i5 && i5 <= gVar.bravo()) {
                int i10 = gVar.bravo;
                while (i4 < i5) {
                    if (gVar.alpha[i10 + i4] == b2) {
                        return i4;
                    }
                    i4++;
                }
                return -1;
            }
            throw new IllegalArgumentException(String.valueOf(i5).toString());
        }
        throw new IllegalArgumentException(String.valueOf(i4).toString());
    }

    public static final boolean charlie(g gVar) {
        Intrinsics.echo(gVar, "<this>");
        if (gVar.bravo() == 0) {
            return true;
        }
        return false;
    }

    public static final byte[] delta(i iVar, int i4) {
        Intrinsics.echo(iVar, "<this>");
        long j5 = i4;
        if (j5 >= 0) {
            return echo(iVar, i4);
        }
        throw new IllegalArgumentException(com.google.android.material.datepicker.j.kilo("byteCount (", j5, ") < 0").toString());
    }

    public static final byte[] echo(i iVar, int i4) {
        if (i4 == -1) {
            for (long j5 = 2147483647L; iVar.delta().red < 2147483647L && iVar.request(j5); j5 *= 2) {
            }
            if (iVar.delta().red < 2147483647L) {
                i4 = (int) iVar.delta().red;
            } else {
                throw new IllegalStateException(("Can't create an array of size " + iVar.delta().red).toString());
            }
        } else {
            iVar.kilo(i4);
        }
        byte[] bArr = new byte[i4];
        a delta = iVar.delta();
        Intrinsics.echo(delta, "<this>");
        long j6 = i4;
        int i5 = 0;
        alpha(j6, 0, j6);
        while (i5 < i4) {
            int charlie = delta.charlie(bArr, i5, i4);
            if (charlie != -1) {
                i5 += charlie;
            } else {
                throw new EOFException(P0.azure(i4, charlie, "Source exhausted before reading ", " bytes. Only ", " bytes were read."));
            }
        }
        return bArr;
    }
}
