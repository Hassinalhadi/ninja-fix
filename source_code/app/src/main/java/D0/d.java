package D0;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class d implements Appendable {
    public final StringBuilder alpha;
    public final ArrayList purple;
    public final ArrayList red;

    public d() {
        this.alpha = new StringBuilder(16);
        this.purple = new ArrayList();
        this.red = new ArrayList();
        new ArrayList();
    }

    public final void alpha(g gVar) {
        StringBuilder sb2 = this.alpha;
        int length = sb2.length();
        sb2.append(gVar.purple);
        List list = gVar.alpha;
        if (list != null) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                e eVar = (e) list.get(i4);
                ArrayList arrayList = this.red;
                Object obj = eVar.alpha;
                arrayList.add(new c(eVar.delta, eVar.bravo + length, eVar.charlie + length, obj));
            }
        }
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof g) {
            alpha((g) charSequence);
            return this;
        }
        this.alpha.append(charSequence);
        return this;
    }

    public final void bravo(String str) {
        this.alpha.append(str);
    }

    public final void charlie() {
        ArrayList arrayList = this.purple;
        if (arrayList.isEmpty()) {
            J0.a.bravo("Nothing to pop.");
        }
        ((c) arrayList.remove(arrayList.size() - 1)).charlie = this.alpha.length();
    }

    public final void delta(int i4) {
        ArrayList arrayList = this.purple;
        if (i4 >= arrayList.size()) {
            J0.a.bravo(i4 + " should be less than " + arrayList.size());
        }
        while (arrayList.size() - 1 >= i4) {
            charlie();
        }
    }

    public final int echo(af afVar) {
        c cVar = new c(afVar, this.alpha.length(), 0, null, 12);
        this.purple.add(cVar);
        this.red.add(cVar);
        return r7.size() - 1;
    }

    public final g foxtrot() {
        StringBuilder sb2 = this.alpha;
        String sb3 = sb2.toString();
        ArrayList arrayList = this.red;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            arrayList2.add(((c) arrayList.get(i4)).alpha(sb2.length()));
        }
        return new g(sb3, arrayList2);
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i4, int i5) {
        boolean z2 = charSequence instanceof g;
        StringBuilder sb2 = this.alpha;
        if (z2) {
            g gVar = (g) charSequence;
            int length = sb2.length();
            sb2.append((CharSequence) gVar.purple, i4, i5);
            List alpha = h.alpha(gVar, i4, i5, null);
            if (alpha != null) {
                int size = alpha.size();
                for (int i10 = 0; i10 < size; i10++) {
                    e eVar = (e) alpha.get(i10);
                    ArrayList arrayList = this.red;
                    Object obj = eVar.alpha;
                    arrayList.add(new c(eVar.delta, eVar.bravo + length, eVar.charlie + length, obj));
                }
            }
            return this;
        }
        sb2.append(charSequence, i4, i5);
        return this;
    }

    public d(g gVar) {
        this();
        alpha(gVar);
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c3) {
        this.alpha.append(c3);
        return this;
    }
}
