package J2;

import B2.ap;
import J8.A;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.work.impl.WorkDatabase_Impl;
import ao.aa;
import bv.aw;
import bz.InterfaceC0793s;
import bz.ab;
import bz.l0;
import com.bumptech.glide.load.engine.w;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.product_config.CTProductConfigConstants;
import com.google.android.gms.internal.measurement.C1290a1;
import com.google.android.gms.internal.measurement.C1317f3;
import com.google.android.gms.measurement.internal.G;
import com.google.android.gms.measurement.internal.ac;
import com.google.android.gms.measurement.internal.ar;
import com.google.android.gms.measurement.internal.ax;
import java.io.File;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import l1.InterfaceMenuItemC2052a;
import m0.v;
import m0.x;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import qe.InterfaceC2466b;
import s0.L;
import vf.ad;
import vf.ao;

/* loaded from: classes3.dex */
public final class n implements E9.b, Ge.l, U.f, an.a, l0 {
    public Object alpha;
    public Object purple;
    public Object red;
    public Object silver;

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, Object obj4) {
        this.alpha = obj;
        this.purple = obj2;
        this.red = obj3;
        this.silver = obj4;
    }

    public static final Message charlie(n nVar, ArrayList arrayList, int i4) {
        Object obj;
        nVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((Message) next).what == i4) {
                arrayList2.add(next);
            }
        }
        Iterator it2 = arrayList2.iterator();
        if (!it2.hasNext()) {
            obj = null;
        } else {
            Object next2 = it2.next();
            if (it2.hasNext()) {
                long when = ((Message) next2).getWhen();
                do {
                    Object next3 = it2.next();
                    long when2 = ((Message) next3).getWhen();
                    if (when < when2) {
                        next2 = next3;
                        when = when2;
                    }
                } while (it2.hasNext());
            }
            obj = next2;
        }
        return (Message) obj;
    }

    @Override // bz.i0
    public /* synthetic */ boolean alpha() {
        return false;
    }

    @Override // bz.i0
    public long amber(bz.r rVar, bz.r rVar2, bz.r rVar3) {
        int bravo = rVar.bravo();
        long j5 = 0;
        for (int i4 = 0; i4 < bravo; i4++) {
            j5 = Math.max(j5, ((InterfaceC0793s) this.alpha).get(i4).bravo(rVar.alpha(i4), rVar2.alpha(i4), rVar3.alpha(i4)));
        }
        return j5;
    }

    @Override // Ge.l
    public void bravo() {
        ((U7.c) this.purple).bravo();
        ((ArrayList) ((com.google.firebase.messaging.o) this.red).alpha).add(new Se.a((InterfaceC2466b) CollectionsKt.k((ArrayList) this.silver)));
    }

    @Override // bz.i0
    public bz.r delta(bz.r rVar, bz.r rVar2, bz.r rVar3) {
        if (((bz.r) this.silver) == null) {
            this.silver = rVar3.charlie();
        }
        bz.r rVar4 = (bz.r) this.silver;
        if (rVar4 != null) {
            int bravo = rVar4.bravo();
            for (int i4 = 0; i4 < bravo; i4++) {
                bz.r rVar5 = (bz.r) this.silver;
                if (rVar5 != null) {
                    rVar5.echo(((InterfaceC0793s) this.alpha).get(i4).delta(rVar.alpha(i4), rVar2.alpha(i4), rVar3.alpha(i4)), i4);
                } else {
                    Intrinsics.lima("endVelocityVector");
                    throw null;
                }
            }
            bz.r rVar6 = (bz.r) this.silver;
            if (rVar6 != null) {
                return rVar6;
            }
            Intrinsics.lima("endVelocityVector");
            throw null;
        }
        Intrinsics.lima("endVelocityVector");
        throw null;
    }

    @Override // Ge.l
    public void echo(Ne.f fVar, Object obj) {
        ((U7.c) this.alpha).echo(fVar, obj);
    }

    @Override // bz.i0
    public bz.r foxtrot(long j5, bz.r rVar, bz.r rVar2, bz.r rVar3) {
        if (((bz.r) this.purple) == null) {
            this.purple = rVar.charlie();
        }
        bz.r rVar4 = (bz.r) this.purple;
        if (rVar4 != null) {
            int bravo = rVar4.bravo();
            for (int i4 = 0; i4 < bravo; i4++) {
                bz.r rVar5 = (bz.r) this.purple;
                if (rVar5 != null) {
                    rVar5.echo(((InterfaceC0793s) this.alpha).get(i4).echo(rVar.alpha(i4), rVar2.alpha(i4), rVar3.alpha(i4), j5), i4);
                } else {
                    Intrinsics.lima("valueVector");
                    throw null;
                }
            }
            bz.r rVar6 = (bz.r) this.purple;
            if (rVar6 != null) {
                return rVar6;
            }
            Intrinsics.lima("valueVector");
            throw null;
        }
        Intrinsics.lima("valueVector");
        throw null;
    }

    @Override // an.a
    public boolean gold(an.b bVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.alpha).onActionItemClicked(november(bVar), new ao.s((Context) this.purple, (InterfaceMenuItemC2052a) menuItem));
    }

    @Override // Ge.l
    public Ge.m golf(Ne.f fVar) {
        return ((U7.c) this.alpha).golf(fVar);
    }

    @Override // bz.i0
    public bz.r gray(long j5, bz.r rVar, bz.r rVar2, bz.r rVar3) {
        if (((bz.r) this.red) == null) {
            this.red = rVar3.charlie();
        }
        bz.r rVar4 = (bz.r) this.red;
        if (rVar4 != null) {
            int bravo = rVar4.bravo();
            for (int i4 = 0; i4 < bravo; i4++) {
                bz.r rVar5 = (bz.r) this.red;
                if (rVar5 != null) {
                    rVar5.echo(((InterfaceC0793s) this.alpha).get(i4).charlie(rVar.alpha(i4), rVar2.alpha(i4), rVar3.alpha(i4), j5), i4);
                } else {
                    Intrinsics.lima("velocityVector");
                    throw null;
                }
            }
            bz.r rVar6 = (bz.r) this.red;
            if (rVar6 != null) {
                return rVar6;
            }
            Intrinsics.lima("velocityVector");
            throw null;
        }
        Intrinsics.lima("velocityVector");
        throw null;
    }

    public synchronized void hotel(com.bumptech.glide.load.engine.q qVar, com.bumptech.glide.load.engine.r rVar) {
        com.bumptech.glide.load.engine.a aVar = (com.bumptech.glide.load.engine.a) ((HashMap) this.purple).put(qVar, new com.bumptech.glide.load.engine.a(qVar, rVar, (ReferenceQueue) this.red));
        if (aVar != null) {
            aVar.charlie = null;
            aVar.clear();
        }
    }

    @Override // an.a
    public void i(an.b bVar) {
        ((ActionMode.Callback) this.alpha).onDestroyActionMode(november(bVar));
    }

    public void india(com.bumptech.glide.load.engine.a aVar) {
        w wVar;
        synchronized (this) {
            ((HashMap) this.purple).remove(aVar.alpha);
            if (aVar.bravo && (wVar = aVar.charlie) != null) {
                ((com.bumptech.glide.load.engine.l) this.silver).foxtrot(aVar.alpha, new com.bumptech.glide.load.engine.r(wVar, true, false, aVar.alpha, (com.bumptech.glide.load.engine.l) this.silver));
            }
        }
    }

    @Override // an.a
    public boolean indigo(an.b bVar, ao.l lVar) {
        an.f november = november(bVar);
        aw awVar = (aw) this.silver;
        Menu menu = (Menu) awVar.get(lVar);
        if (menu == null) {
            menu = new aa((Context) this.purple, lVar);
            awVar.put(lVar, menu);
        }
        return ((ActionMode.Callback) this.alpha).onPrepareActionMode(november, menu);
    }

    @Override // Ge.l
    public void juliet(Ne.f fVar, Ne.b bVar, Ne.f fVar2) {
        ((U7.c) this.alpha).juliet(fVar, bVar, fVar2);
    }

    @Override // Ge.l
    public void kilo(Ne.f fVar, Se.f fVar2) {
        ((U7.c) this.alpha).kilo(fVar, fVar2);
    }

    public void lima(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.alpha;
        workDatabase_Impl.bravo();
        h hVar = (h) this.red;
        androidx.sqlite.db.framework.i alpha = hVar.alpha();
        alpha.oscar(1, str);
        try {
            workDatabase_Impl.charlie();
            try {
                alpha.charlie();
                workDatabase_Impl.papa();
            } finally {
                workDatabase_Impl.kilo();
            }
        } finally {
            hVar.lima(alpha);
        }
    }

    public void mike(m0.k kVar, boolean z2) {
        List list = kVar.alpha;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (((m0.r) list.get(i4)).bravo()) {
                sierra(kVar);
                return;
            }
        }
        L l10 = (L) this.alpha;
        if (l10 != null) {
            m0.q.hotel(kVar, l10.gray(0L), new ap(25, this, (x) this.silver), false);
            if (((v) this.purple) == v.purple) {
                if (z2) {
                    int size2 = list.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        ((m0.r) list.get(i5)).alpha();
                    }
                }
                C1290a1 c1290a1 = kVar.bravo;
                if (c1290a1 != null) {
                    c1290a1.alpha = !r5.red;
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("layoutCoordinates not set");
    }

    public an.f november(an.b bVar) {
        ArrayList arrayList = (ArrayList) this.red;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            an.f fVar = (an.f) arrayList.get(i4);
            if (fVar != null && fVar.bravo == bVar) {
                return fVar;
            }
        }
        an.f fVar2 = new an.f((Context) this.purple, bVar);
        arrayList.add(fVar2);
        return fVar2;
    }

    public Object oscar(File file, Pd.i iVar) {
        Cf.e eVar = ao.alpha;
        return ad.blue(Cf.d.purple, new F9.h(file, this, null), iVar);
    }

    public void papa(Message message) {
        LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) this.red;
        if (linkedBlockingDeque.offer(message)) {
            Log.d("SessionLifecycleClient", "Queued message " + message.what + ". Queue size " + linkedBlockingDeque.size());
            return;
        }
        Log.d("SessionLifecycleClient", "Failed to enqueue message " + message.what + ". Dropping.");
    }

    @Override // an.a
    public boolean pink(an.b bVar, ao.l lVar) {
        an.f november = november(bVar);
        aw awVar = (aw) this.silver;
        Menu menu = (Menu) awVar.get(lVar);
        if (menu == null) {
            menu = new aa((Context) this.purple, lVar);
            awVar.put(lVar, menu);
        }
        return ((ActionMode.Callback) this.alpha).onCreateActionMode(november, menu);
    }

    @Override // Ge.l
    public Ge.l quebec(Ne.b bVar, Ne.f fVar) {
        return ((U7.c) this.alpha).quebec(bVar, fVar);
    }

    public void romeo(int i4) {
        ArrayList arrayList = new ArrayList();
        ((LinkedBlockingDeque) this.red).drainTo(arrayList);
        Message obtain = Message.obtain(null, i4, 0, 0);
        Intrinsics.delta(obtain, "obtain(null, messageCode, 0, 0)");
        arrayList.add(obtain);
        ad.zulu(ad.charlie((Nd.h) this.alpha), null, null, new A(this, arrayList, null), 3);
    }

    public void sierra(m0.k kVar) {
        if (((v) this.purple) == v.purple) {
            L l10 = (L) this.alpha;
            if (l10 != null) {
                m0.q.hotel(kVar, l10.gray(0L), new m0.w((x) this.silver, 1), true);
            } else {
                throw new IllegalStateException("layoutCoordinates not set");
            }
        }
        this.purple = v.red;
    }

    public Bundle tango() {
        char c3;
        if (((Bundle) this.red) == null) {
            ax axVar = (ax) this.silver;
            SharedPreferences b02 = axVar.b0();
            G g2 = (G) axVar.alpha;
            String string = b02.getString((String) this.alpha, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i4);
                            String string2 = jSONObject.getString(CTProductConfigConstants.PRODUCT_CONFIG_JSON_KEY_FOR_KEY);
                            String string3 = jSONObject.getString("t");
                            int hashCode = string3.hashCode();
                            if (hashCode != 100) {
                                if (hashCode != 108) {
                                    if (hashCode != 115) {
                                        if (hashCode != 3352) {
                                            if (hashCode == 3445 && string3.equals("la")) {
                                                c3 = 4;
                                            }
                                            c3 = 65535;
                                        } else {
                                            if (string3.equals("ia")) {
                                                c3 = 3;
                                            }
                                            c3 = 65535;
                                        }
                                    } else {
                                        if (string3.equals("s")) {
                                            c3 = 0;
                                        }
                                        c3 = 65535;
                                    }
                                } else {
                                    if (string3.equals("l")) {
                                        c3 = 2;
                                    }
                                    c3 = 65535;
                                }
                            } else {
                                if (string3.equals(Constants.INAPP_DATA_TAG)) {
                                    c3 = 1;
                                }
                                c3 = 65535;
                            }
                            if (c3 != 0) {
                                if (c3 != 1) {
                                    if (c3 != 2) {
                                        if (c3 != 3) {
                                            if (c3 != 4) {
                                                ar arVar = g2.f7507b;
                                                G.foxtrot(arVar);
                                                arVar.white.bravo(string3, "Unrecognized persisted bundle type. Type");
                                            } else {
                                                C1317f3.bravo();
                                                if (g2.yellow.j0(null, ac.f7575P)) {
                                                    JSONArray jSONArray2 = new JSONArray(jSONObject.getString(CTProductConfigConstants.PRODUCT_CONFIG_JSON_KEY_FOR_VALUE));
                                                    int length = jSONArray2.length();
                                                    long[] jArr = new long[length];
                                                    for (int i5 = 0; i5 < length; i5++) {
                                                        jArr[i5] = jSONArray2.optLong(i5);
                                                    }
                                                    bundle.putLongArray(string2, jArr);
                                                }
                                            }
                                        } else {
                                            C1317f3.bravo();
                                            if (g2.yellow.j0(null, ac.f7575P)) {
                                                JSONArray jSONArray3 = new JSONArray(jSONObject.getString(CTProductConfigConstants.PRODUCT_CONFIG_JSON_KEY_FOR_VALUE));
                                                int length2 = jSONArray3.length();
                                                int[] iArr = new int[length2];
                                                for (int i10 = 0; i10 < length2; i10++) {
                                                    iArr[i10] = jSONArray3.optInt(i10);
                                                }
                                                bundle.putIntArray(string2, iArr);
                                            }
                                        }
                                    } else {
                                        bundle.putLong(string2, Long.parseLong(jSONObject.getString(CTProductConfigConstants.PRODUCT_CONFIG_JSON_KEY_FOR_VALUE)));
                                    }
                                } else {
                                    bundle.putDouble(string2, Double.parseDouble(jSONObject.getString(CTProductConfigConstants.PRODUCT_CONFIG_JSON_KEY_FOR_VALUE)));
                                }
                            } else {
                                bundle.putString(string2, jSONObject.getString(CTProductConfigConstants.PRODUCT_CONFIG_JSON_KEY_FOR_VALUE));
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            ar arVar2 = g2.f7507b;
                            G.foxtrot(arVar2);
                            arVar2.white.alpha("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.red = bundle;
                } catch (JSONException unused2) {
                    ar arVar3 = g2.f7507b;
                    G.foxtrot(arVar3);
                    arVar3.white.alpha("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (((Bundle) this.red) == null) {
                this.red = (Bundle) this.purple;
            }
        }
        Bundle bundle2 = (Bundle) this.red;
        V5.x.hotel(bundle2);
        return new Bundle(bundle2);
    }

    public void uniform(Bundle bundle) {
        Bundle bundle2;
        Iterator<String> it;
        JSONObject jSONObject;
        boolean j02;
        ar arVar;
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = new Bundle(bundle);
        }
        ax axVar = (ax) this.silver;
        SharedPreferences b02 = axVar.b0();
        G g2 = (G) axVar.alpha;
        SharedPreferences.Editor edit = b02.edit();
        int size = bundle2.size();
        String str = (String) this.alpha;
        if (size == 0) {
            edit.remove(str);
        } else {
            JSONArray jSONArray = new JSONArray();
            Iterator<String> it2 = bundle2.keySet().iterator();
            while (it2.hasNext()) {
                String next = it2.next();
                Object obj = bundle2.get(next);
                if (obj != null) {
                    try {
                        jSONObject = new JSONObject();
                        jSONObject.put(CTProductConfigConstants.PRODUCT_CONFIG_JSON_KEY_FOR_KEY, next);
                        C1317f3.bravo();
                        j02 = g2.yellow.j0(null, ac.f7575P);
                        arVar = g2.f7507b;
                    } catch (JSONException e) {
                        e = e;
                        it = it2;
                    }
                    if (j02) {
                        it = it2;
                        try {
                        } catch (JSONException e4) {
                            e = e4;
                            ar arVar2 = g2.f7507b;
                            G.foxtrot(arVar2);
                            arVar2.white.bravo(e, "Cannot serialize bundle value to SharedPreferences");
                            it2 = it;
                        }
                        if (obj instanceof String) {
                            jSONObject.put(CTProductConfigConstants.PRODUCT_CONFIG_JSON_KEY_FOR_VALUE, obj.toString());
                            jSONObject.put("t", "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put(CTProductConfigConstants.PRODUCT_CONFIG_JSON_KEY_FOR_VALUE, obj.toString());
                            jSONObject.put("t", "l");
                        } else if (obj instanceof int[]) {
                            jSONObject.put(CTProductConfigConstants.PRODUCT_CONFIG_JSON_KEY_FOR_VALUE, Arrays.toString((int[]) obj));
                            jSONObject.put("t", "ia");
                        } else if (obj instanceof long[]) {
                            jSONObject.put(CTProductConfigConstants.PRODUCT_CONFIG_JSON_KEY_FOR_VALUE, Arrays.toString((long[]) obj));
                            jSONObject.put("t", "la");
                        } else if (obj instanceof Double) {
                            jSONObject.put(CTProductConfigConstants.PRODUCT_CONFIG_JSON_KEY_FOR_VALUE, obj.toString());
                            jSONObject.put("t", Constants.INAPP_DATA_TAG);
                        } else {
                            G.foxtrot(arVar);
                            arVar.white.bravo(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            it2 = it;
                        }
                        jSONArray.put(jSONObject);
                        it2 = it;
                    } else {
                        it = it2;
                        jSONObject.put(CTProductConfigConstants.PRODUCT_CONFIG_JSON_KEY_FOR_VALUE, obj.toString());
                        if (obj instanceof String) {
                            jSONObject.put("t", "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put("t", "l");
                        } else if (obj instanceof Double) {
                            jSONObject.put("t", Constants.INAPP_DATA_TAG);
                        } else {
                            G.foxtrot(arVar);
                            arVar.white.bravo(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            it2 = it;
                        }
                        jSONArray.put(jSONObject);
                        it2 = it;
                    }
                }
            }
            edit.putString(str, jSONArray.toString());
        }
        edit.apply();
        this.red = bundle2;
    }

    public n(ax axVar, String str) {
        this.silver = axVar;
        V5.x.echo(str);
        this.alpha = str;
        this.purple = new Bundle();
    }

    public n(InterfaceC0793s interfaceC0793s) {
        this.alpha = interfaceC0793s;
    }

    public n(ab abVar) {
        this(new androidx.core.widget.f(16, abVar));
    }
}
