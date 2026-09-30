package Wc;

import android.os.SystemClock;
import com.app.network.network.models.TopUpTerminal;
import com.app.network.network.models.WalletTopUpResponse;
import delivery.samurai.android.ui.withdraw.WithDrawHistoryViewModel;
import java.util.Locale;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import t3.InterfaceC2957b;
import yf.az;

/* loaded from: classes2.dex */
public final class x extends Pd.i implements Xd.l {
    public WalletTopUpResponse alpha;
    public long purple;
    public int red;
    public /* synthetic */ Object silver;
    public final /* synthetic */ WithDrawHistoryViewModel teal;
    public final /* synthetic */ long white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(WithDrawHistoryViewModel withDrawHistoryViewModel, long j5, Nd.c cVar) {
        super(2, cVar);
        this.teal = withDrawHistoryViewModel;
        this.white = j5;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        x xVar = new x(this.teal, this.white, cVar);
        xVar.silver = obj;
        return xVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d9, code lost:
    
        if (vf.ad.november(5000, r16) == r2) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5 A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:8:0x001a, B:9:0x0040, B:11:0x0046, B:16:0x005a, B:19:0x006e, B:26:0x0093, B:29:0x009c, B:30:0x00b9, B:32:0x00c5, B:33:0x00cb, B:35:0x00a2, B:38:0x00ab, B:39:0x00b1, B:41:0x00dc, B:47:0x002d, B:49:0x0033), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cb A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:8:0x001a, B:9:0x0040, B:11:0x0046, B:16:0x005a, B:19:0x006e, B:26:0x0093, B:29:0x009c, B:30:0x00b9, B:32:0x00c5, B:33:0x00cb, B:35:0x00a2, B:38:0x00ab, B:39:0x00b1, B:41:0x00dc, B:47:0x002d, B:49:0x0033), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b1 A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:8:0x001a, B:9:0x0040, B:11:0x0046, B:16:0x005a, B:19:0x006e, B:26:0x0093, B:29:0x009c, B:30:0x00b9, B:32:0x00c5, B:33:0x00cb, B:35:0x00a2, B:38:0x00ab, B:39:0x00b1, B:41:0x00dc, B:47:0x002d, B:49:0x0033), top: B:2:0x0010 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00d9 -> B:9:0x0040). Please report as a decompilation issue!!! */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long elapsedRealtime;
        WalletTopUpResponse walletTopUpResponse;
        int hashCode;
        Object obj2;
        az azVar;
        vf.ab abVar = (vf.ab) this.silver;
        Od.a aVar = Od.a.alpha;
        int i4 = this.red;
        WithDrawHistoryViewModel withDrawHistoryViewModel = this.teal;
        try {
        } catch (Throwable th) {
            az azVar2 = withDrawHistoryViewModel.echo;
            String message = th.getMessage();
            if (message == null) {
                message = "Something went wrong";
            }
            azVar2.alpha(message);
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
                    walletTopUpResponse = this.alpha;
                    ResultKt.alpha(obj);
                    String upperCase = walletTopUpResponse.getStatus().toUpperCase(Locale.ROOT);
                    Intrinsics.delta(upperCase, "toUpperCase(...)");
                    hashCode = upperCase.hashCode();
                    az azVar3 = withDrawHistoryViewModel.charlie;
                    if (hashCode != -2034635050) {
                        if (hashCode != -1149187101) {
                            if (hashCode == 2066319421 && upperCase.equals("FAILED")) {
                                azVar3.alpha(TopUpTerminal.FAILED.INSTANCE);
                                return Unit.INSTANCE;
                            }
                        } else if (upperCase.equals("SUCCESS")) {
                            azVar3.alpha(TopUpTerminal.SUCCESS.INSTANCE);
                            return Unit.INSTANCE;
                        }
                    } else if (upperCase.equals("DECLINE")) {
                        azVar3.alpha(TopUpTerminal.DECLINED.INSTANCE);
                        return Unit.INSTANCE;
                    }
                    if (SystemClock.elapsedRealtime() - elapsedRealtime >= 90000) {
                        azVar3.alpha(TopUpTerminal.TIMEOUT.INSTANCE);
                        return Unit.INSTANCE;
                    }
                    this.silver = abVar;
                    this.alpha = null;
                    this.purple = elapsedRealtime;
                    this.red = 3;
                }
            } else {
                elapsedRealtime = this.purple;
                ResultKt.alpha(obj);
                obj2 = obj;
                walletTopUpResponse = (WalletTopUpResponse) obj2;
                azVar = withDrawHistoryViewModel.bravo;
                this.silver = abVar;
                this.alpha = walletTopUpResponse;
                this.purple = elapsedRealtime;
                this.red = 2;
                if (azVar.emit(walletTopUpResponse, this) == aVar) {
                    return aVar;
                }
                String upperCase2 = walletTopUpResponse.getStatus().toUpperCase(Locale.ROOT);
                Intrinsics.delta(upperCase2, "toUpperCase(...)");
                hashCode = upperCase2.hashCode();
                az azVar32 = withDrawHistoryViewModel.charlie;
                if (hashCode != -2034635050) {
                }
                if (SystemClock.elapsedRealtime() - elapsedRealtime >= 90000) {
                }
            }
        } else {
            ResultKt.alpha(obj);
            elapsedRealtime = SystemClock.elapsedRealtime();
        }
        if (vf.ad.xray(abVar)) {
            InterfaceC2957b interfaceC2957b = withDrawHistoryViewModel.alpha;
            long j5 = this.white;
            this.silver = abVar;
            this.alpha = null;
            this.purple = elapsedRealtime;
            this.red = 1;
            obj2 = interfaceC2957b.green(j5, this);
            if (obj2 == aVar) {
                return aVar;
            }
            walletTopUpResponse = (WalletTopUpResponse) obj2;
            azVar = withDrawHistoryViewModel.bravo;
            this.silver = abVar;
            this.alpha = walletTopUpResponse;
            this.purple = elapsedRealtime;
            this.red = 2;
            if (azVar.emit(walletTopUpResponse, this) == aVar) {
            }
            String upperCase22 = walletTopUpResponse.getStatus().toUpperCase(Locale.ROOT);
            Intrinsics.delta(upperCase22, "toUpperCase(...)");
            hashCode = upperCase22.hashCode();
            az azVar322 = withDrawHistoryViewModel.charlie;
            if (hashCode != -2034635050) {
            }
            if (SystemClock.elapsedRealtime() - elapsedRealtime >= 90000) {
            }
        }
        return Unit.INSTANCE;
    }
}
