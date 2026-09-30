package J8;

import android.content.Context;
import android.content.Intent;
import android.os.Messenger;
import android.os.Process;
import android.util.Log;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import com.google.firebase.sessions.SessionLifecycleService;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class o extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ p purple;
    public final /* synthetic */ Nd.h red;
    public final /* synthetic */ D silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, Nd.h hVar, D d4, Nd.c cVar) {
        super(2, cVar);
        this.purple = pVar;
        this.red = hVar;
        this.silver = d4;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new o(this.purple, this.red, this.silver, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0065, code lost:
    
        if (r10.bravo(r9) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0067, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x002b, code lost:
    
        if (r10 == r0) goto L25;
     */
    /* JADX WARN: Type inference failed for: r10v18, types: [java.lang.Object, J2.n] */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z2;
        boolean z10;
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        p pVar = this.purple;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    ResultKt.alpha(obj);
                    N8.j jVar = pVar.bravo;
                    Boolean bravo = jVar.alpha.bravo();
                    if (bravo != null) {
                        z2 = bravo.booleanValue();
                    } else {
                        Boolean bravo2 = jVar.bravo.bravo();
                        if (bravo2 != null) {
                            z2 = bravo2.booleanValue();
                        } else {
                            z2 = true;
                        }
                    }
                    if (!z2) {
                        Log.d(FirebaseSessionsRegistrar.TAG, "Sessions SDK disabled. Not listening to lifecycle events.");
                    } else {
                        Nd.h backgroundDispatcher = this.red;
                        Intrinsics.echo(backgroundDispatcher, "backgroundDispatcher");
                        ?? obj2 = new Object();
                        obj2.alpha = backgroundDispatcher;
                        obj2.red = new LinkedBlockingDeque(20);
                        obj2.silver = new B(0, obj2);
                        D sessionLifecycleServiceBinder = this.silver;
                        Intrinsics.echo(sessionLifecycleServiceBinder, "sessionLifecycleServiceBinder");
                        Messenger messenger = new Messenger(new ay(backgroundDispatcher));
                        B serviceConnection = (B) obj2.silver;
                        Intrinsics.echo(serviceConnection, "serviceConnection");
                        Context context = sessionLifecycleServiceBinder.alpha;
                        Intent intent = new Intent(context, (Class<?>) SessionLifecycleService.class);
                        Log.d("LifecycleServiceBinder", "Binding service to application.");
                        intent.setAction(String.valueOf(Process.myPid()));
                        intent.putExtra("ClientCallbackMessenger", messenger);
                        intent.setPackage(context.getPackageName());
                        try {
                            z10 = context.bindService(intent, serviceConnection, 65);
                        } catch (SecurityException e) {
                            Log.w("LifecycleServiceBinder", "Failed to bind session lifecycle service to application.", e);
                            z10 = false;
                        }
                        if (!z10) {
                            try {
                                context.unbindService(serviceConnection);
                            } catch (IllegalArgumentException e4) {
                                Log.w("LifecycleServiceBinder", "Session lifecycle service binding failed.", e4);
                            }
                            Log.i("LifecycleServiceBinder", "Session lifecycle service binding failed.");
                        }
                        E.red = obj2;
                        if (E.purple) {
                            E.purple = false;
                            obj2.romeo(1);
                        }
                        A8.a aVar2 = new A8.a(20);
                        B7.g gVar = pVar.alpha;
                        gVar.alpha();
                        gVar.juliet.add(aVar2);
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.alpha(obj);
        } else {
            ResultKt.alpha(obj);
            K8.c cVar = K8.c.alpha;
            this.alpha = 1;
            obj = cVar.bravo(this);
        }
        Collection values = ((Map) obj).values();
        if (!(values instanceof Collection) || !values.isEmpty()) {
            Iterator it = values.iterator();
            while (it.hasNext()) {
                if (((O7.i) it.next()).alpha.bravo()) {
                    N8.j jVar2 = pVar.bravo;
                    this.alpha = 2;
                }
            }
        }
        Log.d(FirebaseSessionsRegistrar.TAG, "No Sessions subscribers. Not listening to lifecycle events.");
        return Unit.INSTANCE;
    }
}
