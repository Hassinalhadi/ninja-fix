package B9;

import F.C0113h0;
import F.Q2;
import F.R2;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Parcelable;
import android.provider.MediaStore;
import android.text.Layout;
import android.text.TextUtils;
import android.util.Log;
import android.util.Range;
import android.util.Size;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.camera.core.C0499f;
import androidx.camera.core.impl.C0507e;
import androidx.camera.core.impl.C0509g;
import androidx.camera.core.impl.InterfaceC0525x;
import androidx.camera.core.internal.CameraUseCaseAdapter$CameraException;
import androidx.cardview.widget.CardView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import be.RunnableC0756b;
import bz.C0797w;
import bz.InterfaceC0787l;
import com.canhub.cropper.CropImageActivity;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.components.DependencyException;
import delivery.samurai.android.R;
import f8.InterfaceC1696b;
import ge.InterfaceC1772d;
import i8.InterfaceC1904b;
import java.text.Bidi;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import l3.AbstractC2056a;
import p3.C2275g;
import pf.AbstractC2360j;
import qe.InterfaceC2466b;
import s6.T7;
import t6.j4;
import u3.InterfaceC3142e;

/* loaded from: classes2.dex */
public final class ab implements D0.s, Q2, Ge.l, I7.c, Lazy {
    public final /* synthetic */ int alpha;
    public Object purple;
    public Object red;
    public Object silver;
    public Object teal;
    public Object white;

    public /* synthetic */ ab(int i4) {
        this.alpha = i4;
    }

