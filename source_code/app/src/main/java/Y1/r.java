package Y1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import pf.AbstractC2360j;
import s6.S6;
import s6.W6;
import s6.X6;
import s6.Z6;

/* loaded from: classes3.dex */
public abstract class r {
    public final Context alpha;
    public final androidx.navigation.internal.g bravo;
    public final H0.a charlie;
    public final Activity delta;
    public boolean echo;
    public final q foxtrot;
    public final boolean golf;
    public final Lazy hotel;

    public r(Context context) {
        Object obj;
        Intrinsics.echo(context, "context");
        this.alpha = context;
        this.bravo = new androidx.navigation.internal.g(this, new n(this, 0));
        this.charlie = new H0.a(context, 6);
        Iterator it = AbstractC2360j.lima(context, new X9.i(2)).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        this.delta = (Activity) obj;
        this.foxtrot = new q(this);
        this.golf = true;
        au auVar = this.bravo.sierra;
        auVar.alpha(new af(auVar));
        this.bravo.sierra.alpha(new c(this.alpha));
        this.hotel = LazyKt.lazy(new n(this, 1));
    }

    public static void delta(r rVar, Object route) {
        rVar.getClass();
        Intrinsics.echo(route, "route");
        rVar.bravo.lima(route, null);
    }

    public final void alpha(p pVar) {
        androidx.navigation.internal.g gVar = this.bravo;
        gVar.getClass();
        gVar.papa.add(pVar);
        kotlin.collections.l lVar = gVar.foxtrot;
        if (!lVar.isEmpty()) {
            l lVar2 = (l) lVar.last();
            pVar.alpha(gVar.alpha, lVar2.purple, lVar2.f2268a.alpha());
        }
    }

