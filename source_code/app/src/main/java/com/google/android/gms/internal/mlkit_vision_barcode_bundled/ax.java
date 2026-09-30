package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class ax implements A {
    public static final ah bravo = new ah(3);
    public final Object alpha;

    public ax(A... aArr) {
        this.alpha = aArr;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.A
    public J alpha(Class cls) {
        for (int i4 = 0; i4 < 2; i4++) {
            A a6 = ((A[]) this.alpha)[i4];
            if (a6.bravo(cls)) {
                return a6.alpha(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.A
    public boolean bravo(Class cls) {
        for (int i4 = 0; i4 < 2; i4++) {
            if (((A[]) this.alpha)[i4].bravo(cls)) {
                return true;
            }
        }
        return false;
    }

    public void charlie(AbstractC1431z abstractC1431z) {
        if (abstractC1431z.lima()) {
            int binarySearch = Arrays.binarySearch(L.f7428a, abstractC1431z.hotel());
            if (binarySearch < 0) {
                binarySearch = (-(binarySearch + 1)) - 1;
            }
            ArrayDeque arrayDeque = (ArrayDeque) this.alpha;
            int yankee = L.yankee(binarySearch + 1);
            if (!arrayDeque.isEmpty() && ((AbstractC1431z) arrayDeque.peek()).hotel() < yankee) {
                int yankee2 = L.yankee(binarySearch);
                AbstractC1431z abstractC1431z2 = (AbstractC1431z) arrayDeque.pop();
                while (!arrayDeque.isEmpty() && ((AbstractC1431z) arrayDeque.peek()).hotel() < yankee2) {
                    abstractC1431z2 = new L((AbstractC1431z) arrayDeque.pop(), abstractC1431z2);
                }
                L l10 = new L(abstractC1431z2, abstractC1431z);
                while (!arrayDeque.isEmpty()) {
                    int binarySearch2 = Arrays.binarySearch(L.f7428a, l10.red);
                    if (binarySearch2 < 0) {
                        binarySearch2 = (-(binarySearch2 + 1)) - 1;
                    }
                    if (((AbstractC1431z) arrayDeque.peek()).hotel() >= L.yankee(binarySearch2 + 1)) {
                        break;
                    } else {
                        l10 = new L((AbstractC1431z) arrayDeque.pop(), l10);
                    }
                }
                arrayDeque.push(l10);
                return;
            }
            arrayDeque.push(abstractC1431z);
            return;
        }
        if (abstractC1431z instanceof L) {
            L l11 = (L) abstractC1431z;
            charlie(l11.silver);
            charlie(l11.teal);
            return;
        }
        throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(abstractC1431z.getClass())));
    }

    public void delta(int i4, Object obj, M m4) {
        aa aaVar = (aa) this.alpha;
        aaVar.black(i4, 3);
        m4.india((B) obj, aaVar.alpha);
        aaVar.black(i4, 4);
    }

    public void echo(int i4, Object obj, M m4) {
        B b2 = (B) obj;
        aa aaVar = (aa) this.alpha;
        aaVar.bronze((i4 << 3) | 2);
        aaVar.bronze(((AbstractC1423q) b2).bravo(m4));
        m4.india(b2, aaVar.alpha);
    }

    public ax(int i4) {
        switch (i4) {
            case 3:
                this.alpha = new ArrayDeque();
                return;
            default:
                H h4 = H.charlie;
                ax axVar = new ax(ah.bravo, bravo);
                Charset charset = at.alpha;
                this.alpha = axVar;
                return;
        }
    }

    public ax(aa aaVar) {
        Charset charset = at.alpha;
        this.alpha = aaVar;
        aaVar.alpha = this;
    }
}
