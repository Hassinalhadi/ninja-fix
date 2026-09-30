package Y1;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import bv.ax;
import bv.ay;
import id.C1915c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import pe.AbstractC2327c;
import pf.AbstractC2360j;
import pf.C2351a;
import s6.S6;
import s6.W6;
import s6.Y6;
import t6.AbstractC2971b2;
import t6.AbstractC2996g2;

/* loaded from: classes3.dex */
public abstract class aa {
    public static final /* synthetic */ int white = 0;
    public final String alpha;
    public final He.b purple;
    public ac red;
    public CharSequence silver;
    public final ax teal;

    static {
        new LinkedHashMap();
    }

    public aa(at navigator) {
        Intrinsics.echo(navigator, "navigator");
        LinkedHashMap linkedHashMap = au.bravo;
        String navigatorName = AbstractC2996g2.bravo(navigator.getClass());
        Intrinsics.echo(navigatorName, "navigatorName");
        this.alpha = navigatorName;
        this.purple = new He.b(this);
        this.teal = new ax(0);
    }

    public final void alpha(w navDeepLink) {
        Intrinsics.echo(navDeepLink, "navDeepLink");
        He.b bVar = this.purple;
        bVar.getClass();
        ArrayList alpha = AbstractC2971b2.alpha((LinkedHashMap) bVar.foxtrot, new androidx.navigation.internal.h(navDeepLink, 0));
        if (alpha.isEmpty()) {
            ((ArrayList) bVar.echo).add(navDeepLink);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + navDeepLink.alpha + " can't be used to open destination " + ((aa) bVar.delta) + ".\nFollowing required arguments are missing: " + alpha).toString());
    }

    public final Bundle bravo(Bundle bundle) {
        Object obj;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.purple.foxtrot;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        Bundle charlie = S6.charlie((Pair[]) Arrays.copyOf(new Pair[0], 0));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String name = (String) entry.getKey();
            k kVar = (k) entry.getValue();
            kVar.getClass();
            Intrinsics.echo(name, "name");
            if (kVar.charlie && (obj = kVar.echo) != null) {
                kVar.alpha.echo(charlie, name, obj);
            }
        }
        if (bundle != null) {
            charlie.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String name2 = (String) entry2.getKey();
                k kVar2 = (k) entry2.getValue();
                if (!kVar2.delta) {
                    Intrinsics.echo(name2, "name");
                    aq aqVar = kVar2.alpha;
                    if (kVar2.bravo || !charlie.containsKey(name2) || !W6.juliet(charlie, name2)) {
                        try {
                            aqVar.alpha(charlie, name2);
                        } catch (IllegalStateException unused) {
                        }
                    }
                    StringBuilder victor = Q0.c.victor("Wrong argument type for '", name2, "' in argument savedState. ");
                    victor.append(aqVar.bravo());
                    victor.append(" expected.");
                    throw new IllegalArgumentException(victor.toString().toString());
                }
            }
        }
        return charlie;
    }

    public final int[] delta(aa aaVar) {
        ac acVar;
        int collectionSizeOrDefault;
        kotlin.collections.l lVar = new kotlin.collections.l();
        aa aaVar2 = this;
        while (true) {
            Intrinsics.checkNotNull(aaVar2);
            ac acVar2 = aaVar2.red;
            if (aaVar != null) {
                acVar = aaVar.red;
            } else {
                acVar = null;
            }
            He.b bVar = aaVar2.purple;
            if (acVar != null) {
                ac acVar3 = aaVar.red;
                Intrinsics.checkNotNull(acVar3);
                if (acVar3.yellow.charlie(bVar.charlie) == aaVar2) {
                    lVar.addFirst(aaVar2);
                    break;
                }
            }
            if (acVar2 == null || acVar2.yellow.alpha != bVar.charlie) {
                lVar.addFirst(aaVar2);
            }
            if (Intrinsics.areEqual(acVar2, aaVar) || acVar2 == null) {
                break;
            }
            aaVar2 = acVar2;
        }
        List z2 = CollectionsKt.z(lVar);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(z2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = z2.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((aa) it.next()).purple.charlie));
        }
        return CollectionsKt.y(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        boolean z2;
        boolean z10;
        if (this != obj) {
            if (obj != null && (obj instanceof aa)) {
                He.b bVar = this.purple;
                ArrayList arrayList = (ArrayList) bVar.echo;
                aa aaVar = (aa) obj;
                He.b bVar2 = aaVar.purple;
                boolean areEqual = Intrinsics.areEqual(arrayList, (ArrayList) bVar2.echo);
                ax axVar = this.teal;
                int golf = axVar.golf();
                ax axVar2 = aaVar.teal;
                if (golf == axVar2.golf()) {
                    Iterator it = ((C2351a) AbstractC2360j.charlie(new ay(axVar))).iterator();
                    while (it.hasNext()) {
                        int intValue = ((Number) it.next()).intValue();
                        if (!Intrinsics.areEqual(axVar.delta(intValue), axVar2.delta(intValue))) {
                        }
                    }
                    z2 = true;
                    if (india().size() == aaVar.india().size()) {
                        for (Map.Entry entry : (Iterable) CollectionsKt.beige(india().entrySet()).bravo) {
                            if (aaVar.india().containsKey(entry.getKey()) && Intrinsics.areEqual(aaVar.india().get(entry.getKey()), entry.getValue())) {
                            }
                        }
                        z10 = true;
                        if (bVar.charlie == bVar2.charlie || !Intrinsics.areEqual((String) bVar.golf, (String) bVar2.golf) || !areEqual || !z2 || !z10) {
                        }
                    }
                    z10 = false;
                    if (bVar.charlie == bVar2.charlie) {
                    }
                }
                z2 = false;
                if (india().size() == aaVar.india().size()) {
                }
                z10 = false;
                if (bVar.charlie == bVar2.charlie) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i4;
        boolean z2;
        int i5;
        int i10;
        int i11;
        int i12;
        int i13;
        He.b bVar = this.purple;
        int i14 = bVar.charlie * 31;
        String str = (String) bVar.golf;
        if (str != null) {
            i4 = str.hashCode();
        } else {
            i4 = 0;
        }
        int i15 = i14 + i4;
        Iterator it = ((ArrayList) bVar.echo).iterator();
        while (it.hasNext()) {
            w wVar = (w) it.next();
            int i16 = i15 * 31;
            String str2 = wVar.alpha;
            if (str2 != null) {
                i11 = str2.hashCode();
            } else {
                i11 = 0;
            }
            int i17 = (i16 + i11) * 31;
            String str3 = wVar.bravo;
            if (str3 != null) {
                i12 = str3.hashCode();
            } else {
                i12 = 0;
            }
            int i18 = (i17 + i12) * 31;
            String str4 = wVar.charlie;
            if (str4 != null) {
                i13 = str4.hashCode();
            } else {
                i13 = 0;
            }
            i15 = i18 + i13;
        }
        ax axVar = this.teal;
        Intrinsics.echo(axVar, "<this>");
        int i19 = 0;
        while (true) {
            if (i19 < axVar.golf()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                break;
            }
            int i20 = i19 + 1;
            i iVar = (i) axVar.hotel(i19);
            int i21 = ((i15 * 31) + iVar.alpha) * 31;
            aj ajVar = iVar.bravo;
            if (ajVar != null) {
                i10 = ajVar.hashCode();
            } else {
                i10 = 0;
            }
            i15 = i21 + i10;
            Bundle bundle = iVar.charlie;
            if (bundle != null) {
                i15 = Y6.charlie(bundle) + (i15 * 31);
            }
            i19 = i20;
        }
        for (String str5 : india().keySet()) {
            int sierra = AbstractC2327c.sierra(i15 * 31, 31, str5);
            Object obj = india().get(str5);
            if (obj != null) {
                i5 = obj.hashCode();
            } else {
                i5 = 0;
            }
            i15 = sierra + i5;
        }
        return i15;
    }

    public final i hotel(int i4) {
        i iVar;
        ax axVar = this.teal;
        if (axVar.golf() == 0) {
            iVar = null;
        } else {
            iVar = (i) axVar.delta(i4);
        }
        if (iVar == null) {
            ac acVar = this.red;
            if (acVar == null) {
                return null;
            }
            return acVar.hotel(i4);
        }
        return iVar;
    }

    public final Map india() {
        return kotlin.collections.y.zulu((LinkedHashMap) this.purple.foxtrot);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ca A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z kilo(C1915c c1915c) {
        boolean echo;
        boolean z2;
        Bundle bundle;
        boolean z10;
        int i4;
        z zVar;
        Regex regex;
        kotlin.text.k delta;
        List emptyList;
        List emptyList2;
        boolean areEqual;
        boolean echo2;
        He.b bVar = this.purple;
        bVar.getClass();
        ArrayList arrayList = (ArrayList) bVar.echo;
        if (arrayList.isEmpty()) {
            return null;
        }
        Iterator it = arrayList.iterator();
        z zVar2 = null;
        while (it.hasNext()) {
            w wVar = (w) it.next();
            wVar.getClass();
            Lazy lazy = wVar.foxtrot;
            Regex regex2 = (Regex) lazy.getValue();
            Uri uri = (Uri) c1915c.purple;
            if (regex2 == null) {
                echo = true;
            } else if (uri == null) {
                echo = false;
            } else {
                Regex regex3 = (Regex) lazy.getValue();
                Intrinsics.checkNotNull(regex3);
                echo = regex3.echo(uri.toString());
            }
            Lazy lazy2 = wVar.oscar;
            String str = (String) c1915c.silver;
            String str2 = (String) c1915c.red;
            String str3 = wVar.charlie;
            String str4 = wVar.bravo;
            if (echo) {
                if (str4 == null) {
                    areEqual = true;
                } else if (str2 == null) {
                    areEqual = false;
                } else {
                    areEqual = Intrinsics.areEqual(str4, str2);
                }
                if (areEqual) {
                    if (str3 == null) {
                        echo2 = true;
                    } else if (str == null) {
                        echo2 = false;
                    } else {
                        Regex regex4 = (Regex) lazy2.getValue();
                        Intrinsics.checkNotNull(regex4);
                        echo2 = regex4.echo(str);
                    }
                    if (echo2) {
                        z2 = true;
                        if (!z2) {
                            LinkedHashMap arguments = (LinkedHashMap) bVar.foxtrot;
                            if (uri != null) {
                                bundle = wVar.delta(uri, arguments);
                            } else {
                                bundle = null;
                            }
                            int bravo = wVar.bravo(uri);
                            if (str2 != null && Intrinsics.areEqual(str2, str4)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (str != null && str3 != null) {
                                Regex regex5 = (Regex) lazy2.getValue();
                                Intrinsics.checkNotNull(regex5);
                                if (regex5.echo(str)) {
                                    List hotel = new Regex("/").hotel(str3);
                                    if (!hotel.isEmpty()) {
                                        ListIterator listIterator = hotel.listIterator(hotel.size());
                                        while (listIterator.hasPrevious()) {
                                            if (((String) listIterator.previous()).length() != 0) {
                                                emptyList = CollectionsKt.r(hotel, listIterator.nextIndex() + 1);
                                                break;
                                            }
                                        }
                                    }
                                    emptyList = CollectionsKt.emptyList();
                                    String str5 = (String) emptyList.get(0);
                                    String str6 = (String) emptyList.get(1);
                                    List hotel2 = new Regex("/").hotel(str);
                                    if (!hotel2.isEmpty()) {
                                        ListIterator listIterator2 = hotel2.listIterator(hotel2.size());
                                        while (listIterator2.hasPrevious()) {
                                            if (((String) listIterator2.previous()).length() != 0) {
                                                emptyList2 = CollectionsKt.r(hotel2, listIterator2.nextIndex() + 1);
                                                break;
                                            }
                                        }
                                    }
                                    emptyList2 = CollectionsKt.emptyList();
                                    String str7 = (String) emptyList2.get(0);
                                    String str8 = (String) emptyList2.get(1);
                                    if (Intrinsics.areEqual(str5, str7)) {
                                        i4 = 2;
                                    } else {
                                        i4 = 0;
                                    }
                                    if (Intrinsics.areEqual(str6, str8)) {
                                        i4++;
                                    }
                                    if (bundle == null) {
                                        if (z10 || i4 > -1) {
                                            Intrinsics.echo(arguments, "arguments");
                                            Bundle charlie = S6.charlie((Pair[]) Arrays.copyOf(new Pair[0], 0));
                                            if (uri != null && (regex = (Regex) lazy.getValue()) != null && (delta = regex.delta(uri.toString())) != null) {
                                                wVar.echo(delta, charlie, arguments);
                                                if (((Boolean) wVar.golf.getValue()).booleanValue()) {
                                                    wVar.foxtrot(uri, charlie, arguments);
                                                }
                                            }
                                            if (!AbstractC2971b2.alpha(arguments, new u(1, charlie)).isEmpty()) {
                                            }
                                        }
                                    }
                                    zVar = new z((aa) bVar.delta, bundle, wVar.papa, bravo, z10, i4);
                                    if (zVar2 != null || zVar.compareTo(zVar2) > 0) {
                                        zVar2 = zVar;
                                    }
                                }
                            }
                            i4 = -1;
                            if (bundle == null) {
                            }
                            zVar = new z((aa) bVar.delta, bundle, wVar.papa, bravo, z10, i4);
                            if (zVar2 != null) {
                            }
                            zVar2 = zVar;
                        }
                    }
                }
            }
            z2 = false;
            if (!z2) {
            }
        }
        return zVar2;
    }

    public void lima(Context context, AttributeSet attrs) {
        Intrinsics.echo(context, "context");
        Intrinsics.echo(attrs, "attrs");
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, Z1.a.echo);
        Intrinsics.delta(obtainAttributes, "obtainAttributes(...)");
        november(obtainAttributes.getString(2));
        if (obtainAttributes.hasValue(1)) {
            int resourceId = obtainAttributes.getResourceId(1, 0);
            He.b bVar = this.purple;
            bVar.charlie = resourceId;
            bVar.bravo = null;
            bVar.bravo = y.alpha(new H0.a(context, 6), resourceId);
        }
        this.silver = obtainAttributes.getText(0);
        obtainAttributes.recycle();
    }

    public final void mike(int i4, i action) {
        Intrinsics.echo(action, "action");
        if (!(this instanceof b)) {
            if (i4 != 0) {
                this.teal.foxtrot(i4, action);
                return;
            }
            throw new IllegalArgumentException("Cannot have an action with actionId 0");
        }
        throw new UnsupportedOperationException("Cannot add action " + i4 + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
    }

    public final void november(String str) {
        He.b bVar = this.purple;
        if (str == null) {
            bVar.charlie = 0;
            bVar.bravo = null;
        } else {
            bVar.getClass();
            if (!StringsKt.gray(str)) {
                String uriPattern = "android-app://androidx.navigation/".concat(str);
                Intrinsics.echo(uriPattern, "uriPattern");
                ArrayList alpha = AbstractC2971b2.alpha((LinkedHashMap) bVar.foxtrot, new androidx.navigation.internal.h(new w(uriPattern, null, null), 1));
                if (alpha.isEmpty()) {
                    bVar.hotel = LazyKt.lazy(new androidx.navigation.internal.i(uriPattern, 0));
                    bVar.charlie = uriPattern.hashCode();
                    bVar.bravo = null;
                } else {
                    StringBuilder victor = Q0.c.victor("Cannot set route \"", str, "\" for destination ");
                    victor.append((aa) bVar.delta);
                    victor.append(". Following required arguments are missing: ");
                    victor.append(alpha);
                    throw new IllegalArgumentException(victor.toString().toString());
                }
            } else {
                throw new IllegalArgumentException("Cannot have an empty route");
            }
        }
        bVar.golf = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("(");
        He.b bVar = this.purple;
        String str = bVar.bravo;
        if (str == null) {
            sb2.append("0x");
            sb2.append(Integer.toHexString(bVar.charlie));
        } else {
            sb2.append(str);
        }
        sb2.append(")");
        String str2 = (String) bVar.golf;
        if (str2 != null && !StringsKt.gray(str2)) {
            sb2.append(" route=");
            sb2.append((String) bVar.golf);
        }
        if (this.silver != null) {
            sb2.append(" label=");
            sb2.append(this.silver);
        }
        String sb3 = sb2.toString();
        Intrinsics.delta(sb3, "toString(...)");
        return sb3;
    }
}
