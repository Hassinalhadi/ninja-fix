package com.google.android.gms.common;

import T5.ag;
import T5.aj;
import T5.u;
import T5.v;
import V5.x;
import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.fragment.app.L;
import androidx.fragment.app.an;
import ao.ad;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.product_config.CTProductConfigConstants;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.internal.measurement.ai;
import com.google.android.gms.tasks.Task;
import com.google.errorprone.annotations.RestrictedInheritance;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import e6.AbstractC1630b;
import f1.t;
import g6.AbstractC1753a;
import java.util.ArrayList;
import java.util.Arrays;
import m6.InterfaceC2102c;
import m6.InterfaceC2103d;
import s6.V4;

@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", allowlistAnnotations = {InterfaceC2102c.class, InterfaceC2103d.class}, explanation = "Sub classing of GMS Core's APIs are restricted to GMS Core client libs and testing fakes.", link = "go/gmscore-restrictedinheritance")
/* loaded from: classes2.dex */
public class GoogleApiAvailability extends d {
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    private String zac;
    private static final Object zaa = new Object();
    private static final GoogleApiAvailability zab = new GoogleApiAvailability();
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = d.GOOGLE_PLAY_SERVICES_VERSION_CODE;

    public static GoogleApiAvailability getInstance() {
        return zab;
    }

    public static final Task zai(com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.k... kVarArr) {
        T5.e eVar;
        x.india(kVar, "Requested API must not be null.");
        for (com.google.android.gms.common.api.k kVar2 : kVarArr) {
            x.india(kVar2, "Requested API must not be null.");
        }
        ArrayList arrayList = new ArrayList(kVarArr.length + 1);
        arrayList.add(kVar);
        arrayList.addAll(Arrays.asList(kVarArr));
        synchronized (T5.e.romeo) {
            x.india(T5.e.sierra, "Must guarantee manager is non-null before using getInstance");
            eVar = T5.e.sierra;
        }
        eVar.getClass();
        ag agVar = new ag(arrayList);
        ai aiVar = eVar.november;
        aiVar.sendMessage(aiVar.obtainMessage(2, agVar));
        return agVar.charlie.alpha;
    }

    public Task checkApiAvailability(com.google.android.gms.common.api.g gVar, com.google.android.gms.common.api.g... gVarArr) {
        return zai(gVar, gVarArr).kilo(h.red);
    }

    public int getClientVersion(Context context) {
        return e.getClientVersion(context);
    }

    public Dialog getErrorDialog(Activity activity, int i4, int i5) {
        return getErrorDialog(activity, i4, i5, (DialogInterface.OnCancelListener) null);
    }

    @Override // com.google.android.gms.common.d
    public Intent getErrorResolutionIntent(Context context, int i4, String str) {
        return super.getErrorResolutionIntent(context, i4, str);
    }

    public PendingIntent getErrorResolutionPendingIntent(Context context, ConnectionResult connectionResult) {
        PendingIntent pendingIntent;
        int i4 = connectionResult.purple;
        return (i4 == 0 || (pendingIntent = connectionResult.red) == null) ? getErrorResolutionPendingIntent(context, i4, 0) : pendingIntent;
    }

    public final String getErrorString(int i4) {
        int i5 = e.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        return ConnectionResult.E(i4);
    }

