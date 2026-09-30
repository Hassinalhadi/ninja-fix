package com.clevertap.android.sdk.pushnotification;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.ManifestInfo;
import com.clevertap.android.sdk.Utils;
import f1.m;
import f1.s;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class a {
    /* JADX WARN: Removed duplicated region for block: B:12:0x003f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ca A[Catch: all -> 0x00a9, TRY_ENTER, TryCatch #4 {all -> 0x00a9, blocks: (B:22:0x00b2, B:27:0x00c0, B:30:0x00ca, B:32:0x00d0, B:35:0x00da, B:41:0x00e8, B:44:0x00f0, B:50:0x00fe, B:52:0x0119, B:54:0x0140, B:78:0x011d, B:80:0x0123, B:81:0x0132, B:93:0x0090), top: B:21:0x00b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e8 A[Catch: all -> 0x00a9, TryCatch #4 {all -> 0x00a9, blocks: (B:22:0x00b2, B:27:0x00c0, B:30:0x00ca, B:32:0x00d0, B:35:0x00da, B:41:0x00e8, B:44:0x00f0, B:50:0x00fe, B:52:0x0119, B:54:0x0140, B:78:0x011d, B:80:0x0123, B:81:0x0132, B:93:0x0090), top: B:21:0x00b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fe A[Catch: all -> 0x00a9, TryCatch #4 {all -> 0x00a9, blocks: (B:22:0x00b2, B:27:0x00c0, B:30:0x00ca, B:32:0x00d0, B:35:0x00da, B:41:0x00e8, B:44:0x00f0, B:50:0x00fe, B:52:0x0119, B:54:0x0140, B:78:0x011d, B:80:0x0123, B:81:0x0132, B:93:0x0090), top: B:21:0x00b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0140 A[Catch: all -> 0x00a9, TRY_LEAVE, TryCatch #4 {all -> 0x00a9, blocks: (B:22:0x00b2, B:27:0x00c0, B:30:0x00ca, B:32:0x00d0, B:35:0x00da, B:41:0x00e8, B:44:0x00f0, B:50:0x00fe, B:52:0x0119, B:54:0x0140, B:78:0x011d, B:80:0x0123, B:81:0x0132, B:93:0x0090), top: B:21:0x00b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0178 A[Catch: all -> 0x0166, TRY_LEAVE, TryCatch #2 {all -> 0x0166, blocks: (B:57:0x015d, B:58:0x016b, B:60:0x0178), top: B:56:0x015d }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x011d A[Catch: all -> 0x00a9, TryCatch #4 {all -> 0x00a9, blocks: (B:22:0x00b2, B:27:0x00c0, B:30:0x00ca, B:32:0x00d0, B:35:0x00da, B:41:0x00e8, B:44:0x00f0, B:50:0x00fe, B:52:0x0119, B:54:0x0140, B:78:0x011d, B:80:0x0123, B:81:0x0132, B:93:0x0090), top: B:21:0x00b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static s alpha(INotificationRenderer iNotificationRenderer, Context context, Bundle bundle, int i4, s sVar, JSONArray jSONArray) {
        int i5;
        boolean z2;
        int identifier;
        boolean z10;
        Intent launchIntentForPackage;
        PendingIntent activity;
        boolean z11 = true;
        String intentServiceName = ManifestInfo.getInstance(context).getIntentServiceName();
        Class cls = CTNotificationIntentService.class;
        if (intentServiceName != null) {
            try {
                try {
                    cls = Class.forName(intentServiceName);
                } catch (ClassNotFoundException unused) {
                    String str = CTNotificationIntentService.MAIN_ACTION;
                }
            } catch (ClassNotFoundException unused2) {
                Logger.d("No Intent Service found");
                cls = null;
                boolean isServiceAvailable = Utils.isServiceAvailable(context, cls);
                if (jSONArray != null) {
                }
                return sVar;
            }
            boolean isServiceAvailable2 = Utils.isServiceAvailable(context, cls);
            if (jSONArray != null && jSONArray.length() > 0) {
                i5 = 0;
                while (i5 < jSONArray.length()) {
                    try {
                        JSONObject jSONObject = jSONArray.getJSONObject(i5);
                        String optString = jSONObject.optString("l");
                        String optString2 = jSONObject.optString("dl");
                        String optString3 = jSONObject.optString(iNotificationRenderer.getActionButtonIconKey());
                        String optString4 = jSONObject.optString(Constants.KEY_ID);
                        boolean optBoolean = jSONObject.optBoolean("ac", z11);
                        if (optString.isEmpty() || optString4.isEmpty()) {
                            z2 = z11;
                            Logger.d("not adding push notification action: action label or id missing");
                        } else {
                            try {
                                if (!optString3.isEmpty()) {
                                    try {
                                        z2 = z11;
                                        try {
                                            identifier = context.getResources().getIdentifier(optString3, "drawable", context.getPackageName());
                                        } catch (Throwable th) {
                                            th = th;
                                            Logger.d("unable to add notification action icon: " + th.getLocalizedMessage());
                                            identifier = 0;
                                            if (Build.VERSION.SDK_INT >= 31) {
                                            }
                                            z10 = false;
                                            String string = bundle.getString("pt_dismiss_on_click");
                                            if (!z10) {
                                            }
                                            if (!z10) {
                                            }
                                            if (z10) {
                                            }
                                            if (launchIntentForPackage != null) {
                                            }
                                            int nextInt = new Random().nextInt();
                                            if (z10) {
                                            }
                                            sVar.bravo.add(new m(identifier, optString, activity));
                                            i5++;
                                            z11 = z2;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        z2 = z11;
                                    }
                                    if (Build.VERSION.SDK_INT >= 31 && optBoolean && isServiceAvailable2) {
                                        z10 = z2;
                                    } else {
                                        z10 = false;
                                    }
                                    String string2 = bundle.getString("pt_dismiss_on_click");
                                    if (!z10 && PushNotificationHandler.isForPushTemplates(bundle) && optString4.contains("remind") && string2 != null && string2.equalsIgnoreCase("true") && optBoolean && isServiceAvailable2) {
                                        z10 = z2;
                                    }
                                    if (!z10 && PushNotificationHandler.isForPushTemplates(bundle) && string2 != null && string2.equalsIgnoreCase("true") && optBoolean && isServiceAvailable2) {
                                        z10 = z2;
                                    }
                                    if (z10) {
                                        launchIntentForPackage = new Intent(CTNotificationIntentService.MAIN_ACTION);
                                        launchIntentForPackage.setPackage(context.getPackageName());
                                        launchIntentForPackage.putExtra(Constants.KEY_CT_TYPE, CTNotificationIntentService.TYPE_BUTTON_CLICK);
                                        if (!optString2.isEmpty()) {
                                            launchIntentForPackage.putExtra("dl", optString2);
                                        }
                                    } else if (!optString2.isEmpty()) {
                                        launchIntentForPackage = new Intent("android.intent.action.VIEW", Uri.parse(optString2));
                                        Utils.setPackageNameFromResolveInfoList(context, launchIntentForPackage);
                                    } else {
                                        launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
                                    }
                                    if (launchIntentForPackage != null) {
                                        launchIntentForPackage.putExtras(bundle);
                                        launchIntentForPackage.removeExtra(Constants.WZRK_ACTIONS);
                                        launchIntentForPackage.putExtra("actionId", optString4);
                                        launchIntentForPackage.putExtra("autoCancel", optBoolean);
                                        launchIntentForPackage.putExtra(Constants.KEY_C2A, optString4);
                                        try {
                                            launchIntentForPackage.putExtra(Constants.PT_NOTIF_ID, i4);
                                            launchIntentForPackage.setFlags(603979776);
                                        } catch (Throwable th3) {
                                            th = th3;
                                            Logger.d("error adding notification action : " + th.getLocalizedMessage());
                                            i5++;
                                            z11 = z2;
                                        }
                                    }
                                    int nextInt2 = new Random().nextInt();
                                    if (z10) {
                                        activity = PendingIntent.getService(context, nextInt2, launchIntentForPackage, 201326592);
                                    } else {
                                        try {
                                            activity = PendingIntent.getActivity(context, nextInt2, launchIntentForPackage, 201326592, null);
                                        } catch (Throwable th4) {
                                            th = th4;
                                            Logger.d("error adding notification action : " + th.getLocalizedMessage());
                                            i5++;
                                            z11 = z2;
                                        }
                                    }
                                    sVar.bravo.add(new m(identifier, optString, activity));
                                } else {
                                    z2 = z11;
                                }
                                if (Build.VERSION.SDK_INT >= 31) {
                                }
                                z10 = false;
                                String string22 = bundle.getString("pt_dismiss_on_click");
                                if (!z10) {
                                    z10 = z2;
                                }
                                if (!z10) {
                                    z10 = z2;
                                }
                                if (z10) {
                                }
                                if (launchIntentForPackage != null) {
                                }
                                int nextInt22 = new Random().nextInt();
                                if (z10) {
                                }
                                sVar.bravo.add(new m(identifier, optString, activity));
                            } catch (Throwable th5) {
                                th = th5;
                            }
                            identifier = 0;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        z2 = z11;
                    }
                    i5++;
                    z11 = z2;
                }
            }
            return sVar;
        }
        try {
            String str2 = CTNotificationIntentService.MAIN_ACTION;
        } catch (ClassNotFoundException unused3) {
            Logger.d("No Intent Service found");
            cls = null;
            boolean isServiceAvailable22 = Utils.isServiceAvailable(context, cls);
            if (jSONArray != null) {
            }
            return sVar;
        }
        boolean isServiceAvailable222 = Utils.isServiceAvailable(context, cls);
        if (jSONArray != null) {
            i5 = 0;
            while (i5 < jSONArray.length()) {
            }
        }
        return sVar;
    }
}
