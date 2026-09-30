package Gc;

import androidx.lifecycle.az;
import com.app.network.network.models.CreateTicketApiResponse;
import com.checkout.components.redirecthandler.utils.RedirectionConstants;
import com.clevertap.android.sdk.Constants;
import delivery.samurai.android.ui.support.SupportViewModel;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import r3.C2492a;
import vf.ab;

/* loaded from: classes2.dex */
public final class k extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ SupportViewModel purple;
    public final /* synthetic */ Integer red;
    public final /* synthetic */ String silver;
    public final /* synthetic */ List teal;
    public final /* synthetic */ Integer white;
    public final /* synthetic */ az yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(SupportViewModel supportViewModel, Integer num, String str, List list, Integer num2, az azVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = supportViewModel;
        this.red = num;
        this.silver = str;
        this.teal = list;
        this.white = num2;
        this.yellow = azVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new k(this.purple, this.red, this.silver, this.teal, this.white, this.yellow, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Object m206constructorimpl;
        RequestBody requestBody;
        RequestBody requestBody2;
        MultipartBody.Part[] partArr;
        RequestBody requestBody3;
        Object alpha;
        String num;
        String num2;
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        SupportViewModel supportViewModel = this.purple;
        try {
            if (i4 != 0) {
                if (i4 == 1) {
                    ResultKt.alpha(obj);
                    alpha = obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.alpha(obj);
                Result.Companion companion = Result.INSTANCE;
                t3.g gVar = supportViewModel.alpha;
                Integer num3 = this.red;
                if (num3 != null && (num2 = num3.toString()) != null) {
                    requestBody = RequestBody.Companion.create$default(RequestBody.INSTANCE, num2, (MediaType) null, 1, (Object) null);
                } else {
                    requestBody = null;
                }
                String str = this.silver;
                if (str != null) {
                    requestBody2 = RequestBody.Companion.create$default(RequestBody.INSTANCE, str, (MediaType) null, 1, (Object) null);
                } else {
                    requestBody2 = null;
                }
                List list = this.teal;
                if (list != null) {
                    ArrayList arrayList = new ArrayList();
                    int i5 = 0;
                    for (Object obj2 : list) {
                        int i10 = i5 + 1;
                        if (i5 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        String str2 = (String) obj2;
                        RequestBody create = RequestBody.INSTANCE.create(new File(str2), MediaType.INSTANCE.parse("image/*"));
                        arrayList.add(MultipartBody.Part.INSTANCE.createFormData("attachments[" + i5 + Constants.AES_SUFFIX, new File(str2).getName(), create));
                        i5 = i10;
                    }
                    partArr = (MultipartBody.Part[]) arrayList.toArray(new MultipartBody.Part[0]);
                } else {
                    partArr = null;
                }
                Integer num4 = this.white;
                if (num4 != null && (num = num4.toString()) != null) {
                    requestBody3 = RequestBody.Companion.create$default(RequestBody.INSTANCE, num, (MediaType) null, 1, (Object) null);
                } else {
                    requestBody3 = null;
                }
                this.alpha = 1;
                alpha = gVar.alpha(requestBody, requestBody2, partArr, requestBody3, this);
                if (alpha == aVar) {
                    return aVar;
                }
            }
            m206constructorimpl = Result.m206constructorimpl((CreateTicketApiResponse) alpha);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        boolean z2 = m206constructorimpl instanceof kotlin.k;
        az azVar = this.yellow;
        if (!z2) {
            C2492a c2492a = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
            c2492a.charlie = (CreateTicketApiResponse) m206constructorimpl;
            azVar.postValue(c2492a);
        }
        Throwable m207exceptionOrNullimpl = Result.m207exceptionOrNullimpl(m206constructorimpl);
        if (m207exceptionOrNullimpl != null) {
            String msg = supportViewModel.onHandleError(m207exceptionOrNullimpl);
            Intrinsics.echo(msg, "msg");
            azVar.postValue(new C2492a(0, msg));
        }
        return Unit.INSTANCE;
    }
}
