package Fc;

import androidx.lifecycle.az;
import com.checkout.components.redirecthandler.utils.RedirectionConstants;
import com.google.mlkit.vision.barcode.common.Barcode;
import delivery.samurai.android.ui.splash.AuthViewModel;
import java.io.File;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import r3.C2492a;
import t3.InterfaceC2956a;
import z3.C3462a;

/* loaded from: classes2.dex */
public final class z extends Pd.i implements Xd.l {
    public MultipartBody.Part A;
    public MultipartBody.Part B;
    public MultipartBody.Part C;

    /* renamed from: D, reason: collision with root package name */
    public RequestBody f1308D;

    /* renamed from: E, reason: collision with root package name */
    public MultipartBody.Part f1309E;

    /* renamed from: F, reason: collision with root package name */
    public int f1310F;

    /* renamed from: G, reason: collision with root package name */
    public int f1311G;

    /* renamed from: H, reason: collision with root package name */
    public int f1312H;

    /* renamed from: I, reason: collision with root package name */
    public int f1313I;

    /* renamed from: J, reason: collision with root package name */
    public final /* synthetic */ String f1314J;

    /* renamed from: K, reason: collision with root package name */
    public final /* synthetic */ String f1315K;

    /* renamed from: L, reason: collision with root package name */
    public final /* synthetic */ String f1316L;

    /* renamed from: M, reason: collision with root package name */
    public final /* synthetic */ String f1317M;

    /* renamed from: N, reason: collision with root package name */
    public final /* synthetic */ String f1318N;

    /* renamed from: O, reason: collision with root package name */
    public final /* synthetic */ String f1319O;

    /* renamed from: P, reason: collision with root package name */
    public final /* synthetic */ AuthViewModel f1320P;
    public final /* synthetic */ String Q;

    /* renamed from: R, reason: collision with root package name */
    public final /* synthetic */ String f1321R;

    /* renamed from: S, reason: collision with root package name */
    public final /* synthetic */ String f1322S;

    /* renamed from: T, reason: collision with root package name */
    public final /* synthetic */ String f1323T;

    /* renamed from: U, reason: collision with root package name */
    public final /* synthetic */ int f1324U;

    /* renamed from: V, reason: collision with root package name */
    public final /* synthetic */ String f1325V;

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ String f1326W;

    /* renamed from: X, reason: collision with root package name */
    public final /* synthetic */ String f1327X;

    /* renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ int f1328Y;

    /* renamed from: Z, reason: collision with root package name */
    public final /* synthetic */ int f1329Z;

    /* renamed from: a0, reason: collision with root package name */
    public final /* synthetic */ String f1330a0;
    public AuthViewModel alpha;

    /* renamed from: b0, reason: collision with root package name */
    public final /* synthetic */ String f1331b0;

    /* renamed from: c0, reason: collision with root package name */
    public final /* synthetic */ String f1332c0;

    /* renamed from: d0, reason: collision with root package name */
    public final /* synthetic */ Integer f1333d0;

    /* renamed from: e0, reason: collision with root package name */
    public final /* synthetic */ String f1334e0;

    /* renamed from: f0, reason: collision with root package name */
    public final /* synthetic */ String f1335f0;

    /* renamed from: g0, reason: collision with root package name */
    public final /* synthetic */ String f1336g0;

    /* renamed from: h0, reason: collision with root package name */
    public final /* synthetic */ az f1337h0;
    public String purple;
    public String red;

    /* renamed from: s, reason: collision with root package name */
    public String f1338s;
    public String silver;

    /* renamed from: t, reason: collision with root package name */
    public String f1339t;
    public String teal;

    /* renamed from: u, reason: collision with root package name */
    public String f1340u;

    /* renamed from: v, reason: collision with root package name */
    public String f1341v;

    /* renamed from: w, reason: collision with root package name */
    public Integer f1342w;
    public String white;

    /* renamed from: x, reason: collision with root package name */
    public String f1343x;

    /* renamed from: y, reason: collision with root package name */
    public String f1344y;
    public String yellow;

