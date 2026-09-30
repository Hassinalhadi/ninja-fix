package s6;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.db.Column;
import com.clevertap.android.sdk.pushnotification.PushConstants;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;
import g0.C1726f;
import j8.C1946c;
import j8.InterfaceC1947d;
import java.util.concurrent.ExecutionException;
import p8.C2293d;
import p8.C2294e;
import p8.EnumC2291b;

/* renamed from: s6.d0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2629d0 {
    public static C1726f alpha;

    public static boolean alpha() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            B7.g.charlie();
            B7.g charlie = B7.g.charlie();
            charlie.alpha();
            Context context = charlie.alpha;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0089 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0172 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0156 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void bravo(Intent intent) {
        boolean z2;
        int parseInt;
        int i4;
        String string;
        EnumC2291b enumC2291b;
        String string2;
        Object[] objArr;
        String string3;
        String str;
        String string4;
        String str2;
        String string5;
        String str3;
        String string6;
        String str4;
        String string7;
        String str5;
        long parseLong;
        String str6;
        String str7;
        int i5 = 1;
        if (delta(intent)) {
            charlie(intent.getExtras(), "_nr");
        }
        int i10 = 0;
        if (intent != null && !FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction())) {
            z2 = alpha();
        } else {
            z2 = false;
        }
        if (z2) {
            B5.f fVar = (B5.f) FirebaseMessaging.lima.get();
            if (fVar == null) {
                Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
                return;
            }
            C2293d c2293d = null;
            r5 = null;
            String str8 = null;
            if (intent != null) {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = Bundle.EMPTY;
                }
                Object obj = extras.get("google.ttl");
                if (obj instanceof Integer) {
                    parseInt = ((Integer) obj).intValue();
                } else {
                    if (obj instanceof String) {
                        try {
                            parseInt = Integer.parseInt((String) obj);
                        } catch (NumberFormatException unused) {
                            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
                        }
                    }
                    i4 = 0;
                    string = extras.getString("google.to");
                    if (TextUtils.isEmpty(string)) {
                        try {
                            B7.g charlie = B7.g.charlie();
                            try {
                                Object obj2 = C1946c.mike;
                                string = (String) V4.bravo(((C1946c) charlie.bravo(InterfaceC1947d.class)).delta());
                            } catch (InterruptedException e) {
                                e = e;
                                throw new RuntimeException(e);
                            }
                        } catch (InterruptedException | ExecutionException e4) {
                            e = e4;
                        }
                    }
                    String str9 = string;
                    B7.g charlie2 = B7.g.charlie();
                    charlie2.alpha();
                    String packageName = charlie2.alpha.getPackageName();
                    if (!com.google.android.material.internal.s.jade(extras)) {
                        enumC2291b = EnumC2291b.DISPLAY_NOTIFICATION;
                    } else {
                        enumC2291b = EnumC2291b.DATA_MESSAGE;
                    }
                    EnumC2291b enumC2291b2 = enumC2291b;
                    string2 = extras.getString("google.delivered_priority");
                    if (string2 == null) {
                        if (!"1".equals(extras.getString("google.priority_reduced"))) {
                            string2 = extras.getString("google.priority");
                        }
                        objArr = 2;
                        if (objArr == 2) {
                            i10 = 5;
                        } else if (objArr == 1) {
                            i10 = 10;
                        }
                        int i11 = i10;
                        string3 = extras.getString("google.message_id");
                        if (string3 == null) {
                            string3 = extras.getString("message_id");
                        }
                        if (string3 == null) {
                            str = "";
                        } else {
                            str = string3;
                        }
                        string4 = extras.getString("from");
                        if (string4 != null && string4.startsWith("/topics/")) {
                            str8 = string4;
                        }
                        if (str8 == null) {
                            str2 = "";
                        } else {
                            str2 = str8;
                        }
                        string5 = extras.getString("collapse_key");
                        if (string5 == null) {
                            str3 = "";
                        } else {
                            str3 = string5;
                        }
                        string6 = extras.getString("google.c.a.m_l");
                        if (string6 == null) {
                            str4 = "";
                        } else {
                            str4 = string6;
                        }
                        string7 = extras.getString("google.c.a.c_l");
                        if (string7 == null) {
                            str5 = "";
                        } else {
                            str5 = string7;
                        }
                        long j5 = 0;
                        if (extras.containsKey("google.c.sender.id")) {
                            try {
                                parseLong = Long.parseLong(extras.getString("google.c.sender.id"));
                            } catch (NumberFormatException e5) {
                                Log.w("FirebaseMessaging", "error parsing project number", e5);
                            }
                            if (parseLong > 0) {
                                j5 = parseLong;
                            }
                            c2293d = new C2293d(j5, str, str9, enumC2291b2, packageName, str3, i11, i4, str2, str4, str5);
                        }
                        B7.g charlie3 = B7.g.charlie();
                        charlie3.alpha();
                        B7.i iVar = charlie3.charlie;
                        str6 = iVar.echo;
                        if (str6 != null) {
                            try {
                                parseLong = Long.parseLong(str6);
                            } catch (NumberFormatException e10) {
                                Log.w("FirebaseMessaging", "error parsing sender ID", e10);
                            }
                            if (parseLong > 0) {
                            }
                            c2293d = new C2293d(j5, str, str9, enumC2291b2, packageName, str3, i11, i4, str2, str4, str5);
                        }
                        charlie3.alpha();
                        str7 = iVar.bravo;
                        if (!str7.startsWith("1:")) {
                            try {
                                parseLong = Long.parseLong(str7);
                            } catch (NumberFormatException e11) {
                                Log.w("FirebaseMessaging", "error parsing app ID", e11);
                            }
                        } else {
                            String[] split = str7.split(":");
                            if (split.length >= 2) {
                                String str10 = split[1];
                                if (!str10.isEmpty()) {
                                    try {
                                        parseLong = Long.parseLong(str10);
                                    } catch (NumberFormatException e12) {
                                        Log.w("FirebaseMessaging", "error parsing app ID", e12);
                                    }
                                }
                            }
                            parseLong = 0;
                        }
                        if (parseLong > 0) {
                        }
                        c2293d = new C2293d(j5, str, str9, enumC2291b2, packageName, str3, i11, i4, str2, str4, str5);
                    }
                    if (!Constants.PRIORITY_HIGH.equals(string2)) {
                        objArr = 1;
                    } else {
                        if (!Constants.PRIORITY_NORMAL.equals(string2)) {
                            objArr = 0;
                        }
                        objArr = 2;
                    }
                    if (objArr == 2) {
                    }
                    int i112 = i10;
                    string3 = extras.getString("google.message_id");
                    if (string3 == null) {
                    }
                    if (string3 == null) {
                    }
                    string4 = extras.getString("from");
                    if (string4 != null) {
                        str8 = string4;
                    }
                    if (str8 == null) {
                    }
                    string5 = extras.getString("collapse_key");
                    if (string5 == null) {
                    }
                    string6 = extras.getString("google.c.a.m_l");
                    if (string6 == null) {
                    }
                    string7 = extras.getString("google.c.a.c_l");
                    if (string7 == null) {
                    }
                    long j52 = 0;
                    if (extras.containsKey("google.c.sender.id")) {
                    }
                    B7.g charlie32 = B7.g.charlie();
                    charlie32.alpha();
                    B7.i iVar2 = charlie32.charlie;
                    str6 = iVar2.echo;
                    if (str6 != null) {
                    }
                    charlie32.alpha();
                    str7 = iVar2.bravo;
                    if (!str7.startsWith("1:")) {
                    }
                    if (parseLong > 0) {
                    }
                    c2293d = new C2293d(j52, str, str9, enumC2291b2, packageName, str3, i112, i4, str2, str4, str5);
                }
                i4 = parseInt;
                string = extras.getString("google.to");
                if (TextUtils.isEmpty(string)) {
                }
                String str92 = string;
                B7.g charlie22 = B7.g.charlie();
                charlie22.alpha();
                String packageName2 = charlie22.alpha.getPackageName();
                if (!com.google.android.material.internal.s.jade(extras)) {
                }
                EnumC2291b enumC2291b22 = enumC2291b;
                string2 = extras.getString("google.delivered_priority");
                if (string2 == null) {
                }
                if (!Constants.PRIORITY_HIGH.equals(string2)) {
                }
                if (objArr == 2) {
                }
                int i1122 = i10;
                string3 = extras.getString("google.message_id");
                if (string3 == null) {
                }
                if (string3 == null) {
                }
                string4 = extras.getString("from");
                if (string4 != null) {
                }
                if (str8 == null) {
                }
                string5 = extras.getString("collapse_key");
                if (string5 == null) {
                }
                string6 = extras.getString("google.c.a.m_l");
                if (string6 == null) {
                }
                string7 = extras.getString("google.c.a.c_l");
                if (string7 == null) {
                }
                long j522 = 0;
                if (extras.containsKey("google.c.sender.id")) {
                }
                B7.g charlie322 = B7.g.charlie();
                charlie322.alpha();
                B7.i iVar22 = charlie322.charlie;
                str6 = iVar22.echo;
                if (str6 != null) {
                }
                charlie322.alpha();
                str7 = iVar22.bravo;
                if (!str7.startsWith("1:")) {
                }
                if (parseLong > 0) {
                }
                c2293d = new C2293d(j522, str, str92, enumC2291b22, packageName2, str3, i1122, i4, str2, str4, str5);
            }
            if (c2293d != null) {
                try {
                    ((E5.q) fVar).alpha("FCM_CLIENT_EVENT_LOGGING", new B5.c("proto"), new com.google.firebase.messaging.l(i5)).alpha(new B5.a(new C2294e(c2293d), B5.d.alpha, new B5.b(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)))), new A8.a(9));
                } catch (RuntimeException e13) {
                    Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e13);
                }
            }
        }
    }

    public static void charlie(Bundle bundle, String str) {
        String str2;
        try {
            B7.g.charlie();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            String str3 = null;
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException e) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e);
                }
            }
            if (bundle.containsKey("google.c.a.udt")) {
                str3 = bundle.getString("google.c.a.udt");
            }
            if (str3 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(str3));
                } catch (NumberFormatException e4) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e4);
                }
            }
            if (com.google.android.material.internal.s.jade(bundle)) {
                str2 = "display";
            } else {
                str2 = Column.DATA;
            }
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            F7.b bVar = (F7.b) B7.g.charlie().bravo(F7.b.class);
            if (bVar != null) {
                ((F7.c) bVar).alpha(PushConstants.FCM_DELIVERY_TYPE, str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static boolean delta(Intent intent) {
        Bundle extras;
        if (intent == null || FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }
}
