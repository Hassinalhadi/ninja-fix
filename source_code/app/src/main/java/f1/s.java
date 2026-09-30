package f1;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.clevertap.android.sdk.Constants;
import delivery.samurai.android.R;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class s {
    public final Context alpha;
    public CharSequence echo;
    public CharSequence foxtrot;
    public PendingIntent golf;
    public IconCompat hotel;
    public int india;
    public int juliet;
    public t lima;
    public CharSequence mike;
    public boolean oscar;
    public boolean papa;
    public String quebec;
    public Bundle romeo;
    public String uniform;
    public final boolean whiskey;
    public final Notification xray;
    public final ArrayList yankee;
    public final ArrayList bravo = new ArrayList();
    public final ArrayList charlie = new ArrayList();
    public final ArrayList delta = new ArrayList();
    public boolean kilo = true;
    public boolean november = false;
    public int sierra = 0;
    public int tango = 0;
    public int victor = 0;

    public s(Context context, String str) {
        Notification notification = new Notification();
        this.xray = notification;
        this.alpha = context;
        this.uniform = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.juliet = 0;
        this.yankee = new ArrayList();
        this.whiskey = true;
    }

    public static CharSequence bravo(CharSequence charSequence) {
        if (charSequence == null) {
            return charSequence;
        }
        if (charSequence.length() > 5120) {
            return charSequence.subSequence(0, 5120);
        }
        return charSequence;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, J2.n] */
    public final Notification alpha() {
        boolean z2;
        boolean z10;
        boolean z11;
        Icon echo;
        Notification build;
        Bundle bundle;
        int i4;
        Bundle bundle2;
        int i5;
        ArrayList arrayList;
        Icon icon;
        Bundle bundle3;
        int i10;
        ?? obj = new Object();
        new ArrayList();
        obj.silver = new Bundle();
        obj.red = this;
        Context context = this.alpha;
        obj.alpha = context;
        if (Build.VERSION.SDK_INT >= 26) {
            obj.purple = v.alpha(context, this.uniform);
        } else {
            obj.purple = new Notification.Builder(this.alpha);
        }
        Notification notification = this.xray;
        Notification.Builder lights = ((Notification.Builder) obj.purple).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        boolean z12 = true;
        if ((notification.flags & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Notification.Builder ongoing = lights.setOngoing(z2);
        if ((notification.flags & 8) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Notification.Builder onlyAlertOnce = ongoing.setOnlyAlertOnce(z10);
        if ((notification.flags & 16) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Notification.Builder deleteIntent = onlyAlertOnce.setAutoCancel(z11).setDefaults(notification.defaults).setContentTitle(this.echo).setContentText(this.foxtrot).setContentInfo(null).setContentIntent(this.golf).setDeleteIntent(notification.deleteIntent);
        if ((notification.flags & 128) == 0) {
            z12 = false;
        }
        deleteIntent.setFullScreenIntent(null, z12).setNumber(this.india).setProgress(0, 0, false);
        Notification.Builder builder = (Notification.Builder) obj.purple;
        IconCompat iconCompat = this.hotel;
        if (iconCompat == null) {
            echo = null;
        } else {
            echo = iconCompat.echo(context);
        }
        builder.setLargeIcon(echo);
        ((Notification.Builder) obj.purple).setSubText(this.mike).setUsesChronometer(false).setPriority(this.juliet);
        Iterator it = this.bravo.iterator();
        while (it.hasNext()) {
            m mVar = (m) it.next();
            int i11 = Build.VERSION.SDK_INT;
            if (mVar.bravo == null && (i10 = mVar.echo) != 0) {
                mVar.bravo = IconCompat.bravo(i10, "");
            }
            IconCompat iconCompat2 = mVar.bravo;
            if (iconCompat2 != null) {
                icon = iconCompat2.echo(null);
            } else {
                icon = null;
            }
            Notification.Action.Builder builder2 = new Notification.Action.Builder(icon, mVar.foxtrot, mVar.golf);
            Bundle bundle4 = mVar.alpha;
            if (bundle4 != null) {
                bundle3 = new Bundle(bundle4);
            } else {
                bundle3 = new Bundle();
            }
            boolean z13 = mVar.charlie;
            bundle3.putBoolean("android.support.allowGeneratedReplies", z13);
            if (i11 >= 24) {
                u.bravo(builder2, z13);
            }
            bundle3.putInt("android.support.action.semanticAction", 0);
            if (i11 >= 28) {
                AbstractC1681a.bravo(builder2);
            }
            if (i11 >= 29) {
                AbstractC1687g.delta(builder2);
            }
            if (i11 >= 31) {
                w.alpha(builder2);
            }
            bundle3.putBoolean("android.support.action.showsUserInterface", mVar.delta);
            builder2.addExtras(bundle3);
            ((Notification.Builder) obj.purple).addAction(builder2.build());
        }
        Bundle bundle5 = this.romeo;
        if (bundle5 != null) {
            ((Bundle) obj.silver).putAll(bundle5);
        }
        int i12 = Build.VERSION.SDK_INT;
        ((Notification.Builder) obj.purple).setShowWhen(this.kilo);
        ((Notification.Builder) obj.purple).setLocalOnly(this.november);
        ((Notification.Builder) obj.purple).setGroup(null);
        ((Notification.Builder) obj.purple).setSortKey(null);
        ((Notification.Builder) obj.purple).setGroupSummary(false);
        ((Notification.Builder) obj.purple).setCategory(this.quebec);
        ((Notification.Builder) obj.purple).setColor(this.sierra);
        ((Notification.Builder) obj.purple).setVisibility(this.tango);
        ((Notification.Builder) obj.purple).setPublicVersion(null);
        ((Notification.Builder) obj.purple).setSound(notification.sound, notification.audioAttributes);
        ArrayList arrayList2 = this.yankee;
        ArrayList arrayList3 = this.charlie;
        if (i12 < 28) {
            if (arrayList3 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList3.size());
                Iterator it2 = arrayList3.iterator();
                if (it2.hasNext()) {
                    throw ao.ad.yankee(it2);
                }
            }
            if (arrayList != null) {
                if (arrayList2 == null) {
                    arrayList2 = arrayList;
                } else {
                    bv.f fVar = new bv.f(arrayList2.size() + arrayList.size());
                    fVar.addAll(arrayList);
                    fVar.addAll(arrayList2);
                    arrayList2 = new ArrayList(fVar);
                }
            }
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                ((Notification.Builder) obj.purple).addPerson((String) it3.next());
            }
        }
        ArrayList arrayList4 = this.delta;
        if (arrayList4.size() > 0) {
            if (this.romeo == null) {
                this.romeo = new Bundle();
            }
            Bundle bundle6 = this.romeo.getBundle("android.car.EXTENSIONS");
            if (bundle6 == null) {
                bundle6 = new Bundle();
            }
            Bundle bundle7 = new Bundle(bundle6);
            Bundle bundle8 = new Bundle();
            for (int i13 = 0; i13 < arrayList4.size(); i13++) {
                String num = Integer.toString(i13);
                m mVar2 = (m) arrayList4.get(i13);
                Bundle bundle9 = new Bundle();
                if (mVar2.bravo == null && (i5 = mVar2.echo) != 0) {
                    mVar2.bravo = IconCompat.bravo(i5, "");
                }
                IconCompat iconCompat3 = mVar2.bravo;
                if (iconCompat3 != null) {
                    i4 = iconCompat3.charlie();
                } else {
                    i4 = 0;
                }
                bundle9.putInt(Constants.KEY_ICON, i4);
                bundle9.putCharSequence(Constants.KEY_TITLE, mVar2.foxtrot);
                bundle9.putParcelable("actionIntent", mVar2.golf);
                Bundle bundle10 = mVar2.alpha;
                if (bundle10 != null) {
                    bundle2 = new Bundle(bundle10);
                } else {
                    bundle2 = new Bundle();
                }
                bundle2.putBoolean("android.support.allowGeneratedReplies", mVar2.charlie);
                bundle9.putBundle("extras", bundle2);
                bundle9.putParcelableArray("remoteInputs", null);
                bundle9.putBoolean("showsUserInterface", mVar2.delta);
                bundle9.putInt("semanticAction", 0);
                bundle8.putBundle(num, bundle9);
            }
            bundle6.putBundle("invisible_actions", bundle8);
            bundle7.putBundle("invisible_actions", bundle8);
            if (this.romeo == null) {
                this.romeo = new Bundle();
            }
            this.romeo.putBundle("android.car.EXTENSIONS", bundle6);
            ((Bundle) obj.silver).putBundle("android.car.EXTENSIONS", bundle7);
        }
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 24) {
            ((Notification.Builder) obj.purple).setExtras(this.romeo);
            u.charlie((Notification.Builder) obj.purple);
        }
        if (i14 >= 26) {
            v.bravo((Notification.Builder) obj.purple, this.victor);
            v.echo((Notification.Builder) obj.purple);
            v.foxtrot((Notification.Builder) obj.purple);
            v.golf((Notification.Builder) obj.purple);
            v.delta((Notification.Builder) obj.purple);
            if (this.papa) {
                v.charlie((Notification.Builder) obj.purple, this.oscar);
            }
            if (!TextUtils.isEmpty(this.uniform)) {
                ((Notification.Builder) obj.purple).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i14 >= 28) {
            Iterator it4 = arrayList3.iterator();
            if (it4.hasNext()) {
                throw ao.ad.yankee(it4);
            }
        }
        if (i14 >= 29) {
            AbstractC1687g.bravo((Notification.Builder) obj.purple, this.whiskey);
            AbstractC1687g.charlie((Notification.Builder) obj.purple);
        }
        if (i14 >= 36) {
            x.alpha((Notification.Builder) obj.purple);
        }
        s sVar = (s) obj.red;
        t tVar = sVar.lima;
        if (tVar != 0) {
            tVar.alpha(obj);
        }
        int i15 = Build.VERSION.SDK_INT;
        Notification.Builder builder3 = (Notification.Builder) obj.purple;
        if (i15 >= 26) {
            build = builder3.build();
        } else if (i15 >= 24) {
            build = builder3.build();
        } else {
            builder3.setExtras((Bundle) obj.silver);
            build = builder3.build();
        }
        if (tVar != 0) {
            sVar.lima.getClass();
        }
        if (tVar != 0 && (bundle = build.extras) != null) {
            if (tVar.charlie) {
                bundle.putCharSequence("android.summaryText", tVar.bravo);
            }
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", tVar.bravo());
        }
        return build;
    }

    public final void charlie(int i4, boolean z2) {
        Notification notification = this.xray;
        if (z2) {
            notification.flags = i4 | notification.flags;
        } else {
            notification.flags = (~i4) & notification.flags;
        }
    }

    public final void delta(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.alpha.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.kilo;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.bravo = bitmap;
            iconCompat = iconCompat2;
        }
        this.hotel = iconCompat;
    }

    public final void echo(Uri uri) {
        Notification notification = this.xray;
        notification.sound = uri;
        notification.audioStreamType = -1;
        notification.audioAttributes = r.alpha(r.delta(r.charlie(r.bravo(), 4), 5));
    }

    public final void foxtrot(t tVar) {
        if (this.lima != tVar) {
            this.lima = tVar;
            if (tVar != null && tVar.alpha != this) {
                tVar.alpha = this;
                foxtrot(tVar);
            }
        }
    }
}
