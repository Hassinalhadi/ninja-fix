package Y5;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.activity.result.ActivityResult;
import com.canhub.cropper.CropImage$ActivityResult;
import com.google.android.flexbox.FlexboxLayout$LayoutParams;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.response.zal;
import com.google.android.gms.common.server.response.zam;
import com.google.android.gms.common.stats.WakeLockEvent;
import com.google.android.gms.identity.intents.model.CountrySpecification;
import com.google.android.gms.internal.identity.zzee;
import com.google.android.gms.internal.identity.zzei;
import com.google.android.gms.internal.identity.zzem;
import com.google.android.gms.internal.identity.zzh;
import com.google.android.gms.internal.identity.zzl;
import com.google.android.gms.internal.wallet.zzg;
import com.google.android.gms.measurement.internal.zzag;
import com.google.android.gms.measurement.internal.zzap;
import com.google.android.gms.measurement.internal.zzbh;
import com.google.android.gms.measurement.internal.zzpa;
import com.google.android.gms.measurement.internal.zzpe;
import com.google.android.gms.measurement.internal.zzr;
import com.google.android.material.internal.ParcelableSparseIntArray;
import com.google.firebase.perf.metrics.Trace;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class a implements Parcelable.Creator {
    public final /* synthetic */ int alpha;

    public /* synthetic */ a(int i4) {
        this.alpha = i4;
    }

    public static void alpha(zzbh zzbhVar, Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.lima(parcel, 2, zzbhVar.alpha);
        AbstractC3043q.kilo(parcel, 3, zzbhVar.purple, i4);
        AbstractC3043q.lima(parcel, 4, zzbhVar.red);
        AbstractC3043q.sierra(parcel, 5, 8);
        parcel.writeLong(zzbhVar.silver);
        AbstractC3043q.romeo(parcel, quebec);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 645
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel r55) {
        /*
            Method dump skipped, instructions count: 2060
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y5.a.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i4) {
        switch (this.alpha) {
            case 0:
                return new ModuleAvailabilityResponse[i4];
            case 1:
                return new ModuleInstallResponse[i4];
            case 2:
                return new CropImage$ActivityResult[i4];
            case 3:
                return new FavaDiagnosticsEntity[i4];
            case 4:
                return new ActivityResult[i4];
            case 5:
                return new MediaBrowserCompat$MediaItem[i4];
            case 6:
                return new MediaMetadataCompat[i4];
            case 7:
                return new MediaSessionCompat$QueueItem[i4];
            case 8:
                return new MediaSessionCompat$Token[i4];
            case 9:
                return new PlaybackStateCompat[i4];
            case 10:
                return new StringToIntConverter[i4];
            case 11:
                return new zam[i4];
            case 12:
                return new zal[i4];
            case 13:
                return new FlexboxLayout$LayoutParams[i4];
            case 14:
                return new zzag[i4];
            case 15:
                return new zzap[i4];
            case 16:
                return new zzbh[i4];
            case 17:
                return new zzpa[i4];
            case 18:
                return new zzpe[i4];
            case 19:
                return new zzr[i4];
            case 20:
                return new ParcelableSparseIntArray[i4];
            case 21:
                return new WakeLockEvent[i4];
            case 22:
                return new CountrySpecification[i4];
            case 23:
                return new zzee[i4];
            case 24:
                return new zzei[i4];
            case 25:
                return new zzem[i4];
            case 26:
                return new zzh[i4];
            case 27:
                return new zzl[i4];
            case 28:
                return new Trace[i4];
            default:
                return new zzg[i4];
        }
    }
}