    public static ab zulu(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        ab abVar = new ab(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (((ArrayDeque) abVar.silver)) {
            try {
                ((ArrayDeque) abVar.silver).clear();
                String string = ((SharedPreferences) abVar.purple).getString((String) abVar.white, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) abVar.red)) {
                    String[] split = string.split((String) abVar.red, -1);
                    if (split.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) abVar.silver).add(str);
                        }
                    }
                    return abVar;
                }
                return abVar;
            } finally {
            }
        }
    }

    @Override // kotlin.Lazy
    public boolean alpha() {
        if (((androidx.lifecycle.Y) this.teal) != null) {
            return true;
        }
        return false;
    }

    public bo.b amber(androidx.lifecycle.al alVar, bf.f fVar) {
        boolean z2;
        synchronized (this.purple) {
            try {
                if (((HashMap) this.white).get(new bo.a(alVar, fVar.teal)) == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                T7.bravo("LifecycleCamera already exists for the given LifecycleOwner and set of cameras", z2);
                bo.b bVar = new bo.b(alVar, fVar);
                if (((ArrayList) fVar.amber()).isEmpty()) {
                    bVar.quebec();
                }
                if (alVar.getLifecycle().bravo() == androidx.lifecycle.ab.alpha) {
                    return bVar;
                }
                indigo(bVar);
                return bVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public f1.ai azure() {
        Y1.ac acVar = (Y1.ac) this.silver;
        if (acVar != null) {
            ArrayList arrayList = (ArrayList) this.teal;
            if (!arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
                Iterator it = arrayList.iterator();
                Y1.aa aaVar = null;
                while (true) {
                    int i4 = 0;
                    if (it.hasNext()) {
                        Y1.x xVar = (Y1.x) it.next();
                        int i5 = xVar.alpha;
                        Y1.aa beige = beige(i5);
                        if (beige != null) {
                            int[] delta = beige.delta(aaVar);
                            int length = delta.length;
                            while (i4 < length) {
                                arrayList2.add(Integer.valueOf(delta[i4]));
                                arrayList3.add(xVar.bravo);
                                i4++;
                            }
                            aaVar = beige;
                        } else {
                            int i10 = Y1.aa.white;
                            throw new IllegalArgumentException("Navigation destination " + Y1.y.alpha((H0.a) this.white, i5) + " cannot be found in the navigation graph " + acVar);
                        }
                    } else {
                        int[] y10 = CollectionsKt.y(arrayList2);
                        Intent intent = (Intent) this.red;
                        intent.putExtra("android-support-nav:controller:deepLinkIds", y10);
                        intent.putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList3);
                        f1.ai aiVar = new f1.ai((Context) this.purple);
                        aiVar.alpha(new Intent(intent));
                        ArrayList arrayList4 = aiVar.alpha;
                        int size = arrayList4.size();
                        while (i4 < size) {
                            Intent intent2 = (Intent) arrayList4.get(i4);
                            if (intent2 != null) {
                                intent2.putExtra("android-support-nav:controller:deepLinkIntent", intent);
                            }
                            i4++;
                        }
                        return aiVar;
                    }
                }
            } else {
                throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link");
            }
        } else {
            throw new IllegalStateException("You must call setGraph() before constructing the deep link");
        }
    }

    public Y1.aa beige(int i4) {
        kotlin.collections.l lVar = new kotlin.collections.l();
        Y1.ac acVar = (Y1.ac) this.silver;
        Intrinsics.checkNotNull(acVar);
        lVar.addLast(acVar);
        while (!lVar.isEmpty()) {
            Y1.aa aaVar = (Y1.aa) lVar.removeFirst();
            if (aaVar.purple.charlie == i4) {
                return aaVar;
            }
            if (aaVar instanceof Y1.ac) {
                Iterator it = ((Y1.ac) aaVar).iterator();
                while (true) {
                    androidx.navigation.internal.j jVar = (androidx.navigation.internal.j) it;
                    if (jVar.hasNext()) {
                        lVar.addLast((Y1.aa) jVar.next());
                    }
                }
            }
        }
        return null;
    }

    public I7.n black(Class cls) {
        return hotel(I7.p.alpha(cls));
    }

    public float blue(int i4, boolean z2) {
        Layout layout = (Layout) this.purple;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i4));
        if (i4 > lineEnd) {
            i4 = lineEnd;
        }
        if (z2) {
            return layout.getPrimaryHorizontal(i4);
        }
        return layout.getSecondaryHorizontal(i4);
    }

    @Override // Ge.l
    public void bravo() {
        ((U7.c) this.white).bravo();
        Se.a aVar = new Se.a((InterfaceC2466b) CollectionsKt.k((ArrayList) this.teal));
        ((HashMap) ((U7.c) this.red).purple).put((Ne.f) this.silver, aVar);
    }

    public ArrayList bronze(PackageManager packageManager, String str) {
        Intent intent;
        List<ResolveInfo> queryIntentActivities;
        Object obj;
        ArrayList arrayList = new ArrayList();
        if (Intrinsics.areEqual(str, "android.intent.action.GET_CONTENT")) {
            intent = new Intent(str);
        } else {
            intent = new Intent(str, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        }
        intent.setType("image/*");
        if (Build.VERSION.SDK_INT >= 33) {
            queryIntentActivities = E0.c.tango(packageManager, intent, E0.c.foxtrot(0));
        } else {
            queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        }
        Intrinsics.delta(queryIntentActivities, "when {\n      SDK_INT >= …lleryIntent, flags)\n    }");
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            Intent intent2 = new Intent(intent);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            arrayList.add(intent2);
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : (List) this.red) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (Intrinsics.areEqual(((Intent) obj).getPackage(), str2)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            Intent intent3 = (Intent) obj;
            if (intent3 != null) {
                arrayList.remove(intent3);
                arrayList2.add(intent3);
            }
        }
        arrayList.addAll(0, arrayList2);
        return arrayList;
    }

    @Override // I7.c
    public Object charlie(Class cls) {
        if (((Set) this.purple).contains(I7.p.alpha(cls))) {
            Object charlie = ((I7.c) this.teal).charlie(cls);
            if (!cls.equals(InterfaceC1696b.class)) {
                return charlie;
            }
            return new Object();
        }
        throw new DependencyException("Attempting to request an undeclared dependency " + cls + ".");
    }

    public float coral(int i4, boolean z2, boolean z10) {
        boolean z11;
        Bidi bidi;
        boolean z12;
        int i5;
        boolean z13;
        int i10;
        boolean z14;
        boolean z15;
        int i11 = i4;
        if (!z10) {
            return blue(i4, z2);
        }
        Layout layout = (Layout) this.purple;
        int delta = E0.o.delta(layout, i11, z10);
        int lineStart = layout.getLineStart(delta);
        int lineEnd = layout.getLineEnd(delta);
        if (i11 != lineStart && i11 != lineEnd) {
            return blue(i4, z2);
        }
        if (i11 != 0 && i11 != layout.getText().length()) {
            int emerald = emerald(i11, z10);
            if (layout.getParagraphDirection(layout.getLineForOffset(fuchsia(emerald))) == -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            int gray = gray(lineEnd, lineStart);
            int fuchsia = fuchsia(emerald);
            int i12 = lineStart - fuchsia;
            int i13 = gray - fuchsia;
            Bidi uniform = uniform(emerald);
            if (uniform != null) {
                bidi = uniform.createLineBidi(i12, i13);
            } else {
                bidi = null;
            }
            if (bidi != null && bidi.getRunCount() != 1) {
                int runCount = bidi.getRunCount();
                E0.j[] jVarArr = new E0.j[runCount];
                for (int i14 = 0; i14 < runCount; i14++) {
                    int runStart = bidi.getRunStart(i14) + lineStart;
                    int runLimit = bidi.getRunLimit(i14) + lineStart;
                    if (bidi.getRunLevel(i14) % 2 == 1) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    jVarArr[i14] = new E0.j(runStart, runLimit, z15);
                }
                int runCount2 = bidi.getRunCount();
                byte[] bArr = new byte[runCount2];
                for (int i15 = 0; i15 < runCount2; i15++) {
                    bArr[i15] = (byte) bidi.getRunLevel(i15);
                }
                Bidi.reorderVisually(bArr, 0, jVarArr, 0, runCount);
                if (i11 == lineStart) {
                    int i16 = 0;
                    while (true) {
                        if (i16 < runCount) {
                            if (jVarArr[i16].alpha == i11) {
                                i10 = i16;
                                break;
                            }
                            i16++;
                        } else {
                            i10 = -1;
                            break;
                        }
                    }
                    E0.j jVar = jVarArr[i10];
                    if (!z2 && z11 != jVar.charlie) {
                        z14 = z11;
                    } else if (!z11) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (i10 == 0 && z14) {
                        return layout.getLineLeft(delta);
                    }
                    if (i10 == runCount - 1 && !z14) {
                        return layout.getLineRight(delta);
                    }
                    if (z14) {
                        return layout.getPrimaryHorizontal(jVarArr[i10 - 1].alpha);
                    }
                    return layout.getPrimaryHorizontal(jVarArr[i10 + 1].alpha);
                }
                if (i11 > gray) {
                    i11 = gray(i11, lineStart);
                }
                int i17 = 0;
                while (true) {
                    if (i17 < runCount) {
                        if (jVarArr[i17].bravo == i11) {
                            i5 = i17;
                            break;
                        }
                        i17++;
                    } else {
                        i5 = -1;
                        break;
                    }
                }
                E0.j jVar2 = jVarArr[i5];
                if (!z2 && z11 != jVar2.charlie) {
                    if (!z11) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                } else {
                    z13 = z11;
                }
                if (i5 == 0 && z13) {
                    return layout.getLineLeft(delta);
                }
                if (i5 == runCount - 1 && !z13) {
                    return layout.getLineRight(delta);
                }
                if (z13) {
                    return layout.getPrimaryHorizontal(jVarArr[i5 - 1].bravo);
                }
                return layout.getPrimaryHorizontal(jVarArr[i5 + 1].bravo);
            }
            boolean isRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z2 || z11 == isRtlCharAt) {
                if (!z11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            if (i11 == lineStart) {
                z12 = z11;
            } else if (!z11) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                return layout.getLineLeft(delta);
            }
            return layout.getLineRight(delta);
        }
        return blue(i4, z2);
    }

    public bo.c crimson(androidx.lifecycle.al alVar) {
        synchronized (this.purple) {
            try {
                for (bo.c cVar : ((HashMap) this.red).keySet()) {
                    if (alVar.equals(cVar.purple)) {
                        return cVar;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Collection cyan() {
        Collection unmodifiableCollection;
        synchronized (this.purple) {
            unmodifiableCollection = Collections.unmodifiableCollection(((HashMap) this.white).values());
        }
        return unmodifiableCollection;
    }

    @Override // D0.s
    public boolean delta() {
        ArrayList arrayList = (ArrayList) this.teal;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (((D0.r) arrayList.get(i4)).alpha.delta()) {
                return true;
            }
        }
        return false;
    }

    @Override // Ge.l
    public void echo(Ne.f fVar, Object obj) {
        ((U7.c) this.purple).echo(fVar, obj);
    }

    public int emerald(int i4, boolean z2) {
        int i5;
        ArrayList arrayList = (ArrayList) this.white;
        int black = CollectionsKt.black(arrayList, Integer.valueOf(i4));
        if (black < 0) {
            i5 = -(black + 1);
        } else {
            i5 = black + 1;
        }
        if (z2 && i5 > 0) {
            int i10 = i5 - 1;
            if (i4 == ((Number) arrayList.get(i10)).intValue()) {
                return i10;
            }
        }
        return i5;
    }

    @Override // I7.c
    public Set foxtrot(I7.p pVar) {
        if (((Set) this.silver).contains(pVar)) {
            return ((I7.c) this.teal).foxtrot(pVar);
        }
        throw new DependencyException("Attempting to request an undeclared dependency Set<" + pVar + ">.");
    }

    public int fuchsia(int i4) {
        if (i4 == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.white).get(i4 - 1)).intValue();
    }

    @Override // F.Q2
    public R2 getState() {
        switch (this.alpha) {
            case 13:
                return (R2) this.purple;
            default:
                return (R2) this.purple;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.Lazy
    public Object getValue() {
        androidx.lifecycle.Y y10 = (androidx.lifecycle.Y) this.teal;
        if (y10 == null) {
            androidx.lifecycle.c0 store = (androidx.lifecycle.c0) ((Lambda) this.white).invoke();
            androidx.lifecycle.a0 factory = (androidx.lifecycle.a0) ((Function0) this.red).invoke();
            T1.c extras = (T1.c) ((Lambda) this.silver).invoke();
            Intrinsics.echo(store, "store");
            Intrinsics.echo(factory, "factory");
            Intrinsics.echo(extras, "extras");
            J2.i iVar = new J2.i(store, factory, extras);
            InterfaceC1772d modelClass = (InterfaceC1772d) this.purple;
            Intrinsics.echo(modelClass, "modelClass");
            String juliet = modelClass.juliet();
            if (juliet != null) {
                androidx.lifecycle.Y charlie = iVar.charlie(modelClass, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(juliet));
                this.teal = charlie;
                return charlie;
            }
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return y10;
    }

    public boolean gold(androidx.lifecycle.al alVar) {
        synchronized (this.purple) {
            try {
                bo.c crimson = crimson(alVar);
                if (crimson == null) {
                    return false;
                }
                Iterator it = ((Set) ((HashMap) this.red).get(crimson)).iterator();
                while (it.hasNext()) {
                    bo.b bVar = (bo.b) ((HashMap) this.white).get((bo.a) it.next());
                    bVar.getClass();
                    if (!bVar.echo().isEmpty()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Ge.l
    public Ge.m golf(Ne.f fVar) {
        return ((U7.c) this.purple).golf(fVar);
    }

    public int gray(int i4, int i5) {
        while (i4 > i5) {
            char charAt = ((Layout) this.purple).getText().charAt(i4 - 1);
            if (charAt != ' ' && charAt != '\n' && charAt != 5760 && ((Intrinsics.golf(charAt, 8192) < 0 || Intrinsics.golf(charAt, 8202) > 0 || charAt == 8199) && charAt != 8287 && charAt != 12288)) {
                return i4;
            }
            i4--;
        }
        return i4;
    }

    public String green() {
        String str;
        synchronized (((ArrayDeque) this.silver)) {
            str = (String) ((ArrayDeque) this.silver).peek();
        }
        return str;
    }

    @Override // I7.c
    public I7.n hotel(I7.p pVar) {
        if (((Set) this.red).contains(pVar)) {
            return ((I7.c) this.teal).hotel(pVar);
        }
        throw new DependencyException("Attempting to request an undeclared dependency Deferred<" + pVar + ">.");
    }

    @Override // I7.c
    public InterfaceC1904b india(Class cls) {
        return mike(I7.p.alpha(cls));
    }

    public void indigo(bo.b bVar) {
        Set hashSet;
        synchronized (this.purple) {
            try {
                androidx.lifecycle.al delta = bVar.delta();
                bf.f fVar = bVar.red;
                bo.a aVar = new bo.a(delta, bf.f.whiskey(fVar.f3381j, fVar.f3382k));
                bo.c crimson = crimson(delta);
                if (crimson != null) {
                    hashSet = (Set) ((HashMap) this.red).get(crimson);
                } else {
                    hashSet = new HashSet();
                }
                hashSet.add(aVar);
                ((HashMap) this.white).put(aVar, bVar);
                if (crimson == null) {
                    bo.c cVar = new bo.c(delta, this);
                    ((HashMap) this.red).put(cVar, hashSet);
                    delta.getLifecycle().alpha(cVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean ivory(Object obj) {
        boolean remove;
        synchronized (((ArrayDeque) this.silver)) {
            remove = ((ArrayDeque) this.silver).remove(obj);
            if (remove) {
                ((ScheduledThreadPoolExecutor) this.teal).execute(new androidx.camera.core.impl.ai(27, this));
            }
        }
        return remove;
    }

    public void jade() {
        String str;
        ResolvableApiException resolvableApiException = (ResolvableApiException) this.silver;
        if (resolvableApiException != null) {
            androidx.fragment.app.an anVar = (androidx.fragment.app.an) this.teal;
            if (AbstractC2056a.charlie((Context) this.purple)) {
                str = "HIGH";
            } else {
                str = "DEGRADED";
            }
            Object invoke = ((C2275g) this.red).invoke();
            InterfaceC3142e interfaceC3142e = (InterfaceC3142e) this.white;
            if (anVar == null) {
                interfaceC3142e.alpha("LocationFlow", "[RETRY_SETTINGS_FAILED] Cannot retry - baseActivity still null | accuracyMode=" + str + " | STOMP=" + invoke);
                return;
            }
            interfaceC3142e.alpha("LocationFlow", "[RETRY_SETTINGS] Retrying location settings resolution | accuracyMode=" + str + " | STOMP=" + invoke);
            try {
                resolvableApiException.startResolutionForResult(anVar, 1002);
                interfaceC3142e.alpha("LocationFlow", "[RETRY_SETTINGS_SUCCESS] Settings resolution started successfully | accuracyMode=".concat(str));
                this.silver = null;
                this.teal = null;
            } catch (Exception e) {
                interfaceC3142e.alpha("LocationFlow", av.q.foxtrot("[RETRY_SETTINGS_FAILED] startResolutionForResult failed | error=", e.getMessage(), " | accuracyMode=", str));
                try {
                    K7.b.alpha().charlie(e);
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // Ge.l
    public void juliet(Ne.f fVar, Ne.b bVar, Ne.f fVar2) {
        ((U7.c) this.purple).juliet(fVar, bVar, fVar2);
    }

    @Override // Ge.l
    public void kilo(Ne.f fVar, Se.f fVar2) {
        ((U7.c) this.purple).kilo(fVar, fVar2);
    }

    public void lavender(Object obj, String key) {
        Intrinsics.echo(key, "key");
        ((LinkedHashMap) this.purple).put(key, obj);
        yf.at atVar = (yf.at) ((LinkedHashMap) this.red).get(key);
        if (atVar != null) {
            ((yf.N) atVar).india(obj);
        }
        yf.at atVar2 = (yf.at) ((LinkedHashMap) this.silver).get(key);
        if (atVar2 != null) {
            ((yf.N) atVar2).india(obj);
        }
    }

    @Override // F.Q2
    public C0797w lima() {
        switch (this.alpha) {
            case 13:
                return (C0797w) this.red;
            default:
                return (C0797w) this.red;
        }
    }

    public void lime(androidx.lifecycle.al alVar) {
        synchronized (this.purple) {
            try {
                if (!gold(alVar)) {
                    return;
                }
                if (((ArrayDeque) this.silver).isEmpty()) {
                    ((ArrayDeque) this.silver).push(alVar);
                } else {
                    Be.e eVar = (Be.e) this.teal;
                    if (eVar == null || eVar.alpha != 2) {
                        androidx.lifecycle.al alVar2 = (androidx.lifecycle.al) ((ArrayDeque) this.silver).peek();
                        if (!alVar.equals(alVar2)) {
                            navy(alVar2);
                            ((ArrayDeque) this.silver).remove(alVar);
                            ((ArrayDeque) this.silver).push(alVar);
                        }
                    }
                }
                olive(alVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void magenta(androidx.lifecycle.al alVar) {
        synchronized (this.purple) {
            try {
                ((ArrayDeque) this.silver).remove(alVar);
                navy(alVar);
                if (!((ArrayDeque) this.silver).isEmpty()) {
                    olive((androidx.lifecycle.al) ((ArrayDeque) this.silver).peek());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Set maroon(Class cls) {
        return foxtrot(I7.p.alpha(cls));
    }

    @Override // I7.c
    public InterfaceC1904b mike(I7.p pVar) {
        if (((Set) this.white).contains(pVar)) {
            return ((I7.c) this.teal).mike(pVar);
        }
        throw new DependencyException("Attempting to request an undeclared dependency Provider<" + pVar + ">.");
    }

    public void navy(androidx.lifecycle.al alVar) {
        synchronized (this.purple) {
            try {
                bo.c crimson = crimson(alVar);
                if (crimson == null) {
                    return;
                }
                Iterator it = ((Set) ((HashMap) this.red).get(crimson)).iterator();
                while (it.hasNext()) {
                    bo.b bVar = (bo.b) ((HashMap) this.white).get((bo.a) it.next());
                    bVar.getClass();
                    bVar.quebec();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // D0.s
    public float november() {
        return ((Number) this.red.getValue()).floatValue();
    }

    public void ochre() {
        synchronized (this.purple) {
            try {
                Iterator it = ((HashMap) this.white).keySet().iterator();
                while (it.hasNext()) {
                    bo.b bVar = (bo.b) ((HashMap) this.white).get((bo.a) it.next());
                    bVar.romeo();
                    magenta(bVar.delta());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void olive(androidx.lifecycle.al alVar) {
        synchronized (this.purple) {
            try {
                Iterator it = ((Set) ((HashMap) this.red).get(crimson(alVar))).iterator();
                while (it.hasNext()) {
                    bo.b bVar = (bo.b) ((HashMap) this.white).get((bo.a) it.next());
                    bVar.getClass();
                    if (!bVar.echo().isEmpty()) {
                        bVar.sierra();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void orange() {
        Iterator it = ((ArrayList) this.teal).iterator();
        while (it.hasNext()) {
            int i4 = ((Y1.x) it.next()).alpha;
            if (beige(i4) == null) {
                int i5 = Y1.aa.white;
                StringBuilder victor = Q0.c.victor("Navigation destination ", Y1.y.alpha((H0.a) this.white, i4), " cannot be found in the navigation graph ");
                victor.append((Y1.ac) this.silver);
                throw new IllegalArgumentException(victor.toString());
            }
        }
    }

    @Override // I7.c
    public Object oscar(I7.p pVar) {
        if (((Set) this.purple).contains(pVar)) {
            return ((I7.c) this.teal).oscar(pVar);
        }
        throw new DependencyException("Attempting to request an undeclared dependency " + pVar + ".");
    }

    @Override // F.Q2
    public InterfaceC0787l papa() {
        switch (this.alpha) {
            case 13:
                return (bz.I) this.white;
            default:
                return (bz.I) this.white;
        }
    }

    @Override // Ge.l
    public Ge.l quebec(Ne.b bVar, Ne.f fVar) {
        return ((U7.c) this.purple).quebec(bVar, fVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // D0.s
    public float romeo() {
        return ((Number) this.silver.getValue()).floatValue();
    }

    public void sierra(R2.f fVar, Class cls) {
        ((ArrayList) this.silver).add(new Pair(fVar, cls));
    }

    public void tango(U2.a aVar, Class cls) {
        ((ArrayList) this.white).add(new Pair(aVar, cls));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
    
        if (r5.getRunCount() == 1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Bidi uniform(int i4) {
        int intValue;
        Bidi bidi;
        int i5;
        boolean[] zArr = (boolean[]) this.silver;
        boolean z2 = zArr[i4];
        ArrayList arrayList = (ArrayList) this.red;
        if (z2) {
            return (Bidi) arrayList.get(i4);
        }
        ArrayList arrayList2 = (ArrayList) this.white;
        if (i4 == 0) {
            intValue = 0;
        } else {
            intValue = ((Number) arrayList2.get(i4 - 1)).intValue();
        }
        int intValue2 = ((Number) arrayList2.get(i4)).intValue();
        int i10 = intValue2 - intValue;
        char[] cArr = (char[]) this.teal;
        if (cArr == null || cArr.length < i10) {
            cArr = new char[i10];
        }
        char[] cArr2 = cArr;
        Layout layout = (Layout) this.purple;
        TextUtils.getChars(layout.getText(), intValue, intValue2, cArr2, 0);
        if (Bidi.requiresBidi(cArr2, 0, i10)) {
            if (layout.getParagraphDirection(layout.getLineForOffset(fuchsia(i4))) == -1) {
                i5 = 1;
            } else {
                i5 = 0;
            }
            bidi = new Bidi(cArr2, 0, null, 0, i10, i5);
        }
        bidi = null;
        arrayList.set(i4, bidi);
        zArr[i4] = true;
        if (bidi != null) {
            char[] cArr3 = (char[]) this.teal;
            if (cArr2 == cArr3) {
                cArr2 = null;
            } else {
                cArr2 = cArr3;
            }
        }
        this.teal = cArr2;
        return bidi;
    }

    public void victor(bo.b bVar, List list, List list2, Be.e eVar) {
        synchronized (this.purple) {
            try {
                boolean z2 = true;
                T7.charlie(!list2.isEmpty());
                this.teal = eVar;
                androidx.lifecycle.al delta = bVar.delta();
                bo.c crimson = crimson(delta);
                if (crimson == null) {
                    return;
                }
                Set set = (Set) ((HashMap) this.red).get(crimson);
                Be.e eVar2 = (Be.e) this.teal;
                if (eVar2 == null || eVar2.alpha != 2) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        bo.b bVar2 = (bo.b) ((HashMap) this.white).get((bo.a) it.next());
                        bVar2.getClass();
                        if (!bVar2.equals(bVar) && !bVar2.echo().isEmpty()) {
                            throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner.");
                        }
                    }
                }
                try {
                    bVar.red.cyan();
                    bVar.red.coral(list);
                    bVar.charlie(list2);
                    if (delta.getLifecycle().bravo().compareTo(androidx.lifecycle.ab.silver) < 0) {
                        z2 = false;
                    }
                    if (z2) {
                        lime(delta);
                    }
                } catch (CameraUseCaseAdapter$CameraException e) {
                    throw new IllegalArgumentException(e);
                }
            } finally {
            }
        }
    }

    public C0507e whiskey() {
        String str;
        if (((androidx.camera.core.impl.ah) this.purple) == null) {
            str = " surface";
        } else {
            str = "";
        }
        if (((List) this.white) == null) {
            str = str.concat(" sharedSurfaces");
        }
        if (((Integer) this.red) == null) {
            str = androidx.appcompat.widget.P0.crimson(str, " mirrorMode");
        }
        if (((Integer) this.silver) == null) {
            str = androidx.appcompat.widget.P0.crimson(str, " surfaceGroupId");
        }
        if (((androidx.camera.core.t) this.teal) == null) {
            str = androidx.appcompat.widget.P0.crimson(str, " dynamicRange");
        }
        if (str.isEmpty()) {
            return new C0507e((androidx.camera.core.impl.ah) this.purple, (List) this.white, ((Integer) this.red).intValue(), ((Integer) this.silver).intValue(), (androidx.camera.core.t) this.teal);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public C0509g xray() {
        String str;
        if (((Size) this.purple) == null) {
            str = " resolution";
        } else {
            str = "";
        }
        if (((androidx.camera.core.t) this.white) == null) {
            str = str.concat(" dynamicRange");
        }
        if (((Range) this.red) == null) {
            str = androidx.appcompat.widget.P0.crimson(str, " expectedFrameRateRange");
        }
        if (((Boolean) this.teal) == null) {
            str = androidx.appcompat.widget.P0.crimson(str, " zslDisabled");
        }
        if (str.isEmpty()) {
            return new C0509g((Size) this.purple, (androidx.camera.core.t) this.white, (Range) this.red, (au.a) this.silver, ((Boolean) this.teal).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void yankee(InterfaceC0525x interfaceC0525x, InterfaceC0525x interfaceC0525x2, bj.k kVar, bj.k kVar2, Map.Entry entry) {
        InterfaceC0525x interfaceC0525x3;
        InterfaceC0525x interfaceC0525x4;
        bj.k kVar3 = (bj.k) entry.getValue();
        Size size = kVar.golf.alpha;
        bl.b bVar = ((bk.a) entry.getKey()).alpha;
        if (kVar.charlie) {
            interfaceC0525x3 = interfaceC0525x;
        } else {
            interfaceC0525x3 = null;
        }
        C0499f c0499f = new C0499f(size, bVar.delta, interfaceC0525x3, ((bk.a) entry.getKey()).alpha.foxtrot, ((bk.a) entry.getKey()).alpha.golf);
        Size size2 = kVar2.golf.alpha;
        bl.b bVar2 = ((bk.a) entry.getKey()).bravo;
        if (kVar2.charlie) {
            interfaceC0525x4 = interfaceC0525x2;
        } else {
            interfaceC0525x4 = null;
        }
        C0499f c0499f2 = new C0499f(size2, bVar2.delta, interfaceC0525x4, ((bk.a) entry.getKey()).bravo.foxtrot, ((bk.a) entry.getKey()).bravo.golf);
        bl.b bVar3 = ((bk.a) entry.getKey()).alpha;
        kVar3.getClass();
        j4.alpha();
        kVar3.alpha();
        T7.golf("Consumer can only be linked once.", !kVar3.juliet);
        kVar3.juliet = true;
        bj.j jVar = kVar3.lima;
        RunnableC0756b foxtrot = be.h.foxtrot(jVar.charlie(), new bj.i(kVar3, jVar, bVar3.charlie, c0499f, c0499f2), tg.k.echo());
        foxtrot.foxtrot(new be.g(0, foxtrot, new J2.e(26, (Object) this, (Object) kVar3, false)), tg.k.echo());
    }

    public ab(Y1.r rVar) {
        Intent launchIntentForPackage;
        this.alpha = 19;
        Context context = rVar.alpha;
        Intrinsics.echo(context, "context");
        this.purple = context;
        this.white = new H0.a(context, 6);
        Activity activity = (Activity) AbstractC2360j.india(AbstractC2360j.papa(AbstractC2360j.lima(context, new X9.i(4)), new X9.i(5)));
        if (activity != null) {
            launchIntentForPackage = new Intent(context, activity.getClass());
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
            }
        }
        launchIntentForPackage.addFlags(268468224);
        this.red = launchIntentForPackage;
        this.teal = new ArrayList();
        this.silver = rVar.bravo.golf();
    }

    public /* synthetic */ ab(ViewGroup viewGroup, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i4) {
        this.alpha = i4;
        this.purple = obj;
        this.white = obj2;
        this.red = obj3;
        this.silver = obj4;
        this.teal = obj5;
    }

    public ab(CropImageActivity cropImageActivity, O7.j jVar) {
        this.alpha = 20;
        this.purple = jVar;
        String string = cropImageActivity.getString(R.string.pick_image_chooser_title);
        Intrinsics.delta(string, "activity.getString(R.str…pick_image_chooser_title)");
        this.white = string;
        this.red = CollectionsKt.listOf("com.google.android.apps.photos", "com.google.android.apps.photosgo", "com.sec.android.gallery3d", "com.oneplus.gallery", "com.miui.gallery");
        ah.b registerForActivityResult = cropImageActivity.registerForActivityResult(new a4.s(5), new a4.u(0, this));
        Intrinsics.delta(registerForActivityResult, "activity.registerForActi…k.onCancelled()\n    }\n  }");
        this.teal = registerForActivityResult;
    }

    public ab(Context context, InterfaceC3142e interfaceC3142e, C2275g c2275g) {
        this.alpha = 27;
        this.purple = context;
        this.white = interfaceC3142e;
        this.red = c2275g;
    }

    public ab(Map initialState) {
        this.alpha = 18;
        Intrinsics.echo(initialState, "initialState");
        this.purple = kotlin.collections.y.amber(initialState);
        this.white = new LinkedHashMap();
        this.red = new LinkedHashMap();
        this.silver = new LinkedHashMap();
        this.teal = new S1.a(0, this);
    }

    public ab(Layout layout) {
        this.alpha = 12;
        this.purple = layout;
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        do {
            int emerald = StringsKt.emerald(((Layout) this.purple).getText(), '\n', i4, 4);
            i4 = emerald < 0 ? ((Layout) this.purple).getText().length() : emerald + 1;
            arrayList.add(Integer.valueOf(i4));
        } while (i4 < ((Layout) this.purple).getText().length());
        this.white = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i5 = 0; i5 < size; i5++) {
            arrayList2.add(null);
        }
        this.red = arrayList2;
        this.silver = new boolean[((ArrayList) this.white).size()];
        ((ArrayList) this.white).size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ab(InterfaceC1772d viewModelClass, Function0 function0, Function0 function02, Function0 function03) {
        this.alpha = 23;
        Intrinsics.echo(viewModelClass, "viewModelClass");
        this.purple = viewModelClass;
        this.white = (Lambda) function0;
        this.red = function02;
        this.silver = (Lambda) function03;
    }

    public ab(I7.b bVar, I7.c cVar) {
        this.alpha = 16;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (I7.j jVar : bVar.charlie) {
            int i4 = jVar.charlie;
            boolean z2 = i4 == 0;
            int i5 = jVar.bravo;
            I7.p pVar = jVar.alpha;
            if (z2) {
                if (i5 == 2) {
                    hashSet4.add(pVar);
                } else {
                    hashSet.add(pVar);
                }
            } else if (i4 == 2) {
                hashSet3.add(pVar);
            } else if (i5 == 2) {
                hashSet5.add(pVar);
            } else {
                hashSet2.add(pVar);
            }
        }
        if (!bVar.golf.isEmpty()) {
            hashSet.add(I7.p.alpha(InterfaceC1696b.class));
        }
        this.purple = Collections.unmodifiableSet(hashSet);
        this.white = Collections.unmodifiableSet(hashSet2);
        this.red = Collections.unmodifiableSet(hashSet3);
        this.silver = Collections.unmodifiableSet(hashSet4);
        Collections.unmodifiableSet(hashSet5);
        this.teal = cVar;
    }

    public ab(LinearLayout linearLayout, LinearProgressIndicator linearProgressIndicator, ShapeableImageView shapeableImageView, TextView textView, TextView textView2) {
        this.alpha = 7;
        this.purple = linearLayout;
        this.white = linearProgressIndicator;
        this.teal = shapeableImageView;
        this.red = textView;
        this.silver = textView2;
    }

    public ab(FrameLayout frameLayout, MaterialButton materialButton, CardView cardView, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout) {
        this.alpha = 9;
        this.purple = frameLayout;
        this.red = materialButton;
        this.silver = cardView;
        this.white = recyclerView;
        this.teal = swipeRefreshLayout;
    }

    public ab(MaterialCardView materialCardView, LinearProgressIndicator linearProgressIndicator, TextView textView, TextView textView2, TextView textView3) {
        this.alpha = 8;
        this.purple = materialCardView;
        this.white = linearProgressIndicator;
        this.red = textView;
        this.silver = textView2;
        this.teal = textView3;
    }

    public ab(ConstraintLayout constraintLayout, ComposeView composeView, ComposeView composeView2, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, TabLayout tabLayout) {
        this.alpha = 5;
        this.purple = composeView;
        this.red = composeView2;
        this.white = recyclerView;
        this.silver = swipeRefreshLayout;
        this.teal = tabLayout;
    }

    public ab(SwipeRefreshLayout swipeRefreshLayout, MaterialButton materialButton, TextView textView, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout2) {
        this.alpha = 4;
        this.purple = swipeRefreshLayout;
        this.silver = materialButton;
        this.red = textView;
        this.white = recyclerView;
        this.teal = swipeRefreshLayout2;
    }

    public ab(D0.g gVar, D0.an anVar, List list, Q0.d dVar, H0.j jVar) {
        String str;
        int i4;
        String str2;
        ArrayList arrayList;
        int i5;
        int i10;
        int i11;
        D0.g gVar2 = gVar;
        D0.an anVar2 = anVar;
        final int i12 = 1;
        this.alpha = 11;
        final int i13 = 0;
        this.purple = gVar2;
        this.white = list;
        kotlin.i iVar = kotlin.i.purple;
        this.red = LazyKt.alpha(iVar, new Function0(this) { // from class: D0.p
            public final /* synthetic */ B9.ab purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj;
                float f5;
                Object obj2;
                float f10;
                switch (i13) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) this.purple.teal;
                        if (arrayList2.isEmpty()) {
                            obj = null;
                        } else {
                            Object obj3 = arrayList2.get(0);
                            float november = ((r) obj3).alpha.november();
                            int ivory = CollectionsKt.ivory(arrayList2);
                            int i14 = 1;
                            if (1 <= ivory) {
                                while (true) {
                                    Object obj4 = arrayList2.get(i14);
                                    float november2 = ((r) obj4).alpha.november();
                                    if (Float.compare(november, november2) < 0) {
                                        obj3 = obj4;
                                        november = november2;
                                    }
                                    if (i14 != ivory) {
                                        i14++;
                                    }
                                }
                            }
                            obj = obj3;
                        }
                        r rVar = (r) obj;
                        if (rVar != null) {
                            f5 = rVar.alpha.november();
                        } else {
                            f5 = 0.0f;
                        }
                        return Float.valueOf(f5);
                    default:
                        ArrayList arrayList3 = (ArrayList) this.purple.teal;
                        if (arrayList3.isEmpty()) {
                            obj2 = null;
                        } else {
                            Object obj5 = arrayList3.get(0);
                            float charlie = ((r) obj5).alpha.f1701b.charlie();
                            int ivory2 = CollectionsKt.ivory(arrayList3);
                            int i15 = 1;
                            if (1 <= ivory2) {
                                while (true) {
                                    Object obj6 = arrayList3.get(i15);
                                    float charlie2 = ((r) obj6).alpha.f1701b.charlie();
                                    if (Float.compare(charlie, charlie2) < 0) {
                                        obj5 = obj6;
                                        charlie = charlie2;
                                    }
                                    if (i15 != ivory2) {
                                        i15++;
                                    }
                                }
                            }
                            obj2 = obj5;
                        }
                        r rVar2 = (r) obj2;
                        if (rVar2 != null) {
                            f10 = rVar2.alpha.f1701b.charlie();
                        } else {
                            f10 = 0.0f;
                        }
                        return Float.valueOf(f10);
                }
            }
        });
        this.silver = LazyKt.alpha(iVar, new Function0(this) { // from class: D0.p
            public final /* synthetic */ B9.ab purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj;
                float f5;
                Object obj2;
                float f10;
                switch (i12) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) this.purple.teal;
                        if (arrayList2.isEmpty()) {
                            obj = null;
                        } else {
                            Object obj3 = arrayList2.get(0);
                            float november = ((r) obj3).alpha.november();
                            int ivory = CollectionsKt.ivory(arrayList2);
                            int i14 = 1;
                            if (1 <= ivory) {
                                while (true) {
                                    Object obj4 = arrayList2.get(i14);
                                    float november2 = ((r) obj4).alpha.november();
                                    if (Float.compare(november, november2) < 0) {
                                        obj3 = obj4;
                                        november = november2;
                                    }
                                    if (i14 != ivory) {
                                        i14++;
                                    }
                                }
                            }
                            obj = obj3;
                        }
                        r rVar = (r) obj;
                        if (rVar != null) {
                            f5 = rVar.alpha.november();
                        } else {
                            f5 = 0.0f;
                        }
                        return Float.valueOf(f5);
                    default:
                        ArrayList arrayList3 = (ArrayList) this.purple.teal;
                        if (arrayList3.isEmpty()) {
                            obj2 = null;
                        } else {
                            Object obj5 = arrayList3.get(0);
                            float charlie = ((r) obj5).alpha.f1701b.charlie();
                            int ivory2 = CollectionsKt.ivory(arrayList3);
                            int i15 = 1;
                            if (1 <= ivory2) {
                                while (true) {
                                    Object obj6 = arrayList3.get(i15);
                                    float charlie2 = ((r) obj6).alpha.f1701b.charlie();
                                    if (Float.compare(charlie, charlie2) < 0) {
                                        obj5 = obj6;
                                        charlie = charlie2;
                                    }
                                    if (i15 != ivory2) {
                                        i15++;
                                    }
                                }
                            }
                            obj2 = obj5;
                        }
                        r rVar2 = (r) obj2;
                        if (rVar2 != null) {
                            f10 = rVar2.alpha.f1701b.charlie();
                        } else {
                            f10 = 0.0f;
                        }
                        return Float.valueOf(f10);
                }
            }
        });
        D0.g gVar3 = D0.h.alpha;
        ArrayList arrayList2 = gVar2.silver;
        List emptyList = (arrayList2 == null || (emptyList = CollectionsKt.p(arrayList2, new D0.f(i12))) == null) ? CollectionsKt.emptyList() : emptyList;
        ArrayList arrayList3 = new ArrayList();
        kotlin.collections.l lVar = new kotlin.collections.l();
        int size = emptyList.size();
        int i14 = 0;
        int i15 = 0;
        while (true) {
            D0.t tVar = anVar2.bravo;
            if (i14 < size) {
                D0.e eVar = (D0.e) emptyList.get(i14);
                D0.e alpha = D0.e.alpha(eVar, tVar.alpha((D0.t) eVar.alpha), i13, 14);
                while (true) {
                    i11 = alpha.bravo;
                    if (i15 >= i11 || lVar.isEmpty()) {
                        break;
                    }
                    D0.e eVar2 = (D0.e) lVar.last();
                    int i16 = eVar2.charlie;
                    int i17 = i12;
                    Object obj = eVar2.alpha;
                    if (i11 < i16) {
                        arrayList3.add(new D0.e(obj, i15, i11));
                        i15 = i11;
                    } else {
                        arrayList3.add(new D0.e(obj, i15, i16));
                        while (true) {
                            boolean isEmpty = lVar.isEmpty();
                            i15 = eVar2.charlie;
                            if (!isEmpty && i15 == ((D0.e) lVar.last()).charlie) {
                                lVar.removeLast();
                            }
                        }
                    }
                    i12 = i17;
                }
                int i18 = i12;
                if (i15 < i11) {
                    arrayList3.add(new D0.e(tVar, i15, i11));
                    i15 = i11;
                }
                D0.e eVar3 = (D0.e) lVar.lima();
                Object obj2 = alpha.alpha;
                int i19 = alpha.charlie;
                if (eVar3 != null) {
                    int i20 = eVar3.charlie;
                    Object obj3 = eVar3.alpha;
                    int i21 = eVar3.bravo;
                    if (i21 == i11 && i20 == i19) {
                        lVar.removeLast();
                        lVar.addLast(new D0.e(((D0.t) obj3).alpha((D0.t) obj2), i11, i19));
                    } else if (i21 == i20) {
                        arrayList3.add(new D0.e(obj3, i21, i20));
                        lVar.removeLast();
                        lVar.addLast(new D0.e(obj2, i11, i19));
                    } else if (i20 >= i19) {
                        lVar.addLast(new D0.e(((D0.t) obj3).alpha((D0.t) obj2), i11, i19));
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    lVar.addLast(new D0.e(obj2, i11, i19));
                }
                i14++;
                i12 = i18;
                i13 = 0;
            } else {
                while (true) {
                    str = gVar2.purple;
                    if (i15 > str.length() || lVar.isEmpty()) {
                        break;
                    }
                    D0.e eVar4 = (D0.e) lVar.last();
                    Object obj4 = eVar4.alpha;
                    int i22 = eVar4.charlie;
                    arrayList3.add(new D0.e(obj4, i15, i22));
                    while (!lVar.isEmpty() && i22 == ((D0.e) lVar.last()).charlie) {
                        lVar.removeLast();
                    }
                    i15 = i22;
                }
                if (i15 < str.length()) {
                    arrayList3.add(new D0.e(tVar, i15, str.length()));
                }
                if (arrayList3.isEmpty()) {
                    i4 = 0;
                    arrayList3.add(new D0.e(tVar, 0, 0));
                } else {
                    i4 = 0;
                }
                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                int size2 = arrayList3.size();
                int i23 = i4;
                while (i23 < size2) {
                    D0.e eVar5 = (D0.e) arrayList3.get(i23);
                    int i24 = eVar5.bravo;
                    int i25 = eVar5.charlie;
                    if (i24 != i25) {
                        str2 = str.substring(i24, i25);
                        Intrinsics.delta(str2, "substring(...)");
                    } else {
                        str2 = "";
                    }
                    List alpha2 = D0.h.alpha(gVar2, i24, i25, new A4.a(21));
                    D0.g gVar4 = new D0.g(str2, alpha2 == null ? CollectionsKt.emptyList() : alpha2);
                    D0.t tVar2 = (D0.t) eVar5.alpha;
                    if (tVar2.bravo == Integer.MIN_VALUE) {
                        arrayList = arrayList3;
                        i5 = size2;
                        tVar2 = new D0.t(tVar2.alpha, tVar.bravo, tVar2.charlie, tVar2.delta, tVar2.echo, tVar2.foxtrot, tVar2.golf, tVar2.hotel, tVar2.india);
                    } else {
                        arrayList = arrayList3;
                        i5 = size2;
                    }
                    D0.an anVar3 = new D0.an(anVar2.alpha, tVar.alpha(tVar2));
                    List list2 = gVar4.alpha;
                    List emptyList2 = list2 == null ? CollectionsKt.emptyList() : list2;
                    List list3 = (List) this.white;
                    ArrayList arrayList5 = new ArrayList(list3.size());
                    int size3 = list3.size();
                    int i26 = 0;
                    while (true) {
                        i10 = eVar5.bravo;
                        if (i26 < size3) {
                            D0.e eVar6 = (D0.e) list3.get(i26);
                            String str3 = str;
                            int i27 = eVar6.bravo;
                            List list4 = list3;
                            int i28 = eVar6.charlie;
                            if (D0.h.bravo(i10, i25, i27, i28)) {
                                int i29 = eVar6.bravo;
                                if (i10 > i29 || i28 > i25) {
                                    J0.a.alpha("placeholder can not overlap with paragraph.");
                                }
                                arrayList5.add(new D0.e(eVar6.alpha, i29 - i10, i28 - i10));
                            }
                            i26++;
                            list3 = list4;
                            str = str3;
                        }
                    }
                    arrayList4.add(new D0.r(new L0.d(str2, anVar3, emptyList2, arrayList5, jVar, dVar), i10, i25));
                    i23++;
                    gVar2 = gVar;
                    anVar2 = anVar;
                    str = str;
                    arrayList3 = arrayList;
                    size2 = i5;
                }
                this.teal = arrayList4;
                return;
            }
        }
    }

    public ab(ConstraintLayout constraintLayout, TextInputLayout textInputLayout, ImageButton imageButton, MaterialButton materialButton, TextInputEditText textInputEditText) {
        this.alpha = 2;
        this.white = constraintLayout;
        this.red = textInputLayout;
        this.purple = imageButton;
        this.silver = materialButton;
        this.teal = textInputEditText;
    }

    public ab(ConstraintLayout constraintLayout, Button button, LinearLayout linearLayout, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, TextView textView) {
        this.alpha = 3;
        this.purple = button;
        this.silver = linearLayout;
        this.white = recyclerView;
        this.teal = swipeRefreshLayout;
        this.red = textView;
    }

    public ab(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.alpha = 26;
        this.silver = new ArrayDeque();
        this.purple = sharedPreferences;
        this.white = "topic_operation_queue";
        this.red = Constants.SEPARATOR_COMMA;
        this.teal = scheduledThreadPoolExecutor;
    }

    public ab(ConstraintLayout constraintLayout, ImageButton imageButton, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.alpha = 1;
        this.purple = imageButton;
        this.red = textView;
        this.silver = textView2;
        this.teal = textView3;
        this.white = textView4;
    }

    public ab() {
        this.alpha = 25;
        this.purple = new Object();
        this.white = new HashMap();
        this.red = new HashMap();
        this.silver = new ArrayDeque();
    }

    public ab(InterfaceC0525x interfaceC0525x, InterfaceC0525x interfaceC0525x2, bj.m mVar) {
        this.alpha = 24;
        this.white = interfaceC0525x;
        this.red = interfaceC0525x2;
        this.purple = mVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, J2.t] */
    public ab(Be.a aVar, Be.f typeParameterResolver, Lazy lazy) {
        this.alpha = 10;
        Intrinsics.echo(typeParameterResolver, "typeParameterResolver");
        this.purple = aVar;
        this.white = typeParameterResolver;
        this.red = lazy;
        this.silver = lazy;
        Intrinsics.echo(this, "c");
        Intrinsics.echo(typeParameterResolver, "typeParameterResolver");
        ?? obj = new Object();
        obj.alpha = this;
        obj.purple = typeParameterResolver;
        obj.red = new gd.a(new U8.a(2));
        this.teal = obj;
    }

    public ab(M2.b bVar) {
        this.alpha = 17;
        this.purple = CollectionsKt.B(bVar.alpha);
        this.white = CollectionsKt.B(bVar.bravo);
        this.red = CollectionsKt.B(bVar.charlie);
        this.silver = CollectionsKt.B(bVar.delta);
        this.teal = CollectionsKt.B(bVar.echo);
    }

    public ab(U7.c cVar, U7.c cVar2, Ne.f fVar, ArrayList arrayList) {
        this.alpha = 15;
        this.white = cVar;
        this.red = cVar2;
        this.silver = fVar;
        this.teal = arrayList;
        this.purple = cVar;
    }

    public ab(R2 r22, bz.I i4, C0797w c0797w, Function0 function0, int i5) {
        this.alpha = i5;
        switch (i5) {
            case 14:
                this.purple = r22;
                this.white = i4;
                this.red = c0797w;
                this.silver = function0;
                this.teal = new C0113h0(this, 1);
                return;
            default:
                this.purple = r22;
                this.white = i4;
                this.red = c0797w;
                this.silver = function0;
                this.teal = new C0113h0(this, 0);
                return;
        }
    }
}
