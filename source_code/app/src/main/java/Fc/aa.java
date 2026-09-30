package Fc;

import android.os.SystemClock;
import com.app.network.network.models.UserIdentityRequestResponse;
import com.app.network.network.models.UserIdentityStatus;
import com.app.network.network.models.UserIdentityStatusKt;
import delivery.samurai.android.ui.splash.AuthViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import t3.InterfaceC2956a;
import yf.N;
import yf.as;
import yf.at;

/* loaded from: classes2.dex */
public final class aa extends Pd.i implements Xd.l {
    public UserIdentityRequestResponse alpha;
    public long purple;
    public int red;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f1295s;
    public /* synthetic */ Object silver;
    public final /* synthetic */ AuthViewModel teal;
    public final /* synthetic */ long white;
    public final /* synthetic */ long yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa(AuthViewModel authViewModel, long j5, long j6, long j7, Nd.c cVar) {
        super(2, cVar);
        this.teal = authViewModel;
        this.white = j5;
        this.yellow = j6;
        this.f1295s = j7;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        aa aaVar = new aa(this.teal, this.white, this.yellow, this.f1295s, cVar);
        aaVar.silver = obj;
        return aaVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((aa) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a5, code lost:
    
        if (vf.ad.november(r10, r14) == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a A[Catch: all -> 0x001c, TryCatch #0 {all -> 0x001c, blocks: (B:8:0x0018, B:9:0x003c, B:11:0x0042, B:16:0x0057, B:19:0x0070, B:21:0x007a, B:22:0x0082, B:24:0x008d, B:25:0x0097, B:32:0x002b, B:34:0x0031), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082 A[Catch: all -> 0x001c, TryCatch #0 {all -> 0x001c, blocks: (B:8:0x0018, B:9:0x003c, B:11:0x0042, B:16:0x0057, B:19:0x0070, B:21:0x007a, B:22:0x0082, B:24:0x008d, B:25:0x0097, B:32:0x002b, B:34:0x0031), top: B:2:0x000e }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00a5 -> B:9:0x003c). Please report as a decompilation issue!!! */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long elapsedRealtime;
        UserIdentityRequestResponse userIdentityRequestResponse;
        UserIdentityStatus mappedStatus;
        vf.ab abVar = (vf.ab) this.silver;
        Od.a aVar = Od.a.alpha;
        int i4 = this.red;
        AuthViewModel authViewModel = this.teal;
        try {
        } catch (Throwable th) {
            as access$get_nafathError$p = AuthViewModel.access$get_nafathError$p(authViewModel);
            String message = th.getMessage();
            if (message == null) {
                message = "Something went wrong";
            }
            access$get_nafathError$p.alpha(message);
        }
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 3) {
                        elapsedRealtime = this.purple;
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    elapsedRealtime = this.purple;
                    userIdentityRequestResponse = this.alpha;
                    ResultKt.alpha(obj);
                    mappedStatus = UserIdentityStatusKt.mappedStatus(userIdentityRequestResponse);
                    if (AuthViewModel.access$isTerminal(authViewModel, mappedStatus)) {
                        AuthViewModel.access$get_nafathTerminal$p(authViewModel).alpha(mappedStatus);
                    } else if (SystemClock.elapsedRealtime() - elapsedRealtime >= this.yellow) {
                        AuthViewModel.access$get_nafathTerminal$p(authViewModel).alpha(UserIdentityStatus.EXPIRED);
                    } else {
                        long j5 = this.f1295s;
                        this.silver = abVar;
                        this.alpha = null;
                        this.purple = elapsedRealtime;
                        this.red = 3;
                    }
                    return Unit.INSTANCE;
                }
            } else {
                elapsedRealtime = this.purple;
                ResultKt.alpha(obj);
                userIdentityRequestResponse = (UserIdentityRequestResponse) obj;
                at access$get_nafathState$p = AuthViewModel.access$get_nafathState$p(authViewModel);
                this.silver = abVar;
                this.alpha = userIdentityRequestResponse;
                this.purple = elapsedRealtime;
                this.red = 2;
                ((N) access$get_nafathState$p).india(userIdentityRequestResponse);
                if (Unit.INSTANCE == aVar) {
                    return aVar;
                }
                mappedStatus = UserIdentityStatusKt.mappedStatus(userIdentityRequestResponse);
                if (AuthViewModel.access$isTerminal(authViewModel, mappedStatus)) {
                }
                return Unit.INSTANCE;
            }
        } else {
            ResultKt.alpha(obj);
            elapsedRealtime = SystemClock.elapsedRealtime();
        }
        if (vf.ad.xray(abVar)) {
            InterfaceC2956a access$getAuthService$p = AuthViewModel.access$getAuthService$p(authViewModel);
            long j6 = this.white;
            this.silver = abVar;
            this.alpha = null;
            this.purple = elapsedRealtime;
            this.red = 1;
            obj = access$getAuthService$p.juliet(j6, this);
            if (obj == aVar) {
                return aVar;
            }
            userIdentityRequestResponse = (UserIdentityRequestResponse) obj;
            at access$get_nafathState$p2 = AuthViewModel.access$get_nafathState$p(authViewModel);
            this.silver = abVar;
            this.alpha = userIdentityRequestResponse;
            this.purple = elapsedRealtime;
            this.red = 2;
            ((N) access$get_nafathState$p2).india(userIdentityRequestResponse);
            if (Unit.INSTANCE == aVar) {
            }
            mappedStatus = UserIdentityStatusKt.mappedStatus(userIdentityRequestResponse);
            if (AuthViewModel.access$isTerminal(authViewModel, mappedStatus)) {
            }
        }
        return Unit.INSTANCE;
    }
}
