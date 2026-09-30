package w6;

import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.PaymentData;

/* loaded from: classes2.dex */
public interface e extends IInterface {
    void azure(Status status, boolean z2);

    void lima(int i4, boolean z2);

    void romeo(Status status, PaymentData paymentData);
}
