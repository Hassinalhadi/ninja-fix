package Me;

import Le.j;
import Lf.i;
import androidx.appcompat.widget.P0;
import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.u;
import kotlin.collections.v;
import kotlin.collections.w;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.r;

/* loaded from: classes2.dex */
public final class g implements Ke.e {
    public static final List silver;
    public final String[] alpha;
    public final Set purple;
    public final ArrayList red;

    static {
        int collectionSizeOrDefault;
        String maroon = CollectionsKt.maroon(CollectionsKt.listOf('k', 'o', Character.valueOf(Constants.INAPP_POSITION_TOP), Character.valueOf(Constants.INAPP_POSITION_LEFT), 'i', 'n'), "", null, null, null, 62);
        List listOf = CollectionsKt.listOf(P0.crimson(maroon, "/Any"), P0.crimson(maroon, "/Nothing"), P0.crimson(maroon, "/Unit"), P0.crimson(maroon, "/Throwable"), P0.crimson(maroon, "/Number"), P0.crimson(maroon, "/Byte"), P0.crimson(maroon, "/Double"), P0.crimson(maroon, "/Float"), P0.crimson(maroon, "/Int"), P0.crimson(maroon, "/Long"), P0.crimson(maroon, "/Short"), P0.crimson(maroon, "/Boolean"), P0.crimson(maroon, "/Char"), P0.crimson(maroon, "/CharSequence"), P0.crimson(maroon, "/String"), P0.crimson(maroon, "/Comparable"), P0.crimson(maroon, "/Enum"), P0.crimson(maroon, "/Array"), P0.crimson(maroon, "/ByteArray"), P0.crimson(maroon, "/DoubleArray"), P0.crimson(maroon, "/FloatArray"), P0.crimson(maroon, "/IntArray"), P0.crimson(maroon, "/LongArray"), P0.crimson(maroon, "/ShortArray"), P0.crimson(maroon, "/BooleanArray"), P0.crimson(maroon, "/CharArray"), P0.crimson(maroon, "/Cloneable"), P0.crimson(maroon, "/Annotation"), P0.crimson(maroon, "/collections/Iterable"), P0.crimson(maroon, "/collections/MutableIterable"), P0.crimson(maroon, "/collections/Collection"), P0.crimson(maroon, "/collections/MutableCollection"), P0.crimson(maroon, "/collections/List"), P0.crimson(maroon, "/collections/MutableList"), P0.crimson(maroon, "/collections/Set"), P0.crimson(maroon, "/collections/MutableSet"), P0.crimson(maroon, "/collections/Map"), P0.crimson(maroon, "/collections/MutableMap"), P0.crimson(maroon, "/collections/Map.Entry"), P0.crimson(maroon, "/collections/MutableMap.MutableEntry"), P0.crimson(maroon, "/collections/Iterator"), P0.crimson(maroon, "/collections/MutableIterator"), P0.crimson(maroon, "/collections/ListIterator"), P0.crimson(maroon, "/collections/MutableListIterator"));
        silver = listOf;
        i G9 = CollectionsKt.G(listOf);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(G9, 10);
        int quebec = y.quebec(collectionSizeOrDefault);
        if (quebec < 16) {
            quebec = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(quebec);
        Iterator it = G9.iterator();
        while (true) {
            w wVar = (w) it;
            if (((Iterator) wVar.red).hasNext()) {
                v vVar = (v) wVar.next();
                linkedHashMap.put((String) vVar.bravo, Integer.valueOf(vVar.alpha));
            } else {
                return;
            }
        }
    }

    public g(j jVar, String[] strings) {
        Set D10;
        Intrinsics.echo(strings, "strings");
        List list = jVar.red;
        if (list.isEmpty()) {
            D10 = u.alpha;
        } else {
            D10 = CollectionsKt.D(list);
        }
        List<Le.i> list2 = jVar.purple;
        Intrinsics.delta(list2, "types.recordList");
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(list2.size());
        for (Le.i iVar : list2) {
            int i4 = iVar.red;
            for (int i5 = 0; i5 < i4; i5++) {
                arrayList.add(iVar);
            }
        }
        arrayList.trimToSize();
        this.alpha = strings;
        this.purple = D10;
        this.red = arrayList;
    }

    @Override // Ke.e
    public final String getString(int i4) {
        String string;
        Le.i iVar = (Le.i) this.red.get(i4);
        int i5 = iVar.purple;
        if ((i5 & 4) == 4) {
            Object obj = iVar.teal;
            if (obj instanceof String) {
                string = (String) obj;
            } else {
                Oe.e eVar = (Oe.e) obj;
                String sierra = eVar.sierra();
                if (eVar.lima()) {
                    iVar.teal = sierra;
                }
                string = sierra;
            }
        } else {
            if ((i5 & 2) == 2) {
                List list = silver;
                int size = list.size();
                int i10 = iVar.silver;
                if (i10 >= 0 && i10 < size) {
                    string = (String) list.get(i10);
                }
            }
            string = this.alpha[i4];
        }
        if (iVar.yellow.size() >= 2) {
            List substringIndexList = iVar.yellow;
            Intrinsics.delta(substringIndexList, "substringIndexList");
            Integer begin = (Integer) substringIndexList.get(0);
            Integer end = (Integer) substringIndexList.get(1);
            Intrinsics.delta(begin, "begin");
            if (begin.intValue() >= 0) {
                int intValue = begin.intValue();
                Intrinsics.delta(end, "end");
                if (intValue <= end.intValue() && end.intValue() <= string.length()) {
                    string = string.substring(begin.intValue(), end.intValue());
                    Intrinsics.delta(string, "this as java.lang.String…ing(startIndex, endIndex)");
                }
            }
        }
        if (iVar.f1847b.size() >= 2) {
            List replaceCharList = iVar.f1847b;
            Intrinsics.delta(replaceCharList, "replaceCharList");
            Integer num = (Integer) replaceCharList.get(0);
            Integer num2 = (Integer) replaceCharList.get(1);
            Intrinsics.delta(string, "string");
            string = r.november(string, (char) num.intValue(), (char) num2.intValue());
        }
        Le.h hVar = iVar.white;
        if (hVar == null) {
            hVar = Le.h.NONE;
        }
        int ordinal = hVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                if (string.length() >= 2) {
                    string = string.substring(1, string.length() - 1);
                    Intrinsics.delta(string, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                string = r.november(string, '$', '.');
            }
        } else {
            Intrinsics.delta(string, "string");
            string = r.november(string, '$', '.');
        }
        Intrinsics.delta(string, "string");
        return string;
    }

    @Override // Ke.e
    public final String hotel(int i4) {
        return getString(i4);
    }

    @Override // Ke.e
    public final boolean mike(int i4) {
        return this.purple.contains(Integer.valueOf(i4));
    }
}
