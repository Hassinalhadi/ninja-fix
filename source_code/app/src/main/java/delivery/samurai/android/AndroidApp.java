package delivery.samurai.android;

import B2.ai;
import B2.s;
import B7.g;
import Cf.d;
import Cf.e;
import E8.b;
import F8.f;
import J2.l;
import J7.i;
import L9.k;
import N9.c;
import X1.a;
import X9.j;
import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import com.clevertap.android.sdk.ActivityLifecycleCallback;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.interfaces.OnInitCleverTapIDListener;
import com.google.firebase.messaging.FirebaseMessaging;
import com.incognia.Incognia;
import dagger.hilt.android.HiltAndroidApp;
import dagger.hilt.android.internal.managers.ApplicationComponentManager;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;
import io.reactivex.plugins.RxJavaPlugins;
import j3.C1943b;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParserException;
import pf.C2361k;
import s1.C2576i;
import s6.C0;
import s6.V4;
import t6.AbstractC3075w2;
import t6.V2;
import vf.Y;
import vf.ad;
import vf.ao;
import vg.al;
import w9.InterfaceC3240a;
import w9.p;
import z3.InterfaceC3463b;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000:\u0001\u0003B\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0004"}, d2 = {"Ldelivery/samurai/android/AndroidApp;", "<init>", "()V", "t6/V2", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@HiltAndroidApp
/* loaded from: classes.dex */
public final class AndroidApp extends Application implements GeneratedComponentManagerHolder {
    public static AndroidApp yellow;
    public boolean alpha = false;
    public final ApplicationComponentManager purple = new ApplicationComponentManager(new C2576i(this));
    public final l red;
    public C1943b silver;
    public InterfaceC3463b teal;
    public c white;

    /* JADX WARN: Type inference failed for: r0v2, types: [J2.l, java.lang.Object] */
    public AndroidApp() {
        yellow = this;
        this.red = new Object();
    }

    public static NotificationChannel alpha(AndroidApp androidApp) {
        Uri parse = Uri.parse("android.resource://" + androidApp.getPackageName() + "/2131951624");
        Intrinsics.delta(parse, "parse(...)");
        AudioAttributes build = new AudioAttributes.Builder().setContentType(4).setUsage(4).build();
        String string = androidApp.getString(R.string.notification_channel_order_name);
        Intrinsics.delta(string, "getString(...)");
        String string2 = androidApp.getString(R.string.notification_channel_order_description);
        Intrinsics.delta(string2, "getString(...)");
        Intrinsics.checkNotNull(build);
        return androidApp.echo("order_allocation_v2", string, string2, parse, build);
    }

