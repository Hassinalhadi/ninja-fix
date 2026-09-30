package x6;

import V5.x;
import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.maps.android.BuildConfig;
import h6.BinderC1814d;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import q6.w;
import q6.z;
import t6.AbstractC2997g3;
import t6.D3;
import t6.T3;

/* loaded from: classes2.dex */
public abstract class l {
    public static boolean alpha = false;
    public static int bravo = 1;

    public static final zd.h alpha(String str) {
        Intrinsics.echo(str, "<this>");
        return new zd.h(str);
    }

    public static String bravo(int i4) {
        ArrayList arrayList = new ArrayList();
        if ((i4 & 4) != 0) {
            arrayList.add("IMAGE_CAPTURE");
        }
        if ((i4 & 1) != 0) {
            arrayList.add("PREVIEW");
        }
        if ((i4 & 2) != 0) {
            arrayList.add("VIDEO_CAPTURE");
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            while (true) {
                sb2.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb2.append((CharSequence) "|");
            }
        }
        return sb2.toString();
    }

    public static synchronized int charlie(Context context) {
        String str;
        synchronized (l.class) {
            try {
                x.india(context, "Context is null");
                Log.d("l", "preferredRenderer: ".concat(BuildConfig.TRAVIS));
                if (!alpha) {
                    try {
                        y6.f bravo2 = D3.bravo(context);
                        try {
                            y6.b magenta = bravo2.magenta();
                            x.hotel(magenta);
                            AbstractC2997g3.alpha = magenta;
                            z ochre = bravo2.ochre();
                            if (T3.alpha == null) {
                                x.india(ochre, "delegate must not be null");
                                T3.alpha = ochre;
                            }
                            alpha = true;
                            try {
                                Parcel delta = bravo2.delta(bravo2.ivory(), 9);
                                int readInt = delta.readInt();
                                delta.recycle();
                                if (readInt == 2) {
                                    bravo = 2;
                                }
                                BinderC1814d binderC1814d = new BinderC1814d(context);
                                Parcel ivory = bravo2.ivory();
                                w.delta(ivory, binderC1814d);
                                ivory.writeInt(0);
                                bravo2.lavender(ivory, 10);
                            } catch (RemoteException e) {
                                Log.e("l", "Failed to retrieve renderer type or log initialization.", e);
                            }
                            int i4 = bravo;
                            if (i4 != 1) {
                                if (i4 != 2) {
                                    str = BuildConfig.TRAVIS;
                                } else {
                                    str = "LATEST";
                                }
                            } else {
                                str = "LEGACY";
                            }
                            Log.d("l", "loadedRenderer: ".concat(str));
                        } catch (RemoteException e4) {
                            throw new RuntimeRemoteException(e4);
                        }
                    } catch (GooglePlayServicesNotAvailableException e5) {
                        return e5.errorCode;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return 0;
    }
}
