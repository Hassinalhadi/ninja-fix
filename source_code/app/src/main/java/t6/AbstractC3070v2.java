package t6;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ud.C3153a;

/* renamed from: t6.v2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3070v2 {
    public static com.google.android.gms.measurement.internal.r alpha(List from, Function1 function1, Xd.l lVar) {
        Object obj;
        Intrinsics.echo(from, "from");
        Iterator it = from.iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            Object next = it.next();
            if (it.hasNext()) {
                Comparable comparable = (Comparable) function1.invoke(next);
                do {
                    Object next2 = it.next();
                    Comparable comparable2 = (Comparable) function1.invoke(next2);
                    if (comparable.compareTo(comparable2) < 0) {
                        next = next2;
                        comparable = comparable2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        }
        if (obj != null) {
            ((Number) function1.invoke(obj)).intValue();
            if (!from.isEmpty()) {
                Iterator it2 = from.iterator();
                while (it2.hasNext()) {
                    if (((Number) function1.invoke(it2.next())).intValue() == 0) {
                        throw new IllegalArgumentException("There should be no empty entries");
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            bravo(arrayList, from, 0, function1, lVar);
            arrayList.trimToSize();
            new C3153a((char) 0, CollectionsKt.emptyList(), arrayList);
            return new com.google.android.gms.measurement.internal.r(16);
        }
        throw new NoSuchElementException("Unable to build char tree from an empty list");
    }

    public static void bravo(ArrayList arrayList, List list, int i4, Function1 function1, Xd.l lVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            Character ch = (Character) lVar.invoke(obj, Integer.valueOf(i4));
            ch.getClass();
            Object obj2 = linkedHashMap.get(ch);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(ch, obj2);
            }
            ((List) obj2).add(obj);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            char charValue = ((Character) entry.getKey()).charValue();
            List list2 = (List) entry.getValue();
            int i5 = i4 + 1;
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : list2) {
                if (((Number) function1.invoke(obj3)).intValue() > i5) {
                    arrayList3.add(obj3);
                }
            }
            bravo(arrayList2, arrayList3, i5, function1, lVar);
            arrayList2.trimToSize();
            ArrayList arrayList4 = new ArrayList();
            for (Object obj4 : list2) {
                if (((Number) function1.invoke(obj4)).intValue() == i5) {
                    arrayList4.add(obj4);
                }
            }
            arrayList.add(new C3153a(charValue, arrayList4, arrayList2));
        }
    }

    public static void charlie(Context context, String eventName, Map parameters) {
        Intrinsics.echo(context, "context");
        Intrinsics.echo(eventName, "eventName");
        Intrinsics.echo(parameters, "parameters");
        try {
            Result.Companion companion = Result.INSTANCE;
            FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(context);
            Intrinsics.delta(firebaseAnalytics, "getInstance(...)");
            Bundle bundle = new Bundle();
            for (Map.Entry entry : parameters.entrySet()) {
                bundle.putString((String) entry.getKey(), (String) entry.getValue());
            }
            com.google.android.gms.internal.measurement.J j5 = firebaseAnalytics.alpha;
            j5.getClass();
            j5.bravo(new com.google.android.gms.internal.measurement.aw(j5, null, eventName, bundle, false, 2));
            Result.m206constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m206constructorimpl(ResultKt.createFailure(th));
        }
    }
}
