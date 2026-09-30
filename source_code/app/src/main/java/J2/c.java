package J2;

import Fe.v;
import Ie.C0184d;
import Ie.C0185e;
import Ie.EnumC0183c;
import Nf.C0253k;
import Nf.C0259q;
import Nf.L;
import Nf.as;
import Se.u;
import Se.w;
import Se.x;
import Yb.C0333u0;
import Yb.C0336w;
import Yb.O0;
import a3.AbstractC0402a;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.Editable;
import android.util.Log;
import android.view.Choreographer;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ScrollView;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;
import androidx.camera.core.C0501h;
import androidx.camera.core.ProcessingException;
import androidx.camera.core.impl.C0509g;
import androidx.camera.core.impl.O;
import androidx.camera.core.impl.P;
import androidx.camera.core.impl.X;
import androidx.camera.core.impl.Z;
import androidx.compose.runtime.t0;
import androidx.fragment.app.ai;
import androidx.viewpager.widget.ViewPager;
import androidx.work.impl.WorkDatabase_Impl;
import ao.ad;
import av.ao;
import be.InterfaceC0757c;
import cf.AbstractC0846b;
import coil.memory.MemoryCache$Key;
import coil.request.NullRequestDataException;
import com.app.network.network.models.Order;
import com.app.network.network.models.OrderTask;
import com.google.android.gms.cloudmessaging.zzd;
import com.google.android.gms.tasks.Task;
import com.google.android.material.button.MaterialButton;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.orders.v2.ProcessOrderActivityV2;
import fe.C1713e;
import fe.C1714f;
import ge.InterfaceC1772d;
import id.C1915c;
import java.io.File;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.ae;
import kotlin.reflect.jvm.internal.impl.types.y;
import kotlinx.serialization.KSerializer;
import me.AbstractC2120h;
import pe.AbstractC2327c;
import pe.AbstractC2347w;
import pe.InterfaceC2330f;
import pe.InterfaceC2332h;
import pe.InterfaceC2349y;
import pe.an;
import qe.C2467c;
import s1.InterfaceC2587u;
import s1.a0;
import s1.au;
import s6.H0;
import s6.T7;
import s6.V4;
import se.C2859i;
import se.aq;
import t6.AbstractC3001h2;
import t6.AbstractC3062u;
import t6.AbstractC3066u3;
import t6.Z2;

/* loaded from: classes3.dex */
public final class c implements F0.d, L, G6.g, V2.f, InterfaceC2587u, InterfaceC0757c {
    public final /* synthetic */ int alpha;
    public Object purple;
    public final Object red;

    public /* synthetic */ c(int i4, Object obj, Object obj2) {
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T5.l, java.lang.Object] */
    public static T5.l hotel() {
        ?? obj = new Object();
        obj.delta = true;
        return obj;
    }

    public static X2.d november(X2.h hVar, Throwable th) {
        if (th instanceof NullRequestDataException) {
            hVar.zulu.getClass();
            X2.b bVar = a3.f.alpha;
            hVar.zulu.getClass();
        } else {
            hVar.zulu.getClass();
            X2.b bVar2 = a3.f.alpha;
        }
        return new X2.d(null, hVar, th);
    }

    @Override // V2.f
    public void alpha(int i4) {
        int i5;
        if (i4 >= 40) {
            ((V2.d) this.red).india(-1);
            return;
        }
        if (10 <= i4 && i4 < 20) {
            V2.d dVar = (V2.d) this.red;
            synchronized (dVar.charlie) {
                i5 = dVar.delta;
            }
            dVar.india(i5 / 2);
        }
    }

    public List amber(String workSpecId) {
        List delta;
        Intrinsics.echo(workSpecId, "workSpecId");
        synchronized (this.red) {
            delta = ((A2.h) this.purple).delta(workSpecId);
        }
        return delta;
    }

