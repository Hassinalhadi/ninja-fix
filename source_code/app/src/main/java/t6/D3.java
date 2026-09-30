package t6;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.internal.measurement.AbstractC1394y;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.maps.android.BuildConfig;
import h6.BinderC1814d;
import i6.C1894c;

/* loaded from: classes2.dex */
public abstract class D3 {
    public static Context alpha;
    public static y6.f bravo;

    public static boolean alpha(byte b2) {
        if (b2 > -65) {
            return true;
        }
        return false;
    }

    public static y6.f bravo(Context context) {
        V5.x.hotel(context);
        Log.d("D3", "preferredRenderer: ".concat(BuildConfig.TRAVIS));
        y6.f fVar = bravo;
        if (fVar == null) {
            int isGooglePlayServicesAvailable = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context, 13400000);
            if (isGooglePlayServicesAvailable == 0) {
                y6.f delta = delta(0, context);
                bravo = delta;
                try {
                    Parcel delta2 = delta.delta(delta.ivory(), 9);
                    int readInt = delta2.readInt();
                    delta2.recycle();
                    String packageName = context.getPackageName();
                    if (readInt == 2 && !packageName.equals("com.google.android.apps.photos")) {
                        Log.d("D3", "early loading native code");
                        try {
                            y6.f fVar2 = bravo;
                            BinderC1814d binderC1814d = new BinderC1814d(charlie(0, context));
                            Parcel ivory = fVar2.ivory();
                            q6.w.delta(ivory, binderC1814d);
                            fVar2.lavender(ivory, 11);
                        } catch (RemoteException e) {
                            throw new RuntimeRemoteException(e);
                        } catch (UnsatisfiedLinkError unused) {
                            Log.w("D3", "Caught UnsatisfiedLinkError attempting to load the LATEST renderer's native library. Attempting to use the LEGACY renderer instead.");
                            alpha = null;
                            bravo = delta(1, context);
                        }
                    } else {
                        Log.d("D3", "not early loading native code");
                    }
                    try {
                        y6.f fVar3 = bravo;
                        BinderC1814d binderC1814d2 = new BinderC1814d(charlie(0, context).getResources());
                        Parcel ivory2 = fVar3.ivory();
                        q6.w.delta(ivory2, binderC1814d2);
                        ivory2.writeInt(19020000);
                        fVar3.lavender(ivory2, 6);
                        return bravo;
                    } catch (RemoteException e4) {
                        throw new RuntimeRemoteException(e4);
                    }
                } catch (RemoteException e5) {
                    throw new RuntimeRemoteException(e5);
                }
            }
            throw new GooglePlayServicesNotAvailableException(isGooglePlayServicesAvailable);
        }
        return fVar;
    }

    public static Context charlie(int i4, Context context) {
        String str;
        Context remoteContext;
        Context context2 = alpha;
        if (context2 == null) {
            if (i4 == 1) {
                str = "com.google.android.gms.maps_legacy_dynamite";
            } else {
                str = "com.google.android.gms.maps_core_dynamite";
            }
            try {
                remoteContext = C1894c.charlie(context, C1894c.bravo, str).alpha;
            } catch (Exception e) {
                if (!str.equals("com.google.android.gms.maps_dynamite")) {
                    try {
                        Log.d("D3", "Attempting to load maps_dynamite again.");
                        remoteContext = C1894c.charlie(context, C1894c.bravo, "com.google.android.gms.maps_dynamite").alpha;
                    } catch (Exception e4) {
                        Log.e("D3", "Failed to load maps module, use pre-Chimera", e4);
                        remoteContext = GooglePlayServicesUtil.getRemoteContext(context);
                    }
                } else {
                    Log.e("D3", "Failed to load maps module, use pre-Chimera", e);
                    remoteContext = GooglePlayServicesUtil.getRemoteContext(context);
                }
            }
            alpha = remoteContext;
            if (remoteContext != null) {
                return remoteContext;
            }
            throw new RuntimeException("Unable to load maps module, maps container context is null");
        }
        return context2;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [y6.f, com.google.android.gms.internal.measurement.y] */
    public static y6.f delta(int i4, Context context) {
        Log.i("D3", "Making Creator dynamically");
        ClassLoader classLoader = charlie(i4, context).getClassLoader();
        try {
            V5.x.hotel(classLoader);
            Class<?> loadClass = classLoader.loadClass("com.google.android.gms.maps.internal.CreatorImpl");
            try {
                IBinder iBinder = (IBinder) loadClass.newInstance();
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                    if (queryLocalInterface instanceof y6.f) {
                        return (y6.f) queryLocalInterface;
                    }
                    return new AbstractC1394y(iBinder, "com.google.android.gms.maps.internal.ICreator", 4);
                }
                throw new RuntimeException("Unable to load maps module, IBinder for com.google.android.gms.maps.internal.CreatorImpl is null");
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Unable to call the default constructor of ".concat(loadClass.getName()), e);
            } catch (InstantiationException e4) {
                throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(loadClass.getName()), e4);
            }
        } catch (ClassNotFoundException e5) {
            throw new IllegalStateException("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl", e5);
        }
    }
}
