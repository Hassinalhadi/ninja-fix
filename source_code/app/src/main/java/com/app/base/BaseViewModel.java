package com.app.base;

import Cf.d;
import Cf.e;
import I9.c;
import K7.b;
import Xd.l;
import android.app.Application;
import android.util.MalformedJsonException;
import androidx.appcompat.widget.P0;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.T;
import androidx.lifecycle.au;
import androidx.lifecycle.az;
import com.checkout.components.redirecthandler.customtab.RedirectCustomTabEventLogger;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.j;
import com.google.gson.internal.m;
import com.google.gson.q;
import com.google.gson.s;
import com.zendesk.service.HttpConstants;
import delivery.samurai.android.R;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.HttpException;
import s6.AbstractC2656g0;
import vf.AbstractC3220y;
import vf.I;
import vf.ad;
import vf.ao;
import vg.aq;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ;\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\f\u001a\u00020\u000b2\"\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\r¢\u0006\u0004\b\u0014\u0010\u0015R4\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\b0\u00170\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/app/base/BaseViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "Landroid/app/Application;", "app", "<init>", "(Landroid/app/Application;)V", "", RedirectCustomTabEventLogger.RESULT_ERROR, "", "onHandleError", "(Ljava/lang/Throwable;)Ljava/lang/String;", "Lvf/y;", "dispatcher", "Lkotlin/Function2;", "Lvf/ab;", "LNd/c;", "", "", "block", "Lvf/I;", "launchApi", "(Lvf/y;LXd/l;)Lvf/I;", "Landroidx/lifecycle/az;", "Lkotlin/Pair;", "", "errorObserver", "Landroidx/lifecycle/az;", "getErrorObserver", "()Landroidx/lifecycle/az;", "setErrorObserver", "(Landroidx/lifecycle/az;)V", "base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public class BaseViewModel extends AndroidViewModel {

    @NotNull
    private az errorObserver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    public BaseViewModel(@NotNull Application app) {
        super(app);
        Intrinsics.echo(app, "app");
        this.errorObserver = new au();
    }

    public static I launchApi$default(BaseViewModel baseViewModel, AbstractC3220y abstractC3220y, l lVar, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 1) != 0) {
                e eVar = ao.alpha;
                abstractC3220y = d.purple;
            }
            return baseViewModel.launchApi(abstractC3220y, lVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launchApi");
    }

    @NotNull
    public final az getErrorObserver() {
        return this.errorObserver;
    }

    @NotNull
    public final I launchApi(@NotNull AbstractC3220y dispatcher, @NotNull l block) {
        Intrinsics.echo(dispatcher, "dispatcher");
        Intrinsics.echo(block, "block");
        return ad.zulu(T.hotel(this), dispatcher, null, block, 2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(32:17|18|19|20|(1:91)|30|31|(22:33|(1:35)|36|37|(1:87)(8:41|(1:43)|44|(1:46)|47|(1:49)|50|(1:52))|53|54|(1:85)(2:60|61)|62|63|(1:65)|66|(1:68)|69|(1:71)|72|(1:74)|(1:76)|77|(1:79)(1:83)|80|81)|89|(0)|36|37|(1:39)|87|53|54|(1:56)|85|62|63|(0)|66|(0)|69|(0)|72|(0)|(0)|77|(0)(0)|80|81) */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00f7, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008e A[Catch: Exception -> 0x018f, TRY_ENTER, TryCatch #0 {Exception -> 0x018f, blocks: (B:19:0x0053, B:22:0x005f, B:24:0x0063, B:26:0x0069, B:28:0x006f, B:35:0x008e, B:36:0x0093, B:39:0x00a8, B:41:0x00b0, B:43:0x00b8, B:44:0x00bb, B:46:0x00c1, B:47:0x00c4, B:49:0x00ca, B:50:0x00cd, B:52:0x00d3, B:63:0x00f8, B:65:0x010c, B:66:0x0111, B:68:0x0119, B:69:0x011e, B:71:0x0126, B:72:0x012b, B:74:0x0133, B:76:0x013a, B:77:0x013f, B:80:0x014b), top: B:18:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010c A[Catch: Exception -> 0x018f, TryCatch #0 {Exception -> 0x018f, blocks: (B:19:0x0053, B:22:0x005f, B:24:0x0063, B:26:0x0069, B:28:0x006f, B:35:0x008e, B:36:0x0093, B:39:0x00a8, B:41:0x00b0, B:43:0x00b8, B:44:0x00bb, B:46:0x00c1, B:47:0x00c4, B:49:0x00ca, B:50:0x00cd, B:52:0x00d3, B:63:0x00f8, B:65:0x010c, B:66:0x0111, B:68:0x0119, B:69:0x011e, B:71:0x0126, B:72:0x012b, B:74:0x0133, B:76:0x013a, B:77:0x013f, B:80:0x014b), top: B:18:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0119 A[Catch: Exception -> 0x018f, TryCatch #0 {Exception -> 0x018f, blocks: (B:19:0x0053, B:22:0x005f, B:24:0x0063, B:26:0x0069, B:28:0x006f, B:35:0x008e, B:36:0x0093, B:39:0x00a8, B:41:0x00b0, B:43:0x00b8, B:44:0x00bb, B:46:0x00c1, B:47:0x00c4, B:49:0x00ca, B:50:0x00cd, B:52:0x00d3, B:63:0x00f8, B:65:0x010c, B:66:0x0111, B:68:0x0119, B:69:0x011e, B:71:0x0126, B:72:0x012b, B:74:0x0133, B:76:0x013a, B:77:0x013f, B:80:0x014b), top: B:18:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0126 A[Catch: Exception -> 0x018f, TryCatch #0 {Exception -> 0x018f, blocks: (B:19:0x0053, B:22:0x005f, B:24:0x0063, B:26:0x0069, B:28:0x006f, B:35:0x008e, B:36:0x0093, B:39:0x00a8, B:41:0x00b0, B:43:0x00b8, B:44:0x00bb, B:46:0x00c1, B:47:0x00c4, B:49:0x00ca, B:50:0x00cd, B:52:0x00d3, B:63:0x00f8, B:65:0x010c, B:66:0x0111, B:68:0x0119, B:69:0x011e, B:71:0x0126, B:72:0x012b, B:74:0x0133, B:76:0x013a, B:77:0x013f, B:80:0x014b), top: B:18:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0133 A[Catch: Exception -> 0x018f, TryCatch #0 {Exception -> 0x018f, blocks: (B:19:0x0053, B:22:0x005f, B:24:0x0063, B:26:0x0069, B:28:0x006f, B:35:0x008e, B:36:0x0093, B:39:0x00a8, B:41:0x00b0, B:43:0x00b8, B:44:0x00bb, B:46:0x00c1, B:47:0x00c4, B:49:0x00ca, B:50:0x00cd, B:52:0x00d3, B:63:0x00f8, B:65:0x010c, B:66:0x0111, B:68:0x0119, B:69:0x011e, B:71:0x0126, B:72:0x012b, B:74:0x0133, B:76:0x013a, B:77:0x013f, B:80:0x014b), top: B:18:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013a A[Catch: Exception -> 0x018f, TryCatch #0 {Exception -> 0x018f, blocks: (B:19:0x0053, B:22:0x005f, B:24:0x0063, B:26:0x0069, B:28:0x006f, B:35:0x008e, B:36:0x0093, B:39:0x00a8, B:41:0x00b0, B:43:0x00b8, B:44:0x00bb, B:46:0x00c1, B:47:0x00c4, B:49:0x00ca, B:50:0x00cd, B:52:0x00d3, B:63:0x00f8, B:65:0x010c, B:66:0x0111, B:68:0x0119, B:69:0x011e, B:71:0x0126, B:72:0x012b, B:74:0x0133, B:76:0x013a, B:77:0x013f, B:80:0x014b), top: B:18:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014a  */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String onHandleError(@NotNull Throwable r20) {
        Pair pair;
        String echo;
        String str;
        int code;
        String str2;
        String str3;
        String str4;
        ResponseBody responseBody;
        b alpha;
        String str5;
        String str6;
        aq<?> response;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        aq<?> response2;
        String str15;
        ResponseBody responseBody2;
        String string;
        Headers headers;
        Object invoke;
        Response response3;
        Request request;
        HttpUrl url;
        Intrinsics.echo(r20, "error");
        boolean z2 = r20 instanceof HttpException;
        if (z2) {
            Pair pair2 = new Pair(905, "An error occurred");
            if (z2) {
                HttpException httpException = (HttpException) r20;
                String zulu = ao.ad.zulu(httpException.code(), "code : ");
                if (httpException.code() == 404) {
                    pair = new Pair(903, "url not found");
                } else if (httpException.code() == 413) {
                    try {
                        alpha = b.alpha();
                        aq<?> response4 = httpException.response();
                        if (response4 == null || (response3 = response4.alpha) == null || (request = response3.request()) == null || (url = request.url()) == null || (str5 = url.encodedPath()) == null) {
                            str5 = "unknown";
                        }
                        try {
                            ThreadLocal threadLocal = c.alpha;
                            invoke = c.class.getMethod("getUploadAttemptId", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    } catch (Exception unused2) {
                    }
                    if (invoke instanceof String) {
                        str6 = (String) invoke;
                        if (str6 != null) {
                            alpha.echo("upload_attempt_id", str6);
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        response = httpException.response();
                        if (response != null || (headers = response.alpha.headers()) == null) {
                            str7 = "unknown";
                        } else {
                            str7 = "unknown";
                            String str16 = headers.get("Server");
                            if (str16 != null) {
                                linkedHashMap.put("Server", str16);
                            }
                            String str17 = headers.get("Via");
                            if (str17 != null) {
                                linkedHashMap.put("Via", str17);
                            }
                            String str18 = headers.get("CF-Ray");
                            if (str18 != null) {
                                linkedHashMap.put("CF-Ray", str18);
                            }
                            String str19 = headers.get("X-Request-ID");
                            if (str19 != null) {
                                linkedHashMap.put("X-Request-ID", str19);
                            }
                        }
                        response2 = httpException.response();
                        if (response2 == null && (responseBody2 = response2.charlie) != null && (string = responseBody2.string()) != null) {
                            str15 = StringsKt.yellow(HttpConstants.HTTP_INTERNAL_ERROR, string);
                        } else {
                            str15 = null;
                        }
                        str8 = str15;
                        alpha.delta(HttpConstants.HTTP_ENTITY_TOO_LARGE, "http_code");
                        alpha.echo("http_path", str5);
                        str9 = (String) linkedHashMap.get("Server");
                        if (str9 != null) {
                            alpha.echo("http_response_server", str9);
                        }
                        str10 = (String) linkedHashMap.get("Via");
                        if (str10 != null) {
                            alpha.echo("http_response_via", str10);
                        }
                        str11 = (String) linkedHashMap.get("CF-Ray");
                        if (str11 != null) {
                            alpha.echo("http_response_cf_ray", str11);
                        }
                        str12 = (String) linkedHashMap.get("X-Request-ID");
                        if (str12 != null) {
                            alpha.echo("http_response_x_request_id", str12);
                        }
                        if (str8 != null) {
                            alpha.echo("http_error_body", str8);
                        }
                        str13 = (String) linkedHashMap.get("Server");
                        if (str13 != null) {
                            str14 = str7;
                        } else {
                            str14 = str13;
                        }
                        alpha.bravo("ApiErrorResponse: HTTP 413 Payload Too Large - path=" + str5 + ", server=" + str14 + ", attemptId=" + str6);
                        alpha.charlie(new Exception("HTTP 413 Payload Too Large: " + str5 + " (server=" + str14 + ", attemptId=" + str6 + ")"));
                        pair = new Pair(903, "Image too large, please retry with lower quality");
                    }
                    str6 = null;
                    if (str6 != null) {
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    response = httpException.response();
                    if (response != null) {
                    }
                    str7 = "unknown";
                    response2 = httpException.response();
                    if (response2 == null) {
                    }
                    str15 = null;
                    str8 = str15;
                    alpha.delta(HttpConstants.HTTP_ENTITY_TOO_LARGE, "http_code");
                    alpha.echo("http_path", str5);
                    str9 = (String) linkedHashMap2.get("Server");
                    if (str9 != null) {
                    }
                    str10 = (String) linkedHashMap2.get("Via");
                    if (str10 != null) {
                    }
                    str11 = (String) linkedHashMap2.get("CF-Ray");
                    if (str11 != null) {
                    }
                    str12 = (String) linkedHashMap2.get("X-Request-ID");
                    if (str12 != null) {
                    }
                    if (str8 != null) {
                    }
                    str13 = (String) linkedHashMap2.get("Server");
                    if (str13 != null) {
                    }
                    alpha.bravo("ApiErrorResponse: HTTP 413 Payload Too Large - path=" + str5 + ", server=" + str14 + ", attemptId=" + str6);
                    alpha.charlie(new Exception("HTTP 413 Payload Too Large: " + str5 + " (server=" + str14 + ", attemptId=" + str6 + ")"));
                    pair = new Pair(903, "Image too large, please retry with lower quality");
                } else {
                    try {
                        aq<?> response5 = ((HttpException) r20).response();
                        if (response5 != null && (responseBody = response5.charlie) != null) {
                            str = responseBody.string();
                        } else {
                            str = null;
                        }
                        s bravo = AbstractC2656g0.charlie(str).bravo();
                        m mVar = bravo.alpha;
                        q hotel = bravo.hotel("code");
                        if (hotel != null) {
                            code = hotel.alpha();
                        } else {
                            q hotel2 = AbstractC2656g0.charlie(str).bravo().hotel("status");
                            if (hotel2 != null) {
                                code = hotel2.alpha();
                            } else {
                                code = ((HttpException) r20).code();
                            }
                        }
                        if (mVar.containsKey("errors")) {
                            s bravo2 = bravo.hotel("errors").bravo();
                            Iterator it = ((j) bravo2.bravo().alpha.keySet()).iterator();
                            str2 = "";
                            while (it.hasNext()) {
                                String str20 = (String) it.next();
                                if (Intrinsics.areEqual(str20, RedirectCustomTabEventLogger.RESULT_ERROR)) {
                                    str4 = "";
                                } else {
                                    str4 = str20 + "  -> ";
                                }
                                str2 = ((Object) str2) + str4 + bravo2.bravo().hotel(str20).delta() + "\n";
                            }
                        } else if (mVar.containsKey(RedirectCustomTabEventLogger.RESULT_ERROR)) {
                            str2 = bravo.hotel(RedirectCustomTabEventLogger.RESULT_ERROR).delta();
                        } else {
                            str2 = "Something went wrong";
                        }
                        Integer valueOf = Integer.valueOf(code);
                        if (str2 == null) {
                            q hotel3 = AbstractC2656g0.charlie(str).bravo().hotel(RedirectCustomTabEventLogger.RESULT_ERROR);
                            if (hotel3 != null) {
                                str3 = hotel3.delta();
                            } else {
                                str3 = null;
                            }
                            if (str3 == null) {
                                str2 = "Invalid Error";
                            } else {
                                str2 = str3;
                            }
                        }
                        pair = new Pair(valueOf, str2);
                    } catch (Exception e) {
                        if (!(e instanceof MalformedJsonException) && !(e instanceof JsonSyntaxException)) {
                            String message = r20.getMessage();
                            if (message != null) {
                                pair2 = new Pair(905, P0.crimson(message, zulu));
                            }
                        } else {
                            int code2 = httpException.code();
                            if (code2 != 502) {
                                if (code2 != 503) {
                                    echo = av.q.echo("Error parsing data Retry. ", zulu);
                                } else {
                                    echo = av.q.echo("Internal Server error. Retry! ", zulu);
                                }
                            } else {
                                echo = av.q.echo("Error parsing data Retry. Looks like server maintenance going on retry shortly. ", zulu);
                            }
                            pair = new Pair(903, echo);
                        }
                    }
                }
                if (((HttpException) r20).code() != 401) {
                    this.errorObserver.postValue(pair);
                } else {
                    this.errorObserver.postValue(new Pair(903, pair.getSecond()));
                }
                return (String) pair.getSecond();
            }
            String message2 = r20.getMessage();
            if (message2 != null) {
                pair2 = new Pair(905, message2);
            }
            pair = pair2;
            if (((HttpException) r20).code() != 401) {
            }
            return (String) pair.getSecond();
        }
        if (r20 instanceof SocketTimeoutException) {
            String string2 = getApplication().getString(R.string.server_time_out_retry);
            Intrinsics.delta(string2, "getString(...)");
            this.errorObserver.postValue(new Pair(901, ""));
            return string2;
        }
        if (r20 instanceof IOException) {
            String string3 = getApplication().getString(R.string.no_internet_retry);
            Intrinsics.delta(string3, "getString(...)");
            this.errorObserver.postValue(new Pair(902, ""));
            return string3;
        }
        if (r20 instanceof JsonParseException) {
            this.errorObserver.postValue(new Pair(903, ""));
            String message3 = r20.getMessage();
            if (message3 == null) {
                String string4 = getApplication().getString(R.string.server_error_retry);
                Intrinsics.delta(string4, "getString(...)");
                return string4;
            }
            return message3;
        }
        this.errorObserver.postValue(new Pair(903, ""));
        String message4 = r20.getMessage();
        if (message4 == null) {
            String string5 = getApplication().getString(R.string.error_something_went_wrong);
            Intrinsics.delta(string5, "getString(...)");
            return string5;
        }
        return message4;
    }

    public final void setErrorObserver(@NotNull az azVar) {
        Intrinsics.echo(azVar, "<set-?>");
        this.errorObserver = azVar;
    }
}