    /* renamed from: z, reason: collision with root package name */
    public String f1345z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(String str, String str2, String str3, String str4, String str5, String str6, AuthViewModel authViewModel, String str7, String str8, String str9, String str10, int i4, String str11, String str12, String str13, int i5, int i10, String str14, String str15, String str16, Integer num, String str17, String str18, String str19, az azVar, Nd.c cVar) {
        super(2, cVar);
        this.f1314J = str;
        this.f1315K = str2;
        this.f1316L = str3;
        this.f1317M = str4;
        this.f1318N = str5;
        this.f1319O = str6;
        this.f1320P = authViewModel;
        this.Q = str7;
        this.f1321R = str8;
        this.f1322S = str9;
        this.f1323T = str10;
        this.f1324U = i4;
        this.f1325V = str11;
        this.f1326W = str12;
        this.f1327X = str13;
        this.f1328Y = i5;
        this.f1329Z = i10;
        this.f1330a0 = str14;
        this.f1331b0 = str15;
        this.f1332c0 = str16;
        this.f1333d0 = num;
        this.f1334e0 = str17;
        this.f1335f0 = str18;
        this.f1336g0 = str19;
        this.f1337h0 = azVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new z(this.f1314J, this.f1315K, this.f1316L, this.f1317M, this.f1318N, this.f1319O, this.f1320P, this.Q, this.f1321R, this.f1322S, this.f1323T, this.f1324U, this.f1325V, this.f1326W, this.f1327X, this.f1328Y, this.f1329Z, this.f1330a0, this.f1331b0, this.f1332c0, this.f1333d0, this.f1334e0, this.f1335f0, this.f1336g0, this.f1337h0, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((z) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:90|91|(2:92|93)|(5:(3:131|132|(16:134|135|136|(2:98|99)(1:130)|(2:122|123)(1:101)|102|103|104|105|106|107|108|109|110|111|(2:113|114)(1:115))(1:137))(1:95)|109|110|111|(0)(0))|96|(0)(0)|(0)(0)|102|103|104|105|106|107|108) */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0363, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0364, code lost:
    
        r43 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0368, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x025a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0407 A[Catch: all -> 0x0420, TryCatch #0 {all -> 0x0420, blocks: (B:10:0x04b0, B:36:0x03b7, B:38:0x0407, B:40:0x040d, B:42:0x0435, B:47:0x0451, B:50:0x0462), top: B:35:0x03b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0435 A[Catch: all -> 0x0420, TRY_LEAVE, TryCatch #0 {all -> 0x0420, blocks: (B:10:0x04b0, B:36:0x03b7, B:38:0x0407, B:40:0x040d, B:42:0x0435, B:47:0x0451, B:50:0x0462), top: B:35:0x03b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ce A[Catch: all -> 0x00a2, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x00a2, blocks: (B:30:0x0080, B:66:0x00ac, B:69:0x00ba, B:73:0x00ec, B:76:0x011d, B:79:0x014e, B:82:0x017f, B:86:0x0189, B:90:0x01ce), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x024b A[Catch: all -> 0x0236, TRY_LEAVE, TryCatch #5 {all -> 0x0236, blocks: (B:136:0x0231, B:98:0x024b), top: B:135:0x0231 }] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3, types: [okhttp3.RequestBody] */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r2v24, types: [okhttp3.MultipartBody$Part, delivery.samurai.android.ui.splash.AuthViewModel, java.lang.Object, java.lang.String, java.lang.Integer, okhttp3.MediaType, okhttp3.RequestBody] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r4v14, types: [t3.a] */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        z zVar;
        AuthViewModel authViewModel;
        int i4;
        Object m206constructorimpl;
        boolean z2;
        Throwable m207exceptionOrNullimpl;
        MultipartBody.Part part;
        MultipartBody.Part part2;
        MultipartBody.Part part3;
        MultipartBody.Part part4;
        RequestBody requestBody;
        MultipartBody.Part part5;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Integer num;
        int i5;
        int i10;
        Od.a aVar;
        MultipartBody.Part part6;
        MultipartBody.Part part7;
        MultipartBody.Part part8;
        MediaType mediaType;
        String str6;
        RequestBody requestBody2;
        String str7;
        int i11;
        AuthViewModel authViewModel2;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        RequestBody create$default;
        RequestBody create$default2;
        RequestBody create$default3;
        RequestBody create$default4;
        RequestBody create$default5;
        RequestBody create$default6;
        RequestBody create$default7;
        RequestBody create$default8;
        RequestBody create$default9;
        RequestBody create$default10;
        RequestBody create$default11;
        RequestBody create$default12;
        RequestBody create$default13;
        int i12;
        RequestBody requestBody3;
        RequestBody create$default14;
        RequestBody requestBody4;
        RequestBody requestBody5;
        RequestBody create$default15;
        String str15;
        String str16;
        z zVar2;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        Object papa;
        RequestBody requestBody6;
        MultipartBody.Part part9;
        MultipartBody.Part part10;
        MultipartBody.Part part11;
        String str22;
        String str23;
        String str24;
        int i13;
        int i14;
        Integer num2;
        Od.a aVar2;
        RequestBody.Companion companion;
        RequestBody create$default16;
        RequestBody create$default17;
        RequestBody create$default18;
        RequestBody create$default19;
        RequestBody create$default20;
        RequestBody create$default21;
        RequestBody create$default22;
        RequestBody create$default23;
        RequestBody create$default24;
        RequestBody requestBody7;
        MediaType mediaType2;
        RequestBody requestBody8;
        RequestBody requestBody9;
        RequestBody requestBody10;
        RequestBody requestBody11;
        RequestBody requestBody12;
        RequestBody requestBody13;
        ?? r17;
        ?? r22;
        RequestBody requestBody14;
        RequestBody requestBody15;
        RequestBody requestBody16;
        String str25;
        RequestBody requestBody17;
        String str26;
        Od.a aVar3 = Od.a.alpha;
        int i15 = this.f1313I;
        AuthViewModel authViewModel3 = this.f1320P;
        try {
        } catch (Throwable th) {
            th = th;
            zVar = this;
        }
        if (i15 != 0) {
            if (i15 != 1) {
                if (i15 == 2) {
                    try {
                        ResultKt.alpha(obj);
                        papa = obj;
                        zVar = this;
                        authViewModel = authViewModel3;
                        i4 = 1;
                        m206constructorimpl = Result.m206constructorimpl(papa);
                    } catch (Throwable th2) {
                        th = th2;
                        zVar = this;
                        authViewModel = authViewModel3;
                        i4 = 1;
                        Result.Companion companion2 = Result.INSTANCE;
                        m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
                        z2 = m206constructorimpl instanceof kotlin.k;
                        az azVar = zVar.f1337h0;
                        if (!z2) {
                        }
                        m207exceptionOrNullimpl = Result.m207exceptionOrNullimpl(m206constructorimpl);
                        if (m207exceptionOrNullimpl != null) {
                        }
                        return Unit.INSTANCE;
                    }
                    z2 = m206constructorimpl instanceof kotlin.k;
                    az azVar2 = zVar.f1337h0;
                    if (!z2) {
                        C2492a c2492a = new C2492a(i4, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                        c2492a.charlie = m206constructorimpl;
                        azVar2.postValue(c2492a);
                    }
                    m207exceptionOrNullimpl = Result.m207exceptionOrNullimpl(m206constructorimpl);
                    if (m207exceptionOrNullimpl != null) {
                        String msg = authViewModel.onHandleError(m207exceptionOrNullimpl);
                        Intrinsics.echo(msg, "msg");
                        azVar2.postValue(new C2492a(0, msg));
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i16 = this.f1312H;
            i14 = this.f1311G;
            i13 = this.f1310F;
            MultipartBody.Part part12 = this.f1309E;
            requestBody6 = this.f1308D;
            part11 = this.C;
            part10 = this.B;
            part9 = this.A;
            str22 = this.f1345z;
            String str27 = this.f1344y;
            str6 = this.f1343x;
            num2 = this.f1342w;
            str23 = this.f1341v;
            i11 = i16;
            String str28 = this.f1340u;
            str24 = this.f1339t;
            String str29 = this.f1338s;
            String str30 = this.yellow;
            String str31 = this.white;
            String str32 = this.teal;
            String str33 = this.silver;
            str18 = this.red;
            String str34 = this.purple;
            AuthViewModel authViewModel4 = this.alpha;
            ResultKt.alpha(obj);
            str16 = str33;
            str21 = str34;
            authViewModel = authViewModel3;
            str4 = str27;
            str15 = str28;
            str5 = str29;
            str20 = str30;
            str19 = str31;
            str17 = str32;
            aVar = aVar3;
            authViewModel2 = authViewModel4;
            part5 = part12;
            mediaType = null;
            papa = obj;
            zVar = this;
            i4 = 1;
        } else {
            ResultKt.alpha(obj);
            Result.Companion companion3 = Result.INSTANCE;
            String str35 = this.f1314J;
            if (str35 != null) {
                File file = new File(str35);
                C3462a.alpha("LOCATION", 12, String.valueOf(file.length() / Barcode.FORMAT_UPC_E), null);
                part = MultipartBody.Part.INSTANCE.createFormData("identity", file.getName(), RequestBody.INSTANCE.create(file, MediaType.INSTANCE.parse("image/*")));
            } else {
                part = null;
            }
            String str36 = this.f1315K;
            if (str36 != null) {
                File file2 = new File(str36);
                C3462a.alpha("LOCATION", 12, String.valueOf(file2.length() / Barcode.FORMAT_UPC_E), null);
                part2 = MultipartBody.Part.INSTANCE.createFormData("drivingLicense", file2.getName(), RequestBody.INSTANCE.create(file2, MediaType.INSTANCE.parse("image/*")));
            } else {
                part2 = null;
            }
            String str37 = this.f1316L;
            if (str37 != null) {
                File file3 = new File(str37);
                C3462a.alpha("LOCATION", 12, String.valueOf(file3.length() / Barcode.FORMAT_UPC_E), null);
                part3 = MultipartBody.Part.INSTANCE.createFormData("registrationLicense", file3.getName(), RequestBody.INSTANCE.create(file3, MediaType.INSTANCE.parse("image/*")));
            } else {
                part3 = null;
            }
            String str38 = this.f1317M;
            if (str38 != null) {
                File file4 = new File(str38);
                C3462a.alpha("LOCATION", 12, String.valueOf(file4.length() / Barcode.FORMAT_UPC_E), null);
                part4 = MultipartBody.Part.INSTANCE.createFormData("profilePicture", file4.getName(), RequestBody.INSTANCE.create(file4, MediaType.INSTANCE.parse("image/*")));
            } else {
                part4 = null;
            }
            String str39 = this.f1318N;
            if (str39 != null) {
                if (StringsKt.gray(str39)) {
                    str39 = null;
                }
                if (str39 != null) {
                    requestBody = RequestBody.Companion.create$default(RequestBody.INSTANCE, str39, (MediaType) null, 1, (Object) null);
                    String str40 = this.Q;
                    String str41 = this.f1321R;
                    String str42 = this.f1322S;
                    String str43 = this.f1323T;
                    String str44 = this.f1325V;
                    String str45 = this.f1326W;
                    String str46 = this.f1327X;
                    String str47 = this.f1330a0;
                    String str48 = this.f1331b0;
                    part5 = part;
                    str = this.f1332c0;
                    RequestBody requestBody18 = requestBody;
                    str2 = this.f1319O;
                    int i17 = this.f1324U;
                    int i18 = this.f1328Y;
                    int i19 = this.f1329Z;
                    Integer num3 = this.f1333d0;
                    MultipartBody.Part part13 = part4;
                    String str49 = this.f1334e0;
                    MultipartBody.Part part14 = part3;
                    String str50 = this.f1335f0;
                    MultipartBody.Part part15 = part2;
                    String str51 = this.f1336g0;
                    if (str2 == null) {
                        InterfaceC2956a access$getAuthService$p = AuthViewModel.access$getAuthService$p(authViewModel3);
                        RequestBody.Companion companion4 = RequestBody.INSTANCE;
                        i4 = 1;
                        try {
                            create$default = RequestBody.Companion.create$default(companion4, str40, (MediaType) null, 1, (Object) null);
                            create$default2 = RequestBody.Companion.create$default(companion4, str41, (MediaType) null, 1, (Object) null);
                            create$default3 = RequestBody.Companion.create$default(companion4, str42, (MediaType) null, 1, (Object) null);
                            create$default4 = RequestBody.Companion.create$default(companion4, str43, (MediaType) null, 1, (Object) null);
                            create$default5 = RequestBody.Companion.create$default(companion4, String.valueOf(i17), (MediaType) null, 1, (Object) null);
                            create$default6 = RequestBody.Companion.create$default(companion4, str44, (MediaType) null, 1, (Object) null);
                            create$default7 = RequestBody.Companion.create$default(companion4, str45, (MediaType) null, 1, (Object) null);
                            create$default8 = RequestBody.Companion.create$default(companion4, str46, (MediaType) null, 1, (Object) null);
                            create$default9 = RequestBody.Companion.create$default(companion4, String.valueOf(i18), (MediaType) null, 1, (Object) null);
                            create$default10 = RequestBody.Companion.create$default(companion4, String.valueOf(i19), (MediaType) null, 1, (Object) null);
                            create$default11 = RequestBody.Companion.create$default(companion4, str47, (MediaType) null, 1, (Object) null);
                            create$default12 = RequestBody.Companion.create$default(companion4, str48, (MediaType) null, 1, (Object) null);
                            create$default13 = RequestBody.Companion.create$default(companion4, str, (MediaType) null, 1, (Object) null);
                        } catch (Throwable th3) {
                            th = th3;
                            zVar = this;
                        }
                        try {
                            if (num3 != null) {
                                try {
                                    String num4 = num3.toString();
                                    if (num4 != null) {
                                        requestBody3 = create$default10;
                                        i12 = 1;
                                        try {
                                            create$default14 = RequestBody.Companion.create$default(companion4, num4, (MediaType) null, 1, (Object) null);
                                            if (str50 == null) {
                                                requestBody4 = create$default;
                                                requestBody5 = RequestBody.Companion.create$default(companion4, str50, (MediaType) null, i12, (Object) null);
                                            } else {
                                                requestBody4 = create$default;
                                                requestBody5 = null;
                                            }
                                            if (str51 == null) {
                                                try {
                                                    create$default15 = RequestBody.Companion.create$default(companion4, str51, (MediaType) null, i12, (Object) null);
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    zVar = this;
                                                    authViewModel = authViewModel3;
                                                    i4 = 1;
                                                    Result.Companion companion22 = Result.INSTANCE;
                                                    m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
                                                    z2 = m206constructorimpl instanceof kotlin.k;
                                                    az azVar22 = zVar.f1337h0;
                                                    if (!z2) {
                                                    }
                                                    m207exceptionOrNullimpl = Result.m207exceptionOrNullimpl(m206constructorimpl);
                                                    if (m207exceptionOrNullimpl != null) {
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            } else {
                                                create$default15 = null;
                                            }
                                            zVar = this;
                                            zVar.alpha = authViewModel3;
                                            zVar.purple = str40;
                                            zVar.red = str41;
                                            zVar.silver = str42;
                                            zVar.teal = str43;
                                            zVar.white = str44;
                                            zVar.yellow = str45;
                                            zVar.f1338s = str46;
                                            zVar.f1339t = str47;
                                            zVar.f1340u = str48;
                                            zVar.f1341v = str;
                                            str15 = str48;
                                            zVar.f1342w = num3;
                                            zVar.f1343x = str49;
                                            zVar.f1344y = str50;
                                            zVar.f1345z = str51;
                                            zVar.A = part15;
                                            zVar.B = part14;
                                            zVar.C = part13;
                                            zVar.f1308D = requestBody18;
                                            zVar.f1309E = part5;
                                            part5 = part5;
                                            zVar.f1310F = i17;
                                            zVar.f1311G = i18;
                                            zVar.f1312H = i19;
                                            RequestBody requestBody19 = create$default14;
                                            i4 = 1;
                                            zVar.f1313I = 1;
                                            authViewModel = authViewModel3;
                                            str16 = str42;
                                            str4 = str50;
                                            zVar2 = zVar;
                                            str5 = str46;
                                            str17 = str43;
                                            str18 = str41;
                                            str19 = str44;
                                            str20 = str45;
                                            str21 = str40;
                                            mediaType = null;
                                            papa = access$getAuthService$p.papa(str2, requestBody4, create$default2, create$default3, create$default4, create$default5, create$default6, create$default7, create$default8, create$default9, requestBody3, create$default11, requestBody18, create$default12, create$default13, requestBody19, requestBody5, create$default15, part5, part15, part14, part13, zVar2);
                                            zVar = zVar2;
                                            aVar = aVar3;
                                            if (papa != aVar) {
                                                return aVar;
                                            }
                                            str6 = str49;
                                            requestBody6 = requestBody18;
                                            part9 = part15;
                                            part10 = part14;
                                            part11 = part13;
                                            str22 = str51;
                                            str23 = str;
                                            str24 = str47;
                                            i13 = i17;
                                            i14 = i18;
                                            i11 = i19;
                                            num2 = num3;
                                            authViewModel2 = authViewModel;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            authViewModel = authViewModel3;
                                            i4 = i12;
                                            zVar = this;
                                            Result.Companion companion222 = Result.INSTANCE;
                                            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
                                            z2 = m206constructorimpl instanceof kotlin.k;
                                            az azVar222 = zVar.f1337h0;
                                            if (!z2) {
                                            }
                                            m207exceptionOrNullimpl = Result.m207exceptionOrNullimpl(m206constructorimpl);
                                            if (m207exceptionOrNullimpl != null) {
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    } else {
                                        requestBody3 = create$default10;
                                        i12 = 1;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    i12 = 1;
                                    authViewModel = authViewModel3;
                                    i4 = i12;
                                    zVar = this;
                                    Result.Companion companion2222 = Result.INSTANCE;
                                    m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
                                    z2 = m206constructorimpl instanceof kotlin.k;
                                    az azVar2222 = zVar.f1337h0;
                                    if (!z2) {
                                    }
                                    m207exceptionOrNullimpl = Result.m207exceptionOrNullimpl(m206constructorimpl);
                                    if (m207exceptionOrNullimpl != null) {
                                    }
                                    return Unit.INSTANCE;
                                }
                            } else {
                                requestBody3 = create$default10;
                                i12 = 1;
                            }
                            papa = access$getAuthService$p.papa(str2, requestBody4, create$default2, create$default3, create$default4, create$default5, create$default6, create$default7, create$default8, create$default9, requestBody3, create$default11, requestBody18, create$default12, create$default13, requestBody19, requestBody5, create$default15, part5, part15, part14, part13, zVar2);
                            zVar = zVar2;
                            aVar = aVar3;
                            if (papa != aVar) {
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            zVar = zVar2;
                            Result.Companion companion22222 = Result.INSTANCE;
                            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
                            z2 = m206constructorimpl instanceof kotlin.k;
                            az azVar22222 = zVar.f1337h0;
                            if (!z2) {
                            }
                            m207exceptionOrNullimpl = Result.m207exceptionOrNullimpl(m206constructorimpl);
                            if (m207exceptionOrNullimpl != null) {
                            }
                            return Unit.INSTANCE;
                        }
                        create$default14 = null;
                        if (str50 == null) {
                        }
                        if (str51 == null) {
                        }
                        zVar = this;
                        zVar.alpha = authViewModel3;
                        zVar.purple = str40;
                        zVar.red = str41;
                        zVar.silver = str42;
                        zVar.teal = str43;
                        zVar.white = str44;
                        zVar.yellow = str45;
                        zVar.f1338s = str46;
                        zVar.f1339t = str47;
                        zVar.f1340u = str48;
                        zVar.f1341v = str;
                        str15 = str48;
                        zVar.f1342w = num3;
                        zVar.f1343x = str49;
                        zVar.f1344y = str50;
                        zVar.f1345z = str51;
                        zVar.A = part15;
                        zVar.B = part14;
                        zVar.C = part13;
                        zVar.f1308D = requestBody18;
                        zVar.f1309E = part5;
                        part5 = part5;
                        zVar.f1310F = i17;
                        zVar.f1311G = i18;
                        zVar.f1312H = i19;
                        RequestBody requestBody192 = create$default14;
                        i4 = 1;
                        zVar.f1313I = 1;
                        authViewModel = authViewModel3;
                        str16 = str42;
                        str4 = str50;
                        zVar2 = zVar;
                        str5 = str46;
                        str17 = str43;
                        str18 = str41;
                        str19 = str44;
                        str20 = str45;
                        str21 = str40;
                        mediaType = null;
                    } else {
                        authViewModel = authViewModel3;
                        str3 = str51;
                        str4 = str50;
                        str5 = str46;
                        num = num3;
                        i5 = i17;
                        i10 = i18;
                        aVar = aVar3;
                        part6 = part13;
                        part7 = part14;
                        part8 = part15;
                        mediaType = null;
                        zVar = this;
                        i4 = 1;
                        str6 = str49;
                        requestBody2 = requestBody18;
                        str7 = str47;
                        i11 = i19;
                        authViewModel2 = authViewModel;
                        str8 = str40;
                        str9 = str41;
                        str10 = str42;
                        str11 = str43;
                        str12 = str44;
                        str13 = str48;
                        str14 = str45;
                        String str52 = str5;
                        try {
                            ?? access$getAuthService$p2 = AuthViewModel.access$getAuthService$p(authViewModel2);
                            aVar2 = aVar;
                            companion = RequestBody.INSTANCE;
                            create$default16 = RequestBody.Companion.create$default(companion, str8, mediaType, i4, mediaType);
                            create$default17 = RequestBody.Companion.create$default(companion, str9, mediaType, i4, mediaType);
                            create$default18 = RequestBody.Companion.create$default(companion, str10, mediaType, i4, mediaType);
                            create$default19 = RequestBody.Companion.create$default(companion, str11, mediaType, i4, mediaType);
                            create$default20 = RequestBody.Companion.create$default(companion, String.valueOf(i5), mediaType, i4, mediaType);
                            create$default21 = RequestBody.Companion.create$default(companion, str12, mediaType, i4, mediaType);
                            RequestBody create$default25 = RequestBody.Companion.create$default(companion, str14, mediaType, i4, mediaType);
                            RequestBody create$default26 = RequestBody.Companion.create$default(companion, str52, mediaType, i4, mediaType);
                            create$default22 = RequestBody.Companion.create$default(companion, String.valueOf(i10), mediaType, i4, mediaType);
                            create$default23 = RequestBody.Companion.create$default(companion, String.valueOf(i11), mediaType, i4, mediaType);
                            RequestBody create$default27 = RequestBody.Companion.create$default(companion, str7, mediaType, i4, mediaType);
                            create$default24 = RequestBody.Companion.create$default(companion, str13, mediaType, i4, mediaType);
                            RequestBody create$default28 = RequestBody.Companion.create$default(companion, str, mediaType, i4, mediaType);
                        } catch (Throwable th8) {
                            th = th8;
                            Result.Companion companion222222 = Result.INSTANCE;
                            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
                            z2 = m206constructorimpl instanceof kotlin.k;
                            az azVar222222 = zVar.f1337h0;
                            if (!z2) {
                            }
                            m207exceptionOrNullimpl = Result.m207exceptionOrNullimpl(m206constructorimpl);
                            if (m207exceptionOrNullimpl != null) {
                            }
                            return Unit.INSTANCE;
                        }
                        if (num == null) {
                            String num5 = num.toString();
                            if (num5 != null) {
                                requestBody7 = create$default24;
                                r22 = 0;
                                r17 = RequestBody.Companion.create$default(companion, num5, (MediaType) null, i4, (Object) null);
                                requestBody8 = create$default16;
                                requestBody9 = create$default18;
                                requestBody10 = create$default21;
                                requestBody11 = create$default23;
                                requestBody12 = create$default17;
                                requestBody13 = create$default20;
                                if (str6 != null) {
                                    requestBody16 = RequestBody.Companion.create$default(companion, str6, (MediaType) r22, i4, (Object) r22);
                                    requestBody14 = create$default19;
                                    requestBody15 = create$default22;
                                } else {
                                    requestBody14 = create$default19;
                                    requestBody15 = create$default22;
                                    requestBody16 = r22;
                                }
                                RequestBody requestBody20 = requestBody8;
                                if (str4 == null) {
                                    str25 = "";
                                } else {
                                    str25 = str4;
                                }
                                RequestBody create$default29 = RequestBody.Companion.create$default(companion, str25, (MediaType) r22, i4, (Object) r22);
                                if (str3 == null) {
                                    requestBody17 = create$default29;
                                    str26 = "";
                                } else {
                                    requestBody17 = create$default29;
                                    str26 = str3;
                                }
                                RequestBody create$default30 = RequestBody.Companion.create$default(companion, str26, (MediaType) r22, i4, (Object) r22);
                                zVar.alpha = r22;
                                zVar.purple = r22;
                                zVar.red = r22;
                                zVar.silver = r22;
                                zVar.teal = r22;
                                zVar.white = r22;
                                zVar.yellow = r22;
                                zVar.f1338s = r22;
                                zVar.f1339t = r22;
                                zVar.f1340u = r22;
                                zVar.f1341v = r22;
                                zVar.f1342w = r22;
                                zVar.f1343x = r22;
                                zVar.f1344y = r22;
                                zVar.f1345z = r22;
                                zVar.A = r22;
                                zVar.B = r22;
                                zVar.C = r22;
                                zVar.f1308D = r22;
                                zVar.f1309E = r22;
                                zVar.f1310F = 0;
                                zVar.f1313I = 2;
                                zVar2 = zVar;
                                papa = access$getAuthService$p2.kilo(requestBody20, requestBody12, requestBody9, requestBody14, requestBody13, requestBody10, create$default25, create$default26, requestBody15, requestBody11, create$default27, requestBody2, requestBody7, create$default28, r17, requestBody16, requestBody17, create$default30, part5, part8, part7, part6, zVar2);
                                zVar = zVar2;
                                if (papa == aVar2) {
                                    return aVar2;
                                }
                                m206constructorimpl = Result.m206constructorimpl(papa);
                                z2 = m206constructorimpl instanceof kotlin.k;
                                az azVar2222222 = zVar.f1337h0;
                                if (!z2) {
                                }
                                m207exceptionOrNullimpl = Result.m207exceptionOrNullimpl(m206constructorimpl);
                                if (m207exceptionOrNullimpl != null) {
                                }
                                return Unit.INSTANCE;
                            }
                            requestBody7 = create$default24;
                            mediaType2 = null;
                        } else {
                            requestBody7 = create$default24;
                            mediaType2 = mediaType;
                        }
                        requestBody8 = create$default16;
                        requestBody9 = create$default18;
                        requestBody10 = create$default21;
                        requestBody11 = create$default23;
                        requestBody12 = create$default17;
                        requestBody13 = create$default20;
                        r17 = mediaType2;
                        r22 = mediaType2;
                        if (str6 != null) {
                        }
                        RequestBody requestBody202 = requestBody8;
                        if (str4 == null) {
                        }
                        RequestBody create$default292 = RequestBody.Companion.create$default(companion, str25, (MediaType) r22, i4, (Object) r22);
                        if (str3 == null) {
                        }
                        RequestBody create$default302 = RequestBody.Companion.create$default(companion, str26, (MediaType) r22, i4, (Object) r22);
                        zVar.alpha = r22;
                        zVar.purple = r22;
                        zVar.red = r22;
                        zVar.silver = r22;
                        zVar.teal = r22;
                        zVar.white = r22;
                        zVar.yellow = r22;
                        zVar.f1338s = r22;
                        zVar.f1339t = r22;
                        zVar.f1340u = r22;
                        zVar.f1341v = r22;
                        zVar.f1342w = r22;
                        zVar.f1343x = r22;
                        zVar.f1344y = r22;
                        zVar.f1345z = r22;
                        zVar.A = r22;
                        zVar.B = r22;
                        zVar.C = r22;
                        zVar.f1308D = r22;
                        zVar.f1309E = r22;
                        zVar.f1310F = 0;
                        zVar.f1313I = 2;
                        zVar2 = zVar;
                        papa = access$getAuthService$p2.kilo(requestBody202, requestBody12, requestBody9, requestBody14, requestBody13, requestBody10, create$default25, create$default26, requestBody15, requestBody11, create$default27, requestBody2, requestBody7, create$default28, r17, requestBody16, requestBody17, create$default302, part5, part8, part7, part6, zVar2);
                        zVar = zVar2;
                        if (papa == aVar2) {
                        }
                        m206constructorimpl = Result.m206constructorimpl(papa);
                        z2 = m206constructorimpl instanceof kotlin.k;
                        az azVar22222222 = zVar.f1337h0;
                        if (!z2) {
                        }
                        m207exceptionOrNullimpl = Result.m207exceptionOrNullimpl(m206constructorimpl);
                        if (m207exceptionOrNullimpl != null) {
                        }
                        return Unit.INSTANCE;
                    }
                }
            }
            requestBody = null;
            String str402 = this.Q;
            String str412 = this.f1321R;
            String str422 = this.f1322S;
            String str432 = this.f1323T;
            String str442 = this.f1325V;
            String str452 = this.f1326W;
            String str462 = this.f1327X;
            String str472 = this.f1330a0;
            String str482 = this.f1331b0;
            part5 = part;
            str = this.f1332c0;
            RequestBody requestBody182 = requestBody;
            str2 = this.f1319O;
            int i172 = this.f1324U;
            int i182 = this.f1328Y;
            int i192 = this.f1329Z;
            Integer num32 = this.f1333d0;
            MultipartBody.Part part132 = part4;
            String str492 = this.f1334e0;
            MultipartBody.Part part142 = part3;
            String str502 = this.f1335f0;
            MultipartBody.Part part152 = part2;
            String str512 = this.f1336g0;
            if (str2 == null) {
            }
        }
        if (papa == null) {
            num = num2;
            i10 = i14;
            i5 = i13;
            requestBody2 = requestBody6;
            part6 = part11;
            part7 = part10;
            str3 = str22;
            str7 = str24;
            str = str23;
            part8 = part9;
            str9 = str18;
            str10 = str16;
            str11 = str17;
            str12 = str19;
            str13 = str15;
            str14 = str20;
            str8 = str21;
            String str522 = str5;
            ?? access$getAuthService$p22 = AuthViewModel.access$getAuthService$p(authViewModel2);
            aVar2 = aVar;
            companion = RequestBody.INSTANCE;
            create$default16 = RequestBody.Companion.create$default(companion, str8, mediaType, i4, mediaType);
            create$default17 = RequestBody.Companion.create$default(companion, str9, mediaType, i4, mediaType);
            create$default18 = RequestBody.Companion.create$default(companion, str10, mediaType, i4, mediaType);
            create$default19 = RequestBody.Companion.create$default(companion, str11, mediaType, i4, mediaType);
            create$default20 = RequestBody.Companion.create$default(companion, String.valueOf(i5), mediaType, i4, mediaType);
            create$default21 = RequestBody.Companion.create$default(companion, str12, mediaType, i4, mediaType);
            RequestBody create$default252 = RequestBody.Companion.create$default(companion, str14, mediaType, i4, mediaType);
            RequestBody create$default262 = RequestBody.Companion.create$default(companion, str522, mediaType, i4, mediaType);
            create$default22 = RequestBody.Companion.create$default(companion, String.valueOf(i10), mediaType, i4, mediaType);
            create$default23 = RequestBody.Companion.create$default(companion, String.valueOf(i11), mediaType, i4, mediaType);
            RequestBody create$default272 = RequestBody.Companion.create$default(companion, str7, mediaType, i4, mediaType);
            create$default24 = RequestBody.Companion.create$default(companion, str13, mediaType, i4, mediaType);
            RequestBody create$default282 = RequestBody.Companion.create$default(companion, str, mediaType, i4, mediaType);
            if (num == null) {
            }
            requestBody8 = create$default16;
            requestBody9 = create$default18;
            requestBody10 = create$default21;
            requestBody11 = create$default23;
            requestBody12 = create$default17;
            requestBody13 = create$default20;
            r17 = mediaType2;
            r22 = mediaType2;
            if (str6 != null) {
            }
            RequestBody requestBody2022 = requestBody8;
            if (str4 == null) {
            }
            RequestBody create$default2922 = RequestBody.Companion.create$default(companion, str25, (MediaType) r22, i4, (Object) r22);
            if (str3 == null) {
            }
            RequestBody create$default3022 = RequestBody.Companion.create$default(companion, str26, (MediaType) r22, i4, (Object) r22);
            zVar.alpha = r22;
            zVar.purple = r22;
            zVar.red = r22;
            zVar.silver = r22;
            zVar.teal = r22;
            zVar.white = r22;
            zVar.yellow = r22;
            zVar.f1338s = r22;
            zVar.f1339t = r22;
            zVar.f1340u = r22;
            zVar.f1341v = r22;
            zVar.f1342w = r22;
            zVar.f1343x = r22;
            zVar.f1344y = r22;
            zVar.f1345z = r22;
            zVar.A = r22;
            zVar.B = r22;
            zVar.C = r22;
            zVar.f1308D = r22;
            zVar.f1309E = r22;
            zVar.f1310F = 0;
            zVar.f1313I = 2;
            zVar2 = zVar;
            papa = access$getAuthService$p22.kilo(requestBody2022, requestBody12, requestBody9, requestBody14, requestBody13, requestBody10, create$default252, create$default262, requestBody15, requestBody11, create$default272, requestBody2, requestBody7, create$default282, r17, requestBody16, requestBody17, create$default3022, part5, part8, part7, part6, zVar2);
            zVar = zVar2;
            if (papa == aVar2) {
            }
        }
        m206constructorimpl = Result.m206constructorimpl(papa);
        z2 = m206constructorimpl instanceof kotlin.k;
        az azVar222222222 = zVar.f1337h0;
        if (!z2) {
        }
        m207exceptionOrNullimpl = Result.m207exceptionOrNullimpl(m206constructorimpl);
        if (m207exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
