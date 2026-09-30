package S1;

import B9.ab;
import R.h;
import Y1.ag;
import ae.o;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.fragment.NavHostFragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import o2.InterfaceC2193c;
import s6.S6;
import yf.N;
import yf.at;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements InterfaceC2193c {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object bravo;

    public /* synthetic */ a(int i4, Object obj) {
        this.alpha = i4;
        this.bravo = obj;
    }

    @Override // o2.InterfaceC2193c
    public final Bundle alpha() {
        Pair[] pairArr;
        ArrayList<? extends Parcelable> arrayList;
        Object obj = this.bravo;
        switch (this.alpha) {
            case 0:
                ab abVar = (ab) obj;
                for (Map.Entry entry : y.zulu((LinkedHashMap) abVar.silver).entrySet()) {
                    abVar.lavender(((N) ((at) entry.getValue())).getValue(), (String) entry.getKey());
                }
                for (Map.Entry entry2 : y.zulu((LinkedHashMap) abVar.white).entrySet()) {
                    abVar.lavender(((InterfaceC2193c) entry2.getValue()).alpha(), (String) entry2.getKey());
                }
                LinkedHashMap linkedHashMap = (LinkedHashMap) abVar.purple;
                if (linkedHashMap.isEmpty()) {
                    pairArr = new Pair[0];
                } else {
                    ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                        arrayList2.add(new Pair((String) entry3.getKey(), entry3.getValue()));
                    }
                    pairArr = (Pair[]) arrayList2.toArray(new Pair[0]);
                }
                return S6.charlie((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
            case 1:
                return o.charlie((o) obj);
            case 2:
                Bundle golf = ((ag) obj).golf();
                if (golf == null) {
                    Bundle EMPTY = Bundle.EMPTY;
                    Intrinsics.delta(EMPTY, "EMPTY");
                    return EMPTY;
                }
                return golf;
            case 3:
                int i4 = ((NavHostFragment) obj).red;
                if (i4 != 0) {
                    return S6.charlie(new Pair("android-support-nav:fragment:graphId", Integer.valueOf(i4)));
                }
                Bundle bundle = Bundle.EMPTY;
                Intrinsics.checkNotNull(bundle);
                return bundle;
            default:
                Map charlie = ((h) obj).charlie();
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry4 : charlie.entrySet()) {
                    String str = (String) entry4.getKey();
                    List list = (List) entry4.getValue();
                    if (list instanceof ArrayList) {
                        arrayList = (ArrayList) list;
                    } else {
                        arrayList = new ArrayList<>(list);
                    }
                    bundle2.putParcelableArrayList(str, arrayList);
                }
                return bundle2;
        }
    }
}
