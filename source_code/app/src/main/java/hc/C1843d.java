package hc;

import B9.aq;
import android.widget.SeekBar;
import ja.burhanrashid52.photoeditor.PhotoEditor;
import ja.burhanrashid52.photoeditor.shape.ShapeBuilder;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: hc.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1843d implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ C1844e alpha;

    public C1843d(C1844e c1844e) {
        this.alpha = c1844e;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i4, boolean z2) {
        C1844e c1844e = this.alpha;
        PhotoEditor photoEditor = c1844e.f12716k;
        if (photoEditor != null) {
            ShapeBuilder shapeBuilder = c1844e.f12717l;
            int i5 = 1;
            if (i4 >= 1) {
                i5 = i4;
            }
            photoEditor.setShape(shapeBuilder.withShapeSize(i5));
            aq aqVar = c1844e.f12715j;
            if (aqVar != null) {
                aqVar.mike.setText(String.valueOf(i4));
                return;
            } else {
                Intrinsics.lima("binding");
                throw null;
            }
        }
        Intrinsics.lima("photoEditor");
        throw null;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }
}
