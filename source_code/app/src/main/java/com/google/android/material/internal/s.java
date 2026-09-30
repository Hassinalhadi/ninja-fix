package com.google.android.material.internal;

import V5.ak;
import android.content.ClipData;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.Rect;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContentInfo;
import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import av.ah;
import com.clevertap.android.sdk.db.Column;
import com.clevertap.android.sdk.variables.CTVariableUtils;
import com.google.android.gms.internal.measurement.C1290a1;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.measurement.internal.C1477x;
import com.google.android.gms.tasks.Task;
import com.google.android.material.navigation.NavigationView;
import delivery.samurai.android.ui.agreement.AgreementFragment;
import delivery.samurai.android.ui.areasV2.AreaListingActivityV2;
import delivery.samurai.android.ui.assets.AssetsListActivity;
import delivery.samurai.android.ui.auth.signin.presentation.SignInActivity;
import g.C1718a;
import g7.C1756b;
import i7.AbstractC1900f;
import j1.C1929c;
import j9.InterfaceC1954a;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import p1.InterfaceC2266a;
import pe.C2339o;
import pe.InterfaceC2330f;
import pe.InterfaceC2344t;
import pe.InterfaceC2345u;
import qe.InterfaceC2472h;
import s1.C2573f;
import s1.InterfaceC2570c;
import s1.InterfaceC2587u;
import s1.X;
import s1.a0;
import s1.au;
import s6.V4;
import se.C2871u;
import t0.C2946x;

/* loaded from: classes2.dex */
public class s implements InterfaceC2587u, G6.g, ff.n, InterfaceC2344t, sd.f, kd.g, InterfaceC1954a, InterfaceC2266a, T5.m, T5.j, G6.f, y5.h, InterfaceC2570c {
    public static volatile long red;
    public final /* synthetic */ int alpha;
    public Object purple;

