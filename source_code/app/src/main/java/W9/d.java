package W9;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.SoundPool;
import android.os.SystemClock;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class d {
    public static SoundPool alpha;
    public static final LinkedHashMap bravo = new LinkedHashMap();
    public static final LinkedHashSet charlie = new LinkedHashSet();
    public static long delta;

    public static void alpha(Context context, e eVar) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - delta < 500) {
            return;
        }
        delta = uptimeMillis;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.delta(applicationContext, "getApplicationContext(...)");
        bravo(applicationContext, eVar.purple);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.media.SoundPool$OnLoadCompleteListener, java.lang.Object] */
    public static void bravo(Context context, String str) {
        SoundPool soundPool = alpha;
        SoundPool soundPool2 = soundPool;
        if (soundPool == null) {
            SoundPool build = new SoundPool.Builder().setMaxStreams(2).setAudioAttributes(new AudioAttributes.Builder().setUsage(5).setContentType(4).build()).build();
            build.setOnLoadCompleteListener(new Object());
            alpha = build;
            soundPool2 = build;
        }
        SoundPool soundPool3 = soundPool2;
        LinkedHashMap linkedHashMap = bravo;
        Integer num = (Integer) linkedHashMap.get(str);
        if (num != null) {
            soundPool3.play(num.intValue(), 1.0f, 1.0f, 1, 0, 1.0f);
            return;
        }
        int identifier = context.getResources().getIdentifier(str, "raw", context.getPackageName());
        if (identifier == 0) {
            if (!Intrinsics.areEqual(str, "neworder")) {
                bravo(context, "neworder");
            }
        } else {
            int load = soundPool3.load(context, identifier, 1);
            linkedHashMap.put(str, Integer.valueOf(load));
            charlie.add(Integer.valueOf(load));
        }
    }
}
