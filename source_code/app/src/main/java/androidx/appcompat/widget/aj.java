package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import s1.C2571d;
import s1.InterfaceC2570c;

/* loaded from: classes3.dex */
public abstract class aj {
    public static boolean alpha(DragEvent dragEvent, TextView textView, Activity activity) {
        InterfaceC2570c interfaceC2570c;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                interfaceC2570c = new com.google.android.material.internal.s(clipData, 3);
            } else {
                C2571d c2571d = new C2571d();
                c2571d.purple = clipData;
                c2571d.red = 3;
                interfaceC2570c = c2571d;
            }
            s1.au.juliet(textView, interfaceC2570c.mo202build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean bravo(DragEvent dragEvent, View view, Activity activity) {
        InterfaceC2570c interfaceC2570c;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            interfaceC2570c = new com.google.android.material.internal.s(clipData, 3);
        } else {
            C2571d c2571d = new C2571d();
            c2571d.purple = clipData;
            c2571d.red = 3;
            interfaceC2570c = c2571d;
        }
        s1.au.juliet(view, interfaceC2570c.mo202build());
        return true;
    }
}
