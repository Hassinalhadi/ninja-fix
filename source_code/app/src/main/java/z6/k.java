package z6;

import android.os.Parcel;
import android.os.Parcelable;
import coil.memory.MemoryCache$Key;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.common.internal.zax;
import com.google.android.gms.common.internal.zzal;
import com.google.android.gms.common.internal.zzk;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.signin.internal.zaa;
import com.google.android.gms.signin.internal.zai;
import com.google.android.gms.wallet.CardRequirements;
import com.google.android.gms.wallet.CreditCardExpirationDate;
import com.google.android.gms.wallet.GiftCardWalletObject;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.PaymentCardRecognitionIntentResponse;
import com.google.android.gms.wallet.PaymentCardRecognitionResult;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentMethodToken;
import com.google.android.gms.wallet.TransactionInfo;
import com.google.android.gms.wallet.button.zzc;
import com.google.android.gms.wallet.wobs.LabelValue;
import com.google.android.gms.wallet.wobs.LoyaltyPointsBalance;
import com.google.android.gms.wallet.wobs.TextModuleData;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.zza;
import com.google.android.gms.wallet.zzaj;
import com.google.android.material.badge.BadgeState$State;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class k implements Parcelable.Creator {
    public final /* synthetic */ int alpha;

    public /* synthetic */ k(int i4) {
        this.alpha = i4;
    }

    public static void alpha(GetServiceRequest getServiceRequest, Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 1, 4);
        parcel.writeInt(getServiceRequest.alpha);
        AbstractC3043q.sierra(parcel, 2, 4);
        parcel.writeInt(getServiceRequest.purple);
        AbstractC3043q.sierra(parcel, 3, 4);
        parcel.writeInt(getServiceRequest.red);
        AbstractC3043q.lima(parcel, 4, getServiceRequest.silver);
        AbstractC3043q.foxtrot(parcel, 5, getServiceRequest.teal);
        AbstractC3043q.oscar(parcel, 6, getServiceRequest.white, i4);
        AbstractC3043q.bravo(parcel, 7, getServiceRequest.yellow);
        AbstractC3043q.kilo(parcel, 8, getServiceRequest.f6644a, i4);
        AbstractC3043q.oscar(parcel, 10, getServiceRequest.f6645b, i4);
        AbstractC3043q.oscar(parcel, 11, getServiceRequest.f6646c, i4);
        AbstractC3043q.sierra(parcel, 12, 4);
        parcel.writeInt(getServiceRequest.f6647d ? 1 : 0);
        AbstractC3043q.sierra(parcel, 13, 4);
        parcel.writeInt(getServiceRequest.e);
        boolean z2 = getServiceRequest.f6648f;
        AbstractC3043q.sierra(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        AbstractC3043q.lima(parcel, 15, getServiceRequest.f6649g);
        AbstractC3043q.romeo(parcel, quebec);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 738
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel r24) {
        /*
            Method dump skipped, instructions count: 2780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z6.k.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i4) {
        switch (this.alpha) {
            case 0:
                return new PolygonOptions[i4];
            case 1:
                return new zaa[i4];
            case 2:
                return new zai[i4];
            case 3:
                return new PaymentData[i4];
            case 4:
                return new PaymentMethodToken[i4];
            case 5:
                return new zzaj[i4];
            case 6:
                return new TransactionInfo[i4];
            case 7:
                return new zza[i4];
            case 8:
                return new CardRequirements[i4];
            case 9:
                return new CreditCardExpirationDate[i4];
            case 10:
                return new GiftCardWalletObject[i4];
            case 11:
                return new IsReadyToPayRequest[i4];
            case 12:
                return new MaskedWallet[i4];
            case 13:
                return new PaymentCardRecognitionResult[i4];
            case 14:
                return new PaymentCardRecognitionIntentResponse[i4];
            case 15:
                return new zzc[i4];
            case 16:
                return new LabelValue[i4];
            case 17:
                return new LoyaltyPointsBalance[i4];
            case 18:
                return new TextModuleData[i4];
            case 19:
                return new UriData[i4];
            case 20:
                return new BadgeState$State[i4];
            case 21:
                return new GoogleSignInOptions[i4];
            case 22:
                return new BitmapTeleporter[i4];
            case 23:
                return new MemoryCache$Key[i4];
            case 24:
                return new TelemetryData[i4];
            case 25:
                return new zat[i4];
            case 26:
                return new zax[i4];
            case 27:
                return new zzal[i4];
            case 28:
                return new zzk[i4];
            default:
                return new GetServiceRequest[i4];
        }
    }
}
