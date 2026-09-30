package t8;

import B7.g;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import i8.InterfaceC1904b;
import j8.InterfaceC1947d;
import s8.C2837a;

/* loaded from: classes2.dex */
public final class a {
    public final g alpha;
    public final InterfaceC1947d bravo;
    public final InterfaceC1904b charlie;
    public final InterfaceC1904b delta;

    public a(g gVar, InterfaceC1947d interfaceC1947d, InterfaceC1904b interfaceC1904b, InterfaceC1904b interfaceC1904b2) {
        this.alpha = gVar;
        this.bravo = interfaceC1947d;
        this.charlie = interfaceC1904b;
        this.delta = interfaceC1904b2;
    }

    public C2837a providesConfigResolver() {
        return C2837a.echo();
    }

    public g providesFirebaseApp() {
        return this.alpha;
    }

    public InterfaceC1947d providesFirebaseInstallations() {
        return this.bravo;
    }

    public InterfaceC1904b providesRemoteConfigComponent() {
        return this.charlie;
    }

    public RemoteConfigManager providesRemoteConfigManager() {
        return RemoteConfigManager.getInstance();
    }

    public SessionManager providesSessionManager() {
        return SessionManager.getInstance();
    }

    public InterfaceC1904b providesTransportFactoryProvider() {
        return this.delta;
    }
}
