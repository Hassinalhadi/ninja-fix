package Y5;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.os.ResultReceiver;
import androidx.activity.result.IntentSenderRequest;
import com.canhub.cropper.CropImageOptions;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.server.converter.zac;
import com.google.android.gms.common.server.response.SafeParcelResponse;
import com.google.android.gms.common.server.response.zan;
import com.google.android.gms.identity.intents.UserAddressRequest;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.internal.identity.ClientIdentity;
import com.google.android.gms.internal.identity.zzeg;
import com.google.android.gms.internal.identity.zzek;
import com.google.android.gms.internal.identity.zzj;
import com.google.android.gms.internal.wallet.zze;
import com.google.android.gms.internal.wallet.zzi;
import com.google.android.gms.measurement.internal.zzai;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzov;
import com.google.android.gms.measurement.internal.zzpc;
import com.google.android.gms.measurement.internal.zzqb;
import com.google.android.material.internal.ParcelableSparseBooleanArray;
import com.google.firebase.messaging.RemoteMessage;
import com.google.firebase.perf.metrics.Counter;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class b implements Parcelable.Creator {
    public final /* synthetic */ int alpha;

    public /* synthetic */ b(int i4) {
        this.alpha = i4;
    }

    public static void alpha(zzqb zzqbVar, Parcel parcel) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 1, 4);
        parcel.writeInt(zzqbVar.alpha);
        AbstractC3043q.lima(parcel, 2, zzqbVar.purple);
        AbstractC3043q.sierra(parcel, 3, 8);
        parcel.writeLong(zzqbVar.red);
        AbstractC3043q.juliet(parcel, 4, zzqbVar.silver);
        AbstractC3043q.lima(parcel, 6, zzqbVar.teal);
        AbstractC3043q.lima(parcel, 7, zzqbVar.white);
        Double d4 = zzqbVar.yellow;
        if (d4 != null) {
            AbstractC3043q.sierra(parcel, 8, 8);
            parcel.writeDouble(d4.doubleValue());
        }
        AbstractC3043q.romeo(parcel, quebec);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 714
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel r82) {
        /*
            Method dump skipped, instructions count: 2556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y5.b.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i4) {
        switch (this.alpha) {
            case 0:
                return new ModuleInstallIntentResponse[i4];
            case 1:
                return new ModuleInstallStatusUpdate[i4];
            case 2:
                return new CropImageOptions[i4];
            case 3:
                return new ResultReceiver[i4];
            case 4:
                return new IntentSenderRequest[i4];
            case 5:
                return new MediaDescriptionCompat[i4];
            case 6:
                return new RatingCompat[i4];
            case 7:
                return new MediaSessionCompat$ResultReceiverWrapper[i4];
            case 8:
                return new ParcelableVolumeInfo[i4];
            case 9:
                return new zaa[i4];
            case 10:
                return new zac[i4];
            case 11:
                return new zan[i4];
            case 12:
                return new SafeParcelResponse[i4];
            case 13:
                return new WebImage[i4];
            case 14:
                return new zzai[i4];
            case 15:
                return new zzbf[i4];
            case 16:
                return new zzov[i4];
            case 17:
                return new zzpc[i4];
            case 18:
                return new zzqb[i4];
            case 19:
                return new ParcelableSparseBooleanArray[i4];
            case 20:
                return new RemoteMessage[i4];
            case 21:
                return new UserAddressRequest[i4];
            case 22:
                return new UserAddress[i4];
            case 23:
                return new zzeg[i4];
            case 24:
                return new zzek[i4];
            case 25:
                return new ClientIdentity[i4];
            case 26:
                return new zzj[i4];
            case 27:
                return new Counter[i4];
            case 28:
                return new zze[i4];
            default:
                return new zzi[i4];
        }
    }
}
