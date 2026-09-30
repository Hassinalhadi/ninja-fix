package s6;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.AbstractC1394y;
import com.google.android.gms.internal.mlkit_vision_barcode.zzan;
import com.google.android.gms.internal.mlkit_vision_barcode.zzu;
import h6.BinderC1814d;

/* renamed from: s6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2610b extends AbstractC1394y {
    public final zzu[] magenta(BinderC1814d binderC1814d, zzan zzanVar) {
        Parcel ivory = ivory();
        AbstractC2798w.alpha(ivory, binderC1814d);
        ivory.writeInt(1);
        zzanVar.writeToParcel(ivory, 0);
        Parcel jade = jade(ivory, 1);
        zzu[] zzuVarArr = (zzu[]) jade.createTypedArray(zzu.CREATOR);
        jade.recycle();
        return zzuVarArr;
    }
}
