package z1;

import android.os.Parcelable;
import androidx.databinding.ObservableParcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zag;
import com.google.android.gms.signin.internal.zak;
import com.google.android.gms.wallet.CardInfo;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.InstrumentInfo;
import com.google.android.gms.wallet.LoyaltyWalletObject;
import com.google.android.gms.wallet.OfferWalletObject;
import com.google.android.gms.wallet.PaymentCardRecognitionIntentRequest;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.PaymentMethodTokenizationParameters;
import com.google.android.gms.wallet.ShippingAddressRequirements;
import com.google.android.gms.wallet.button.ButtonOptions;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;
import com.google.android.gms.wallet.zzau;
import com.google.firebase.perf.util.Timer;

/* loaded from: classes3.dex */
public final class e implements Parcelable.Creator {
    public final /* synthetic */ int alpha;

    public /* synthetic */ e(int i4) {
        this.alpha = i4;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 802
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel r35) {
        /*
            Method dump skipped, instructions count: 2714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.e.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i4) {
        switch (this.alpha) {
            case 0:
                return new ObservableParcelable[i4];
            case 1:
                return new Timer[i4];
            case 2:
                return new zag[i4];
            case 3:
                return new zak[i4];
            case 4:
                return new PaymentDataRequest[i4];
            case 5:
                return new PaymentMethodTokenizationParameters[i4];
            case 6:
                return new ShippingAddressRequirements[i4];
            case 7:
                return new zzau[i4];
            case 8:
                return new CardInfo[i4];
            case 9:
                return new CreateWalletObjectsRequest[i4];
            case 10:
                return new FullWallet[i4];
            case 11:
                return new InstrumentInfo[i4];
            case 12:
                return new LoyaltyWalletObject[i4];
            case 13:
                return new OfferWalletObject[i4];
            case 14:
                return new PaymentCardRecognitionIntentRequest[i4];
            case 15:
                return new ButtonOptions[i4];
            case 16:
                return new CommonWalletObject[i4];
            case 17:
                return new LabelValueRow[i4];
            case 18:
                return new LoyaltyPoints[i4];
            case 19:
                return new TimeInterval[i4];
            case 20:
                return new WalletObjectMessage[i4];
            case 21:
                return new GoogleSignInAccount[i4];
            case 22:
                return new GoogleSignInOptionsExtensionParcelable[i4];
            case 23:
                return new DataHolder[i4];
            case 24:
                return new ClientIdentity[i4];
            case 25:
                return new MethodInvocation[i4];
            case 26:
                return new zav[i4];
            case 27:
                return new RootTelemetryConfiguration[i4];
            case 28:
                return new BinderWrapper[i4];
            default:
                return new ConnectionTelemetryConfiguration[i4];
        }
    }
}
