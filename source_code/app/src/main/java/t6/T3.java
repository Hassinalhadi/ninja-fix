package t6;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import h6.BinderC1814d;
import h6.InterfaceC1812b;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public abstract class T3 {
    public static q6.z alpha;

    public static final void alpha(T.s sVar, Function1 function1, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        int i10;
        int i11;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-932836462);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(sVar)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i5 = i11 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.india(function1)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i5 |= i10;
        }
        if ((i5 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i5 & 1, z2)) {
            AbstractC0538d.echo(androidx.compose.ui.draw.a.alpha(sVar, function1), c0585q);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ec.aa(i4, 11, sVar, function1);
        }
    }

    public static z6.b bravo(float f5) {
        try {
            q6.z zVar = alpha;
            V5.x.india(zVar, "IBitmapDescriptorFactory is not initialized");
            q6.x xVar = (q6.x) zVar;
            Parcel ivory = xVar.ivory();
            ivory.writeFloat(f5);
            Parcel delta = xVar.delta(ivory, 5);
            InterfaceC1812b lime = BinderC1814d.lime(delta.readStrongBinder());
            delta.recycle();
            return new z6.b(lime);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public static z6.b charlie(Bitmap bitmap) {
        V5.x.india(bitmap, "image must not be null");
        try {
            q6.z zVar = alpha;
            V5.x.india(zVar, "IBitmapDescriptorFactory is not initialized");
            q6.x xVar = (q6.x) zVar;
            Parcel ivory = xVar.ivory();
            q6.w.charlie(ivory, bitmap);
            Parcel delta = xVar.delta(ivory, 6);
            InterfaceC1812b lime = BinderC1814d.lime(delta.readStrongBinder());
            delta.recycle();
            return new z6.b(lime);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
