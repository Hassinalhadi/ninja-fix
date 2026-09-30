package ma;

import androidx.lifecycle.az;
import com.app.network.network.models.Allocation;
import com.app.network.network.models.Order;
import com.app.network.network.models.Shift;
import com.app.network.network.models.agreement.AppAgreement;
import com.app.network.network.response.DataResponse;
import com.checkout.components.redirecthandler.utils.RedirectionConstants;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Response;
import okhttp3.ResponseBody;
import r3.C2492a;
import vg.aq;

/* renamed from: ma.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2109a implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ az purple;

    public /* synthetic */ C2109a(az azVar, int i4) {
        this.alpha = i4;
        this.purple = azVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                C2492a c2492a = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                c2492a.charlie = (AppAgreement) obj;
                this.purple.postValue(c2492a);
                return Unit.INSTANCE;
            case 1:
                List items = ((DataResponse) obj).getItems();
                C2492a c2492a2 = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                c2492a2.charlie = items;
                this.purple.postValue(c2492a2);
                return Unit.INSTANCE;
            case 2:
                C2492a c2492a3 = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                c2492a3.charlie = (List) obj;
                this.purple.postValue(c2492a3);
                return Unit.INSTANCE;
            case 3:
                C2492a c2492a4 = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                c2492a4.charlie = (ResponseBody) obj;
                this.purple.postValue(c2492a4);
                return Unit.INSTANCE;
            case 4:
                C2492a c2492a5 = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                c2492a5.charlie = (Allocation) obj;
                this.purple.postValue(c2492a5);
                return Unit.INSTANCE;
            case 5:
                C2492a c2492a6 = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                c2492a6.charlie = (Allocation) obj;
                this.purple.postValue(c2492a6);
                return Unit.INSTANCE;
            case 6:
                C2492a c2492a7 = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                c2492a7.charlie = (Order) obj;
                this.purple.postValue(c2492a7);
                return Unit.INSTANCE;
            case 7:
                C2492a c2492a8 = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                c2492a8.charlie = (DataResponse) obj;
                this.purple.postValue(c2492a8);
                return Unit.INSTANCE;
            case 8:
                aq aqVar = (aq) obj;
                boolean isSuccessful = aqVar.alpha.getIsSuccessful();
                az azVar = this.purple;
                Response response = aqVar.alpha;
                if (isSuccessful) {
                    if (response.code() == 204) {
                        C2492a c2492a9 = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                        c2492a9.charlie = null;
                        azVar.postValue(c2492a9);
                    } else {
                        C2492a c2492a10 = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                        c2492a10.charlie = aqVar.bravo;
                        azVar.postValue(c2492a10);
                    }
                } else {
                    String msg = "Error " + response.code();
                    Intrinsics.echo(msg, "msg");
                    azVar.postValue(new C2492a(0, msg));
                }
                return Unit.INSTANCE;
            case 9:
                C2492a c2492a11 = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                c2492a11.charlie = (Allocation) obj;
                this.purple.postValue(c2492a11);
                return Unit.INSTANCE;
            case 10:
                C2492a c2492a12 = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                c2492a12.charlie = (DataResponse) obj;
                this.purple.postValue(c2492a12);
                return Unit.INSTANCE;
            case 11:
                C2492a c2492a13 = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                c2492a13.charlie = (DataResponse) obj;
                this.purple.postValue(c2492a13);
                return Unit.INSTANCE;
            case 12:
                C2492a c2492a14 = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                c2492a14.charlie = (DataResponse) obj;
                this.purple.postValue(c2492a14);
                return Unit.INSTANCE;
            case 13:
                C2492a c2492a15 = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                c2492a15.charlie = (List) obj;
                this.purple.postValue(c2492a15);
                return Unit.INSTANCE;
            case 14:
                C2492a c2492a16 = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                c2492a16.charlie = (Shift) obj;
                this.purple.postValue(c2492a16);
                return Unit.INSTANCE;
            default:
                C2492a c2492a17 = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                c2492a17.charlie = (DataResponse) obj;
                this.purple.postValue(c2492a17);
                return Unit.INSTANCE;
        }
    }
}
