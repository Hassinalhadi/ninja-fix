package hd;

import dd.C1614e;
import io.ktor.client.plugins.ClientRequestException;
import io.ktor.client.plugins.RedirectResponseException;
import io.ktor.client.plugins.ResponseException;
import io.ktor.client.plugins.ServerResponseException;
import io.ktor.utils.io.charsets.MalformedInputException;
import kotlin.ResultKt;
import kotlin.Unit;
import pd.AbstractC2304b;
import s6.AbstractC2761r7;
import s6.AbstractC2790v0;

/* renamed from: hd.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1849e extends Pd.i implements Xd.l {
    public AbstractC2304b alpha;
    public int purple;
    public int red;
    public /* synthetic */ Object silver;

    /* JADX WARN: Type inference failed for: r0v0, types: [hd.e, Pd.i, Nd.c] */
    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        ?? iVar = new Pd.i(2, cVar);
        iVar.silver = obj;
        return iVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C1849e) create((AbstractC2304b) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(1:(1:(8:5|6|7|8|9|(2:16|(1:(1:24)(1:23))(1:19))(1:12)|13|14)(2:28|29))(1:30))(2:39|(2:41|42)(2:43|(2:50|51)(3:47|(1:49)|35)))|31|32|33|(10:36|8|9|(0)|16|(0)|(1:21)|24|13|14)|35|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bf, code lost:
    
        r0 = r1;
        r3 = r4;
        r1 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e0  */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i4;
        AbstractC2304b abstractC2304b;
        int i5;
        AbstractC2304b abstractC2304b2;
        AbstractC2304b abstractC2304b3;
        String str;
        Throwable responseException;
        Od.a aVar = Od.a.alpha;
        int i10 = this.red;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    i5 = this.purple;
                    abstractC2304b3 = this.alpha;
                    abstractC2304b2 = (AbstractC2304b) this.silver;
                    try {
                        ResultKt.alpha(obj);
                        str = (String) obj;
                    } catch (MalformedInputException unused) {
                        str = "<body failed decoding>";
                        if (300 > i5) {
                        }
                        if (400 > i5) {
                        }
                        if (500 > i5) {
                        }
                        responseException = new ResponseException(abstractC2304b3, str);
                        f.bravo.hotel("Default response validation for " + abstractC2304b2.bravo().delta().getUrl() + " failed with " + responseException);
                        throw responseException;
                    }
                    if (300 > i5 && i5 < 400) {
                        responseException = new RedirectResponseException(abstractC2304b3, str);
                    } else if (400 > i5 && i5 < 500) {
                        responseException = new ClientRequestException(abstractC2304b3, str);
                    } else if (500 > i5 && i5 < 600) {
                        responseException = new ServerResponseException(abstractC2304b3, str);
                    } else {
                        responseException = new ResponseException(abstractC2304b3, str);
                    }
                    f.bravo.hotel("Default response validation for " + abstractC2304b2.bravo().delta().getUrl() + " failed with " + responseException);
                    throw responseException;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i4 = this.purple;
            abstractC2304b = (AbstractC2304b) this.silver;
            ResultKt.alpha(obj);
        } else {
            ResultKt.alpha(obj);
            AbstractC2304b abstractC2304b4 = (AbstractC2304b) this.silver;
            if (!((Boolean) abstractC2304b4.bravo().beige().charlie(v.charlie)).booleanValue()) {
                f.bravo.hotel("Skipping default response validation for " + abstractC2304b4.bravo().delta().getUrl());
                return Unit.INSTANCE;
            }
            i4 = abstractC2304b4.golf().alpha;
            C1614e bravo = abstractC2304b4.bravo();
            if (i4 >= 300 && !bravo.beige().bravo(f.alpha)) {
                this.silver = abstractC2304b4;
                this.purple = i4;
                this.red = 1;
                Object bravo2 = AbstractC2790v0.bravo(bravo, this);
                if (bravo2 != aVar) {
                    abstractC2304b = abstractC2304b4;
                    obj = bravo2;
                }
                return aVar;
            }
            return Unit.INSTANCE;
        }
        C1614e c1614e = (C1614e) obj;
        c1614e.beige().foxtrot(f.alpha, Unit.INSTANCE);
        AbstractC2304b echo = c1614e.echo();
        this.silver = abstractC2304b;
        this.alpha = echo;
        this.purple = i4;
        this.red = 2;
        Object alpha = AbstractC2761r7.alpha(echo, kotlin.text.a.alpha, this);
        if (alpha != aVar) {
            i5 = i4;
            abstractC2304b3 = echo;
            obj = alpha;
            abstractC2304b2 = abstractC2304b;
            str = (String) obj;
            if (300 > i5) {
            }
            if (400 > i5) {
            }
            if (500 > i5) {
            }
            responseException = new ResponseException(abstractC2304b3, str);
            f.bravo.hotel("Default response validation for " + abstractC2304b2.bravo().delta().getUrl() + " failed with " + responseException);
            throw responseException;
        }
        return aVar;
    }
}
