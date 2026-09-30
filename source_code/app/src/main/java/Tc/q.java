package Tc;

import android.os.SystemClock;
import com.app.network.network.models.WalletTopUpResponse;
import delivery.samurai.android.ui.wallet.WalletViewModel;
import java.util.Locale;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import t3.InterfaceC2957b;
import vf.ab;
import vf.ad;
import yf.N;

/* loaded from: classes2.dex */
public final class q extends Pd.i implements Xd.l {
    public long alpha;
    public int purple;
    public /* synthetic */ Object red;
    public final /* synthetic */ WalletViewModel silver;
    public final /* synthetic */ long teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(WalletViewModel walletViewModel, long j5, Nd.c cVar) {
        super(2, cVar);
        this.silver = walletViewModel;
        this.teal = j5;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        q qVar = new q(this.silver, this.teal, cVar);
        qVar.red = obj;
        return qVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c6, code lost:
    
        if (vf.ad.november(5000, r14) == r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac A[Catch: all -> 0x00d7, TryCatch #0 {all -> 0x00d7, blocks: (B:7:0x0017, B:8:0x0030, B:10:0x0036, B:15:0x0048, B:22:0x00a0, B:24:0x00ac, B:26:0x00ba, B:28:0x006d, B:31:0x0076, B:33:0x0084, B:36:0x008d, B:38:0x0098, B:40:0x00c9, B:47:0x0025), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ba A[Catch: all -> 0x00d7, TryCatch #0 {all -> 0x00d7, blocks: (B:7:0x0017, B:8:0x0030, B:10:0x0036, B:15:0x0048, B:22:0x00a0, B:24:0x00ac, B:26:0x00ba, B:28:0x006d, B:31:0x0076, B:33:0x0084, B:36:0x008d, B:38:0x0098, B:40:0x00c9, B:47:0x0025), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0098 A[Catch: all -> 0x00d7, TryCatch #0 {all -> 0x00d7, blocks: (B:7:0x0017, B:8:0x0030, B:10:0x0036, B:15:0x0048, B:22:0x00a0, B:24:0x00ac, B:26:0x00ba, B:28:0x006d, B:31:0x0076, B:33:0x0084, B:36:0x008d, B:38:0x0098, B:40:0x00c9, B:47:0x0025), top: B:2:0x000f }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00c6 -> B:8:0x0030). Please report as a decompilation issue!!! */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long elapsedRealtime;
        int hashCode;
        ab abVar = (ab) this.red;
        Od.a aVar = Od.a.alpha;
        int i4 = this.purple;
        WalletViewModel walletViewModel = this.silver;
        N n5 = walletViewModel.echo;
        try {
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 2) {
                        elapsedRealtime = this.alpha;
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    elapsedRealtime = this.alpha;
                    ResultKt.alpha(obj);
                    String upperCase = ((WalletTopUpResponse) obj).getStatus().toUpperCase(Locale.ROOT);
                    Intrinsics.delta(upperCase, "toUpperCase(...)");
                    hashCode = upperCase.hashCode();
                    if (hashCode != -2034635050) {
                        if (hashCode != -1149187101) {
                            if (hashCode == 2066319421 && upperCase.equals("FAILED")) {
                                d dVar = new d();
                                n5.getClass();
                                n5.juliet(null, dVar);
                                return Unit.INSTANCE;
                            }
                        } else if (upperCase.equals("SUCCESS")) {
                            h hVar = h.alpha;
                            n5.getClass();
                            n5.juliet(null, hVar);
                            return Unit.INSTANCE;
                        }
                    } else if (upperCase.equals("DECLINE")) {
                        d dVar2 = new d();
                        n5.getClass();
                        n5.juliet(null, dVar2);
                        return Unit.INSTANCE;
                    }
                    if (SystemClock.elapsedRealtime() - elapsedRealtime < 90000) {
                        d dVar3 = new d();
                        n5.getClass();
                        n5.juliet(null, dVar3);
                        return Unit.INSTANCE;
                    }
                    this.red = abVar;
                    this.alpha = elapsedRealtime;
                    this.purple = 2;
                }
            } else {
                ResultKt.alpha(obj);
                elapsedRealtime = SystemClock.elapsedRealtime();
            }
            if (ad.xray(abVar)) {
                InterfaceC2957b interfaceC2957b = walletViewModel.alpha;
                long j5 = this.teal;
                this.red = abVar;
                this.alpha = elapsedRealtime;
                this.purple = 1;
                obj = interfaceC2957b.green(j5, this);
                if (obj == aVar) {
                    return aVar;
                }
                String upperCase2 = ((WalletTopUpResponse) obj).getStatus().toUpperCase(Locale.ROOT);
                Intrinsics.delta(upperCase2, "toUpperCase(...)");
                hashCode = upperCase2.hashCode();
                if (hashCode != -2034635050) {
                }
                if (SystemClock.elapsedRealtime() - elapsedRealtime < 90000) {
                }
            }
        } catch (Throwable unused) {
            d dVar4 = new d();
            n5.getClass();
            n5.juliet(null, dVar4);
        }
        return Unit.INSTANCE;
    }
}
