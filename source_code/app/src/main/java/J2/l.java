package J2;

import Nf.C0253k;
import Nf.L;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.core.C0496c;
import androidx.camera.core.C0497d;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.EnumC0524w;
import androidx.camera.core.impl.aa;
import androidx.compose.foundation.lazy.layout.ak;
import androidx.compose.foundation.lazy.layout.al;
import androidx.compose.runtime.t0;
import androidx.lifecycle.az;
import av.aj;
import b8.C0732b;
import be.InterfaceC0757c;
import bv.aw;
import bz.AbstractC0779d;
import bz.C0788m;
import bz.g0;
import c1.C0803b;
import c1.C0810i;
import c1.C0815n;
import com.SecurityGuardBrige.SmoothBlocade.Smooth$Close;
import com.app.network.network.models.Captain;
import com.app.network.network.models.UserInfo;
import com.app.network.network.models.WorkingStatus;
import com.app.network.network.models.captian.User;
import com.app.network.network.models.captian.UserMobile;
import com.bumptech.glide.load.resource.bitmap.w;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.network.api.CtApi;
import com.clevertap.android.sdk.variables.CTVariableUtils;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import ge.InterfaceC1772d;
import java.io.Closeable;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.collections.y;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.KSerializer;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParserException;
import r6.u;
import s6.N;
import s6.Q;
import s6.V4;
import t6.AbstractC3062u;
import t6.AbstractC3066u3;
import vf.Y;
import vf.ab;
import vf.ad;

/* loaded from: classes3.dex */
public class l implements L, R.k, G6.g, InterfaceC0757c, com.bumptech.glide.load.resource.bitmap.n {
    public Object alpha;
    public Object purple;

    public /* synthetic */ l(ViewGroup viewGroup, View view, View view2) {
        this.alpha = view;
        this.purple = view2;
    }

    @Override // R.k
    public Object alpha(R.b bVar, Object obj) {
        return ((Xd.l) this.alpha).invoke(bVar, obj);
    }

    @Override // be.InterfaceC0757c
    public void b(Throwable th) {
    }

    @Override // com.bumptech.glide.load.resource.bitmap.n
    public void bravo() {
        w wVar = (w) this.alpha;
        synchronized (wVar) {
            wVar.red = wVar.alpha.length;
        }
    }

