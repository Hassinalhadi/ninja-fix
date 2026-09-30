package D0;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g implements CharSequence {
    public final List alpha;
    public final String purple;
    public final ArrayList red;
    public final ArrayList silver;

    static {
        J2.l lVar = ad.alpha;
    }

    public g(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int i4 = 0;
        this.alpha = list;
        this.purple = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i5 = 0; i5 < size; i5++) {
                e eVar = (e) list.get(i5);
                Object obj = eVar.alpha;
                if (obj instanceof af) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(eVar);
                } else if (obj instanceof t) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(eVar);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.red = arrayList;
        this.silver = arrayList2;
        List p4 = arrayList2 != null ? CollectionsKt.p(arrayList2, new f(i4)) : null;
        if (p4 == null || p4.isEmpty()) {
            return;
        }
        int i10 = ((e) CollectionsKt.gold(p4)).charlie;
        bv.z zVar = bv.m.alpha;
        bv.z zVar2 = new bv.z(1);
        zVar2.charlie(i10);
        int size2 = p4.size();
        for (int i11 = 1; i11 < size2; i11++) {
            e eVar2 = (e) p4.get(i11);
            while (true) {
                if (zVar2.bravo == 0) {
                    break;
                }
                int bravo = zVar2.bravo();
                if (eVar2.bravo >= bravo) {
                    zVar2.echo(zVar2.bravo - 1);
                } else {
                    int i12 = eVar2.charlie;
                    if (i12 > bravo) {
                        J0.a.alpha("Paragraph overlap not allowed, end " + i12 + " should be less than or equal to " + bravo);
                    }
                }
            }
            zVar2.charlie(eVar2.charlie);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    public final List alpha(int i4) {
        ?? emptyList;
        List list = this.alpha;
        if (list != null) {
            emptyList = new ArrayList(list.size());
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                Object obj = list.get(i5);
                e eVar = (e) obj;
                if ((eVar.alpha instanceof m) && h.bravo(0, i4, eVar.bravo, eVar.charlie)) {
                    emptyList.add(obj);
                }
            }
        } else {
            emptyList = CollectionsKt.emptyList();
        }
        Intrinsics.charlie(emptyList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation>>");
        return emptyList;
    }

    public final List bravo(int i4, int i5, String str) {
        List list = this.alpha;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                e eVar = (e) list.get(i10);
                if (eVar.alpha instanceof ah) {
                    String str2 = eVar.delta;
                    if (Intrinsics.areEqual(str, str2)) {
                        int i11 = eVar.bravo;
                        int i12 = eVar.charlie;
                        if (h.bravo(i4, i5, i11, i12)) {
                            Object obj = eVar.alpha;
                            Intrinsics.charlie(obj, "null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                            arrayList.add(new e(str2, i11, i12, ((ah) obj).alpha));
                        }
                    }
                }
            }
            return arrayList;
        }
        return CollectionsKt.emptyList();
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i4) {
        return this.purple.charAt(i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x009c, code lost:
    
        if (r4.isEmpty() != false) goto L29;
     */
    @Override // java.lang.CharSequence
    /* renamed from: charlie, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final g subSequence(int i4, int i5) {
        boolean z2;
        ArrayList arrayList;
        if (i4 <= i5) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            J0.a.alpha("start (" + i4 + ") should be less or equal to end (" + i5 + ')');
        }
        String str = this.purple;
        if (i4 == 0 && i5 == str.length()) {
            return this;
        }
        String substring = str.substring(i4, i5);
        Intrinsics.delta(substring, "substring(...)");
        g gVar = h.alpha;
        if (i4 > i5) {
            J0.a.alpha("start (" + i4 + ") should be less than or equal to end (" + i5 + ')');
        }
        List list = this.alpha;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                e eVar = (e) list.get(i10);
                int i11 = eVar.bravo;
                int i12 = eVar.charlie;
                if (h.bravo(i4, i5, i11, i12)) {
                    arrayList.add(new e(eVar.delta, Math.max(i4, eVar.bravo) - i4, Math.min(i5, i12) - i4, eVar.alpha));
                }
            }
        }
        arrayList = null;
        return new g(arrayList, substring);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (Intrinsics.areEqual(this.purple, gVar.purple) && Intrinsics.areEqual(this.alpha, gVar.alpha)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int hashCode = this.purple.hashCode() * 31;
        List list = this.alpha;
        if (list != null) {
            i4 = list.hashCode();
        } else {
            i4 = 0;
        }
        return hashCode + i4;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.purple.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.purple;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(String str, ArrayList arrayList, List list, int i4) {
        this(r6, str);
        List list2;
        List emptyList = (i4 & 2) != 0 ? CollectionsKt.emptyList() : arrayList;
        list = (i4 & 4) != 0 ? CollectionsKt.emptyList() : list;
        g gVar = h.alpha;
        if (emptyList.isEmpty() && list.isEmpty()) {
            list2 = null;
        } else {
            list2 = emptyList;
            if (!list.isEmpty()) {
                if (emptyList.isEmpty()) {
                    list2 = list;
                } else {
                    ArrayList arrayList2 = new ArrayList(list.size() + emptyList.size());
                    int size = emptyList.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        arrayList2.add((e) emptyList.get(i5));
                    }
                    int size2 = list.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        arrayList2.add((e) list.get(i10));
                    }
                    list2 = arrayList2;
                }
            }
        }
    }

    public /* synthetic */ g(String str) {
        this(str, CollectionsKt.emptyList());
    }

    public g(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
