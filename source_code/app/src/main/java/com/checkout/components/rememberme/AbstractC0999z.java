package com.checkout.components.rememberme;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import okhttp3.Response;
import okhttp3.ResponseBody;
import vg.aq;

/* renamed from: com.checkout.components.rememberme.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0999z {
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052 A[Catch: Exception -> 0x007a, TryCatch #0 {Exception -> 0x007a, blocks: (B:11:0x0028, B:12:0x0042, B:14:0x0048, B:18:0x0052, B:21:0x0062, B:23:0x006a, B:24:0x006e, B:30:0x0037), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062 A[Catch: Exception -> 0x007a, TryCatch #0 {Exception -> 0x007a, blocks: (B:11:0x0028, B:12:0x0042, B:14:0x0048, B:18:0x0052, B:21:0x0062, B:23:0x006a, B:24:0x006e, B:30:0x0037), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(Function1 function1, Pd.c cVar) {
        C0996y c0996y;
        int i4;
        Object obj;
        Response response;
        try {
            if (cVar instanceof C0996y) {
                c0996y = (C0996y) cVar;
                int i5 = c0996y.f6417c;
                if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                    c0996y.f6417c = i5 - RecyclerView.UNDEFINED_DURATION;
                    Object obj2 = c0996y.f6416b;
                    Od.a aVar = Od.a.alpha;
                    i4 = c0996y.f6417c;
                    String str = null;
                    if (i4 == 0) {
                        if (i4 == 1) {
                            ResultKt.alpha(obj2);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.alpha(obj2);
                        c0996y.f6415a = null;
                        c0996y.f6417c = 1;
                        obj2 = function1.invoke(c0996y);
                        if (obj2 == aVar) {
                            return aVar;
                        }
                    }
                    aq aqVar = (aq) obj2;
                    obj = aqVar.bravo;
                    response = aqVar.alpha;
                    if (response.getIsSuccessful()) {
                        obj = null;
                    }
                    if (obj == null) {
                        Result.Companion companion = Result.INSTANCE;
                        return Result.m206constructorimpl(new Pair(response.headers(), obj));
                    }
                    Result.Companion companion2 = Result.INSTANCE;
                    ResponseBody responseBody = aqVar.charlie;
                    if (responseBody != null) {
                        str = responseBody.string();
                    }
                    return Result.m206constructorimpl(ResultKt.createFailure(new Exception(str)));
                }
            }
            if (i4 == 0) {
            }
            aq aqVar2 = (aq) obj2;
            obj = aqVar2.bravo;
            response = aqVar2.alpha;
            if (response.getIsSuccessful()) {
            }
            if (obj == null) {
            }
        } catch (Exception e) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m206constructorimpl(ResultKt.createFailure(e));
        }
        c0996y = new C0996y(cVar);
        Object obj22 = c0996y.f6416b;
        Od.a aVar2 = Od.a.alpha;
        i4 = c0996y.f6417c;
        String str2 = null;
    }
}