    @Override // Nf.L
    public KSerializer charlie(InterfaceC1772d interfaceC1772d) {
        Object putIfAbsent;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.purple;
        Class bravo = AbstractC3062u.bravo(interfaceC1772d);
        Object obj = concurrentHashMap.get(bravo);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(bravo, (obj = new C0253k((KSerializer) ((Function1) this.alpha).invoke(interfaceC1772d))))) != null) {
            obj = putIfAbsent;
        }
        return ((C0253k) obj).alpha;
    }

    @Override // com.bumptech.glide.load.resource.bitmap.n
    public void delta(G3.b bVar, Bitmap bitmap) {
        IOException iOException = ((Y3.e) this.purple).purple;
        if (iOException != null) {
            if (bitmap != null) {
                bVar.delta(bitmap);
                throw iOException;
            }
            throw iOException;
        }
    }

    public synchronized void echo() {
        if (!((LinkedHashSet) this.alpha).isEmpty()) {
            ((F8.m) this.purple).echo(0L);
        }
    }

    public C0732b foxtrot() {
        Map unmodifiableMap;
        if (((HashMap) this.purple) == null) {
            unmodifiableMap = Collections.EMPTY_MAP;
        } else {
            unmodifiableMap = Collections.unmodifiableMap(new HashMap((HashMap) this.purple));
        }
        return new C0732b((String) this.alpha, unmodifiableMap);
    }

    public int golf(ArrayList arrayList, bd.h hVar, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.alpha).captureBurst(arrayList, new androidx.camera.camera2.internal.compat.e(hVar, captureCallback), (Handler) ((O7.j) this.purple).purple);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.List] */
    public ArrayList hotel() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        D8.c cVar = (D8.c) this.purple;
        Context context = (Context) this.alpha;
        Class cls = (Class) cVar.purple;
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) cls), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", cls + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new I7.d(0, (String) it.next()));
        }
        return arrayList2;
    }

    public LinkedHashSet india() {
        LinkedHashSet linkedHashSet;
        synchronized (this.alpha) {
            linkedHashSet = new LinkedHashSet(((LinkedHashMap) this.purple).values());
        }
        return linkedHashSet;
    }

    public String juliet(String str) {
        String str2 = (String) this.purple;
        Resources resources = (Resources) this.alpha;
        int identifier = resources.getIdentifier(str, CTVariableUtils.STRING, str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public void kilo(av.i iVar) {
        synchronized (this.alpha) {
            try {
                iVar.getClass();
                for (String str : new LinkedHashSet(iVar.foxtrot)) {
                    AbstractC3066u3.bravo("CameraRepository", "Added camera: " + str);
                    ((LinkedHashMap) this.purple).put(str, iVar.alpha(str));
                }
            } catch (CameraUnavailableException e) {
                throw new InitializationException(e);
            }
        }
    }

    public void lima(int i4, Bundle bundle) {
        M7.b bVar;
        Locale locale = Locale.US;
        String str = "Analytics listener received message. ID: " + i4 + ", Extras: " + bundle;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
        String string = bundle.getString("name");
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            if ("clx".equals(bundle2.getString("_o"))) {
                bVar = (t) this.alpha;
            } else {
                bVar = (Aa.m) this.purple;
            }
            if (bVar != null) {
                bVar.foxtrot(bundle2, string);
            }
        }
    }

    public void mike(UserInfo userInfo) {
        String str;
        String str2;
        String str3;
        Integer num;
        String str4;
        Boolean bool;
        Boolean bool2;
        User user;
        UserMobile userMobile;
        User user2;
        User user3;
        CleverTapAPI cleverTapAPI = (CleverTapAPI) this.purple;
        if (cleverTapAPI != null) {
            Captain captain = userInfo.getCaptain();
            WorkingStatus workingStatus = null;
            if (captain != null && (user3 = captain.getUser()) != null) {
                str = user3.getName();
            } else {
                str = null;
            }
            Pair pair = new Pair(Constants.KEY_ENCRYPTION_NAME, str);
            Captain captain2 = userInfo.getCaptain();
            if (captain2 != null && (user2 = captain2.getUser()) != null) {
                str2 = user2.getEmail();
            } else {
                str2 = null;
            }
            Pair pair2 = new Pair("Email", str2);
            Captain captain3 = userInfo.getCaptain();
            if (captain3 != null && (user = captain3.getUser()) != null && (userMobile = user.getUserMobile()) != null) {
                str3 = userMobile.getMobileNumber();
            } else {
                str3 = null;
            }
            Pair pair3 = new Pair("Phone", str3);
            Captain captain4 = userInfo.getCaptain();
            if (captain4 != null) {
                num = captain4.getId();
            } else {
                num = null;
            }
            Pair pair4 = new Pair("Identity", num);
            Captain captain5 = userInfo.getCaptain();
            if (captain5 != null) {
                str4 = captain5.getStatus();
            } else {
                str4 = null;
            }
            Pair pair5 = new Pair("status", str4);
            Captain captain6 = userInfo.getCaptain();
            if (captain6 != null) {
                bool = captain6.getSuspended();
            } else {
                bool = null;
            }
            Pair pair6 = new Pair("suspended", bool);
            Captain captain7 = userInfo.getCaptain();
            if (captain7 != null) {
                bool2 = captain7.getReadyToWork();
            } else {
                bool2 = null;
            }
            Pair pair7 = new Pair("readyToWork", bool2);
            Captain captain8 = userInfo.getCaptain();
            if (captain8 != null) {
                workingStatus = captain8.getWorkingStatus();
            }
            cleverTapAPI.onUserLogin(y.sierra(pair, pair2, pair3, pair4, pair5, pair6, pair7, new Pair("workingStatus", String.valueOf(workingStatus)), new Pair(CtApi.QUERY_PARAM_OS_KEY, Build.VERSION.RELEASE), new Pair("language", Locale.getDefault().getLanguage()), new Pair("appVersion", Smooth$Close.expectedVersionName), new Pair("deviceType", CtApi.DEFAULT_QUERY_PARAM_OS)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x022f, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void november(Context context, XmlResourceParser xmlResourceParser) {
        int i4;
        int eventType;
        C0810i c0810i;
        char c3;
        C0815n c0815n = new C0815n();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i5 = 0; i5 < attributeCount; i5++) {
            String attributeName = xmlResourceParser.getAttributeName(i5);
            String attributeValue = xmlResourceParser.getAttributeValue(i5);
            if (attributeName != null && attributeValue != null && Constants.KEY_ID.equals(attributeName)) {
                if (attributeValue.contains("/")) {
                    i4 = context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), Constants.KEY_ID, context.getPackageName());
                } else {
                    i4 = -1;
                }
                if (i4 == -1) {
                    if (attributeValue.length() > 1) {
                        i4 = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                try {
                    eventType = xmlResourceParser.getEventType();
                    c0810i = null;
                } catch (IOException e) {
                    Log.e("ConstraintSet", "Error parsing XML resource", e);
                } catch (XmlPullParserException e4) {
                    Log.e("ConstraintSet", "Error parsing XML resource", e4);
                }
                while (eventType != 1) {
                    if (eventType != 0) {
                        char c4 = 3;
                        if (eventType != 2) {
                            if (eventType == 3) {
                                String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                                switch (lowerCase.hashCode()) {
                                    case -2075718416:
                                        if (lowerCase.equals("guideline")) {
                                            c3 = 3;
                                            break;
                                        }
                                        break;
                                    case -190376483:
                                        if (lowerCase.equals("constraint")) {
                                            c3 = 1;
                                            break;
                                        }
                                        break;
                                    case 426575017:
                                        if (lowerCase.equals("constraintoverride")) {
                                            c3 = 2;
                                            break;
                                        }
                                        break;
                                    case 2146106725:
                                        if (lowerCase.equals("constraintset")) {
                                            c3 = 0;
                                            break;
                                        }
                                        break;
                                }
                                c3 = 65535;
                                if (c3 != 0) {
                                    if (c3 == 1 || c3 == 2 || c3 == 3) {
                                        c0815n.charlie.put(Integer.valueOf(c0810i.alpha), c0810i);
                                        c0810i = null;
                                    }
                                } else {
                                    ((SparseArray) this.purple).put(i4, c0815n);
                                    return;
                                }
                            }
                        } else {
                            String name = xmlResourceParser.getName();
                            switch (name.hashCode()) {
                                case -2025855158:
                                    if (name.equals("Layout")) {
                                        c4 = 6;
                                        break;
                                    }
                                    break;
                                case -1984451626:
                                    if (name.equals("Motion")) {
                                        c4 = 7;
                                        break;
                                    }
                                    break;
                                case -1962203927:
                                    if (name.equals("ConstraintOverride")) {
                                        c4 = 1;
                                        break;
                                    }
                                    break;
                                case -1269513683:
                                    if (name.equals("PropertySet")) {
                                        c4 = 4;
                                        break;
                                    }
                                    break;
                                case -1238332596:
                                    if (name.equals("Transform")) {
                                        c4 = 5;
                                        break;
                                    }
                                    break;
                                case -71750448:
                                    if (name.equals("Guideline")) {
                                        c4 = 2;
                                        break;
                                    }
                                    break;
                                case 366511058:
                                    if (name.equals("CustomMethod")) {
                                        c4 = '\t';
                                        break;
                                    }
                                    break;
                                case 1331510167:
                                    if (name.equals("Barrier")) {
                                        break;
                                    }
                                    break;
                                case 1791837707:
                                    if (name.equals("CustomAttribute")) {
                                        c4 = '\b';
                                        break;
                                    }
                                    break;
                                case 1803088381:
                                    if (name.equals("Constraint")) {
                                        c4 = 0;
                                        break;
                                    }
                                    break;
                            }
                            c4 = 65535;
                            switch (c4) {
                                case 0:
                                    c0810i = C0815n.delta(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    break;
                                case 1:
                                    c0810i = C0815n.delta(context, Xml.asAttributeSet(xmlResourceParser), true);
                                    break;
                                case 2:
                                    c0810i = C0815n.delta(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    c0810i.delta.alpha = true;
                                    break;
                                case 3:
                                    c0810i = C0815n.delta(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    c0810i.delta.yellow = 1;
                                    break;
                                case 4:
                                    if (c0810i != null) {
                                        c0810i.bravo.alpha(context, Xml.asAttributeSet(xmlResourceParser));
                                        break;
                                    } else {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                case 5:
                                    if (c0810i != null) {
                                        c0810i.echo.alpha(context, Xml.asAttributeSet(xmlResourceParser));
                                        break;
                                    } else {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                case 6:
                                    if (c0810i != null) {
                                        c0810i.delta.alpha(context, Xml.asAttributeSet(xmlResourceParser));
                                        break;
                                    } else {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                case 7:
                                    if (c0810i != null) {
                                        c0810i.charlie.alpha(context, Xml.asAttributeSet(xmlResourceParser));
                                        break;
                                    } else {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                case '\b':
                                case '\t':
                                    if (c0810i != null) {
                                        C0803b.alpha(context, xmlResourceParser, c0810i.foxtrot);
                                        break;
                                    } else {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                            }
                        }
                    } else {
                        xmlResourceParser.getName();
                    }
                    eventType = xmlResourceParser.next();
                }
                ((SparseArray) this.purple).put(i4, c0815n);
                return;
            }
        }
    }

    @Override // be.InterfaceC0757c
    public void onSuccess(Object obj) {
        ((av.s) this.purple).f3264f.remove((aj) this.alpha);
        int mike = av.q.mike(((av.s) this.purple).A);
        if (mike != 1 && mike != 4) {
            if (mike == 5 || (mike == 6 && ((av.s) this.purple).f3263d != 0)) {
                ((av.s) this.purple).uniform("Camera reopen required. Checking if the current camera can be closed safely.", null);
            } else {
                return;
            }
        }
        if (((av.s) this.purple).f3264f.isEmpty()) {
            av.s sVar = (av.s) this.purple;
            if (sVar.f3262c != null) {
                sVar.uniform("closing camera", null);
                ((av.s) this.purple).f3262c.close();
                ((av.s) this.purple).f3262c = null;
            }
        }
    }

    public void oscar(Class cls, Class cls2, Class cls3, List list) {
        synchronized (((bv.e) this.purple)) {
            ((bv.e) this.purple).put(new Y3.j(cls, cls2, cls3), list);
        }
    }

    public int papa(CaptureRequest captureRequest, bd.h hVar, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.alpha).setRepeatingRequest(captureRequest, new androidx.camera.camera2.internal.compat.e(hVar, captureCallback), (Handler) ((O7.j) this.purple).purple);
    }

    public void quebec(float f5, Q0.d dVar, ab abVar) {
        Function1 function1;
        if (f5 <= dVar.lavender(al.alpha)) {
            return;
        }
        S.g echo = u.echo();
        bz.r rVar = null;
        if (echo != null) {
            function1 = echo.echo();
        } else {
            function1 = null;
        }
        S.g foxtrot = u.foxtrot(echo);
        try {
            float floatValue = ((Number) ((t0) ((C0788m) this.purple).purple).getValue()).floatValue();
            Y y10 = (Y) this.alpha;
            if (y10 != null) {
                y10.foxtrot(null);
            }
            C0788m c0788m = (C0788m) this.purple;
            if (c0788m.white) {
                this.purple = AbstractC0779d.foxtrot(c0788m, floatValue - f5);
            } else {
                this.purple = new C0788m(AbstractC0779d.juliet, Float.valueOf(-f5), rVar, 60);
            }
            this.alpha = ad.zulu(abVar, null, null, new ak(this, null), 3);
            u.juliet(echo, foxtrot, function1);
        } catch (Throwable th) {
            u.juliet(echo, foxtrot, function1);
            throw th;
        }
    }

    public void romeo(EnumC0524w enumC0524w, C0497d c0497d) {
        C0496c c0496c;
        switch (enumC0524w) {
            case RELEASED:
            case CLOSED:
                c0496c = new C0496c(5, c0497d);
                break;
            case RELEASING:
            case CLOSING:
                c0496c = new C0496c(4, c0497d);
                break;
            case PENDING_OPEN:
                androidx.camera.core.impl.ab abVar = (androidx.camera.core.impl.ab) this.alpha;
                synchronized (abVar.bravo) {
                    Iterator it = abVar.echo.entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((aa) ((Map.Entry) it.next()).getValue()).alpha == EnumC0524w.CLOSING) {
                                c0496c = new C0496c(2, null);
                            }
                        } else {
                            c0496c = new C0496c(1, null);
                        }
                    }
                }
                break;
            case OPENING:
                c0496c = new C0496c(2, c0497d);
                break;
            case OPEN:
            case CONFIGURED:
                c0496c = new C0496c(3, c0497d);
                break;
            default:
                throw new IllegalStateException("Unknown internal camera state: " + enumC0524w);
        }
        AbstractC3066u3.bravo("CameraStateMachine", "New public camera state " + c0496c + " from " + enumC0524w + " and " + c0497d);
        if (!Objects.equals((C0496c) ((az) this.purple).getValue(), c0496c)) {
            AbstractC3066u3.bravo("CameraStateMachine", "Publishing new public camera state " + c0496c);
            ((az) this.purple).postValue(c0496c);
        }
    }

    public void sierra(N n5) {
        if (((HashMap) this.purple) == null) {
            this.purple = new HashMap();
        }
        ((HashMap) this.purple).put(Q.class, n5);
    }

    public void tango(Status status, boolean z2) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (((Map) this.alpha)) {
            hashMap = new HashMap((Map) this.alpha);
        }
        synchronized (((Map) this.purple)) {
            hashMap2 = new HashMap((Map) this.purple);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z2 || ((Boolean) entry.getValue()).booleanValue()) {
                entry.getKey().getClass();
                throw new ClassCastException();
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z2 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((G6.h) entry2.getKey()).charlie(new ApiException(status));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v8, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r2v1, types: [O7.l] */
    /* JADX WARN: Type inference failed for: r3v0, types: [long] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.Closeable] */
    @Override // G6.g
    public Task then(Object obj) {
        FileWriter fileWriter;
        ?? r10 = (JSONObject) ((P7.f) this.alpha).charlie.alpha.submit(new E8.g(4, this)).get();
        Closeable closeable = null;
        if (r10 != 0) {
            D5.s sVar = (D5.s) this.purple;
            W7.b f5 = ((O7.l) sVar.charlie).f(r10);
            ?? r32 = f5.charlie;
            O7.l lVar = (O7.l) sVar.echo;
            lVar.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                try {
                    try {
                        r10.put("expires_at", r32);
                        try {
                            fileWriter = new FileWriter((File) lVar.purple);
                        } catch (Exception e) {
                            e = e;
                            fileWriter = null;
                            Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                            r32 = fileWriter;
                            O7.f.bravo(r32, "Failed to close settings writer.");
                            D5.s.echo("Loaded settings: ", r10);
                            String str = ((W7.d) sVar.bravo).foxtrot;
                            SharedPreferences.Editor edit = ((Context) sVar.alpha).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                            edit.putString("existing_instance_identifier", str);
                            edit.apply();
                            ((AtomicReference) sVar.hotel).set(f5);
                            ((G6.h) ((AtomicReference) sVar.india).get()).delta(f5);
                            return V4.echo(null);
                        }
                    } catch (Throwable th) {
                        th = th;
                        O7.f.bravo(closeable, "Failed to close settings writer.");
                        throw th;
                    }
                } catch (Exception e4) {
                    e = e4;
                }
                try {
                    fileWriter.write(r10.toString());
                    fileWriter.flush();
                    r32 = fileWriter;
                } catch (Exception e5) {
                    e = e5;
                    Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                    r32 = fileWriter;
                    O7.f.bravo(r32, "Failed to close settings writer.");
                    D5.s.echo("Loaded settings: ", r10);
                    String str2 = ((W7.d) sVar.bravo).foxtrot;
                    SharedPreferences.Editor edit2 = ((Context) sVar.alpha).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                    edit2.putString("existing_instance_identifier", str2);
                    edit2.apply();
                    ((AtomicReference) sVar.hotel).set(f5);
                    ((G6.h) ((AtomicReference) sVar.india).get()).delta(f5);
                    return V4.echo(null);
                }
                O7.f.bravo(r32, "Failed to close settings writer.");
                D5.s.echo("Loaded settings: ", r10);
                String str22 = ((W7.d) sVar.bravo).foxtrot;
                SharedPreferences.Editor edit22 = ((Context) sVar.alpha).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                edit22.putString("existing_instance_identifier", str22);
                edit22.apply();
                ((AtomicReference) sVar.hotel).set(f5);
                ((G6.h) ((AtomicReference) sVar.india).get()).delta(f5);
            } catch (Throwable th2) {
                th = th2;
                closeable = r32;
                O7.f.bravo(closeable, "Failed to close settings writer.");
                throw th;
            }
        }
        return V4.echo(null);
    }

    public /* synthetic */ l(Object obj) {
        this.alpha = obj;
        this.purple = null;
    }

    public /* synthetic */ l(Object obj, Object obj2) {
        this.alpha = obj;
        this.purple = obj2;
    }

    public /* synthetic */ l(Object obj, Object obj2, boolean z2) {
        this.purple = obj;
        this.alpha = obj2;
    }

    public l(CameraCaptureSession cameraCaptureSession, O7.j jVar) {
        cameraCaptureSession.getClass();
        this.alpha = cameraCaptureSession;
        this.purple = jVar;
    }

    public l(Function1 function1) {
        this.alpha = function1;
        this.purple = new ConcurrentHashMap();
    }

    public l(int i4) {
        switch (i4) {
            case 13:
                this.alpha = new AtomicInteger();
                this.purple = new AtomicInteger();
                return;
            case 15:
                this.alpha = new AtomicReference();
                this.purple = new aw(0);
                return;
            case 16:
                this.alpha = Collections.synchronizedMap(new WeakHashMap());
                this.purple = Collections.synchronizedMap(new WeakHashMap());
                return;
            case 21:
                this.alpha = new Object();
                this.purple = new LinkedHashMap();
                new HashSet();
                return;
            case 22:
                g0 g0Var = AbstractC0779d.juliet;
                Float valueOf = Float.valueOf(0.0f);
                this.purple = new C0788m(g0Var, valueOf, (bz.r) g0Var.alpha.invoke(valueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
                return;
            default:
                this.alpha = new u(5);
                this.purple = new bv.w(16);
                return;
        }
    }
}
