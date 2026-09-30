package zendesk.classic.messaging.components;

import android.os.Handler;

/* loaded from: classes.dex */
public class Timer {
    private final Handler handler;
    private final Runnable runnable;
    private final int timeout;
    private boolean isEnabled = true;
    private boolean isCompleted = false;

    /* loaded from: classes.dex */
    public static class Factory {
        private final Handler handler;

        public Factory(Handler handler) {
            this.handler = handler;
        }

        public Timer create(Runnable runnable, int i4) {
            return new Timer(this.handler, runnable, i4);
        }
    }

    public Timer(Handler handler, final Runnable runnable, int i4) {
        this.handler = handler;
        this.runnable = new Runnable() { // from class: zendesk.classic.messaging.components.Timer.1
            @Override // java.lang.Runnable
            public void run() {
                runnable.run();
                Timer.this.isCompleted = true;
            }
        };
        this.timeout = i4;
    }

    public void disable() {
        this.handler.removeCallbacks(this.runnable);
        this.isEnabled = false;
    }

    public boolean start() {
        if (this.isEnabled && !this.isCompleted) {
            this.handler.removeCallbacks(this.runnable);
            this.handler.postDelayed(this.runnable, this.timeout);
            return true;
        }
        return false;
    }
}