    @Override // com.google.android.gms.common.d
    @ResultIgnorabilityUnspecified
    public int isGooglePlayServicesAvailable(Context context) {
        return isGooglePlayServicesAvailable(context, d.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    public final boolean isUserResolvableError(int i4) {
        int i5 = e.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        if (i4 == 1 || i4 == 2 || i4 == 3 || i4 == 9) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [T5.x, T5.aj] */
    public Task makeGooglePlayServicesAvailable(Activity activity) {
        T5.x xVar;
        int i4 = GOOGLE_PLAY_SERVICES_VERSION_CODE;
        if (Looper.getMainLooper() == Looper.myLooper()) {
            int isGooglePlayServicesAvailable = isGooglePlayServicesAvailable(activity, i4);
            if (isGooglePlayServicesAvailable == 0) {
                return V4.echo(null);
            }
            T5.h bravo = aj.bravo(activity);
            T5.x xVar2 = (T5.x) bravo.alpha(T5.x.class, "GmsAvailabilityHelper");
            if (xVar2 != null) {
                boolean india = xVar2.white.alpha.india();
                xVar = xVar2;
                if (india) {
                    xVar2.white = new G6.h();
                    xVar = xVar2;
                }
            } else {
                ?? ajVar = new aj(bravo, getInstance());
                ajVar.white = new G6.h();
                bravo.delta("GmsAvailabilityHelper", ajVar);
                xVar = ajVar;
            }
            xVar.juliet(new ConnectionResult(isGooglePlayServicesAvailable, null), 0);
            return xVar.white.alpha;
        }
        throw new IllegalStateException("makeGooglePlayServicesAvailable must be called from the main thread");
    }

    @TargetApi(26)
    public void setDefaultNotificationChannelId(Context context, String str) {
        NotificationChannel notificationChannel;
        if (AbstractC1630b.delta()) {
            Object systemService = context.getSystemService("notification");
            x.hotel(systemService);
            notificationChannel = ((NotificationManager) systemService).getNotificationChannel(str);
            x.hotel(notificationChannel);
        }
        synchronized (zaa) {
            this.zac = str;
        }
    }

    @ResultIgnorabilityUnspecified
    public boolean showErrorDialogFragment(Activity activity, int i4, int i5) {
        return showErrorDialogFragment(activity, i4, i5, (DialogInterface.OnCancelListener) null);
    }

    public void showErrorNotification(Context context, int i4) {
        zae(context, i4, null, getErrorResolutionPendingIntent(context, i4, 0, CTProductConfigConstants.PRODUCT_CONFIG_JSON_KEY_FOR_KEY));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Dialog zaa(Context context, int i4, V5.q qVar, DialogInterface.OnCancelListener onCancelListener, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder = null;
        if (i4 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(V5.n.charlie(i4, context));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String bravo = V5.n.bravo(i4, context);
        if (bravo != null) {
            if (qVar == null) {
                qVar = onClickListener;
            }
            builder.setPositiveButton(bravo, qVar);
        }
        String delta = V5.n.delta(i4, context);
        if (delta != null) {
            builder.setTitle(delta);
        }
        Log.w("GoogleApiAvailability", ad.zulu(i4, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public final Dialog zab(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(V5.n.charlie(18, activity));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        zad(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    @ResultIgnorabilityUnspecified
    public final v zac(Context context, u uVar) {
        int i4;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        v vVar = new v(uVar);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 33) {
            if (i5 >= 33) {
                i4 = 2;
            } else {
                i4 = 0;
            }
            context.registerReceiver(vVar, intentFilter, i4);
        } else {
            context.registerReceiver(vVar, intentFilter);
        }
        vVar.alpha = context;
        if (!isUninstalledAppPossiblyUpdating(context, "com.google.android.gms")) {
            T5.ai aiVar = (T5.ai) uVar;
            aj ajVar = (aj) aiVar.bravo.red;
            ajVar.red.set(null);
            ajVar.india();
            Dialog dialog = aiVar.alpha;
            if (dialog.isShowing()) {
                dialog.dismiss();
            }
            synchronized (vVar) {
                try {
                    Context context2 = vVar.alpha;
                    if (context2 != null) {
                        context2.unregisterReceiver(vVar);
                    }
                    vVar.alpha = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return null;
        }
        return vVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.android.gms.common.b, android.app.DialogFragment] */
    public final void zad(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof an) {
                L supportFragmentManager = ((an) activity).getSupportFragmentManager();
                g gVar = new g();
                x.india(dialog, "Cannot display null dialog");
                dialog.setOnCancelListener(null);
                dialog.setOnDismissListener(null);
                gVar.f6639j = dialog;
                if (onCancelListener != null) {
                    gVar.f6640k = onCancelListener;
                }
                gVar.romeo(supportFragmentManager, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        ?? dialogFragment = new DialogFragment();
        x.india(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        dialogFragment.alpha = dialog;
        if (onCancelListener != null) {
            dialogFragment.purple = onCancelListener;
        }
        dialogFragment.show(fragmentManager, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [f1.q, f1.t] */
    @TargetApi(20)
    public final void zae(Context context, int i4, String str, PendingIntent pendingIntent) {
        String delta;
        String echo;
        int i5;
        String str2;
        NotificationChannel notificationChannel;
        CharSequence name;
        Log.w("GoogleApiAvailability", av.q.delta(i4, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i4 == 18) {
            zaf(context);
            return;
        }
        if (pendingIntent == null) {
            if (i4 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        if (i4 == 6) {
            delta = V5.n.foxtrot(context, "common_google_play_services_resolution_required_title");
        } else {
            delta = V5.n.delta(i4, context);
        }
        if (delta == null) {
            delta = context.getResources().getString(delivery.samurai.android.R.string.common_google_play_services_notification_ticker);
        }
        if (i4 != 6 && i4 != 19) {
            echo = V5.n.charlie(i4, context);
        } else {
            echo = V5.n.echo(context, "common_google_play_services_resolution_required_text", V5.n.alpha(context));
        }
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        x.hotel(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        f1.s sVar = new f1.s(context, null);
        sVar.november = true;
        sVar.charlie(16, true);
        sVar.echo = f1.s.bravo(delta);
        ?? tVar = new t();
        tVar.delta = f1.s.bravo(echo);
        sVar.foxtrot(tVar);
        PackageManager packageManager = context.getPackageManager();
        if (AbstractC1630b.charlie == null) {
            AbstractC1630b.charlie = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (AbstractC1630b.charlie.booleanValue()) {
            sVar.xray.icon = context.getApplicationInfo().icon;
            sVar.juliet = 2;
            if (AbstractC1630b.foxtrot(context)) {
                sVar.bravo.add(new f1.m(delivery.samurai.android.R.drawable.common_full_open_on_phone, resources.getString(delivery.samurai.android.R.string.common_open_on_phone), pendingIntent));
            } else {
                sVar.golf = pendingIntent;
            }
        } else {
            sVar.xray.icon = R.drawable.stat_sys_warning;
            String string = resources.getString(delivery.samurai.android.R.string.common_google_play_services_notification_ticker);
            sVar.xray.tickerText = f1.s.bravo(string);
            sVar.xray.when = System.currentTimeMillis();
            sVar.golf = pendingIntent;
            sVar.foxtrot = f1.s.bravo(echo);
        }
        if (AbstractC1630b.delta()) {
            x.kilo(AbstractC1630b.delta());
            synchronized (zaa) {
                str2 = this.zac;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String string2 = context.getResources().getString(delivery.samurai.android.R.string.common_google_play_services_notification_channel_name);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(c.echo(string2));
                } else {
                    name = notificationChannel.getName();
                    if (!string2.contentEquals(name)) {
                        notificationChannel.setName(string2);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
            }
            sVar.uniform = str2;
        }
        Notification alpha = sVar.alpha();
        if (i4 != 1 && i4 != 2 && i4 != 3) {
            i5 = 39789;
        } else {
            e.sCanceledAvailabilityNotification.set(false);
            i5 = 10436;
        }
        notificationManager.notify(i5, alpha);
    }

    public final void zaf(Context context) {
        new j(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    @ResultIgnorabilityUnspecified
    public final boolean zag(Activity activity, T5.h hVar, int i4, int i5, DialogInterface.OnCancelListener onCancelListener) {
        Dialog zaa2 = zaa(activity, i4, new V5.p(getErrorResolutionIntent(activity, i4, Constants.INAPP_DATA_TAG), hVar), onCancelListener, null);
        if (zaa2 == null) {
            return false;
        }
        zad(activity, zaa2, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    public final boolean zah(Context context, ConnectionResult connectionResult, int i4) {
        PendingIntent errorResolutionPendingIntent;
        if (AbstractC1753a.alpha(context) || (errorResolutionPendingIntent = getErrorResolutionPendingIntent(context, connectionResult)) == null) {
            return false;
        }
        int i5 = connectionResult.purple;
        int i10 = GoogleApiActivity.purple;
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", errorResolutionPendingIntent);
        intent.putExtra("failing_client_id", i4);
        intent.putExtra("notify_manager", true);
        zae(context, i5, null, PendingIntent.getActivity(context, 0, intent, m6.g.alpha | 134217728));
        return true;
    }

    public Dialog getErrorDialog(Activity activity, int i4, int i5, DialogInterface.OnCancelListener onCancelListener) {
        return zaa(activity, i4, new V5.o(getErrorResolutionIntent(activity, i4, Constants.INAPP_DATA_TAG), activity, i5, 0), onCancelListener, null);
    }

    @Override // com.google.android.gms.common.d
    public int isGooglePlayServicesAvailable(Context context, int i4) {
        return super.isGooglePlayServicesAvailable(context, i4);
    }

    @ResultIgnorabilityUnspecified
    public boolean showErrorDialogFragment(Activity activity, int i4, int i5, DialogInterface.OnCancelListener onCancelListener) {
        Dialog errorDialog = getErrorDialog(activity, i4, i5, onCancelListener);
        if (errorDialog == null) {
            return false;
        }
        zad(activity, errorDialog, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    public Task checkApiAvailability(com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.k... kVarArr) {
        return zai(kVar, kVarArr).kilo(h.purple);
    }

    public void showErrorNotification(Context context, ConnectionResult connectionResult) {
        zae(context, connectionResult.purple, null, getErrorResolutionPendingIntent(context, connectionResult));
    }

    @Override // com.google.android.gms.common.d
    public PendingIntent getErrorResolutionPendingIntent(Context context, int i4, int i5) {
        return getErrorResolutionPendingIntent(context, i4, i5, null);
    }

    public boolean showErrorDialogFragment(Activity activity, int i4, ah.b bVar, DialogInterface.OnCancelListener onCancelListener) {
        Dialog zaa2 = zaa(activity, i4, null, onCancelListener, new i(this, activity, i4, bVar));
        if (zaa2 == null) {
            return false;
        }
        zad(activity, zaa2, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    public Dialog getErrorDialog(androidx.fragment.app.ai aiVar, int i4, int i5) {
        return getErrorDialog(aiVar, i4, i5, (DialogInterface.OnCancelListener) null);
    }

    public Dialog getErrorDialog(androidx.fragment.app.ai aiVar, int i4, int i5, DialogInterface.OnCancelListener onCancelListener) {
        return zaa(aiVar.requireContext(), i4, new V5.o(getErrorResolutionIntent(aiVar.requireContext(), i4, Constants.INAPP_DATA_TAG), aiVar, i5, 1), onCancelListener, null);
    }
}
