package com.clevertap.android.sdk.pushnotification;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Icon;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.R;
import com.clevertap.android.sdk.Utils;
import com.clevertap.android.sdk.interfaces.AudibleNotification;
import com.clevertap.android.sdk.network.DownloadedBitmap;
import com.clevertap.android.sdk.network.DownloadedBitmapFactory;
import com.clevertap.android.sdk.utils.Clock;
import f1.p;
import f1.s;
import f1.t;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public class CoreNotificationRenderer implements INotificationRenderer, AudibleNotification {
    private String notifMessage;
    private String notifTitle;
    private int smallIcon;

    private void addContentDescriptionIfNeeded(t tVar, Bundle bundle, Context context) {
        if (Build.VERSION.SDK_INT >= 31 && (tVar instanceof p)) {
            ((p) tVar).golf = bundle.getString(Constants.WZRK_BIG_PICTURE_ALT_TEXT_KEY, context.getString(R.string.ct_notification_big_picture_alt_text));
        }
    }

    @SuppressLint({"NotificationTrampoline"})
    private s finalizeBuilder(s sVar, Bundle bundle, Context context, CleverTapInstanceConfig cleverTapInstanceConfig, t tVar) {
        if (Build.VERSION.SDK_INT >= 26 && bundle.containsKey(Constants.WZRK_SUBTITLE)) {
            String string = bundle.getString(Constants.WZRK_SUBTITLE);
            sVar.getClass();
            sVar.mike = s.bravo(string);
        }
        if (bundle.containsKey(Constants.WZRK_COLOR)) {
            sVar.sierra = Color.parseColor(bundle.getString(Constants.WZRK_COLOR));
            sVar.oscar = true;
            sVar.papa = true;
        }
        String str = this.notifTitle;
        sVar.getClass();
        sVar.echo = s.bravo(str);
        sVar.foxtrot = s.bravo(this.notifMessage);
        sVar.golf = LaunchPendingIntentFactory.getLaunchPendingIntent(bundle, context);
        sVar.charlie(16, true);
        sVar.foxtrot(tVar);
        sVar.xray.icon = this.smallIcon;
        String string2 = bundle.getString(Constants.NOTIF_ICON);
        if (!"true".equalsIgnoreCase(bundle.getString(Constants.NOTIF_HIDE_APP_LARGE_ICON))) {
            sVar.delta(Utils.getNotificationBitmapWithTimeout(string2, true, context, cleverTapInstanceConfig, Constants.PN_LARGE_ICON_DOWNLOAD_TIMEOUT_IN_MILLIS).getBitmap());
        }
        return sVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [f1.p, f1.t] */
    /* JADX WARN: Type inference failed for: r5v4, types: [f1.p, f1.t] */
    /* JADX WARN: Type inference failed for: r9v2, types: [f1.q, f1.t] */
    private t generateStyle(Bundle bundle, Context context, CleverTapInstanceConfig cleverTapInstanceConfig) {
        Uri notificationGifUri;
        String string = bundle.getString(Constants.WZRK_BIG_PICTURE);
        String string2 = bundle.getString(Constants.WZRK_GIF);
        String string3 = bundle.getString(Constants.WZRK_MSG_SUMMARY, this.notifMessage);
        try {
            if (Build.VERSION.SDK_INT >= 34 && string2 != null && string2.startsWith("http") && (notificationGifUri = getNotificationGifUri(string2, context, cleverTapInstanceConfig)) != null) {
                ?? tVar = new t();
                tVar.bravo = s.bravo(string3);
                tVar.charlie = true;
                tVar.charlie(Icon.createWithContentUri(notificationGifUri));
                addContentDescriptionIfNeeded(tVar, bundle, context);
                bundle.putString(Constants.WZRK_BPDS, DownloadedBitmap.Status.GIF_SUCCESS.getStatusValue());
                return tVar;
            }
        } catch (Exception e) {
            cleverTapInstanceConfig.getLogger().verbose(cleverTapInstanceConfig.getAccountId(), "Failed to load GIF, falling back to static big-picture", e);
        }
        DownloadedBitmap notificationImageBitmap = getNotificationImageBitmap(string, context, cleverTapInstanceConfig);
        bundle.putString(Constants.WZRK_BPDS, notificationImageBitmap.getStatus().getStatusValue());
        try {
            Bitmap bitmap = notificationImageBitmap.getBitmap();
            if (bitmap != null) {
                ?? tVar2 = new t();
                tVar2.bravo = s.bravo(string3);
                tVar2.charlie = true;
                IconCompat iconCompat = new IconCompat(1);
                iconCompat.bravo = bitmap;
                tVar2.delta = iconCompat;
                addContentDescriptionIfNeeded(tVar2, bundle, context);
                return tVar2;
            }
        } catch (Exception e4) {
            cleverTapInstanceConfig.getLogger().verbose(cleverTapInstanceConfig.getAccountId(), "Failed to load Big Picture, falling back to text notification", e4);
        }
        ?? tVar3 = new t();
        tVar3.delta = s.bravo(this.notifMessage);
        return tVar3;
    }

    private Uri getNotificationGifUri(String str, Context context, CleverTapInstanceConfig cleverTapInstanceConfig) {
        return Utils.getNotificationGifURI(str, context, cleverTapInstanceConfig, Clock.SYSTEM);
    }

    private DownloadedBitmap getNotificationImageBitmap(String str, Context context, CleverTapInstanceConfig cleverTapInstanceConfig) {
        if (str != null && str.startsWith("http")) {
            DownloadedBitmap nullBitmapWithStatus = DownloadedBitmapFactory.INSTANCE.nullBitmapWithStatus(DownloadedBitmap.Status.INIT_ERROR);
            try {
                nullBitmapWithStatus = Utils.getNotificationBitmapWithTimeout(str, false, context, cleverTapInstanceConfig, 5000L);
                if (nullBitmapWithStatus.getBitmap() != null) {
                    long downloadTime = nullBitmapWithStatus.getDownloadTime();
                    cleverTapInstanceConfig.getLogger().verbose("Fetched big picture in " + downloadTime + " millis");
                    return nullBitmapWithStatus;
                }
                return nullBitmapWithStatus;
            } catch (Throwable th) {
                cleverTapInstanceConfig.getLogger().verbose(cleverTapInstanceConfig.getAccountId(), "Falling back to big text notification, couldn't fetch big picture", th);
                return nullBitmapWithStatus;
            }
        }
        return DownloadedBitmapFactory.INSTANCE.nullBitmapWithStatus(DownloadedBitmap.Status.NO_IMAGE);
    }

    public void addActions(Bundle bundle, Context context, s sVar, CleverTapInstanceConfig cleverTapInstanceConfig, int i4) {
        String string = bundle.getString(Constants.WZRK_ACTIONS);
        if (string != null) {
            try {
                a.alpha(this, context, bundle, i4, sVar, new JSONArray(string));
            } catch (Throwable th) {
                cleverTapInstanceConfig.getLogger().debug(cleverTapInstanceConfig.getAccountId(), "error parsing notification actions: " + th.getLocalizedMessage());
            }
        }
    }

    @Override // com.clevertap.android.sdk.pushnotification.INotificationRenderer
    public String getActionButtonIconKey() {
        return Constants.NOTIF_ICON;
    }

    @Override // com.clevertap.android.sdk.pushnotification.INotificationRenderer
    public Object getCollapseKey(Bundle bundle) {
        return bundle.get(Constants.WZRK_COLLAPSE);
    }

    @Override // com.clevertap.android.sdk.pushnotification.INotificationRenderer
    public String getMessage(Bundle bundle) {
        String string = bundle.getString(Constants.NOTIF_MSG);
        this.notifMessage = string;
        return string;
    }

    @Override // com.clevertap.android.sdk.pushnotification.INotificationRenderer
    public String getTitle(Bundle bundle, Context context) {
        String string = bundle.getString(Constants.NOTIF_TITLE, "");
        if (string.isEmpty()) {
            string = context.getApplicationInfo().name;
        }
        this.notifTitle = string;
        return string;
    }

    @Override // com.clevertap.android.sdk.pushnotification.INotificationRenderer
    public s renderNotification(Bundle bundle, Context context, s sVar, CleverTapInstanceConfig cleverTapInstanceConfig, int i4) {
        t generateStyle = generateStyle(bundle, context, cleverTapInstanceConfig);
        addActions(bundle, context, sVar, cleverTapInstanceConfig, i4);
        return finalizeBuilder(sVar, bundle, context, cleverTapInstanceConfig, generateStyle);
    }

    @Override // com.clevertap.android.sdk.pushnotification.INotificationRenderer
    public final /* synthetic */ s setActionButtons(Context context, Bundle bundle, int i4, s sVar, JSONArray jSONArray) {
        return a.alpha(this, context, bundle, i4, sVar, jSONArray);
    }

    @Override // com.clevertap.android.sdk.pushnotification.INotificationRenderer
    public void setSmallIcon(int i4, Context context) {
        this.smallIcon = i4;
    }

    @Override // com.clevertap.android.sdk.interfaces.AudibleNotification
    public s setSound(Context context, Bundle bundle, s sVar, CleverTapInstanceConfig cleverTapInstanceConfig) {
        Uri uri;
        try {
            if (bundle.containsKey(Constants.WZRK_SOUND)) {
                Object obj = bundle.get(Constants.WZRK_SOUND);
                if ((obj instanceof Boolean) && ((Boolean) obj).booleanValue()) {
                    uri = RingtoneManager.getDefaultUri(2);
                } else {
                    if (obj instanceof String) {
                        String str = (String) obj;
                        if (str.equals("true")) {
                            uri = RingtoneManager.getDefaultUri(2);
                        } else if (!str.isEmpty()) {
                            if (str.contains(".mp3") || str.contains(".ogg") || str.contains(".wav")) {
                                str = str.substring(0, str.length() - 4);
                            }
                            uri = Uri.parse("android.resource://" + context.getPackageName() + "/raw/" + str);
                        }
                    }
                    uri = null;
                }
                if (uri != null) {
                    sVar.echo(uri);
                    return sVar;
                }
            }
        } catch (Throwable th) {
            cleverTapInstanceConfig.getLogger().debug(cleverTapInstanceConfig.getAccountId(), "Could not process sound parameter", th);
        }
        return sVar;
    }
}
