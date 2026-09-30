package W9;

import android.media.SoundPool;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements SoundPool.OnLoadCompleteListener {
    @Override // android.media.SoundPool.OnLoadCompleteListener
    public final void onLoadComplete(SoundPool soundPool, int i4, int i5) {
        if (i5 == 0 && d.charlie.remove(Integer.valueOf(i4))) {
            soundPool.play(i4, 1.0f, 1.0f, 1, 0, 1.0f);
        }
    }
}
