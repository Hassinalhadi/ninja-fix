package n;

import g.AbstractC1719b;

/* loaded from: classes3.dex */
public abstract class k0 {
    public static final S5.l alpha = new S5.l(I0.s.alpha, 0, 0, 7);

    public static final I0.ah alpha(I0.aj ajVar, D0.g gVar) {
        I0.t tVar;
        I0.ah filter = ajVar.filter(gVar);
        int length = gVar.purple.length();
        int length2 = filter.alpha.purple.length();
        int min = Math.min(length, 100);
        int i4 = 0;
        while (true) {
            tVar = filter.bravo;
            if (i4 >= min) {
                break;
            }
            bravo(tVar.originalToTransformed(i4), length2, i4);
            i4++;
        }
        bravo(tVar.originalToTransformed(length), length2, length);
        int min2 = Math.min(length2, 100);
        for (int i5 = 0; i5 < min2; i5++) {
            charlie(tVar.transformedToOriginal(i5), length, i5);
        }
        charlie(tVar.transformedToOriginal(length2), length, length2);
        int length3 = gVar.purple.length();
        D0.g gVar2 = filter.alpha;
        return new I0.ah(gVar2, new S5.l(tVar, length3, gVar2.purple.length(), 7));
    }

    public static final void bravo(int i4, int i5, int i10) {
        boolean z2 = false;
        if (i4 >= 0 && i4 <= i5) {
            z2 = true;
        }
        if (!z2) {
            StringBuilder hotel = av.q.hotel(i10, i4, "OffsetMapping.originalToTransformed returned invalid mapping: ", " -> ", " is not in range of transformed text [0, ");
            hotel.append(i5);
            hotel.append(']');
            AbstractC1719b.charlie(hotel.toString());
        }
    }

    public static final void charlie(int i4, int i5, int i10) {
        boolean z2 = false;
        if (i4 >= 0 && i4 <= i5) {
            z2 = true;
        }
        if (!z2) {
            StringBuilder hotel = av.q.hotel(i10, i4, "OffsetMapping.transformedToOriginal returned invalid mapping: ", " -> ", " is not in range of original text [0, ");
            hotel.append(i5);
            hotel.append(']');
            AbstractC1719b.charlie(hotel.toString());
        }
    }
}
