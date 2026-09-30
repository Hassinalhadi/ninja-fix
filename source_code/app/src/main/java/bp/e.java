package bp;

import android.hardware.display.DisplayManager;
import android.view.Display;
import androidx.camera.view.PreviewView;

/* loaded from: classes3.dex */
public final class e implements DisplayManager.DisplayListener {
    public final /* synthetic */ PreviewView alpha;

    public e(PreviewView previewView) {
        this.alpha = previewView;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i4) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i4) {
        PreviewView previewView = this.alpha;
        Display display = previewView.getDisplay();
        if (display != null && display.getDisplayId() == i4) {
            previewView.alpha();
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i4) {
    }
}
