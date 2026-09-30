package J8;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class C extends Handler {
    public boolean alpha;
    public long bravo;
    public final ArrayList charlie;

    public C(Looper looper) {
        super(looper);
        this.charlie = new ArrayList();
    }

    public final void alpha() {
        Log.d("SessionLifecycleService", "Broadcasting new session");
        ap apVar = (ap) ((i) ((s) B7.g.charlie().bravo(s.class))).kilo.get();
        am amVar = ((au) ((i) ((s) B7.g.charlie().bravo(s.class))).mike.get()).echo;
        if (amVar != null) {
            as asVar = (as) apVar;
            asVar.getClass();
            vf.ad.zulu(vf.ad.charlie(asVar.echo), null, null, new aq(asVar, amVar, null), 3);
            Iterator it = new ArrayList(this.charlie).iterator();
            while (it.hasNext()) {
                Messenger it2 = (Messenger) it.next();
                Intrinsics.delta(it2, "it");
                bravo(it2);
            }
            return;
        }
        Intrinsics.lima("currentSession");
        throw null;
    }

    public final void bravo(Messenger messenger) {
        try {
            String str = null;
            if (this.alpha) {
                am amVar = ((au) ((i) ((s) B7.g.charlie().bravo(s.class))).mike.get()).echo;
                if (amVar != null) {
                    delta(messenger, amVar.alpha);
                    return;
                } else {
                    Intrinsics.lima("currentSession");
                    throw null;
                }
            }
            v vVar = (v) ((ak) ((i) ((s) B7.g.charlie().bravo(s.class))).juliet.get()).charlie.get();
            if (vVar != null) {
                str = vVar.alpha;
            }
            Log.d("SessionLifecycleService", "App has not yet foregrounded. Using previously stored session.");
            if (str != null) {
                delta(messenger, str);
            }
        } catch (IllegalStateException e) {
            Log.w("SessionLifecycleService", "Failed to send session to client.", e);
        }
    }

    public final void charlie() {
        String alpha;
        try {
            au auVar = (au) ((i) ((s) B7.g.charlie().bravo(s.class))).mike.get();
            int i4 = auVar.delta + 1;
            auVar.delta = i4;
            if (i4 == 0) {
                alpha = auVar.charlie;
            } else {
                alpha = auVar.alpha();
            }
            String str = alpha;
            int i5 = auVar.delta;
            auVar.alpha.getClass();
            auVar.echo = new am(str, auVar.charlie, i5, System.currentTimeMillis() * 1000);
            Log.d("SessionLifecycleService", "Generated new session.");
            alpha();
            ak akVar = (ak) ((i) ((s) B7.g.charlie().bravo(s.class))).juliet.get();
            am amVar = ((au) ((i) ((s) B7.g.charlie().bravo(s.class))).mike.get()).echo;
            if (amVar != null) {
                String sessionId = amVar.alpha;
                akVar.getClass();
                Intrinsics.echo(sessionId, "sessionId");
                vf.ad.zulu(vf.ad.charlie(akVar.alpha), null, null, new aj(akVar, sessionId, null), 3);
                return;
            }
            Intrinsics.lima("currentSession");
            throw null;
        } catch (IllegalStateException e) {
            Log.w("SessionLifecycleService", "Failed to generate new session.", e);
        }
    }

    public final void delta(Messenger messenger, String str) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("SessionUpdateExtra", str);
            Message obtain = Message.obtain(null, 3, 0, 0);
            obtain.setData(bundle);
            messenger.send(obtain);
        } catch (DeadObjectException unused) {
            Log.d("SessionLifecycleService", "Removing dead client from list: " + messenger);
            this.charlie.remove(messenger);
        } catch (Exception e) {
            Log.w("SessionLifecycleService", "Unable to push new session to " + messenger + '.', e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0109, code lost:
    
        if (kotlin.time.b.echo(r7) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0120, code lost:
    
        if (kotlin.time.b.echo(r7) == false) goto L36;
     */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleMessage(Message msg) {
        long papa;
        Intrinsics.echo(msg, "msg");
        if (this.bravo > msg.getWhen()) {
            Log.d("SessionLifecycleService", "Ignoring old message from " + msg.getWhen() + " which is older than " + this.bravo + '.');
            return;
        }
        int i4 = msg.what;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 4) {
                    Log.w("SessionLifecycleService", "Received unexpected event from the SessionLifecycleClient: " + msg);
                    super.handleMessage(msg);
                    return;
                }
                ArrayList arrayList = this.charlie;
                arrayList.add(msg.replyTo);
                Messenger messenger = msg.replyTo;
                Intrinsics.delta(messenger, "msg.replyTo");
                bravo(messenger);
                Log.d("SessionLifecycleService", "Client " + msg.replyTo + " bound at " + msg.getWhen() + ". Clients: " + arrayList.size());
                return;
            }
            Log.d("SessionLifecycleService", "Activity backgrounding at " + msg.getWhen());
            this.bravo = msg.getWhen();
            return;
        }
        Log.d("SessionLifecycleService", "Activity foregrounding at " + msg.getWhen() + '.');
        if (!this.alpha) {
            Log.d("SessionLifecycleService", "Cold start detected.");
            this.alpha = true;
            charlie();
        } else {
            long when = msg.getWhen() - this.bravo;
            N8.j jVar = (N8.j) ((i) ((s) B7.g.charlie().bravo(s.class))).hotel.get();
            kotlin.time.b charlie = jVar.alpha.charlie();
            if (charlie != null) {
                int i5 = kotlin.time.b.silver;
                papa = charlie.alpha;
                if (papa > 0) {
                }
            }
            kotlin.time.b charlie2 = jVar.bravo.charlie();
            if (charlie2 != null) {
                int i10 = kotlin.time.b.silver;
                papa = charlie2.alpha;
                if (papa > 0) {
                }
            }
            int i11 = kotlin.time.b.silver;
            papa = kotlin.time.g.papa(30, kotlin.time.d.white);
            if (when > kotlin.time.b.charlie(papa)) {
                Log.d("SessionLifecycleService", "Session too long in background. Creating new session.");
                charlie();
            }
        }
        this.bravo = msg.getWhen();
    }
}
