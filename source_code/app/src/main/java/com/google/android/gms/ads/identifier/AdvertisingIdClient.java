package com.google.android.gms.ads.identifier;

import V5.x;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.checkout.components.card.operations.network.utils.OkHttpConstants;
import com.checkout.components.card.utils.constants.ExpiryDateConstantsKt;
import com.checkout.components.redirecthandler.customtab.RedirectCustomTabEventLogger;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.e;
import com.google.android.gms.common.util.VisibleForTesting;
import d6.C1590a;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import l6.AbstractC2058a;
import l6.c;
import l6.d;

/* loaded from: classes2.dex */
public class AdvertisingIdClient {
    com.google.android.gms.common.a zza;
    d zzb;
    boolean zzc;
    final Object zzd;
    b zze;
    final long zzf;
    private final Context zzg;

    /* loaded from: classes2.dex */
    public static final class Info {
        private final String zza;
        private final boolean zzb;

        @Deprecated
        public Info(String str, boolean z2) {
            this.zza = str;
            this.zzb = z2;
        }

        public String getId() {
            return this.zza;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.zzb;
        }

        public String toString() {
            String str = this.zza;
            boolean z2 = this.zzb;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 7);
            sb2.append("{");
            sb2.append(str);
            sb2.append("}");
            sb2.append(z2);
            return sb2.toString();
        }
    }

    public AdvertisingIdClient(Context context) {
        this(context, OkHttpConstants.READ_TIMEOUT_MS, false, false);
    }

    public static Info getAdvertisingIdInfo(Context context) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, true, false);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            advertisingIdClient.zzb(false);
            Info zzd = advertisingIdClient.zzd(-1);
            advertisingIdClient.zzc(zzd, true, 0.0f, SystemClock.elapsedRealtime() - elapsedRealtime, "", null);
            return zzd;
        } finally {
        }
    }

    public static boolean getIsAdIdFakeForDebugLogging(Context context) throws IOException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, false, false);
        boolean z2 = false;
        try {
            advertisingIdClient.zzb(false);
            x.golf("Calling this from your main thread can lead to deadlock");
            synchronized (advertisingIdClient) {
                try {
                    if (!advertisingIdClient.zzc) {
                        synchronized (advertisingIdClient.zzd) {
                            b bVar = advertisingIdClient.zze;
                            if (bVar == null || !bVar.silver) {
                                throw new IOException("AdvertisingIdClient is not connected.");
                            }
                        }
                        try {
                            advertisingIdClient.zzb(false);
                            if (!advertisingIdClient.zzc) {
                                throw new IOException("AdvertisingIdClient cannot reconnect.");
                            }
                        } catch (Exception e) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                        }
                    }
                    x.hotel(advertisingIdClient.zza);
                    x.hotel(advertisingIdClient.zzb);
                    try {
                        l6.b bVar2 = (l6.b) advertisingIdClient.zzb;
                        bVar2.getClass();
                        Parcel obtain = Parcel.obtain();
                        obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                        Parcel bravo = bVar2.bravo(obtain, 6);
                        int i4 = AbstractC2058a.alpha;
                        if (bravo.readInt() != 0) {
                            z2 = true;
                        }
                        bravo.recycle();
                    } catch (RemoteException e4) {
                        Log.i("AdvertisingIdClient", "GMS remote exception ", e4);
                        throw new IOException("Remote exception");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            advertisingIdClient.zze();
            advertisingIdClient.zza();
            return z2;
        } catch (Throwable th2) {
            advertisingIdClient.zza();
            throw th2;
        }
    }

    public static void setShouldSkipGmsCoreVersionCheck(boolean z2) {
    }

    private final Info zzd(int i4) throws IOException {
        Info info;
        x.golf("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                boolean z2 = false;
                if (!this.zzc) {
                    synchronized (this.zzd) {
                        b bVar = this.zze;
                        if (bVar == null || !bVar.silver) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        zzb(false);
                        if (!this.zzc) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                    }
                }
                x.hotel(this.zza);
                x.hotel(this.zzb);
                try {
                    l6.b bVar2 = (l6.b) this.zzb;
                    bVar2.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    Parcel bravo = bVar2.bravo(obtain, 1);
                    String readString = bravo.readString();
                    bravo.recycle();
                    l6.b bVar3 = (l6.b) this.zzb;
                    bVar3.getClass();
                    Parcel obtain2 = Parcel.obtain();
                    obtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    int i5 = AbstractC2058a.alpha;
                    obtain2.writeInt(1);
                    Parcel bravo2 = bVar3.bravo(obtain2, 2);
                    if (bravo2.readInt() != 0) {
                        z2 = true;
                    }
                    bravo2.recycle();
                    info = new Info(readString, z2);
                } catch (RemoteException e4) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e4);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zze();
        return info;
    }

    private final void zze() {
        synchronized (this.zzd) {
            b bVar = this.zze;
            if (bVar != null) {
                bVar.red.countDown();
                try {
                    this.zze.join();
                } catch (InterruptedException unused) {
                }
            }
            long j5 = this.zzf;
            if (j5 > 0) {
                this.zze = new b(this, j5);
            }
        }
    }

    public final void finalize() throws Throwable {
        zza();
        super.finalize();
    }

    public Info getInfo() throws IOException {
        return zzd(-1);
    }

    public void start() throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        zzb(true);
    }

    public final void zza() {
        x.golf("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.zzg != null && this.zza != null) {
                    try {
                        if (this.zzc) {
                            C1590a.bravo().charlie(this.zzg, this.zza);
                        }
                    } catch (Throwable th) {
                        Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                    }
                    this.zzc = false;
                    this.zzb = null;
                    this.zza = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @VisibleForTesting
    public final void zzb(boolean z2) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        d bVar;
        x.golf("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.zzc) {
                    zza();
                }
                Context context = this.zzg;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int isGooglePlayServicesAvailable = com.google.android.gms.common.d.getInstance().isGooglePlayServicesAvailable(context, e.GOOGLE_PLAY_SERVICES_VERSION_CODE);
                    if (isGooglePlayServicesAvailable != 0 && isGooglePlayServicesAvailable != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    com.google.android.gms.common.a aVar = new com.google.android.gms.common.a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (C1590a.bravo().alpha(context, intent, aVar, 1)) {
                            this.zza = aVar;
                            try {
                                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                                IBinder alpha = aVar.alpha();
                                int i4 = c.golf;
                                IInterface queryLocalInterface = alpha.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                                if (queryLocalInterface instanceof d) {
                                    bVar = (d) queryLocalInterface;
                                } else {
                                    bVar = new l6.b(alpha);
                                }
                                this.zzb = bVar;
                                this.zzc = true;
                                if (z2) {
                                    zze();
                                }
                            } catch (InterruptedException unused) {
                                throw new IOException("Interrupted exception");
                            } catch (Throwable th) {
                                throw new IOException(th);
                            }
                        } else {
                            throw new IOException("Connection failure");
                        }
                    } finally {
                        IOException iOException = new IOException(th);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new GooglePlayServicesNotAvailableException(9);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @VisibleForTesting
    public final boolean zzc(Info info, boolean z2, float f5, long j5, String str, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap hashMap = new HashMap();
            String str2 = "1";
            hashMap.put("app_context", "1");
            if (info != null) {
                if (true != info.isLimitAdTrackingEnabled()) {
                    str2 = ExpiryDateConstantsKt.EXPIRY_DATE_PREFIX_ZERO;
                }
                hashMap.put("limit_ad_tracking", str2);
                String id2 = info.getId();
                if (id2 != null) {
                    hashMap.put("ad_id_size", Integer.toString(id2.length()));
                }
            }
            if (th != null) {
                hashMap.put(RedirectCustomTabEventLogger.RESULT_ERROR, th.getClass().getName());
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j5));
            new a(hashMap).start();
            return true;
        }
        return false;
    }

    @VisibleForTesting
    public AdvertisingIdClient(Context context, long j5, boolean z2, boolean z10) {
        Context applicationContext;
        this.zzd = new Object();
        x.hotel(context);
        if (z2 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.zzg = context;
        this.zzc = false;
        this.zzf = j5;
    }
}