    public static Application isContextCalled() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Method method = cls.getMethod("currentApplication", new Class[0]);
            method.invoke(cls, new Object[0]);
            return (Application) method.invoke(cls, new Object[0]);
        } catch (Exception e) {
            e.printStackTrace();
            return (Application) null;
        }
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        ApplicationInfo applicationInfo;
        super.attachBaseContext(context);
        HashSet hashSet = a.alpha;
        Log.i("MultiDex", "Installing application");
        try {
            if (a.bravo) {
                Log.i("MultiDex", "VM has multidex support, MultiDex support library is disabled.");
                return;
            }
            try {
                applicationInfo = getApplicationInfo();
            } catch (RuntimeException e) {
                Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", e);
                applicationInfo = null;
            }
            if (applicationInfo == null) {
                Log.i("MultiDex", "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
            } else {
                a.bravo(this, new File(applicationInfo.sourceDir), new File(applicationInfo.dataDir));
                Log.i("MultiDex", "install done");
            }
        } catch (Exception e4) {
            Log.e("MultiDex", "MultiDex installation failure", e4);
            throw new RuntimeException("MultiDex installation failed (" + e4.getMessage() + ").");
        }
    }

    public final NotificationChannel bravo() {
        AudioAttributes build = new AudioAttributes.Builder().setContentType(4).setUsage(4).build();
        Uri golf = golf("coin");
        if (golf == null) {
            golf = Uri.parse("android.resource://" + getPackageName() + "/2131951618");
            Intrinsics.delta(golf, "parse(...)");
        }
        String string = getString(R.string.notification_channel_points_name);
        Intrinsics.delta(string, "getString(...)");
        String string2 = getString(R.string.notification_channel_points_description);
        Intrinsics.delta(string2, "getString(...)");
        Intrinsics.checkNotNull(build);
        return echo("points_rewards", string, string2, golf, build);
    }

    public final NotificationChannel charlie() {
        AudioAttributes build = new AudioAttributes.Builder().setContentType(4).setUsage(4).build();
        Uri golf = golf("samurai");
        if (golf == null) {
            golf = Uri.parse("android.resource://" + getPackageName() + "/2131951624");
            Intrinsics.delta(golf, "parse(...)");
        }
        String string = getString(R.string.notification_channel_samurai_notifications_name);
        Intrinsics.delta(string, "getString(...)");
        String string2 = getString(R.string.notification_channel_samurai_notifications_description);
        Intrinsics.delta(string2, "getString(...)");
        Intrinsics.checkNotNull(build);
        return echo("samurai_notifications_v2", string, string2, golf, build);
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    public final GeneratedComponentManager componentManager() {
        return this.purple;
    }

    public final NotificationChannel delta() {
        AudioAttributes build = new AudioAttributes.Builder().setContentType(4).setUsage(4).build();
        Uri golf = golf("chat");
        if (golf == null) {
            golf = Uri.parse("android.resource://" + getPackageName() + "/2131951624");
            Intrinsics.delta(golf, "parse(...)");
        }
        String string = getString(R.string.notification_channel_tickets_name);
        Intrinsics.delta(string, "getString(...)");
        String string2 = getString(R.string.notification_channel_tickets_description);
        Intrinsics.delta(string2, "getString(...)");
        Intrinsics.checkNotNull(build);
        return echo("ticketing_system_v2", string, string2, golf, build);
    }

    public final NotificationChannel echo(String str, String str2, String str3, Uri uri, AudioAttributes audioAttributes) {
        NotificationChannel notificationChannel;
        int importance;
        Uri sound;
        Uri sound2;
        Object systemService = getSystemService("notification");
        Intrinsics.charlie(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        notificationChannel = notificationManager.getNotificationChannel(str);
        if (notificationChannel != null) {
            importance = notificationChannel.getImportance();
            if (importance == 4) {
                sound = notificationChannel.getSound();
                if (sound != null) {
                    sound2 = notificationChannel.getSound();
                    if (Intrinsics.areEqual(sound2, uri)) {
                        notificationChannel.setName(str2);
                        notificationChannel.setDescription(str3);
                        notificationManager.createNotificationChannel(notificationChannel);
                        return notificationChannel;
                    }
                }
            }
            notificationManager.deleteNotificationChannel(str);
        }
        androidx.camera.camera2.internal.compat.a.lima();
        NotificationChannel echo = al.echo(str, str2);
        echo.setDescription(str3);
        echo.enableLights(true);
        echo.enableVibration(true);
        echo.setSound(uri, audioAttributes);
        notificationManager.createNotificationChannel(echo);
        return echo;
    }

    public final void foxtrot() {
        if (!this.alpha) {
            this.alpha = true;
            InterfaceC3240a interfaceC3240a = (InterfaceC3240a) this.purple.generatedComponent();
            AndroidApp androidApp = (AndroidApp) UnsafeCasts.unsafeCast(this);
            p pVar = (p) interfaceC3240a;
            androidApp.silver = (C1943b) pVar.juliet.get();
            androidApp.teal = (InterfaceC3463b) pVar.kilo.get();
            androidApp.white = (c) pVar.oscar.get();
        }
        super.onCreate();
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        return this.purple.generatedComponent();
    }

    public final Uri golf(String str) {
        try {
            int identifier = getResources().getIdentifier(str, "raw", getPackageName());
            if (identifier == 0) {
                return null;
            }
            return Uri.parse("android.resource://" + getPackageName() + "/" + identifier);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:8|(3:10|(2:13|11)|14)|15|(1:17)|18|(3:19|20|(1:22)(2:44|(2:(2:47|48)(1:(4:51|(2:(1:57)(1:55)|56)|58|59)(2:60|(2:63|(4:65|(2:79|(1:(2:71|72)(2:73|74))(2:75|76))|68|(0)(0))(4:80|(2:82|(0)(0))|68|(0)(0)))))|49)))|23|24|25|26|27|28|(1:30)|32|(2:34|35)(2:37|38)) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01f1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01f2, code lost:
    
        K7.b.alpha().charlie(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01ad, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01ae, code lost:
    
        android.util.Log.e("FirebaseRemoteConfig", "The provided defaults map could not be processed.", r0);
        s6.V4.echo(null);
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01e8 A[Catch: Exception -> 0x01f1, TRY_LEAVE, TryCatch #3 {Exception -> 0x01f1, blocks: (B:28:0x01e0, B:30:0x01e8), top: B:27:0x01e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x017f A[Catch: IOException -> 0x010d, XmlPullParserException -> 0x010f, TryCatch #4 {IOException -> 0x010d, XmlPullParserException -> 0x010f, blocks: (B:20:0x0100, B:22:0x0106, B:44:0x0111, B:47:0x0123, B:49:0x0183, B:51:0x012a, B:55:0x013a, B:57:0x013e, B:63:0x014c, B:71:0x0174, B:73:0x017a, B:75:0x017f, B:77:0x015b, B:80:0x0165), top: B:19:0x0100 }] */
    /* JADX WARN: Type inference failed for: r3v16, types: [E8.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [E8.d, java.lang.Object] */
    @Override // android.app.Application
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate() {
        c cVar;
        CleverTapAPI defaultInstance;
        char c3;
        int i4 = 1;
        int i5 = 21;
        int i10 = 2;
        ActivityLifecycleCallback.register(this);
        foxtrot();
        AtomicReference atomicReference = k.alpha;
        Context applicationContext = getApplicationContext();
        Intrinsics.delta(applicationContext, "getApplicationContext(...)");
        k.golf(applicationContext);
        Y y10 = X9.k.alpha;
        if (y10 != null) {
            y10.foxtrot(null);
        }
        e eVar = ao.alpha;
        X9.k.alpha = ad.zulu(ad.charlie(d.purple.plus(ad.foxtrot())), null, null, new j(this, null), 3);
        Incognia.init$default(this, null, 2, null);
        Incognia.generateRequestToken$default(null, new com.google.firebase.messaging.l(i5), 1, null);
        C1943b c1943b = this.silver;
        if (c1943b == null) {
            Intrinsics.lima("extensionsLoggerHolder");
            throw null;
        }
        C1943b.bravo = c1943b;
        if (this.teal == null) {
            Intrinsics.lima("crashLogger");
            throw null;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            alpha(V2.delta());
            V2.delta().bravo();
            V2.delta().delta();
            V2.delta().charlie();
            Object systemService = getSystemService("notification");
            Intrinsics.charlie(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            NotificationManager notificationManager = (NotificationManager) systemService;
            Iterator it = CollectionsKt.listOf("order_allocation", "ticketing_system", "samurai_notifications").iterator();
            while (it.hasNext()) {
                notificationManager.deleteNotificationChannel((String) it.next());
            }
        }
        ActivityLifecycleCallback.register(this);
        CleverTapAPI defaultInstance2 = CleverTapAPI.getDefaultInstance(getApplicationContext());
        CleverTapAPI.setDebugLevel(CleverTapAPI.LogLevel.VERBOSE);
        if (defaultInstance2 != null) {
            defaultInstance2.enableDeviceNetworkInfoReporting(true);
        }
        g.foxtrot(this);
        FirebaseMessaging.charlie().echo().bravo(new s(i5, this));
        i iVar = i.alpha;
        ?? obj = new Object();
        obj.alpha = 60L;
        obj.bravo = F8.j.india;
        ?? obj2 = new Object();
        obj2.alpha = obj.alpha;
        obj2.bravo = obj.bravo;
        b echo = b.echo();
        echo.getClass();
        V4.charlie(echo.charlie, new ai(i4, echo, obj2));
        Context context = echo.alpha;
        HashMap hashMap = new HashMap();
        try {
            Resources resources = context.getResources();
            if (resources == null) {
                Log.e("FirebaseRemoteConfig", "Could not find the resources of the current context while trying to set defaults from an XML.");
            } else {
                XmlResourceParser xml = resources.getXml(R.xml.remote_config_defaults);
                String str = null;
                String str2 = null;
                String str3 = null;
                for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                    if (eventType == 2) {
                        str = xml.getName();
                    } else if (eventType == 3) {
                        if (xml.getName().equals("entry")) {
                            if (str2 == null || str3 == null) {
                                Log.w("FirebaseRemoteConfig", "An entry in the defaults XML has an invalid key and/or value tag.");
                            } else {
                                hashMap.put(str2, str3);
                            }
                            str2 = null;
                            str3 = null;
                        }
                        str = null;
                    } else if (eventType == 4 && str != null) {
                        int hashCode = str.hashCode();
                        if (hashCode != 106079) {
                            if (hashCode == 111972721 && str.equals("value")) {
                                c3 = 1;
                                if (c3 != 0) {
                                    str2 = xml.getText();
                                } else if (c3 != 1) {
                                    Log.w("FirebaseRemoteConfig", "Encountered an unexpected tag while parsing the defaults XML.");
                                } else {
                                    str3 = xml.getText();
                                }
                            }
                            c3 = 65535;
                            if (c3 != 0) {
                            }
                        } else {
                            if (str.equals(Constants.KEY_KEY)) {
                                c3 = 0;
                                if (c3 != 0) {
                                }
                            }
                            c3 = 65535;
                            if (c3 != 0) {
                            }
                        }
                    }
                }
            }
        } catch (IOException e) {
            e = e;
            Log.e("FirebaseRemoteConfig", "Encountered an error while parsing the defaults XML file.", e);
            f charlie = F8.g.charlie();
            charlie.alpha = new JSONObject(hashMap);
            echo.foxtrot.echo(charlie.alpha()).november(iVar, new A8.a(10));
            Intrinsics.checkNotNull(echo);
            echo.golf.alpha(30L).november(iVar, new A8.a(11)).bravo(new E8.a(echo));
            Context applicationContext2 = getApplicationContext();
            Intrinsics.delta(applicationContext2, "getApplicationContext(...)");
            final l lVar = this.red;
            lVar.getClass();
            defaultInstance = CleverTapAPI.getDefaultInstance(applicationContext2);
            lVar.purple = defaultInstance;
            if (defaultInstance != null) {
            }
            AbstractC3075w2.delta(this, null);
            C0.alpha(this, null);
            cVar = this.white;
            if (cVar == null) {
            }
        } catch (XmlPullParserException e4) {
            e = e4;
            Log.e("FirebaseRemoteConfig", "Encountered an error while parsing the defaults XML file.", e);
            f charlie2 = F8.g.charlie();
            charlie2.alpha = new JSONObject(hashMap);
            echo.foxtrot.echo(charlie2.alpha()).november(iVar, new A8.a(10));
            Intrinsics.checkNotNull(echo);
            echo.golf.alpha(30L).november(iVar, new A8.a(11)).bravo(new E8.a(echo));
            Context applicationContext22 = getApplicationContext();
            Intrinsics.delta(applicationContext22, "getApplicationContext(...)");
            final l lVar2 = this.red;
            lVar2.getClass();
            defaultInstance = CleverTapAPI.getDefaultInstance(applicationContext22);
            lVar2.purple = defaultInstance;
            if (defaultInstance != null) {
            }
            AbstractC3075w2.delta(this, null);
            C0.alpha(this, null);
            cVar = this.white;
            if (cVar == null) {
            }
        }
        f charlie22 = F8.g.charlie();
        charlie22.alpha = new JSONObject(hashMap);
        echo.foxtrot.echo(charlie22.alpha()).november(iVar, new A8.a(10));
        Intrinsics.checkNotNull(echo);
        echo.golf.alpha(30L).november(iVar, new A8.a(11)).bravo(new E8.a(echo));
        Context applicationContext222 = getApplicationContext();
        Intrinsics.delta(applicationContext222, "getApplicationContext(...)");
        final l lVar22 = this.red;
        lVar22.getClass();
        defaultInstance = CleverTapAPI.getDefaultInstance(applicationContext222);
        lVar22.purple = defaultInstance;
        if (defaultInstance != null) {
            defaultInstance.getCleverTapID(new OnInitCleverTapIDListener() { // from class: Y9.a
                @Override // com.clevertap.android.sdk.interfaces.OnInitCleverTapIDListener
                public final void onInitCleverTapID(String str4) {
                    J2.l.this.alpha = str4;
                }
            });
        }
        AbstractC3075w2.delta(this, null);
        C0.alpha(this, null);
        cVar = this.white;
        if (cVar == null) {
            Intrinsics.lima("featureFlagCrashKeys");
            throw null;
        }
        cVar.alpha();
        ad.zulu(cVar.charlie, null, null, new N9.b(cVar, null), 3);
        RxJavaPlugins.setErrorHandler(new sa.c(i10, new C2361k(this)));
    }
}
