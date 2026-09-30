package J8;

import android.util.Log;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class aq extends Pd.i implements Xd.l {
    public ab alpha;
    public as purple;
    public ao red;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ as f1629s;
    public B7.g silver;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ am f1630t;
    public am teal;
    public N8.j white;
    public int yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aq(as asVar, am amVar, Nd.c cVar) {
        super(2, cVar);
        this.f1629s = asVar;
        this.f1630t = amVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new aq(this.f1629s, this.f1630t, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((aq) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x005a, code lost:
    
        if (r2 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0045, code lost:
    
        if (r2 == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00ba  */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object alpha;
        Object alpha2;
        ab abVar;
        B7.g firebaseApp;
        Object bravo;
        ao aoVar;
        am sessionDetails;
        N8.j sessionsSettings;
        O7.i iVar;
        j jVar;
        O7.i iVar2;
        Od.a aVar = Od.a.alpha;
        int i4 = this.yellow;
        as asVar = this.f1629s;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 3) {
                        sessionsSettings = this.white;
                        sessionDetails = this.teal;
                        B7.g gVar = this.silver;
                        ao aoVar2 = this.red;
                        as asVar2 = this.purple;
                        abVar = this.alpha;
                        ResultKt.alpha(obj);
                        firebaseApp = gVar;
                        asVar = asVar2;
                        aoVar = aoVar2;
                        bravo = obj;
                        Map subscribers = (Map) bravo;
                        String str = abVar.alpha;
                        aoVar.getClass();
                        Intrinsics.echo(firebaseApp, "firebaseApp");
                        Intrinsics.echo(sessionDetails, "sessionDetails");
                        Intrinsics.echo(sessionsSettings, "sessionsSettings");
                        Intrinsics.echo(subscribers, "subscribers");
                        String firebaseAuthenticationToken = abVar.bravo;
                        Intrinsics.echo(firebaseAuthenticationToken, "firebaseAuthenticationToken");
                        iVar = (O7.i) subscribers.get(K8.d.purple);
                        j jVar2 = j.COLLECTION_DISABLED;
                        j jVar3 = j.COLLECTION_ENABLED;
                        j jVar4 = j.COLLECTION_SDK_NOT_INSTALLED;
                        if (iVar != null) {
                            jVar = jVar4;
                        } else if (iVar.alpha.bravo()) {
                            jVar = jVar3;
                        } else {
                            jVar = jVar2;
                        }
                        iVar2 = (O7.i) subscribers.get(K8.d.alpha);
                        if (iVar2 != null) {
                            jVar2 = jVar4;
                        } else if (iVar2.alpha.bravo()) {
                            jVar2 = jVar3;
                        }
                        an anVar = new an(new aw(sessionDetails.alpha, sessionDetails.bravo, sessionDetails.charlie, sessionDetails.delta, new k(jVar, jVar2, sessionsSettings.alpha()), str, firebaseAuthenticationToken), ao.alpha(firebaseApp));
                        int i5 = as.golf;
                        asVar.getClass();
                        try {
                            asVar.delta.alpha(anVar);
                            Log.d("SessionFirelogPublisher", "Successfully logged Session Start event.");
                        } catch (RuntimeException e) {
                            Log.e("SessionFirelogPublisher", "Error logging Session Start event to DataTransport: ", e);
                        }
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.alpha(obj);
                alpha2 = obj;
                abVar = (ab) alpha2;
                ao aoVar3 = ao.alpha;
                K8.c cVar = K8.c.alpha;
                this.alpha = abVar;
                this.purple = asVar;
                this.red = aoVar3;
                firebaseApp = asVar.alpha;
                this.silver = firebaseApp;
                am amVar = this.f1630t;
                this.teal = amVar;
                N8.j jVar5 = asVar.charlie;
                this.white = jVar5;
                this.yellow = 3;
                bravo = cVar.bravo(this);
                if (bravo != aVar) {
                    aoVar = aoVar3;
                    sessionDetails = amVar;
                    sessionsSettings = jVar5;
                    Map subscribers2 = (Map) bravo;
                    String str2 = abVar.alpha;
                    aoVar.getClass();
                    Intrinsics.echo(firebaseApp, "firebaseApp");
                    Intrinsics.echo(sessionDetails, "sessionDetails");
                    Intrinsics.echo(sessionsSettings, "sessionsSettings");
                    Intrinsics.echo(subscribers2, "subscribers");
                    String firebaseAuthenticationToken2 = abVar.bravo;
                    Intrinsics.echo(firebaseAuthenticationToken2, "firebaseAuthenticationToken");
                    iVar = (O7.i) subscribers2.get(K8.d.purple);
                    j jVar22 = j.COLLECTION_DISABLED;
                    j jVar32 = j.COLLECTION_ENABLED;
                    j jVar42 = j.COLLECTION_SDK_NOT_INSTALLED;
                    if (iVar != null) {
                    }
                    iVar2 = (O7.i) subscribers2.get(K8.d.alpha);
                    if (iVar2 != null) {
                    }
                    an anVar2 = new an(new aw(sessionDetails.alpha, sessionDetails.bravo, sessionDetails.charlie, sessionDetails.delta, new k(jVar, jVar22, sessionsSettings.alpha()), str2, firebaseAuthenticationToken2), ao.alpha(firebaseApp));
                    int i52 = as.golf;
                    asVar.getClass();
                    asVar.delta.alpha(anVar2);
                    Log.d("SessionFirelogPublisher", "Successfully logged Session Start event.");
                    return Unit.INSTANCE;
                }
                return aVar;
            }
            ResultKt.alpha(obj);
            alpha = obj;
        } else {
            ResultKt.alpha(obj);
            this.yellow = 1;
            alpha = as.alpha(asVar, this);
        }
        if (((Boolean) alpha).booleanValue()) {
            aa aaVar = ab.charlie;
            this.yellow = 2;
            alpha2 = aaVar.alpha(asVar.bravo, this);
        }
        return Unit.INSTANCE;
    }
}