    public Se.g azure(y yVar, C0184d value, Ke.e nameResolver) {
        int i4;
        boolean z2;
        int collectionSizeOrDefault;
        Intrinsics.echo(value, "value");
        Intrinsics.echo(nameResolver, "nameResolver");
        boolean booleanValue = Ke.d.gray.echo(value.f1535f).booleanValue();
        EnumC0183c enumC0183c = value.red;
        if (enumC0183c == null) {
            i4 = -1;
        } else {
            i4 = AbstractC0846b.$EnumSwitchMapping$0[enumC0183c.ordinal()];
        }
        switch (i4) {
            case 1:
                byte b2 = (byte) value.silver;
                if (booleanValue) {
                    return new x(b2);
                }
                return new Se.d(b2);
            case 2:
                return new Se.g(Character.valueOf((char) value.silver));
            case 3:
                short s3 = (short) value.silver;
                if (booleanValue) {
                    return new x(s3);
                }
                return new u(s3);
            case 4:
                int i5 = (int) value.silver;
                if (booleanValue) {
                    return new x(i5);
                }
                return new Se.k(i5);
            case 5:
                long j5 = value.silver;
                if (booleanValue) {
                    return new x(j5);
                }
                return new Se.s(j5);
            case 6:
                return new Se.c(value.teal);
            case 7:
                return new Se.c(value.white);
            case 8:
                if (value.silver != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                return new Se.c(Boolean.valueOf(z2));
            case 9:
                return new Se.g(nameResolver.getString(value.yellow));
            case 10:
                return new Se.r(Zd.a.alpha(nameResolver, value.f1531a), value.e);
            case 11:
                return new Se.i(Zd.a.alpha(nameResolver, value.f1531a), Zd.a.bravo(nameResolver, value.f1532b));
            case 12:
                Ie.g gVar = value.f1533c;
                Intrinsics.delta(gVar, "value.annotation");
                return new Se.g(lima(gVar, nameResolver));
            case 13:
                List<C0184d> list = value.f1534d;
                Intrinsics.delta(list, "value.arrayElementList");
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                for (C0184d it : list) {
                    ae echo = ((InterfaceC2349y) this.purple).juliet().echo();
                    Intrinsics.delta(it, "it");
                    arrayList.add(azure(echo, it, nameResolver));
                }
                return new w(arrayList, yVar);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + value.red + " (expected " + yVar + ')').toString());
        }
    }

    @Override // be.InterfaceC0757c
    public void b(Throwable th) {
        switch (this.alpha) {
            case 24:
                int i4 = ((bj.k) this.purple).foxtrot;
                if (i4 == 2 && (th instanceof CancellationException)) {
                    AbstractC3066u3.bravo("SurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                    return;
                }
                AbstractC3066u3.juliet("SurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + x6.l.bravo(i4), th);
                return;
            default:
                throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th);
        }
    }

    public B2.l beige(j jVar) {
        B2.l echo;
        synchronized (this.red) {
            echo = ((A2.h) this.purple).echo(jVar);
        }
        return echo;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public X2.k black(X2.k kVar) {
        boolean z2;
        boolean z10;
        Bitmap.Config config = kVar.bravo;
        X2.a aVar = kVar.oscar;
        boolean z11 = true;
        if (Z2.charlie(config) && !((a3.j) this.red).alpha()) {
            config = Bitmap.Config.ARGB_8888;
            z2 = true;
        } else {
            z2 = false;
        }
        Bitmap.Config config2 = config;
        if (kVar.oscar.alpha) {
            a3.n nVar = (a3.n) this.purple;
            synchronized (nVar) {
                nVar.alpha();
                z10 = nVar.teal;
            }
            if (!z10) {
                aVar = X2.a.silver;
                X2.a aVar2 = aVar;
                if (z11) {
                    return kVar;
                }
                return new X2.k(kVar.alpha, config2, kVar.charlie, kVar.delta, kVar.echo, kVar.foxtrot, kVar.golf, kVar.hotel, kVar.india, kVar.juliet, kVar.kilo, kVar.lima, kVar.mike, kVar.november, aVar2);
            }
        }
        z11 = z2;
        X2.a aVar22 = aVar;
        if (z11) {
        }
    }

    public void blue(String str, P p4, Z z2, C0509g c0509g, List list) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.red;
        if (!linkedHashMap.containsKey(str)) {
            return;
        }
        X x4 = new X(p4, z2, c0509g, list);
        X x5 = (X) linkedHashMap.get(str);
        x4.echo = x5.echo;
        x4.foxtrot = x5.foxtrot;
        linkedHashMap.put(str, x4);
    }

    @Override // V2.f
    public void bravo(MemoryCache$Key memoryCache$Key, Bitmap bitmap, Map map) {
        int i4;
        int bravo = Z2.bravo(bitmap);
        V2.d dVar = (V2.d) this.red;
        synchronized (dVar.charlie) {
            i4 = dVar.alpha;
        }
        if (bravo <= i4) {
            ((V2.d) this.red).delta(memoryCache$Key, new V2.c(bitmap, map, bravo));
        } else {
            ((V2.d) this.red).echo(memoryCache$Key);
            ((Fe.c) this.purple).kilo(memoryCache$Key, bitmap, map, bravo);
        }
    }

    public i bronze(Ne.f name, String str) {
        Intrinsics.echo(name, "name");
        String bravo = name.bravo();
        Intrinsics.delta(bravo, "name.asString()");
        return new i(this, new Ge.o(bravo.concat(str)));
    }

    @Override // Nf.L
    public KSerializer charlie(InterfaceC1772d interfaceC1772d) {
        Object obj;
        obj = ((C0259q) this.red).get(AbstractC3062u.bravo(interfaceC1772d));
        Intrinsics.delta(obj, "get(...)");
        as asVar = (as) obj;
        Object obj2 = asVar.alpha.get();
        if (obj2 == null) {
            synchronized (asVar) {
                obj2 = asVar.alpha.get();
                if (obj2 == null) {
                    obj2 = new C0253k((KSerializer) ((Function1) this.purple).invoke(interfaceC1772d));
                    asVar.alpha = new SoftReference(obj2);
                }
            }
        }
        return ((C0253k) obj2).alpha;
    }

    @Override // F0.d
    public int delta(int i4) {
        CharSequence charSequence;
        do {
            i4 = ((F0.e) this.red).sierra(i4);
            if (i4 != -1) {
                charSequence = (CharSequence) this.purple;
                if (i4 == charSequence.length()) {
                }
            }
            return -1;
        } while (Character.isWhitespace(charSequence.charAt(i4)));
        return i4;
    }

    @Override // F0.d
    public int echo(int i4) {
        do {
            i4 = ((F0.e) this.red).tango(i4);
            if (i4 == -1 || i4 == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.purple).charAt(i4 - 1)));
        return i4;
    }

    @Override // F0.d
    public int foxtrot(int i4) {
        do {
            i4 = ((F0.e) this.red).tango(i4);
            if (i4 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.purple).charAt(i4)));
        return i4;
    }

    @Override // s1.InterfaceC2587u
    public a0 gold(View view, a0 a0Var) {
        a0 india = au.india(view, a0Var);
        if (india.alpha.oscar()) {
            return india;
        }
        int bravo = india.bravo();
        Rect rect = (Rect) this.purple;
        rect.left = bravo;
        rect.top = india.delta();
        rect.right = india.charlie();
        rect.bottom = india.alpha();
        ViewPager viewPager = (ViewPager) this.red;
        int childCount = viewPager.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            a0 bravo2 = au.bravo(viewPager.getChildAt(i4), india);
            rect.left = Math.min(bravo2.bravo(), rect.left);
            rect.top = Math.min(bravo2.delta(), rect.top);
            rect.right = Math.min(bravo2.charlie(), rect.right);
            rect.bottom = Math.min(bravo2.alpha(), rect.bottom);
        }
        return india.foxtrot(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // F0.d
    public int golf(int i4) {
        do {
            i4 = ((F0.e) this.red).sierra(i4);
            if (i4 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.purple).charAt(i4 - 1)));
        return i4;
    }

    public String india(E3.f fVar) {
        String str;
        H3.f fVar2 = (H3.f) ((t) this.red).charlie();
        try {
            fVar.alpha(fVar2.alpha);
            byte[] digest = fVar2.alpha.digest();
            char[] cArr = Y3.l.bravo;
            synchronized (cArr) {
                for (int i4 = 0; i4 < digest.length; i4++) {
                    byte b2 = digest[i4];
                    int i5 = i4 * 2;
                    char[] cArr2 = Y3.l.alpha;
                    cArr[i5] = cArr2[(b2 & 255) >>> 4];
                    cArr[i5 + 1] = cArr2[b2 & 15];
                }
                str = new String(cArr);
            }
            return str;
        } finally {
            ((t) this.red).alpha(fVar2);
        }
    }

    public void juliet() {
        C1915c c1915c = (C1915c) this.purple;
        if (c1915c != null) {
            ((AtomicBoolean) c1915c.red).set(true);
            ((ScheduledFuture) c1915c.purple).cancel(true);
        }
        this.purple = null;
    }

    public boolean kilo(j jVar) {
        boolean containsKey;
        synchronized (this.red) {
            containsKey = ((A2.h) this.purple).alpha.containsKey(jVar);
        }
        return containsKey;
    }

    @Override // V2.f
    public V2.a lavender(MemoryCache$Key memoryCache$Key) {
        V2.c cVar = (V2.c) ((V2.d) this.red).charlie(memoryCache$Key);
        if (cVar != null) {
            return new V2.a(cVar.alpha, cVar.bravo);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.Pair] */
    public C2467c lima(Ie.g proto, Ke.e nameResolver) {
        int collectionSizeOrDefault;
        Intrinsics.echo(proto, "proto");
        Intrinsics.echo(nameResolver, "nameResolver");
        InterfaceC2330f foxtrot = AbstractC2347w.foxtrot((InterfaceC2349y) this.purple, Zd.a.alpha(nameResolver, proto.red), (i) this.red);
        Map map = kotlin.collections.t.alpha;
        if (proto.silver.size() != 0 && !hf.i.foxtrot(foxtrot) && Qe.e.november(foxtrot, 5)) {
            Collection xray = foxtrot.xray();
            Intrinsics.delta(xray, "annotationClass.constructors");
            C2859i c2859i = (C2859i) CollectionsKt.l(xray);
            if (c2859i != null) {
                List peach = c2859i.peach();
                Intrinsics.delta(peach, "constructor.valueParameters");
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(peach, 10);
                int quebec = kotlin.collections.y.quebec(collectionSizeOrDefault);
                if (quebec < 16) {
                    quebec = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(quebec);
                for (Object obj : peach) {
                    linkedHashMap.put(((aq) obj).getName(), obj);
                }
                List<C0185e> list = proto.silver;
                Intrinsics.delta(list, "proto.argumentList");
                ArrayList arrayList = new ArrayList();
                for (C0185e it : list) {
                    Intrinsics.delta(it, "it");
                    aq aqVar = (aq) linkedHashMap.get(Zd.a.bravo(nameResolver, it.red));
                    Se.g gVar = null;
                    if (aqVar != null) {
                        Ne.f bravo = Zd.a.bravo(nameResolver, it.red);
                        y type = aqVar.getType();
                        Intrinsics.delta(type, "parameter.type");
                        C0184d c0184d = it.silver;
                        Intrinsics.delta(c0184d, "proto.value");
                        Se.g azure = azure(type, c0184d, nameResolver);
                        if (mike(azure, type, c0184d)) {
                            gVar = azure;
                        }
                        if (gVar == null) {
                            String message = "Unexpected argument value: actual type " + c0184d.red + " != expected type " + type;
                            Intrinsics.echo(message, "message");
                            gVar = new Se.j(message);
                        }
                        gVar = new Pair(bravo, gVar);
                    }
                    if (gVar != null) {
                        arrayList.add(gVar);
                    }
                }
                map = kotlin.collections.y.yankee(arrayList);
            }
        }
        return new C2467c(foxtrot.oscar(), map, an.magenta);
    }

    public boolean mike(Se.g gVar, y yVar, C0184d c0184d) {
        int i4;
        InterfaceC2330f interfaceC2330f;
        EnumC0183c enumC0183c = c0184d.red;
        if (enumC0183c == null) {
            i4 = -1;
        } else {
            i4 = AbstractC0846b.$EnumSwitchMapping$0[enumC0183c.ordinal()];
        }
        if (i4 != 10) {
            InterfaceC2349y interfaceC2349y = (InterfaceC2349y) this.purple;
            if (i4 != 13) {
                return Intrinsics.areEqual(gVar.alpha(interfaceC2349y), yVar);
            }
            if (gVar instanceof Se.b) {
                Se.b bVar = (Se.b) gVar;
                if (((List) bVar.alpha).size() == c0184d.f1534d.size()) {
                    y foxtrot = interfaceC2349y.juliet().foxtrot(yVar);
                    Collection collection = (Collection) bVar.alpha;
                    Intrinsics.echo(collection, "<this>");
                    Iterable c1713e = new C1713e(0, collection.size() - 1, 1);
                    if (!(c1713e instanceof Collection) || !((Collection) c1713e).isEmpty()) {
                        Iterator it = c1713e.iterator();
                        while (((C1714f) it).red) {
                            int alpha = ((kotlin.collections.x) it).alpha();
                            Se.g gVar2 = (Se.g) ((List) bVar.alpha).get(alpha);
                            C0184d c0184d2 = (C0184d) c0184d.f1534d.get(alpha);
                            Intrinsics.delta(c0184d2, "value.getArrayElement(i)");
                            if (!mike(gVar2, foxtrot, c0184d2)) {
                                return false;
                            }
                        }
                    }
                    return true;
                }
            }
            throw new IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + gVar).toString());
        }
        InterfaceC2332h kilo = yVar.green().kilo();
        if (kilo instanceof InterfaceC2330f) {
            interfaceC2330f = (InterfaceC2330f) kilo;
        } else {
            interfaceC2330f = null;
        }
        if (interfaceC2330f != null) {
            Ne.f fVar = AbstractC2120h.echo;
            if (!AbstractC2120h.bravo(interfaceC2330f, me.m.ivory)) {
                return false;
            }
        }
        return true;
    }

    @Override // be.InterfaceC0757c
    public void onSuccess(Object obj) {
        boolean z2;
        switch (this.alpha) {
            case 24:
                bj.l lVar = (bj.l) obj;
                lVar.getClass();
                try {
                    ((bj.c) ((t) this.red).alpha).bravo(lVar);
                    return;
                } catch (ProcessingException e) {
                    AbstractC3066u3.delta("SurfaceProcessorNode", "Failed to send SurfaceOutput to SurfaceProcessor.", e);
                    return;
                }
            default:
                if (((C0501h) obj).alpha != 3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                T7.golf("Unexpected result from SurfaceRequest. Surface was provided twice.", z2);
                AbstractC3066u3.bravo("TextureViewImpl", "SurfaceTexture about to manually be destroyed");
                ((SurfaceTexture) this.purple).release();
                bp.r rVar = ((bp.q) this.red).alpha;
                if (rVar.juliet != null) {
                    rVar.juliet = null;
                    return;
                }
                return;
        }
    }

    public void oscar(String str, Function1 function1) {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        LinkedHashMap linkedHashMap = ((Fe.t) this.red).alpha;
        Fe.s sVar = new Fe.s(this, str);
        function1.invoke(sVar);
        ArrayList arrayList = sVar.bravo;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) ((Pair) it.next()).getFirst());
        }
        String ret = (String) sVar.charlie.getFirst();
        String str2 = sVar.alpha;
        Intrinsics.echo(ret, "ret");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append('(');
        sb2.append(CollectionsKt.maroon(arrayList2, "", null, null, Ge.p.alpha, 30));
        sb2.append(')');
        if (ret.length() > 1) {
            ret = AbstractC2327c.victor(';', "L", ret);
        }
        sb2.append(ret);
        String jvmDescriptor = sb2.toString();
        String internalName = (String) this.purple;
        Intrinsics.echo(internalName, "internalName");
        Intrinsics.echo(jvmDescriptor, "jvmDescriptor");
        String str3 = internalName + '.' + jvmDescriptor;
        v vVar = (v) sVar.charlie.getSecond();
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault2);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add((v) ((Pair) it2.next()).getSecond());
        }
        Pair pair = new Pair(str3, new Fe.n(vVar, arrayList3));
        linkedHashMap.put(pair.getFirst(), pair.getSecond());
    }

    public O papa() {
        O o5 = new O();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.red).entrySet()) {
            X x4 = (X) entry.getValue();
            if (x4.echo) {
                o5.alpha(x4.alpha);
                arrayList.add((String) entry.getKey());
            }
        }
        AbstractC3066u3.bravo("UseCaseAttachState", "All use case: " + arrayList + " for camera: " + ((String) this.purple));
        return o5;
    }

    public Collection quebec() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.red).entrySet()) {
            if (((X) entry.getValue()).echo) {
                arrayList.add(((X) entry.getValue()).alpha);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    public Collection romeo() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.red).entrySet()) {
            if (((X) entry.getValue()).echo) {
                arrayList.add(((X) entry.getValue()).bravo);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    public ArrayList sierra(String str) {
        l2.p foxtrot = l2.p.foxtrot(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        foxtrot.oscar(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.purple;
        workDatabase_Impl.bravo();
        Cursor mike = workDatabase_Impl.mike(foxtrot);
        try {
            ArrayList arrayList = new ArrayList(mike.getCount());
            while (mike.moveToNext()) {
                arrayList.add(mike.getString(0));
            }
            return arrayList;
        } finally {
            mike.close();
            foxtrot.golf();
        }
    }

    public String tango(E3.f fVar) {
        String str;
        synchronized (((B8.h) this.purple)) {
            str = (String) ((B8.h) this.purple).alpha(fVar);
        }
        if (str == null) {
            str = india(fVar);
        }
        synchronized (((B8.h) this.purple)) {
            ((B8.h) this.purple).foxtrot(fVar, str);
        }
        return str;
    }

    @Override // G6.g
    public Task then(Object obj) {
        Boolean bool = (Boolean) obj;
        boolean booleanValue = bool.booleanValue();
        O7.n nVar = (O7.n) this.red;
        if (!booleanValue) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
            }
            Iterator it = U7.c.india(((File) nVar.golf.red).listFiles(O7.n.romeo)).iterator();
            while (it.hasNext()) {
                ((File) it.next()).delete();
            }
            U7.c cVar = ((U7.a) nVar.mike.alpha).bravo;
            U7.a.alpha(U7.c.india(((File) cVar.teal).listFiles()));
            U7.a.alpha(U7.c.india(((File) cVar.white).listFiles()));
            U7.a.alpha(U7.c.india(((File) cVar.yellow).listFiles()));
            nVar.quebec.delta(null);
            return V4.echo(null);
        }
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
        }
        boolean booleanValue2 = bool.booleanValue();
        O7.u uVar = nVar.bravo;
        if (booleanValue2) {
            ((G6.h) uVar.echo).delta(null);
            return ((G6.q) this.purple).november(nVar.echo.alpha, new O7.l(0, this));
        }
        uVar.getClass();
        throw new IllegalStateException("An invalid data collection token was used.");
    }

    public String toString() {
        switch (this.alpha) {
            case 16:
                String str = "[ ";
                if (((W0.f) this.purple) != null) {
                    for (int i4 = 0; i4 < 9; i4++) {
                        StringBuilder tango = Q0.c.tango(str);
                        tango.append(((W0.f) this.purple).f2189a[i4]);
                        tango.append(" ");
                        str = tango.toString();
                    }
                }
                StringBuilder beige = ad.beige(str, "] ");
                beige.append((W0.f) this.purple);
                return beige.toString();
            default:
                return super.toString();
        }
    }

    public boolean uniform() {
        return ((C0333u0) this.purple).alpha.isDestroyed();
    }

    public boolean victor() {
        return ((C0333u0) this.purple).alpha.isFinishing();
    }

    public boolean whiskey(String str) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.red;
        if (!linkedHashMap.containsKey(str)) {
            return false;
        }
        return ((X) linkedHashMap.get(str)).echo;
    }

    public void xray(File compressedFile, OrderTask task) {
        Object obj;
        Object obj2;
        Intrinsics.echo(compressedFile, "compressedFile");
        Intrinsics.echo(task, "task");
        ProcessOrderActivityV2 processOrderActivityV2 = (ProcessOrderActivityV2) this.red;
        String str = processOrderActivityV2.f12420k0;
        if (str != null) {
            String absolutePath = compressedFile.getAbsolutePath();
            Intrinsics.delta(absolutePath, "getAbsolutePath(...)");
            AtomicInteger atomicInteger = L9.d.alpha;
            L9.k.golf(processOrderActivityV2).edit().putString(str, absolutePath).apply();
        }
        t0 t0Var = (t0) processOrderActivityV2.f12428s0;
        t0Var.setValue(Integer.valueOf(((Number) t0Var.getValue()).intValue() + 1));
        List foxtrot = processOrderActivityV2.getSupportFragmentManager().charlie.foxtrot();
        Intrinsics.delta(foxtrot, "getFragments(...)");
        Iterator it = foxtrot.iterator();
        while (true) {
            obj = null;
            if (it.hasNext()) {
                obj2 = it.next();
                if (((ai) obj2) instanceof O0) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        ai aiVar = (ai) obj2;
        if (aiVar != null) {
            ((O0) aiVar).coral();
        }
        List foxtrot2 = processOrderActivityV2.getSupportFragmentManager().charlie.foxtrot();
        Intrinsics.delta(foxtrot2, "getFragments(...)");
        Iterator it2 = foxtrot2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((ai) next) instanceof C0336w) {
                obj = next;
                break;
            }
        }
        ai aiVar2 = (ai) obj;
        if (aiVar2 != null) {
            ((C0336w) aiVar2).crimson();
        }
        String string = processOrderActivityV2.getString(R.string.invoice_attached);
        Intrinsics.delta(string, "getString(...)");
        L9.d.pink(((C0333u0) this.purple).alpha, string);
        Order order = processOrderActivityV2.f12418i0;
        if (order != null && H0.charlie(order, task)) {
            ((t0) processOrderActivityV2.f12380B0).setValue(Boolean.TRUE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0039, code lost:
    
        if (((a3.j) r17.red).bravo(r19) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public X2.k yankee(X2.h hVar, Y2.h hVar2) {
        AbstractC3001h2 abstractC3001h2;
        Y2.b bVar;
        Y2.g gVar;
        boolean z2;
        boolean isEmpty = hVar.foxtrot.isEmpty();
        Bitmap.Config config = hVar.delta;
        if (isEmpty || ArraysKt.whiskey(a3.h.alpha, config)) {
            if (Z2.charlie(config)) {
                if (!Z2.charlie(config) || hVar.kilo) {
                }
            }
            abstractC3001h2 = hVar2.alpha;
            bVar = Y2.b.alpha;
            if (Intrinsics.areEqual(abstractC3001h2, bVar) && !Intrinsics.areEqual(hVar2.bravo, bVar)) {
                gVar = hVar.whiskey;
            } else {
                gVar = Y2.g.purple;
            }
            Y2.g gVar2 = gVar;
            if (!hVar.lima && hVar.foxtrot.isEmpty() && config != Bitmap.Config.ALPHA_8) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z10 = z2;
            return new X2.k(hVar.alpha, config, null, hVar2, gVar2, a3.f.alpha(hVar), z10, hVar.mike, null, hVar.hotel, hVar.india, hVar.xray, hVar.november, hVar.oscar, hVar.papa);
        }
        config = Bitmap.Config.ARGB_8888;
        abstractC3001h2 = hVar2.alpha;
        bVar = Y2.b.alpha;
        if (Intrinsics.areEqual(abstractC3001h2, bVar)) {
        }
        gVar = Y2.g.purple;
        Y2.g gVar22 = gVar;
        if (!hVar.lima) {
        }
        z2 = false;
        boolean z102 = z2;
        return new X2.k(hVar.alpha, config, null, hVar2, gVar22, a3.f.alpha(hVar), z102, hVar.mike, null, hVar.hotel, hVar.india, hVar.xray, hVar.november, hVar.oscar, hVar.papa);
    }

    public B2.l zulu(j id2) {
        B2.l charlie;
        Intrinsics.echo(id2, "id");
        synchronized (this.red) {
            charlie = ((A2.h) this.purple).charlie(id2);
        }
        return charlie;
    }

    public /* synthetic */ c(int i4, Object obj, Object obj2, boolean z2) {
        this.alpha = i4;
        this.red = obj;
        this.purple = obj2;
    }

    public c(IBinder iBinder) {
        this.alpha = 13;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.purple = new Messenger(iBinder);
            this.red = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.red = new zzd(iBinder);
            this.purple = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    public c(int i4) {
        this.alpha = i4;
        switch (i4) {
            case 8:
                this.purple = Choreographer.getInstance();
                this.red = Looper.myLooper();
                return;
            case 28:
                this.purple = new Rect();
                this.red = new Rect();
                return;
            case 29:
                this.purple = new n0.c(0);
                this.red = new n0.c(0);
                return;
            default:
                this.purple = new B8.h(1000L);
                this.red = Z3.d.alpha(10, new r6.u(4));
                return;
        }
    }

    public c(M2.k kVar, a3.n nVar) {
        Object lVar;
        this.alpha = 17;
        this.purple = nVar;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 26) {
            boolean z2 = AbstractC0402a.alpha;
        } else if (!AbstractC0402a.alpha) {
            if (i4 != 26 && i4 != 27) {
                lVar = new a3.l(true);
            } else {
                lVar = new Object();
            }
            this.red = lVar;
        }
        lVar = new a3.l(false);
        this.red = lVar;
    }

    public c(WorkDatabase_Impl workDatabase_Impl) {
        this.alpha = 0;
        this.purple = workDatabase_Impl;
        this.red = new b(workDatabase_Impl, 0);
    }

    public c(InterfaceC2349y module, i notFoundClasses) {
        this.alpha = 26;
        Intrinsics.echo(module, "module");
        Intrinsics.echo(notFoundClasses, "notFoundClasses");
        this.purple = module;
        this.red = notFoundClasses;
    }

    public c(W0.e eVar) {
        this.alpha = 16;
        this.red = eVar;
    }

    public c(ScrollView scrollView, ImageButton imageButton, MaterialButton materialButton) {
        this.alpha = 2;
        this.purple = imageButton;
        this.red = materialButton;
    }

    public c(String str, int i4) {
        this.alpha = i4;
        switch (i4) {
            case 23:
                this.purple = (ExtraSupportedOutputSizeQuirk) ax.b.alpha.delta(ExtraSupportedOutputSizeQuirk.class);
                this.red = new K1.r(str, 1);
                return;
            default:
                this.red = new LinkedHashMap();
                this.purple = str;
                return;
        }
    }

    public c(Function1 function1) {
        this.alpha = 10;
        this.purple = function1;
        this.red = new C0259q();
    }

    public c(int i4, Fe.c cVar) {
        this.alpha = 15;
        this.purple = cVar;
        this.red = new V2.d(i4, this);
    }

    public c(A2.h hVar) {
        this.alpha = 1;
        this.purple = hVar;
        this.red = new Object();
    }

    public c(ao aoVar, HashMap hashMap, HashMap hashMap2) {
        this.alpha = 6;
        this.purple = aoVar;
        this.red = hashMap;
    }

    public c(Handler handler) {
        this.alpha = 19;
        this.purple = new HashMap();
        this.red = handler;
    }

    public c(Fe.t tVar, String className) {
        this.alpha = 5;
        Intrinsics.echo(className, "className");
        this.red = tVar;
        this.purple = className;
    }

    public c(ProcessOrderActivityV2 processOrderActivityV2) {
        this.alpha = 18;
        this.red = processOrderActivityV2;
        this.purple = processOrderActivityV2.f12404U;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.text.Editable$Factory, L1.a] */
    public c(EditText editText) {
        this.alpha = 9;
        this.purple = editText;
        L1.i iVar = new L1.i(editText);
        this.red = iVar;
        editText.addTextChangedListener(iVar);
        if (L1.a.bravo == null) {
            synchronized (L1.a.alpha) {
                try {
                    if (L1.a.bravo == null) {
                        ?? factory = new Editable.Factory();
                        try {
                            L1.a.charlie = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, L1.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        L1.a.bravo = factory;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(L1.a.bravo);
    }

    public c(ViewPager viewPager) {
        this.alpha = 21;
        this.red = viewPager;
        this.purple = new Rect();
    }

    public c(av.s sVar) {
        this.alpha = 22;
        this.red = sVar;
        this.purple = null;
    }
}
