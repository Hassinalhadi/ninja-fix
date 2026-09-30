package Fb;

import androidx.lifecycle.az;
import com.app.network.network.models.CaptainProfileAttributeOtpResponse;
import com.app.network.network.models.CaptainQrResponse;
import com.app.network.network.models.CustomerPhoneResponse;
import com.app.network.network.models.EnvelopNotification;
import com.app.network.network.models.NaqlBlockedReason;
import com.app.network.network.models.ReferralResponse;
import com.app.network.network.models.WalletTopUpResponse;
import com.app.network.network.models.WithdrawTransaction;
import com.app.network.network.response.DataResponse;
import com.checkout.components.redirecthandler.customtab.RedirectCustomTabEventLogger;
import com.checkout.components.redirecthandler.utils.RedirectionConstants;
import com.clevertap.android.sdk.Constants;
import com.google.gson.q;
import com.google.gson.r;
import com.google.gson.s;
import com.google.gson.t;
import delivery.samurai.android.ui.about.MyAccountViewModel;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import r3.C2492a;
import retrofit2.HttpException;
import s6.AbstractC2656g0;
import vg.aq;

/* loaded from: classes2.dex */
public final /* synthetic */ class j implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ az purple;

    public /* synthetic */ j(az azVar, int i4) {
        this.alpha = i4;
        this.purple = azVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ca  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        HttpException httpException;
        String str;
        Object m206constructorimpl;
        s sVar;
        Integer num;
        String str2;
        String localizedMessage;
        q hotel;
        q hotel2;
        q hotel3;
        aq<?> response;
        ResponseBody responseBody;
        az azVar = this.purple;
        switch (this.alpha) {
            case 0:
                C2492a c2492a = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                c2492a.charlie = (EnvelopNotification) obj;
                azVar.postValue(c2492a);
                return Unit.INSTANCE;
            case 1:
                C2492a c2492a2 = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                c2492a2.charlie = (DataResponse) obj;
                azVar.postValue(c2492a2);
                return Unit.INSTANCE;
            case 2:
                C2492a c2492a3 = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                c2492a3.charlie = (ResponseBody) obj;
                azVar.postValue(c2492a3);
                return Unit.INSTANCE;
            case 3:
                C2492a c2492a4 = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                c2492a4.charlie = (ResponseBody) obj;
                azVar.postValue(c2492a4);
                return Unit.INSTANCE;
            case 4:
                C2492a c2492a5 = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                c2492a5.charlie = (EnvelopNotification) obj;
                azVar.postValue(c2492a5);
                return Unit.INSTANCE;
            case 5:
                C2492a c2492a6 = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                c2492a6.charlie = (ReferralResponse) obj;
                azVar.postValue(c2492a6);
                return Unit.INSTANCE;
            case 6:
                C2492a c2492a7 = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                c2492a7.charlie = (DataResponse) obj;
                azVar.postValue(c2492a7);
                return Unit.INSTANCE;
            case 7:
                C2492a c2492a8 = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                c2492a8.charlie = (DataResponse) obj;
                azVar.postValue(c2492a8);
                return Unit.INSTANCE;
            case 8:
                C2492a c2492a9 = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                c2492a9.charlie = (CaptainProfileAttributeOtpResponse) obj;
                azVar.postValue(c2492a9);
                return Unit.INSTANCE;
            case 9:
                ResponseBody responseBody2 = (ResponseBody) obj;
                if (responseBody2.string() != null) {
                    C2492a c2492a10 = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                    c2492a10.charlie = responseBody2;
                    azVar.postValue(c2492a10);
                }
                return Unit.INSTANCE;
            case 10:
                C2492a c2492a11 = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                c2492a11.charlie = (ResponseBody) obj;
                azVar.postValue(c2492a11);
                return Unit.INSTANCE;
            case 11:
                C2492a c2492a12 = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                c2492a12.charlie = (CaptainProfileAttributeOtpResponse) obj;
                azVar.postValue(c2492a12);
                return Unit.INSTANCE;
            case 12:
                C2492a c2492a13 = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                c2492a13.charlie = (ResponseBody) obj;
                azVar.postValue(c2492a13);
                return Unit.INSTANCE;
            case 13:
                C2492a c2492a14 = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                c2492a14.charlie = (DataResponse) obj;
                azVar.postValue(c2492a14);
                return Unit.INSTANCE;
            case 14:
                C2492a c2492a15 = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                c2492a15.charlie = (WithdrawTransaction) obj;
                azVar.postValue(c2492a15);
                return Unit.INSTANCE;
            case 15:
                C2492a c2492a16 = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                c2492a16.charlie = (WalletTopUpResponse) obj;
                azVar.postValue(c2492a16);
                return Unit.INSTANCE;
            case 16:
                C2492a c2492a17 = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                c2492a17.charlie = (WithdrawTransaction) obj;
                azVar.postValue(c2492a17);
                return Unit.INSTANCE;
            case 17:
                C2492a c2492a18 = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                c2492a18.charlie = (DataResponse) obj;
                azVar.postValue(c2492a18);
                return Unit.INSTANCE;
            case 18:
                Boolean bool = Boolean.TRUE;
                C2492a c2492a19 = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                c2492a19.charlie = bool;
                azVar.postValue(c2492a19);
                I9.c.alpha();
                return Unit.INSTANCE;
            case 19:
                C2492a c2492a20 = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                c2492a20.charlie = (CustomerPhoneResponse) obj;
                azVar.postValue(c2492a20);
                return Unit.INSTANCE;
            case 20:
                Boolean bool2 = Boolean.TRUE;
                C2492a c2492a21 = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                c2492a21.charlie = bool2;
                azVar.postValue(c2492a21);
                return Unit.INSTANCE;
            case 21:
                C2492a c2492a22 = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                c2492a22.charlie = (List) obj;
                azVar.postValue(c2492a22);
                return Unit.INSTANCE;
            case 22:
                C2492a c2492a23 = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                c2492a23.charlie = (DataResponse) obj;
                azVar.postValue(c2492a23);
                return Unit.INSTANCE;
            case 23:
                C2492a c2492a24 = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                c2492a24.charlie = (DataResponse) obj;
                azVar.postValue(c2492a24);
                return Unit.INSTANCE;
            case 24:
                C2492a c2492a25 = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                c2492a25.charlie = (CaptainQrResponse) obj;
                azVar.postValue(c2492a25);
                return Unit.INSTANCE;
            case 25:
                C2492a c2492a26 = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                c2492a26.charlie = (List) obj;
                azVar.postValue(c2492a26);
                return Unit.INSTANCE;
            case 26:
                C2492a c2492a27 = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                c2492a27.charlie = (NaqlBlockedReason) obj;
                azVar.postValue(c2492a27);
                return Unit.INSTANCE;
            case 27:
                C2492a c2492a28 = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                c2492a28.charlie = (CaptainProfileAttributeOtpResponse) obj;
                azVar.postValue(c2492a28);
                return Unit.INSTANCE;
            case 28:
                C2492a c2492a29 = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                c2492a29.charlie = (ResponseBody) obj;
                azVar.postValue(c2492a29);
                return Unit.INSTANCE;
            default:
                Throwable th = (Throwable) obj;
                Intrinsics.checkNotNull(th);
                String str3 = null;
                if (th instanceof HttpException) {
                    httpException = (HttpException) th;
                } else {
                    httpException = null;
                }
                if (httpException != null && (response = httpException.response()) != null && (responseBody = response.charlie) != null) {
                    str = responseBody.string();
                } else {
                    str = null;
                }
                if (str != null) {
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        m206constructorimpl = Result.m206constructorimpl(AbstractC2656g0.charlie(str).bravo());
                    } catch (Throwable th2) {
                        Result.Companion companion2 = Result.INSTANCE;
                        m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th2));
                    }
                    if (m206constructorimpl instanceof kotlin.k) {
                        m206constructorimpl = null;
                    }
                    sVar = (s) m206constructorimpl;
                } else {
                    sVar = null;
                }
                if (sVar != null && (hotel3 = sVar.hotel("retriesLeft")) != null) {
                    if (hotel3 instanceof r) {
                        hotel3 = null;
                    }
                    if (hotel3 != null) {
                        num = Integer.valueOf(hotel3.alpha());
                        if (sVar != null && (hotel2 = sVar.hotel("errors")) != null) {
                            if (hotel2 instanceof r) {
                                hotel2 = null;
                            }
                            if (hotel2 != null) {
                                if (hotel2 instanceof s) {
                                    q hotel4 = hotel2.bravo().hotel(RedirectCustomTabEventLogger.RESULT_ERROR);
                                    if (hotel4 != null) {
                                        if (hotel4 instanceof r) {
                                            hotel4 = null;
                                        }
                                        if (hotel4 != null) {
                                            str2 = hotel4.delta();
                                        }
                                    }
                                } else if (hotel2 instanceof t) {
                                    str2 = hotel2.delta();
                                }
                                if (sVar != null && (hotel = sVar.hotel(RedirectCustomTabEventLogger.RESULT_ERROR)) != null) {
                                    if (hotel instanceof r) {
                                        hotel = null;
                                    }
                                    if (hotel != null) {
                                        str3 = hotel.delta();
                                    }
                                }
                                localizedMessage = th.getLocalizedMessage();
                                if (localizedMessage == null) {
                                    localizedMessage = "";
                                }
                                if (str2 == null) {
                                    if (str3 == null) {
                                        str2 = localizedMessage;
                                    } else {
                                        str2 = str3;
                                    }
                                }
                                if (num != null) {
                                    str2 = str2 + "|||retriesLeft=" + num;
                                }
                                azVar.postValue(com.google.android.material.datepicker.j.november(0, str2, Constants.KEY_MSG, str2));
                                return Unit.INSTANCE;
                            }
                        }
                        str2 = null;
                        if (sVar != null) {
                            if (hotel instanceof r) {
                            }
                            if (hotel != null) {
                            }
                        }
                        localizedMessage = th.getLocalizedMessage();
                        if (localizedMessage == null) {
                        }
                        if (str2 == null) {
                        }
                        if (num != null) {
                        }
                        azVar.postValue(com.google.android.material.datepicker.j.november(0, str2, Constants.KEY_MSG, str2));
                        return Unit.INSTANCE;
                    }
                }
                num = null;
                if (sVar != null) {
                    if (hotel2 instanceof r) {
                    }
                    if (hotel2 != null) {
                    }
                }
                str2 = null;
                if (sVar != null) {
                }
                localizedMessage = th.getLocalizedMessage();
                if (localizedMessage == null) {
                }
                if (str2 == null) {
                }
                if (num != null) {
                }
                azVar.postValue(com.google.android.material.datepicker.j.november(0, str2, Constants.KEY_MSG, str2));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ j(az azVar, MyAccountViewModel myAccountViewModel) {
        this.alpha = 29;
        this.purple = azVar;
    }
}
