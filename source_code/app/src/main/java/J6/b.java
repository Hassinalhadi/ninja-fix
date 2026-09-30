package J6;

import G6.q;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcelable;
import androidx.activity.result.IntentSenderRequest;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.PaymentData;
import kotlin.jvm.internal.Intrinsics;
import t6.r;

/* loaded from: classes2.dex */
public final class b extends ai.b {
    public Status alpha;
    public PendingIntent bravo;

    @Override // ai.b
    public final Intent alpha(Context context, Object obj) {
        PendingIntent pendingIntent = this.bravo;
        Intrinsics.echo(pendingIntent, "pendingIntent");
        IntentSender intentSender = pendingIntent.getIntentSender();
        Intrinsics.delta(intentSender, "pendingIntent.intentSender");
        return new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", new IntentSenderRequest(intentSender, null, 0, 0));
    }

    @Override // ai.b
    public final ai.a bravo(Context context, Object obj) {
        a aVar;
        a aVar2;
        Task task = (Task) obj;
        if (task.india()) {
            Exception golf = task.golf();
            if (golf instanceof ApiException) {
                this.alpha = ((ApiException) golf).getStatus();
                if (golf instanceof ResolvableApiException) {
                    this.bravo = ((ResolvableApiException) golf).getResolution();
                }
            }
            if (this.bravo != null) {
                return null;
            }
            if (task.juliet()) {
                aVar2 = new a(task.hotel(), Status.teal);
            } else {
                if (((q) task).delta) {
                    aVar = new a(null, new Status(16, "The task has been canceled.", null, null));
                } else {
                    Status status = this.alpha;
                    if (status != null) {
                        aVar2 = new a(null, status);
                    } else {
                        aVar = new a(null, Status.white);
                    }
                }
                aVar2 = aVar;
            }
            return new ai.a(aVar2);
        }
        throw new IllegalArgumentException("The task has to be executed before using this API to resolve its result.");
    }

    @Override // ai.b
    public final Object charlie(Intent intent, int i4) {
        Status status;
        PaymentData paymentData;
        SafeParcelable bravo;
        Status status2 = Status.white;
        if (i4 != 1) {
            if (i4 != -1) {
                if (i4 != 0) {
                    return new a(null, status2);
                }
                return new a(null, Status.yellow);
            }
            if (intent != null) {
                Parcelable.Creator<PaymentData> creator = PaymentData.CREATOR;
                byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.PaymentData");
                if (byteArrayExtra == null) {
                    bravo = null;
                } else {
                    bravo = r.bravo(byteArrayExtra, creator);
                }
                paymentData = (PaymentData) bravo;
            } else {
                paymentData = null;
            }
            if (paymentData != null) {
                return new a(paymentData, Status.teal);
            }
            return new a(null, status2);
        }
        int i5 = H6.a.alpha;
        if (intent == null) {
            status = null;
        } else {
            status = (Status) intent.getParcelableExtra("com.google.android.gms.common.api.AutoResolveHelper.status");
        }
        if (status != null) {
            status2 = status;
        }
        return new a(null, status2);
    }
}
