package delivery.samurai.android.notifications;

import B9.C0058p;
import Jb.I;
import Lb.am;
import W9.a;
import W9.b;
import W9.d;
import W9.e;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.media.SoundPool;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.G;
import androidx.lifecycle.ab;
import ao.ad;
import av.q;
import com.app.network.network.models.DeviceInfo;
import com.app.network.network.models.PayLoad;
import com.app.util.log.FcmDeliveryDropException;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.pushnotification.NotificationInfo;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.google.gson.l;
import d3.k;
import da.C1596b;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.android.internal.managers.ServiceComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;
import delivery.samurai.android.AndroidApp;
import delivery.samurai.android.services.CaptainLocationMonitoringService;
import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.r;
import s6.AbstractC2701l0;
import t3.InterfaceC2956a;
import t6.AbstractC3016k2;
import w9.n;
import w9.p;
import z3.C3462a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldelivery/samurai/android/notifications/MyFirebaseMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class MyFirebaseMessagingService extends FirebaseMessagingService implements GeneratedComponentManagerHolder {
    public static final /* synthetic */ int yellow = 0;
    public volatile ServiceComponentManager alpha;
    public InterfaceC2956a silver;
    public C1596b teal;
    public final Object purple = new Object();
    public boolean red = false;
    public final a white = new Object();

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    /* renamed from: bravo, reason: merged with bridge method [inline-methods] */
    public final ServiceComponentManager componentManager() {
        if (this.alpha == null) {
            synchronized (this.purple) {
                try {
                    if (this.alpha == null) {
                        this.alpha = new ServiceComponentManager(this);
                    }
                } finally {
                }
            }
        }
        return this.alpha;
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // android.app.Service
    public void onCreate() {
        if (!this.red) {
            this.red = true;
            b bVar = (b) generatedComponent();
            MyFirebaseMessagingService myFirebaseMessagingService = (MyFirebaseMessagingService) UnsafeCasts.unsafeCast(this);
            p pVar = ((n) bVar).alpha;
            myFirebaseMessagingService.silver = (InterfaceC2956a) pVar.yankee.get();
            myFirebaseMessagingService.teal = (C1596b) pVar.f14013i.get();
        }
        super.onCreate();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0371  */
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMessageReceived(RemoteMessage remoteMessage) {
        long parseLong;
        int parseInt;
        int i4;
        Throwable th;
        String str;
        String str2;
        k kVar;
        String str3;
        boolean z2;
        ab abVar;
        boolean z10;
        String deeplink;
        e eVar;
        Uri parse;
        String str4;
        Double romeo;
        Integer num;
        String queryParameter;
        Intrinsics.echo(remoteMessage, "remoteMessage");
        super.onMessageReceived(remoteMessage);
        C3462a.alpha("FIREBASE_NOTIFICATION", 12, new l().india(remoteMessage.o()), null);
        C0058p E4 = remoteMessage.E();
        Bundle bundle = remoteMessage.alpha;
        String string = bundle.getString("google.message_id");
        if (string == null) {
            string = bundle.getString("message_id");
        }
        String string2 = bundle.getString("from");
        Object obj = bundle.get("google.sent_time");
        if (obj instanceof Long) {
            parseLong = ((Long) obj).longValue();
        } else {
            if (obj instanceof String) {
                try {
                    parseLong = Long.parseLong((String) obj);
                } catch (NumberFormatException unused) {
                    Log.w("FirebaseMessaging", "Invalid sent time: " + obj);
                }
            }
            parseLong = 0;
        }
        Object obj2 = bundle.get("google.ttl");
        if (obj2 instanceof Integer) {
            parseInt = ((Integer) obj2).intValue();
        } else {
            if (obj2 instanceof String) {
                try {
                    parseInt = Integer.parseInt((String) obj2);
                } catch (NumberFormatException unused2) {
                    Log.w("FirebaseMessaging", "Invalid TTL: " + obj2);
                }
            }
            parseInt = 0;
        }
        String string3 = bundle.getString("collapse_key");
        int priority = remoteMessage.getPriority();
        Bundle bundle2 = remoteMessage.alpha;
        String string4 = bundle2.getString("google.original_priority");
        if (string4 == null) {
            string4 = bundle2.getString("google.priority");
        }
        if (Constants.PRIORITY_HIGH.equals(string4)) {
            i4 = 1;
        } else if (Constants.PRIORITY_NORMAL.equals(string4)) {
            i4 = 2;
        } else {
            i4 = 0;
        }
        StringBuilder india = q.india("meta: id=", string, " from=", string2, " sentTime=");
        india.append(parseLong);
        india.append(" ttl=");
        india.append(parseInt);
        india.append(" collapseKey=");
        india.append(string3);
        india.append(" priority=");
        india.append(priority);
        india.append(" origPriority=");
        india.append(i4);
        C3462a.alpha("FIREBASE_NOTIFICATION", 12, india.toString(), null);
        if (E4 != null) {
            th = null;
            C3462a.alpha("FIREBASE_NOTIFICATION", 12, "notif: title=" + ((String) E4.bravo) + " body=" + ((String) E4.charlie) + " channelId=" + ((String) E4.india) + " sound=" + ((String) E4.foxtrot) + " tag=" + ((String) E4.golf) + " icon=" + ((String) E4.echo) + " color=" + ((String) E4.delta) + " ticker=" + ((String) E4.kilo) + " clickAction=" + ((String) E4.hotel) + " link=" + ((Uri) E4.juliet), null);
        } else {
            th = null;
            C3462a.alpha("FIREBASE_NOTIFICATION", 12, "notif: <null>", null);
        }
        C3462a.alpha("FIREBASE_NOTIFICATION", 12, "data=" + new l().india(remoteMessage.o()), th);
        boolean z11 = CaptainLocationMonitoringService.f12066D;
        Context applicationContext = getApplicationContext();
        Intrinsics.delta(applicationContext, "getApplicationContext(...)");
        AbstractC3016k2.charlie(applicationContext);
        C1596b c1596b = this.teal;
        if (c1596b != null) {
            Map o5 = remoteMessage.o();
            Intrinsics.delta(o5, "getData(...)");
            bv.e eVar2 = (bv.e) o5;
            if (!Intrinsics.areEqual(eVar2.get(Constants.KEY_TYPE), "force_disconnect")) {
                Map o10 = remoteMessage.o();
                Intrinsics.delta(o10, "getData(...)");
                bv.e eVar3 = (bv.e) o10;
                String str5 = (String) eVar3.get("isOnDemand");
                if (str5 != null && str5.equalsIgnoreCase("true") && (str4 = (String) eVar3.get("amount")) != null && (romeo = r.romeo(str4)) != null) {
                    double doubleValue = romeo.doubleValue();
                    String str6 = (String) eVar3.get("deeplink");
                    if (str6 != null) {
                        try {
                            queryParameter = Uri.parse(str6).getQueryParameter(Constants.KEY_ID);
                        } catch (Throwable unused3) {
                        }
                        if (queryParameter != null) {
                            num = r.tango(queryParameter);
                            if (num != null) {
                                int intValue = num.intValue();
                                Context applicationContext2 = getApplicationContext();
                                Intrinsics.delta(applicationContext2, "getApplicationContext(...)");
                                applicationContext2.getSharedPreferences("on_demand_amounts", 0).edit().putLong(ad.zulu(intValue, "amount_for_order_"), Double.doubleToRawLongBits(doubleValue)).apply();
                            }
                        }
                        num = null;
                        if (num != null) {
                        }
                    }
                }
                Bundle bundle3 = new Bundle();
                Map o11 = remoteMessage.o();
                Intrinsics.delta(o11, "getData(...)");
                for (Map.Entry entry : ((bv.e) o11).entrySet()) {
                    bundle3.putString((String) entry.getKey(), (String) entry.getValue());
                }
                NotificationInfo notificationInfo = CleverTapAPI.getNotificationInfo(bundle3);
                CleverTapAPI defaultInstance = CleverTapAPI.getDefaultInstance(this);
                if (defaultInstance != null) {
                    defaultInstance.pushNotificationViewedEvent(bundle3);
                }
                if (notificationInfo.fromCleverTap) {
                    CleverTapAPI.createNotification(getApplicationContext(), bundle3);
                    return;
                }
                Map o12 = remoteMessage.o();
                Intrinsics.delta(o12, "getData(...)");
                PayLoad payLoad = (PayLoad) new l().delta(PayLoad.class, new l().india(o12));
                String title = payLoad.getTitle();
                if (title == null || StringsKt.gray(title)) {
                    C0058p E10 = remoteMessage.E();
                    if (E10 != null) {
                        str = (String) E10.bravo;
                    } else {
                        str = null;
                    }
                    payLoad.setTitle(str);
                }
                String message = payLoad.getMessage();
                if (message == null || StringsKt.gray(message)) {
                    C0058p E11 = remoteMessage.E();
                    if (E11 != null) {
                        str2 = (String) E11.charlie;
                    } else {
                        str2 = null;
                    }
                    payLoad.setMessage(str2);
                }
                ab abVar2 = G.f3128b.white.delta;
                String type = payLoad.getType();
                String deeplink2 = payLoad.getDeeplink();
                String channelExternalId = payLoad.getChannelExternalId();
                WeakReference weakReference = AbstractC2701l0.bravo;
                if (weakReference != null) {
                    kVar = (k) weakReference.get();
                } else {
                    kVar = null;
                }
                if (kVar == null) {
                    AbstractC2701l0.bravo = null;
                }
                if (kVar != null) {
                    str3 = kVar.getClass().getSimpleName();
                } else {
                    str3 = null;
                }
                StringBuilder india2 = q.india("received type=", type, " deeplink=", deeplink2, " channelExternalId=");
                india2.append(channelExternalId);
                india2.append(" lifecycle=");
                india2.append(abVar2);
                india2.append(" top=");
                india2.append(str3);
                C3462a.alpha("FCM_DELIVERY", 12, india2.toString(), null);
                String deeplink3 = payLoad.getDeeplink();
                if (deeplink3 != null && !StringsKt.gray(deeplink3)) {
                    try {
                        parse = Uri.parse(deeplink3);
                    } catch (Throwable unused4) {
                    }
                    if (Intrinsics.areEqual(parse.getScheme(), "samuraicaptain")) {
                        if (Intrinsics.areEqual(parse.getQueryParameter(Constants.KEY_ACTION), "refresh")) {
                            z2 = true;
                            abVar = ab.teal;
                            if (abVar2 == abVar) {
                                String type2 = payLoad.getType();
                                if (type2 != null && !StringsKt.gray(type2)) {
                                    u8.b bVar = e.red;
                                    String type3 = payLoad.getType();
                                    String deeplink4 = payLoad.getDeeplink();
                                    bVar.getClass();
                                    eVar = u8.b.foxtrot(type3, deeplink4);
                                } else {
                                    String channelExternalId2 = payLoad.getChannelExternalId();
                                    if (channelExternalId2 != null && !StringsKt.gray(channelExternalId2)) {
                                        eVar = e.f2195b;
                                    } else {
                                        eVar = e.f2198f;
                                    }
                                }
                                if (!z2 && eVar != e.silver && eVar != e.e) {
                                    SoundPool soundPool = d.alpha;
                                    Context applicationContext3 = getApplicationContext();
                                    Intrinsics.delta(applicationContext3, "getApplicationContext(...)");
                                    d.alpha(applicationContext3, eVar);
                                }
                                C3462a.alpha("FCM_DELIVERY", 12, "resolved type=" + eVar + " silentRefresh=" + z2, null);
                            }
                            if (payLoad.getDeeplink() == null) {
                                if (abVar2 != abVar) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10 && z2) {
                                    C3462a.alpha("FCM_DELIVERY", 12, "silent_refresh_skipped reason=not-resumed", null);
                                    return;
                                }
                                if (z10 && (deeplink = payLoad.getDeeplink()) != null && (!StringsKt.beige(deeplink, "screen=order", false))) {
                                    C3462a.alpha("FCM_DELIVERY", 12, ad.gray("system_notification type=", payLoad.getType(), " reason=not-resumed"), null);
                                    L9.d.magenta(this, payLoad.getType(), payLoad);
                                    return;
                                } else {
                                    C3462a.alpha("FCM_DELIVERY", 12, ad.gray("broadcast_sent type=", payLoad.getType(), " via=deeplink"), null);
                                    W1.b.alpha(this).charlie(new Intent("ACTION_DEEP_LINK_NOTIFICATION").putExtra("payload", payLoad));
                                    return;
                                }
                            }
                            if (payLoad.getChannelExternalId() != null) {
                                if (G.f3128b.white.delta != abVar) {
                                    C3462a.alpha("FCM_DELIVERY", 12, "system_notification type=chat reason=not-resumed", null);
                                    L9.d.magenta(this, "chat", payLoad);
                                    return;
                                } else {
                                    payLoad.setType("chat");
                                    payLoad.setDeeplink(payLoad.getChannelExternalId());
                                    C3462a.alpha("FCM_DELIVERY", 12, "broadcast_sent type=chat via=channelExternalId", null);
                                    W1.b.alpha(this).charlie(new Intent("ACTION_DEEP_LINK_NOTIFICATION").putExtra("payload", payLoad));
                                    return;
                                }
                            }
                            C3462a.alpha("FCM_DELIVERY", 12, q.foxtrot("skipped reason=no-deeplink type=", payLoad.getType(), " title=", payLoad.getTitle()), null);
                            K7.b.alpha().charlie(new FcmDeliveryDropException(q.echo("no-deeplink type=", payLoad.getType())));
                            return;
                        }
                    }
                }
                z2 = false;
                abVar = ab.teal;
                if (abVar2 == abVar) {
                }
                if (payLoad.getDeeplink() == null) {
                }
            } else {
                String str7 = (String) eVar2.get("reason");
                if (str7 == null) {
                    str7 = "another_device";
                }
                if (!c1596b.alpha.alpha()) {
                    C3462a.alpha("FIREBASE_NOTIFICATION", 12, "force_disconnect ignored: already logged out | reason=".concat(str7), null);
                } else {
                    C3462a.alpha("FIREBASE_NOTIFICATION", 12, "force_disconnect handled | reason=".concat(str7), null);
                    c1596b.bravo.alpha(str7);
                }
            }
        } else {
            Intrinsics.lima("forceDisconnectHandler");
            throw null;
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onNewToken(String token) {
        int i4 = 19;
        Intrinsics.echo(token, "token");
        super.onNewToken(token);
        C3462a.alpha("FIREBASE_TOKEN", 12, "FCM token rotated", null);
        AtomicInteger atomicInteger = L9.d.alpha;
        L9.d.plum(this).edit().putString("firebaseToken", token).apply();
        Log.d("FCM", "New token received");
        CleverTapAPI defaultInstance = CleverTapAPI.getDefaultInstance(this);
        if (defaultInstance != null) {
            defaultInstance.pushFcmRegistrationId(token, true);
        }
        Application application = getApplication();
        Intrinsics.charlie(application, "null cannot be cast to non-null type delivery.samurai.android.AndroidApp");
        String romeo = L9.d.romeo((AndroidApp) application);
        if (romeo != null && !StringsKt.gray(romeo)) {
            Application application2 = getApplication();
            Intrinsics.charlie(application2, "null cannot be cast to non-null type delivery.samurai.android.AndroidApp");
            DeviceInfo alpha = L9.d.alpha((AndroidApp) application2);
            alpha.setInstallationUid(romeo);
            alpha.setFcmToken(token);
            CompositeDisposable compositeDisposable = new CompositeDisposable();
            InterfaceC2956a interfaceC2956a = this.silver;
            if (interfaceC2956a != null) {
                Single<DeviceInfo> hotel = interfaceC2956a.hotel(alpha);
                a aVar = this.white;
                Intrinsics.charlie(aVar, "null cannot be cast to non-null type io.reactivex.SingleTransformer<T of delivery.samurai.android.notifications.MyFirebaseMessagingService.applySchedulers, T of delivery.samurai.android.notifications.MyFirebaseMessagingService.applySchedulers>");
                compositeDisposable.add(hotel.compose(aVar).subscribe(new I(i4, new Cb.ad(i4, this, alpha)), new I(20, new am(24))));
                return;
            }
            Intrinsics.lima("authService");
            throw null;
        }
        C3462a.alpha("API", 12, "onNewToken: skipping updateDevice because UUID is null or blank", null);
    }
}