    public /* synthetic */ s(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    public static boolean jade(Bundle bundle) {
        if (!"1".equals(bundle.getString("gcm.n.e")) && !"1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")))) {
            return false;
        }
        return true;
    }

    public static String magenta(String str) {
        if (str.startsWith("gcm.n.")) {
            return str.substring(6);
        }
        return str;
    }

    @Override // T5.m
    public void accept(Object obj, Object obj2) {
        G6.h hVar = (G6.h) obj2;
        p6.q qVar = (p6.q) obj;
        boolean black = qVar.black(com.google.android.gms.location.n.echo);
        Location location = (Location) this.purple;
        if (black) {
            p6.ab abVar = (p6.ab) qVar.tango();
            p6.l lVar = new p6.l(null, hVar);
            Parcel ivory = abVar.ivory();
            p6.e.bravo(ivory, location);
            ivory.writeStrongBinder(lVar);
            abVar.lavender(ivory, 85);
            return;
        }
        p6.ab abVar2 = (p6.ab) qVar.tango();
        Parcel ivory2 = abVar2.ivory();
        p6.e.bravo(ivory2, location);
        abVar2.lavender(ivory2, 13);
        hVar.bravo(null);
    }

    @Override // G6.f
    public void alpha() {
        try {
            ak akVar = (ak) ((V5.j) this.purple);
            Parcel ivory = akVar.ivory();
            try {
                akVar.hotel.transact(2, ivory, null, 1);
            } finally {
                ivory.recycle();
            }
        } catch (RemoteException unused) {
        }
    }

    public String amber(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            d8.d dVar = (d8.d) this.purple;
            d8.e eVar = new d8.e(stringWriter, dVar.alpha, dVar.purple, dVar.red, dVar.silver);
            eVar.hotel(obj);
            eVar.juliet();
            eVar.bravo.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    public void azure(byte b2) {
        ((Parcel) this.purple).writeByte(b2);
    }

    public void beige(float f5) {
        ((Parcel) this.purple).writeFloat(f5);
    }

    public void black(long j5) {
        long bravo = Q0.p.bravo(j5);
        byte b2 = 0;
        if (!Q0.q.alpha(bravo, 0L)) {
            if (Q0.q.alpha(bravo, 4294967296L)) {
                b2 = 1;
            } else if (Q0.q.alpha(bravo, 8589934592L)) {
                b2 = 2;
            }
        }
        azure(b2);
        if (!Q0.q.alpha(Q0.p.bravo(j5), 0L)) {
            beige(Q0.p.charlie(j5));
        }
    }

    public boolean blue(String str) {
        String indigo = indigo(str);
        if (!"1".equals(indigo) && !Boolean.parseBoolean(indigo)) {
            return false;
        }
        return true;
    }

    @Override // pe.InterfaceC2344t
    public InterfaceC2344t bravo(List parameters) {
        Intrinsics.echo(parameters, "parameters");
        return this;
    }

    public Integer bronze(String str) {
        String indigo = indigo(str);
        if (!TextUtils.isEmpty(indigo)) {
            try {
                return Integer.valueOf(Integer.parseInt(indigo));
            } catch (NumberFormatException unused) {
                Log.w("NotificationParams", "Couldn't parse value of " + magenta(str) + "(" + indigo + ") into an int");
                return null;
            }
        }
        return null;
    }

    @Override // pe.InterfaceC2344t
    public InterfaceC2345u build() {
        return (hf.b) this.purple;
    }

    @Override // s1.InterfaceC2570c
    public void charlie(Bundle bundle) {
        g3.z.xray((ContentInfo.Builder) this.purple, bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p1.InterfaceC2266a
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.purple;
        if (contentProviderClient != 0) {
            if (contentProviderClient instanceof AutoCloseable) {
                contentProviderClient.close();
            } else if (contentProviderClient instanceof ExecutorService) {
                h9.z.tango((ExecutorService) contentProviderClient);
            } else {
                contentProviderClient.release();
            }
        }
    }

    public JSONArray coral(String str) {
        String indigo = indigo(str);
        if (!TextUtils.isEmpty(indigo)) {
            try {
                return new JSONArray(indigo);
            } catch (JSONException unused) {
                Log.w("NotificationParams", "Malformed JSON for key " + magenta(str) + ": " + indigo + ", falling back to default");
                return null;
            }
        }
        return null;
    }

    public int[] crimson() {
        JSONArray coral = coral("gcm.n.light_settings");
        if (coral == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (coral.length() == 3) {
                int parseColor = Color.parseColor(coral.optString(0));
                if (parseColor != -16777216) {
                    iArr[0] = parseColor;
                    iArr[1] = coral.optInt(1);
                    iArr[2] = coral.optInt(2);
                    return iArr;
                }
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            throw new JSONException("lightSettings don't have all three fields");
        } catch (IllegalArgumentException e) {
            Log.w("NotificationParams", "LightSettings is invalid: " + coral + ". " + e.getMessage() + ". Skipping setting LightSettings");
            return null;
        } catch (JSONException unused) {
            Log.w("NotificationParams", "LightSettings is invalid: " + coral + ". Skipping setting LightSettings");
            return null;
        }
    }

    public Object[] cyan(String str) {
        JSONArray coral = coral(str.concat("_loc_args"));
        if (coral == null) {
            return null;
        }
        int length = coral.length();
        String[] strArr = new String[length];
        for (int i4 = 0; i4 < length; i4++) {
            strArr[i4] = coral.optString(i4);
        }
        return strArr;
    }

    @Override // pe.InterfaceC2344t
    public InterfaceC2344t delta(int i4) {
        com.google.android.material.datepicker.j.papa(i4, "kind");
        return this;
    }

    @Override // pe.InterfaceC2344t
    public InterfaceC2344t echo() {
        return this;
    }

    public String emerald(String str) {
        return indigo(str.concat("_loc_key"));
    }

    @Override // pe.InterfaceC2344t
    public InterfaceC2344t foxtrot(Ne.f name) {
        Intrinsics.echo(name, "name");
        return this;
    }

    public Long fuchsia() {
        String indigo = indigo("gcm.n.event_time");
        if (!TextUtils.isEmpty(indigo)) {
            try {
                return Long.valueOf(Long.parseLong(indigo));
            } catch (NumberFormatException unused) {
                Log.w("NotificationParams", "Couldn't parse value of " + magenta("gcm.n.event_time") + "(" + indigo + ") into a long");
                return null;
            }
        }
        return null;
    }

    @Override // s1.InterfaceC2587u
    public a0 gold(View view, a0 a0Var) {
        int i4;
        switch (this.alpha) {
            case 0:
                NavigationView navigationView = (NavigationView) this.purple;
                if (navigationView.purple == null) {
                    navigationView.purple = new Rect();
                }
                navigationView.purple.set(a0Var.bravo(), a0Var.delta(), a0Var.charlie(), a0Var.alpha());
                q qVar = navigationView.f8088b;
                qVar.getClass();
                int delta = a0Var.delta();
                boolean z2 = false;
                if (qVar.f8081s != delta) {
                    qVar.f8081s = delta;
                    if (qVar.purple.getChildCount() <= 0 && qVar.f8079q) {
                        i4 = qVar.f8081s;
                    } else {
                        i4 = 0;
                    }
                    NavigationMenuView navigationMenuView = qVar.alpha;
                    navigationMenuView.setPadding(0, i4, 0, navigationMenuView.getPaddingBottom());
                }
                NavigationMenuView navigationMenuView2 = qVar.alpha;
                navigationMenuView2.setPadding(0, navigationMenuView2.getPaddingTop(), 0, a0Var.alpha());
                au.bravo(qVar.purple, a0Var);
                X x4 = a0Var.alpha;
                if (x4.lima().equals(C1929c.echo) || navigationView.alpha == null) {
                    z2 = true;
                }
                navigationView.setWillNotDraw(z2);
                navigationView.postInvalidateOnAnimation();
                return x4.charlie();
            default:
                int alpha = a0Var.alpha();
                AbstractC1900f abstractC1900f = (AbstractC1900f) this.purple;
                abstractC1900f.mike = alpha;
                abstractC1900f.november = a0Var.bravo();
                abstractC1900f.oscar = a0Var.charlie();
                abstractC1900f.foxtrot();
                return a0Var;
        }
    }

    @Override // s1.InterfaceC2570c
    public void golf(Uri uri) {
        g3.z.whiskey((ContentInfo.Builder) this.purple, uri);
    }

    @Override // j9.InterfaceC1954a
    public boolean gray() {
        switch (this.alpha) {
            case 17:
                return ((AgreementFragment) this.purple).f12133h;
            case 20:
                return ((AreaListingActivityV2) this.purple).f12140L;
            default:
                return ((AssetsListActivity) this.purple).f12159M;
        }
    }

    public String green(Resources resources, String str, String str2) {
        String indigo = indigo(str2);
        if (!TextUtils.isEmpty(indigo)) {
            return indigo;
        }
        String emerald = emerald(str2);
        if (!TextUtils.isEmpty(emerald)) {
            int identifier = resources.getIdentifier(emerald, CTVariableUtils.STRING, str);
            if (identifier == 0) {
                Log.w("NotificationParams", magenta(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
                return null;
            }
            Object[] cyan = cyan(str2);
            if (cyan == null) {
                return resources.getString(identifier);
            }
            try {
                return resources.getString(identifier, cyan);
            } catch (MissingFormatArgumentException e) {
                Log.w("NotificationParams", "Missing format argument for " + magenta(str2) + ": " + Arrays.toString(cyan) + " Default value will be used.", e);
            }
        }
        return null;
    }

    @Override // pe.InterfaceC2344t
    public InterfaceC2344t hotel(kotlin.reflect.jvm.internal.impl.types.y type) {
        Intrinsics.echo(type, "type");
        return this;
    }

    @Override // pe.InterfaceC2344t
    public InterfaceC2344t india(C2871u c2871u) {
        return this;
    }

    public String indigo(String str) {
        String replace;
        Bundle bundle = (Bundle) this.purple;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            if (!str.startsWith("gcm.n.")) {
                replace = str;
            } else {
                replace = str.replace("gcm.n.", "gcm.notification.");
            }
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    @Override // j9.InterfaceC1954a
    public boolean isLoading() {
        switch (this.alpha) {
            case 17:
                return ((SwipeRefreshLayout) ((AgreementFragment) this.purple).romeo().silver).red;
            case 20:
                return ((SwipeRefreshLayout) ((AreaListingActivityV2) this.purple).green().white).red;
            default:
                return ((AssetsListActivity) this.purple).gray().delta.red;
        }
    }

    public long[] ivory() {
        JSONArray coral = coral("gcm.n.vibrate_timings");
        if (coral == null) {
            return null;
        }
        try {
            if (coral.length() > 1) {
                int length = coral.length();
                long[] jArr = new long[length];
                for (int i4 = 0; i4 < length; i4++) {
                    jArr[i4] = coral.optLong(i4);
                }
                return jArr;
            }
            throw new JSONException("vibrateTimings have invalid length");
        } catch (NumberFormatException | JSONException unused) {
            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + coral + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    @Override // T5.j
    public /* synthetic */ void juliet(Object obj) {
        switch (this.alpha) {
            case 24:
                ((LocationCallback) obj).onLocationResult((LocationResult) this.purple);
                return;
            default:
                ((p6.o) this.purple).hotel.zzc();
                return;
        }
    }

    @Override // pe.InterfaceC2344t
    public InterfaceC2344t kilo() {
        return this;
    }

    public Bundle lavender() {
        Bundle bundle = (Bundle) this.purple;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    @Override // pe.InterfaceC2344t
    public InterfaceC2344t lima() {
        return this;
    }

    public C1290a1 lime(com.google.android.play.core.integrity.c cVar, C2946x c2946x) {
        long black;
        boolean z2;
        long j5;
        bv.u uVar = new bv.u(((ArrayList) cVar.purple).size());
        ArrayList arrayList = (ArrayList) cVar.purple;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            m0.t tVar = (m0.t) arrayList.get(i4);
            long j6 = tVar.alpha;
            bv.u uVar2 = (bv.u) this.purple;
            m0.s sVar = (m0.s) uVar2.delta(j6);
            if (sVar == null) {
                long j7 = tVar.bravo;
                black = tVar.delta;
                j5 = j7;
                z2 = false;
            } else {
                black = c2946x.black(sVar.bravo);
                long j10 = sVar.alpha;
                z2 = sVar.charlie;
                j5 = j10;
            }
            long j11 = black;
            ArrayList arrayList2 = tVar.india;
            long j12 = tVar.juliet;
            long j13 = tVar.kilo;
            int i5 = i4;
            long j14 = tVar.alpha;
            ArrayList arrayList3 = arrayList;
            int i10 = size;
            uVar.hotel(j14, new m0.r(j14, tVar.bravo, tVar.delta, tVar.echo, tVar.foxtrot, j5, j11, z2, tVar.golf, arrayList2, j12, j13));
            long j15 = tVar.alpha;
            boolean z10 = tVar.echo;
            if (z10) {
                uVar2.hotel(j15, new m0.s(tVar.bravo, tVar.charlie, z10));
            } else {
                uVar2.india(j15);
            }
            i4 = i5 + 1;
            arrayList = arrayList3;
            size = i10;
        }
        return new C1290a1(uVar, cVar);
    }

    @Override // ff.n
    public void lock() {
        ((ReentrantLock) this.purple).lock();
    }

    @Override // kd.g
    public void log(String message) {
        Intrinsics.echo(message, "message");
        ((rg.b) this.purple).info(message);
    }

    @Override // s1.InterfaceC2570c
    public void mike(int i4) {
        g3.z.victor((ContentInfo.Builder) this.purple, i4);
    }

    @Override // pe.InterfaceC2344t
    public InterfaceC2344t november() {
        return this;
    }

    @Override // pe.InterfaceC2344t
    public InterfaceC2344t oscar(C2339o visibility) {
        Intrinsics.echo(visibility, "visibility");
        return this;
    }

    @Override // p1.InterfaceC2266a
    public Cursor papa(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.purple;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e) {
            Log.w("FontsProvider", "Unable to query the content provider", e);
            return null;
        }
    }

    @Override // pe.InterfaceC2344t
    public InterfaceC2344t quebec(List parameters) {
        Intrinsics.echo(parameters, "parameters");
        return this;
    }

    @Override // pe.InterfaceC2344t
    public InterfaceC2344t romeo(InterfaceC2330f owner) {
        Intrinsics.echo(owner, "owner");
        return this;
    }

    @Override // pe.InterfaceC2344t
    public InterfaceC2344t sierra() {
        return this;
    }

    @Override // sd.f
    public boolean tango(sd.e contentType) {
        Intrinsics.echo(contentType, "contentType");
        return contentType.zulu((sd.e) this.purple);
    }

    @Override // G6.g
    public Task then(Object obj) {
        com.google.android.play.core.integrity.b bVar = (com.google.android.play.core.integrity.b) this.purple;
        return V4.echo(new com.google.android.play.core.integrity.m(bVar.bravo, ((Long) obj).longValue()));
    }

    @Override // pe.InterfaceC2344t
    public InterfaceC2344t uniform(int i4) {
        com.google.android.material.datepicker.j.papa(i4, "modality");
        return this;
    }

    @Override // ff.n
    public void unlock() {
        ((ReentrantLock) this.purple).unlock();
    }

    @Override // pe.InterfaceC2344t
    public InterfaceC2344t victor(InterfaceC2472h additionalAnnotations) {
        Intrinsics.echo(additionalAnnotations, "additionalAnnotations");
        return this;
    }

    @Override // j9.InterfaceC1954a
    public void whiskey() {
        switch (this.alpha) {
            case 17:
                AgreementFragment agreementFragment = (AgreementFragment) this.purple;
                if (!agreementFragment.f12133h) {
                    agreementFragment.f12132g++;
                    agreementFragment.quebec();
                    return;
                }
                return;
            case 20:
                AreaListingActivityV2 areaListingActivityV2 = (AreaListingActivityV2) this.purple;
                areaListingActivityV2.f12139K++;
                areaListingActivityV2.gray();
                return;
            default:
                AssetsListActivity assetsListActivity = (AssetsListActivity) this.purple;
                assetsListActivity.f12156J++;
                assetsListActivity.gray().delta.setRefreshing(true);
                assetsListActivity.gold();
                return;
        }
    }

    @Override // pe.InterfaceC2344t
    public InterfaceC2344t xray() {
        return this;
    }

    public Intent yankee() {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", ((SignInActivity) this.purple).getPackageName(), null));
        intent.addFlags(268435456);
        return intent;
    }

    public g7.d zulu(g7.d dVar) {
        if (dVar instanceof g7.j) {
            return dVar;
        }
        return new C1756b(-((g7.i) this.purple).juliet(), dVar);
    }

    public /* synthetic */ s(int i4, boolean z2) {
        this.alpha = i4;
    }

    @Override // s1.InterfaceC2570c
    /* renamed from: build, reason: collision with other method in class */
    public C2573f mo202build() {
        return new C2573f(new C1718a(g3.z.mike((ContentInfo.Builder) this.purple)));
    }

    public /* synthetic */ s(com.google.android.play.core.integrity.b bVar, com.google.android.play.core.integrity.o oVar) {
        this.alpha = 1;
        this.purple = bVar;
    }

    public s(Context context) {
        this.alpha = 2;
        E5.j jVar = new E5.j(context, 7);
        p7.k alpha = p7.k.alpha(new com.google.android.play.core.integrity.k(jVar, p7.k.alpha(com.google.android.play.core.integrity.a.bravo), new C1477x(jVar)));
        this.purple = p7.k.alpha(new com.google.android.play.core.integrity.c(0, alpha, p7.k.alpha(new ah(26, alpha))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.SecurityManager] */
    public s(int i4) {
        int i5;
        tg.j jVar;
        Class cls = null;
        int i10 = 0;
        this.alpha = i4;
        switch (i4) {
            case 18:
                this.purple = new bv.u(cls);
                return;
            case 21:
                this.purple = new HashSet();
                return;
            default:
                int i11 = rg.d.alpha;
                rg.b alpha = rg.d.bravo().bravo().alpha(cd.c.class.getName());
                if (rg.d.delta) {
                    tg.j jVar2 = tg.k.alpha;
                    tg.j jVar3 = jVar2;
                    if (jVar2 == null) {
                        if (tg.k.bravo) {
                            jVar3 = null;
                        } else {
                            try {
                                jVar = new SecurityManager();
                            } catch (SecurityException unused) {
                                jVar = null;
                            }
                            tg.k.alpha = jVar;
                            tg.k.bravo = true;
                            jVar3 = jVar;
                        }
                    }
                    if (jVar3 != null) {
                        Class[] classContext = jVar3.getClassContext();
                        String name = tg.k.class.getName();
                        while (i10 < classContext.length && !name.equals(classContext[i10].getName())) {
                            i10++;
                        }
                        if (i10 < classContext.length && (i5 = i10 + 2) < classContext.length) {
                            cls = classContext[i5];
                        } else {
                            throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
                        }
                    }
                    if (cls != null && !cls.isAssignableFrom(cd.c.class)) {
                        tg.f.echo("Detected logger name mismatch. Given name: \"" + alpha.getName() + "\"; computed name: \"" + cls.getName() + "\".");
                        tg.f.echo("See https://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
                    }
                }
                Intrinsics.checkNotNull(alpha);
                this.purple = alpha;
                return;
        }
    }

    public s(Bundle bundle) {
        this.alpha = 3;
        if (bundle != null) {
            this.purple = new Bundle(bundle);
            return;
        }
        throw new NullPointerException(Column.DATA);
    }

    public s(Context context, Uri uri) {
        this.alpha = 22;
        this.purple = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public s(ClipData clipData, int i4) {
        this.alpha = 29;
        this.purple = g3.z.lima(clipData, i4);
    }
}
