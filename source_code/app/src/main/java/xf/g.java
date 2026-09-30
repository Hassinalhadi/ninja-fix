package xf;

import vf.InterfaceC3206j;

/* loaded from: classes2.dex */
public abstract class g {
    public static final m alpha = new m(-1, null, null, 0);
    public static final int bravo = Af.f.kilo(32, 12, "kotlinx.coroutines.bufferedChannel.segmentSize");
    public static final int charlie = Af.f.kilo(10000, 12, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations");
    public static final Af.t delta = new Af.t("BUFFERED", 0);
    public static final Af.t echo = new Af.t("SHOULD_BUFFER", 0);
    public static final Af.t foxtrot = new Af.t("S_RESUMING_BY_RCV", 0);
    public static final Af.t golf = new Af.t("RESUMING_BY_EB", 0);
    public static final Af.t hotel = new Af.t("POISONED", 0);
    public static final Af.t india = new Af.t("DONE_RCV", 0);
    public static final Af.t juliet = new Af.t("INTERRUPTED_SEND", 0);
    public static final Af.t kilo = new Af.t("INTERRUPTED_RCV", 0);
    public static final Af.t lima = new Af.t("CHANNEL_CLOSED", 0);
    public static final Af.t mike = new Af.t("SUSPEND", 0);
    public static final Af.t november = new Af.t("SUSPEND_NO_WAITER", 0);
    public static final Af.t oscar = new Af.t("FAILED", 0);
    public static final Af.t papa = new Af.t("NO_RECEIVE_RESULT", 0);
    public static final Af.t quebec = new Af.t("CLOSE_HANDLER_CLOSED", 0);
    public static final Af.t romeo = new Af.t("CLOSE_HANDLER_INVOKED", 0);
    public static final Af.t sierra = new Af.t("NO_CLOSE_CAUSE", 0);

    public static final boolean alpha(InterfaceC3206j interfaceC3206j, Object obj, Xd.m mVar) {
        Af.t kilo2 = interfaceC3206j.kilo(obj, mVar);
        if (kilo2 != null) {
            interfaceC3206j.oscar(kilo2);
            return true;
        }
        return false;
    }
}
