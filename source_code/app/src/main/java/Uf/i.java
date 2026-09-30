package Uf;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i extends Tf.g {
    public final Socket alpha;

    public i(Socket socket) {
        Intrinsics.echo(socket, "socket");
        this.alpha = socket;
    }

    @Override // Tf.g
    public final IOException newTimeoutException(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // Tf.g
    public final void timedOut() {
        Socket socket = this.alpha;
        try {
            socket.close();
        } catch (AssertionError e) {
            if (n.alpha(e)) {
                n.alpha.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
                return;
            }
            throw e;
        } catch (Exception e4) {
            n.alpha.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e4);
        }
    }
}
