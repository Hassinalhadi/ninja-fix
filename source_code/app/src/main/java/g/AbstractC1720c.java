package g;

import D0.af;
import D0.e;
import D0.g;
import H0.r;
import H0.v;
import O0.l;
import Q0.p;
import a0.C0366t;
import a0.ar;
import android.content.ClipData;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import com.google.android.material.internal.s;
import java.util.List;
import kotlin.collections.CollectionsKt;
import t0.C2896N;

/* renamed from: g.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1720c {
    public static final StackTraceElement[] alpha = new StackTraceElement[0];

    /* JADX WARN: Multi-variable type inference failed */
    public static final C2896N alpha(g gVar) {
        List list;
        byte b2;
        List list2 = gVar.red;
        if (list2 == null) {
            list = CollectionsKt.emptyList();
        } else {
            list = list2;
        }
        boolean isEmpty = list.isEmpty();
        String str = gVar.purple;
        if (!isEmpty) {
            SpannableString spannableString = new SpannableString(str);
            s sVar = new s(7, false);
            sVar.purple = Parcel.obtain();
            if (list2 == null) {
                list2 = CollectionsKt.emptyList();
            }
            int size = list2.size();
            int i4 = 0;
            while (i4 < size) {
                e eVar = (e) list2.get(i4);
                af afVar = (af) eVar.alpha;
                ((Parcel) sVar.purple).recycle();
                sVar.purple = Parcel.obtain();
                long bravo = afVar.alpha.bravo();
                long j5 = C0366t.kilo;
                if (!C0366t.charlie(bravo, j5)) {
                    sVar.azure((byte) 1);
                    ((Parcel) sVar.purple).writeLong(afVar.alpha.bravo());
                }
                long j6 = p.charlie;
                int i5 = i4;
                long j7 = afVar.bravo;
                byte b4 = 2;
                if (!p.alpha(j7, j6)) {
                    sVar.azure((byte) 2);
                    sVar.black(j7);
                }
                v vVar = afVar.charlie;
                if (vVar != null) {
                    sVar.azure((byte) 3);
                    ((Parcel) sVar.purple).writeInt(vVar.alpha);
                }
                r rVar = afVar.delta;
                if (rVar != null) {
                    sVar.azure((byte) 4);
                    int i10 = rVar.alpha;
                    if (i10 == 0 || i10 != 1) {
                        b2 = 0;
                    } else {
                        b2 = 1;
                    }
                    sVar.azure(b2);
                }
                H0.s sVar2 = afVar.echo;
                if (sVar2 != null) {
                    sVar.azure((byte) 5);
                    int i11 = sVar2.alpha;
                    if (i11 != 0) {
                        if (i11 == 65535) {
                            b4 = 1;
                        } else if (i11 != 1) {
                            if (i11 == 2) {
                                b4 = 3;
                            }
                        }
                        sVar.azure(b4);
                    }
                    b4 = 0;
                    sVar.azure(b4);
                }
                String str2 = afVar.golf;
                if (str2 != null) {
                    sVar.azure((byte) 6);
                    ((Parcel) sVar.purple).writeString(str2);
                }
                long j10 = afVar.hotel;
                if (!p.alpha(j10, j6)) {
                    sVar.azure((byte) 7);
                    sVar.black(j10);
                }
                O0.a aVar = afVar.india;
                if (aVar != null) {
                    sVar.azure((byte) 8);
                    sVar.beige(aVar.alpha);
                }
                O0.p pVar = afVar.juliet;
                if (pVar != null) {
                    sVar.azure((byte) 9);
                    sVar.beige(pVar.alpha);
                    sVar.beige(pVar.bravo);
                }
                long j11 = afVar.lima;
                if (!C0366t.charlie(j11, j5)) {
                    sVar.azure((byte) 10);
                    ((Parcel) sVar.purple).writeLong(j11);
                }
                l lVar = afVar.mike;
                if (lVar != null) {
                    sVar.azure((byte) 11);
                    ((Parcel) sVar.purple).writeInt(lVar.alpha);
                }
                ar arVar = afVar.november;
                if (arVar != null) {
                    sVar.azure((byte) 12);
                    ((Parcel) sVar.purple).writeLong(arVar.alpha);
                    long j12 = arVar.bravo;
                    sVar.beige(Float.intBitsToFloat((int) (j12 >> 32)));
                    sVar.beige(Float.intBitsToFloat((int) (j12 & 4294967295L)));
                    sVar.beige(arVar.charlie);
                }
                spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(((Parcel) sVar.purple).marshall(), 0)), eVar.bravo, eVar.charlie, 33);
                i4 = i5 + 1;
            }
            str = spannableString;
        }
        return new C2896N(ClipData.newPlainText("plain text", str));
    }
}