    public final int bravo() {
        boolean z2;
        kotlin.collections.l lVar = this.bravo.foxtrot;
        int i4 = 0;
        if (lVar != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && lVar.isEmpty()) {
            return 0;
        }
        Iterator it = lVar.iterator();
        while (it.hasNext()) {
            if (!(((l) it.next()).purple instanceof ac) && (i4 = i4 + 1) < 0) {
                CollectionsKt.t();
                throw null;
            }
        }
        return i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void charlie(int i4, Bundle bundle, aj ajVar) {
        aa aaVar;
        int i5;
        Bundle bundle2;
        int i10;
        androidx.navigation.internal.g gVar = this.bravo;
        if (gVar.foxtrot.isEmpty()) {
            aaVar = gVar.charlie;
        } else {
            aaVar = ((l) gVar.foxtrot.last()).purple;
        }
        if (aaVar != null) {
            i hotel = aaVar.hotel(i4);
            if (hotel != null) {
                if (ajVar == null) {
                    ajVar = hotel.bravo;
                }
                Bundle bundle3 = hotel.charlie;
                i5 = hotel.alpha;
                if (bundle3 != null) {
                    bundle2 = S6.charlie((Pair[]) Arrays.copyOf(new Pair[0], 0));
                    bundle2.putAll(bundle3);
                    if (bundle != null) {
                        if (bundle2 == null) {
                            bundle2 = S6.charlie((Pair[]) Arrays.copyOf(new Pair[0], 0));
                        }
                        bundle2.putAll(bundle);
                    }
                    if (i5 != 0 && ajVar != null && (i10 = ajVar.charlie) != -1) {
                        if (i10 != -1 && gVar.mike(i10, ajVar.delta, false)) {
                            gVar.bravo();
                            return;
                        }
                        return;
                    }
                    if (i5 == 0) {
                        aa charlie = gVar.charlie(i5, null);
                        if (charlie == null) {
                            int i11 = aa.white;
                            H0.a aVar = this.charlie;
                            String alpha = y.alpha(aVar, i5);
                            if (hotel == null) {
                                throw new IllegalArgumentException("Navigation action/destination " + alpha + " cannot be found from the current destination " + aaVar);
                            }
                            StringBuilder victor = Q0.c.victor("Navigation destination ", alpha, " referenced from action ");
                            victor.append(y.alpha(aVar, i4));
                            victor.append(" cannot be found from the current destination ");
                            victor.append(aaVar);
                            throw new IllegalArgumentException(victor.toString().toString());
                        }
                        gVar.kilo(charlie, bundle2, ajVar);
                        return;
                    }
                    throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
                }
            } else {
                i5 = i4;
            }
            bundle2 = null;
            if (bundle != null) {
            }
            if (i5 != 0) {
            }
            if (i5 == 0) {
            }
        } else {
            throw new IllegalStateException("No current destination found. Ensure a navigation graph has been set for NavController " + this + '.');
        }
    }

    public final boolean echo() {
        androidx.navigation.internal.g gVar = this.bravo;
        if (gVar.foxtrot.isEmpty()) {
            return false;
        }
        aa foxtrot = gVar.foxtrot();
        Intrinsics.checkNotNull(foxtrot);
        if (!gVar.mike(foxtrot.purple.charlie, true, false) || !gVar.bravo()) {
            return false;
        }
        return true;
    }

    public final void foxtrot(Bundle bundle) {
        Bundle bundle2;
        Bundle[] bundleArr;
        String str;
        if (bundle != null) {
            bundle.setClassLoader(this.alpha.getClassLoader());
        }
        androidx.navigation.internal.g gVar = this.bravo;
        gVar.getClass();
        Boolean bool = null;
        boolean z2 = false;
        if (bundle != null) {
            if (bundle.containsKey("android-support-nav:controller:navigatorState")) {
                bundle2 = W6.foxtrot(bundle, "android-support-nav:controller:navigatorState");
            } else {
                bundle2 = null;
            }
            gVar.delta = bundle2;
            if (bundle.containsKey("android-support-nav:controller:backStack")) {
                bundleArr = (Bundle[]) W6.golf(bundle, "android-support-nav:controller:backStack").toArray(new Bundle[0]);
            } else {
                bundleArr = null;
            }
            gVar.echo = bundleArr;
            LinkedHashMap linkedHashMap = gVar.mike;
            linkedHashMap.clear();
            if (bundle.containsKey("android-support-nav:controller:backStackDestIds") && bundle.containsKey("android-support-nav:controller:backStackIds")) {
                int[] intArray = bundle.getIntArray("android-support-nav:controller:backStackDestIds");
                if (intArray != null) {
                    ArrayList<String> stringArrayList = bundle.getStringArrayList("android-support-nav:controller:backStackIds");
                    if (stringArrayList != null) {
                        int length = intArray.length;
                        int i4 = 0;
                        int i5 = 0;
                        while (i4 < length) {
                            int i10 = i5 + 1;
                            Integer valueOf = Integer.valueOf(intArray[i4]);
                            LinkedHashMap linkedHashMap2 = gVar.lima;
                            if (!Intrinsics.areEqual(stringArrayList.get(i5), "")) {
                                str = stringArrayList.get(i5);
                            } else {
                                str = null;
                            }
                            linkedHashMap2.put(valueOf, str);
                            i4++;
                            i5 = i10;
                        }
                    } else {
                        X6.charlie("android-support-nav:controller:backStackIds");
                        throw null;
                    }
                } else {
                    X6.charlie("android-support-nav:controller:backStackDestIds");
                    throw null;
                }
            }
            if (bundle.containsKey("android-support-nav:controller:backStackStates")) {
                ArrayList<String> stringArrayList2 = bundle.getStringArrayList("android-support-nav:controller:backStackStates");
                if (stringArrayList2 != null) {
                    for (String str2 : stringArrayList2) {
                        String key = "android-support-nav:controller:backStackStates:" + str2;
                        Intrinsics.echo(key, "key");
                        if (bundle.containsKey(key)) {
                            ArrayList golf = W6.golf(bundle, "android-support-nav:controller:backStackStates:" + str2);
                            kotlin.collections.l lVar = new kotlin.collections.l(golf.size());
                            Iterator it = golf.iterator();
                            while (it.hasNext()) {
                                lVar.addLast(new m((Bundle) it.next()));
                            }
                            linkedHashMap.put(str2, lVar);
                        }
                    }
                } else {
                    X6.charlie("android-support-nav:controller:backStackStates");
                    throw null;
                }
            }
        }
        if (bundle != null) {
            boolean z10 = bundle.getBoolean("android-support-nav:controller:deepLinkHandled", false);
            if (z10 || !bundle.getBoolean("android-support-nav:controller:deepLinkHandled", true)) {
                bool = Boolean.valueOf(z10);
            }
            if (bool != null) {
                z2 = bool.booleanValue();
            }
            this.echo = z2;
        }
    }

    public final Bundle golf() {
        Bundle bundle;
        androidx.navigation.internal.g gVar = this.bravo;
        gVar.getClass();
        ArrayList arrayList = new ArrayList();
        Bundle charlie = S6.charlie((Pair[]) Arrays.copyOf(new Pair[0], 0));
        for (Map.Entry entry : kotlin.collections.y.zulu(gVar.sierra.alpha).entrySet()) {
            String str = (String) entry.getKey();
            Bundle hotel = ((at) entry.getValue()).hotel();
            if (hotel != null) {
                arrayList.add(str);
                Z6.delta(charlie, str, hotel);
            }
        }
        if (!arrayList.isEmpty()) {
            bundle = S6.charlie((Pair[]) Arrays.copyOf(new Pair[0], 0));
            Z6.golf(charlie, "android-support-nav:controller:navigatorState:names", arrayList);
            Z6.delta(bundle, "android-support-nav:controller:navigatorState", charlie);
        } else {
            bundle = null;
        }
        kotlin.collections.l lVar = gVar.foxtrot;
        if (!lVar.isEmpty()) {
            if (bundle == null) {
                bundle = S6.charlie((Pair[]) Arrays.copyOf(new Pair[0], 0));
            }
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            Iterator<E> it = lVar.iterator();
            while (it.hasNext()) {
                l entry2 = (l) it.next();
                Intrinsics.echo(entry2, "entry");
                int i4 = entry2.purple.purple.charlie;
                androidx.navigation.internal.d dVar = entry2.f2268a;
                Bundle alpha = dVar.alpha();
                Bundle charlie2 = S6.charlie((Pair[]) Arrays.copyOf(new Pair[0], 0));
                dVar.hotel.charlie(charlie2);
                Bundle charlie3 = S6.charlie((Pair[]) Arrays.copyOf(new Pair[0], 0));
                Z6.echo("nav-entry-state:id", entry2.white, charlie3);
                charlie3.putInt("nav-entry-state:destination-id", i4);
                if (alpha == null) {
                    alpha = S6.charlie((Pair[]) Arrays.copyOf(new Pair[0], 0));
                }
                Z6.delta(charlie3, "nav-entry-state:args", alpha);
                Z6.delta(charlie3, "nav-entry-state:saved-state", charlie2);
                arrayList2.add(charlie3);
            }
            bundle.putParcelableArrayList("android-support-nav:controller:backStack", arrayList2);
        }
        LinkedHashMap linkedHashMap = gVar.lima;
        if (!linkedHashMap.isEmpty()) {
            if (bundle == null) {
                bundle = S6.charlie((Pair[]) Arrays.copyOf(new Pair[0], 0));
            }
            int[] iArr = new int[linkedHashMap.size()];
            ArrayList arrayList3 = new ArrayList();
            int i5 = 0;
            for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                int intValue = ((Number) entry3.getKey()).intValue();
                String str2 = (String) entry3.getValue();
                int i10 = i5 + 1;
                iArr[i5] = intValue;
                if (str2 == null) {
                    str2 = "";
                }
                arrayList3.add(str2);
                i5 = i10;
            }
            bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            Z6.golf(bundle, "android-support-nav:controller:backStackIds", arrayList3);
        }
        LinkedHashMap linkedHashMap2 = gVar.mike;
        if (!linkedHashMap2.isEmpty()) {
            if (bundle == null) {
                bundle = S6.charlie((Pair[]) Arrays.copyOf(new Pair[0], 0));
            }
            ArrayList arrayList4 = new ArrayList();
            for (Map.Entry entry4 : linkedHashMap2.entrySet()) {
                String str3 = (String) entry4.getKey();
                kotlin.collections.l lVar2 = (kotlin.collections.l) entry4.getValue();
                arrayList4.add(str3);
                ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
                Iterator it2 = lVar2.iterator();
                while (it2.hasNext()) {
                    S5.k kVar = ((m) it2.next()).alpha;
                    kVar.getClass();
                    Bundle charlie4 = S6.charlie((Pair[]) Arrays.copyOf(new Pair[0], 0));
                    Z6.echo("nav-entry-state:id", (String) kVar.purple, charlie4);
                    charlie4.putInt("nav-entry-state:destination-id", kVar.alpha);
                    Bundle bundle2 = (Bundle) kVar.red;
                    if (bundle2 == null) {
                        bundle2 = S6.charlie((Pair[]) Arrays.copyOf(new Pair[0], 0));
                    }
                    Z6.delta(charlie4, "nav-entry-state:args", bundle2);
                    Z6.delta(charlie4, "nav-entry-state:saved-state", (Bundle) kVar.silver);
                    arrayList5.add(charlie4);
                }
                String key = "android-support-nav:controller:backStackStates:" + str3;
                Intrinsics.echo(key, "key");
                bundle.putParcelableArrayList(key, arrayList5);
            }
            Z6.golf(bundle, "android-support-nav:controller:backStackStates", arrayList4);
        }
        if (this.echo) {
            if (bundle == null) {
                bundle = S6.charlie((Pair[]) Arrays.copyOf(new Pair[0], 0));
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", this.echo);
        }
        return bundle;
    }
}
