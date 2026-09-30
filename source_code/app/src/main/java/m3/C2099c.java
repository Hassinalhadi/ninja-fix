package m3;

import Cf.e;
import Pd.i;
import Xd.l;
import com.app.network.network.models.Jwt;
import com.app.network.network.models.UserInfo;
import delivery.samurai.android.AndroidApp;
import delivery.samurai.android.R;
import delivery.samurai.android.services.CaptainLocationMonitoringService;
import g3.EnumC1741b;
import g3.EnumC1742c;
import h3.InterfaceC1804a;
import h3.InterfaceC1807d;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k;
import kotlin.text.StringsKt;
import kotlin.text.r;
import t6.V2;
import vf.ab;
import vf.ad;
import vf.ao;

/* renamed from: m3.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2099c extends i implements l {
    public C2097a alpha;
    public long purple;
    public int red;
    public final /* synthetic */ d silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2099c(d dVar, Nd.c cVar) {
        super(2, cVar);
        this.silver = dVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C2099c(this.silver, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C2099c) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [Xd.l, Pd.i] */
    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        C2097a bravo;
        long j5;
        boolean z2;
        int i4;
        boolean z10;
        Jwt jwt;
        String jwtTokenExpiryDate;
        Object m206constructorimpl;
        boolean z11;
        Od.a aVar = Od.a.alpha;
        int i5 = this.red;
        d dVar = this.silver;
        if (i5 != 0) {
            if (i5 == 1) {
                j5 = this.purple;
                bravo = this.alpha;
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            bravo = dVar.bravo();
            switch (bravo.alpha.ordinal()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    return bravo;
                default:
                    long currentTimeMillis = System.currentTimeMillis();
                    this.alpha = bravo;
                    this.purple = currentTimeMillis;
                    this.red = 1;
                    e eVar = ao.alpha;
                    obj = ad.blue(Cf.d.purple, new i(2, null), this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    j5 = currentTimeMillis;
                    break;
            }
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        long currentTimeMillis2 = System.currentTimeMillis() - j5;
        if (!booleanValue) {
            EnumC1742c enumC1742c = EnumC1742c.f12644c;
            String string = ((T9.e) dVar.charlie).alpha.getString(R.string.diag_backend_down);
            Intrinsics.delta(string, "getString(...)");
            return C2097a.alpha(enumC1742c, string, EnumC1741b.teal, y.uniform(bravo.delta, y.sierra(new Pair("backendPing", Boolean.FALSE), new Pair("pingMs", new Long(currentTimeMillis2)))));
        }
        InterfaceC1804a interfaceC1804a = dVar.delta;
        AndroidApp androidApp = AndroidApp.yellow;
        UserInfo sierra = L9.d.sierra(V2.delta());
        if (sierra == null || (jwt = sierra.getJwt()) == null || (jwtTokenExpiryDate = jwt.getJwtTokenExpiryDate()) == null || StringsKt.gray(jwtTokenExpiryDate)) {
            z2 = false;
        } else {
            try {
                Result.Companion companion = Result.INSTANCE;
                Date parse = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.getDefault()).parse(r.oscar(jwtTokenExpiryDate, "Z", "+0000"));
                if (parse != null && parse.before(new Date())) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                m206constructorimpl = Result.m206constructorimpl(Boolean.valueOf(z11));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
            }
            Boolean bool = Boolean.FALSE;
            if (m206constructorimpl instanceof k) {
                m206constructorimpl = bool;
            }
            z2 = ((Boolean) m206constructorimpl).booleanValue();
        }
        InterfaceC1807d interfaceC1807d = dVar.charlie;
        if (z2) {
            EnumC1742c enumC1742c2 = EnumC1742c.f12642a;
            String string2 = ((T9.e) interfaceC1807d).alpha.getString(R.string.diag_auth_expired);
            Intrinsics.delta(string2, "getString(...)");
            EnumC1741b enumC1741b = EnumC1741b.white;
            Map map = bravo.delta;
            Boolean bool2 = Boolean.TRUE;
            return C2097a.alpha(enumC1742c2, string2, enumC1741b, y.uniform(map, y.sierra(new Pair("backendPing", bool2), new Pair("jwtExpired", bool2))));
        }
        Integer num = CaptainLocationMonitoringService.f12079R;
        if (num != null) {
            i4 = num.intValue();
        } else {
            i4 = 0;
        }
        if (400 <= i4 && i4 < 600) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            EnumC1742c enumC1742c3 = EnumC1742c.f12643b;
            String string3 = ((T9.e) interfaceC1807d).alpha.getString(R.string.diag_refresh_failed);
            Intrinsics.delta(string3, "getString(...)");
            return C2097a.alpha(enumC1742c3, string3, EnumC1741b.white, y.uniform(bravo.delta, y.sierra(new Pair("backendPing", Boolean.TRUE), new Pair("refreshErrorCode", CaptainLocationMonitoringService.f12079R))));
        }
        return C2097a.alpha(bravo.alpha, bravo.bravo, bravo.charlie, y.uniform(bravo.delta, y.sierra(new Pair("backendPing", Boolean.TRUE), new Pair("pingMs", new Long(currentTimeMillis2)))));
    }
}
