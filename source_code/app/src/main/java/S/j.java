package S;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.InterfaceC0523v;
import androidx.camera.core.impl.Z;
import androidx.camera.core.impl.ap;
import bc.C0747a;
import com.google.mlkit.vision.barcode.common.Barcode;
import e6.AbstractC1630b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import t6.AbstractC3066u3;

/* loaded from: classes3.dex */
public final class j {
    public int alpha;
    public int bravo;
    public Object charlie;
    public Serializable delta;
    public Object echo;

    public j(InterfaceC0523v interfaceC0523v, Size size) {
        Rational rational;
        this.charlie = interfaceC0523v;
        this.alpha = interfaceC0523v.alpha();
        this.bravo = interfaceC0523v.echo();
        if (size != null) {
            rational = new Rational(size.getWidth(), size.getHeight());
        } else {
            List india = interfaceC0523v.india(Barcode.FORMAT_QR_CODE);
            if (india.isEmpty()) {
                rational = null;
            } else {
                Size size2 = (Size) Collections.max(india, new bc.c(false));
                rational = new Rational(size2.getWidth(), size2.getHeight());
            }
        }
        this.delta = rational;
        this.echo = new bf.i(interfaceC0523v, rational);
    }

    public static String delta(B7.g gVar) {
        gVar.alpha();
        B7.i iVar = gVar.charlie;
        String str = iVar.echo;
        if (str != null) {
            return str;
        }
        gVar.alpha();
        String str2 = iVar.bravo;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public static ArrayList foxtrot(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(bc.b.alpha);
        arrayList2.add(bc.b.charlie);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Rational rational = new Rational(size.getWidth(), size.getHeight());
            if (!arrayList2.contains(rational)) {
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (bc.b.alpha((Rational) it2.next(), size)) {
                            break;
                        }
                    } else {
                        arrayList2.add(rational);
                        break;
                    }
                }
            }
        }
        return arrayList2;
    }

    public static Rational hotel(int i4, boolean z2) {
        if (i4 == -1) {
            return null;
        }
        if (i4 != 0) {
            if (i4 != 1) {
                AbstractC3066u3.charlie("SupportedOutputSizesCollector", "Undefined target aspect ratio: " + i4);
                return null;
            }
            if (z2) {
                return bc.b.charlie;
            }
            return bc.b.delta;
        }
        if (z2) {
            return bc.b.alpha;
        }
        return bc.b.bravo;
    }

    public static HashMap india(ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        Iterator it = foxtrot(arrayList).iterator();
        while (it.hasNext()) {
            hashMap.put((Rational) it.next(), new ArrayList());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Size size = (Size) it2.next();
            for (Rational rational : hashMap.keySet()) {
                if (bc.b.alpha(rational, size)) {
                    ((List) hashMap.get(rational)).add(size);
                }
            }
        }
        return hashMap;
    }

    public static void lima(List list, Size size, boolean z2) {
        ArrayList arrayList = new ArrayList();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Size size3 = (Size) list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            }
            arrayList.add(0, size3);
        }
        list.removeAll(arrayList);
        Collections.reverse(list);
        if (z2) {
            list.addAll(arrayList);
        }
    }

    public static void mike(List list, Size size, boolean z2) {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < list.size(); i4++) {
            Size size2 = (Size) list.get(i4);
            if (size2.getWidth() <= size.getWidth() && size2.getHeight() <= size.getHeight()) {
                break;
            }
            arrayList.add(0, size2);
        }
        list.removeAll(arrayList);
        if (z2) {
            list.addAll(arrayList);
        }
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [int[], java.io.Serializable] */
    public int alpha(long j5) {
        int i4 = this.alpha + 1;
        long[] jArr = (long[]) this.charlie;
        int length = jArr.length;
        if (i4 > length) {
            int i5 = length * 2;
            long[] jArr2 = new long[i5];
            ?? r22 = new int[i5];
            ArraysKt.azure(jArr, jArr2, 0, 0, jArr.length);
            ArraysKt.black(0, 0, (int[]) this.delta, r22, 14);
            this.charlie = jArr2;
            this.delta = r22;
        }
        int i10 = this.alpha;
        this.alpha = i10 + 1;
        int length2 = ((int[]) this.echo).length;
        if (this.bravo >= length2) {
            int i11 = length2 * 2;
            int[] iArr = new int[i11];
            int i12 = 0;
            while (i12 < i11) {
                int i13 = i12 + 1;
                iArr[i12] = i13;
                i12 = i13;
            }
            ArraysKt.black(0, 0, (int[]) this.echo, iArr, 14);
            this.echo = iArr;
        }
        int i14 = this.bravo;
        int[] iArr2 = (int[]) this.echo;
        this.bravo = iArr2[i14];
        long[] jArr3 = (long[]) this.charlie;
        jArr3[i10] = j5;
        ((int[]) this.delta)[i10] = i14;
        iArr2[i14] = i10;
        while (i10 > 0) {
            int i15 = ((i10 + 1) >> 1) - 1;
            if (Intrinsics.hotel(jArr3[i15], j5) <= 0) {
                break;
            }
            november(i15, i10);
            i10 = i15;
        }
        return i14;
    }

    public synchronized String bravo() {
        try {
            if (((String) this.delta) == null) {
                kilo();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (String) this.delta;
    }

    public synchronized String charlie() {
        try {
            if (((String) this.echo) == null) {
                kilo();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (String) this.echo;
    }

    public PackageInfo echo(String str) {
        try {
            return ((Context) this.charlie).getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Failed to find package " + e);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b5, code lost:
    
        if (bi.b.alpha(r2) < (r5.getHeight() * r5.getWidth())) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List golf(Z z2) {
        Size[] sizeArr;
        List asList;
        boolean z10;
        ap apVar = (ap) z2;
        ArrayList yankee = apVar.yankee();
        if (yankee != null) {
            return yankee;
        }
        bm.b zulu = apVar.zulu();
        List<Pair> lima = apVar.lima();
        int oscar = z2.oscar();
        Rational rational = null;
        if (lima != null) {
            for (Pair pair : lima) {
                if (((Integer) pair.first).intValue() == oscar) {
                    sizeArr = (Size[]) pair.second;
                    break;
                }
            }
        }
        sizeArr = null;
        if (sizeArr == null) {
            asList = null;
        } else {
            asList = Arrays.asList(sizeArr);
        }
        if (asList == null) {
            asList = ((InterfaceC0523v) this.charlie).india(oscar);
        }
        ArrayList arrayList = new ArrayList(asList);
        Collections.sort(arrayList, new bc.c(true));
        if (arrayList.isEmpty()) {
            AbstractC3066u3.india("SupportedOutputSizesCollector", "The retrieved supported resolutions from camera info internal is empty. Format is " + oscar + ".");
        }
        if (zulu == null) {
            bf.i iVar = (bf.i) this.echo;
            iVar.getClass();
            if (arrayList.isEmpty()) {
                return arrayList;
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            Collections.sort(arrayList2, new bc.c(true));
            ArrayList arrayList3 = new ArrayList();
            ap apVar2 = (ap) z2;
            Size olive = apVar2.olive();
            Size size = (Size) arrayList2.get(0);
            if (olive != null) {
            }
            olive = size;
            Size alpha = iVar.alpha(apVar2);
            Size size2 = bi.b.bravo;
            int alpha2 = bi.b.alpha(size2);
            if (bi.b.alpha(olive) < alpha2) {
                size2 = bi.b.alpha;
            } else if (alpha != null) {
                if (alpha.getHeight() * alpha.getWidth() < alpha2) {
                    size2 = alpha;
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Size size3 = (Size) it.next();
                if (bi.b.alpha(size3) <= olive.getHeight() * olive.getWidth()) {
                    if (size3.getHeight() * size3.getWidth() >= bi.b.alpha(size2) && !arrayList3.contains(size3)) {
                        arrayList3.add(size3);
                    }
                }
            }
            if (!arrayList3.isEmpty()) {
                if (apVar2.indigo()) {
                    rational = hotel(apVar2.ivory(), iVar.delta);
                } else {
                    Size alpha3 = iVar.alpha(apVar2);
                    if (alpha3 != null) {
                        Iterator it2 = foxtrot(arrayList3).iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                Rational rational2 = (Rational) it2.next();
                                if (bc.b.alpha(rational2, alpha3)) {
                                    rational = rational2;
                                    break;
                                }
                            } else {
                                rational = new Rational(alpha3.getWidth(), alpha3.getHeight());
                                break;
                            }
                        }
                    }
                }
                if (alpha == null) {
                    alpha = apVar2.bronze();
                }
                ArrayList arrayList4 = new ArrayList();
                new HashMap();
                if (rational == null) {
                    arrayList4.addAll(arrayList3);
                    if (alpha != null) {
                        lima(arrayList4, alpha, true);
                        return arrayList4;
                    }
                } else {
                    HashMap india = india(arrayList3);
                    if (alpha != null) {
                        Iterator it3 = india.keySet().iterator();
                        while (it3.hasNext()) {
                            lima((List) india.get((Rational) it3.next()), alpha, true);
                        }
                    }
                    ArrayList arrayList5 = new ArrayList(india.keySet());
                    Collections.sort(arrayList5, new C0747a(rational, iVar.charlie));
                    Iterator it4 = arrayList5.iterator();
                    while (it4.hasNext()) {
                        for (Size size4 : (List) india.get((Rational) it4.next())) {
                            if (!arrayList4.contains(size4)) {
                                arrayList4.add(size4);
                            }
                        }
                    }
                }
                return arrayList4;
            }
            throw new IllegalArgumentException("All supported output sizes are filtered out according to current resolution selection settings. \nminSize = " + size2 + "\nmaxSize = " + olive + "\ninitial size list: " + arrayList2);
        }
        Size olive2 = ((ap) z2).olive();
        apVar.crimson();
        if (!z2.xray()) {
            z2.oscar();
        }
        bm.b mike = apVar.mike();
        bm.a aVar = mike.alpha;
        HashMap india2 = india(arrayList);
        Rational rational3 = (Rational) this.delta;
        if (rational3 == null || rational3.getNumerator() >= rational3.getDenominator()) {
            z10 = true;
        } else {
            z10 = false;
        }
        aVar.getClass();
        Rational hotel = hotel(0, z10);
        ArrayList arrayList6 = new ArrayList(india2.keySet());
        Collections.sort(arrayList6, new C0747a(hotel, rational3));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it5 = arrayList6.iterator();
        while (it5.hasNext()) {
            Rational rational4 = (Rational) it5.next();
            linkedHashMap.put(rational4, (List) india2.get(rational4));
        }
        if (olive2 != null) {
            Size size5 = bi.b.alpha;
            int height = olive2.getHeight() * olive2.getWidth();
            Iterator it6 = linkedHashMap.keySet().iterator();
            while (it6.hasNext()) {
                List<Size> list = (List) linkedHashMap.get((Rational) it6.next());
                ArrayList arrayList7 = new ArrayList();
                for (Size size6 : list) {
                    if (bi.b.alpha(size6) <= height) {
                        arrayList7.add(size6);
                    }
                }
                list.clear();
                list.addAll(arrayList7);
            }
        }
        bm.c cVar = mike.bravo;
        if (cVar != null) {
            Iterator it7 = linkedHashMap.keySet().iterator();
            while (it7.hasNext()) {
                List list2 = (List) linkedHashMap.get((Rational) it7.next());
                if (!list2.isEmpty() && !cVar.equals(bm.c.charlie)) {
                    int i4 = cVar.bravo;
                    Size size7 = cVar.alpha;
                    if (i4 != 0) {
                        if (i4 != 1) {
                            if (i4 != 2) {
                                if (i4 != 3) {
                                    if (i4 == 4) {
                                        mike(list2, size7, false);
                                    }
                                } else {
                                    mike(list2, size7, true);
                                }
                            } else {
                                lima(list2, size7, false);
                            }
                        } else {
                            lima(list2, size7, true);
                        }
                    } else {
                        boolean contains = list2.contains(size7);
                        list2.clear();
                        if (contains) {
                            list2.add(size7);
                        }
                    }
                }
            }
        }
        ArrayList arrayList8 = new ArrayList();
        Iterator it8 = linkedHashMap.values().iterator();
        while (it8.hasNext()) {
            for (Size size8 : (List) it8.next()) {
                if (!arrayList8.contains(size8)) {
                    arrayList8.add(size8);
                }
            }
        }
        return arrayList8;
    }

    public boolean juliet() {
        int i4;
        synchronized (this) {
            i4 = this.bravo;
            if (i4 == 0) {
                PackageManager packageManager = ((Context) this.charlie).getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i4 = 0;
                } else {
                    if (!AbstractC1630b.delta()) {
                        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                        intent.setPackage("com.google.android.gms");
                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                        if (queryIntentServices != null && queryIntentServices.size() > 0) {
                            this.bravo = 1;
                            i4 = 1;
                        }
                    }
                    Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                    if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
                        this.bravo = 2;
                        i4 = 2;
                    } else {
                        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        if (AbstractC1630b.delta()) {
                            this.bravo = 2;
                        } else {
                            this.bravo = 1;
                        }
                        i4 = this.bravo;
                    }
                }
            }
        }
        if (i4 != 0) {
            return true;
        }
        return false;
    }

    public synchronized void kilo() {
        PackageInfo echo = echo(((Context) this.charlie).getPackageName());
        if (echo != null) {
            this.delta = Integer.toString(echo.versionCode);
            this.echo = echo.versionName;
        }
    }

    public void november(int i4, int i5) {
        long[] jArr = (long[]) this.charlie;
        int[] iArr = (int[]) this.delta;
        int[] iArr2 = (int[]) this.echo;
        long j5 = jArr[i4];
        jArr[i4] = jArr[i5];
        jArr[i5] = j5;
        int i10 = iArr[i4];
        int i11 = iArr[i5];
        iArr[i4] = i11;
        iArr[i5] = i10;
        iArr2[i11] = i4;
        iArr2[i10] = i5;
    }
}
